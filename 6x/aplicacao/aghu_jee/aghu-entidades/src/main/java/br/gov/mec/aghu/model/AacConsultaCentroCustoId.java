package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AacConsultaCentroCustoId generated by hbm2java
 */
@Embeddable
public class AacConsultaCentroCustoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1425571871964936554L;
	private Date cpfMesReferencia;
	private Short cpfEpcSeq;
	private Integer cctCodigo;

	public AacConsultaCentroCustoId() {
	}

	public AacConsultaCentroCustoId(Date cpfMesReferencia, Short cpfEpcSeq, Integer cctCodigo) {
		this.cpfMesReferencia = cpfMesReferencia;
		this.cpfEpcSeq = cpfEpcSeq;
		this.cctCodigo = cctCodigo;
	}

	@Column(name = "CPF_MES_REFERENCIA", nullable = false, length = 29)
	public Date getCpfMesReferencia() {
		return this.cpfMesReferencia;
	}

	public void setCpfMesReferencia(Date cpfMesReferencia) {
		this.cpfMesReferencia = cpfMesReferencia;
	}

	@Column(name = "CPF_EPC_SEQ", nullable = false)
	public Short getCpfEpcSeq() {
		return this.cpfEpcSeq;
	}

	public void setCpfEpcSeq(Short cpfEpcSeq) {
		this.cpfEpcSeq = cpfEpcSeq;
	}

	@Column(name = "CCT_CODIGO", nullable = false)
	public Integer getCctCodigo() {
		return this.cctCodigo;
	}

	public void setCctCodigo(Integer cctCodigo) {
		this.cctCodigo = cctCodigo;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCctCodigo());
		umHashCodeBuilder.append(this.getCpfMesReferencia());
		umHashCodeBuilder.append(this.getCpfEpcSeq());
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
		if (!(obj instanceof AacConsultaCentroCustoId)) {
			return false;
		}
		AacConsultaCentroCustoId other = (AacConsultaCentroCustoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCctCodigo(), other.getCctCodigo());
		umEqualsBuilder.append(this.getCpfMesReferencia(), other.getCpfMesReferencia());
		umEqualsBuilder.append(this.getCpfEpcSeq(), other.getCpfEpcSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
