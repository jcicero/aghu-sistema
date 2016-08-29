package br.gov.mec.aghu.model;

// Generated 17/10/2011 14:21:24 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * EpeItemCuidadoSumariosId generated by hbm2java
 */
@Embeddable
public class EpeItemCuidadoSumarioId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -110826612953628949L;
	private Integer isuSeq;
	private Integer seqp;

	public EpeItemCuidadoSumarioId() {
	}

	public EpeItemCuidadoSumarioId(Integer isuSeq, Integer seqp) {
		this.isuSeq = isuSeq;
		this.seqp = seqp;
	}

	@Column(name = "ISU_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getIsuSeq() {
		return this.isuSeq;
	}

	public void setIsuSeq(Integer isuSeq) {
		this.isuSeq = isuSeq;
	}

	@Column(name = "SEQP", nullable = false, precision = 5, scale = 0)
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
		result = prime * result + ((isuSeq == null) ? 0 : isuSeq.hashCode());
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
		EpeItemCuidadoSumarioId other = (EpeItemCuidadoSumarioId) obj;
		if (isuSeq == null) {
			if (other.isuSeq != null) {
				return false;
			}
		} else if (!isuSeq.equals(other.isuSeq)) {
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