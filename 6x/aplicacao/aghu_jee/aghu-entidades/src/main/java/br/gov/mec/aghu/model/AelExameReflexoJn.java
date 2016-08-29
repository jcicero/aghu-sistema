package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelExameReflexoJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelErxJnSeq", sequenceName="AGH.AEL_ERX_JN_SEQ", allocationSize = 1)
@Table(name = "AEL_EXAME_REFLEXOS_JN", schema = "AGH")
@Immutable
public class AelExameReflexoJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -330066626640174894L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	//private Integer seqJn;
	private String emaExaSigla;
	private Integer emaManSeq;
	private Short seqp;
	private String emaExaSiglaReflexo;
	private Integer emaManSeqReflexo;
	private Integer calSeq;
	private Long resulNumIni;
	private Long resulNumFim;
	private String resulAlfa;
	private Integer rcdGtcSeq;
	private Integer rcdSeqp;
	private Integer serMatricula;
	private Short serVinCodigo;
	private DominioSituacao situacao;
	private String indNovaAmostra;
	private Date criadoEm;
	private Short idadeLimite;

	public AelExameReflexoJn() {
	}

	public AelExameReflexoJn(String jnUser, Date jnDateTime, String jnOperation, String emaExaSigla, Integer emaManSeq, Short seqp) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		super();
		//this.seqJn = seqJn;
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
		this.seqp = seqp;
	}

	public AelExameReflexoJn(String jnUser, Date jnDateTime, String jnOperation, String emaExaSigla, Integer emaManSeq,
			Short seqp, String emaExaSiglaReflexo, Integer emaManSeqReflexo, Integer calSeq, Long resulNumIni, Long resulNumFim,
			String resulAlfa, Integer rcdGtcSeq, Integer rcdSeqp, Integer serMatricula, Short serVinCodigo, DominioSituacao indSituacao,
			String indNovaAmostra, Date criadoEm, Short idadeLimite) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		//this.seqJn = seqJn;
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
		this.seqp = seqp;
		this.emaExaSiglaReflexo = emaExaSiglaReflexo;
		this.emaManSeqReflexo = emaManSeqReflexo;
		this.calSeq = calSeq;
		this.resulNumIni = resulNumIni;
		this.resulNumFim = resulNumFim;
		this.resulAlfa = resulAlfa;
		this.rcdGtcSeq = rcdGtcSeq;
		this.rcdSeqp = rcdSeqp;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.situacao = indSituacao;
		this.indNovaAmostra = indNovaAmostra;
		this.criadoEm = criadoEm;
		this.idadeLimite = idadeLimite;
	}

	@Override
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelErxJnSeq")
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	public Integer getSeqJn() {
		return super.getSeqJn();
	}


	@Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getEmaExaSigla() {
		return this.emaExaSigla;
	}

	public void setEmaExaSigla(String emaExaSigla) {
		this.emaExaSigla = emaExaSigla;
	}

	@Column(name = "EMA_MAN_SEQ")
	public Integer getEmaManSeq() {
		return this.emaManSeq;
	}

	public void setEmaManSeq(Integer emaManSeq) {
		this.emaManSeq = emaManSeq;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Column(name = "EMA_EXA_SIGLA_REFLEXO", length = 5)
	@Length(max = 5)
	public String getEmaExaSiglaReflexo() {
		return this.emaExaSiglaReflexo;
	}

	public void setEmaExaSiglaReflexo(String emaExaSiglaReflexo) {
		this.emaExaSiglaReflexo = emaExaSiglaReflexo;
	}

	@Column(name = "EMA_MAN_SEQ_REFLEXO")
	public Integer getEmaManSeqReflexo() {
		return this.emaManSeqReflexo;
	}

	public void setEmaManSeqReflexo(Integer emaManSeqReflexo) {
		this.emaManSeqReflexo = emaManSeqReflexo;
	}

	@Column(name = "CAL_SEQ")
	public Integer getCalSeq() {
		return this.calSeq;
	}

	public void setCalSeq(Integer calSeq) {
		this.calSeq = calSeq;
	}

	@Column(name = "RESUL_NUM_INI")
	public Long getResulNumIni() {
		return this.resulNumIni;
	}

	public void setResulNumIni(Long resulNumIni) {
		this.resulNumIni = resulNumIni;
	}

	@Column(name = "RESUL_NUM_FIM")
	public Long getResulNumFim() {
		return this.resulNumFim;
	}

	public void setResulNumFim(Long resulNumFim) {
		this.resulNumFim = resulNumFim;
	}

	@Column(name = "RESUL_ALFA", length = 20)
	@Length(max = 20)
	public String getResulAlfa() {
		return this.resulAlfa;
	}

	public void setResulAlfa(String resulAlfa) {
		this.resulAlfa = resulAlfa;
	}

	@Column(name = "RCD_GTC_SEQ")
	public Integer getRcdGtcSeq() {
		return this.rcdGtcSeq;
	}

	public void setRcdGtcSeq(Integer rcdGtcSeq) {
		this.rcdGtcSeq = rcdGtcSeq;
	}

	@Column(name = "RCD_SEQP")
	public Integer getRcdSeqp() {
		return this.rcdSeqp;
	}

	public void setRcdSeqp(Integer rcdSeqp) {
		this.rcdSeqp = rcdSeqp;
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

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(final DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@Column(name = "IND_NOVA_AMOSTRA", length = 1)
	@Length(max = 1)
	public String getIndNovaAmostra() {
		return this.indNovaAmostra;
	}

	public void setIndNovaAmostra(String indNovaAmostra) {
		this.indNovaAmostra = indNovaAmostra;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IDADE_LIMITE")
	public Short getIdadeLimite() {
		return this.idadeLimite;
	}

	public void setIdadeLimite(Short idadeLimite) {
		this.idadeLimite = idadeLimite;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		EMA_EXA_SIGLA("emaExaSigla"),
		EMA_MAN_SEQ("emaManSeq"),
		SEQP("seqp"),
		EMA_EXA_SIGLA_REFLEXO("emaExaSiglaReflexo"),
		EMA_MAN_SEQ_REFLEXO("emaManSeqReflexo"),
		CAL_SEQ("calSeq"),
		RESUL_NUM_INI("resulNumIni"),
		RESUL_NUM_FIM("resulNumFim"),
		RESUL_ALFA("resulAlfa"),
		RCD_GTC_SEQ("rcdGtcSeq"),
		RCD_SEQP("rcdSeqp"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		IND_SITUACAO("situacao"),
		IND_NOVA_AMOSTRA("indNovaAmostra"),
		CRIADO_EM("criadoEm"),
		IDADE_LIMITE("idadeLimite");

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
