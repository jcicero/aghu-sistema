package br.gov.mec.aghu.model;

// Generated 08/02/2010 17:25:25 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatContaApacsId generated by hbm2java
 */
@Embeddable
public class FatContaApacId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4253437898236267050L;
	private Long atmNumero;
	private Byte seqp;

	public FatContaApacId() {
	}

	public FatContaApacId(Long atmNumero, Byte seqp) {
		this.atmNumero = atmNumero;
		this.seqp = seqp;
	}

	@Column(name = "ATM_NUMERO", nullable = false, precision = 13, scale = 0)
	public Long getAtmNumero() {
		return this.atmNumero;
	}

	public void setAtmNumero(Long atmNumero) {
		this.atmNumero = atmNumero;
	}

	@Column(name = "SEQP", nullable = false, precision = 2, scale = 0)
	public Byte getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Byte seqp) {
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
		if (!(other instanceof FatContaApacId)) {
			return false;
		}
		FatContaApacId castOther = (FatContaApacId) other;

		return this.getAtmNumero() != null && this.getAtmNumero().equals(castOther.getAtmNumero()) &&
				this.getSeqp() != null && this.getSeqp().equals(castOther.getSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (this.getAtmNumero() == null ? 0 : this.getAtmNumero().hashCode());
		result = 37 * result + (this.getSeqp() == null ? 0 : this.getSeqp().hashCode());
		return result;
	}

}
