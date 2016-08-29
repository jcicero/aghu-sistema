package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpmAltaTriagemId generated by hbm2java
 */

@Embeddable
public class MpmAltaTriagemId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7512798830928355558L;
	private Integer asuApaAtdSeq;
	private Integer asuApaSeq;
	private Short asuSeqp;
	private Integer seqp;

	public MpmAltaTriagemId() {
	}

	public MpmAltaTriagemId(Integer asuApaAtdSeq, Integer asuApaSeq, Short asuSeqp,
			Integer seqp) {
		this.asuApaAtdSeq = asuApaAtdSeq;
		this.asuApaSeq = asuApaSeq;
		this.asuSeqp = asuSeqp;
		this.seqp = seqp;
	}

	@Column(name = "ASU_APA_ATD_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getAsuApaAtdSeq() {
		return this.asuApaAtdSeq;
	}

	public void setAsuApaAtdSeq(Integer asuApaAtdSeq) {
		this.asuApaAtdSeq = asuApaAtdSeq;
	}

	@Column(name = "ASU_APA_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getAsuApaSeq() {
		return this.asuApaSeq;
	}

	public void setAsuApaSeq(Integer asuApaSeq) {
		this.asuApaSeq = asuApaSeq;
	}

	@Column(name = "ASU_SEQP", nullable = false, precision = 3, scale = 0)
	public Short getAsuSeqp() {
		return this.asuSeqp;
	}

	public void setAsuSeqp(Short asuSeqp) {
		this.asuSeqp = asuSeqp;
	}

	@Column(name = "SEQP", nullable = false, precision = 5, scale = 0)
	public Integer getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Integer seqp) {
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
		if (!(other instanceof MpmAltaTriagemId)) {
			return false;
		}
		MpmAltaTriagemId castOther = (MpmAltaTriagemId) other;

		return (this.getAsuApaAtdSeq() == castOther.getAsuApaAtdSeq())
				&& (this.getAsuApaSeq() == castOther.getAsuApaSeq())
				&& (this.getAsuSeqp() == castOther.getAsuSeqp())
				&& (this.getSeqp() == castOther.getSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAsuApaAtdSeq();
		result = 37 * result + this.getAsuApaSeq();
		result = 37 * result + this.getAsuSeqp();
		result = 37 * result + this.getSeqp();
		return result;
	}

}
