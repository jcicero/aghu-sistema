package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AnuConferenciaMamadeiraId generated by hbm2java
 */
@Embeddable
public class AnuConferenciaMamadeiraId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -242263860862131137L;
	private Integer hmaDmaAtdSeq;
	private Integer hmaDmaSeq;
	private Integer hmaSeq;
	private Integer seq;

	public AnuConferenciaMamadeiraId() {
	}

	public AnuConferenciaMamadeiraId(Integer hmaDmaAtdSeq, Integer hmaDmaSeq, Integer hmaSeq, Integer seq) {
		this.hmaDmaAtdSeq = hmaDmaAtdSeq;
		this.hmaDmaSeq = hmaDmaSeq;
		this.hmaSeq = hmaSeq;
		this.seq = seq;
	}

	@Column(name = "HMA_DMA_ATD_SEQ", nullable = false)
	public Integer getHmaDmaAtdSeq() {
		return this.hmaDmaAtdSeq;
	}

	public void setHmaDmaAtdSeq(Integer hmaDmaAtdSeq) {
		this.hmaDmaAtdSeq = hmaDmaAtdSeq;
	}

	@Column(name = "HMA_DMA_SEQ", nullable = false)
	public Integer getHmaDmaSeq() {
		return this.hmaDmaSeq;
	}

	public void setHmaDmaSeq(Integer hmaDmaSeq) {
		this.hmaDmaSeq = hmaDmaSeq;
	}

	@Column(name = "HMA_SEQ", nullable = false)
	public Integer getHmaSeq() {
		return this.hmaSeq;
	}

	public void setHmaSeq(Integer hmaSeq) {
		this.hmaSeq = hmaSeq;
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
		umHashCodeBuilder.append(this.getHmaDmaAtdSeq());
		umHashCodeBuilder.append(this.getHmaDmaSeq());
		umHashCodeBuilder.append(this.getHmaSeq());
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
		if (!(obj instanceof AnuConferenciaMamadeiraId)) {
			return false;
		}
		AnuConferenciaMamadeiraId other = (AnuConferenciaMamadeiraId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeq(), other.getSeq());
		umEqualsBuilder.append(this.getHmaDmaAtdSeq(), other.getHmaDmaAtdSeq());
		umEqualsBuilder.append(this.getHmaDmaSeq(), other.getHmaDmaSeq());
		umEqualsBuilder.append(this.getHmaSeq(), other.getHmaSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
