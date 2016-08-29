package br.gov.mec.aghu.model;

// Generated 19/04/2012 14:51:43 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelNomenclaturaEspecsId generated by hbm2java
 */
@Embeddable
public class AelNomenclaturaEspecsId implements EntityCompositeId {

	private static final long serialVersionUID = 853096694816346260L;
	
	private Integer lugSeq;
	private Short seqp;

	public AelNomenclaturaEspecsId() {
	}

	public AelNomenclaturaEspecsId(Integer lugSeq, Short seqp) {
		this.lugSeq = lugSeq;
		this.seqp = seqp;
	}

	@Column(name = "LUG_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getLugSeq() {
		return this.lugSeq;
	}

	public void setLugSeq(Integer lugSeq) {
		this.lugSeq = lugSeq;
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
		result = prime * result + ((lugSeq == null) ? 0 : lugSeq.hashCode());
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
		if (!(obj instanceof AelNomenclaturaEspecsId)) {
			return false;
		}
		AelNomenclaturaEspecsId other = (AelNomenclaturaEspecsId) obj;
		if (lugSeq == null) {
			if (other.lugSeq != null) {
				return false;
			}
		} else if (!lugSeq.equals(other.lugSeq)) {
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