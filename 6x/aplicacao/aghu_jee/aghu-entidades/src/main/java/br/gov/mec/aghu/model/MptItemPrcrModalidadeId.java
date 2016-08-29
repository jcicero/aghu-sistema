package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MptItemPrcrModalidadeId generated by hbm2java
 */
@Embeddable
public class MptItemPrcrModalidadeId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3348440579826069569L;
	private Integer pteAtdSeq;
	private Integer pteSeq;
	private Integer seqp;

	public MptItemPrcrModalidadeId() {
	}

	public MptItemPrcrModalidadeId(Integer pteAtdSeq, Integer pteSeq, Integer seqp) {
		this.pteAtdSeq = pteAtdSeq;
		this.pteSeq = pteSeq;
		this.seqp = seqp;
	}

	@Column(name = "PTE_ATD_SEQ", nullable = false)
	public Integer getPteAtdSeq() {
		return this.pteAtdSeq;
	}

	public void setPteAtdSeq(Integer pteAtdSeq) {
		this.pteAtdSeq = pteAtdSeq;
	}

	@Column(name = "PTE_SEQ", nullable = false)
	public Integer getPteSeq() {
		return this.pteSeq;
	}

	public void setPteSeq(Integer pteSeq) {
		this.pteSeq = pteSeq;
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
		umHashCodeBuilder.append(this.getPteAtdSeq());
		umHashCodeBuilder.append(this.getPteSeq());
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
		if (!(obj instanceof MptItemPrcrModalidadeId)) {
			return false;
		}
		MptItemPrcrModalidadeId other = (MptItemPrcrModalidadeId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getPteAtdSeq(), other.getPteAtdSeq());
		umEqualsBuilder.append(this.getPteSeq(), other.getPteSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
