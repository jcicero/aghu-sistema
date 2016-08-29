package br.gov.mec.aghu.model;

// Generated 17/10/2011 16:43:13 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * EpePrescCuidExamesId generated by hbm2java
 */
@Embeddable
public class EpePrescCuidExameId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7795298617361988717L;
	private Integer prcSeq;
	private Integer prcAtdSeq;
	private Short cexCuiSeq;
	private String cexEmaExaSigla;
	private Integer cexEmaManSeq;

	public EpePrescCuidExameId() {
	}

	public EpePrescCuidExameId(Integer prcSeq, Integer prcAtdSeq, Short cexCuiSeq,
			String cexEmaExaSigla, Integer cexEmaManSeq) {
		this.prcSeq = prcSeq;
		this.prcAtdSeq = prcAtdSeq;
		this.cexCuiSeq = cexCuiSeq;
		this.cexEmaExaSigla = cexEmaExaSigla;
		this.cexEmaManSeq = cexEmaManSeq;
	}

	@Column(name = "PRC_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getPrcSeq() {
		return this.prcSeq;
	}

	public void setPrcSeq(Integer prcSeq) {
		this.prcSeq = prcSeq;
	}

	@Column(name = "PRC_ATD_SEQ", nullable = false, precision = 9, scale = 0)
	public Integer getPrcAtdSeq() {
		return this.prcAtdSeq;
	}

	public void setPrcAtdSeq(Integer prcAtdSeq) {
		this.prcAtdSeq = prcAtdSeq;
	}

	@Column(name = "CEX_CUI_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getCexCuiSeq() {
		return this.cexCuiSeq;
	}

	public void setCexCuiSeq(Short cexCuiSeq) {
		this.cexCuiSeq = cexCuiSeq;
	}

	@Column(name = "CEX_EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getCexEmaExaSigla() {
		return this.cexEmaExaSigla;
	}

	public void setCexEmaExaSigla(String cexEmaExaSigla) {
		this.cexEmaExaSigla = cexEmaExaSigla;
	}

	@Column(name = "CEX_EMA_MAN_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getCexEmaManSeq() {
		return this.cexEmaManSeq;
	}

	public void setCexEmaManSeq(Integer cexEmaManSeq) {
		this.cexEmaManSeq = cexEmaManSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getPrcSeq());
		umHashCodeBuilder.append(this.getPrcAtdSeq());
		umHashCodeBuilder.append(this.getCexCuiSeq());
		umHashCodeBuilder.append(this.getCexEmaExaSigla());
		umHashCodeBuilder.append(this.getCexEmaManSeq());
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
		if (!(obj instanceof EpePrescCuidExameId)) {
			return false;
		}
		EpePrescCuidExameId other = (EpePrescCuidExameId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getPrcSeq(), other.getPrcSeq());
		umEqualsBuilder.append(this.getPrcAtdSeq(), other.getPrcAtdSeq());
		umEqualsBuilder.append(this.getCexCuiSeq(), other.getCexCuiSeq());
		umEqualsBuilder.append(this.getCexEmaExaSigla(), other.getCexEmaExaSigla());
		umEqualsBuilder.append(this.getCexEmaManSeq(), other.getCexEmaManSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
