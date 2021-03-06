package br.gov.mec.aghu.model;

// Generated 23/11/2011 17:16:51 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * VScoClasMaterialId generated by hbm2java
 */
@Embeddable
public class VScoClasMaterialId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8694754748802839667L;
	private Short grupo;
	private Short classif1;
	private Short classif2;
	private Short classif3;
	private Short classif4;
	private Short classif5;
	private String descricao;
	private Long numero;

	public VScoClasMaterialId() {
	}

	public VScoClasMaterialId(Short grupo, Short classif1, Short classif2,
			Short classif3, Short classif4, Short classif5, String descricao,
			Long numero) {
		this.grupo = grupo;
		this.classif1 = classif1;
		this.classif2 = classif2;
		this.classif3 = classif3;
		this.classif4 = classif4;
		this.classif5 = classif5;
		this.descricao = descricao;
		this.numero = numero;
	}

	@Column(name = "GRUPO")
	public Short getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Short grupo) {
		this.grupo = grupo;
	}

	@Column(name = "CLASSIF1")
	public Short getClassif1() {
		return this.classif1;
	}

	public void setClassif1(Short classif1) {
		this.classif1 = classif1;
	}

	@Column(name = "CLASSIF2")
	public Short getClassif2() {
		return this.classif2;
	}

	public void setClassif2(Short classif2) {
		this.classif2 = classif2;
	}

	@Column(name = "CLASSIF3")
	public Short getClassif3() {
		return this.classif3;
	}

	public void setClassif3(Short classif3) {
		this.classif3 = classif3;
	}

	@Column(name = "CLASSIF4")
	public Short getClassif4() {
		return this.classif4;
	}

	public void setClassif4(Short classif4) {
		this.classif4 = classif4;
	}

	@Column(name = "CLASSIF5")
	public Short getClassif5() {
		return this.classif5;
	}

	public void setClassif5(Short classif5) {
		this.classif5 = classif5;
	}

	@Column(name = "DESCRICAO", length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "NUMERO")
	public Long getNumero() {
		return this.numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}
	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getDescricao());
		umHashCodeBuilder.append(this.getNumero());
		umHashCodeBuilder.append(this.getGrupo());
		umHashCodeBuilder.append(this.getClassif3());
		umHashCodeBuilder.append(this.getClassif4());
		umHashCodeBuilder.append(this.getClassif5());
		umHashCodeBuilder.append(this.getClassif1());
		umHashCodeBuilder.append(this.getClassif2());
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
		if (!(obj instanceof VScoClasMaterialId)) {
			return false;
		}
		VScoClasMaterialId other = (VScoClasMaterialId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getDescricao(), other.getDescricao());
		umEqualsBuilder.append(this.getNumero(), other.getNumero());
		umEqualsBuilder.append(this.getGrupo(), other.getGrupo());
		umEqualsBuilder.append(this.getClassif3(), other.getClassif3());
		umEqualsBuilder.append(this.getClassif4(), other.getClassif4());
		umEqualsBuilder.append(this.getClassif5(), other.getClassif5());
		umEqualsBuilder.append(this.getClassif1(), other.getClassif1());
		umEqualsBuilder.append(this.getClassif2(), other.getClassif2());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}