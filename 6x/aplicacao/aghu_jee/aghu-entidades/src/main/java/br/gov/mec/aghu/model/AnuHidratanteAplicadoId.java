package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AnuHidratanteAplicadoId generated by hbm2java
 */
@Embeddable
public class AnuHidratanteAplicadoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9168367499881446902L;
	private Short hidSeq;
	private Integer dnuAtdSeq;
	private Integer dnuSeq;
	private Integer seq;

	public AnuHidratanteAplicadoId() {
	}

	public AnuHidratanteAplicadoId(Short hidSeq, Integer dnuAtdSeq, Integer dnuSeq, Integer seq) {
		this.hidSeq = hidSeq;
		this.dnuAtdSeq = dnuAtdSeq;
		this.dnuSeq = dnuSeq;
		this.seq = seq;
	}

	@Column(name = "HID_SEQ", nullable = false)
	public Short getHidSeq() {
		return this.hidSeq;
	}

	public void setHidSeq(Short hidSeq) {
		this.hidSeq = hidSeq;
	}

	@Column(name = "DNU_ATD_SEQ", nullable = false)
	public Integer getDnuAtdSeq() {
		return this.dnuAtdSeq;
	}

	public void setDnuAtdSeq(Integer dnuAtdSeq) {
		this.dnuAtdSeq = dnuAtdSeq;
	}

	@Column(name = "DNU_SEQ", nullable = false)
	public Integer getDnuSeq() {
		return this.dnuSeq;
	}

	public void setDnuSeq(Integer dnuSeq) {
		this.dnuSeq = dnuSeq;
	}

	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeq());
		umHashCodeBuilder.append(this.getHidSeq());
		umHashCodeBuilder.append(this.getDnuAtdSeq());
		umHashCodeBuilder.append(this.getDnuSeq());
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
		if (!(obj instanceof AnuHidratanteAplicadoId)) {
			return false;
		}
		AnuHidratanteAplicadoId other = (AnuHidratanteAplicadoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeq(), other.getSeq());
		umEqualsBuilder.append(this.getHidSeq(), other.getHidSeq());
		umEqualsBuilder.append(this.getDnuAtdSeq(), other.getDnuAtdSeq());
		umEqualsBuilder.append(this.getDnuSeq(), other.getDnuSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
