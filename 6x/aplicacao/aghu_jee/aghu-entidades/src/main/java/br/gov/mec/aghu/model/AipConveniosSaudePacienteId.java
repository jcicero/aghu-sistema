package br.gov.mec.aghu.model;

// Generated 15/12/2009 11:13:34 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AipConveniosSaudePacienteId generated by hbm2java
 */
@Embeddable

public class AipConveniosSaudePacienteId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5507216981323532140L;
	private Integer pacCodigo;
	private Short seq;

	public AipConveniosSaudePacienteId() {
	}

	public AipConveniosSaudePacienteId(Integer pacCodigo, Short seq) {
		this.pacCodigo = pacCodigo;
		this.seq = seq;
	}

	@Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "SEQ", nullable = false, precision = 3, scale = 0)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AipConveniosSaudePacienteId)) {
			return false;
		}
		AipConveniosSaudePacienteId castOther = (AipConveniosSaudePacienteId) other;

		return (this.getPacCodigo() == castOther.getPacCodigo())
				&& (this.getSeq() == castOther.getSeq());
	}

	@Override
	public int hashCode() {		
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getPacCodigo());
		umHashCodeBuilder.append(this.getSeq());
		return umHashCodeBuilder.toHashCode();
	}

}
