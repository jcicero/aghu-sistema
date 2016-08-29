package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MbcMatOrteseProtCirgId generated by hbm2java
 */
@Embeddable
public class MbcMatOrteseProtCirgId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 131360973986389176L;
	private Integer matCodigo;
	private Integer crgSeq;

	public MbcMatOrteseProtCirgId() {
	}

	public MbcMatOrteseProtCirgId(Integer matCodigo, Integer crgSeq) {
		this.matCodigo = matCodigo;
		this.crgSeq = crgSeq;
	}

	@Column(name = "MAT_CODIGO", nullable = false)
	public Integer getMatCodigo() {
		return this.matCodigo;
	}

	public void setMatCodigo(Integer matCodigo) {
		this.matCodigo = matCodigo;
	}

	@Column(name = "CRG_SEQ", nullable = false)
	public Integer getCrgSeq() {
		return this.crgSeq;
	}

	public void setCrgSeq(Integer crgSeq) {
		this.crgSeq = crgSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getMatCodigo());
		umHashCodeBuilder.append(this.getCrgSeq());
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
		if (!(obj instanceof MbcMatOrteseProtCirgId)) {
			return false;
		}
		MbcMatOrteseProtCirgId other = (MbcMatOrteseProtCirgId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getMatCodigo(), other.getMatCodigo());
		umEqualsBuilder.append(this.getCrgSeq(), other.getCrgSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
