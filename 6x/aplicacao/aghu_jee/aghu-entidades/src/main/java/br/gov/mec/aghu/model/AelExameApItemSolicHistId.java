package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelExameApItemSolicHistId generated by hbm2java
 */
@Embeddable
public class AelExameApItemSolicHistId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6184543828937450597L;
	private Long luxSeq;
	private Integer iseSoeSeq;
	private Short iseSeqp;

	public AelExameApItemSolicHistId() {
	}

	public AelExameApItemSolicHistId(Long luxSeq, Integer iseSoeSeq, Short iseSeqp) {
		this.luxSeq = luxSeq;
		this.iseSoeSeq = iseSoeSeq;
		this.iseSeqp = iseSeqp;
	}

	@Column(name = "LUX_SEQ", nullable = false)
	public Long getLuxSeq() {
		return this.luxSeq;
	}

	public void setLuxSeq(Long luxSeq) {
		this.luxSeq = luxSeq;
	}

	@Column(name = "ISE_SOE_SEQ", nullable = false)
	public Integer getIseSoeSeq() {
		return this.iseSoeSeq;
	}

	public void setIseSoeSeq(Integer iseSoeSeq) {
		this.iseSoeSeq = iseSoeSeq;
	}

	@Column(name = "ISE_SEQP", nullable = false)
	public Short getIseSeqp() {
		return this.iseSeqp;
	}

	public void setIseSeqp(Short iseSeqp) {
		this.iseSeqp = iseSeqp;
	}






	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getLuxSeq());
		umHashCodeBuilder.append(this.getIseSoeSeq());
		umHashCodeBuilder.append(this.getIseSeqp());
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
		if (!(obj instanceof AelExameApItemSolicHistId)) {
			return false;
		}
		AelExameApItemSolicHistId other = (AelExameApItemSolicHistId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getLuxSeq(), other.getLuxSeq());
		umEqualsBuilder.append(this.getIseSoeSeq(), other.getIseSoeSeq());
		umEqualsBuilder.append(this.getIseSeqp(), other.getIseSeqp());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
