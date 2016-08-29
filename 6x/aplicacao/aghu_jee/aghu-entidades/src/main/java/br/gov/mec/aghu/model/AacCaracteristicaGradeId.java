package br.gov.mec.aghu.model;

// Generated 22/03/2011 09:37:20 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AacCaracteristicaGradesId generated by hbm2java
 */

@Embeddable
public class AacCaracteristicaGradeId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8708465036914271429L;
	private Integer grdSeq;
	private String caracteristica;

	public AacCaracteristicaGradeId() {
	}

	public AacCaracteristicaGradeId(Integer grdSeq, String caracteristica) {
		this.grdSeq = grdSeq;
		this.caracteristica = caracteristica;
	}

	@Column(name = "GRD_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getGrdSeq() {
		return this.grdSeq;
	}

	public void setGrdSeq(Integer grdSeq) {
		this.grdSeq = grdSeq;
	}

	@Column(name = "CARACTERISTICA", nullable = false, length = 30)
	@Length(max = 30)
	public String getCaracteristica() {
		return this.caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AacCaracteristicaGradeId)) {
			return false;
		}
		AacCaracteristicaGradeId castOther = (AacCaracteristicaGradeId) other;

		return (this.getGrdSeq() == castOther.getGrdSeq())
				&& ((this.getCaracteristica() == castOther.getCaracteristica()) || (this
						.getCaracteristica() != null
						&& castOther.getCaracteristica() != null && this
						.getCaracteristica().equals(
								castOther.getCaracteristica())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getGrdSeq();
		result = 37
				* result
				+ (getCaracteristica() == null ? 0 : this.getCaracteristica()
						.hashCode());
		return result;
	}

}