package br.gov.mec.aghu.model;

// Generated 23/12/2010 11:18:44 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * VRapServidorConselhoId generated by hbm2java
 */
@Embeddable
public class VRapServidorConselhoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3404989702771923172L;
	private Integer matricula;
	private Short vinCodigo;


	public VRapServidorConselhoId() {
	}

	public VRapServidorConselhoId(Integer matricula, Short vinCodigo) {
		this.matricula = matricula;
		this.vinCodigo = vinCodigo;
	}

	@Column(name = "MATRICULA", nullable = false, precision = 7, scale = 0)
	public Integer getMatricula() {
		return this.matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Column(name = "VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getVinCodigo() {
		return this.vinCodigo;
	}

	public void setVinCodigo(Short vinCodigo) {
		this.vinCodigo = vinCodigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricula;
		result = prime * result + vinCodigo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		VRapServidorConselhoId other = (VRapServidorConselhoId) obj;
		if (matricula != other.matricula) {
			return false;
		}
		if (vinCodigo != other.vinCodigo) {
			return false;
		}
		return true;
	}

	

}
