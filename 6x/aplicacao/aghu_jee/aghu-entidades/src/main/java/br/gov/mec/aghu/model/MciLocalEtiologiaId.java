package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MciLocalEtiologiaId generated by hbm2java
 */
@Embeddable
public class MciLocalEtiologiaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5124713632276561346L;
	private String einTipo;
	private Short unfSeq;

	public MciLocalEtiologiaId() {
	}

	public MciLocalEtiologiaId(String einTipo, Short unfSeq) {
		this.einTipo = einTipo;
		this.unfSeq = unfSeq;
	}

	@Column(name = "EIN_TIPO", nullable = false, length = 2)
	@Length(max = 2)
	public String getEinTipo() {
		return this.einTipo;
	}

	public void setEinTipo(String einTipo) {
		this.einTipo = einTipo;
	}

	@Column(name = "UNF_SEQ", nullable = false)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getUnfSeq());
		umHashCodeBuilder.append(this.getEinTipo());
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
		if (!(obj instanceof MciLocalEtiologiaId)) {
			return false;
		}
		MciLocalEtiologiaId other = (MciLocalEtiologiaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getUnfSeq(), other.getUnfSeq());
		umEqualsBuilder.append(this.getEinTipo(), other.getEinTipo());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
