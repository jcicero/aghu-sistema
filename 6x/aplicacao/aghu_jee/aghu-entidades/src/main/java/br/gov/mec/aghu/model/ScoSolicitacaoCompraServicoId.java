package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * ScoSolicitacaoCompraServicoId generated by hbm2java
 */
@Embeddable
public class ScoSolicitacaoCompraServicoId implements EntityCompositeId {

	private static final long serialVersionUID = -3838503144023547326L;
	private Integer slcNumero;
	private Integer slsNumero;

	public ScoSolicitacaoCompraServicoId() {
	}

	public ScoSolicitacaoCompraServicoId(Integer slcNumero, Integer slsNumero) {
		this.slcNumero = slcNumero;
		this.slsNumero = slsNumero;
	}

	@Column(name = "SLC_NUMERO", nullable = false)
	public Integer getSlcNumero() {
		return this.slcNumero;
	}

	public void setSlcNumero(Integer slcNumero) {
		this.slcNumero = slcNumero;
	}

	@Column(name = "SLS_NUMERO", nullable = false)
	public Integer getSlsNumero() {
		return this.slsNumero;
	}

	public void setSlsNumero(Integer slsNumero) {
		this.slsNumero = slsNumero;
	}

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSlcNumero());
		umHashCodeBuilder.append(this.getSlsNumero());
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
		if (!(obj instanceof ScoSolicitacaoCompraServicoId)) {
			return false;
		}
		ScoSolicitacaoCompraServicoId other = (ScoSolicitacaoCompraServicoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSlcNumero(), other.getSlcNumero());
		umEqualsBuilder.append(this.getSlsNumero(), other.getSlsNumero());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
}