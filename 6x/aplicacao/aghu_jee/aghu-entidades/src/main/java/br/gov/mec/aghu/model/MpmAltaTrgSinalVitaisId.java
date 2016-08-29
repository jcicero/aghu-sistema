package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpmAltaTrgSinalVitaisId generated by hbm2java
 */
@Embeddable
public class MpmAltaTrgSinalVitaisId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4250770498157505690L;
	private Integer atgAsuApaAtdSeq;
	private Integer atgAsuApaSeq;
	private Short atgAsuSeqp;
	private Integer atgSeqp;
	private Integer seqp;

	public MpmAltaTrgSinalVitaisId() {
	}

	public MpmAltaTrgSinalVitaisId(Integer atgAsuApaAtdSeq, Integer atgAsuApaSeq,
			Short atgAsuSeqp, Integer atgSeqp, Integer seqp) {
		this.atgAsuApaAtdSeq = atgAsuApaAtdSeq;
		this.atgAsuApaSeq = atgAsuApaSeq;
		this.atgAsuSeqp = atgAsuSeqp;
		this.atgSeqp = atgSeqp;
		this.seqp = seqp;
	}

	@Column(name = "ATG_ASU_APA_ATD_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getAtgAsuApaAtdSeq() {
		return this.atgAsuApaAtdSeq;
	}

	public void setAtgAsuApaAtdSeq(Integer atgAsuApaAtdSeq) {
		this.atgAsuApaAtdSeq = atgAsuApaAtdSeq;
	}

	@Column(name = "ATG_ASU_APA_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getAtgAsuApaSeq() {
		return this.atgAsuApaSeq;
	}

	public void setAtgAsuApaSeq(Integer atgAsuApaSeq) {
		this.atgAsuApaSeq = atgAsuApaSeq;
	}

	@Column(name = "ATG_ASU_SEQP", nullable = false, precision = 3, scale = 0)
	public Short getAtgAsuSeqp() {
		return this.atgAsuSeqp;
	}

	public void setAtgAsuSeqp(Short atgAsuSeqp) {
		this.atgAsuSeqp = atgAsuSeqp;
	}

	@Column(name = "ATG_SEQP", nullable = false, precision = 5, scale = 0)
	public Integer getAtgSeqp() {
		return this.atgSeqp;
	}

	public void setAtgSeqp(Integer atgSeqp) {
		this.atgSeqp = atgSeqp;
	}

	@Column(name = "SEQP", nullable = false, precision = 5, scale = 0)
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
		umHashCodeBuilder.append(this.getAtgAsuApaSeq());
		umHashCodeBuilder.append(this.getAtgAsuSeqp());
		umHashCodeBuilder.append(this.getAtgSeqp());
		umHashCodeBuilder.append(this.getSeqp());
		umHashCodeBuilder.append(this.getAtgAsuApaAtdSeq());
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
		if (!(obj instanceof MpmAltaTrgSinalVitaisId)) {
			return false;
		}
		MpmAltaTrgSinalVitaisId other = (MpmAltaTrgSinalVitaisId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getAtgAsuApaSeq(), other.getAtgAsuApaSeq());
		umEqualsBuilder.append(this.getAtgAsuSeqp(), other.getAtgAsuSeqp());
		umEqualsBuilder.append(this.getAtgSeqp(), other.getAtgSeqp());
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getAtgAsuApaAtdSeq(), other.getAtgAsuApaAtdSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
