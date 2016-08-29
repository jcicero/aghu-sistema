package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AfaInclusaoMdtoProducaoJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name="afaImpJnSeq", sequenceName="AGH.AFA_IMP_JN_SEQ", allocationSize = 1)
@Table(name = "AFA_INCLUSAO_MDTO_PRODUCOES_JN", schema = "AGH")
@Immutable
public class AfaInclusaoMdtoProducaoJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -8249266166871015854L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Short psoCmdSeq;
	private Short psoSeqp;
	private Integer medMatCodigo;
	private String tipoAtendimento;
	private Double dose;
	private Integer fdsSeq;
	private Date criadoEm;
	private String indQsp;
	private String indSituacao;
	private Integer serMatricula;
	private Short serVinCodigo;

	public AfaInclusaoMdtoProducaoJn() {
	}

	public AfaInclusaoMdtoProducaoJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Short psoCmdSeq, Short psoSeqp,
			Integer medMatCodigo) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.psoCmdSeq = psoCmdSeq;
		this.psoSeqp = psoSeqp;
		this.medMatCodigo = medMatCodigo;
	}

	public AfaInclusaoMdtoProducaoJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Short psoCmdSeq, Short psoSeqp,
			Integer medMatCodigo, String tipoAtendimento, Double dose, Integer fdsSeq, Date criadoEm, String indQsp, String indSituacao,
			Integer serMatricula, Short serVinCodigo) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.psoCmdSeq = psoCmdSeq;
		this.psoSeqp = psoSeqp;
		this.medMatCodigo = medMatCodigo;
		this.tipoAtendimento = tipoAtendimento;
		this.dose = dose;
		this.fdsSeq = fdsSeq;
		this.criadoEm = criadoEm;
		this.indQsp = indQsp;
		this.indSituacao = indSituacao;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "afaImpJnSeq")
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

	@Column(name = "PSO_CMD_SEQ", nullable = false)
	public Short getPsoCmdSeq() {
		return this.psoCmdSeq;
	}

	public void setPsoCmdSeq(Short psoCmdSeq) {
		this.psoCmdSeq = psoCmdSeq;
	}

	@Column(name = "PSO_SEQP", nullable = false)
	public Short getPsoSeqp() {
		return this.psoSeqp;
	}

	public void setPsoSeqp(Short psoSeqp) {
		this.psoSeqp = psoSeqp;
	}

	@Column(name = "MED_MAT_CODIGO", nullable = false)
	public Integer getMedMatCodigo() {
		return this.medMatCodigo;
	}

	public void setMedMatCodigo(Integer medMatCodigo) {
		this.medMatCodigo = medMatCodigo;
	}

	@Column(name = "TIPO_ATENDIMENTO", length = 1)
	@Length(max = 1)
	public String getTipoAtendimento() {
		return this.tipoAtendimento;
	}

	public void setTipoAtendimento(String tipoAtendimento) {
		this.tipoAtendimento = tipoAtendimento;
	}

	@Column(name = "DOSE", precision = 17, scale = 17)
	public Double getDose() {
		return this.dose;
	}

	public void setDose(Double dose) {
		this.dose = dose;
	}

	@Column(name = "FDS_SEQ")
	public Integer getFdsSeq() {
		return this.fdsSeq;
	}

	public void setFdsSeq(Integer fdsSeq) {
		this.fdsSeq = fdsSeq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_QSP", length = 1)
	@Length(max = 1)
	public String getIndQsp() {
		return this.indQsp;
	}

	public void setIndQsp(String indQsp) {
		this.indQsp = indQsp;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
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

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		PSO_CMD_SEQ("psoCmdSeq"),
		PSO_SEQP("psoSeqp"),
		MED_MAT_CODIGO("medMatCodigo"),
		TIPO_ATENDIMENTO("tipoAtendimento"),
		DOSE("dose"),
		FDS_SEQ("fdsSeq"),
		CRIADO_EM("criadoEm"),
		IND_QSP("indQsp"),
		IND_SITUACAO("indSituacao"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo");

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