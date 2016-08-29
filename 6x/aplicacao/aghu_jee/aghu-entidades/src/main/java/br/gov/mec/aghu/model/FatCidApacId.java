package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatCidApacsId generated by hbm2java
 */
@Embeddable
public class FatCidApacId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 642963178015639378L;
	private Long atmNumero;
	private Integer cidSeq;

	public FatCidApacId() {
	}

	public FatCidApacId(Long atmNumero, Integer cidSeq) {
		this.atmNumero = atmNumero;
		this.cidSeq = cidSeq;
	}

	@Column(name = "ATM_NUMERO", nullable = false, precision = 13, scale = 0)
	public Long getAtmNumero() {
		return this.atmNumero;
	}

	public void setAtmNumero(Long atmNumero) {
		this.atmNumero = atmNumero;
	}

	@Column(name = "CID_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getCidSeq() {
		return this.cidSeq;
	}

	public void setCidSeq(Integer cidSeq) {
		this.cidSeq = cidSeq;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atmNumero == null) ? 0 : atmNumero.hashCode());
		result = prime * result + ((cidSeq == null) ? 0 : cidSeq.hashCode());
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
		if (!(obj instanceof FatCidApacId)) {
			return false;
		}
		FatCidApacId other = (FatCidApacId) obj;
		if (atmNumero == null) {
			if (other.atmNumero != null) {
				return false;
			}
		} else if (!atmNumero.equals(other.atmNumero)) {
			return false;
		}
		if (cidSeq == null) {
			if (other.cidSeq != null) {
				return false;
			}
		} else if (!cidSeq.equals(other.cidSeq)) {
			return false;
		}
		return true;
	}

}
