package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MamUnidQuestionarioId generated by hbm2java
 */
@Embeddable
public class MamUnidQuestionarioId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4978617078481039955L;
	private Short unfSeq;
	private Integer qutSeq;

	public MamUnidQuestionarioId() {
	}

	public MamUnidQuestionarioId(Short unfSeq, Integer qutSeq) {
		this.unfSeq = unfSeq;
		this.qutSeq = qutSeq;
	}

	@Column(name = "UNF_SEQ", nullable = false)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "QUT_SEQ", nullable = false)
	public Integer getQutSeq() {
		return this.qutSeq;
	}

	public void setQutSeq(Integer qutSeq) {
		this.qutSeq = qutSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getUnfSeq());
		umHashCodeBuilder.append(this.getQutSeq());
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
		if (!(obj instanceof MamUnidQuestionarioId)) {
			return false;
		}
		MamUnidQuestionarioId other = (MamUnidQuestionarioId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getUnfSeq(), other.getUnfSeq());
		umEqualsBuilder.append(this.getQutSeq(), other.getQutSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
