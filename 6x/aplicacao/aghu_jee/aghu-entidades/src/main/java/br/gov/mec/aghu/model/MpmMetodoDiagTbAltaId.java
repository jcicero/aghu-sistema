package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpmMetodoDiagTbAltaId generated by hbm2java
 */
@Embeddable
public class MpmMetodoDiagTbAltaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7752422077771872910L;
	private Integer actAtdSeq;
	private Short rmdMdtSeq;
	private Byte rmdSeqp;

	public MpmMetodoDiagTbAltaId() {
	}

	public MpmMetodoDiagTbAltaId(Integer actAtdSeq, Short rmdMdtSeq, Byte rmdSeqp) {
		this.actAtdSeq = actAtdSeq;
		this.rmdMdtSeq = rmdMdtSeq;
		this.rmdSeqp = rmdSeqp;
	}

	@Column(name = "ACT_ATD_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getActAtdSeq() {
		return this.actAtdSeq;
	}

	public void setActAtdSeq(Integer actAtdSeq) {
		this.actAtdSeq = actAtdSeq;
	}

	@Column(name = "RMD_MDT_SEQ", nullable = false, precision = 3, scale = 0)
	public Short getRmdMdtSeq() {
		return this.rmdMdtSeq;
	}

	public void setRmdMdtSeq(Short rmdMdtSeq) {
		this.rmdMdtSeq = rmdMdtSeq;
	}

	@Column(name = "RMD_SEQP", nullable = false, precision = 2, scale = 0)
	public Byte getRmdSeqp() {
		return this.rmdSeqp;
	}

	public void setRmdSeqp(Byte rmdSeqp) {
		this.rmdSeqp = rmdSeqp;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof MpmMetodoDiagTbAltaId)) {
			return false;
		}
		MpmMetodoDiagTbAltaId castOther = (MpmMetodoDiagTbAltaId) other;

		return (this.getActAtdSeq() == castOther.getActAtdSeq())
				&& (this.getRmdMdtSeq() == castOther.getRmdMdtSeq())
				&& (this.getRmdSeqp() == castOther.getRmdSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getActAtdSeq();
		result = 37 * result + this.getRmdMdtSeq();
		result = 37 * result + this.getRmdSeqp();
		return result;
	}

}
