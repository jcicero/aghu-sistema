package br.gov.mec.aghu.model;

// Generated 28/10/2010 13:06:29 by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpaUsoMedicacoesId generated by hbm2java
 */
@Embeddable
public class MpaUsoMedicacaoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -890818289520966773L;
	private Integer uspApaAtdSeq;
	private Integer uspApaSeq;
	private Short uspVpaPtaSeq;
	private Byte uspVpaSeqp;
	private Integer uspSeq;
	private Short camCitVpaPtaSeq;
	private Byte camCitVpaSeqp;
	private Short camCitSeqp;
	private Short camSeqp;

	public MpaUsoMedicacaoId() {
	}

	public MpaUsoMedicacaoId(Integer uspApaAtdSeq, Integer uspApaSeq, Short uspVpaPtaSeq, Byte uspVpaSeqp, Integer uspSeq,
			Short camCitVpaPtaSeq, Byte camCitVpaSeqp, Short camCitSeqp, Short camSeqp) {
		this.uspApaAtdSeq = uspApaAtdSeq;
		this.uspApaSeq = uspApaSeq;
		this.uspVpaPtaSeq = uspVpaPtaSeq;
		this.uspVpaSeqp = uspVpaSeqp;
		this.uspSeq = uspSeq;
		this.camCitVpaPtaSeq = camCitVpaPtaSeq;
		this.camCitVpaSeqp = camCitVpaSeqp;
		this.camCitSeqp = camCitSeqp;
		this.camSeqp = camSeqp;
	}

	@Column(name = "USP_APA_ATD_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getUspApaAtdSeq() {
		return this.uspApaAtdSeq;
	}

	public void setUspApaAtdSeq(Integer uspApaAtdSeq) {
		this.uspApaAtdSeq = uspApaAtdSeq;
	}

	@Column(name = "USP_APA_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getUspApaSeq() {
		return this.uspApaSeq;
	}

	public void setUspApaSeq(Integer uspApaSeq) {
		this.uspApaSeq = uspApaSeq;
	}

	@Column(name = "USP_VPA_PTA_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getUspVpaPtaSeq() {
		return this.uspVpaPtaSeq;
	}

	public void setUspVpaPtaSeq(Short uspVpaPtaSeq) {
		this.uspVpaPtaSeq = uspVpaPtaSeq;
	}

	@Column(name = "USP_VPA_SEQP", nullable = false, precision = 2, scale = 0)
	public Byte getUspVpaSeqp() {
		return this.uspVpaSeqp;
	}

	public void setUspVpaSeqp(Byte uspVpaSeqp) {
		this.uspVpaSeqp = uspVpaSeqp;
	}

	@Column(name = "USP_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getUspSeq() {
		return this.uspSeq;
	}

	public void setUspSeq(Integer uspSeq) {
		this.uspSeq = uspSeq;
	}

	@Column(name = "CAM_CIT_VPA_PTA_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getCamCitVpaPtaSeq() {
		return this.camCitVpaPtaSeq;
	}

	public void setCamCitVpaPtaSeq(Short camCitVpaPtaSeq) {
		this.camCitVpaPtaSeq = camCitVpaPtaSeq;
	}

	@Column(name = "CAM_CIT_VPA_SEQP", nullable = false, precision = 2, scale = 0)
	public Byte getCamCitVpaSeqp() {
		return this.camCitVpaSeqp;
	}

	public void setCamCitVpaSeqp(Byte camCitVpaSeqp) {
		this.camCitVpaSeqp = camCitVpaSeqp;
	}

	@Column(name = "CAM_CIT_SEQP", nullable = false, precision = 4, scale = 0)
	public Short getCamCitSeqp() {
		return this.camCitSeqp;
	}

	public void setCamCitSeqp(Short camCitSeqp) {
		this.camCitSeqp = camCitSeqp;
	}

	@Column(name = "CAM_SEQP", nullable = false, precision = 4, scale = 0)
	public Short getCamSeqp() {
		return this.camSeqp;
	}

	public void setCamSeqp(Short camSeqp) {
		this.camSeqp = camSeqp;
	}
	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getUspApaSeq());
		umHashCodeBuilder.append(this.getUspVpaPtaSeq());
		umHashCodeBuilder.append(this.getUspVpaSeqp());
		umHashCodeBuilder.append(this.getUspSeq());
		umHashCodeBuilder.append(this.getUspApaAtdSeq());
		umHashCodeBuilder.append(this.getCamCitVpaPtaSeq());
		umHashCodeBuilder.append(this.getCamCitVpaSeqp());
		umHashCodeBuilder.append(this.getCamCitSeqp());
		umHashCodeBuilder.append(this.getCamSeqp());
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
		if (!(obj instanceof MpaUsoMedicacaoId)) {
			return false;
		}
		MpaUsoMedicacaoId other = (MpaUsoMedicacaoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getUspApaSeq(), other.getUspApaSeq());
		umEqualsBuilder.append(this.getUspVpaPtaSeq(), other.getUspVpaPtaSeq());
		umEqualsBuilder.append(this.getUspVpaSeqp(), other.getUspVpaSeqp());
		umEqualsBuilder.append(this.getUspSeq(), other.getUspSeq());
		umEqualsBuilder.append(this.getUspApaAtdSeq(), other.getUspApaAtdSeq());
		umEqualsBuilder.append(this.getCamCitVpaPtaSeq(), other.getCamCitVpaPtaSeq());
		umEqualsBuilder.append(this.getCamCitVpaSeqp(), other.getCamCitVpaSeqp());
		umEqualsBuilder.append(this.getCamCitSeqp(), other.getCamCitSeqp());
		umEqualsBuilder.append(this.getCamSeqp(), other.getCamSeqp());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}