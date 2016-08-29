package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * CtbNivel3Id generated by hbm2java
 */
@Embeddable
public class CtbNivel3Id implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4718968869340064739L;
	private Short seqp;
	private Short nv2Seqp;
	private Short nv2Nv1Seq;

	public CtbNivel3Id() {
	}

	public CtbNivel3Id(Short seqp, Short nv2Seqp, Short nv2Nv1Seq) {
		this.seqp = seqp;
		this.nv2Seqp = nv2Seqp;
		this.nv2Nv1Seq = nv2Nv1Seq;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Column(name = "NV2_SEQP", nullable = false)
	public Short getNv2Seqp() {
		return this.nv2Seqp;
	}

	public void setNv2Seqp(Short nv2Seqp) {
		this.nv2Seqp = nv2Seqp;
	}

	@Column(name = "NV2_NV1_SEQ", nullable = false)
	public Short getNv2Nv1Seq() {
		return this.nv2Nv1Seq;
	}

	public void setNv2Nv1Seq(Short nv2Nv1Seq) {
		this.nv2Nv1Seq = nv2Nv1Seq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeqp());
		umHashCodeBuilder.append(this.getNv2Seqp());
		umHashCodeBuilder.append(this.getNv2Nv1Seq());
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
		if (!(obj instanceof CtbNivel3Id)) {
			return false;
		}
		CtbNivel3Id other = (CtbNivel3Id) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getNv2Seqp(), other.getNv2Seqp());
		umEqualsBuilder.append(this.getNv2Nv1Seq(), other.getNv2Nv1Seq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
