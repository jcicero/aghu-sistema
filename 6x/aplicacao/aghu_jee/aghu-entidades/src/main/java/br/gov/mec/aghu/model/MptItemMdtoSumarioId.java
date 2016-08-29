package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MptItemMdtoSumarioId generated by hbm2java
 */
@Embeddable
public class MptItemMdtoSumarioId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6365987521310059954L;
	private Integer itqSeq;
	private Integer seqp;

	public MptItemMdtoSumarioId() {
	}

	public MptItemMdtoSumarioId(Integer itqSeq, Integer seqp) {
		this.itqSeq = itqSeq;
		this.seqp = seqp;
	}

	@Column(name = "ITQ_SEQ", nullable = false)
	public Integer getItqSeq() {
		return this.itqSeq;
	}

	public void setItqSeq(Integer itqSeq) {
		this.itqSeq = itqSeq;
	}

	@Column(name = "SEQP", nullable = false)
	public Integer getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Integer seqp) {
		this.seqp = seqp;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeqp());
		umHashCodeBuilder.append(this.getItqSeq());
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
		if (!(obj instanceof MptItemMdtoSumarioId)) {
			return false;
		}
		MptItemMdtoSumarioId other = (MptItemMdtoSumarioId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getItqSeq(), other.getItqSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
