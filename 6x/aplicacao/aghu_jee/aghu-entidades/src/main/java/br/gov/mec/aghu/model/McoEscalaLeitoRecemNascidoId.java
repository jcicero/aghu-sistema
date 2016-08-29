package br.gov.mec.aghu.model;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
* McoEscalaLeitoRnsId generated by hbm2java
*/
@Embeddable
public class McoEscalaLeitoRecemNascidoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3053297284825353972L;

	private String leitoID;
	
	private Integer matriculaServidorResponsavel;
	
	private Short vinCodigoServidorResponsavel;

	public McoEscalaLeitoRecemNascidoId() {
	}

	public McoEscalaLeitoRecemNascidoId(String leitoID, Integer matriculaServidorResponsavel,
			Short vinCodigoServidorResponsavel) {
		this.leitoID = leitoID;
		this.matriculaServidorResponsavel = matriculaServidorResponsavel;
		this.vinCodigoServidorResponsavel = vinCodigoServidorResponsavel;
	}
	
	@Column(name = "LTO_LTO_ID", nullable = false, length = 14)
	@NotNull
	@Length(max = 14)
	public String getLeitoID() {
		return leitoID;
	}

	public void setLeitoID(String leitoID) {
		this.leitoID = leitoID;
	}

	@Column(name = "SER_MATRICULA_RESP", nullable = false, precision = 7, scale = 0)
	public Integer getMatriculaServidorResponsavel() {
		return matriculaServidorResponsavel;
	}

	public void setMatriculaServidorResponsavel(Integer matriculaServidorResponsavel) {
		this.matriculaServidorResponsavel = matriculaServidorResponsavel;
	}

	@Column(name = "SER_VIN_CODIGO_RESP", nullable = false, precision = 3, scale = 0)
	public Short getVinCodigoServidorResponsavel() {
		return vinCodigoServidorResponsavel;
	}

	public void setVinCodigoServidorResponsavel(Short vinCodigoServidorResponsavel) {
		this.vinCodigoServidorResponsavel = vinCodigoServidorResponsavel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((leitoID == null) ? 0 : leitoID.hashCode());
		result = prime
				* result
				+ ((matriculaServidorResponsavel == null) ? 0
						: matriculaServidorResponsavel.hashCode());
		result = prime
				* result
				+ ((vinCodigoServidorResponsavel == null) ? 0
						: vinCodigoServidorResponsavel.hashCode());
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
		McoEscalaLeitoRecemNascidoId other = (McoEscalaLeitoRecemNascidoId) obj;
		if (leitoID == null) {
			if (other.leitoID != null) {
				return false;
			}
		} else if (!leitoID.equals(other.leitoID)) {
			return false;
		}
		if (matriculaServidorResponsavel == null) {
			if (other.matriculaServidorResponsavel != null) {
				return false;
			}
		} else if (!matriculaServidorResponsavel
				.equals(other.matriculaServidorResponsavel)) {
			return false;
		}
		if (vinCodigoServidorResponsavel == null) {
			if (other.vinCodigoServidorResponsavel != null) {
				return false;
			}
		} else if (!vinCodigoServidorResponsavel
				.equals(other.vinCodigoServidorResponsavel)) {
			return false;
		}
		return true;
	}

}

