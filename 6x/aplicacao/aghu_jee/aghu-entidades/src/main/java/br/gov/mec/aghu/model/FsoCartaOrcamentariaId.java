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
 * FsoCartaOrcamentariaId generated by hbm2java
 */
@Embeddable
public class FsoCartaOrcamentariaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7950668243893783975L;
	private Date exoExercicio;
	private Integer pltLctNumero;
	private String tipo;
	private Integer numero;

	public FsoCartaOrcamentariaId() {
	}

	public FsoCartaOrcamentariaId(Date exoExercicio, Integer pltLctNumero, String tipo, Integer numero) {
		this.exoExercicio = exoExercicio;
		this.pltLctNumero = pltLctNumero;
		this.tipo = tipo;
		this.numero = numero;
	}

	@Column(name = "EXO_EXERCICIO", nullable = false, length = 29)
	public Date getExoExercicio() {
		return this.exoExercicio;
	}

	public void setExoExercicio(Date exoExercicio) {
		this.exoExercicio = exoExercicio;
	}

	@Column(name = "PLT_LCT_NUMERO", nullable = false)
	public Integer getPltLctNumero() {
		return this.pltLctNumero;
	}

	public void setPltLctNumero(Integer pltLctNumero) {
		this.pltLctNumero = pltLctNumero;
	}

	@Column(name = "TIPO", nullable = false, length = 1)
	@Length(max = 1)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "NUMERO", nullable = false)
	public Integer getNumero() {
		return this.numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getNumero());
		umHashCodeBuilder.append(this.getTipo());
		umHashCodeBuilder.append(this.getExoExercicio());
		umHashCodeBuilder.append(this.getPltLctNumero());
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
		if (!(obj instanceof FsoCartaOrcamentariaId)) {
			return false;
		}
		FsoCartaOrcamentariaId other = (FsoCartaOrcamentariaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getNumero(), other.getNumero());
		umEqualsBuilder.append(this.getTipo(), other.getTipo());
		umEqualsBuilder.append(this.getExoExercicio(), other.getExoExercicio());
		umEqualsBuilder.append(this.getPltLctNumero(), other.getPltLctNumero());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
