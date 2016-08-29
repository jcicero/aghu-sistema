package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * RapRealizacaoSignificativaId generated by hbm2java
 */
@Embeddable
public class RapRealizacaoSignificativaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5027609657359216186L;
	private Integer iasAvsSeq;
	private Integer iasSeqp;
	private Short seqp;

	public RapRealizacaoSignificativaId() {
	}

	public RapRealizacaoSignificativaId(Integer iasAvsSeq, Integer iasSeqp, Short seqp) {
		this.iasAvsSeq = iasAvsSeq;
		this.iasSeqp = iasSeqp;
		this.seqp = seqp;
	}

	@Column(name = "IAS_AVS_SEQ", nullable = false)
	public Integer getIasAvsSeq() {
		return this.iasAvsSeq;
	}

	public void setIasAvsSeq(Integer iasAvsSeq) {
		this.iasAvsSeq = iasAvsSeq;
	}

	@Column(name = "IAS_SEQP", nullable = false)
	public Integer getIasSeqp() {
		return this.iasSeqp;
	}

	public void setIasSeqp(Integer iasSeqp) {
		this.iasSeqp = iasSeqp;
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
		umHashCodeBuilder.append(this.getIasAvsSeq());
		umHashCodeBuilder.append(this.getIasSeqp());
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
		if (!(obj instanceof RapRealizacaoSignificativaId)) {
			return false;
		}
		RapRealizacaoSignificativaId other = (RapRealizacaoSignificativaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getIasAvsSeq(), other.getIasAvsSeq());
		umEqualsBuilder.append(this.getIasSeqp(), other.getIasSeqp());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
