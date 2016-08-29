package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MbcProcPorEquipeId generated by hbm2java
 */
@Embeddable
public class MbcProcPorEquipeId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -569599907864450829L;
	private Integer serMatriculaPrf;
	private Short serVinCodigoPrf;
	private Short unfSeq;
	private Integer pciSeq;

	public MbcProcPorEquipeId() {
	}

	public MbcProcPorEquipeId(Integer serMatriculaPrf, Short serVinCodigoPrf, Short unfSeq, Integer pciSeq) {
		this.serMatriculaPrf = serMatriculaPrf;
		this.serVinCodigoPrf = serVinCodigoPrf;
		this.unfSeq = unfSeq;
		this.pciSeq = pciSeq;
	}

	@Column(name = "SER_MATRICULA_PRF", nullable = false)
	public Integer getSerMatriculaPrf() {
		return this.serMatriculaPrf;
	}

	public void setSerMatriculaPrf(Integer serMatriculaPrf) {
		this.serMatriculaPrf = serMatriculaPrf;
	}

	@Column(name = "SER_VIN_CODIGO_PRF", nullable = false)
	public Short getSerVinCodigoPrf() {
		return this.serVinCodigoPrf;
	}

	public void setSerVinCodigoPrf(Short serVinCodigoPrf) {
		this.serVinCodigoPrf = serVinCodigoPrf;
	}

	@Column(name = "UNF_SEQ", nullable = false)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "PCI_SEQ", nullable = false)
	public Integer getPciSeq() {
		return this.pciSeq;
	}

	public void setPciSeq(Integer pciSeq) {
		this.pciSeq = pciSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getUnfSeq());
		umHashCodeBuilder.append(this.getPciSeq());
		umHashCodeBuilder.append(this.getSerMatriculaPrf());
		umHashCodeBuilder.append(this.getSerVinCodigoPrf());
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
		if (!(obj instanceof MbcProcPorEquipeId)) {
			return false;
		}
		MbcProcPorEquipeId other = (MbcProcPorEquipeId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getUnfSeq(), other.getUnfSeq());
		umEqualsBuilder.append(this.getPciSeq(), other.getPciSeq());
		umEqualsBuilder.append(this.getSerMatriculaPrf(), other.getSerMatriculaPrf());
		umEqualsBuilder.append(this.getSerVinCodigoPrf(), other.getSerVinCodigoPrf());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
