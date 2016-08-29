package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FcpRetencaoAliquotaId generated by hbm2java
 */
@Embeddable
public class FcpRetencaoAliquotaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1027309284611662945L;
	private Integer friCodigo;
	private String imposto;
	private Short numero;
	private Date dtInicioValidade;

	public FcpRetencaoAliquotaId() {
	}

	public FcpRetencaoAliquotaId(Integer friCodigo, String imposto, Short numero, Date dtInicioValidade) {
		this.friCodigo = friCodigo;
		this.imposto = imposto;
		this.numero = numero;
		this.dtInicioValidade = dtInicioValidade;
	}

	@Column(name = "FRI_CODIGO", nullable = false)
	public Integer getFriCodigo() {
		return this.friCodigo;
	}

	public void setFriCodigo(Integer friCodigo) {
		this.friCodigo = friCodigo;
	}

	@Column(name = "IMPOSTO", nullable = false, length = 10)
	@Length(max = 10)
	public String getImposto() {
		return this.imposto;
	}

	public void setImposto(String imposto) {
		this.imposto = imposto;
	}

	@Column(name = "NUMERO", nullable = false)
	public Short getNumero() {
		return this.numero;
	}

	public void setNumero(Short numero) {
		this.numero = numero;
	}

	@Column(name = "DT_INICIO_VALIDADE", nullable = false, length = 29)
	public Date getDtInicioValidade() {
		return this.dtInicioValidade;
	}

	public void setDtInicioValidade(Date dtInicioValidade) {
		this.dtInicioValidade = dtInicioValidade;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getNumero());
		umHashCodeBuilder.append(this.getDtInicioValidade());
		umHashCodeBuilder.append(this.getFriCodigo());
		umHashCodeBuilder.append(this.getImposto());
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
		if (!(obj instanceof FcpRetencaoAliquotaId)) {
			return false;
		}
		FcpRetencaoAliquotaId other = (FcpRetencaoAliquotaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getNumero(), other.getNumero());
		umEqualsBuilder.append(this.getDtInicioValidade(), other.getDtInicioValidade());
		umEqualsBuilder.append(this.getFriCodigo(), other.getFriCodigo());
		umEqualsBuilder.append(this.getImposto(), other.getImposto());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
