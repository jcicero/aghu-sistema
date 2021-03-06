package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MbcDescricaoCirurgicaId generated by hbm2java
 */
@Embeddable
public class MbcDescricaoCirurgicaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5197089361765177565L;
	private Integer crgSeq;
	private Short seqp;

	public MbcDescricaoCirurgicaId() {
	}

	public MbcDescricaoCirurgicaId(Integer crgSeq, Short seqp) {
		this.crgSeq = crgSeq;
		this.seqp = seqp;
	}

	@Column(name = "CRG_SEQ", nullable = false)
	public Integer getCrgSeq() {
		return this.crgSeq;
	}

	public void setCrgSeq(Integer crgSeq) {
		this.crgSeq = crgSeq;
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
		umHashCodeBuilder.append(this.getCrgSeq());
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
		if (!(obj instanceof MbcDescricaoCirurgicaId)) {
			return false;
		}
		MbcDescricaoCirurgicaId other = (MbcDescricaoCirurgicaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getCrgSeq(), other.getCrgSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
