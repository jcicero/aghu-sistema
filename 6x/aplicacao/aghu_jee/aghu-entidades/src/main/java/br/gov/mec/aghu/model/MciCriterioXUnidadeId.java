package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MciCriterioXUnidadeId generated by hbm2java
 */
@Embeddable
public class MciCriterioXUnidadeId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6999705690956008311L;
	private Short unfSeq;
	private Integer crpSeq;
	private Integer version;

	public MciCriterioXUnidadeId() {
	}

	public MciCriterioXUnidadeId(Short unfSeq, Integer crpSeq, Integer version) {
		this.unfSeq = unfSeq;
		this.crpSeq = crpSeq;
		this.version = version;
	}

	@Column(name = "UNF_SEQ", nullable = false)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "CRP_SEQ", nullable = false)
	public Integer getCrpSeq() {
		return this.crpSeq;
	}

	public void setCrpSeq(Integer crpSeq) {
		this.crpSeq = crpSeq;
	}

	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getUnfSeq());
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getCrpSeq());
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
		if (!(obj instanceof MciCriterioXUnidadeId)) {
			return false;
		}
		MciCriterioXUnidadeId other = (MciCriterioXUnidadeId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getUnfSeq(), other.getUnfSeq());
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getCrpSeq(), other.getCrpSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
