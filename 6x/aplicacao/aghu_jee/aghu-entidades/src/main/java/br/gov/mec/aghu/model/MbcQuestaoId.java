package br.gov.mec.aghu.model;

// Generated 17/06/2010 15:43:38 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MbcQuestoesId generated by hbm2java
 */
@Embeddable

public class MbcQuestaoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3037607844549305503L;
	private Short mtcSeq;
	private Integer seqp;

	public MbcQuestaoId() {
	}

	public MbcQuestaoId(Short mtcSeq, Integer seqp) {
		this.mtcSeq = mtcSeq;
		this.seqp = seqp;
	}

	@Column(name = "MTC_SEQ", nullable = false, precision = 3, scale = 0)
	public Short getMtcSeq() {
		return this.mtcSeq;
	}

	public void setMtcSeq(Short mtcSeq) {
		this.mtcSeq = mtcSeq;
	}

	@Column(name = "SEQP", nullable = false, precision = 6, scale = 0)
	public Integer getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Integer seqp) {
		this.seqp = seqp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mtcSeq == null) ? 0 : mtcSeq.hashCode());
		result = prime * result + ((seqp == null) ? 0 : seqp.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		MbcQuestaoId other = (MbcQuestaoId) obj;
		if (mtcSeq == null) {
			if (other.mtcSeq != null) {
				return false;
			}
		} else if (!mtcSeq.equals(other.mtcSeq)) {
			return false;
		}
		if (seqp == null) {
			if (other.seqp != null) {
				return false;
			}
		} else if (!seqp.equals(other.seqp)) {
			return false;
		}
		return true;
	}
}
