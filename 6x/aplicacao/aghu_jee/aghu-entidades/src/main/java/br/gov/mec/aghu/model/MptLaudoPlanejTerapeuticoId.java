package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MptLaudoPlanejTerapeuticoId generated by hbm2java
 */
@Embeddable
public class MptLaudoPlanejTerapeuticoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2213187742719932721L;
	private Integer lauTrpSeq;
	private Short lauSeqp;

	public MptLaudoPlanejTerapeuticoId() {
	}

	public MptLaudoPlanejTerapeuticoId(Integer lauTrpSeq, Short lauSeqp) {
		this.lauTrpSeq = lauTrpSeq;
		this.lauSeqp = lauSeqp;
	}

	@Column(name = "LAU_TRP_SEQ", nullable = false)
	public Integer getLauTrpSeq() {
		return this.lauTrpSeq;
	}

	public void setLauTrpSeq(Integer lauTrpSeq) {
		this.lauTrpSeq = lauTrpSeq;
	}

	@Column(name = "LAU_SEQP", nullable = false)
	public Short getLauSeqp() {
		return this.lauSeqp;
	}

	public void setLauSeqp(Short lauSeqp) {
		this.lauSeqp = lauSeqp;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getLauTrpSeq());
		umHashCodeBuilder.append(this.getLauSeqp());
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
		if (!(obj instanceof MptLaudoPlanejTerapeuticoId)) {
			return false;
		}
		MptLaudoPlanejTerapeuticoId other = (MptLaudoPlanejTerapeuticoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getLauTrpSeq(), other.getLauTrpSeq());
		umEqualsBuilder.append(this.getLauSeqp(), other.getLauSeqp());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
