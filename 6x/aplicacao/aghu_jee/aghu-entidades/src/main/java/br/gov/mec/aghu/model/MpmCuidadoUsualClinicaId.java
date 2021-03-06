package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpmCuidadoUsualClinicaId generated by hbm2java
 */
@Embeddable
public class MpmCuidadoUsualClinicaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6594366700703556435L;
	private Integer cduSeq;
	private Byte clcCodigo;

	public MpmCuidadoUsualClinicaId() {
	}

	public MpmCuidadoUsualClinicaId(Integer cduSeq, Byte clcCodigo) {
		this.cduSeq = cduSeq;
		this.clcCodigo = clcCodigo;
	}

	@Column(name = "CDU_SEQ", nullable = false, precision = 6, scale = 0)
	public Integer getCduSeq() {
		return this.cduSeq;
	}

	public void setCduSeq(Integer cduSeq) {
		this.cduSeq = cduSeq;
	}

	@Column(name = "CLC_CODIGO", nullable = false, precision = 2, scale = 0)
	public Byte getClcCodigo() {
		return this.clcCodigo;
	}

	public void setClcCodigo(Byte clcCodigo) {
		this.clcCodigo = clcCodigo;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof MpmCuidadoUsualClinicaId)) {
			return false;
		}
		MpmCuidadoUsualClinicaId castOther = (MpmCuidadoUsualClinicaId) other;

		return (this.getCduSeq().equals(castOther.getCduSeq()))
				&& (this.getClcCodigo().equals(castOther.getClcCodigo()));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCduSeq();
		result = 37 * result + this.getClcCodigo();
		return result;
	}

}
