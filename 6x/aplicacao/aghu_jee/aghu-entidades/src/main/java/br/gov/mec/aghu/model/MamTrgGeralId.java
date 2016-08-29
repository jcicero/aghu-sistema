package br.gov.mec.aghu.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

@Embeddable
public class MamTrgGeralId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1579178790673591268L;
	private Long trgSeq;
	private Short seqp;

	public MamTrgGeralId() {
	}

	public MamTrgGeralId(Long trgSeq, Short seqp) {
		this.trgSeq = trgSeq;
		this.seqp = seqp;
	}

	@Column(name = "TRG_SEQ", nullable = false, precision = 14, scale = 0)
	public Long getTrgSeq() {
		return this.trgSeq;
	}

	public void setTrgSeq(Long trgSeq) {
		this.trgSeq = trgSeq;
	}

	@Column(name = "SEQP", nullable = false, precision = 4, scale = 0)
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
		if (!(obj instanceof MamTrgGeralId)) {
			return false;
		}
		MamTrgGeralId other = (MamTrgGeralId) obj;
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
