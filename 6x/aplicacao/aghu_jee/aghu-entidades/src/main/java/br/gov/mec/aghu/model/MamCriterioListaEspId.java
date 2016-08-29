package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MamCriterioListaEspId generated by hbm2java
 */
@Embeddable
public class MamCriterioListaEspId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3965075862566143808L;
	private Integer cmlSeq;
	private Integer seqp;

	public MamCriterioListaEspId() {
	}

	public MamCriterioListaEspId(Integer cmlSeq, Integer seqp) {
		this.cmlSeq = cmlSeq;
		this.seqp = seqp;
	}

	@Column(name = "CML_SEQ", nullable = false)
	public Integer getCmlSeq() {
		return this.cmlSeq;
	}

	public void setCmlSeq(Integer cmlSeq) {
		this.cmlSeq = cmlSeq;
	}

	@Column(name = "SEQP", nullable = false)
	public Integer getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Integer seqp) {
		this.seqp = seqp;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeqp());
		umHashCodeBuilder.append(this.getCmlSeq());
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
		if (!(obj instanceof MamCriterioListaEspId)) {
			return false;
		}
		MamCriterioListaEspId other = (MamCriterioListaEspId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getCmlSeq(), other.getCmlSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
