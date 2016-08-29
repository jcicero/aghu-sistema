package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MbcAgendaSolicEspecialId generated by hbm2java
 */
@Embeddable
public class MbcAgendaSolicEspecialId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3577302768509944764L;
	private Integer agdSeq;
	private Short nciSeq;
	private Short seqp;

	public MbcAgendaSolicEspecialId() {
	}

	public MbcAgendaSolicEspecialId(Integer agdSeq, Short nciSeq, Short seqp) {
		this.agdSeq = agdSeq;
		this.nciSeq = nciSeq;
		this.seqp = seqp;
	}

	@Column(name = "AGD_SEQ", nullable = false)
	public Integer getAgdSeq() {
		return this.agdSeq;
	}

	public void setAgdSeq(Integer agdSeq) {
		this.agdSeq = agdSeq;
	}

	@Column(name = "NCI_SEQ", nullable = false)
	public Short getNciSeq() {
		return this.nciSeq;
	}

	public void setNciSeq(Short nciSeq) {
		this.nciSeq = nciSeq;
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
		umHashCodeBuilder.append(this.getAgdSeq());
		umHashCodeBuilder.append(this.getNciSeq());
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
		if (!(obj instanceof MbcAgendaSolicEspecialId)) {
			return false;
		}
		MbcAgendaSolicEspecialId other = (MbcAgendaSolicEspecialId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getAgdSeq(), other.getAgdSeq());
		umEqualsBuilder.append(this.getNciSeq(), other.getNciSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
