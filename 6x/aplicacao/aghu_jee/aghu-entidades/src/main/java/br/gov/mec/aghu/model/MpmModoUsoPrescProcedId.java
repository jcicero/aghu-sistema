package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpmModoUsoPrescProcedId generated by hbm2java
 */
@Embeddable

public class MpmModoUsoPrescProcedId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2353545524992791205L;
	private Integer pprAtdSeq;
	private Long pprSeq;
	private Integer seqp;

	public MpmModoUsoPrescProcedId() {
	}

	public MpmModoUsoPrescProcedId(Integer pprAtdSeq, Long pprSeq, Integer seqp) {
		this.pprAtdSeq = pprAtdSeq;
		this.pprSeq = pprSeq;
		this.seqp = seqp;
	}

	@Column(name = "PPR_ATD_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getPprAtdSeq() {
		return this.pprAtdSeq;
	}

	public void setPprAtdSeq(Integer pprAtdSeq) {
		this.pprAtdSeq = pprAtdSeq;
	}

	@Column(name = "PPR_SEQ", nullable = false, precision = 14, scale = 0)
	public Long getPprSeq() {
		return this.pprSeq;
	}

	public void setPprSeq(Long pprSeq) {
		this.pprSeq = pprSeq;
	}

	@Column(name = "SEQP", nullable = false, precision = 8, scale = 0)
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
		result = prime * result
				+ ((pprAtdSeq == null) ? 0 : pprAtdSeq.hashCode());
		result = prime * result + ((pprSeq == null) ? 0 : pprSeq.hashCode());
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
		MpmModoUsoPrescProcedId other = (MpmModoUsoPrescProcedId) obj;
		if (pprAtdSeq == null) {
			if (other.pprAtdSeq != null) {
				return false;
			}
		} else if (!pprAtdSeq.equals(other.pprAtdSeq)) {
			return false;
		}
		if (pprSeq == null) {
			if (other.pprSeq != null) {
				return false;
			}
		} else if (!pprSeq.equals(other.pprSeq)) {
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
