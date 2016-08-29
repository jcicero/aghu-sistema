package br.gov.mec.aghu.model;

// Generated 27/12/2010 20:08:36 by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AnuHabitoAlimAtendimentosId generated by hbm2java
 */
@Embeddable

public class AnuHabitoAlimAtendimentoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2516477260480644681L;
	private Integer atdSeq;
	private Integer seq;

	public AnuHabitoAlimAtendimentoId() {
	}

	public AnuHabitoAlimAtendimentoId(Integer atdSeq, Integer seq) {
		this.atdSeq = atdSeq;
		this.seq = seq;
	}

	@Column(name = "ATD_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getAtdSeq() {
		return this.atdSeq;
	}

	public void setAtdSeq(Integer atdSeq) {
		this.atdSeq = atdSeq;
	}

	@Column(name = "SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AnuHabitoAlimAtendimentoId)) {
			return false;
		}
		AnuHabitoAlimAtendimentoId castOther = (AnuHabitoAlimAtendimentoId) other;

		return (this.getAtdSeq() == castOther.getAtdSeq())
				&& (this.getSeq() == castOther.getSeq());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAtdSeq();
		result = 37 * result + this.getSeq();
		return result;
	}

}
