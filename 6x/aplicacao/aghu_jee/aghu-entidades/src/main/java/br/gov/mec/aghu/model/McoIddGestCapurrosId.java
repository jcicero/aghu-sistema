package br.gov.mec.aghu.model;

// Generated 26/02/2010 17:37:25 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import javax.validation.constraints.NotNull;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * McoIddGestCapurrosId generated by hbm2java
 */
@Embeddable
public class McoIddGestCapurrosId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5793874117680143069L;
	private Integer pacCodigo;
	private Integer serMatricula;
	private Short serVinCodigo;

	public McoIddGestCapurrosId() {
	}

	public McoIddGestCapurrosId(Integer pacCodigo, Integer serMatricula,
			Short serVinCodigo) {
		this.pacCodigo = pacCodigo;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	@NotNull
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)
	@NotNull
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	@NotNull
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof McoIddGestCapurrosId)) {
			return false;
		}
		McoIddGestCapurrosId castOther = (McoIddGestCapurrosId) other;

		return ((getPacCodigo() == castOther.getPacCodigo()) 
				|| (getPacCodigo() != null && getPacCodigo().equals(castOther.getPacCodigo())))
			&& ((getSerMatricula() == castOther.getSerMatricula())
				|| (getSerMatricula() != null && getSerMatricula().equals(castOther.getSerMatricula())))
			&& ((getSerVinCodigo() == castOther.getSerVinCodigo())
					|| (getSerVinCodigo() != null && getSerVinCodigo().equals(castOther.getSerVinCodigo())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPacCodigo() == null ? 0 : getPacCodigo().hashCode());
		result = 37 * result + (getSerMatricula() == null ? 0 : getSerMatricula().hashCode());
		result = 37 * result + (getSerVinCodigo() == null ? 0 : getSerVinCodigo().hashCode());
		
		return result;
	}

}
