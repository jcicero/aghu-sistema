package br.gov.mec.aghu.model;

// Generated 08/02/2010 17:25:25 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityNumero;


/**
 * ScoSolicitacoesDeCompras generated by hbm2java
 */
@Entity
@Table(name = "SCO_SOLICITACOES_DE_COMPRAS", schema = "AGH")
@SequenceGenerator(name="scoSlcSq1", sequenceName="AGH.SCO_SLC_SQ1", allocationSize = 1)
@SuppressWarnings({"PMD.ExcessiveClassLength"})
public class ScoSolicitacaoDeCompra extends BaseEntityNumero<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5890864134370851918L;
	
	private Integer numero;
	private ScoPontoParadaSolicitacao pontoParadaProxima;
	private ScoPontoParadaSolicitacao pontoParada;
	private ScoUnidadeMedida unidadeMedida;
	private ScoModalidadeLicitacao modalidadeLicitacao;	
	private Integer itpPdmNumero;
	private Integer itpNumero;
	private AipPacientes paciente;
	private ScoMaterial material;
	private FccCentroCustos centroCusto;
	private FccCentroCustos centroCustoAutzTecnica;
	private FccCentroCustos centroCustoAplicada;
	private SceAlmoxarifado almoxarifado;
	private FsoConveniosFinanceiro convenioFinanceiro;
	private RapServidores servidorAlteracao;
	private RapServidores servidorAutorizacao;
	private RapServidores servidorCompra;
	private RapServidores servidorExclusao;	
	private RapServidores servidorOrcamento;	
	private RapServidores servidor;	
	private FsoNaturezaDespesa naturezaDespesa;
	private Byte codigoNaturezaDespesa;
	private Integer codigoGrupoNaturezaDespesa;
	
	private Date dtSolicitacao;
	private Date dtDigitacao;
	private Long qtdeSolicitada;
	private Long qtdeAprovada;
	private Boolean exclusao;
	private Boolean urgente;
	private Boolean devolucao;
	//TODO Dominio : orcamentoPrevio
	private String orcamentoPrevio;
	private Short diasDuracao;
	private Long qtdeReforco;
	private String descTecnica;
	private String descTecnicaCont;
	private String aplicacao;
	private String justificativaUso;
	private String motivoExclusao;
	private Date dtAutorizacao;
	private Date dtExclusao;
	private Date dtDescTecnica;
	private BigDecimal valorUnitPrevisto;
	private Date dtAnalise;
	private String motivoUrgencia;
	private String justificativaDevolucao;
	private Integer nroInvestimento;
	private Date dtAlteracao;
	private String descricao;
	private Boolean geracaoAutomatica;
	private Long qtdeEntregue;
	private Boolean efetivada;
	private Boolean fundoFixo;
	private Boolean recebimento;
	private Date dtOrcamento;
	private Integer nroProjeto;
	private Date dtRecebimento;
	private Boolean matExclusivo;
	private String justificativaExclusividade;
	private Integer slcNumeroVinculado;
	private Short ordemRecebimento;
	private Boolean entregaUnica;
	private Set<ScoFaseSolicitacao> fases;
	private Integer numeroOrdemItemLicitacao;
	
	private Integer version;
	private Boolean prioridade;
	private String motivoPrioridade;
	private Date dtMaxAtendimento;

	private FsoGrupoNaturezaDespesa grupoNaturezaDespesa;

	private FsoVerbaGestao verbaGestao;
	
	public ScoSolicitacaoDeCompra() {
	}

	@Id
	@Column(name = "NUMERO", nullable = false, precision = 7, scale = 0)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "scoSlcSq1")
	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PPS_CODIGO", referencedColumnName = "CODIGO")	
	public ScoPontoParadaSolicitacao getPontoParada() {
		return pontoParada;
	}

	public void setPontoParada(ScoPontoParadaSolicitacao pontoParada) {
		this.pontoParada = pontoParada;
	}

	@ManyToOne(fetch = FetchType.LAZY)	
	@JoinColumn(name = "PPS_CODIGO_LOC_PROXIMA", referencedColumnName = "CODIGO")
	public ScoPontoParadaSolicitacao getPontoParadaProxima() {
		return pontoParadaProxima;
	}

	public void setPontoParadaProxima(ScoPontoParadaSolicitacao pontoParadaProxima) {
		this.pontoParadaProxima = pontoParadaProxima;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CCT_CODIGO", referencedColumnName = "CODIGO")
	public FccCentroCustos getCentroCusto() {
		return centroCusto;
	}

	public void setCentroCusto(FccCentroCustos centroCusto) {
		this.centroCusto = centroCusto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CCT_CODIGO_E_APLICADA", referencedColumnName = "CODIGO")
	public FccCentroCustos getCentroCustoAplicada() {
		return centroCustoAplicada;
	}

	public void setCentroCustoAplicada(FccCentroCustos centroCustoAplicada) {
		this.centroCustoAplicada = centroCustoAplicada;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_AUTORIZADA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_AUTORIZADA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorAutorizacao() {
		return servidorAutorizacao;
	}

	public void setServidorAutorizacao(RapServidores servidorAutorizacao) {
		this.servidorAutorizacao = servidorAutorizacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_SOLICITACAO", nullable = false, length = 7)
	public Date getDtSolicitacao() {
		return this.dtSolicitacao;
	}

	public void setDtSolicitacao(Date dtSolicitacao) {
		this.dtSolicitacao = dtSolicitacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_DIGITACAO", nullable = false, length = 7)
	public Date getDtDigitacao() {
		return this.dtDigitacao;
	}

	public void setDtDigitacao(Date dtDigitacao) {
		this.dtDigitacao = dtDigitacao;
	}

	@Column(name = "QTDE_SOLICITADA", nullable = false, precision = 10, scale = 0)
	public Long getQtdeSolicitada() {
		return this.qtdeSolicitada;
	}

	public void setQtdeSolicitada(Long qtdeSolicitada) {
		this.qtdeSolicitada = qtdeSolicitada;
	}

	@Column(name = "QTDE_APROVADA", precision = 10, scale = 0)
	public Long getQtdeAprovada() {
		return this.qtdeAprovada;
	}

	public void setQtdeAprovada(Long qtdeAprovada) {
		this.qtdeAprovada = qtdeAprovada;
	}

	@Column(name = "IND_EXCLUSAO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getExclusao() {
		return exclusao;
	}

	public void setExclusao(Boolean exclusao) {
		this.exclusao = exclusao;
	}

	@Column(name = "IND_URGENTE", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getUrgente() {
		return urgente;
	}

	public void setUrgente(Boolean urgente) {
		this.urgente = urgente;
	}

	@Column(name = "IND_DEVOLUCAO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getDevolucao() {
		return devolucao;
	}

	public void setDevolucao(Boolean devolucao) {
		this.devolucao = devolucao;
	}

	@Column(name = "ORCAMENTO_PREVIO", length = 1)
	@Length(max = 1)
	public String getOrcamentoPrevio() {
		return this.orcamentoPrevio;
	}

	public void setOrcamentoPrevio(String orcamentoPrevio) {
		this.orcamentoPrevio = orcamentoPrevio;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MLC_CODIGO", referencedColumnName = "CODIGO")
	public ScoModalidadeLicitacao getModalidadeLicitacao() {
		return modalidadeLicitacao;
	}

	public void setModalidadeLicitacao(ScoModalidadeLicitacao modalidadeLicitacao) {
		this.modalidadeLicitacao = modalidadeLicitacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_COMPRA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_COMPRA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorCompra() {
		return servidorCompra;
	}

	public void setServidorCompra(RapServidores servidorCompra) {
		this.servidorCompra = servidorCompra;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NTD_GND_CODIGO", referencedColumnName = "CODIGO", insertable=false, updatable=false)
	public FsoGrupoNaturezaDespesa getGrupoNaturezaDespesa() {
		return grupoNaturezaDespesa;
	}

	public void setGrupoNaturezaDespesa(
			FsoGrupoNaturezaDespesa grupoNaturezaDespesa) {
		this.grupoNaturezaDespesa = grupoNaturezaDespesa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NTD_CODIGO", referencedColumnName = "CODIGO", insertable=false, updatable=false),
			@JoinColumn(name = "NTD_GND_CODIGO", referencedColumnName = "GND_CODIGO", insertable=false, updatable=false) })
	public FsoNaturezaDespesa getNaturezaDespesa() {
		return naturezaDespesa;
	}

	public void setNaturezaDespesa(FsoNaturezaDespesa naturezaDespesa) {
		this.naturezaDespesa = naturezaDespesa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CVF_CODIGO", referencedColumnName = "CODIGO")
	public FsoConveniosFinanceiro getConvenioFinanceiro() {
		return convenioFinanceiro;
	}

	public void setConvenioFinanceiro(FsoConveniosFinanceiro convenioFinanceiro) {
		this.convenioFinanceiro = convenioFinanceiro;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CCT_CODIGO_AUTZ_TECNICA", referencedColumnName = "CODIGO")
	public FccCentroCustos getCentroCustoAutzTecnica() {
		return centroCustoAutzTecnica;
	}

	public void setCentroCustoAutzTecnica(FccCentroCustos centroCustoAutzTecnica) {
		this.centroCustoAutzTecnica = centroCustoAutzTecnica;
	}

	@Column(name = "DIAS_DURACAO", precision = 4, scale = 0)
	public Short getDiasDuracao() {
		return this.diasDuracao;
	}

	public void setDiasDuracao(Short diasDuracao) {
		this.diasDuracao = diasDuracao;
	}

	@Column(name = "QTDE_REFORCO", precision = 10, scale = 0)
	public Long getQtdeReforco() {
		return this.qtdeReforco;
	}

	public void setQtdeReforco(Long qtdeReforco) {
		this.qtdeReforco = qtdeReforco;
	}

	@Column(name = "DESC_TECNICA", length = 2000)
	@Length(max = 2000)
	public String getDescTecnica() {
		return this.descTecnica;
	}

	public void setDescTecnica(String descTecnica) {
		this.descTecnica = descTecnica;
	}

	@Column(name = "DESC_TECNICA_CONT", length = 2000)
	@Length(max = 2000)
	public String getDescTecnicaCont() {
		return this.descTecnicaCont;
	}

	public void setDescTecnicaCont(String descTecnicaCont) {
		this.descTecnicaCont = descTecnicaCont;
	}

	@Column(name = "APLICACAO", length = 500)
	@Length(max = 500)
	public String getAplicacao() {
		return this.aplicacao;
	}

	public void setAplicacao(String aplicacao) {
		this.aplicacao = aplicacao;
	}

	@Column(name = "JUSTIFICATIVA_USO", length = 500)
	@Length(max = 500)
	public String getJustificativaUso() {
		return this.justificativaUso;
	}

	public void setJustificativaUso(String justificativaUso) {
		this.justificativaUso = justificativaUso;
	}

	@Column(name = "MOTIVO_EXCLUSAO", length = 240)
	@Length(max = 240)
	public String getMotivoExclusao() {
		return this.motivoExclusao;
	}

	public void setMotivoExclusao(String motivoExclusao) {
		this.motivoExclusao = motivoExclusao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_AUTORIZACAO", length = 7)
	public Date getDtAutorizacao() {
		return this.dtAutorizacao;
	}

	public void setDtAutorizacao(Date dtAutorizacao) {
		this.dtAutorizacao = dtAutorizacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_EXCLUSAO", length = 7)
	public Date getDtExclusao() {
		return this.dtExclusao;
	}

	public void setDtExclusao(Date dtExclusao) {
		this.dtExclusao = dtExclusao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_DESC_TECNICA", length = 7)
	public Date getDtDescTecnica() {
		return this.dtDescTecnica;
	}

	public void setDtDescTecnica(Date dtDescTecnica) {
		this.dtDescTecnica = dtDescTecnica;
	}

	@Column(name = "VALOR_UNIT_PREVISTO", precision = 18, scale = 2)
	public BigDecimal getValorUnitPrevisto() {
		return this.valorUnitPrevisto;
	}

	public void setValorUnitPrevisto(BigDecimal valorUnitPrevisto) {
		this.valorUnitPrevisto = valorUnitPrevisto;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ANALISE", length = 7)
	public Date getDtAnalise() {
		return this.dtAnalise;
	}

	public void setDtAnalise(Date dtAnalise) {
		this.dtAnalise = dtAnalise;
	}

	@Column(name = "MOTIVO_URGENCIA", length = 240)
	@Length(max = 240)
	public String getMotivoUrgencia() {
		return this.motivoUrgencia;
	}

	public void setMotivoUrgencia(String motivoUrgencia) {
		this.motivoUrgencia = motivoUrgencia;
	}

	@Column(name = "JUSTIFICATIVA_DEVOLUCAO", length = 240)
	@Length(max = 240)
	public String getJustificativaDevolucao() {
		return this.justificativaDevolucao;
	}

	public void setJustificativaDevolucao(String justificativaDevolucao) {
		this.justificativaDevolucao = justificativaDevolucao;
	}

	@Column(name = "NRO_INVESTIMENTO", precision = 5, scale = 0)
	public Integer getNroInvestimento() {
		return this.nroInvestimento;
	}

	public void setNroInvestimento(Integer nroInvestimento) {
		this.nroInvestimento = nroInvestimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_EXCLUIDA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_EXCLUIDA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorExclusao() {
		return servidorExclusao;
	}

	public void setServidorExclusao(RapServidores servidorExclusao) {
		this.servidorExclusao = servidorExclusao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_ALTERADA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorAlteracao() {
		return servidorAlteracao;
	}

	public void setServidorAlteracao(RapServidores servidorAlteracao) {
		this.servidorAlteracao = servidorAlteracao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ALTERACAO", length = 7)
	public Date getDtAlteracao() {
		return this.dtAlteracao;
	}

	public void setDtAlteracao(Date dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	@Column(name = "DESCRICAO", length = 500)
	@Length(max = 500)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_GERACAO_AUTOMATICA", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")	
	public Boolean getGeracaoAutomatica() {
		return geracaoAutomatica;
	}

	public void setGeracaoAutomatica(Boolean geracaoAutomatica) {
		this.geracaoAutomatica = geracaoAutomatica;
	}

	@Column(name = "QTDE_ENTREGUE", precision = 10, scale = 0)
	public Long getQtdeEntregue() {
		return this.qtdeEntregue;
	}

	public void setQtdeEntregue(Long qtdeEntregue) {
		this.qtdeEntregue = qtdeEntregue;
	}

	@Column(name = "IND_EFETIVADA", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getEfetivada() {
		return efetivada;
	}

	public void setEfetivada(Boolean efetivada) {
		this.efetivada = efetivada;
	}

	@Column(name = "IND_FUNDO_FIXO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")	
	public Boolean getFundoFixo() {
		return fundoFixo;
	}

	public void setFundoFixo(Boolean fundoFixo) {
		this.fundoFixo = fundoFixo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UMD_CODIGO", referencedColumnName = "CODIGO")
	public ScoUnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(ScoUnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	@Column(name = "IND_RECEBIMENTO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getRecebimento() {
		return recebimento;
	}

	public void setRecebimento(Boolean recebimento) {
		this.recebimento = recebimento;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_ORCAMENTO", length = 7)
	public Date getDtOrcamento() {
		return this.dtOrcamento;
	}

	public void setDtOrcamento(Date dtOrcamento) {
		this.dtOrcamento = dtOrcamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_ORCAMENTO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ORCAMENTO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorOrcamento() {
		return servidorOrcamento;
	}

	public void setServidorOrcamento(RapServidores servidorOrcamento) {
		this.servidorOrcamento = servidorOrcamento;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAT_CODIGO", referencedColumnName = "CODIGO")
	public ScoMaterial getMaterial() {
		return material;
	}

	public void setMaterial(ScoMaterial material) {
		this.material = material;
	}

	@Column(name = "NRO_PROJETO", precision = 5, scale = 0)
	public Integer getNroProjeto() {
		return this.nroProjeto;
	}

	public void setNroProjeto(Integer nroProjeto) {
		this.nroProjeto = nroProjeto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ALM_SEQ", referencedColumnName = "SEQ")
	public SceAlmoxarifado getAlmoxarifado() {
		return almoxarifado;
	}

	public void setAlmoxarifado(SceAlmoxarifado almoxerifado) {
		this.almoxarifado = almoxerifado;
	}
	
	@Column(name = "ITP_PDM_NUMERO", precision = 7, scale = 0)
	public Integer getItpPdmNumero() {
		return itpPdmNumero;
	}

	public void setItpPdmNumero(Integer itpPdmNumero) {
		this.itpPdmNumero = itpPdmNumero;
	}

	@Column(name = "ITP_NUMERO", precision = 7, scale = 0)
	public Integer getItpNumero() {
		return itpNumero;
	}

	public void setItpNumero(Integer itpNumero) {
		this.itpNumero = itpNumero;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_RECEBIMENTO", length = 7)
	public Date getDtRecebimento() {
		return this.dtRecebimento;
	}

	public void setDtRecebimento(Date dtRecebimento) {
		this.dtRecebimento = dtRecebimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAC_CODIGO", referencedColumnName = "CODIGO")
	public AipPacientes getPaciente() {
		return this.paciente;
	}

	public void setPaciente(AipPacientes paciente) {
		this.paciente = paciente;
	}


	@Column(name = "IND_MAT_EXCLUSIVO", length = 1)	
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")	
	public Boolean getMatExclusivo() {
		return matExclusivo;
	}

	public void setMatExclusivo(Boolean matExclusivo) {
		this.matExclusivo = matExclusivo;
	}

	@Column(name = "JUSTIFICATIVA_EXCLUSIVIDADE", length = 240)
	@Length(max = 240)
	public String getJustificativaExclusividade() {
		return this.justificativaExclusividade;
	}

	public void setJustificativaExclusividade(String justificativaExclusividade) {
		this.justificativaExclusividade = justificativaExclusividade;
	}

	@Column(name = "SLC_NUMERO_VINCULADO", precision = 7, scale = 0)
	public Integer getSlcNumeroVinculado() {
		return this.slcNumeroVinculado;
	}

	public void setSlcNumeroVinculado(Integer slcNumeroVinculado) {
		this.slcNumeroVinculado = slcNumeroVinculado;
	}

	@Column(name = "ORDEM_RECEBIMENTO", precision = 3, scale = 0)
	public Short getOrdemRecebimento() {
		return this.ordemRecebimento;
	}

	public void setOrdemRecebimento(Short ordemRecebimento) {
		this.ordemRecebimento = ordemRecebimento;
	}

	@Column(name = "IND_ENTREGA_UNICA", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getEntregaUnica() {
		return entregaUnica;
	}

	public void setEntregaUnica(Boolean entregaUnica) {
		this.entregaUnica = entregaUnica;
	}

	@OneToMany(mappedBy="solicitacaoDeCompra", fetch=FetchType.LAZY)
	public Set<ScoFaseSolicitacao> getFases() {
		return fases;
	}

	public void setFases(Set<ScoFaseSolicitacao> fases) {
		this.fases = fases;
	}
	
	@Column(name = "VERSION", nullable = false)
	@Version
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	
	@Column(name = "IND_PRIORIDADE", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Boolean prioridade) {
		this.prioridade = prioridade;
	}

	@Column(name = "MOTIVO_PRIORIDADE", length = 500)
	@Length(max = 500)
	public String getMotivoPrioridade() {
		return motivoPrioridade;
	}

	public void setMotivoPrioridade(String motivoPrioridade) {
		this.motivoPrioridade = motivoPrioridade;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_MAX_ATENDIMENTO", length = 7)
	public Date getDtMaxAtendimento() {
		return dtMaxAtendimento;
	}

	public void setDtMaxAtendimento(Date dtMaxAtendimento) {
		this.dtMaxAtendimento = dtMaxAtendimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VBG_SEQ", referencedColumnName = "SEQ")
	public FsoVerbaGestao getVerbaGestao() {
		return verbaGestao;
	}
	
	public void setVerbaGestao(FsoVerbaGestao verbaGestao) {
		this.verbaGestao = verbaGestao;
	}
	
	/**
	 * TODO Mantido para fins de compatibilidade. Considerar a possibilidade de remove-lo.
	 * 
	 * @return
	 */
	@Transient
	public Integer getVbgSeq() {
		return getVerbaGestao() != null ? getVerbaGestao().getSeq() : null;
	}

	/*@PrePersist
	@PreUpdate
	protected void validacoes() {
	    Refere-se a RN TPL010_5       
		if (!((!this.devolucao.isSim() && this.justificativaDevolucao == null) || (this.devolucao.isSim() && this.justificativaDevolucao != null))) {
			throw new BaseRuntimeException(
					ScoSolicitacaoDeCompraExceptionCode.IND_DEVOLUCAO_E_JUSTIFICATIVA_DEVOLUCAO_INVALIDA);
		}
	    Refere-se a RN TPL010_1 
		if (!((!this.urgente.isSim() && this.motivoUrgencia == null) || (this.urgente.isSim() && this.motivoUrgencia != null))) {
			throw new BaseRuntimeException(
					ScoSolicitacaoDeCompraExceptionCode.IND_URGENTE_E_MOTIVO_URGENCIA_INVALIDA);
		}		
	    Refere-se a RN TPL010_2
		if (!((!this.exclusao.isSim() && this.motivoExclusao == null) || (this.exclusao.isSim() && this.motivoExclusao != null))) {
			throw new BaseRuntimeException(
					ScoSolicitacaoDeCompraExceptionCode.IND_EXCLUSAO_E_MOTIVO_EXCLUSAO_INVALIDA);
		}
	}*/
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		ScoSolicitacaoDeCompra other = (ScoSolicitacaoDeCompra) obj;
		if (numero == null) {
			if (other.numero != null){
				return false;
			}
		} else if (!numero.equals(other.numero)){
			return false;
		}
		return true;
	}*/
	@Override
	public boolean equals(Object other) {
		if (other instanceof ScoSolicitacaoDeCompra){
			ScoSolicitacaoDeCompra castOther = (ScoSolicitacaoDeCompra) other;
			return new EqualsBuilder()
				.append(this.numero, castOther.numero)
			.isEquals();
		}
		else {
			return false;
		}	
	}
	

	public enum Fields {
		APLICACAO("aplicacao"),
		PAC_CODIGO("paciente.codigo"),
		PACIENTE("paciente"),
		DESCRICAO("descricao"), 
		NUMERO("numero"),
		IND_EXCLUSAO("exclusao"),
		IND_DEVOLUCAO("devolucao"),
		MATERIAL("material"),
		MATERIAL_CODIGO("material.codigo"),
		IND_URGENTE("urgente"),
		QUANTIDADE_APROVADA("qtdeAprovada"),
		QUANTIDADE_SOLICITADA("qtdeSolicitada"),
		VALOR_UNIT_PREVISTO("valorUnitPrevisto"),
		MODALIDADE_LICITACAO("modalidadeLicitacao"),
		CODIGO_MODALIDADE_LICITACAO("modalidadeLicitacao.codigo"),
		LOCALIZACAO_PONTO_PARADA_ATUAL("pontoParadaProxima"),
		CODIGO_LOCALIZACAO_PONTO_PARADA_ATUAL("pontoParadaProxima.codigo"),
		MATRICULA_SERVIDOR_COMPRADOR("servidorCompra.id.matricula"),
		CODIGO_VINCULO_SERVIDOR_COMPRADOR("servidorCompra.id.vinCodigo"),
		MATRICULA_SERVIDOR_ATUAL("servidor.id.matricula"),
		CODIGO_VINCULO_SERVIDOR_ACESSO("servidor.id.vinCodigo"),
		SOLICITANTE("servidor"),
		AUTORIZANTE("servidorAutorizacao"),	
		NOME_SOLICITANTE("servidor.pessoaFisica"),
		NOME_AUTORIZANTE("servidorAutorizacao.pessoaFisica"),		
		FASES_SOLICITACAO("fases"),
		PONTO_PARADA_SOLICITACAO("pontoParada"),
		CODIGO_PONTO_PARADA_SOLICITACAO("pontoParada.codigo"),
		CODIGO_NUMERO_VINCULADO("slcNumeroVinculado"),
		IND_EFETIVADA("efetivada"),
		DATA_SOLICITACAO("dtSolicitacao"),
		DATA_ANALISE("dtAnalise"),
		DATA_DIGITACAO("dtDigitacao"),
		IND_RECEBIMENTO("recebimento"),
		MAT_CODIGO("material.codigo"),
		UMD_CODIGO("unidadeMedida.codigo"),
		UNIDADE_MEDIDA("unidadeMedida"),
		NATUREZA_DESPESA("naturezaDespesa"),
		CONVENIO_FINANCEIRO("convenioFinanceiro"),
		CC_APLICADA_CODIGO("centroCustoAplicada.codigo"),
		CENTRO_CUSTO("centroCusto"),
		CENTRO_CUSTO_APLICADA("centroCustoAplicada"),
		IND_FUNDO_FIXO("fundoFixo"),
		NRO_PROJETO("nroProjeto"),
		DIAS_DURACAO("diasDuracao"),
		CVF_CODIGO("convenioFinanceiro.codigo"), 
		CCT_CODIGO("centroCusto.codigo"),
		CCT_AUTZ_TECNICA("centroCustoAutzTecnica"),
		CCT_CODIGO_AUTZ_TECNICA("centroCustoAutzTecnica.codigo"),
		NTD_CODIGO("naturezaDespesa.id.codigo"),
		NTD_GND_CODIGO("naturezaDespesa.id.gndCodigo"),
		DATA_AUTORIZACAO("dtAutorizacao"),
		JUSTIFICATIVA_USO("justificativaUso"),
		MOTIVO_URGENCIA("motivoUrgencia"),
		NRO_INVESTIMENTO("nroInvestimento"),
		DT_ALTERACAO("dtAlteracao"),
		GERACAO_AUTOMATICA("geracaoAutomatica"),
		SER_MATRICULA_ALTERADA("servidorAlteracao.id.matricula"),
		SER_VIN_CODIGO_ALTERADA("servidorAlteracao.id.vinCodigo"),
		SER_VIN_CODIGO_ORCAMENTO("servidorOrcamento.id.vinCodigo"),
		SER_MATRICULA_ORCAMENTO("servidorOrcamento.id.matricula"),
		DT_ORCAMENTO("dtOrcamento"),
		SER_MATRICULA_AUTORIZADA("servidorAutorizacao.id.matricula"),
		SER_VIN_CODIGO_AUTORIZADA("servidorAutorizacao.id.vinCodigo"),
		VERSION("version"),
		PRIORIDADE("prioridade"),
	    MOTIVO_PRIORIDADE("motivoPrioridade"),
	    DT_MAX_ATENDIMENTO("dtMaxAtendimento"),
	    VBG_SEQ("vbgSeq"),
	    PPS_CODIGO("pontoParada.codigo"),
	    PPS_CODIGO_LOC_PROXIMA("pontoParadaProxima.codigo"),
	    IND_MAT_EXCLUSIVO("matExclusivo"),
	    JUSTIFICATIVA_EXCLUSIVIDADE("justificativaExclusividade"),
	    QTDE_REFORCO("qtdeReforco"),
	    SERVIDOR_COMPRA("servidorCompra"),
	    DT_ANALISE("dtAnalise"),
	    VERBA_GESTAO("verbaGestao"),
	    VERBA_GESTAO_SEQ("verbaGestao.seq"),
	    ALMOXARIFADO("almoxarifado"),
	    GRUPO_NATUREZA_DESPESA("grupoNaturezaDespesa"),
	    SERVIDOR("servidor"),
	    SERVIDOR_EXCLUSAO("servidorExclusao"),
	    DT_EXCLUSAO("dtExclusao");
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}
	
	@Transient
	public Integer getNumeroOrdemItemLicitacao() {
		return numeroOrdemItemLicitacao;
	}

	public void setNumeroOrdemItemLicitacao(Integer numeroOrdemItemLicitacao) {
		this.numeroOrdemItemLicitacao = numeroOrdemItemLicitacao;
	}

	/**
	 * Campo sintético criado para mapear diretamente este dominio booleano em
	 * um componente selectOne
	 * urgente *
	 * @return
	 */
	/*@Transient
	public boolean isUrgenteCheckBox() {
		if (this.urgente != null && this.urgente.isSim()) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}*/

	/*@Transient
	public void setUrgenteCheckBox(boolean urgente) {
		if (urgente) {
			this.urgente = DominioSimNao.S;
		} else {
			this.urgente = DominioSimNao.N;
		}
	}*/

	/**
	 * Campo sintético criado para mapear diretamente este dominio booleano em
	 * um componente selectOne
	 * prioridade
	 * @return
	 */
	/*@Transient
	public boolean isPrioridadeCheckBox() {
		if (this.prioridade != null && this.prioridade.isSim()) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	@Transient
	public void setPrioridadeCheckBox(boolean prioridade) {
		if (prioridade) {
			this.prioridade = DominioSimNao.S;
		} else {
			this.prioridade = DominioSimNao.N;
		}
	}*/

	/**
	 * Campo sintético criado para mapear diretamente este dominio booleano em
	 * um componente selectOne
	 * matExclusivo
	 * @return
	 */
	/*@Transient
	public boolean isMatExclusivoCheckBox() {
		if (this.matExclusivo != null && this.matExclusivo.isSim()) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	@Transient
	public void setMatExclusivoCheckBox(boolean matExclusivo) {
		if (matExclusivo) {
			this.matExclusivo = DominioSimNao.S;
		} else {
			this.matExclusivo = DominioSimNao.N;
		}
	}*/

	/**
	 * Campo sintético criado para mapear diretamente este dominio booleano em
	 * um componente selectOne
	 * exclusao
	 * @return
	 */
	/*@Transient
	public boolean isExclusaoCheckBox() {
		if (this.exclusao != null && this.exclusao.isSim()) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	@Transient
	public void setExclusaoCheckBox(boolean exclusao) {
		if (exclusao) {
			this.exclusao = DominioSimNao.S;
		} else {
			this.exclusao = DominioSimNao.N;
		}
	}*/

	/**
	 * Campo sintético criado para mapear diretamente este dominio booleano em
	 * um componente selectOne
	 * devolucao
	 * @return
	 */
	/*@Transient
	public boolean isDevolucaoCheckBox() {
		if (this.devolucao != null && this.devolucao.isSim()) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	@Transient
	public void setDevolucaoCheckBox(boolean devolucao) {
		if (devolucao) {
			this.devolucao = DominioSimNao.S;
		} else {
			this.devolucao = DominioSimNao.N;
		}
	}*/

	
	
	@Transient
	public BigDecimal getValorTotal() {
		if (getValorUnitPrevisto() != null && getQtdeSolicitada() != null) {
			return BigDecimal.ZERO.add(getValorUnitPrevisto().multiply(
					new BigDecimal(getQtdeSolicitada())));
		} else {
			return null;
		}
	}

	@Column(name = "NTD_CODIGO", nullable=true)
	public Byte getCodigoNaturezaDespesa() {
		return codigoNaturezaDespesa;
	}

	public void setCodigoNaturezaDespesa(Byte codigoNaturezaDespesa) {
		this.codigoNaturezaDespesa = codigoNaturezaDespesa;
	}
	
	@Column(name = "NTD_GND_CODIGO", nullable=true)
	public Integer getCodigoGrupoNaturezaDespesa() {
		return codigoGrupoNaturezaDespesa;
	}

	public void setCodigoGrupoNaturezaDespesa(Integer codigoGrupoNaturezaDespesa) {
		this.codigoGrupoNaturezaDespesa = codigoGrupoNaturezaDespesa;
	}

	@PrePersist
	@PreUpdate
	public void setGrupoNatureza(){
		if(getGrupoNaturezaDespesa() != null){
			setCodigoGrupoNaturezaDespesa(getGrupoNaturezaDespesa().getCodigo());			
		}
		if(getNaturezaDespesa() != null && getNaturezaDespesa().getId() != null){
			setCodigoNaturezaDespesa(getNaturezaDespesa().getId().getCodigo());
		}
	}
}