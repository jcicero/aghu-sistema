package br.gov.mec.aghu.model;

// Generated 10/11/2011 13:47:56 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatAtosMedicosAihTempId generated by hbm2java
 */

@Embeddable
public class FatAtoMedicoAihTempId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2219422239021676745L;
	private Integer eaiSeq;
	private Integer eaiCthSeq;
	private Byte seqp;

	public FatAtoMedicoAihTempId() {
	}

	public FatAtoMedicoAihTempId(Integer eaiSeq, Integer eaiCthSeq, Byte seqp) {
		this.eaiSeq = eaiSeq;
		this.eaiCthSeq = eaiCthSeq;
		this.seqp = seqp;
	}

	@Column(name = "EAI_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getEaiSeq() {
		return this.eaiSeq;
	}

	public void setEaiSeq(Integer eaiSeq) {
		this.eaiSeq = eaiSeq;
	}

	@Column(name = "EAI_CTH_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getEaiCthSeq() {
		return this.eaiCthSeq;
	}

	public void setEaiCthSeq(Integer eaiCthSeq) {
		this.eaiCthSeq = eaiCthSeq;
	}

	@Column(name = "SEQP", nullable = false, precision = 2, scale = 0)
	public Byte getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Byte seqp) {
		this.seqp = seqp;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof FatAtoMedicoAihTempId)) {
			return false;
		}
		FatAtoMedicoAihTempId castOther = (FatAtoMedicoAihTempId) other;

		return (this.getEaiSeq() == castOther.getEaiSeq())
				&& (this.getEaiCthSeq() == castOther.getEaiCthSeq())
				&& (this.getSeqp() == castOther.getSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEaiSeq();
		result = 37 * result + this.getEaiCthSeq();
		result = 37 * result + this.getSeqp();
		return result;
	}

}
