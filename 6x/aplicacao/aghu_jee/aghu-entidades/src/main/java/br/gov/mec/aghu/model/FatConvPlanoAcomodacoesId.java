package br.gov.mec.aghu.model;

// Generated 13/05/2010 13:46:08 by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatConvPlanoAcomodacoesId generated by hbm2java
 */

@Embeddable
public class FatConvPlanoAcomodacoesId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2028302408090060398L;
	private Integer acmSeq;
	private Byte cspSeq;
	private Short cspCnvCodigo;

	public FatConvPlanoAcomodacoesId() {
	}

	@Column(name = "CSP_SEQ", nullable = false, precision = 2, scale = 0)
	public Byte getCspSeq() {
		return this.cspSeq;
	}

	public void setCspSeq(Byte cspSeq) {
		this.cspSeq = cspSeq;
	}

	@Column(name = "CSP_CNV_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getCspCnvCodigo() {
		return this.cspCnvCodigo;
	}

	public void setCspCnvCodigo(Short cspCnvCodigo) {
		this.cspCnvCodigo = cspCnvCodigo;
	}

	// private FatConvenioSaudePlano convenioSaudePlano;
	//	
	// @ManyToOne(fetch = FetchType.LAZY)
	// @JoinColumns( {
	// @JoinColumn(name = "CSP_CNV_CODIGO", referencedColumnName =
	// "CNV_CODIGO"),
	// @JoinColumn(name = "CSP_SEQ", referencedColumnName = "SEQ") })
	// public FatConvenioSaudePlano getConvenioSaudePlano() {
	// return convenioSaudePlano;
	// }
	//
	// public void setConvenioSaudePlano(FatConvenioSaudePlano
	// convenioSaudePlano) {
	// this.convenioSaudePlano = convenioSaudePlano;
	// }

	@Column(name = "ACM_SEQ", nullable = false, precision = 2, scale = 0)
	public Integer getAcmSeq() {
		return this.acmSeq;
	}

	public void setAcmSeq(Integer acmSeq) {
		this.acmSeq = acmSeq;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((acmSeq == null) ? 0 : acmSeq.hashCode());
		result = prime * result
				+ ((cspCnvCodigo == null) ? 0 : cspCnvCodigo.hashCode());
		result = prime * result + ((cspSeq == null) ? 0 : cspSeq.hashCode());
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
		FatConvPlanoAcomodacoesId other = (FatConvPlanoAcomodacoesId) obj;
		if (acmSeq == null) {
			if (other.acmSeq != null) {
				return false;
			}
		} else if (!acmSeq.equals(other.acmSeq)) {
			return false;
		}
		if (cspCnvCodigo == null) {
			if (other.cspCnvCodigo != null) {
				return false;
			}
		} else if (!cspCnvCodigo.equals(other.cspCnvCodigo)) {
			return false;
		}
		if (cspSeq == null) {
			if (other.cspSeq != null) {
				return false;
			}
		} else if (!cspSeq.equals(other.cspSeq)) {
			return false;
		}
		return true;
	}

}
