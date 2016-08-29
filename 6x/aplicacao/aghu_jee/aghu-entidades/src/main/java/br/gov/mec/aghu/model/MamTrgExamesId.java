package br.gov.mec.aghu.model;

// Generated 14/10/2011 11:28:27 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MamTrgExamesId generated by hbm2java
 */
@Embeddable
public class MamTrgExamesId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7317022486235844415L;
	private Long trgSeq;
	private Short seqp;

	public MamTrgExamesId() {
	}

	public MamTrgExamesId(Long trgSeq, Short seqp) {
		this.trgSeq = trgSeq;
		this.seqp = seqp;
	}

	@Column(name = "TRG_SEQ", nullable = false)
	public Long getTrgSeq() {
		return this.trgSeq;
	}

	public void setTrgSeq(Long trgSeq) {
		this.trgSeq = trgSeq;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seqp == null) ? 0 : seqp.hashCode());
		result = prime * result + ((trgSeq == null) ? 0 : trgSeq.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MamTrgExamesId)) {
			return false;
		}
		MamTrgExamesId other = (MamTrgExamesId) obj;
		if (seqp == null) {
			if (other.seqp != null) {
				return false;
			}
		} else if (!seqp.equals(other.seqp)) {
			return false;
		}
		if (trgSeq == null) {
			if (other.trgSeq != null) {
				return false;
			}
		} else if (!trgSeq.equals(other.trgSeq)) {
			return false;
		}
		return true;
	}

}
