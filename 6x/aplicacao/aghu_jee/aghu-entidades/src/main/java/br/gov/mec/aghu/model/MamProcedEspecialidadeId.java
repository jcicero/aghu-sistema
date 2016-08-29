package br.gov.mec.aghu.model;

// Generated 24/06/2011 18:11:15 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MamProcedEspecialidadesId generated by hbm2java
 */
@Embeddable
public class MamProcedEspecialidadeId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5858040751433741916L;
	private Short espSeq;
	private Integer prdSeq;

	public MamProcedEspecialidadeId() {
	}

	public MamProcedEspecialidadeId(Short espSeq, Integer prdSeq) {
		this.espSeq = espSeq;
		this.prdSeq = prdSeq;
	}

	@Column(name = "ESP_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getEspSeq() {
		return this.espSeq;
	}

	public void setEspSeq(Short espSeq) {
		this.espSeq = espSeq;
	}

	@Column(name = "PRD_SEQ", nullable = false, precision = 6, scale = 0)
	public Integer getPrdSeq() {
		return this.prdSeq;
	}

	public void setPrdSeq(Integer prdSeq) {
		this.prdSeq = prdSeq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)){
			return true;
		}
		if ((other == null)){
			return false;
		}
		if (!(other instanceof MamProcedEspecialidadeId)){
			return false;
		}
		MamProcedEspecialidadeId castOther = (MamProcedEspecialidadeId) other;

		return (this.getEspSeq() == castOther.getEspSeq())
				&& (this.getPrdSeq() == castOther.getPrdSeq());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEspSeq();
		result = 37 * result + this.getPrdSeq();
		return result;
	}

}
