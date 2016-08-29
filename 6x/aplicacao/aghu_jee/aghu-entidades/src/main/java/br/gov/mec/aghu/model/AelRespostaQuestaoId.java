package br.gov.mec.aghu.model;

// Generated 03/11/2010 18:32:12 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelRespostaQuestaoId generated by hbm2java
 */
@Embeddable
public class AelRespostaQuestaoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 636243775290074044L;
	private Integer iseSoeSeq;
	private Short iseSeqp;
	private String eqeEmaExaSigla;
	private Integer eqeEmaManSeq;
	private Integer eqeQtnSeq;
	private Integer qquQaoSeq;
	private Integer qquQtnSeq;

	public AelRespostaQuestaoId() {
	}

	public AelRespostaQuestaoId(Integer iseSoeSeq, Short iseSeqp,
			String eqeEmaExaSigla, Integer eqeEmaManSeq, Integer eqeQtnSeq,
			Integer qquQaoSeq, Integer qquQtnSeq) {
		this.iseSoeSeq = iseSoeSeq;
		this.iseSeqp = iseSeqp;
		this.eqeEmaExaSigla = eqeEmaExaSigla;
		this.eqeEmaManSeq = eqeEmaManSeq;
		this.eqeQtnSeq = eqeQtnSeq;
		this.qquQaoSeq = qquQaoSeq;
		this.qquQtnSeq = qquQtnSeq;
	}

	@Column(name = "ISE_SOE_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getIseSoeSeq() {
		return this.iseSoeSeq;
	}

	public void setIseSoeSeq(Integer iseSoeSeq) {
		this.iseSoeSeq = iseSoeSeq;
	}

	@Column(name = "ISE_SEQP", nullable = false, precision = 3, scale = 0)
	public Short getIseSeqp() {
		return this.iseSeqp;
	}

	public void setIseSeqp(Short iseSeqp) {
		this.iseSeqp = iseSeqp;
	}

	@Column(name = "EQE_EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getEqeEmaExaSigla() {
		return this.eqeEmaExaSigla;
	}

	public void setEqeEmaExaSigla(String eqeEmaExaSigla) {
		this.eqeEmaExaSigla = eqeEmaExaSigla;
	}

	@Column(name = "EQE_EMA_MAN_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getEqeEmaManSeq() {
		return this.eqeEmaManSeq;
	}

	public void setEqeEmaManSeq(Integer eqeEmaManSeq) {
		this.eqeEmaManSeq = eqeEmaManSeq;
	}

	@Column(name = "EQE_QTN_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getEqeQtnSeq() {
		return this.eqeQtnSeq;
	}

	public void setEqeQtnSeq(Integer eqeQtnSeq) {
		this.eqeQtnSeq = eqeQtnSeq;
	}

	@Column(name = "QQU_QAO_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getQquQaoSeq() {
		return this.qquQaoSeq;
	}

	public void setQquQaoSeq(Integer qquQaoSeq) {
		this.qquQaoSeq = qquQaoSeq;
	}

	@Column(name = "QQU_QTN_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getQquQtnSeq() {
		return this.qquQtnSeq;
	}

	public void setQquQtnSeq(Integer qquQtnSeq) {
		this.qquQtnSeq = qquQtnSeq;
	}
	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getEqeQtnSeq());
		umHashCodeBuilder.append(this.getEqeEmaExaSigla());
		umHashCodeBuilder.append(this.getEqeEmaManSeq());
		umHashCodeBuilder.append(this.getQquQaoSeq());
		umHashCodeBuilder.append(this.getQquQtnSeq());
		umHashCodeBuilder.append(this.getIseSoeSeq());
		umHashCodeBuilder.append(this.getIseSeqp());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AelRespostaQuestaoId)) {
			return false;
		}
		AelRespostaQuestaoId other = (AelRespostaQuestaoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getEqeQtnSeq(), other.getEqeQtnSeq());
		umEqualsBuilder.append(this.getEqeEmaExaSigla(), other.getEqeEmaExaSigla());
		umEqualsBuilder.append(this.getEqeEmaManSeq(), other.getEqeEmaManSeq());
		umEqualsBuilder.append(this.getQquQaoSeq(), other.getQquQaoSeq());
		umEqualsBuilder.append(this.getQquQtnSeq(), other.getQquQtnSeq());
		umEqualsBuilder.append(this.getIseSoeSeq(), other.getIseSoeSeq());
		umEqualsBuilder.append(this.getIseSeqp(), other.getIseSeqp());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}