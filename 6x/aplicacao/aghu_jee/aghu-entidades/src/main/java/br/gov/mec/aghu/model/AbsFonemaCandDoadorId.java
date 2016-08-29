package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AbsFonemaCandDoadorId generated by hbm2java
 */
@Embeddable
public class AbsFonemaCandDoadorId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2697023300305400938L;
	private Integer cadSeq;
	private String cfcFonema;

	public AbsFonemaCandDoadorId() {
	}

	public AbsFonemaCandDoadorId(Integer cadSeq, String cfcFonema) {
		this.cadSeq = cadSeq;
		this.cfcFonema = cfcFonema;
	}

	@Column(name = "CAD_SEQ", nullable = false)
	public Integer getCadSeq() {
		return this.cadSeq;
	}

	public void setCadSeq(Integer cadSeq) {
		this.cadSeq = cadSeq;
	}

	@Column(name = "CFC_FONEMA", nullable = false, length = 6)
	@Length(max = 6)
	public String getCfcFonema() {
		return this.cfcFonema;
	}

	public void setCfcFonema(String cfcFonema) {
		this.cfcFonema = cfcFonema;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCadSeq());
		umHashCodeBuilder.append(this.getCfcFonema());
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
		if (!(obj instanceof AbsFonemaCandDoadorId)) {
			return false;
		}
		AbsFonemaCandDoadorId other = (AbsFonemaCandDoadorId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCadSeq(), other.getCadSeq());
		umEqualsBuilder.append(this.getCfcFonema(), other.getCfcFonema());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
