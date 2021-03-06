package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpaUsoProtocoloId generated by hbm2java
 */
@Embeddable
public class MpaUsoProtocoloId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4745577954990699011L;
	private Integer apaAtdSeq;
	private Integer apaSeq;
	private Short vpaPtaSeq;
	private Short vpaSeqp;
	private Integer seq;

	public MpaUsoProtocoloId() {
	}

	public MpaUsoProtocoloId(Integer apaAtdSeq, Integer apaSeq, Short vpaPtaSeq, Short vpaSeqp, Integer seq) {
		this.apaAtdSeq = apaAtdSeq;
		this.apaSeq = apaSeq;
		this.vpaPtaSeq = vpaPtaSeq;
		this.vpaSeqp = vpaSeqp;
		this.seq = seq;
	}

	@Column(name = "APA_ATD_SEQ", nullable = false)
	public Integer getApaAtdSeq() {
		return this.apaAtdSeq;
	}

	public void setApaAtdSeq(Integer apaAtdSeq) {
		this.apaAtdSeq = apaAtdSeq;
	}

	@Column(name = "APA_SEQ", nullable = false)
	public Integer getApaSeq() {
		return this.apaSeq;
	}

	public void setApaSeq(Integer apaSeq) {
		this.apaSeq = apaSeq;
	}

	@Column(name = "VPA_PTA_SEQ", nullable = false)
	public Short getVpaPtaSeq() {
		return this.vpaPtaSeq;
	}

	public void setVpaPtaSeq(Short vpaPtaSeq) {
		this.vpaPtaSeq = vpaPtaSeq;
	}

	@Column(name = "VPA_SEQP", nullable = false)
	public Short getVpaSeqp() {
		return this.vpaSeqp;
	}

	public void setVpaSeqp(Short vpaSeqp) {
		this.vpaSeqp = vpaSeqp;
	}

	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeq());
		umHashCodeBuilder.append(this.getVpaPtaSeq());
		umHashCodeBuilder.append(this.getVpaSeqp());
		umHashCodeBuilder.append(this.getApaAtdSeq());
		umHashCodeBuilder.append(this.getApaSeq());
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
		if (!(obj instanceof MpaUsoProtocoloId)) {
			return false;
		}
		MpaUsoProtocoloId other = (MpaUsoProtocoloId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeq(), other.getSeq());
		umEqualsBuilder.append(this.getVpaPtaSeq(), other.getVpaPtaSeq());
		umEqualsBuilder.append(this.getVpaSeqp(), other.getVpaSeqp());
		umEqualsBuilder.append(this.getApaAtdSeq(), other.getApaAtdSeq());
		umEqualsBuilder.append(this.getApaSeq(), other.getApaSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
