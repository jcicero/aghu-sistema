package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * RapPppRespRegAmbientalId generated by hbm2java
 */
@Embeddable
public class RapPppRespRegAmbientalId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8971290589360137212L;
	private Date dtInicio;
	private Integer serMatricula;
	private Short serVinCodigo;

	public RapPppRespRegAmbientalId() {
	}

	public RapPppRespRegAmbientalId(Date dtInicio, Integer serMatricula, Short serVinCodigo) {
		this.dtInicio = dtInicio;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "DT_INICIO", nullable = false, length = 29)
	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	@Column(name = "SER_MATRICULA", nullable = false)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSerMatricula());
		umHashCodeBuilder.append(this.getSerVinCodigo());
		umHashCodeBuilder.append(this.getDtInicio());
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
		if (!(obj instanceof RapPppRespRegAmbientalId)) {
			return false;
		}
		RapPppRespRegAmbientalId other = (RapPppRespRegAmbientalId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSerMatricula(), other.getSerMatricula());
		umEqualsBuilder.append(this.getSerVinCodigo(), other.getSerVinCodigo());
		umEqualsBuilder.append(this.getDtInicio(), other.getDtInicio());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
