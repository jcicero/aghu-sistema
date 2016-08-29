package br.gov.mec.aghu.model;

// Generated 26/02/2010 17:37:25 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * McoMedicamentoTrabPartosId generated by hbm2java
 */
@Embeddable
public class McoMedicamentoTrabPartosId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8976656729563421107L;
	private Integer gsoPacCodigo;
	private Short gsoSeqp;
	private Integer medMatCodigo;

	public McoMedicamentoTrabPartosId() {
	}

	public McoMedicamentoTrabPartosId(Integer gsoPacCodigo, Short gsoSeqp,
			Integer medMatCodigo) {
		this.gsoPacCodigo = gsoPacCodigo;
		this.gsoSeqp = gsoSeqp;
		this.medMatCodigo = medMatCodigo;
	}

	@Column(name = "GSO_PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	public Integer getGsoPacCodigo() {
		return this.gsoPacCodigo;
	}

	public void setGsoPacCodigo(Integer gsoPacCodigo) {
		this.gsoPacCodigo = gsoPacCodigo;
	}

	@Column(name = "GSO_SEQP", nullable = false, precision = 3, scale = 0)
	public Short getGsoSeqp() {
		return this.gsoSeqp;
	}

	public void setGsoSeqp(Short gsoSeqp) {
		this.gsoSeqp = gsoSeqp;
	}

	@Column(name = "MED_MAT_CODIGO", nullable = false, precision = 6, scale = 0)
	public Integer getMedMatCodigo() {
		return this.medMatCodigo;
	}

	public void setMedMatCodigo(Integer medMatCodigo) {
		this.medMatCodigo = medMatCodigo;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof McoMedicamentoTrabPartosId)) {
			return false;
		}
		McoMedicamentoTrabPartosId castOther = (McoMedicamentoTrabPartosId) other;

		return ((getGsoPacCodigo() == castOther.getGsoPacCodigo())
				|| (getGsoPacCodigo() != null && getGsoPacCodigo().equals(castOther.getGsoPacCodigo())))
			&& ((getGsoSeqp() == castOther.getGsoSeqp())
				|| (getGsoSeqp() != null && getGsoSeqp().equals(castOther.getGsoSeqp())))
			&& ((getMedMatCodigo() == castOther.getMedMatCodigo())
				|| (getMedMatCodigo() != null && getMedMatCodigo().equals(castOther.getMedMatCodigo())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getGsoPacCodigo() == null ? 0 : getGsoPacCodigo().hashCode());
		result = 37 * result + (getGsoSeqp() == null ? 0 : getGsoSeqp().hashCode());
		result = 37 * result + (getMedMatCodigo() == null ? 0 : getMedMatCodigo().hashCode());
		
		return result;
	}

}
