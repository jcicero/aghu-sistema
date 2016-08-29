package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * PdtInstrDescId generated by hbm2java
 */
@Embeddable
public class PdtInstrDescId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2116027268629798412L;
	private Integer ddtSeq;
	private Integer pinSeq;

	public PdtInstrDescId() {
	}

	public PdtInstrDescId(Integer ddtSeq, Integer pinSeq) {
		this.ddtSeq = ddtSeq;
		this.pinSeq = pinSeq;
	}

	@Column(name = "DDT_SEQ", nullable = false)
	public Integer getDdtSeq() {
		return this.ddtSeq;
	}

	public void setDdtSeq(Integer ddtSeq) {
		this.ddtSeq = ddtSeq;
	}

	@Column(name = "PIN_SEQ", nullable = false)
	public Integer getPinSeq() {
		return this.pinSeq;
	}

	public void setPinSeq(Integer pinSeq) {
		this.pinSeq = pinSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getDdtSeq());
		umHashCodeBuilder.append(this.getPinSeq());
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
		if (!(obj instanceof PdtInstrDescId)) {
			return false;
		}
		PdtInstrDescId other = (PdtInstrDescId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getDdtSeq(), other.getDdtSeq());
		umEqualsBuilder.append(this.getPinSeq(), other.getPinSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
