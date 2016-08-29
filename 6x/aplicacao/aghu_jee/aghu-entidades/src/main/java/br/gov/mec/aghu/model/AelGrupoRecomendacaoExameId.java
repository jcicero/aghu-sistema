package br.gov.mec.aghu.model;

// Generated 10/03/2011 16:40:25 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelGrupoRecomendacaoExamesId generated by hbm2java
 */

@Embeddable
public class AelGrupoRecomendacaoExameId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7996720592023754169L;
	private Integer grmSeq;
	private Integer emaManSeq;
	private String emaExaSigla;

	public AelGrupoRecomendacaoExameId() {
	}

	public AelGrupoRecomendacaoExameId(Integer grmSeq, Integer emaManSeq,
			String emaExaSigla) {
		this.grmSeq = grmSeq;
		this.emaManSeq = emaManSeq;
		this.emaExaSigla = emaExaSigla;
	}

	@Column(name = "GRM_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getGrmSeq() {
		return this.grmSeq;
	}

	public void setGrmSeq(Integer grmSeq) {
		this.grmSeq = grmSeq;
	}

	@Column(name = "EMA_MAN_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getEmaManSeq() {
		return this.emaManSeq;
	}

	public void setEmaManSeq(Integer emaManSeq) {
		this.emaManSeq = emaManSeq;
	}

	@Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getEmaExaSigla() {
		return this.emaExaSigla;
	}

	public void setEmaExaSigla(String emaExaSigla) {
		this.emaExaSigla = emaExaSigla;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AelGrupoRecomendacaoExameId)) {
			return false;
		}
		AelGrupoRecomendacaoExameId castOther = (AelGrupoRecomendacaoExameId) other;
		/*
		return (this.getGrmSeq() == castOther.getGrmSeq()
				|| ( this.getGrmSeq() != null
					  && castOther.getGrmSeq() != null 
					  && this.getGrmSeq().equals(castOther.getGrmSeq())
					)
				)
				&& ( (this.getEmaManSeq() == castOther.getEmaManSeq())
						|| ( this.getEmaManSeq() != null
							  && castOther.getEmaManSeq() != null 
							  && this.getEmaManSeq().equals(castOther.getEmaManSeq())
							)
					)
				&& ( (this.getEmaExaSigla() == castOther.getEmaExaSigla()) 
					|| (this.getEmaExaSigla() != null
						  && castOther.getEmaExaSigla() != null 
						  && this.getEmaExaSigla().equals(castOther.getEmaExaSigla())
						)
					);
					*/
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getGrmSeq(), castOther.getGrmSeq());
		umEqualsBuilder.append(this.getEmaManSeq(), castOther.getEmaManSeq());
		umEqualsBuilder.append(this.getEmaExaSigla(), castOther.getEmaExaSigla());
		return umEqualsBuilder.isEquals();
	}

	@Override
	public int hashCode() {
		/*
		Integer result = 17;

		result = 37 * result + this.getGrmSeq();
		result = 37 * result + this.getEmaManSeq();
		result = 37
				* result
				+ (getEmaExaSigla() == null ? 0 : this.getEmaExaSigla().hashCode());
		return result;
		*/
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getGrmSeq());
		umHashCodeBuilder.append(this.getEmaManSeq());
		umHashCodeBuilder.append(this.getEmaExaSigla());
		return umHashCodeBuilder.toHashCode();
	}

}
