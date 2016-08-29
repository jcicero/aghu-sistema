package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * RarBancaExaminadoraId generated by hbm2java
 */
@Embeddable
public class RarBancaExaminadoraId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2775237647740231064L;
	private Integer pgaSeq;
	private Short seq;

	public RarBancaExaminadoraId() {
	}

	public RarBancaExaminadoraId(Integer pgaSeq, Short seq) {
		this.pgaSeq = pgaSeq;
		this.seq = seq;
	}

	@Column(name = "PGA_SEQ", nullable = false)
	public Integer getPgaSeq() {
		return this.pgaSeq;
	}

	public void setPgaSeq(Integer pgaSeq) {
		this.pgaSeq = pgaSeq;
	}

	@Column(name = "SEQ", nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeq());
		umHashCodeBuilder.append(this.getPgaSeq());
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
		if (!(obj instanceof RarBancaExaminadoraId)) {
			return false;
		}
		RarBancaExaminadoraId other = (RarBancaExaminadoraId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeq(), other.getSeq());
		umEqualsBuilder.append(this.getPgaSeq(), other.getPgaSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}