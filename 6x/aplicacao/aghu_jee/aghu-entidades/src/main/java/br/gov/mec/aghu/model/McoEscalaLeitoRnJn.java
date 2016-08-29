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
 * McoEscalaLeitoRnJn generated by hbm2java
 */
@Entity
@Table(name = "MCO_ESCALA_LEITO_RNS_JN", schema = "AGH")
@Immutable
public class McoEscalaLeitoRnJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -2965859921110644469L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private String ltoLtoId;
	private Integer serMatriculaResp;
	private Short serVinCodigoResp;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Date criadoEm;

	public McoEscalaLeitoRnJn() {
	}

	public McoEscalaLeitoRnJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, String ltoLtoId, Integer serMatriculaResp,
			Short serVinCodigoResp) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.ltoLtoId = ltoLtoId;
		this.serMatriculaResp = serMatriculaResp;
		this.serVinCodigoResp = serVinCodigoResp;
	}

	public McoEscalaLeitoRnJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, String ltoLtoId, Integer serMatriculaResp,
			Short serVinCodigoResp, Integer serMatricula, Short serVinCodigo, Date criadoEm) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.ltoLtoId = ltoLtoId;
		this.serMatriculaResp = serMatriculaResp;
		this.serVinCodigoResp = serVinCodigoResp;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.criadoEm = criadoEm;
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

	@Column(name = "LTO_LTO_ID", nullable = false, length = 14)
	@Length(max = 14)
	public String getLtoLtoId() {
		return this.ltoLtoId;
	}

	public void setLtoLtoId(String ltoLtoId) {
		this.ltoLtoId = ltoLtoId;
	}

	@Column(name = "SER_MATRICULA_RESP", nullable = false)
	public Integer getSerMatriculaResp() {
		return this.serMatriculaResp;
	}

	public void setSerMatriculaResp(Integer serMatriculaResp) {
		this.serMatriculaResp = serMatriculaResp;
	}

	@Column(name = "SER_VIN_CODIGO_RESP", nullable = false)
	public Short getSerVinCodigoResp() {
		return this.serVinCodigoResp;
	}

	public void setSerVinCodigoResp(Short serVinCodigoResp) {
		this.serVinCodigoResp = serVinCodigoResp;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		LTO_LTO_ID("ltoLtoId"),
		SER_MATRICULA_RESP("serMatriculaResp"),
		SER_VIN_CODIGO_RESP("serVinCodigoResp"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		CRIADO_EM("criadoEm");

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
