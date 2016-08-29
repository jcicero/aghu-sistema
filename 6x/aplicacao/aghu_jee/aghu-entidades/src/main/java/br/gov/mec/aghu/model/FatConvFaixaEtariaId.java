package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatConvFaixaEtariasId generated by hbm2java
 */
@Embeddable
public class FatConvFaixaEtariaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6800774809853357586L;
	/**
	 * @see FatConvenioSaude#getCodigo()
	 */
	private Short cnvCodigo;
	private Byte seqp;

	public FatConvFaixaEtariaId() {
	}

	public FatConvFaixaEtariaId(Short cnvCodigo, Byte seqp) {
		this.cnvCodigo = cnvCodigo;
		this.seqp = seqp;
	}

	@Column(name = "CNV_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getCnvCodigo() {
		return this.cnvCodigo;
	}

	public void setCnvCodigo(Short cnvCodigo) {
		this.cnvCodigo = cnvCodigo;
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
		if (!(other instanceof FatConvFaixaEtariaId)) {
			return false;
		}
		FatConvFaixaEtariaId castOther = (FatConvFaixaEtariaId) other;

		return this.getCnvCodigo().equals(castOther.getCnvCodigo())
				&& this.getSeqp().equals(castOther.getSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCnvCodigo();
		result = 37 * result + this.getSeqp();
		return result;
	}

}
