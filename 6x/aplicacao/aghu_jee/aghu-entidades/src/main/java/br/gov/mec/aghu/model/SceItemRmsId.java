package br.gov.mec.aghu.model;

// Generated 21/09/2011 17:21:15 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * SceItemRmsId generated by hbm2java
 */

@Embeddable
public class SceItemRmsId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7974387232647419393L;
	private Integer rmsSeq;
	private Integer ealSeq;
	
	public SceItemRmsId() {
	}
	
	public SceItemRmsId(Integer rmsSeq, Integer ealSeq) {
		this.rmsSeq = rmsSeq;
		this.ealSeq = ealSeq;
	}

	@Column(name = "RMS_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getRmsSeq() {
		return this.rmsSeq;
	}

	public void setRmsSeq(Integer rmsSeq) {
		this.rmsSeq = rmsSeq;
	}

	@Column(name = "EAL_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getEalSeq() {
		return this.ealSeq;
	}

	public void setEalSeq(Integer ealSeq) {
		this.ealSeq = ealSeq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof SceItemRmsId)) {
			return false;
		}
		SceItemRmsId castOther = (SceItemRmsId) other;

		return (this.getRmsSeq() == castOther.getRmsSeq())
				&& (this.getEalSeq() == castOther.getEalSeq());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getRmsSeq();
		result = 37 * result + this.getEalSeq();
		return result;
	}

}
