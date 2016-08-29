package br.gov.mec.aghu.model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Parameter;

import br.gov.mec.aghu.dominio.DominioOrigemSolicitacao;
import br.gov.mec.aghu.core.exception.BaseRuntimeException;
import br.gov.mec.aghu.core.exception.BusinessExceptionCode;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

@Entity
@Immutable
@Table(name = "ael_solicitacao_exames", schema = "hist")
public class AelSolicitacaoExamesHist extends BaseEntitySeq<Integer> implements java.io.Serializable, IAelSolicitacaoExames  {

	private static final long serialVersionUID = -2912587321708530893L;
	private Integer seq;
	private AghUnidadesFuncionais unidadeFuncional;
	private AghAtendimentos atendimento;
	private Boolean recemNascido;
	private Date criadoEm;
	private RapServidores servidor;
	private String informacoesClinicas;
	private RapServidores servidorResponsabilidade;
	private RapServidores servidorAlterado;
	private FatConvenioSaudePlano convenioSaudePlano;
	private AghUnidadesFuncionais unidadeFuncionalAreaExecutora;
	private Boolean usaAntimicrobianos;
	private Boolean indTransplante;
	private AelProjetoPesquisas projetoPesquisa; 
	private AelAtendimentoDiversos atendimentoDiverso;
	private MamRegistro registro;
	private DominioOrigemSolicitacao indObjetivoSolic;
	private List<AelItemSolicExameHist> itensSolicitacaoExame = new LinkedList<AelItemSolicExameHist>();
	//private Set<AelAmostrasHist> aelAmostras = new HashSet<AelAmostrasHist>(0);
	private FatConvenioSaude convenioSaude;

	private enum AelSolicitacaoExameExceptionCode implements BusinessExceptionCode {
		AEL_SOE_CK4
	}
	
	public AelSolicitacaoExamesHist() {
	}

	public AelSolicitacaoExamesHist(
			Integer seq,
			AghUnidadesFuncionais unidadeFuncional, 
			Boolean recemNascido,
			Date criadoEm, 
			RapServidores servidor
			) {
		this.seq = seq;
		this.unidadeFuncional = unidadeFuncional;
		this.recemNascido = recemNascido;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
	}

	public AelSolicitacaoExamesHist(
			Integer seq,
			AghUnidadesFuncionais unidadeFuncional, 
			Boolean recemNascido, 
			Date criadoEm, 
			RapServidores servidor,
			String informacoesClinicas,
			RapServidores
			servidorResponsabilidade,
			RapServidores servidorAlterado, 
			FatConvenioSaudePlano convenioSaudePlano,
			AghUnidadesFuncionais unidadeFuncionalAreaExecutora, Boolean usaAntimicrobianos,
			Boolean indTransplante, 
			AelProjetoPesquisas projetoPesquisa, 
			AelAtendimentoDiversos atendimentoDiverso, 
			MamRegistro registro,
			DominioOrigemSolicitacao indObjetivoSolic) {
		this.seq = seq;
		this.unidadeFuncional = unidadeFuncional;
		this.recemNascido = recemNascido;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
		this.informacoesClinicas = informacoesClinicas;
		this.servidorResponsabilidade = servidorResponsabilidade;
		this.servidorAlterado = servidorAlterado;
		this.convenioSaudePlano = convenioSaudePlano;
		this.unidadeFuncionalAreaExecutora = unidadeFuncionalAreaExecutora;
		this.usaAntimicrobianos = usaAntimicrobianos;
		this.indTransplante = indTransplante;
		this.projetoPesquisa = projetoPesquisa;
		this.atendimentoDiverso = atendimentoDiverso;
		this.registro = registro;
		this.indObjetivoSolic = indObjetivoSolic;
	}

	@Id
	@Column(name = "SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATD_SEQ")
	public AghAtendimentos getAtendimento() {
		return this.atendimento;
	}

	public void setAtendimento(AghAtendimentos atendimento) {
		this.atendimento = atendimento;
	}

	@Column(name = "RECEM_NASCIDO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getRecemNascido() {
		return this.recemNascido;
	}

