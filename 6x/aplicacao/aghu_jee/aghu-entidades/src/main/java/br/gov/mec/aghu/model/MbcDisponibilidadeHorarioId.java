package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MbcDisponibilidadeHorarioId generated by hbm2java
 */
@Embeddable
public class MbcDisponibilidadeHorarioId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4708970661619276204L;
	private Double sessionid;
	private Short seqp;

	public MbcDisponibilidadeHorarioId() {
	}

	public MbcDisponibilidadeHorarioId(Double sessionid, Short seqp) {
		this.sessionid = sessionid;
		this.seqp = seqp;
	}

	@Column(name = "SESSIONID", nullable = false, precision = 17, scale = 17)
	public Double getSessionid() {
		return this.sessionid;
	}

	public void setSessionid(Double sessionid) {
		this.sessionid = sessionid;
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
		umHashCodeBuilder.append(this.getSessionid());
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
		if (!(obj instanceof MbcDisponibilidadeHorarioId)) {
			return false;
		}
		MbcDisponibilidadeHorarioId other = (MbcDisponibilidadeHorarioId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getSessionid(), other.getSessionid());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}