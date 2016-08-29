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
 * RapConceito generated by hbm2java
 */
@Entity
@Table(name = "RAP_CONCEITOS", schema = "AGH")
public class RapConceito extends BaseEntityId<RapConceitoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7696028019482803148L;
	private RapConceitoId id;
	private Integer version;
	private RapTipoCompetencia rapTipoCompetencia;
	private Short nivel;
	private String descricao;
	private Float notaMin;
	private Float notaMax;
	private Float notaPadrao;
	private String indConsidera;
	private Set<RapItemAvaliacaoServ> rapItensAvaliacaoServsForRapIasCncFk1 = new HashSet<RapItemAvaliacaoServ>(0);
	private Set<RapItemAvaliacaoServ> rapItensAvaliacaoServsForRapIasCncFk2 = new HashSet<RapItemAvaliacaoServ>(0);

	public RapConceito() {
	}

	public RapConceito(RapConceitoId id, RapTipoCompetencia rapTipoCompetencia, String descricao, String indConsidera) {
		this.id = id;
		this.rapTipoCompetencia = rapTipoCompetencia;
		this.descricao = descricao;
		this.indConsidera = indConsidera;
	}

	public RapConceito(RapConceitoId id, RapTipoCompetencia rapTipoCompetencia, Short nivel, String descricao, Float notaMin,
			Float notaMax, Float notaPadrao, String indConsidera, Set<RapItemAvaliacaoServ> rapItensAvaliacaoServsForRapIasCncFk1,
			Set<RapItemAvaliacaoServ> rapItensAvaliacaoServsForRapIasCncFk2) {
		this.id = id;
		this.rapTipoCompetencia = rapTipoCompetencia;
		this.nivel = nivel;
		this.descricao = descricao;
		this.notaMin = notaMin;
		this.notaMax = notaMax;
		this.notaPadrao = notaPadrao;
		this.indConsidera = indConsidera;
		this.rapItensAvaliacaoServsForRapIasCncFk1 = rapItensAvaliacaoServsForRapIasCncFk1;
		this.rapItensAvaliacaoServsForRapIasCncFk2 = rapItensAvaliacaoServsForRapIasCncFk2;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "tcmCodigo", column = @Column(name = "TCM_CODIGO", nullable = false, length = 2)),
			@AttributeOverride(name = "conceito", column = @Column(name = "CONCEITO", nullable = false, length = 1)) })
	public RapConceitoId getId() {
		return this.id;
	}

	public void setId(RapConceitoId id) {
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
	@JoinColumn(name = "TCM_CODIGO", nullable = false, insertable = false, updatable = false)
	public RapTipoCompetencia getRapTipoCompetencia() {
		return this.rapTipoCompetencia;
	}

	public void setRapTipoCompetencia(RapTipoCompetencia rapTipoCompetencia) {
		this.rapTipoCompetencia = rapTipoCompetencia;
	}

	@Column(name = "NIVEL")
	public Short getNivel() {
		return this.nivel;
	}

	public void setNivel(Short nivel) {
		this.nivel = nivel;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 85)
	@Length(max = 85)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "NOTA_MIN", precision = 8, scale = 8)
	public Float getNotaMin() {
		return this.notaMin;
	}

	public void setNotaMin(Float notaMin) {
		this.notaMin = notaMin;
	}

	@Column(name = "NOTA_MAX", precision = 8, scale = 8)
	public Float getNotaMax() {
		return this.notaMax;
	}

	public void setNotaMax(Float notaMax) {
		this.notaMax = notaMax;
	}

	@Column(name = "NOTA_PADRAO", precision = 8, scale = 8)
	public Float getNotaPadrao() {
		return this.notaPadrao;
	}

	public void setNotaPadrao(Float notaPadrao) {
		this.notaPadrao = notaPadrao;
	}

	@Column(name = "IND_CONSIDERA", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndConsidera() {
		return this.indConsidera;
	}

	public void setIndConsidera(String indConsidera) {
		this.indConsidera = indConsidera;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rapConceitosByRapIasCncFk1")
	public Set<RapItemAvaliacaoServ> getRapItensAvaliacaoServsForRapIasCncFk1() {
		return this.rapItensAvaliacaoServsForRapIasCncFk1;
	}

	public void setRapItensAvaliacaoServsForRapIasCncFk1(Set<RapItemAvaliacaoServ> rapItensAvaliacaoServsForRapIasCncFk1) {
		this.rapItensAvaliacaoServsForRapIasCncFk1 = rapItensAvaliacaoServsForRapIasCncFk1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rapConceitosByRapIasCncFk2")
	public Set<RapItemAvaliacaoServ> getRapItensAvaliacaoServsForRapIasCncFk2() {
		return this.rapItensAvaliacaoServsForRapIasCncFk2;
	}

	public void setRapItensAvaliacaoServsForRapIasCncFk2(Set<RapItemAvaliacaoServ> rapItensAvaliacaoServsForRapIasCncFk2) {
		this.rapItensAvaliacaoServsForRapIasCncFk2 = rapItensAvaliacaoServsForRapIasCncFk2;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_TIPOS_COMPETENCIA("rapTipoCompetencia"),
		NIVEL("nivel"),
		DESCRICAO("descricao"),
		NOTA_MIN("notaMin"),
		NOTA_MAX("notaMax"),
		NOTA_PADRAO("notaPadrao"),
		IND_CONSIDERA("indConsidera"),
		RAP_ITENS_AVALIACAO_SERVS_FOR_RAP_IAS_CNC_FK1("rapItensAvaliacaoServsForRapIasCncFk1"),
		RAP_ITENS_AVALIACAO_SERVS_FOR_RAP_IAS_CNC_FK2("rapItensAvaliacaoServsForRapIasCncFk2");

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
		if (!(obj instanceof RapConceito)) {
			return false;
		}
		RapConceito other = (RapConceito) obj;
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
