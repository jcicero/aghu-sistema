package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * PdtAchadoId generated by hbm2java
 */
@Embeddable
public class PdtAchadoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2667433789950865775L;
	private Integer dgrDptSeq;
	private Short dgrSeqp;
	private Short seqp;

	public PdtAchadoId() {
	}

	public PdtAchadoId(Integer dgrDptSeq, Short dgrSeqp, Short seqp) {
		this.dgrDptSeq = dgrDptSeq;
		this.dgrSeqp = dgrSeqp;
		this.seqp = seqp;
	}

	@Column(name = "DGR_DPT_SEQ", nullable = false)
	public Integer getDgrDptSeq() {
		return this.dgrDptSeq;
	}

	public void setDgrDptSeq(Integer dgrDptSeq) {
		this.dgrDptSeq = dgrDptSeq;
	}

	@Column(name = "DGR_SEQP", nullable = false)
	public Short getDgrSeqp() {
		return this.dgrSeqp;
	}

	public void setDgrSeqp(Short dgrSeqp) {
		this.dgrSeqp = dgrSeqp;
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
		umHashCodeBuilder.append(this.getDgrDptSeq());
		umHashCodeBuilder.append(this.getDgrSeqp());
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
		if (!(obj instanceof PdtAchadoId)) {
			return false;
		}
		PdtAchadoId other = (PdtAchadoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getDgrDptSeq(), other.getDgrDptSeq());
		umEqualsBuilder.append(this.getDgrSeqp(), other.getDgrSeqp());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}