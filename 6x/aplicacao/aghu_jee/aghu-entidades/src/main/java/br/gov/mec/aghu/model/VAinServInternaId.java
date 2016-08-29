package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * VAinServInternaId generated by hbm2java
 */
@Embeddable
public class VAinServInternaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8394658393904155703L;
	private Integer matricula;
	private Short vinCodigo;
	private String nome;
	private String nomeUsual;
	private String nroRegConselho;
	private Short espSeq;

	public VAinServInternaId() {
	}

	public VAinServInternaId(Integer matricula, Short vinCodigo, String nome, String nomeUsual, String nroRegConselho, Short espSeq) {
		this.matricula = matricula;
		this.vinCodigo = vinCodigo;
		this.nome = nome;
		this.nomeUsual = nomeUsual;
		this.nroRegConselho = nroRegConselho;
		this.espSeq = espSeq;
	}

	@Column(name = "MATRICULA")
	public Integer getMatricula() {
		return this.matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Column(name = "VIN_CODIGO")
	public Short getVinCodigo() {
		return this.vinCodigo;
	}

	public void setVinCodigo(Short vinCodigo) {
		this.vinCodigo = vinCodigo;
	}

	@Column(name = "NOME", length = 50)
	@Length(max = 50)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "NOME_USUAL", length = 15)
	@Length(max = 15)
	public String getNomeUsual() {
		return this.nomeUsual;
	}

	public void setNomeUsual(String nomeUsual) {
		this.nomeUsual = nomeUsual;
	}

	@Column(name = "NRO_REG_CONSELHO", length = 9)
	@Length(max = 9)
	public String getNroRegConselho() {
		return this.nroRegConselho;
	}

	public void setNroRegConselho(String nroRegConselho) {
		this.nroRegConselho = nroRegConselho;
	}

	@Column(name = "ESP_SEQ")
	public Short getEspSeq() {
		return this.espSeq;
	}

	public void setEspSeq(Short espSeq) {
		this.espSeq = espSeq;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getEspSeq());
		umHashCodeBuilder.append(this.getMatricula());
		umHashCodeBuilder.append(this.getVinCodigo());
		umHashCodeBuilder.append(this.getNome());
		umHashCodeBuilder.append(this.getNomeUsual());
		umHashCodeBuilder.append(this.getNroRegConselho());
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
		if (!(obj instanceof VAinServInternaId)) {
			return false;
		}
		VAinServInternaId other = (VAinServInternaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getEspSeq(), other.getEspSeq());
		umEqualsBuilder.append(this.getMatricula(), other.getMatricula());
		umEqualsBuilder.append(this.getVinCodigo(), other.getVinCodigo());
		umEqualsBuilder.append(this.getNome(), other.getNome());
		umEqualsBuilder.append(this.getNomeUsual(), other.getNomeUsual());
		umEqualsBuilder.append(this.getNroRegConselho(), other.getNroRegConselho());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
