package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * MciParamReportUsuarioJn generated by hbm2java
 */
@Entity
@Table(name = "MCI_PARAM_REPORT_USUARIOS_JN", schema = "AGH")
@Immutable
public class MciParamReportUsuarioJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = 862869157277460424L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer seq;
	private String pmcAplicacaoCodigo;
	private Date criadoEm;
	private String ordemEmissao;
	private String indPermanente;
	private Short nroCopias;
	private Double sessionId;
	private String indConfCci;
	private String indTipoPaciente;
	private Date periodoInicial;
	private Date periodoFinal;
	private String indSitAtendimento;
	private String indGrupoConvenio;
	private String tipoNotificacao;
	private Short unfSeq;
	private Integer pacCodigo;
	private Integer serMatricula;
	private Short serVinCodigo;
	private String indTodaEtiologia;
	private String indTodoGrupoEtiologia;
	private String indTodoProcedRisco;
	private String indTodoProcedCirurgico;
	private String indTodoAgrupUnidade;
	private String indTodaTopogInfeccao;
	private String indTodaTopogProcedimento;
	private String nomeParamPermanente;
	private Integer pruSeq;
	private String indTodoGrupoMatInfectante;
	private String indTodoFatorPredisponente;

	public MciParamReportUsuarioJn() {
	}

	public MciParamReportUsuarioJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer seq) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.seq = seq;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public MciParamReportUsuarioJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer seq,
			String pmcAplicacaoCodigo, Date criadoEm, String ordemEmissao, String indPermanente, Short nroCopias, Double sessionId,
			String indConfCci, String indTipoPaciente, Date periodoInicial, Date periodoFinal, String indSitAtendimento,
			String indGrupoConvenio, String tipoNotificacao, Short unfSeq, Integer pacCodigo, Integer serMatricula,
			Short serVinCodigo, String indTodaEtiologia, String indTodoGrupoEtiologia, String indTodoProcedRisco,
			String indTodoProcedCirurgico, String indTodoAgrupUnidade, String indTodaTopogInfeccao, String indTodaTopogProcedimento,
			String nomeParamPermanente, Integer pruSeq, String indTodoGrupoMatInfectante, String indTodoFatorPredisponente) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.seq = seq;
		this.pmcAplicacaoCodigo = pmcAplicacaoCodigo;
		this.criadoEm = criadoEm;
		this.ordemEmissao = ordemEmissao;
		this.indPermanente = indPermanente;
		this.nroCopias = nroCopias;
		this.sessionId = sessionId;
		this.indConfCci = indConfCci;
		this.indTipoPaciente = indTipoPaciente;
		this.periodoInicial = periodoInicial;
		this.periodoFinal = periodoFinal;
		this.indSitAtendimento = indSitAtendimento;
		this.indGrupoConvenio = indGrupoConvenio;
		this.tipoNotificacao = tipoNotificacao;
		this.unfSeq = unfSeq;
		this.pacCodigo = pacCodigo;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.indTodaEtiologia = indTodaEtiologia;
		this.indTodoGrupoEtiologia = indTodoGrupoEtiologia;
		this.indTodoProcedRisco = indTodoProcedRisco;
		this.indTodoProcedCirurgico = indTodoProcedCirurgico;
		this.indTodoAgrupUnidade = indTodoAgrupUnidade;
		this.indTodaTopogInfeccao = indTodaTopogInfeccao;
		this.indTodaTopogProcedimento = indTodaTopogProcedimento;
		this.nomeParamPermanente = nomeParamPermanente;
		this.pruSeq = pruSeq;
		this.indTodoGrupoMatInfectante = indTodoGrupoMatInfectante;
		this.indTodoFatorPredisponente = indTodoFatorPredisponente;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}
	// ATUALIZADOR JOURNALS - ID
	
