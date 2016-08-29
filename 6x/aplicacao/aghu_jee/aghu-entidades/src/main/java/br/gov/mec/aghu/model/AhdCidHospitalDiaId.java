package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AhdCidHospitalDiaId generated by hbm2java
 */
@Embeddable
public class AhdCidHospitalDiaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4384612162750757621L;
	private Integer cidSeq;
	private Integer hodSeq;

	public AhdCidHospitalDiaId() {
	}

	public AhdCidHospitalDiaId(Integer cidSeq, Integer hodSeq) {
		this.cidSeq = cidSeq;
		this.hodSeq = hodSeq;
	}

	@Column(name = "CID_SEQ", nullable = false)
	public Integer getCidSeq() {
		return this.cidSeq;
	}

	public void setCidSeq(Integer cidSeq) {
		this.cidSeq = cidSeq;
	}

	@Column(name = "HOD_SEQ", nullable = false)
	public Integer getHodSeq() {
		return this.hodSeq;
	}

	public void setHodSeq(Integer hodSeq) {
		this.hodSeq = hodSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCidSeq());
		umHashCodeBuilder.append(this.getHodSeq());
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
		if (!(obj instanceof AhdCidHospitalDiaId)) {
			return false;
		}
		AhdCidHospitalDiaId other = (AhdCidHospitalDiaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCidSeq(), other.getCidSeq());
		umEqualsBuilder.append(this.getHodSeq(), other.getHodSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
