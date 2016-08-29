package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * Localizacao generated by hbm2java
 */
@Entity
@Table(name = "LOCALIZACAO", schema = "AGH")
public class Localizacao extends BaseEntityId<LocalizacaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8910205650509329496L;
	private LocalizacaoId id;

	public Localizacao() {
	}

	public Localizacao(LocalizacaoId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "codLoc", column = @Column(name = "COD_LOC", precision = 17, scale = 17)),
			@AttributeOverride(name = "codUni", column = @Column(name = "COD_UNI", precision = 17, scale = 17)),
			@AttributeOverride(name = "descrLoc", column = @Column(name = "DESCR_LOC", length = 40)),
			@AttributeOverride(name = "ativo", column = @Column(name = "ATIVO", length = 1)),
			@AttributeOverride(name = "tempo", column = @Column(name = "TEMPO", precision = 17, scale = 17)) })
	public LocalizacaoId getId() {
		return this.id;
	}

	public void setId(LocalizacaoId id) {
		this.id = id;
	}

	public enum Fields {

		ID("id");

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
		if (!(obj instanceof Localizacao)) {
			return false;
		}
		Localizacao other = (Localizacao) obj;
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
