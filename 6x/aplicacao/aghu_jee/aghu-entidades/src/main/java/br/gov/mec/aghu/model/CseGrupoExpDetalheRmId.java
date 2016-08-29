package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * CseGrupoExpDetalheRmId generated by hbm2java
 */
@Embeddable
public class CseGrupoExpDetalheRmId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2081086654296346887L;
	private Short gueSeq;
	private Short dias;
	private String indAvisoRede;
	private Integer version;

	public CseGrupoExpDetalheRmId() {
	}

	public CseGrupoExpDetalheRmId(Short gueSeq, Short dias, String indAvisoRede, Integer version) {
		this.gueSeq = gueSeq;
		this.dias = dias;
		this.indAvisoRede = indAvisoRede;
		this.version = version;
	}

	@Column(name = "GUE_SEQ", nullable = false)
	public Short getGueSeq() {
		return this.gueSeq;
	}

	public void setGueSeq(Short gueSeq) {
		this.gueSeq = gueSeq;
	}

	@Column(name = "DIAS", nullable = false)
	public Short getDias() {
		return this.dias;
	}

	public void setDias(Short dias) {
		this.dias = dias;
	}

	@Column(name = "IND_AVISO_REDE", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndAvisoRede() {
		return this.indAvisoRede;
	}

	public void setIndAvisoRede(String indAvisoRede) {
		this.indAvisoRede = indAvisoRede;
	}

	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getGueSeq());
		umHashCodeBuilder.append(this.getDias());
		umHashCodeBuilder.append(this.getIndAvisoRede());
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
		if (!(obj instanceof CseGrupoExpDetalheRmId)) {
			return false;
		}
		CseGrupoExpDetalheRmId other = (CseGrupoExpDetalheRmId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getGueSeq(), other.getGueSeq());
		umEqualsBuilder.append(this.getDias(), other.getDias());
		umEqualsBuilder.append(this.getIndAvisoRede(), other.getIndAvisoRede());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
