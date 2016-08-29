package br.gov.mec.aghu.model;

// Generated 25/06/2011 16:40:08 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MamTipoReceitProcessosId generated by hbm2java
 */
@Embeddable
public class MamTipoReceitProcessosId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4810487426705660280L;
	private Short terSeq;
	private Short rocSeq;

	public MamTipoReceitProcessosId() {
	}

	public MamTipoReceitProcessosId(Short terSeq, Short rocSeq) {
		this.terSeq = terSeq;
		this.rocSeq = rocSeq;
	}

	@Column(name = "TER_SEQ", nullable = false, precision = 3, scale = 0)
	public Short getTerSeq() {
		return this.terSeq;
	}

	public void setTerSeq(Short terSeq) {
		this.terSeq = terSeq;
	}

	@Column(name = "ROC_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getRocSeq() {
		return this.rocSeq;
	}

	public void setRocSeq(Short rocSeq) {
		this.rocSeq = rocSeq;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((rocSeq == null) ? 0 : rocSeq.hashCode());
		result = prime * result + ((terSeq == null) ? 0 : terSeq.hashCode());
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
		MamTipoReceitProcessosId other = (MamTipoReceitProcessosId) obj;
		if (rocSeq == null) {
			if (other.rocSeq != null) {
				return false;
			}
		} else if (!rocSeq.equals(other.rocSeq)) {
			return false;
		}
		if (terSeq == null) {
			if (other.terSeq != null) {
				return false;
			}
		} else if (!terSeq.equals(other.terSeq)) {
			return false;
		}
		return true;
	}



}