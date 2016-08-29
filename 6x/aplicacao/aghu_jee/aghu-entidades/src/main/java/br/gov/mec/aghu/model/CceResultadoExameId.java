package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * CceResultadoExameId generated by hbm2java
 */
@Embeddable
public class CceResultadoExameId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8125904980037696873L;
	private Long camNumero;
	private Short camSeqp;
	private String idResultado;

	public CceResultadoExameId() {
	}

	public CceResultadoExameId(Long camNumero, Short camSeqp, String idResultado) {
		this.camNumero = camNumero;
		this.camSeqp = camSeqp;
		this.idResultado = idResultado;
	}

	@Column(name = "CAM_NUMERO", nullable = false)
	public Long getCamNumero() {
		return this.camNumero;
	}

	public void setCamNumero(Long camNumero) {
		this.camNumero = camNumero;
	}

	@Column(name = "CAM_SEQP", nullable = false)
	public Short getCamSeqp() {
		return this.camSeqp;
	}

	public void setCamSeqp(Short camSeqp) {
		this.camSeqp = camSeqp;
	}

	@Column(name = "ID_RESULTADO", nullable = false, length = 60)
	@Length(max = 60)
	public String getIdResultado() {
		return this.idResultado;
	}

	public void setIdResultado(String idResultado) {
		this.idResultado = idResultado;
	}






	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCamNumero());
		umHashCodeBuilder.append(this.getCamSeqp());
		umHashCodeBuilder.append(this.getIdResultado());
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
		if (!(obj instanceof CceResultadoExameId)) {
			return false;
		}
		CceResultadoExameId other = (CceResultadoExameId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCamNumero(), other.getCamNumero());
		umEqualsBuilder.append(this.getCamSeqp(), other.getCamSeqp());
		umEqualsBuilder.append(this.getIdResultado(), other.getIdResultado());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}