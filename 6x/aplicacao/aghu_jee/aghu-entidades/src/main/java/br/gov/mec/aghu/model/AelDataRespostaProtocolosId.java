package br.gov.mec.aghu.model;

// Generated 26/02/2010 15:51:00 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelDataRespostaProtocolosId generated by hbm2java
 */
@Embeddable
public class AelDataRespostaProtocolosId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7963026761513762384L;
	private Integer ppoPjqSeq;
	private Short ppoSeqp;
	private Integer ppjPjqSeq;
	private Integer ppjPacCodigo;
	private Integer seqp;

	public AelDataRespostaProtocolosId() {
	}

	public AelDataRespostaProtocolosId(Integer ppoPjqSeq, Short ppoSeqp,
			Integer ppjPjqSeq, Integer ppjPacCodigo, Integer seqp) {
		this.ppoPjqSeq = ppoPjqSeq;
		this.ppoSeqp = ppoSeqp;
		this.ppjPjqSeq = ppjPjqSeq;
		this.ppjPacCodigo = ppjPacCodigo;
		this.seqp = seqp;
	}

	@Column(name = "PPO_PJQ_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getPpoPjqSeq() {
		return this.ppoPjqSeq;
	}

	public void setPpoPjqSeq(Integer ppoPjqSeq) {
		this.ppoPjqSeq = ppoPjqSeq;
	}

	@Column(name = "PPO_SEQP", nullable = false, precision = 4, scale = 0)
	public Short getPpoSeqp() {
		return this.ppoSeqp;
	}

	public void setPpoSeqp(Short ppoSeqp) {
		this.ppoSeqp = ppoSeqp;
	}

	@Column(name = "PPJ_PJQ_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getPpjPjqSeq() {
		return this.ppjPjqSeq;
	}

	public void setPpjPjqSeq(Integer ppjPjqSeq) {
		this.ppjPjqSeq = ppjPjqSeq;
	}

	@Column(name = "PPJ_PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	public Integer getPpjPacCodigo() {
		return this.ppjPacCodigo;
	}

	public void setPpjPacCodigo(Integer ppjPacCodigo) {
		this.ppjPacCodigo = ppjPacCodigo;
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
		if (!(other instanceof AelDataRespostaProtocolosId)) {
			return false;
		}
		AelDataRespostaProtocolosId castOther = (AelDataRespostaProtocolosId) other;

		return (this.getPpoPjqSeq() == castOther.getPpoPjqSeq())
				&& (this.getPpoSeqp() == castOther.getPpoSeqp())
				&& (this.getPpjPjqSeq() == castOther.getPpjPjqSeq())
				&& (this.getPpjPacCodigo() == castOther.getPpjPacCodigo())
				&& (this.getSeqp() == castOther.getSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPpoPjqSeq();
		result = 37 * result + this.getPpoSeqp();
		result = 37 * result + this.getPpjPjqSeq();
		result = 37 * result + this.getPpjPacCodigo();
		result = 37 * result + this.getSeqp();
		return result;
	}

}
