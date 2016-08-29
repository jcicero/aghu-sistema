package br.gov.mec.aghu.model;

// Generated 26/02/2010 17:37:25 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import javax.validation.constraints.NotNull;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

@Embeddable
public class McoAtendTrabPartosId implements EntityCompositeId {

	private static final long serialVersionUID = 513728075648661061L;
	private Integer gsoPacCodigo;
	private Short gsoSeqp;
	private Integer seqp;

	public McoAtendTrabPartosId() {
	}

	public McoAtendTrabPartosId(Integer gsoPacCodigo, Short gsoSeqp, Integer seqp) {
		this.gsoPacCodigo = gsoPacCodigo;
		this.gsoSeqp = gsoSeqp;
		this.seqp = seqp;
	}

	@Column(name = "GSO_PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	@NotNull
	public Integer getGsoPacCodigo() {
		return this.gsoPacCodigo;
	}

	public void setGsoPacCodigo(Integer gsoPacCodigo) {
		this.gsoPacCodigo = gsoPacCodigo;
	}

	@Column(name = "GSO_SEQP", nullable = false, precision = 3, scale = 0)
	@NotNull
	public Short getGsoSeqp() {
		return this.gsoSeqp;
	}

	public void setGsoSeqp(Short gsoSeqp) {
		this.gsoSeqp = gsoSeqp;
	}

	@Column(name = "SEQP", nullable = false, precision = 5, scale = 0)
	@NotNull
	public Integer getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Integer seqp) {
		this.seqp = seqp;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof McoAtendTrabPartosId)) {
			return false;
		}
		McoAtendTrabPartosId castOther = (McoAtendTrabPartosId) other;

		return ((getGsoPacCodigo() == castOther.getGsoPacCodigo()) 
				|| (getGsoPacCodigo() != null && getGsoPacCodigo().equals(castOther.getGsoPacCodigo())))
			&& ((getGsoSeqp() == castOther.getGsoSeqp()) 
				|| (getGsoSeqp() != null && getGsoSeqp().equals(castOther.getGsoSeqp())))
			&& ((getSeqp() == castOther.getSeqp())
				|| (getSeqp() != null && getSeqp().equals(castOther.getSeqp())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getGsoPacCodigo() == null ? 0 : getGsoPacCodigo().hashCode());
		result = 37 * result + (getGsoSeqp() == null ? 0 : getGsoSeqp().hashCode());
		result = 37 * result + (getSeqp() == null ? 0 : getSeqp().hashCode());
		return result;
	}
}
