package br.gov.mec.aghu.model;

// Generated 09/05/2011 13:32:06 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelExtratoAmostrasId generated by hbm2java
 */
@Embeddable
public class AelExtratoAmostrasId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6692350781422727240L;
	private Integer amoSoeSeq;
	private Short amoSeqp;
	private Short seqp;


	@Column(name = "AMO_SOE_SEQ", nullable = false)
	public Integer getAmoSoeSeq() {
		return this.amoSoeSeq;
	}

	public void setAmoSoeSeq(Integer amoSoeSeq) {
		this.amoSoeSeq = amoSoeSeq;
	}

	@Column(name = "AMO_SEQP", nullable = false)
	public Short getAmoSeqp() {
		return this.amoSeqp;
	}

	public void setAmoSeqp(Short amoSeqp) {
		this.amoSeqp = amoSeqp;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
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
		if (!(other instanceof AelExtratoAmostrasId)) {
			return false;
		}
		AelExtratoAmostrasId castOther = (AelExtratoAmostrasId) other;

		return (this.getAmoSoeSeq() == castOther.getAmoSoeSeq())
				&& (this.getAmoSeqp() == castOther.getAmoSeqp())
				&& (this.getSeqp() == castOther.getSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAmoSoeSeq();
		result = 37 * result + this.getAmoSeqp();
		result = 37 * result + this.getSeqp();
		return result;
	}

}
