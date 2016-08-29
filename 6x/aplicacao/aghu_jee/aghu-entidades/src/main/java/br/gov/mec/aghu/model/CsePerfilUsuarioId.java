package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * CsePerfilUsuarioId generated by hbm2java
 */
@Embeddable
public class CsePerfilUsuarioId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6979937691327089427L;
	private String usrId;
	private String perNome;

	public CsePerfilUsuarioId() {
	}

	public CsePerfilUsuarioId(String usrId, String perNome) {
		this.usrId = usrId;
		this.perNome = perNome;
	}

	@Column(name = "USR_ID", nullable = false, length = 30)
	@Length(max = 30)
	public String getUsrId() {
		return this.usrId;
	}

	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	@Column(name = "PER_NOME", nullable = false, length = 30)
	@Length(max = 30)
	public String getPerNome() {
		return this.perNome;
	}

	public void setPerNome(String perNome) {
		this.perNome = perNome;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getPerNome());
		umHashCodeBuilder.append(this.getUsrId());
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
		if (!(obj instanceof CsePerfilUsuarioId)) {
			return false;
		}
		CsePerfilUsuarioId other = (CsePerfilUsuarioId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getPerNome(), other.getPerNome());
		umEqualsBuilder.append(this.getUsrId(), other.getUsrId());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
