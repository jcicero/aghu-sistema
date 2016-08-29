package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MamUnidXSinalVitalId generated by hbm2java
 */
@Embeddable
public class MamUnidXSinalVitalId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -839006133567417478L;
	private Integer sviSeq;
	private Short uanUnfSeq;

	public MamUnidXSinalVitalId() {
	}

	public MamUnidXSinalVitalId(Integer sviSeq, Short uanUnfSeq) {
		this.sviSeq = sviSeq;
		this.uanUnfSeq = uanUnfSeq;
	}

	@Column(name = "SVI_SEQ", nullable = false)
	public Integer getSviSeq() {
		return this.sviSeq;
	}

	public void setSviSeq(Integer sviSeq) {
		this.sviSeq = sviSeq;
	}

	@Column(name = "UAN_UNF_SEQ", nullable = false)
	public Short getUanUnfSeq() {
		return this.uanUnfSeq;
	}

	public void setUanUnfSeq(Short uanUnfSeq) {
		this.uanUnfSeq = uanUnfSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getUanUnfSeq());
		umHashCodeBuilder.append(this.getSviSeq());
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
		if (!(obj instanceof MamUnidXSinalVitalId)) {
			return false;
		}
		MamUnidXSinalVitalId other = (MamUnidXSinalVitalId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getUanUnfSeq(), other.getUanUnfSeq());
		umEqualsBuilder.append(this.getSviSeq(), other.getSviSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
