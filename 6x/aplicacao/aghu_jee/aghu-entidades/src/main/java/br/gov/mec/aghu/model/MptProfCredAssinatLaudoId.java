package br.gov.mec.aghu.model;

// Generated 01/06/2010 16:42:11 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MptProfCredAssinatLaudoId generated by hbm2java
 */
@Embeddable
public class MptProfCredAssinatLaudoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8981199627918374131L;
	private Integer pecPreSerMatricula;
	private Short pecPreSerVinCodigo;
	private Short pecPreEspSeq;
	private Short pecCnvCodigo;
	private Integer tptSeq;

	public MptProfCredAssinatLaudoId() {
	}

	public MptProfCredAssinatLaudoId(Integer pecPreSerMatricula,
			Short pecPreSerVinCodigo, Short pecPreEspSeq, Short pecCnvCodigo,
			Integer tptSeq) {
		this.pecPreSerMatricula = pecPreSerMatricula;
		this.pecPreSerVinCodigo = pecPreSerVinCodigo;
		this.pecPreEspSeq = pecPreEspSeq;
		this.pecCnvCodigo = pecCnvCodigo;
		this.tptSeq = tptSeq;
	}

	@Column(name = "PEC_PRE_SER_MATRICULA", nullable = false, precision = 7, scale = 0)
	public Integer getPecPreSerMatricula() {
		return this.pecPreSerMatricula;
	}

	public void setPecPreSerMatricula(Integer pecPreSerMatricula) {
		this.pecPreSerMatricula = pecPreSerMatricula;
	}

	@Column(name = "PEC_PRE_SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getPecPreSerVinCodigo() {
		return this.pecPreSerVinCodigo;
	}

	public void setPecPreSerVinCodigo(Short pecPreSerVinCodigo) {
		this.pecPreSerVinCodigo = pecPreSerVinCodigo;
	}

	@Column(name = "PEC_PRE_ESP_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getPecPreEspSeq() {
		return this.pecPreEspSeq;
	}

	public void setPecPreEspSeq(Short pecPreEspSeq) {
		this.pecPreEspSeq = pecPreEspSeq;
	}

	@Column(name = "PEC_CNV_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getPecCnvCodigo() {
		return this.pecCnvCodigo;
	}

	public void setPecCnvCodigo(Short pecCnvCodigo) {
		this.pecCnvCodigo = pecCnvCodigo;
	}

	@Column(name = "TPT_SEQ", nullable = false, precision = 6, scale = 0)
	public Integer getTptSeq() {
		return this.tptSeq;
	}

	public void setTptSeq(Integer tptSeq) {
		this.tptSeq = tptSeq;
	}
	


 	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getPecCnvCodigo());
		umHashCodeBuilder.append(this.getPecPreEspSeq());
		umHashCodeBuilder.append(this.getPecPreSerMatricula());
		umHashCodeBuilder.append(this.getPecPreSerVinCodigo());
		umHashCodeBuilder.append(this.getTptSeq());
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
		if (!(obj instanceof MptProfCredAssinatLaudoId)) {
			return false;
		}
		MptProfCredAssinatLaudoId other = (MptProfCredAssinatLaudoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getPecCnvCodigo(), other.getPecCnvCodigo());
		umEqualsBuilder.append(this.getPecPreEspSeq(), other.getPecPreEspSeq());
		umEqualsBuilder.append(this.getPecPreSerMatricula(), other.getPecPreSerMatricula());
		umEqualsBuilder.append(this.getPecPreSerVinCodigo(), other.getPecPreSerVinCodigo());
		umEqualsBuilder.append(this.getTptSeq(), other.getTptSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}

