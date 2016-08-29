package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * VMbcFichaMedicamentoTopId generated by hbm2java
 */
@Embeddable
public class VMbcFichaMedicamentoTopId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7576467516753556647L;
	private Double qtd;
	private Short unfSeq;
	private Integer medMatCodigo;
	private String descLovEditada;

	public VMbcFichaMedicamentoTopId() {
	}

	public VMbcFichaMedicamentoTopId(Short unfSeq, Integer medMatCodigo) {
		this.unfSeq = unfSeq;
		this.medMatCodigo = medMatCodigo;
	}

	public VMbcFichaMedicamentoTopId(Double qtd, Short unfSeq, Integer medMatCodigo, String descLovEditada) {
		this.qtd = qtd;
		this.unfSeq = unfSeq;
		this.medMatCodigo = medMatCodigo;
		this.descLovEditada = descLovEditada;
	}

	@Column(name = "QTD", precision = 17, scale = 17)
	public Double getQtd() {
		return this.qtd;
	}

	public void setQtd(Double qtd) {
		this.qtd = qtd;
	}

	@Column(name = "UNF_SEQ", nullable = false)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "MED_MAT_CODIGO", nullable = false)
	public Integer getMedMatCodigo() {
		return this.medMatCodigo;
	}

	public void setMedMatCodigo(Integer medMatCodigo) {
		this.medMatCodigo = medMatCodigo;
	}

	@Column(name = "DESC_LOV_EDITADA", length = 117)
	@Length(max = 117)
	public String getDescLovEditada() {
		return this.descLovEditada;
	}

	public void setDescLovEditada(String descLovEditada) {
		this.descLovEditada = descLovEditada;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getUnfSeq());
		umHashCodeBuilder.append(this.getMedMatCodigo());
		umHashCodeBuilder.append(this.getQtd());
		umHashCodeBuilder.append(this.getDescLovEditada());
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
		if (!(obj instanceof VMbcFichaMedicamentoTopId)) {
			return false;
		}
		VMbcFichaMedicamentoTopId other = (VMbcFichaMedicamentoTopId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getUnfSeq(), other.getUnfSeq());
		umEqualsBuilder.append(this.getMedMatCodigo(), other.getMedMatCodigo());
		umEqualsBuilder.append(this.getQtd(), other.getQtd());
		umEqualsBuilder.append(this.getDescLovEditada(), other.getDescLovEditada());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
