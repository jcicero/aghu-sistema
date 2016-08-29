package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MbcEquipamentoUtilCirgId generated by hbm2java
 */
@Embeddable
public class MbcEquipamentoUtilCirgId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3580022319129240692L;
	private Integer crgSeq;
	private Short euuSeq;

	public MbcEquipamentoUtilCirgId() {
	}

	public MbcEquipamentoUtilCirgId(Integer crgSeq, Short euuSeq) {
		this.crgSeq = crgSeq;
		this.euuSeq = euuSeq;
	}

	@Column(name = "CRG_SEQ", nullable = false)
	public Integer getCrgSeq() {
		return this.crgSeq;
	}

	public void setCrgSeq(Integer crgSeq) {
		this.crgSeq = crgSeq;
	}

	@Column(name = "EUU_SEQ", nullable = false)
	public Short getEuuSeq() {
		return this.euuSeq;
	}

	public void setEuuSeq(Short euuSeq) {
		this.euuSeq = euuSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCrgSeq());
		umHashCodeBuilder.append(this.getEuuSeq());
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
		if (!(obj instanceof MbcEquipamentoUtilCirgId)) {
			return false;
		}
		MbcEquipamentoUtilCirgId other = (MbcEquipamentoUtilCirgId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCrgSeq(), other.getCrgSeq());
		umEqualsBuilder.append(this.getEuuSeq(), other.getEuuSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