/* ATUALIZADOR JOURNALS - Get / Set	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	public Long getSeqJn() {
		return this.seqJn;
	}

	public void setSeqJn(Long seqJn) {
		this.seqJn = seqJn;
	}

	@Column(name = "JN_USER", nullable = false, length = 30)
	@Length(max = 30)
	public String getJnUser() {
		return this.jnUser;
	}

	public void setJnUser(String jnUser) {
		this.jnUser = jnUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "JN_DATE_TIME", nullable = false, length = 29)
	public Date getJnDateTime() {
		return this.jnDateTime;
	}

	public void setJnDateTime(Date jnDateTime) {
		this.jnDateTime = jnDateTime;
	}

	@Column(name = "JN_OPERATION", nullable = false, length = 3)
	@Length(max = 3)
	public String getJnOperation() {
		return this.jnOperation;
	}

	public void setJnOperation(String jnOperation) {
		this.jnOperation = jnOperation;
	}*/

	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "PMC_APLICACAO_CODIGO", length = 20)
	@Length(max = 20)
	public String getPmcAplicacaoCodigo() {
		return this.pmcAplicacaoCodigo;
	}

	public void setPmcAplicacaoCodigo(String pmcAplicacaoCodigo) {
		this.pmcAplicacaoCodigo = pmcAplicacaoCodigo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "ORDEM_EMISSAO", length = 4)
	@Length(max = 4)
	public String getOrdemEmissao() {
		return this.ordemEmissao;
	}

	public void setOrdemEmissao(String ordemEmissao) {
		this.ordemEmissao = ordemEmissao;
	}

	@Column(name = "IND_PERMANENTE", length = 1)
	@Length(max = 1)
	public String getIndPermanente() {
		return this.indPermanente;
	}

	public void setIndPermanente(String indPermanente) {
		this.indPermanente = indPermanente;
	}

	@Column(name = "NRO_COPIAS")
	public Short getNroCopias() {
		return this.nroCopias;
	}

	public void setNroCopias(Short nroCopias) {
		this.nroCopias = nroCopias;
	}

	@Column(name = "SESSION_ID", precision = 17, scale = 17)
	public Double getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(Double sessionId) {
		this.sessionId = sessionId;
	}

	@Column(name = "IND_CONF_CCI", length = 1)
	@Length(max = 1)
	public String getIndConfCci() {
		return this.indConfCci;
	}

	public void setIndConfCci(String indConfCci) {
		this.indConfCci = indConfCci;
	}

	@Column(name = "IND_TIPO_PACIENTE", length = 1)
	@Length(max = 1)
	public String getIndTipoPaciente() {
		return this.indTipoPaciente;
	}

	public void setIndTipoPaciente(String indTipoPaciente) {
		this.indTipoPaciente = indTipoPaciente;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PERIODO_INICIAL", length = 29)
	public Date getPeriodoInicial() {
		return this.periodoInicial;
	}

	public void setPeriodoInicial(Date periodoInicial) {
		this.periodoInicial = periodoInicial;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PERIODO_FINAL", length = 29)
	public Date getPeriodoFinal() {
		return this.periodoFinal;
	}

	public void setPeriodoFinal(Date periodoFinal) {
		this.periodoFinal = periodoFinal;
	}

	@Column(name = "IND_SIT_ATENDIMENTO", length = 1)
	@Length(max = 1)
	public String getIndSitAtendimento() {
		return this.indSitAtendimento;
	}

	public void setIndSitAtendimento(String indSitAtendimento) {
		this.indSitAtendimento = indSitAtendimento;
	}

	@Column(name = "IND_GRUPO_CONVENIO", length = 1)
	@Length(max = 1)
	public String getIndGrupoConvenio() {
		return this.indGrupoConvenio;
	}

	public void setIndGrupoConvenio(String indGrupoConvenio) {
		this.indGrupoConvenio = indGrupoConvenio;
	}

	@Column(name = "TIPO_NOTIFICACAO", length = 1)
	@Length(max = 1)
	public String getTipoNotificacao() {
		return this.tipoNotificacao;
	}

	public void setTipoNotificacao(String tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
	}

	@Column(name = "UNF_SEQ")
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "PAC_CODIGO")
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "IND_TODA_ETIOLOGIA", length = 1)
	@Length(max = 1)
	public String getIndTodaEtiologia() {
		return this.indTodaEtiologia;
	}

	public void setIndTodaEtiologia(String indTodaEtiologia) {
		this.indTodaEtiologia = indTodaEtiologia;
	}

	@Column(name = "IND_TODO_GRUPO_ETIOLOGIA", length = 1)
	@Length(max = 1)
	public String getIndTodoGrupoEtiologia() {
		return this.indTodoGrupoEtiologia;
	}

	public void setIndTodoGrupoEtiologia(String indTodoGrupoEtiologia) {
		this.indTodoGrupoEtiologia = indTodoGrupoEtiologia;
	}

	@Column(name = "IND_TODO_PROCED_RISCO", length = 1)
	@Length(max = 1)
	public String getIndTodoProcedRisco() {
		return this.indTodoProcedRisco;
	}

	public void setIndTodoProcedRisco(String indTodoProcedRisco) {
		this.indTodoProcedRisco = indTodoProcedRisco;
	}

	@Column(name = "IND_TODO_PROCED_CIRURGICO", length = 1)
	@Length(max = 1)
	public String getIndTodoProcedCirurgico() {
		return this.indTodoProcedCirurgico;
	}

	public void setIndTodoProcedCirurgico(String indTodoProcedCirurgico) {
		this.indTodoProcedCirurgico = indTodoProcedCirurgico;
	}

	@Column(name = "IND_TODO_AGRUP_UNIDADE", length = 1)
	@Length(max = 1)
	public String getIndTodoAgrupUnidade() {
		return this.indTodoAgrupUnidade;
	}

	public void setIndTodoAgrupUnidade(String indTodoAgrupUnidade) {
		this.indTodoAgrupUnidade = indTodoAgrupUnidade;
	}

	@Column(name = "IND_TODA_TOPOG_INFECCAO", length = 1)
	@Length(max = 1)
	public String getIndTodaTopogInfeccao() {
		return this.indTodaTopogInfeccao;
	}

	public void setIndTodaTopogInfeccao(String indTodaTopogInfeccao) {
		this.indTodaTopogInfeccao = indTodaTopogInfeccao;
	}

	@Column(name = "IND_TODA_TOPOG_PROCEDIMENTO", length = 1)
	@Length(max = 1)
	public String getIndTodaTopogProcedimento() {
		return this.indTodaTopogProcedimento;
	}

	public void setIndTodaTopogProcedimento(String indTodaTopogProcedimento) {
		this.indTodaTopogProcedimento = indTodaTopogProcedimento;
	}

	@Column(name = "NOME_PARAM_PERMANENTE", length = 60)
	@Length(max = 60)
	public String getNomeParamPermanente() {
		return this.nomeParamPermanente;
	}

	public void setNomeParamPermanente(String nomeParamPermanente) {
		this.nomeParamPermanente = nomeParamPermanente;
	}

	@Column(name = "PRU_SEQ")
	public Integer getPruSeq() {
		return this.pruSeq;
	}

	public void setPruSeq(Integer pruSeq) {
		this.pruSeq = pruSeq;
	}

	@Column(name = "IND_TODO_GRUPO_MAT_INFECTANTE", length = 1)
	@Length(max = 1)
	public String getIndTodoGrupoMatInfectante() {
		return this.indTodoGrupoMatInfectante;
	}

	public void setIndTodoGrupoMatInfectante(String indTodoGrupoMatInfectante) {
		this.indTodoGrupoMatInfectante = indTodoGrupoMatInfectante;
	}

	@Column(name = "IND_TODO_FATOR_PREDISPONENTE", length = 1)
	@Length(max = 1)
	public String getIndTodoFatorPredisponente() {
		return this.indTodoFatorPredisponente;
	}

	public void setIndTodoFatorPredisponente(String indTodoFatorPredisponente) {
		this.indTodoFatorPredisponente = indTodoFatorPredisponente;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		SEQ("seq"),
		PMC_APLICACAO_CODIGO("pmcAplicacaoCodigo"),
		CRIADO_EM("criadoEm"),
		ORDEM_EMISSAO("ordemEmissao"),
		IND_PERMANENTE("indPermanente"),
		NRO_COPIAS("nroCopias"),
		SESSION_ID("sessionId"),
		IND_CONF_CCI("indConfCci"),
		IND_TIPO_PACIENTE("indTipoPaciente"),
		PERIODO_INICIAL("periodoInicial"),
		PERIODO_FINAL("periodoFinal"),
		IND_SIT_ATENDIMENTO("indSitAtendimento"),
		IND_GRUPO_CONVENIO("indGrupoConvenio"),
		TIPO_NOTIFICACAO("tipoNotificacao"),
		UNF_SEQ("unfSeq"),
		PAC_CODIGO("pacCodigo"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		IND_TODA_ETIOLOGIA("indTodaEtiologia"),
		IND_TODO_GRUPO_ETIOLOGIA("indTodoGrupoEtiologia"),
		IND_TODO_PROCED_RISCO("indTodoProcedRisco"),
		IND_TODO_PROCED_CIRURGICO("indTodoProcedCirurgico"),
		IND_TODO_AGRUP_UNIDADE("indTodoAgrupUnidade"),
		IND_TODA_TOPOG_INFECCAO("indTodaTopogInfeccao"),
		IND_TODA_TOPOG_PROCEDIMENTO("indTodaTopogProcedimento"),
		NOME_PARAM_PERMANENTE("nomeParamPermanente"),
		PRU_SEQ("pruSeq"),
		IND_TODO_GRUPO_MAT_INFECTANTE("indTodoGrupoMatInfectante"),
		IND_TODO_FATOR_PREDISPONENTE("indTodoFatorPredisponente");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

}
