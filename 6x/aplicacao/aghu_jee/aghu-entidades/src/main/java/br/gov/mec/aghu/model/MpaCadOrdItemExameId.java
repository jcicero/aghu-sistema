package br.gov.mec.aghu.model;

// Generated 10/03/2011 17:20:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpaCadOrdItemExamesId generated by hbm2java
 */
@Embeddable
public class MpaCadOrdItemExameId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3386899049536096521L;
	private Integer coxSeq;
	private Integer seqp;


	@Column(name = "COX_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getCoxSeq() {
		return this.coxSeq;
	}

	public void setCoxSeq(Integer coxSeq) {
		this.coxSeq = coxSeq;
	}

	@Column(name = "SEQP", nullable = false, precision = 8, scale = 0)
	public Integer getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Integer seqp) {
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
		if (!(other instanceof MpaCadOrdItemExameId)) {
			return false;
		}
		MpaCadOrdItemExameId castOther = (MpaCadOrdItemExameId) other;

		return (this.getCoxSeq() == castOther.getCoxSeq())
				&& (this.getSeqp() == castOther.getSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCoxSeq();
		result = 37 * result + this.getSeqp();
		return result;
	}

}
