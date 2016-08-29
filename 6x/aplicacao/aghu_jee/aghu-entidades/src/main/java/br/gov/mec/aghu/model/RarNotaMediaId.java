package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * RarNotaMediaId generated by hbm2java
 */
@Embeddable
public class RarNotaMediaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6626310720178659185L;
	private Integer prrSeq;
	private String tipo;

	public RarNotaMediaId() {
	}

	public RarNotaMediaId(Integer prrSeq, String tipo) {
		this.prrSeq = prrSeq;
		this.tipo = tipo;
	}

	@Column(name = "PRR_SEQ", nullable = false)
	public Integer getPrrSeq() {
		return this.prrSeq;
	}

	public void setPrrSeq(Integer prrSeq) {
		this.prrSeq = prrSeq;
	}

	@Column(name = "TIPO", nullable = false, length = 2)
	@Length(max = 2)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getTipo());
		umHashCodeBuilder.append(this.getPrrSeq());
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
		if (!(obj instanceof RarNotaMediaId)) {
			return false;
		}
		RarNotaMediaId other = (RarNotaMediaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getTipo(), other.getTipo());
		umEqualsBuilder.append(this.getPrrSeq(), other.getPrrSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
