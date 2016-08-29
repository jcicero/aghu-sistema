package br.gov.mec.aghu.model;

// Generated 17/10/2011 14:21:24 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * EpeSubgruposNecesBasicas generated by hbm2java
 */
@Entity
@Table(name = "EPE_SUBGRUPOS_NECES_BASICAS", schema = "AGH")
public class EpeSubgrupoNecesBasica extends BaseEntityId<EpeSubgrupoNecesBasicaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8773201052511503445L;
	private EpeSubgrupoNecesBasicaId id;
	private Integer version;
	private EpeGrupoNecesBasica grupoNecesBasica;
	private String descricao;
	private DominioSituacao situacao;
	private Set<EpeDiagnostico> diagnosticos = new HashSet<EpeDiagnostico>(
			0);

	public EpeSubgrupoNecesBasica() {
	}

	public EpeSubgrupoNecesBasica(EpeSubgrupoNecesBasicaId id,
			EpeGrupoNecesBasica grupoNecesBasica, String descricao,
			DominioSituacao situacao) {
		this.id = id;
		this.grupoNecesBasica = grupoNecesBasica;
		this.descricao = descricao;
		this.situacao = situacao;
	}

	public EpeSubgrupoNecesBasica(EpeSubgrupoNecesBasicaId id,
			EpeGrupoNecesBasica grupoNecesBasica, String descricao,
			DominioSituacao situacao, Set<EpeDiagnostico> diagnosticos) {
		this.id = id;
		this.grupoNecesBasica = grupoNecesBasica;
		this.descricao = descricao;
		this.situacao = situacao;
		this.diagnosticos = diagnosticos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "gnbSeq", column = @Column(name = "GNB_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "sequencia", column = @Column(name = "SEQUENCIA", nullable = false, precision = 3, scale = 0)) })
	public EpeSubgrupoNecesBasicaId getId() {
		return this.id;
	}

	public void setId(EpeSubgrupoNecesBasicaId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false, precision = 9, scale = 0)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GNB_SEQ", insertable = false, updatable = false)
	public EpeGrupoNecesBasica getGrupoNecesBasica() {
		return this.grupoNecesBasica;
	}

	public void setGrupoNecesBasica(
			EpeGrupoNecesBasica grupoNecesBasica) {
		this.grupoNecesBasica = grupoNecesBasica;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "subgrupoNecesBasica")
	public Set<EpeDiagnostico> getDiagnosticos() {
		return this.diagnosticos;
	}

	public void setDiagnosticos(Set<EpeDiagnostico> diagnosticos) {
		this.diagnosticos = diagnosticos;
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
		EpeSubgrupoNecesBasica other = (EpeSubgrupoNecesBasica) obj;
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
		SEQ("id.sequencia"),
		GNB_SEQ("id.gnbSeq"),
		DESCRICAO("descricao"),
		SITUACAO("situacao"),
		GRUPO_NECES_BASICA("grupoNecesBasica");

		private String field;

		private Fields(String field) {
			this.field = field;
		}

		@Override
		public String toString() {
			return this.field;
		}
	}

}
