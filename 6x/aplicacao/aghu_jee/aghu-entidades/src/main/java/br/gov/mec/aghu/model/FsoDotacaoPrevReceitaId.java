package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FsoDotacaoPrevReceitaId generated by hbm2java
 */
@Embeddable
public class FsoDotacaoPrevReceitaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7643969572642945587L;
	private Short gnpTabCodigo;
	private Integer gnpCodigo;
	private Date exoExercicio;
	private Long frfCodigo;

	public FsoDotacaoPrevReceitaId() {
	}

	public FsoDotacaoPrevReceitaId(Short gnpTabCodigo, Integer gnpCodigo, Date exoExercicio, Long frfCodigo) {
		this.gnpTabCodigo = gnpTabCodigo;
		this.gnpCodigo = gnpCodigo;
		this.exoExercicio = exoExercicio;
		this.frfCodigo = frfCodigo;
	}

	@Column(name = "GNP_TAB_CODIGO", nullable = false)
	public Short getGnpTabCodigo() {
		return this.gnpTabCodigo;
	}

	public void setGnpTabCodigo(Short gnpTabCodigo) {
		this.gnpTabCodigo = gnpTabCodigo;
	}

	@Column(name = "GNP_CODIGO", nullable = false)
	public Integer getGnpCodigo() {
		return this.gnpCodigo;
	}

	public void setGnpCodigo(Integer gnpCodigo) {
		this.gnpCodigo = gnpCodigo;
	}

	@Column(name = "EXO_EXERCICIO", nullable = false, length = 29)
	public Date getExoExercicio() {
		return this.exoExercicio;
	}

	public void setExoExercicio(Date exoExercicio) {
		this.exoExercicio = exoExercicio;
	}

	@Column(name = "FRF_CODIGO", nullable = false)
	public Long getFrfCodigo() {
		return this.frfCodigo;
	}

	public void setFrfCodigo(Long frfCodigo) {
		this.frfCodigo = frfCodigo;
	}






	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getFrfCodigo());
		umHashCodeBuilder.append(this.getGnpTabCodigo());
		umHashCodeBuilder.append(this.getGnpCodigo());
		umHashCodeBuilder.append(this.getExoExercicio());
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
		if (!(obj instanceof FsoDotacaoPrevReceitaId)) {
			return false;
		}
		FsoDotacaoPrevReceitaId other = (FsoDotacaoPrevReceitaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getFrfCodigo(), other.getFrfCodigo());
		umEqualsBuilder.append(this.getGnpTabCodigo(), other.getGnpTabCodigo());
		umEqualsBuilder.append(this.getGnpCodigo(), other.getGnpCodigo());
		umEqualsBuilder.append(this.getExoExercicio(), other.getExoExercicio());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
