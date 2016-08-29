package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MciMaterialInfecPatologiaId generated by hbm2java
 */
@Embeddable
public class MciMaterialInfecPatologiaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5978608763372535203L;
	private Integer paiSeq;
	private Short seqp;

	public MciMaterialInfecPatologiaId() {
	}

	public MciMaterialInfecPatologiaId(Integer paiSeq, Short seqp) {
		this.paiSeq = paiSeq;
		this.seqp = seqp;
	}

	@Column(name = "PAI_SEQ", nullable = false)
	public Integer getPaiSeq() {
		return this.paiSeq;
	}

	public void setPaiSeq(Integer paiSeq) {
		this.paiSeq = paiSeq;
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
		umHashCodeBuilder.append(this.getPaiSeq());
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
		if (!(obj instanceof MciMaterialInfecPatologiaId)) {
			return false;
		}
		MciMaterialInfecPatologiaId other = (MciMaterialInfecPatologiaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getPaiSeq(), other.getPaiSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
