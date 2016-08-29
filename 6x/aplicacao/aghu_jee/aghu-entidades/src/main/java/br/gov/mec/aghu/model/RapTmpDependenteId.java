package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * RapTmpDependenteId generated by hbm2java
 */
@Embeddable
public class RapTmpDependenteId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8375994853066123694L;
	private Integer pesCodigo;
	private Integer codigo;
	private String operacao;
	private Date dthrOperacao;

	public RapTmpDependenteId() {
	}

	public RapTmpDependenteId(Integer pesCodigo, Integer codigo, String operacao, Date dthrOperacao) {
		this.pesCodigo = pesCodigo;
		this.codigo = codigo;
		this.operacao = operacao;
		this.dthrOperacao = dthrOperacao;
	}

	@Column(name = "PES_CODIGO", nullable = false)
	public Integer getPesCodigo() {
		return this.pesCodigo;
	}

	public void setPesCodigo(Integer pesCodigo) {
		this.pesCodigo = pesCodigo;
	}

	@Column(name = "CODIGO", nullable = false)
	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Column(name = "OPERACAO", nullable = false, length = 3)
	@Length(max = 3)
	public String getOperacao() {
		return this.operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	@Column(name = "DTHR_OPERACAO", nullable = false, length = 29)
	public Date getDthrOperacao() {
		return this.dthrOperacao;
	}

	public void setDthrOperacao(Date dthrOperacao) {
		this.dthrOperacao = dthrOperacao;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCodigo());
		umHashCodeBuilder.append(this.getOperacao());
		umHashCodeBuilder.append(this.getPesCodigo());
		umHashCodeBuilder.append(this.getDthrOperacao());
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
		if (!(obj instanceof RapTmpDependenteId)) {
			return false;
		}
		RapTmpDependenteId other = (RapTmpDependenteId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCodigo(), other.getCodigo());
		umEqualsBuilder.append(this.getOperacao(), other.getOperacao());
		umEqualsBuilder.append(this.getPesCodigo(), other.getPesCodigo());
		umEqualsBuilder.append(this.getDthrOperacao(), other.getDthrOperacao());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
