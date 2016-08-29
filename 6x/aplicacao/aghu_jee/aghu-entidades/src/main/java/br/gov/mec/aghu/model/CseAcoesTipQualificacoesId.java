package br.gov.mec.aghu.model;

// Generated 05/01/2011 20:37:39 by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * CseAcoesTipQualificacoesId generated by hbm2java
 */
@Embeddable
public class CseAcoesTipQualificacoesId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6941443916200381758L;
	private Short acoSeq;
	private Integer tqlCodigo;

	public CseAcoesTipQualificacoesId() {
	}

	public CseAcoesTipQualificacoesId(Short acoSeq, Integer tqlCodigo) {
		this.acoSeq = acoSeq;
		this.tqlCodigo = tqlCodigo;
	}

	@Column(name = "ACO_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getAcoSeq() {
		return this.acoSeq;
	}

	public void setAcoSeq(Short acoSeq) {
		this.acoSeq = acoSeq;
	}

	@Column(name = "TQL_CODIGO", nullable = false, precision = 5, scale = 0)
	public Integer getTqlCodigo() {
		return this.tqlCodigo;
	}

	public void setTqlCodigo(Integer tqlCodigo) {
		this.tqlCodigo = tqlCodigo;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof CseAcoesTipQualificacoesId)) {
			return false;
		}
		CseAcoesTipQualificacoesId castOther = (CseAcoesTipQualificacoesId) other;

		return (this.getAcoSeq() == castOther.getAcoSeq())
				&& (this.getTqlCodigo() == castOther.getTqlCodigo());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAcoSeq();
		result = 37 * result + this.getTqlCodigo();
		return result;
	}

}
