package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpmItemProcedimentoSumariosId generated by hbm2java
 */
@Embeddable
public class MpmItemProcedimentoSumarioId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8861987006070995140L;
	private Integer ituSeq;
	private Integer seqp;

	public MpmItemProcedimentoSumarioId() {
	}

	public MpmItemProcedimentoSumarioId(Integer ituSeq, Integer seqp) {
		this.ituSeq = ituSeq;
		this.seqp = seqp;
	}

	@Column(name = "ITU_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getItuSeq() {
		return this.ituSeq;
	}

	public void setItuSeq(Integer ituSeq) {
		this.ituSeq = ituSeq;
	}

	@Column(name = "SEQP", nullable = false, precision = 5, scale = 0)
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
		if (!(other instanceof MpmItemProcedimentoSumarioId)) {
			return false;
		}
		MpmItemProcedimentoSumarioId castOther = (MpmItemProcedimentoSumarioId) other;

		return (this.getItuSeq() == castOther.getItuSeq())
				&& (this.getSeqp() == castOther.getSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getItuSeq();
		result = 37 * result + this.getSeqp();
		return result;
	}

}
