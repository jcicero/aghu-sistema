package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * SceRelMatItemNfId generated by hbm2java
 */
@Embeddable
public class SceRelMatItemNfId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2606154302003653784L;
	private Integer frnNumero;
	private Integer matCodigo;
	private String codigoMatNf;

	public SceRelMatItemNfId() {
	}

	public SceRelMatItemNfId(Integer frnNumero, Integer matCodigo, String codigoMatNf) {
		this.frnNumero = frnNumero;
		this.matCodigo = matCodigo;
		this.codigoMatNf = codigoMatNf;
	}

	@Column(name = "FRN_NUMERO", nullable = false)
	public Integer getFrnNumero() {
		return this.frnNumero;
	}

	public void setFrnNumero(Integer frnNumero) {
		this.frnNumero = frnNumero;
	}

	@Column(name = "MAT_CODIGO", nullable = false)
	public Integer getMatCodigo() {
		return this.matCodigo;
	}

	public void setMatCodigo(Integer matCodigo) {
		this.matCodigo = matCodigo;
	}

	@Column(name = "CODIGO_MAT_NF", nullable = false, length = 14)
	@Length(max = 14)
	public String getCodigoMatNf() {
		return this.codigoMatNf;
	}

	public void setCodigoMatNf(String codigoMatNf) {
		this.codigoMatNf = codigoMatNf;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getFrnNumero());
		umHashCodeBuilder.append(this.getMatCodigo());
		umHashCodeBuilder.append(this.getCodigoMatNf());
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
		if (!(obj instanceof SceRelMatItemNfId)) {
			return false;
		}
		SceRelMatItemNfId other = (SceRelMatItemNfId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getFrnNumero(), other.getFrnNumero());
		umEqualsBuilder.append(this.getMatCodigo(), other.getMatCodigo());
		umEqualsBuilder.append(this.getCodigoMatNf(), other.getCodigoMatNf());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
