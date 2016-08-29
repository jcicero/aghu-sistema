package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityCodigo;

/**
 * FatHabilitacoes generated by hbm2java
 */
@Entity
@Table(name = "FAT_HABILITACOES", schema = "AGH")
public class FatHabilitacao extends BaseEntityCodigo<String> implements java.io.Serializable {
	private static final long serialVersionUID = 5169786567490672630L;
	
	private String codigo;
	private String descricao;
	private Set<FatProcedimentoIncremento> fatProcedimentoIncrementos = new HashSet<FatProcedimentoIncremento>(
			0);
	private Set<FatProcedimentoHabilitacao> fatProcedimentoHabilitacoes = new HashSet<FatProcedimentoHabilitacao>(
			0);
	private Integer version;

	public FatHabilitacao() {
	}

	public FatHabilitacao(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public FatHabilitacao(String codigo, String descricao,
			Set<FatProcedimentoIncremento> fatProcedimentoIncrementos,
			Set<FatProcedimentoHabilitacao> fatProcedimentoHabilitacoes) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.fatProcedimentoIncrementos = fatProcedimentoIncrementos;
		this.fatProcedimentoHabilitacoes = fatProcedimentoHabilitacoes;
	}

	@Id
	@Column(name = "CODIGO", unique = true, nullable = false, length = 4)
	@Length(max = 4)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 135)
	@Length(max = 135)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatHabilitacao")
	public Set<FatProcedimentoIncremento> getFatProcedimentoIncrementos() {
		return this.fatProcedimentoIncrementos;
	}

	public void setFatProcedimentoIncrementos(
			Set<FatProcedimentoIncremento> fatProcedimentoIncrementos) {
		this.fatProcedimentoIncrementos = fatProcedimentoIncrementos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatHabilitacao")
	public Set<FatProcedimentoHabilitacao> getFatProcedimentoHabilitacoes() {
		return this.fatProcedimentoHabilitacoes;
	}

	public void setFatProcedimentoHabilitacoes(
			Set<FatProcedimentoHabilitacao> fatProcedimentoHabilitacoes) {
		this.fatProcedimentoHabilitacoes = fatProcedimentoHabilitacoes;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		FatHabilitacao other = (FatHabilitacao) obj;
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		return true;
	}
	
	
	public enum Fields {

		CODIGO("codigo"),
		DESCRICAO("descricao"),
		FAT_PROCEDIMENTO_INCREMENTOS("fatProcedimentoIncrementos"),
		FAT_PROCEDIMENTO_HABILITACOES("fatProcedimentoHabilitacoes"),
		;

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

}
