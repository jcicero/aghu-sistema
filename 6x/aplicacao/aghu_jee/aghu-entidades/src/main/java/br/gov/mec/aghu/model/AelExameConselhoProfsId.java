package br.gov.mec.aghu.model;

// Generated 14/03/2011 10:14:45 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelExameConselhoProfsId generated by hbm2java
 */
@Embeddable
public class AelExameConselhoProfsId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6429904611945218506L;
	private String emaExaSigla;
	private Integer emaManSeq;
	private Short cprCodigo;

	public AelExameConselhoProfsId() {
	}

	public AelExameConselhoProfsId(String emaExaSigla, Integer emaManSeq,
			Short cprCodigo) {
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
		this.cprCodigo = cprCodigo;
	}

	@Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getEmaExaSigla() {
		return this.emaExaSigla;
	}

	public void setEmaExaSigla(String emaExaSigla) {
		this.emaExaSigla = emaExaSigla;
	}

	@Column(name = "EMA_MAN_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getEmaManSeq() {
		return this.emaManSeq;
	}

	public void setEmaManSeq(Integer emaManSeq) {
		this.emaManSeq = emaManSeq;
	}

	@Column(name = "CPR_CODIGO", nullable = false, precision = 4, scale = 0)
	public Short getCprCodigo() {
		return this.cprCodigo;
	}

	public void setCprCodigo(Short cprCodigo) {
		this.cprCodigo = cprCodigo;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AelExameConselhoProfsId)) {
			return false;
		}
		AelExameConselhoProfsId castOther = (AelExameConselhoProfsId) other;

		return ((this.getEmaExaSigla().equals(castOther.getEmaExaSigla())) || (this
				.getEmaExaSigla() != null
				&& castOther.getEmaExaSigla() != null && this.getEmaExaSigla()
				.equals(castOther.getEmaExaSigla())))
				&& (this.getEmaManSeq().equals(castOther.getEmaManSeq()))
				&& (this.getCprCodigo().equals(castOther.getCprCodigo()));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getEmaExaSigla() == null ? 0 : this.getEmaExaSigla()
						.hashCode());
		result = 37 * result + this.getEmaManSeq();
		result = 37 * result + this.getCprCodigo();
		return result;
	}

}
