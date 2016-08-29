package br.gov.mec.aghu.model;

// Generated 19/04/2011 14:13:26 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelSalasExecutorasExamesId generated by hbm2java
 */
@Embeddable
public class AelSalasExecutorasExamesId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6304861493906703762L;
	private Short unfSeq;
	private Short seqp;
	
	public AelSalasExecutorasExamesId(){
	}
	
	public AelSalasExecutorasExamesId(Short unfSeq, Short seqp){
		this.unfSeq = unfSeq;
		this.seqp = seqp;
	}

	@Column(name = "UNF_SEQ", nullable = false)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AelSalasExecutorasExamesId)) {
			return false;
		}
		AelSalasExecutorasExamesId castOther = (AelSalasExecutorasExamesId) other;

		return (this.getUnfSeq() == castOther.getUnfSeq())
				&& (this.getSeqp() == castOther.getSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUnfSeq();
		result = 37 * result + this.getSeqp();
		return result;
	}

}
