package br.gov.mec.aghu.model;

// Generated 24/05/2010 13:06:47 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatItensProcedHospitalarId generated by hbm2java
 */
@Embeddable
public class FatItensProcedHospitalarId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7652801578014730587L;
	private Short phoSeq;
	private Integer seq;

	public FatItensProcedHospitalarId() {
	}

	public FatItensProcedHospitalarId(Short phoSeq, Integer seq) {
		this.phoSeq = phoSeq;
		this.seq = seq;
	}

	@Column(name = "PHO_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getPhoSeq() {
		return this.phoSeq;
	}

	public void setPhoSeq(Short phoSeq) {
		this.phoSeq = phoSeq;
	}

	@Column(name = "SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + ((phoSeq == null)
				? 0
				: phoSeq.hashCode());
		result = prime * result + ((seq == null)
				? 0
				: seq.hashCode());
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
		if (!(obj instanceof FatItensProcedHospitalarId)) {
			return false;
		}
		FatItensProcedHospitalarId other = (FatItensProcedHospitalarId) obj;
		if (phoSeq == null) {
			if (other.phoSeq != null) {
				return false;
			}
		} else if (!phoSeq.equals(other.phoSeq)) {
			return false;
		}
		if (seq == null) {
			if (other.seq != null) {
				return false;
			}
		} else if (!seq.equals(other.seq)) {
			return false;
		}
		return true;
	}


}
