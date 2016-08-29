package br.gov.mec.aghu.model;

// Generated 25/11/2010 10:49:28 by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * VMpmOtrProcedSumId generated by hbm2java
 */

@Embeddable
public class VMpmOtrProcedSumId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1397355716168137713L;
	private String codigo;

	public VMpmOtrProcedSumId() {
	}

	public VMpmOtrProcedSumId(String codigo) {

		this.codigo = codigo;
		
	}

	@Column(name = "CODIGO", length = 41)
	@Length(max = 41)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof VMpmOtrProcedSumId)) {
			return false;
		}
		VMpmOtrProcedSumId castOther = (VMpmOtrProcedSumId) other;

		return ((this.getCodigo().equals(castOther.getCodigo())) || (this
				.getCodigo() != null && castOther.getCodigo() != null && this
				.getCodigo().equals(castOther.getCodigo())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCodigo() == null ? 0 : this.getCodigo().hashCode());
		
		return result;
	}

}