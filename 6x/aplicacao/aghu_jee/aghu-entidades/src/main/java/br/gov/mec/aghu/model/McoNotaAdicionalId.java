package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * McoNotaAdicionalId generated by hbm2java
 */
@Embeddable
public class McoNotaAdicionalId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6740240716236100013L;
	private Integer gsoPacCodigo;
	private Short gsoSeqp;
	private Integer seqp;

	public McoNotaAdicionalId() {
	}

	public McoNotaAdicionalId(Integer gsoPacCodigo, Short gsoSeqp, Integer seqp) {
		this.gsoPacCodigo = gsoPacCodigo;
		this.gsoSeqp = gsoSeqp;
		this.seqp = seqp;
	}

	@Column(name = "GSO_PAC_CODIGO", nullable = false)
	public Integer getGsoPacCodigo() {
		return this.gsoPacCodigo;
	}

	public void setGsoPacCodigo(Integer gsoPacCodigo) {
		this.gsoPacCodigo = gsoPacCodigo;
	}

	@Column(name = "GSO_SEQP", nullable = false)
	public Short getGsoSeqp() {
		return this.gsoSeqp;
	}

	public void setGsoSeqp(Short gsoSeqp) {
		this.gsoSeqp = gsoSeqp;
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
		umHashCodeBuilder.append(this.getGsoPacCodigo());
		umHashCodeBuilder.append(this.getGsoSeqp());
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
		if (!(obj instanceof McoNotaAdicionalId)) {
			return false;
		}
		McoNotaAdicionalId other = (McoNotaAdicionalId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getGsoPacCodigo(), other.getGsoPacCodigo());
		umEqualsBuilder.append(this.getGsoSeqp(), other.getGsoSeqp());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}