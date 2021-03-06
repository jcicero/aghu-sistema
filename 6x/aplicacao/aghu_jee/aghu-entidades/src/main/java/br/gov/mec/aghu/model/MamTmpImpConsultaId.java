package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MamTmpImpConsultaId generated by hbm2java
 */
@Embeddable
public class MamTmpImpConsultaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -192326952632072653L;
	private Integer nroSessao;
	private Short seqp;

	public MamTmpImpConsultaId() {
	}

	public MamTmpImpConsultaId(Integer nroSessao, Short seqp) {
		this.nroSessao = nroSessao;
		this.seqp = seqp;
	}

	@Column(name = "NRO_SESSAO", nullable = false)
	public Integer getNroSessao() {
		return this.nroSessao;
	}

	public void setNroSessao(Integer nroSessao) {
		this.nroSessao = nroSessao;
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
		umHashCodeBuilder.append(this.getNroSessao());
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
		if (!(obj instanceof MamTmpImpConsultaId)) {
			return false;
		}
		MamTmpImpConsultaId other = (MamTmpImpConsultaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getNroSessao(), other.getNroSessao());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
