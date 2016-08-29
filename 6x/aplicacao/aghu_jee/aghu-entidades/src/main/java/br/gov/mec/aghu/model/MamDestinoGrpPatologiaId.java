package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MamDestinoGrpPatologiaId generated by hbm2java
 */
@Embeddable
public class MamDestinoGrpPatologiaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2434056735458694141L;
	private Long desSeq;
	private Short seqp;

	public MamDestinoGrpPatologiaId() {
	}

	public MamDestinoGrpPatologiaId(Long desSeq, Short seqp) {
		this.desSeq = desSeq;
		this.seqp = seqp;
	}

	@Column(name = "DES_SEQ", nullable = false)
	public Long getDesSeq() {
		return this.desSeq;
	}

	public void setDesSeq(Long desSeq) {
		this.desSeq = desSeq;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	

	


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeqp());
		umHashCodeBuilder.append(this.getDesSeq());
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
		if (!(obj instanceof MamDestinoGrpPatologiaId)) {
			return false;
		}
		MamDestinoGrpPatologiaId other = (MamDestinoGrpPatologiaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getDesSeq(), other.getDesSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
