package br.gov.mec.aghu.model;

// Generated 13/02/2012 14:27:08 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelEquipComandoLabwideId generated by hbm2java
 */
@Embeddable
public class AelEquipComandoLabwideId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3008667461212812704L;
	private Short claSeq;
	private Short equSeq;

	public AelEquipComandoLabwideId() {
	}

	public AelEquipComandoLabwideId(Short claSeq, Short equSeq) {
		this.claSeq = claSeq;
		this.equSeq = equSeq;
	}

	@Column(name = "CLA_SEQ", nullable = false)
	public Short getClaSeq() {
		return this.claSeq;
	}

	public void setClaSeq(Short claSeq) {
		this.claSeq = claSeq;
	}

	@Column(name = "EQU_SEQ", nullable = false)
	public Short getEquSeq() {
		return this.equSeq;
	}

	public void setEquSeq(Short equSeq) {
		this.equSeq = equSeq;
	}

	public boolean equals(Object other) {
		if ((this == other)){
			return true;
		}
		
		if ((other == null)){
			return false;
		}
		if (!(other instanceof AelEquipComandoLabwideId)){
			return false;
		}
			
		AelEquipComandoLabwideId castOther = (AelEquipComandoLabwideId) other;

		return (this.getClaSeq() == castOther.getClaSeq())
				&& (this.getEquSeq() == castOther.getEquSeq());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getClaSeq();
		result = 37 * result + this.getEquSeq();
		return result;
	}

}
