package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MamQuestaoId generated by hbm2java
 */
@Embeddable
public class MamQuestaoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4786765324674912368L;
	private Integer qutSeq;
	private Short seqp;

	public MamQuestaoId() {
	}

	public MamQuestaoId(Integer qutSeq, Short seqp) {
		this.qutSeq = qutSeq;
		this.seqp = seqp;
	}

	@Column(name = "QUT_SEQ", nullable = false)
	public Integer getQutSeq() {
		return this.qutSeq;
	}

	public void setQutSeq(Integer qutSeq) {
		this.qutSeq = qutSeq;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeqp());
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
		if (!(obj instanceof MamQuestaoId)) {
			return false;
		}
		MamQuestaoId other = (MamQuestaoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getQutSeq(), other.getQutSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
