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
 * AghTabelaDaLimpeza generated by hbm2java
 */
@Entity
@Table(name = "AGH_TABELAS_DA_LIMPEZA", schema = "AGH")
public class AghTabelaDaLimpeza extends BaseEntityId<AghTabelaDaLimpezaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -711646047024176427L;
	private AghTabelaDaLimpezaId id;

	public AghTabelaDaLimpeza() {
	}

	public AghTabelaDaLimpeza(AghTabelaDaLimpezaId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "nomeTab", column = @Column(name = "NOME_TAB", length = 30)),
			@AttributeOverride(name = "sisLimpeza", column = @Column(name = "SIS_LIMPEZA", length = 3)),
			@AttributeOverride(name = "criadoEm", column = @Column(name = "CRIADO_EM", length = 29)),
			@AttributeOverride(name = "indAvisado", column = @Column(name = "IND_AVISADO", length = 1)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public AghTabelaDaLimpezaId getId() {
		return this.id;
	}

	public void setId(AghTabelaDaLimpezaId id) {
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
		if (!(obj instanceof AghTabelaDaLimpeza)) {
			return false;
		}
		AghTabelaDaLimpeza other = (AghTabelaDaLimpeza) obj;
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
