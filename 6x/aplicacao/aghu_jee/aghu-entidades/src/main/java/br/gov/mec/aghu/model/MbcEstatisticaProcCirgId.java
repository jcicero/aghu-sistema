package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MbcEstatisticaProcCirgId generated by hbm2java
 */
@Embeddable
public class MbcEstatisticaProcCirgId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5412270624454353900L;
	private Integer pciSeq;
	private Date dtCompetencia;

	public MbcEstatisticaProcCirgId() {
	}

	public MbcEstatisticaProcCirgId(Integer pciSeq, Date dtCompetencia) {
		this.pciSeq = pciSeq;
		this.dtCompetencia = dtCompetencia;
	}

	@Column(name = "PCI_SEQ", nullable = false)
	public Integer getPciSeq() {
		return this.pciSeq;
	}

	public void setPciSeq(Integer pciSeq) {
		this.pciSeq = pciSeq;
	}

	@Column(name = "DT_COMPETENCIA", nullable = false, length = 29)
	public Date getDtCompetencia() {
		return this.dtCompetencia;
	}

	public void setDtCompetencia(Date dtCompetencia) {
		this.dtCompetencia = dtCompetencia;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getDtCompetencia());
		umHashCodeBuilder.append(this.getPciSeq());
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
		if (!(obj instanceof MbcEstatisticaProcCirgId)) {
			return false;
		}
		MbcEstatisticaProcCirgId other = (MbcEstatisticaProcCirgId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getDtCompetencia(), other.getDtCompetencia());
		umEqualsBuilder.append(this.getPciSeq(), other.getPciSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
