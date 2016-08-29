package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatGruposAtendimentos generated by hbm2java
 */
@Entity
@Table(name = "FAT_GRUPOS_ATENDIMENTOS", schema = "AGH")
@org.hibernate.annotations.Cache(usage=org.hibernate.annotations.CacheConcurrencyStrategy.TRANSACTIONAL)
public class FatGrupoAtendimento extends BaseEntityId<FatGrupoAtendimentosId> implements java.io.Serializable {
	private static final long serialVersionUID = -7887974837769905666L;
	
	private FatGrupoAtendimentosId id;
	private String descricao;
	private Byte codigoSus;
	private DominioSituacao indSituacaoRegistro;
	private Set<FatEspecGrupoAtendimento> fatEspecGrupoAtendimentos = new HashSet<FatEspecGrupoAtendimento>(
			0);
	private Set<FatItemGrupoAtend> fatItemGrupoAtends = new HashSet<FatItemGrupoAtend>(
			0);
	private Integer version;

	public FatGrupoAtendimento() {
	}

	public FatGrupoAtendimento(FatGrupoAtendimentosId id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public FatGrupoAtendimento(FatGrupoAtendimentosId id, String descricao,
			Byte codigoSus, DominioSituacao indSituacaoRegistro,
			Set<FatEspecGrupoAtendimento> fatEspecGrupoAtendimentos,
			Set<FatItemGrupoAtend> fatItemGrupoAtends) {
		this.id = id;
		this.descricao = descricao;
		this.codigoSus = codigoSus;
		this.indSituacaoRegistro = indSituacaoRegistro;
		this.fatEspecGrupoAtendimentos = fatEspecGrupoAtendimentos;
		this.fatItemGrupoAtends = fatItemGrupoAtends;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "cnvCodigo", column = @Column(name = "CNV_CODIGO", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 2, scale = 0)) })
	public FatGrupoAtendimentosId getId() {
		return this.id;
	}

	public void setId(FatGrupoAtendimentosId id) {
		this.id = id;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 50)
	@Length(max = 50)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "CODIGO_SUS", precision = 2, scale = 0)
	public Byte getCodigoSus() {
		return this.codigoSus;
	}

	public void setCodigoSus(Byte codigoSus) {
		this.codigoSus = codigoSus;
	}
	

	@Column(name = "IND_SITUACAO_REGISTRO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacaoRegistro() {
		return this.indSituacaoRegistro;
	}

	public void setIndSituacaoRegistro(DominioSituacao indSituacaoRegistro) {
		this.indSituacaoRegistro = indSituacaoRegistro;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatGrupoAtendimento")
	public Set<FatEspecGrupoAtendimento> getFatEspecGrupoAtendimentos() {
		return this.fatEspecGrupoAtendimentos;
	}

	public void setFatEspecGrupoAtendimentos(
			Set<FatEspecGrupoAtendimento> fatEspecGrupoAtendimentos) {
		this.fatEspecGrupoAtendimentos = fatEspecGrupoAtendimentos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatGrupoAtendimento")
	public Set<FatItemGrupoAtend> getFatItemGrupoAtends() {
		return this.fatItemGrupoAtends;
	}

	public void setFatItemGrupoAtends(
			Set<FatItemGrupoAtend> fatItemGrupoAtends) {
		this.fatItemGrupoAtends = fatItemGrupoAtends;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		FatGrupoAtendimento other = (FatGrupoAtendimento) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
	

	public enum Fields {

		FAT_ESPEC_GRUPO_ATENDIMENTOS("fatEspecGrupoAtendimentos"),
		FAT_ITEM_GRUPO_ATENDS("fatItemGrupoAtends"),
		IND_SITUACAO_REGISTRO("indSituacaoRegistro"),
		CODIGO_SUS("codigoSus"),
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
