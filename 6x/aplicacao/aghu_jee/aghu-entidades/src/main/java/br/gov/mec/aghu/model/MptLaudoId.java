package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MptLaudoId generated by hbm2java
 */
@Embeddable
public class MptLaudoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 507094333157503400L;
	private Integer trpSeq;
	private Short seqp;

	public MptLaudoId() {
	}

	public MptLaudoId(Integer trpSeq, Short seqp) {
		this.trpSeq = trpSeq;
		this.seqp = seqp;
	}

	@Column(name = "TRP_SEQ", nullable = false)
	public Integer getTrpSeq() {
		return this.trpSeq;
	}

	public void setTrpSeq(Integer trpSeq) {
		this.trpSeq = trpSeq;
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
		umHashCodeBuilder.append(this.getTrpSeq());
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
		if (!(obj instanceof MptLaudoId)) {
			return false;
		}
		MptLaudoId other = (MptLaudoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getTrpSeq(), other.getTrpSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
