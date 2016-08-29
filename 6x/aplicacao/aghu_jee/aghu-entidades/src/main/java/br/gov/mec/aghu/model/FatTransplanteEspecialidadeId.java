package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatTransplanteEspecialidadesId generated by hbm2java
 */
@Embeddable
public class FatTransplanteEspecialidadeId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5569126242039995046L;
	private String ttrCodigo;
	private Short espSeq;

	public FatTransplanteEspecialidadeId() {
	}

	public FatTransplanteEspecialidadeId(String ttrCodigo, Short espSeq) {
		this.ttrCodigo = ttrCodigo;
		this.espSeq = espSeq;
	}

	@Column(name = "TTR_CODIGO", nullable = false, length = 10)
	@Length(max = 10)
	public String getTtrCodigo() {
		return this.ttrCodigo;
	}

	public void setTtrCodigo(String ttrCodigo) {
		this.ttrCodigo = ttrCodigo;
	}

	@Column(name = "ESP_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getEspSeq() {
		return this.espSeq;
	}

	public void setEspSeq(Short espSeq) {
		this.espSeq = espSeq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)){
			return true;
		}
		if ((other == null)){
			return false;
		}
		if (!(other instanceof FatTransplanteEspecialidadeId)){
			return false;
		}
		FatTransplanteEspecialidadeId castOther = (FatTransplanteEspecialidadeId) other;

		return ((this.getTtrCodigo() == castOther.getTtrCodigo()) || (this
				.getTtrCodigo() != null
				&& castOther.getTtrCodigo() != null && this.getTtrCodigo()
				.equals(castOther.getTtrCodigo())))
				&& this.getEspSeq().equals(castOther.getEspSeq());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTtrCodigo() == null ? 0 : this.getTtrCodigo().hashCode());
		result = 37 * result + this.getEspSeq();
		return result;
	}

}
