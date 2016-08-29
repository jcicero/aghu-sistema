package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * RarSelecaoCandidatoId generated by hbm2java
 */
@Embeddable
public class RarSelecaoCandidatoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4755325154589930062L;
	private Integer cpmPgaSeq;
	private Integer cpmCndSeq;
	private Date data;
	private String tipo;

	public RarSelecaoCandidatoId() {
	}

	public RarSelecaoCandidatoId(Integer cpmPgaSeq, Integer cpmCndSeq, Date data, String tipo) {
		this.cpmPgaSeq = cpmPgaSeq;
		this.cpmCndSeq = cpmCndSeq;
		this.data = data;
		this.tipo = tipo;
	}

	@Column(name = "CPM_PGA_SEQ", nullable = false)
	public Integer getCpmPgaSeq() {
		return this.cpmPgaSeq;
	}

	public void setCpmPgaSeq(Integer cpmPgaSeq) {
		this.cpmPgaSeq = cpmPgaSeq;
	}

	@Column(name = "CPM_CND_SEQ", nullable = false)
	public Integer getCpmCndSeq() {
		return this.cpmCndSeq;
	}

	public void setCpmCndSeq(Integer cpmCndSeq) {
		this.cpmCndSeq = cpmCndSeq;
	}

	@Column(name = "DATA", nullable = false, length = 29)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Column(name = "TIPO", nullable = false, length = 2)
	@Length(max = 2)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getData());
		umHashCodeBuilder.append(this.getTipo());
		umHashCodeBuilder.append(this.getCpmCndSeq());
		umHashCodeBuilder.append(this.getCpmPgaSeq());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof RarSelecaoCandidatoId)) {
			return false;
		}
		RarSelecaoCandidatoId other = (RarSelecaoCandidatoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getData(), other.getData());
		umEqualsBuilder.append(this.getTipo(), other.getTipo());
		umEqualsBuilder.append(this.getCpmCndSeq(), other.getCpmCndSeq());
		umEqualsBuilder.append(this.getCpmPgaSeq(), other.getCpmPgaSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
