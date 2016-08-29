package br.gov.mec.aghu.model;

// Generated 28/04/2010 18:27:18 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatCaractItemProcHospId generated by hbm2java
 */
@Embeddable

public class FatCaractItemProcHospId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3268188402678998907L;
	/**
	 * @see FatProcedimentosHospitalares
	 * @see FatItensProcedHospitalarId#getSeq()
	 */
	private Short iphPhoSeq;
	/**
	 * @see FatProcedimentosHospitalares
	 * @see FatItensProcedHospitalarId#getSeq()
	 */
	private Integer iphSeq;
	/**
	 * @see FatTipoCaractItens
	 */
	private Integer tctSeq;

	public FatCaractItemProcHospId() {
	}

	public FatCaractItemProcHospId(Short iphPhoSeq, Integer iphSeq,
			Integer tctSeq) {
		this.iphPhoSeq = iphPhoSeq;
		this.iphSeq = iphSeq;
		this.tctSeq = tctSeq;
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

	@Column(name = "TCT_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getTctSeq() {
		return this.tctSeq;
	}

	public void setTctSeq(Integer tctSeq) {
		this.tctSeq = tctSeq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof FatCaractItemProcHospId)) {
			return false;
		}
		FatCaractItemProcHospId castOther = (FatCaractItemProcHospId) other;

		return (this.getIphPhoSeq() == castOther.getIphPhoSeq())
				&& (this.getIphSeq() == castOther.getIphSeq())
				&& ((this.getTctSeq() == castOther.getTctSeq()) || (this
						.getTctSeq() != null
						&& castOther.getTctSeq() != null && this.getTctSeq()
						.equals(castOther.getTctSeq())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIphPhoSeq();
		result = 37 * result + this.getIphSeq();
		result = 37 * result
				+ (getTctSeq() == null ? 0 : this.getTctSeq().hashCode());
		return result;
	}

}