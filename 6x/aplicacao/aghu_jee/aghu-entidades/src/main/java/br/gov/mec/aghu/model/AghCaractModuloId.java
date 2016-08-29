package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AghCaractModuloId generated by hbm2java
 */
@Embeddable
public class AghCaractModuloId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2575410233095010923L;
	private Short crctSeq;
	private Short modSeq;

	public AghCaractModuloId() {
	}

	public AghCaractModuloId(Short crctSeq, Short modSeq) {
		this.crctSeq = crctSeq;
		this.modSeq = modSeq;
	}

	@Column(name = "CRCT_SEQ", nullable = false)
	public Short getCrctSeq() {
		return this.crctSeq;
	}

	public void setCrctSeq(Short crctSeq) {
		this.crctSeq = crctSeq;
	}

	@Column(name = "MOD_SEQ", nullable = false)
	public Short getModSeq() {
		return this.modSeq;
	}

	public void setModSeq(Short modSeq) {
		this.modSeq = modSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCrctSeq());
		umHashCodeBuilder.append(this.getModSeq());
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
		if (!(obj instanceof AghCaractModuloId)) {
			return false;
		}
		AghCaractModuloId other = (AghCaractModuloId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCrctSeq(), other.getCrctSeq());
		umEqualsBuilder.append(this.getModSeq(), other.getModSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
