package br.gov.mec.aghu.model;

// Generated 23/09/2011 16:00:08 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * SceMotivoMovimentosId generated by hbm2java
 */
@Embeddable
public class SceMotivoMovimentoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8710014605012694388L;
	private Short tmvSeq;
	private Byte tmvComplemento;
	private Short numero;

	public SceMotivoMovimentoId() {
	}

	public SceMotivoMovimentoId(Short tmvSeq, Byte tmvComplemento, Short numero) {
		this.tmvSeq = tmvSeq;
		this.tmvComplemento = tmvComplemento;
		this.numero = numero;
	}

	@Column(name = "TMV_SEQ", nullable = false, precision = 3, scale = 0)
	public Short getTmvSeq() {
		return this.tmvSeq;
	}

	public void setTmvSeq(Short tmvSeq) {
		this.tmvSeq = tmvSeq;
	}

	@Column(name = "TMV_COMPLEMENTO", nullable = false, precision = 2, scale = 0)
	public Byte getTmvComplemento() {
		return this.tmvComplemento;
	}

	public void setTmvComplemento(Byte tmvComplemento) {
		this.tmvComplemento = tmvComplemento;
	}

	@Column(name = "NUMERO", nullable = false, precision = 3, scale = 0)
	public Short getNumero() {
		return this.numero;
	}

	public void setNumero(Short numero) {
		this.numero = numero;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof SceMotivoMovimentoId)) {
			return false;
		}
		SceMotivoMovimentoId castOther = (SceMotivoMovimentoId) other;

		return (this.getTmvSeq().equals(castOther.getTmvSeq()))
				&& (this.getTmvComplemento().equals(castOther.getTmvComplemento()))
				&& (this.getNumero().equals(castOther.getNumero()));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTmvSeq();
		result = 37 * result + this.getTmvComplemento();
		result = 37 * result + this.getNumero();
		return result;
	}

}
