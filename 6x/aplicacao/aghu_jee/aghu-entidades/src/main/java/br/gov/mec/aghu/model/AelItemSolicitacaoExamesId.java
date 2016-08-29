package br.gov.mec.aghu.model;

// Generated 15/12/2009 10:14:00 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelItemSolicitacaoExamesId generated by hbm2java
 */
@Embeddable
public class AelItemSolicitacaoExamesId implements EntityCompositeId, IAelItemSolicitacaoExamesId{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6184927925997153943L;
	private Integer soeSeq;
	private Short seqp;

	public AelItemSolicitacaoExamesId() {
	}

	public AelItemSolicitacaoExamesId(Integer soeSeq, Short seqp) {
		this.soeSeq = soeSeq;
		this.seqp = seqp;
	}

	@Column(name = "SOE_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getSoeSeq() {
		return this.soeSeq;
	}

	public void setSoeSeq(Integer soeSeq) {
		this.soeSeq = soeSeq;
	}

	@Column(name = "SEQP", nullable = false, precision = 3, scale = 0)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}
	
	/*
	@Override
	public int compareTo(Object obj) {
		Integer returnValue;
		
		if (obj == null) {
			returnValue = 1;
		} else if (!(obj instanceof AelItemSolicitacaoExamesId)) {
			returnValue = 1;
		} else {
			AelItemSolicitacaoExamesId other = (AelItemSolicitacaoExamesId) obj;
			returnValue = this.getCompareToValue() - other.getCompareToValue();
		}
		
		return returnValue;
	}
	
	private Integer getCompareToValue() {
		Integer count = 0;
		if (this.getSoeSeq() != null) {
			count = count + this.getSoeSeq();
		}
		if (this.getSeqp() != null) {
			count = count + this.getSeqp();
		}
		return count;
	}
	*/
	
	
	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AelItemSolicitacaoExamesId)) {
			return false;
		}
		AelItemSolicitacaoExamesId castOther = (AelItemSolicitacaoExamesId) other;

		return ( this.getSoeSeq() != null && this.getSoeSeq().equals(castOther.getSoeSeq()))
				&& (this.getSeqp() != null && this.getSeqp().equals(castOther.getSeqp())  );
	}
	
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + ((this.getSoeSeq() != null) ? this.getSoeSeq() : 0);
		result = 37 * result + ((this.getSeqp() != null) ? this.getSeqp() : 0);
		
		return result;
	}
	

}
