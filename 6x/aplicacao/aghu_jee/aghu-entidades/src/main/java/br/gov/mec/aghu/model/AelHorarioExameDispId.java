package br.gov.mec.aghu.model;

// Generated 18/04/2011 19:20:02 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelHorarioExameDispsId generated by hbm2java
 */

@Embeddable
public class AelHorarioExameDispId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7961255066006091884L;
	private Short gaeUnfSeq;
	private Integer gaeSeqp;
	private Date dthrAgenda;
	
	public AelHorarioExameDispId() {
		
	}
	
	public AelHorarioExameDispId(Short gaeUnfSeq, Integer gaeSeqp, Date dthrAgenda) {
		this.gaeUnfSeq = gaeUnfSeq;
		this.gaeSeqp = gaeSeqp;
		this.dthrAgenda = dthrAgenda;
	}

	@Column(name = "GAE_UNF_SEQ", nullable = false)
	public Short getGaeUnfSeq() {
		return this.gaeUnfSeq;
	}

	public void setGaeUnfSeq(Short gaeUnfSeq) {
		this.gaeUnfSeq = gaeUnfSeq;
	}

	@Column(name = "GAE_SEQP", nullable = false)
	public Integer getGaeSeqp() {
		return this.gaeSeqp;
	}

	public void setGaeSeqp(Integer gaeSeqp) {
		this.gaeSeqp = gaeSeqp;
	}

	@Column(name = "DTHR_AGENDA", nullable = false, length = 29)
	public Date getDthrAgenda() {
		return this.dthrAgenda;
	}

	public void setDthrAgenda(Date dthrAgenda) {
		this.dthrAgenda = dthrAgenda;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		
		if ((other == null)) {
			return false;
		}
		
		if (!(other instanceof AelHorarioExameDispId)) {
			return false;
		}
		
		AelHorarioExameDispId castOther = (AelHorarioExameDispId) other;

		return (this.getGaeUnfSeq().equals(castOther.getGaeUnfSeq()))
				&& (this.getGaeSeqp().equals(castOther.getGaeSeqp()))
				&& (this.getDthrAgenda().equals(castOther.getDthrAgenda()));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getGaeUnfSeq();
		result = 37 * result + this.getGaeSeqp();
		result = 37
				* result
				+ (getDthrAgenda() == null ? 0 : this.getDthrAgenda()
						.hashCode());
		return result;
	}

}