package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * RarTipoItem generated by hbm2java
 */
@Entity
@Table(name = "RAR_TIPO_ITENS", schema = "AGH")
public class RarTipoItem extends BaseEntityId<RarTipoItemId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3148496349929198991L;
	private RarTipoItemId id;
	private Integer version;
	private RarAvaliacao rarAvaliacao;
	private String descricao;
	private Short peso;
	private Set<RarItemAvaliacao> rarItemAvaliacaos = new HashSet<RarItemAvaliacao>(0);

	public RarTipoItem() {
	}

	public RarTipoItem(RarTipoItemId id, RarAvaliacao rarAvaliacao, String descricao, Short peso) {
		this.id = id;
		this.rarAvaliacao = rarAvaliacao;
		this.descricao = descricao;
		this.peso = peso;
	}

	public RarTipoItem(RarTipoItemId id, RarAvaliacao rarAvaliacao, String descricao, Short peso,
			Set<RarItemAvaliacao> rarItemAvaliacaos) {
		this.id = id;
		this.rarAvaliacao = rarAvaliacao;
		this.descricao = descricao;
		this.peso = peso;
		this.rarItemAvaliacaos = rarItemAvaliacaos;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "avaSeq", column = @Column(name = "AVA_SEQ", nullable = false)),
			@AttributeOverride(name = "codigo", column = @Column(name = "CODIGO", nullable = false, length = 1)) })
	public RarTipoItemId getId() {
		return this.id;
	}

	public void setId(RarTipoItemId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AVA_SEQ", nullable = false, insertable = false, updatable = false)
	public RarAvaliacao getRarAvaliacao() {
		return this.rarAvaliacao;
	}

	public void setRarAvaliacao(RarAvaliacao rarAvaliacao) {
		this.rarAvaliacao = rarAvaliacao;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 40)
	@Length(max = 40)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "PESO", nullable = false)
	public Short getPeso() {
		return this.peso;
	}

	public void setPeso(Short peso) {
		this.peso = peso;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rarTipoItem")
	public Set<RarItemAvaliacao> getRarItemAvaliacaos() {
		return this.rarItemAvaliacaos;
	}

	public void setRarItemAvaliacaos(Set<RarItemAvaliacao> rarItemAvaliacaos) {
		this.rarItemAvaliacaos = rarItemAvaliacaos;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAR_AVALIACOES("rarAvaliacao"),
		DESCRICAO("descricao"),
		PESO("peso"),
		RAR_ITEM_AVALIACAOS("rarItemAvaliacaos");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
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
		if (!(obj instanceof RarTipoItem)) {
			return false;
		}
		RarTipoItem other = (RarTipoItem) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
