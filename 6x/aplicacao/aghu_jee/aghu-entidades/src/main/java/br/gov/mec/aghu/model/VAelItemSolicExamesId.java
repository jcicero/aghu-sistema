package br.gov.mec.aghu.model;


// Generated 12/11/2012 10:17:01 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * VAelItemSolicExamesId generated by hbm2java
 */
@Embeddable
public class VAelItemSolicExamesId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6657735429521143036L;
	private Integer soeSeq;
	private Short seqp;
	
	public VAelItemSolicExamesId() {
	}

	public VAelItemSolicExamesId(Integer soeSeq, Short seqp) {
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getSeqp() == null) ? 0 : getSeqp().hashCode());
		result = prime * result + ((getSoeSeq() == null) ? 0 : getSoeSeq().hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof VAelItemSolicExamesId)) {
			return false;
		}
		VAelItemSolicExamesId other = (VAelItemSolicExamesId) obj;
		if (getSeqp() == null) {
			if (other.getSeqp() != null) {
				return false;
			}
		} else if (!getSeqp().equals(other.getSeqp())) {
			return false;
		}
		if (getSoeSeq() == null) {
			if (other.getSoeSeq() != null) {
				return false;
			}
		} else if (!getSoeSeq().equals(other.getSoeSeq())) {
			return false;
		}
		return true;
	}

	

}
