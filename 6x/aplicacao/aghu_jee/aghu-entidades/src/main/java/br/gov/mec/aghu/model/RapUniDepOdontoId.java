package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * RapUniDepOdontoId generated by hbm2java
 */
@Embeddable
public class RapUniDepOdontoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4197303865358757037L;
	private Integer sdeSadSerMatricula;
	private Short sdeSadSerVinCodigo;
	private Short sdeSadSeqp;
	private Integer sdeDepPesCodigo;
	private Integer sdeDepCodigo;
	private Date sdeDtInicio;
	private Date dtInicio;

	public RapUniDepOdontoId() {
	}

	public RapUniDepOdontoId(Integer sdeSadSerMatricula, Short sdeSadSerVinCodigo, Short sdeSadSeqp, Integer sdeDepPesCodigo,
			Integer sdeDepCodigo, Date sdeDtInicio, Date dtInicio) {
		this.sdeSadSerMatricula = sdeSadSerMatricula;
		this.sdeSadSerVinCodigo = sdeSadSerVinCodigo;
		this.sdeSadSeqp = sdeSadSeqp;
		this.sdeDepPesCodigo = sdeDepPesCodigo;
		this.sdeDepCodigo = sdeDepCodigo;
		this.sdeDtInicio = sdeDtInicio;
		this.dtInicio = dtInicio;
	}

	@Column(name = "SDE_SAD_SER_MATRICULA", nullable = false)
	public Integer getSdeSadSerMatricula() {
		return this.sdeSadSerMatricula;
	}

	public void setSdeSadSerMatricula(Integer sdeSadSerMatricula) {
		this.sdeSadSerMatricula = sdeSadSerMatricula;
	}

	@Column(name = "SDE_SAD_SER_VIN_CODIGO", nullable = false)
	public Short getSdeSadSerVinCodigo() {
		return this.sdeSadSerVinCodigo;
	}

	public void setSdeSadSerVinCodigo(Short sdeSadSerVinCodigo) {
		this.sdeSadSerVinCodigo = sdeSadSerVinCodigo;
	}

	@Column(name = "SDE_SAD_SEQP", nullable = false)
	public Short getSdeSadSeqp() {
		return this.sdeSadSeqp;
	}

	public void setSdeSadSeqp(Short sdeSadSeqp) {
		this.sdeSadSeqp = sdeSadSeqp;
	}

	@Column(name = "SDE_DEP_PES_CODIGO", nullable = false)
	public Integer getSdeDepPesCodigo() {
		return this.sdeDepPesCodigo;
	}

	public void setSdeDepPesCodigo(Integer sdeDepPesCodigo) {
		this.sdeDepPesCodigo = sdeDepPesCodigo;
	}

	@Column(name = "SDE_DEP_CODIGO", nullable = false)
	public Integer getSdeDepCodigo() {
		return this.sdeDepCodigo;
	}

	public void setSdeDepCodigo(Integer sdeDepCodigo) {
		this.sdeDepCodigo = sdeDepCodigo;
	}

	@Column(name = "SDE_DT_INICIO", nullable = false, length = 29)
	public Date getSdeDtInicio() {
		return this.sdeDtInicio;
	}

	public void setSdeDtInicio(Date sdeDtInicio) {
		this.sdeDtInicio = sdeDtInicio;
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
		umHashCodeBuilder.append(this.getSdeSadSerMatricula());
		umHashCodeBuilder.append(this.getSdeSadSerVinCodigo());
		umHashCodeBuilder.append(this.getSdeSadSeqp());
		umHashCodeBuilder.append(this.getSdeDepPesCodigo());
		umHashCodeBuilder.append(this.getSdeDepCodigo());
		umHashCodeBuilder.append(this.getSdeDtInicio());
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
		if (!(obj instanceof RapUniDepOdontoId)) {
			return false;
		}
		RapUniDepOdontoId other = (RapUniDepOdontoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSdeSadSerMatricula(), other.getSdeSadSerMatricula());
		umEqualsBuilder.append(this.getSdeSadSerVinCodigo(), other.getSdeSadSerVinCodigo());
		umEqualsBuilder.append(this.getSdeSadSeqp(), other.getSdeSadSeqp());
		umEqualsBuilder.append(this.getSdeDepPesCodigo(), other.getSdeDepPesCodigo());
		umEqualsBuilder.append(this.getSdeDepCodigo(), other.getSdeDepCodigo());
		umEqualsBuilder.append(this.getSdeDtInicio(), other.getSdeDtInicio());
		umEqualsBuilder.append(this.getDtInicio(), other.getDtInicio());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
