package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpmControlImpresNptId generated by hbm2java
 */
@Embeddable
public class MpmControlImpresNptId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5011511239033717646L;
	private Integer pnpAtdSeq;
	private Long pnpSeq;
	private Integer pmeAtdSeq;
	private Integer pmeSeq;

	public MpmControlImpresNptId() {
	}

	public MpmControlImpresNptId(Integer pnpAtdSeq, Long pnpSeq, Integer pmeAtdSeq, Integer pmeSeq) {
		this.pnpAtdSeq = pnpAtdSeq;
		this.pnpSeq = pnpSeq;
		this.pmeAtdSeq = pmeAtdSeq;
		this.pmeSeq = pmeSeq;
	}

	@Column(name = "PNP_ATD_SEQ", nullable = false)
	public Integer getPnpAtdSeq() {
		return this.pnpAtdSeq;
	}

	public void setPnpAtdSeq(Integer pnpAtdSeq) {
		this.pnpAtdSeq = pnpAtdSeq;
	}

	@Column(name = "PNP_SEQ", nullable = false)
	public Long getPnpSeq() {
		return this.pnpSeq;
	}

	public void setPnpSeq(Long pnpSeq) {
		this.pnpSeq = pnpSeq;
	}

	@Column(name = "PME_ATD_SEQ", nullable = false)
	public Integer getPmeAtdSeq() {
		return this.pmeAtdSeq;
	}

	public void setPmeAtdSeq(Integer pmeAtdSeq) {
		this.pmeAtdSeq = pmeAtdSeq;
	}

	@Column(name = "PME_SEQ", nullable = false)
	public Integer getPmeSeq() {
		return this.pmeSeq;
	}

	public void setPmeSeq(Integer pmeSeq) {
		this.pmeSeq = pmeSeq;
	}






	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getPnpAtdSeq());
		umHashCodeBuilder.append(this.getPnpSeq());
		umHashCodeBuilder.append(this.getPmeAtdSeq());
		umHashCodeBuilder.append(this.getPmeSeq());
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
		if (!(obj instanceof MpmControlImpresNptId)) {
			return false;
		}
		MpmControlImpresNptId other = (MpmControlImpresNptId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getPnpAtdSeq(), other.getPnpAtdSeq());
		umEqualsBuilder.append(this.getPnpSeq(), other.getPnpSeq());
		umEqualsBuilder.append(this.getPmeAtdSeq(), other.getPmeAtdSeq());
		umEqualsBuilder.append(this.getPmeSeq(), other.getPmeSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
