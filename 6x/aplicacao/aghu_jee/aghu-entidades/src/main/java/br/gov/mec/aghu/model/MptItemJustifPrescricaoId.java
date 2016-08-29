package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MptItemJustifPrescricaoId generated by hbm2java
 */
@Embeddable
public class MptItemJustifPrescricaoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6075459820478603462L;
	private Integer mjpJupAtdSeq;
	private Integer mjpJupSeq;
	private Short mjpSeqp;
	private Integer imoPmoPteAtdSeq;
	private Integer imoPmoPteSeq;
	private Integer imoPmoSeq;
	private Short imoSeqp;

	public MptItemJustifPrescricaoId() {
	}

	public MptItemJustifPrescricaoId(Integer mjpJupAtdSeq, Integer mjpJupSeq, Short mjpSeqp, Integer imoPmoPteAtdSeq, Integer imoPmoPteSeq,
			Integer imoPmoSeq, Short imoSeqp) {
		this.mjpJupAtdSeq = mjpJupAtdSeq;
		this.mjpJupSeq = mjpJupSeq;
		this.mjpSeqp = mjpSeqp;
		this.imoPmoPteAtdSeq = imoPmoPteAtdSeq;
		this.imoPmoPteSeq = imoPmoPteSeq;
		this.imoPmoSeq = imoPmoSeq;
		this.imoSeqp = imoSeqp;
	}

	@Column(name = "MJP_JUP_ATD_SEQ", nullable = false)
	public Integer getMjpJupAtdSeq() {
		return this.mjpJupAtdSeq;
	}

	public void setMjpJupAtdSeq(Integer mjpJupAtdSeq) {
		this.mjpJupAtdSeq = mjpJupAtdSeq;
	}

	@Column(name = "MJP_JUP_SEQ", nullable = false)
	public Integer getMjpJupSeq() {
		return this.mjpJupSeq;
	}

	public void setMjpJupSeq(Integer mjpJupSeq) {
		this.mjpJupSeq = mjpJupSeq;
	}

	@Column(name = "MJP_SEQP", nullable = false)
	public Short getMjpSeqp() {
		return this.mjpSeqp;
	}

	public void setMjpSeqp(Short mjpSeqp) {
		this.mjpSeqp = mjpSeqp;
	}

	@Column(name = "IMO_PMO_PTE_ATD_SEQ", nullable = false)
	public Integer getImoPmoPteAtdSeq() {
		return this.imoPmoPteAtdSeq;
	}

	public void setImoPmoPteAtdSeq(Integer imoPmoPteAtdSeq) {
		this.imoPmoPteAtdSeq = imoPmoPteAtdSeq;
	}

	@Column(name = "IMO_PMO_PTE_SEQ", nullable = false)
	public Integer getImoPmoPteSeq() {
		return this.imoPmoPteSeq;
	}

	public void setImoPmoPteSeq(Integer imoPmoPteSeq) {
		this.imoPmoPteSeq = imoPmoPteSeq;
	}

	@Column(name = "IMO_PMO_SEQ", nullable = false)
	public Integer getImoPmoSeq() {
		return this.imoPmoSeq;
	}

	public void setImoPmoSeq(Integer imoPmoSeq) {
		this.imoPmoSeq = imoPmoSeq;
	}

	@Column(name = "IMO_SEQP", nullable = false)
	public Short getImoSeqp() {
		return this.imoSeqp;
	}

	public void setImoSeqp(Short imoSeqp) {
		this.imoSeqp = imoSeqp;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getMjpJupAtdSeq());
		umHashCodeBuilder.append(this.getMjpJupSeq());
		umHashCodeBuilder.append(this.getMjpSeqp());
		umHashCodeBuilder.append(this.getImoPmoPteAtdSeq());
		umHashCodeBuilder.append(this.getImoPmoPteSeq());
		umHashCodeBuilder.append(this.getImoPmoSeq());
		umHashCodeBuilder.append(this.getImoSeqp());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MptItemJustifPrescricaoId)) {
			return false;
		}
		MptItemJustifPrescricaoId other = (MptItemJustifPrescricaoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getMjpJupAtdSeq(), other.getMjpJupAtdSeq());
		umEqualsBuilder.append(this.getMjpJupSeq(), other.getMjpJupSeq());
		umEqualsBuilder.append(this.getMjpSeqp(), other.getMjpSeqp());
		umEqualsBuilder.append(this.getImoPmoPteAtdSeq(), other.getImoPmoPteAtdSeq());
		umEqualsBuilder.append(this.getImoPmoPteSeq(), other.getImoPmoPteSeq());
		umEqualsBuilder.append(this.getImoPmoSeq(), other.getImoPmoSeq());
		umEqualsBuilder.append(this.getImoSeqp(), other.getImoSeqp());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
