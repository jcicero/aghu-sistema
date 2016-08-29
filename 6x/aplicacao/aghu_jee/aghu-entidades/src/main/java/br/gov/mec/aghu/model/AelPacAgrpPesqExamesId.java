package br.gov.mec.aghu.model;

// Generated 08/02/2010 17:25:25 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelPacAgrpPesqExamesId generated by hbm2java
 */
@Embeddable
public class AelPacAgrpPesqExamesId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2600976375358559042L;
	private Integer axeSeq;
	private Integer pacCodigo;

	public AelPacAgrpPesqExamesId() {
	}

	public AelPacAgrpPesqExamesId(Integer axeSeq, Integer pacCodigo) {
		this.axeSeq = axeSeq;
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "AXE_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getAxeSeq() {
		return this.axeSeq;
	}

	public void setAxeSeq(Integer axeSeq) {
		this.axeSeq = axeSeq;
	}

	@Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AelPacAgrpPesqExamesId)) {
			return false;
		}
		AelPacAgrpPesqExamesId castOther = (AelPacAgrpPesqExamesId) other;

		return this.getAxeSeq() != null && this.getAxeSeq().equals(castOther.getAxeSeq()) &&
				this.getPacCodigo() != null && this.getPacCodigo().equals(castOther.getPacCodigo());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (this.getAxeSeq() == null ? 0 : this.getAxeSeq().hashCode());
		result = 37 * result + (this.getPacCodigo() == null ? 0 : this.getPacCodigo().hashCode());
		return result;
	}

}
