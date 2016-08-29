package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatProcedimentosModalidadeId generated by hbm2java
 */
@Embeddable
public class FatProcedimentosModalidadeId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9112794417984535101L;
	private Short motCodigo;
	private Integer iphSeq;
	private Short iphPhoSeq;

	public FatProcedimentosModalidadeId() {
	}

	public FatProcedimentosModalidadeId(Short motCodigo, Integer iphSeq,
			Short iphPhoSeq) {
		this.motCodigo = motCodigo;
		this.iphSeq = iphSeq;
		this.iphPhoSeq = iphPhoSeq;
	}

	@Column(name = "MOT_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getMotCodigo() {
		return this.motCodigo;
	}

	public void setMotCodigo(Short motCodigo) {
		this.motCodigo = motCodigo;
	}

	@Column(name = "IPH_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getIphSeq() {
		return this.iphSeq;
	}

	public void setIphSeq(Integer iphSeq) {
		this.iphSeq = iphSeq;
	}

	@Column(name = "IPH_PHO_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getIphPhoSeq() {
		return this.iphPhoSeq;
	}

	public void setIphPhoSeq(Short iphPhoSeq) {
		this.iphPhoSeq = iphPhoSeq;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((iphPhoSeq == null) ? 0 : iphPhoSeq.hashCode());
		result = prime * result + ((iphSeq == null) ? 0 : iphSeq.hashCode());
		result = prime * result
				+ ((motCodigo == null) ? 0 : motCodigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		FatProcedimentosModalidadeId other = (FatProcedimentosModalidadeId) obj;
		if (iphPhoSeq == null) {
			if (other.iphPhoSeq != null) {
				return false;
			}
		} else if (!iphPhoSeq.equals(other.iphPhoSeq)) {
			return false;
		}
		if (iphSeq == null) {
			if (other.iphSeq != null) {
				return false;
			}
		} else if (!iphSeq.equals(other.iphSeq)) {
			return false;
		}
		if (motCodigo == null) {
			if (other.motCodigo != null) {
				return false;
			}
		} else if (!motCodigo.equals(other.motCodigo)) {
			return false;
		}
		return true;
	}

}