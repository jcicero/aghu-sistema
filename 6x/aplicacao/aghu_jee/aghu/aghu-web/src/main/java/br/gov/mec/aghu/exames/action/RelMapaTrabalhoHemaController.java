package br.gov.mec.aghu.exames.action;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Inject;
import javax.transaction.SystemException;

import net.sf.jasperreports.engine.JRException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.primefaces.model.StreamedContent;

import br.gov.mec.aghu.action.impressao.SistemaImpressao;
import br.gov.mec.aghu.action.report.ActionReport;
import br.gov.mec.aghu.dominio.DominioTipoImpressaoMapa;
import br.gov.mec.aghu.exames.business.IExamesFacade;
import br.gov.mec.aghu.exames.vo.RelatorioMapaHematologiaVO;
import br.gov.mec.aghu.impressao.SistemaImpressaoException;
import br.gov.mec.aghu.internacao.cadastrosbasicos.business.ICadastrosBasicosInternacaoFacade;
import br.gov.mec.aghu.model.AelConfigMapa;
import br.gov.mec.aghu.core.exception.ApplicationBusinessException;
import br.gov.mec.aghu.core.exception.BaseException;
import br.gov.mec.aghu.core.exception.EmptyReportException;
import br.gov.mec.aghu.core.exception.Severity;
import br.gov.mec.aghu.core.report.DocumentoJasper;

import com.itextpdf.text.DocumentException;


public class RelMapaTrabalhoHemaController extends ActionReport {

	private StreamedContent media;

	public StreamedContent getMedia() {	
		return media;
	}

	public void setMedia(StreamedContent media) {
		this.media = media;
	}

	private static final Log LOG = LogFactory.getLog(RelMapaTrabalhoHemaController.class);

	private static final long serialVersionUID = 3960638589858851522L;

	private static final String EMISSAO_MAPA_TRABALHO = "exames-emissaoMapaTrabalho";

	@EJB
	private IExamesFacade examesFacade;

	@Inject
	private SistemaImpressao sistemaImpressao;
	
	@EJB
	private ICadastrosBasicosInternacaoFacade cadastrosBasicosInternacaoFacade;

	private List<RelatorioMapaHematologiaVO> lista;
	
	private Short seqMapa;
	
	private AelConfigMapa mapa;
	
	private DominioTipoImpressaoMapa tipoImpressao;
	private boolean directPrint;
	private boolean errorEmptyList;

	private Date dataMapa;
	private Integer nroMapa;
	private String  nmRelatorio;
	
	
	@PostConstruct
	protected void inicializar() {
		this.begin(conversation);
	}
	
	public String iniciar() {
	 

		try {
			lista = null;
			errorEmptyList = false;
			mapa = examesFacade.obterAelConfigMapa(seqMapa);
		
			recuperarColecao();
			
			if (directPrint) {
				directPrint();
				limpar();
				return voltar();
			}
			
		} catch (BaseException e) {
			errorEmptyList = true;
			apresentarExcecaoNegocio(e);
			
		} catch (Exception e) {
			errorEmptyList = true;
			LOG.error("Exceção capturada: ", e);
			apresentarMsgNegocio(Severity.ERROR, e.getLocalizedMessage());
		}
		
		return null;
	
	}
	
	private void limpar(){
		nroMapa = null;
		dataMapa = null;
		mapa = null;
		lista = null;
		errorEmptyList = false;
		tipoImpressao = null;
	}
	

	
	public void directPrint() throws SistemaImpressaoException, ApplicationBusinessException, EmptyReportException  {
		recuperarColecao();
		try {
			DocumentoJasper documento = gerarDocumento();
			this.sistemaImpressao.imprimir(documento.getJasperPrint(), super.getEnderecoIPv4HostRemoto());
		} catch (UnknownHostException e) {
			LOG.error(e.getMessage(),e);
			this.apresentarMsgNegocio(Severity.ERROR, "ERRO_GERAR_RELATORIO");
		} catch (JRException e) {
			LOG.error(e.getMessage(),e);
			this.apresentarMsgNegocio(Severity.ERROR, "ERRO_GERAR_RELATORIO");
		}
		limpar();
	}
	
	public StreamedContent getRenderPdf() throws IOException, ApplicationBusinessException, JRException, SystemException, DocumentException {
		if(errorEmptyList){ return null;}
		try{
			return this.criarStreamedContentPdf(gerarDocumento().getPdfByteArray(false));
		}catch (Exception e) {
			LOG.error("Exceção capturada: ", e);
			return null;
		}
	}
		
	@Override
	public List<RelatorioMapaHematologiaVO> recuperarColecao() throws ApplicationBusinessException {
		if(errorEmptyList){ return null; }
		
		if(lista == null){
			
			String nomeMicrocomputador = null;
			try {
				nomeMicrocomputador = super.getEnderecoRedeHostRemoto();
			} catch (UnknownHostException e) {
				LOG.error("Exceção caputada:", e);
			}
			
			try {
				lista = examesFacade.obterMapasHematologiaVO(mapa, tipoImpressao, dataMapa, nroMapa, nomeMicrocomputador);
			} catch (BaseException e) {
				apresentarExcecaoNegocio(e);
			}
		}
		return lista;
	}
	
	@Override
	public String recuperarArquivoRelatorio() {
		return "br/gov/mec/aghu/exames/report/relatorioMapaHematologiaIntAmbCoag.jasper";
	}

	public Map<String, Object> recuperarParametros() {
		if(errorEmptyList){ return null; }
		
		final Map<String, Object> params = new HashMap<String, Object>();
		String local = cadastrosBasicosInternacaoFacade.recuperarNomeInstituicaoHospitalarLocal();
		
		params.put("nomeHospital", (local != null) ? local.toUpperCase() : local);
		params.put("nomeMapa", mapa.getSeq() + " - "+ mapa.getNomeMapa());
		params.put("nmRelatorio", nmRelatorio);
		
		if(lista != null && !lista.isEmpty()){
			params.put("descUnidade", lista.get(0).getCpUnfDesc()); 
		}
		
		return params;
	}

	public String voltar(){
		return EMISSAO_MAPA_TRABALHO;
	}
	
	
	public Short getSeqMapa() {
		return seqMapa;
	}

	public void setSeqMapa(Short seqMapa) {
		this.seqMapa = seqMapa;
	}

	public AelConfigMapa getMapa() {
		return mapa;
	}

	public void setMapa(AelConfigMapa mapa) {
		this.mapa = mapa;
	}

	public DominioTipoImpressaoMapa getTipoImpressao() {
		return tipoImpressao;
	}

	public void setTipoImpressao(DominioTipoImpressaoMapa tipoImpressao) {
		this.tipoImpressao = tipoImpressao;
	}

	public List<RelatorioMapaHematologiaVO> getLista() {
		return lista;
	}

	public void setLista(List<RelatorioMapaHematologiaVO> lista) {
		this.lista = lista;
	}

	public Date getDataMapa() {
		return dataMapa;
	}

	public void setDataMapa(Date dataMapa) {
		this.dataMapa = dataMapa;
	}

	public Integer getNroMapa() {
		return nroMapa;
	}

	public void setNroMapa(Integer nroMapa) {
		this.nroMapa = nroMapa;
	}

	public String getNmRelatorio() {
		return nmRelatorio;
	}

	public void setNmRelatorio(String nmRelatorio) {
		this.nmRelatorio = nmRelatorio;
	}

	public boolean isDirectPrint() {
		return directPrint;
	}

	public void setDirectPrint(boolean directPrint) {
		this.directPrint = directPrint;
	}
}