	public void setRecemNascido(Boolean recemNascido) {
		this.recemNascido = recemNascido;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	

	@Column(name = "INFORMACOES_CLINICAS", length = 500)
	public String getInformacoesClinicas() {
		return this.informacoesClinicas;
	}

	public void setInformacoesClinicas(String informacoesClinicas) {
		this.informacoesClinicas = informacoesClinicas;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_EH_RESPONSABILID", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_EH_RESPONSABILI", referencedColumnName = "VIN_CODIGO")})
	public RapServidores getServidorResponsabilidade() {
		return servidorResponsabilidade;
	}
	
	public void setServidorResponsabilidade(RapServidores servidorEhResponsabilid) {
		this.servidorResponsabilidade = servidorEhResponsabilid;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA" ),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO")})
	public RapServidores getServidorAlterado() {
		return servidorAlterado;
	}

	public void setServidorAlterado(RapServidores servidorAlterado) {
		this.servidorAlterado = servidorAlterado;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "CSP_CNV_CODIGO", referencedColumnName = "CNV_CODIGO"),
			@JoinColumn(name = "CSP_SEQ", referencedColumnName = "SEQ") })
	public FatConvenioSaudePlano getConvenioSaudePlano() {
		return this.convenioSaudePlano;
	}

	public void setConvenioSaudePlano(FatConvenioSaudePlano convenioSaudePlano) {
		this.convenioSaudePlano = convenioSaudePlano;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNF_SEQ_AREA_EXECUTORA")
	public AghUnidadesFuncionais getUnidadeFuncionalAreaExecutora() {
		return unidadeFuncionalAreaExecutora;
	}
	
	public void setUnidadeFuncionalAreaExecutora(AghUnidadesFuncionais unidadeFuncionalAreaExecutora) {
		this.unidadeFuncionalAreaExecutora = unidadeFuncionalAreaExecutora;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNF_SEQ", nullable = false)
	public AghUnidadesFuncionais getUnidadeFuncional() {
		return unidadeFuncional;
	}

	public void setUnidadeFuncional(AghUnidadesFuncionais unidadeFuncional) {
		this.unidadeFuncional = unidadeFuncional;
	}
	
	@Column(name = "USA_ANTIMICROBIANOS", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getUsaAntimicrobianos() {
		return this.usaAntimicrobianos;
	}

	public void setUsaAntimicrobianos(Boolean usaAntimicrobianos) {
		this.usaAntimicrobianos = usaAntimicrobianos;
	}

	@Column(name = "IND_TRANSPLANTE", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndTransplante() {
		return this.indTransplante;
	}

	public void setIndTransplante(Boolean indTransplante) {
		this.indTransplante = indTransplante;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PJQ_SEQ", referencedColumnName= "SEQ")
	public AelProjetoPesquisas getProjetoPesquisa() {
		return projetoPesquisa;
	}

	public void setProjetoPesquisa(AelProjetoPesquisas projetoPesquisa) {
		this.projetoPesquisa = projetoPesquisa;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATV_SEQ", referencedColumnName= "SEQ")
	public AelAtendimentoDiversos getAtendimentoDiverso() {
		return atendimentoDiverso;
	}

	public void setAtendimentoDiverso(AelAtendimentoDiversos atendimentoDiverso) {
		this.atendimentoDiverso = atendimentoDiverso;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RGT_SEQ", referencedColumnName= "SEQ")
	public MamRegistro getRegistro() {
		return registro;
	}

	public void setRegistro(MamRegistro registro) {
		this.registro = registro;
	}

	@Column(name = "IND_OBJETIVO_SOLIC", length = 1)
	@org.hibernate.annotations.Type(parameters = { @Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioOrigemSolicitacao") }, type = "br.gov.mec.aghu.core.model.jpa.DominioUserType")
	public DominioOrigemSolicitacao getIndObjetivoSolic() {
		return this.indObjetivoSolic;
	}

	public void setIndObjetivoSolic(DominioOrigemSolicitacao indObjetivoSolic) {
		this.indObjetivoSolic = indObjetivoSolic;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "solicitacaoExame")
	public List<AelItemSolicExameHist> getItensSolicitacaoExame() {
		return itensSolicitacaoExame;
	}

	public void setItensSolicitacaoExame(List<AelItemSolicExameHist> itens) {
		this.itensSolicitacaoExame = itens;
	}
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "solicitacaoExame")
//	public Set<AelAmostrasHist> getAelAmostras() {
//		return aelAmostras;
//	}
//
//	public void setAelAmostras(Set<AelAmostrasHist> aelAmostras) {
//		this.aelAmostras = aelAmostras;
//	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CSP_CNV_CODIGO", referencedColumnName = "CODIGO", updatable = false, insertable = false)
	public FatConvenioSaude getConvenioSaude() {
		return convenioSaude;
	}

	public void setConvenioSaude(FatConvenioSaude convenioSaude) {
		this.convenioSaude = convenioSaude;
	}
	
	@Transient
	public void addItemSolicitacaoExame(AelItemSolicExameHist item) {
		if (item != null) {
			item.setId(null);
			item.setSolicitacaoExame(this);
			this.getItensSolicitacaoExame().add(item);
		}
	}
	
	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other == null) {
			return false;
		}
		if (!(other instanceof AelSolicitacaoExames)) {
			return false;
		}
		AelSolicitacaoExamesHist castOther = (AelSolicitacaoExamesHist) other;
		return new EqualsBuilder().append(this.getSeq(), castOther.getSeq()).isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.getSeq()).toHashCode();
	}
	
	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validarDados() {
		if (this.getRecemNascido() == null) {
			this.setRecemNascido(Boolean.FALSE);
		}
		if( !( (this.getAtendimentoDiverso() != null && this.getAtendimento() == null)
			||(this.getAtendimentoDiverso() == null && this.getAtendimento() != null))){
			throw new BaseRuntimeException(AelSolicitacaoExameExceptionCode.AEL_SOE_CK4);
		}  
	}

	public enum Fields {
		SEQ("seq"),
		//AMOSTRAS("aelAmostras"),
		ATENDIMENTO_SEQ("atendimento.seq"),
		ATENDIMENTO("atendimento"),
		CRIADO_EM("criadoEm"), 
		UNIDADE_FUNCIONAL("unidadeFuncional"),
		UNIDADE_FUNCIONAL_SEQ("unidadeFuncional.seq"),
		RECEM_NASCIDO("recemNascido"),
		SERVIDOR("servidor"),
		SERVIDOR_MATRICULA("servidor.id.matricula"),
		SERVIDOR_VIN_CODIGO("servidor.id.vinCodigo"),
		INFORMACOES_CLINICAS("informacoesClinicas"),
		SERVIDOR_EH_RESPONSABILID("servidorResponsabilidade"),
		SERVIDOR_ALTERADO("servidorAlterado"),
		CONVENIO_SAUDE_PLANO("convenioSaudePlano"),
		CONVENIO_SAUDE_PLANO_CODIGO("convenioSaudePlano.id.cnvCodigo"),
		CONVENIO_SAUDE_PLANO_SEQ("convenioSaudePlano.id.seq"),
		FAT_CONVENIO_SAUDE("convenioSaude"),
		FAT_CONVENIO_SAUDE_CODIGO("convenioSaude.codigo"),
		UNIDADE_FUNCIONAL_AREA_EXECUTORA("unidadeFuncionalAreaExecutora"),
		UNIDADE_FUNCIONAL_AREA_EXECUTORA_SEQ("unidadeFuncionalAreaExecutora.seq"),
		USA_ANTIMICROBIANOS("usaAntimicrobianos"),
		IND_TRANSPLANTE("indTransplante"),
		PROJETO_PESQUISA("projetoPesquisa"), 
		ATENDIMENTO_DIVERSO("atendimentoDiverso"),
		ATENDIMENTO_DIVERSO_SEQ("atendimentoDiverso.seq"),
		REGISTRO("registro"),
		IND_OBJETIVO_SOLIC("indObjetivoSolic"),
		ITENS_SOLICITACAO_EXAME("itensSolicitacaoExame");
		
		
		private String fields;
		private Fields(String fields) {
			this.fields = fields;
		}
		@Override
		public String toString() {
			return fields;
		}
	}

}
