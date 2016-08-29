package br.gov.mec.aghu.model;

// Generated 13/06/2011 10:22:04 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MamItemEvolucoes generated by hbm2java
 */
@Entity
@Table(name = "MAM_ITEM_EVOLUCOES", schema = "AGH")
public class MamItemEvolucoes extends BaseEntityId<MamItemEvolucoesId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3213431163672861292L;
	private MamItemEvolucoesId id;
	private String descricao;
	private MamEvolucoes evolucao;
	private MamTipoItemEvolucao tipoItemEvolucao ;
	private Integer version;

	public MamItemEvolucoes() {
	}

	public MamItemEvolucoes(MamItemEvolucoesId id) {
		this.id = id;
	}

	public MamItemEvolucoes(MamItemEvolucoesId id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "evoSeq", column = @Column(name = "EVO_SEQ", nullable = false, precision = 14, scale = 0)),
			@AttributeOverride(name = "tieSeq", column = @Column(name = "TIE_SEQ", nullable = false, precision = 5, scale = 0)) })
	public MamItemEvolucoesId getId() {
		return this.id;
	}

	public void setId(MamItemEvolucoesId id) {
		this.id = id;
	}

	@Column(name = "DESCRICAO")
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EVO_SEQ", nullable = false, insertable = false, updatable = false)
	public MamEvolucoes getEvolucao() {
		return this.evolucao;
	}
	
	public void setEvolucao(MamEvolucoes evolucao) {
		this.evolucao = evolucao;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TIE_SEQ", insertable=false, updatable=false)	
	public MamTipoItemEvolucao getTipoItemEvolucao() {
		return tipoItemEvolucao;
	}

	public void setTipoItemEvolucao(MamTipoItemEvolucao tipoItemEvolucao) {
		this.tipoItemEvolucao = tipoItemEvolucao;
	}
	
	@Version
	public Integer getVersion() {
		return version;
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
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		MamItemEvolucoes other = (MamItemEvolucoes) obj;
		if (id == null) {
			if (other.id != null){
				return false;
			}
		} else if (!id.equals(other.id)){
			return false;
		}
		return true;
	}

	public enum Fields {
		EVO_SEQ("id.evoSeq"),TIE_SEQ("id.tieSeq"), DESCRICAO("descricao"),
		EVOLUCAO("evolucao"), TIPO_ITEM_EVOLUCAO("tipoItemEvolucao");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}
	
}
