package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatItensConvTiposConsultaId generated by hbm2java
 */
@Embeddable
public class FatItemConvTipoConsultaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1279457549962828641L;
	private Byte ctcSeqp;
	private Short ctcCnvCodigo;
	private Short iphPhoSeq;
	private Integer iphSeq;

	public FatItemConvTipoConsultaId() {
	}

	public FatItemConvTipoConsultaId(Byte ctcSeqp, Short ctcCnvCodigo,
			Short iphPhoSeq, Integer iphSeq) {
		this.ctcSeqp = ctcSeqp;
		this.ctcCnvCodigo = ctcCnvCodigo;
		this.iphPhoSeq = iphPhoSeq;
		this.iphSeq = iphSeq;
	}

	@Column(name = "CTC_SEQP", nullable = false, precision = 2, scale = 0)
	public Byte getCtcSeqp() {
		return this.ctcSeqp;
	}

	public void setCtcSeqp(Byte ctcSeqp) {
		this.ctcSeqp = ctcSeqp;
	}

	@Column(name = "CTC_CNV_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getCtcCnvCodigo() {
		return this.ctcCnvCodigo;
	}

	public void setCtcCnvCodigo(Short ctcCnvCodigo) {
		this.ctcCnvCodigo = ctcCnvCodigo;
	}

	@Column(name = "IPH_PHO_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getIphPhoSeq() {
		return this.iphPhoSeq;
	}

	public void setIphPhoSeq(Short iphPhoSeq) {
		this.iphPhoSeq = iphPhoSeq;
	}

	@Column(name = "IPH_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getIphSeq() {
		return this.iphSeq;
	}

	public void setIphSeq(Integer iphSeq) {
		this.iphSeq = iphSeq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof FatItemConvTipoConsultaId)) {
			return false;
		}
		FatItemConvTipoConsultaId castOther = (FatItemConvTipoConsultaId) other;

		return (this.getCtcSeqp() == castOther.getCtcSeqp())
				&& (this.getCtcCnvCodigo() == castOther.getCtcCnvCodigo())
				&& (this.getIphPhoSeq() == castOther.getIphPhoSeq())
				&& (this.getIphSeq() == castOther.getIphSeq());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCtcSeqp();
		result = 37 * result + this.getCtcCnvCodigo();
		result = 37 * result + this.getIphPhoSeq();
		result = 37 * result + this.getIphSeq();
		return result;
	}

}
