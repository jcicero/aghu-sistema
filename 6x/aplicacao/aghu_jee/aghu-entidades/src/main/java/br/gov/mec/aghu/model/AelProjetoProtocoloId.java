package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelProjetoProtocoloId generated by hbm2java
 */
@Embeddable
public class AelProjetoProtocoloId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8989634541381713156L;
	private Integer pjqSeq;
	private Short seqp;

	public AelProjetoProtocoloId() {
	}

	public AelProjetoProtocoloId(Integer pjqSeq, Short seqp) {
		this.pjqSeq = pjqSeq;
		this.seqp = seqp;
	}

	@Column(name = "PJQ_SEQ", nullable = false)
	public Integer getPjqSeq() {
		return this.pjqSeq;
	}

	public void setPjqSeq(Integer pjqSeq) {
		this.pjqSeq = pjqSeq;
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
		umHashCodeBuilder.append(this.getPjqSeq());
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
		if (!(obj instanceof AelProjetoProtocoloId)) {
			return false;
		}
		AelProjetoProtocoloId other = (AelProjetoProtocoloId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getPjqSeq(), other.getPjqSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
