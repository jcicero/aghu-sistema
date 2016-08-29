package br.gov.mec.aghu.model;

// Generated 11/05/2011 14:05:35 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelItemSolicCartasId generated by hbm2java
 */
@Embeddable
public class AelItemSolicCartasId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3153603778153757662L;
	private Short iseSeqp;
	private Integer iseSoeSeq;
	private Short seqp;

	public AelItemSolicCartasId() {
	}

	public AelItemSolicCartasId(Short iseSeqp, Integer iseSoeSeq, Short seqp) {
		this.iseSeqp = iseSeqp;
		this.iseSoeSeq = iseSoeSeq;
		this.seqp = seqp;
	}

	@Column(name = "ISE_SEQP", nullable = false, precision = 3, scale = 0)
	public Short getIseSeqp() {
		return this.iseSeqp;
	}

	public void setIseSeqp(Short iseSeqp) {
		this.iseSeqp = iseSeqp;
	}

	@Column(name = "ISE_SOE_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getIseSoeSeq() {
		return this.iseSoeSeq;
	}

	public void setIseSoeSeq(Integer iseSoeSeq) {
		this.iseSoeSeq = iseSoeSeq;
	}

	@Column(name = "SEQP", nullable = false, precision = 3, scale = 0)
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
		if (!(other instanceof AelItemSolicCartasId)) {
			return false;
		}
		AelItemSolicCartasId castOther = (AelItemSolicCartasId) other;

		return (this.getIseSeqp() == castOther.getIseSeqp())
				&& (this.getIseSoeSeq() == castOther.getIseSoeSeq())
				&& (this.getSeqp() == castOther.getSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIseSeqp();
		result = 37 * result + this.getIseSoeSeq();
		result = 37 * result + this.getSeqp();
		return result;
	}

}
