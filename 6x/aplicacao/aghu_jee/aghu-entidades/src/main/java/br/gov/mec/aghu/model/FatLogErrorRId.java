package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatLogErrorsRId generated by hbm2java
 */
@Embeddable
public class FatLogErrorRId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2191075389089380722L;
	private Date criadoEm;
	private String erro;
	private Integer cthSeq;

	public FatLogErrorRId() {
	}

	public FatLogErrorRId(Date criadoEm, String erro, Integer cthSeq) {
		this.criadoEm = criadoEm;
		this.erro = erro;
		this.cthSeq = cthSeq;
	}

	@Column(name = "CRIADO_EM", length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "ERRO", length = 300)
	@Length(max = 300)
	public String getErro() {
		return this.erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	@Column(name = "CTH_SEQ", precision = 8, scale = 0)
	public Integer getCthSeq() {
		return this.cthSeq;
	}

	public void setCthSeq(Integer cthSeq) {
		this.cthSeq = cthSeq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof FatLogErrorRId)) {
			return false;
		}
		FatLogErrorRId castOther = (FatLogErrorRId) other;

		return ((this.getCriadoEm() == castOther.getCriadoEm()) || (this
				.getCriadoEm() != null
				&& castOther.getCriadoEm() != null && this.getCriadoEm()
				.equals(castOther.getCriadoEm())))
				&& ((this.getErro() == castOther.getErro()) || (this.getErro() != null
						&& castOther.getErro() != null && this.getErro()
						.equals(castOther.getErro())))
				&& ((this.getCthSeq() == castOther.getCthSeq()) || (this
						.getCthSeq() != null
						&& castOther.getCthSeq() != null && this.getCthSeq()
						.equals(castOther.getCthSeq())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCriadoEm() == null ? 0 : this.getCriadoEm().hashCode());
		result = 37 * result
				+ (getErro() == null ? 0 : this.getErro().hashCode());
		result = 37 * result
				+ (getCthSeq() == null ? 0 : this.getCthSeq().hashCode());
		return result;
	}

}
