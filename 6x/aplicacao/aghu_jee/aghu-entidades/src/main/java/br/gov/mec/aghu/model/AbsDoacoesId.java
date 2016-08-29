package br.gov.mec.aghu.model;

// Generated 08/02/2010 17:25:25 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AbsDoacoesId generated by hbm2java
 */
@Embeddable
public class AbsDoacoesId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -25559536550309734L;
	private Integer bolNumero;
	private Short bolBsaCodigo;
	private Date bolData;

	public AbsDoacoesId() {
	}

	public AbsDoacoesId(Integer bolNumero, Short bolBsaCodigo, Date bolData) {
		this.bolNumero = bolNumero;
		this.bolBsaCodigo = bolBsaCodigo;
		this.bolData = bolData;
	}

	@Column(name = "BOL_NUMERO", nullable = false, precision = 7, scale = 0)
	public Integer getBolNumero() {
		return this.bolNumero;
	}

	public void setBolNumero(Integer bolNumero) {
		this.bolNumero = bolNumero;
	}

	@Column(name = "BOL_BSA_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getBolBsaCodigo() {
		return this.bolBsaCodigo;
	}

	public void setBolBsaCodigo(Short bolBsaCodigo) {
		this.bolBsaCodigo = bolBsaCodigo;
	}

	@Column(name = "BOL_DATA", nullable = false, length = 7)
	public Date getBolData() {
		return this.bolData;
	}

	public void setBolData(Date bolData) {
		this.bolData = bolData;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AbsDoacoesId)) {
			return false;
		}
		AbsDoacoesId castOther = (AbsDoacoesId) other;

		return this.getBolNumero() != null && this.getBolNumero().equals(castOther.getBolNumero()) && 
				this.getBolBsaCodigo() != null && this.getBolBsaCodigo().equals(castOther.getBolBsaCodigo()) &&
				this.getBolData() != null && this.getBolData().equals(castOther.getBolData());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (this.getBolNumero() == null ? 0 : this.getBolNumero().hashCode());
		result = 37 * result + (this.getBolBsaCodigo() == null ? 0 : this.getBolBsaCodigo().hashCode());
		result = 37 * result + (this.getBolData() == null ? 0 : this.getBolData().hashCode());
		return result;
	}

}
