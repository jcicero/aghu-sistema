package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AghStatusSgaId generated by hbm2java
 */
@Embeddable
public class AghStatusSgaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5243492502742358822L;
	private Double tamSgaMb;
	private Double livre;
	private Date data;
	private Character tipo;
	private Integer version;

	public AghStatusSgaId() {
	}

	public AghStatusSgaId(Double tamSgaMb, Double livre, Date data, Integer version) {
		this.tamSgaMb = tamSgaMb;
		this.livre = livre;
		this.data = data;
		this.version = version;
	}

	public AghStatusSgaId(Double tamSgaMb, Double livre, Date data, Character tipo, Integer version) {
		this.tamSgaMb = tamSgaMb;
		this.livre = livre;
		this.data = data;
		this.tipo = tipo;
		this.version = version;
	}

	@Column(name = "TAM_SGA_MB", nullable = false, precision = 17, scale = 17)
	public Double getTamSgaMb() {
		return this.tamSgaMb;
	}

	public void setTamSgaMb(Double tamSgaMb) {
		this.tamSgaMb = tamSgaMb;
	}

	@Column(name = "LIVRE", nullable = false, precision = 17, scale = 17)
	public Double getLivre() {
		return this.livre;
	}

	public void setLivre(Double livre) {
		this.livre = livre;
	}

	@Column(name = "DATA", nullable = false, length = 29)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Column(name = "TIPO", length = 1)
	public Character getTipo() {
		return this.tipo;
	}

	public void setTipo(Character tipo) {
		this.tipo = tipo;
	}

	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}



	


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getData());
		umHashCodeBuilder.append(this.getTipo());
		umHashCodeBuilder.append(this.getLivre());
		umHashCodeBuilder.append(this.getTamSgaMb());
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
		if (!(obj instanceof AghStatusSgaId)) {
			return false;
		}
		AghStatusSgaId other = (AghStatusSgaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getData(), other.getData());
		umEqualsBuilder.append(this.getTipo(), other.getTipo());
		umEqualsBuilder.append(this.getLivre(), other.getLivre());
		umEqualsBuilder.append(this.getTamSgaMb(), other.getTamSgaMb());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
