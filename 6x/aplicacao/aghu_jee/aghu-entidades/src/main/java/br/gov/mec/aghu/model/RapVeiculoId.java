package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * RapVeiculoId generated by hbm2java
 */
@Embeddable
public class RapVeiculoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2517308517433319033L;
	private String placa;
	private Integer pesCodigo;

	public RapVeiculoId() {
	}

	public RapVeiculoId(String placa, Integer pesCodigo) {
		this.placa = placa;
		this.pesCodigo = pesCodigo;
	}

	@Column(name = "PLACA", nullable = false, length = 7)
	@Length(max = 7)
	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@Column(name = "PES_CODIGO", nullable = false)
	public Integer getPesCodigo() {
		return this.pesCodigo;
	}

	public void setPesCodigo(Integer pesCodigo) {
		this.pesCodigo = pesCodigo;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getPesCodigo());
		umHashCodeBuilder.append(this.getPlaca());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof RapVeiculoId)) {
			return false;
		}
		RapVeiculoId other = (RapVeiculoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getPesCodigo(), other.getPesCodigo());
		umEqualsBuilder.append(this.getPlaca(), other.getPlaca());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
