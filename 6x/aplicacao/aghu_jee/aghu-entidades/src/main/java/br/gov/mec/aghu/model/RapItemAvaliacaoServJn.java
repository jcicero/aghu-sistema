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
 * RapItemAvaliacaoServJn generated by hbm2java
 */
@Entity
@Table(name = "RAP_ITENS_AVALIACAO_SERV_JN", schema = "AGH")
@Immutable
public class RapItemAvaliacaoServJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -5545517285540377322L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer avsSeq;
	private Integer seqp;
	private String indAutoavaliacao;
	private String indConsenso;
	private String cptTcmCodigo;
	private Integer cptComSeq;
	private String cncTcmCodigo;
	private String cncConceito;
	private String cncTcmCodigoAa;
	private String cncConceitoAa;
	private String cncTcmCodigoCons;
	private String cncConceitoCons;
	private Date criadoEm;
	private Integer serMatriculaCriado;
	private Short serVinCodigoCriado;
	private Date alteradoEm;
	private Integer serMatriculaAlterado;
	private Short serVinCodigoAlterado;

	public RapItemAvaliacaoServJn() {
	}

	public RapItemAvaliacaoServJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer avsSeq, Integer seqp) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.avsSeq = avsSeq;
		this.seqp = seqp;
	}

	public RapItemAvaliacaoServJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer avsSeq, Integer seqp,
			String indAutoavaliacao, String indConsenso, String cptTcmCodigo, Integer cptComSeq, String cncTcmCodigo,
			String cncConceito, String cncTcmCodigoAa, String cncConceitoAa, String cncTcmCodigoCons, String cncConceitoCons,
			Date criadoEm, Integer serMatriculaCriado, Short serVinCodigoCriado, Date alteradoEm, Integer serMatriculaAlterado,
			Short serVinCodigoAlterado) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.avsSeq = avsSeq;
		this.seqp = seqp;
		this.indAutoavaliacao = indAutoavaliacao;
		this.indConsenso = indConsenso;
		this.cptTcmCodigo = cptTcmCodigo;
		this.cptComSeq = cptComSeq;
		this.cncTcmCodigo = cncTcmCodigo;
		this.cncConceito = cncConceito;
		this.cncTcmCodigoAa = cncTcmCodigoAa;
		this.cncConceitoAa = cncConceitoAa;
		this.cncTcmCodigoCons = cncTcmCodigoCons;
		this.cncConceitoCons = cncConceitoCons;
		this.criadoEm = criadoEm;
		this.serMatriculaCriado = serMatriculaCriado;
		this.serVinCodigoCriado = serVinCodigoCriado;
		this.alteradoEm = alteradoEm;
		this.serMatriculaAlterado = serMatriculaAlterado;
		this.serVinCodigoAlterado = serVinCodigoAlterado;
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

	@Column(name = "AVS_SEQ", nullable = false)
	public Integer getAvsSeq() {
		return this.avsSeq;
	}

	public void setAvsSeq(Integer avsSeq) {
		this.avsSeq = avsSeq;
	}

	@Column(name = "SEQP", nullable = false)
	public Integer getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Integer seqp) {
		this.seqp = seqp;
	}

	@Column(name = "IND_AUTOAVALIACAO", length = 1)
	@Length(max = 1)
	public String getIndAutoavaliacao() {
		return this.indAutoavaliacao;
	}

	public void setIndAutoavaliacao(String indAutoavaliacao) {
		this.indAutoavaliacao = indAutoavaliacao;
	}

	@Column(name = "IND_CONSENSO", length = 1)
	@Length(max = 1)
	public String getIndConsenso() {
		return this.indConsenso;
	}

	public void setIndConsenso(String indConsenso) {
		this.indConsenso = indConsenso;
	}

	@Column(name = "CPT_TCM_CODIGO", length = 2)
	@Length(max = 2)
	public String getCptTcmCodigo() {
		return this.cptTcmCodigo;
	}

	public void setCptTcmCodigo(String cptTcmCodigo) {
		this.cptTcmCodigo = cptTcmCodigo;
	}

	@Column(name = "CPT_COM_SEQ")
	public Integer getCptComSeq() {
		return this.cptComSeq;
	}

	public void setCptComSeq(Integer cptComSeq) {
		this.cptComSeq = cptComSeq;
	}

	@Column(name = "CNC_TCM_CODIGO", length = 2)
	@Length(max = 2)
	public String getCncTcmCodigo() {
		return this.cncTcmCodigo;
	}

	public void setCncTcmCodigo(String cncTcmCodigo) {
		this.cncTcmCodigo = cncTcmCodigo;
	}

	@Column(name = "CNC_CONCEITO", length = 1)
	@Length(max = 1)
	public String getCncConceito() {
		return this.cncConceito;
	}

	public void setCncConceito(String cncConceito) {
		this.cncConceito = cncConceito;
	}

	@Column(name = "CNC_TCM_CODIGO_AA", length = 2)
	@Length(max = 2)
	public String getCncTcmCodigoAa() {
		return this.cncTcmCodigoAa;
	}

	public void setCncTcmCodigoAa(String cncTcmCodigoAa) {
		this.cncTcmCodigoAa = cncTcmCodigoAa;
	}

	@Column(name = "CNC_CONCEITO_AA", length = 1)
	@Length(max = 1)
	public String getCncConceitoAa() {
		return this.cncConceitoAa;
	}

	public void setCncConceitoAa(String cncConceitoAa) {
		this.cncConceitoAa = cncConceitoAa;
	}

	@Column(name = "CNC_TCM_CODIGO_CONS", length = 2)
	@Length(max = 2)
	public String getCncTcmCodigoCons() {
		return this.cncTcmCodigoCons;
	}

	public void setCncTcmCodigoCons(String cncTcmCodigoCons) {
		this.cncTcmCodigoCons = cncTcmCodigoCons;
	}

	@Column(name = "CNC_CONCEITO_CONS", length = 1)
	@Length(max = 1)
	public String getCncConceitoCons() {
		return this.cncConceitoCons;
	}

	public void setCncConceitoCons(String cncConceitoCons) {
		this.cncConceitoCons = cncConceitoCons;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SER_MATRICULA_CRIADO")
	public Integer getSerMatriculaCriado() {
		return this.serMatriculaCriado;
	}

	public void setSerMatriculaCriado(Integer serMatriculaCriado) {
		this.serMatriculaCriado = serMatriculaCriado;
	}

	@Column(name = "SER_VIN_CODIGO_CRIADO")
	public Short getSerVinCodigoCriado() {
		return this.serVinCodigoCriado;
	}

	public void setSerVinCodigoCriado(Short serVinCodigoCriado) {
		this.serVinCodigoCriado = serVinCodigoCriado;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "SER_MATRICULA_ALTERADO")
	public Integer getSerMatriculaAlterado() {
		return this.serMatriculaAlterado;
	}

	public void setSerMatriculaAlterado(Integer serMatriculaAlterado) {
		this.serMatriculaAlterado = serMatriculaAlterado;
	}

	@Column(name = "SER_VIN_CODIGO_ALTERADO")
	public Short getSerVinCodigoAlterado() {
		return this.serVinCodigoAlterado;
	}

	public void setSerVinCodigoAlterado(Short serVinCodigoAlterado) {
		this.serVinCodigoAlterado = serVinCodigoAlterado;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		AVS_SEQ("avsSeq"),
		SEQP("seqp"),
		IND_AUTOAVALIACAO("indAutoavaliacao"),
		IND_CONSENSO("indConsenso"),
		CPT_TCM_CODIGO("cptTcmCodigo"),
		CPT_COM_SEQ("cptComSeq"),
		CNC_TCM_CODIGO("cncTcmCodigo"),
		CNC_CONCEITO("cncConceito"),
		CNC_TCM_CODIGO_AA("cncTcmCodigoAa"),
		CNC_CONCEITO_AA("cncConceitoAa"),
		CNC_TCM_CODIGO_CONS("cncTcmCodigoCons"),
		CNC_CONCEITO_CONS("cncConceitoCons"),
		CRIADO_EM("criadoEm"),
		SER_MATRICULA_CRIADO("serMatriculaCriado"),
		SER_VIN_CODIGO_CRIADO("serVinCodigoCriado"),
		ALTERADO_EM("alteradoEm"),
		SER_MATRICULA_ALTERADO("serMatriculaAlterado"),
		SER_VIN_CODIGO_ALTERADO("serVinCodigoAlterado");

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
