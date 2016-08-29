package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MamImpDiagXCidId generated by hbm2java
 */
@Embeddable
public class MamImpDiagXCidId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2577313255512754104L;
	private Long imtSeq;
	private Integer cidSeq;

	public MamImpDiagXCidId() {
	}

	public MamImpDiagXCidId(Long imtSeq, Integer cidSeq) {
		this.imtSeq = imtSeq;
		this.cidSeq = cidSeq;
	}

	@Column(name = "IMT_SEQ", nullable = false)
	public Long getImtSeq() {
		return this.imtSeq;
	}

	public void setImtSeq(Long imtSeq) {
		this.imtSeq = imtSeq;
	}

	@Column(name = "CID_SEQ", nullable = false)
	public Integer getCidSeq() {
		return this.cidSeq;
	}

	public void setCidSeq(Integer cidSeq) {
		this.cidSeq = cidSeq;
	}






	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCidSeq());
		umHashCodeBuilder.append(this.getImtSeq());
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
		if (!(obj instanceof MamImpDiagXCidId)) {
			return false;
		}
		MamImpDiagXCidId other = (MamImpDiagXCidId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCidSeq(), other.getCidSeq());
		umEqualsBuilder.append(this.getImtSeq(), other.getImtSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
