package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AfaDecimalComponenteNptId generated by hbm2java
 */
@Embeddable
public class AfaDecimalComponenteNptId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1554321220680553319L;
	private Integer cnpMedMatCodigo;
	private Short seqp;

	public AfaDecimalComponenteNptId() {
	}

	public AfaDecimalComponenteNptId(Integer cnpMedMatCodigo, Short seqp) {
		this.cnpMedMatCodigo = cnpMedMatCodigo;
		this.seqp = seqp;
	}

	@Column(name = "CNP_MED_MAT_CODIGO", nullable = false)
	public Integer getCnpMedMatCodigo() {
		return this.cnpMedMatCodigo;
	}

	public void setCnpMedMatCodigo(Integer cnpMedMatCodigo) {
		this.cnpMedMatCodigo = cnpMedMatCodigo;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSeqp());
		umHashCodeBuilder.append(this.getCnpMedMatCodigo());
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
		if (!(obj instanceof AfaDecimalComponenteNptId)) {
			return false;
		}
		AfaDecimalComponenteNptId other = (AfaDecimalComponenteNptId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getCnpMedMatCodigo(), other.getCnpMedMatCodigo());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
