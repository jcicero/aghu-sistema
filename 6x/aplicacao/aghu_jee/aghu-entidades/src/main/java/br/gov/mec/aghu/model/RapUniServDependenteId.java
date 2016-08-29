package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * RapUniServDependenteId generated by hbm2java
 */
@Embeddable
public class RapUniServDependenteId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4269759650884791008L;
	private Integer sadSerMatricula;
	private Short sadSerVinCodigo;
	private Short sadSeqp;
	private Integer depPesCodigo;
	private Integer depCodigo;
	private Date dtInicio;

	public RapUniServDependenteId() {
	}

	public RapUniServDependenteId(Integer sadSerMatricula, Short sadSerVinCodigo, Short sadSeqp, Integer depPesCodigo, Integer depCodigo,
			Date dtInicio) {
		this.sadSerMatricula = sadSerMatricula;
		this.sadSerVinCodigo = sadSerVinCodigo;
		this.sadSeqp = sadSeqp;
		this.depPesCodigo = depPesCodigo;
		this.depCodigo = depCodigo;
		this.dtInicio = dtInicio;
	}

	@Column(name = "SAD_SER_MATRICULA", nullable = false)
	public Integer getSadSerMatricula() {
		return this.sadSerMatricula;
	}

	public void setSadSerMatricula(Integer sadSerMatricula) {
		this.sadSerMatricula = sadSerMatricula;
	}

	@Column(name = "SAD_SER_VIN_CODIGO", nullable = false)
	public Short getSadSerVinCodigo() {
		return this.sadSerVinCodigo;
	}

	public void setSadSerVinCodigo(Short sadSerVinCodigo) {
		this.sadSerVinCodigo = sadSerVinCodigo;
	}

	@Column(name = "SAD_SEQP", nullable = false)
	public Short getSadSeqp() {
		return this.sadSeqp;
	}

	public void setSadSeqp(Short sadSeqp) {
		this.sadSeqp = sadSeqp;
	}

	@Column(name = "DEP_PES_CODIGO", nullable = false)
	public Integer getDepPesCodigo() {
		return this.depPesCodigo;
	}

	public void setDepPesCodigo(Integer depPesCodigo) {
		this.depPesCodigo = depPesCodigo;
	}

	@Column(name = "DEP_CODIGO", nullable = false)
	public Integer getDepCodigo() {
		return this.depCodigo;
	}

	public void setDepCodigo(Integer depCodigo) {
		this.depCodigo = depCodigo;
	}

	@Column(name = "DT_INICIO", nullable = false, length = 29)
	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getDtInicio());
		umHashCodeBuilder.append(this.getSadSerMatricula());
		umHashCodeBuilder.append(this.getSadSerVinCodigo());
		umHashCodeBuilder.append(this.getSadSeqp());
		umHashCodeBuilder.append(this.getDepPesCodigo());
		umHashCodeBuilder.append(this.getDepCodigo());
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
		if (!(obj instanceof RapUniServDependenteId)) {
			return false;
		}
		RapUniServDependenteId other = (RapUniServDependenteId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getDtInicio(), other.getDtInicio());
		umEqualsBuilder.append(this.getSadSerMatricula(), other.getSadSerMatricula());
		umEqualsBuilder.append(this.getSadSerVinCodigo(), other.getSadSerVinCodigo());
		umEqualsBuilder.append(this.getSadSeqp(), other.getSadSeqp());
		umEqualsBuilder.append(this.getDepPesCodigo(), other.getDepPesCodigo());
		umEqualsBuilder.append(this.getDepCodigo(), other.getDepCodigo());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}