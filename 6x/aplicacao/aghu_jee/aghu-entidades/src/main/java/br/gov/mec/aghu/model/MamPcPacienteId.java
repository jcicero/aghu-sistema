package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MamPcPacienteId generated by hbm2java
 */
@Embeddable
public class MamPcPacienteId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5266890966241100731L;
	private Integer pleSeq;
	private Integer seqp;

	public MamPcPacienteId() {
	}

	public MamPcPacienteId(Integer pleSeq, Integer seqp) {
		this.pleSeq = pleSeq;
		this.seqp = seqp;
	}

	@Column(name = "PLE_SEQ", nullable = false)
	public Integer getPleSeq() {
		return this.pleSeq;
	}

	public void setPleSeq(Integer pleSeq) {
		this.pleSeq = pleSeq;
	}

	@Column(name = "SEQP", nullable = false)
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
		umHashCodeBuilder.append(this.getSeqp());
		umHashCodeBuilder.append(this.getPleSeq());
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
		if (!(obj instanceof MamPcPacienteId)) {
			return false;
		}
		MamPcPacienteId other = (MamPcPacienteId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getPleSeq(), other.getPleSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
