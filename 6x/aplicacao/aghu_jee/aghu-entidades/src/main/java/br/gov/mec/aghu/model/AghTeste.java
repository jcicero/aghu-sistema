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
 * AghTeste generated by hbm2java
 */
@Entity
@Table(name = "AGH_TESTE", schema = "AGH")
public class AghTeste extends BaseEntityId<AghTesteId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -917950154750971967L;
	private AghTesteId id;

	public AghTeste() {
	}

	public AghTeste(AghTesteId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "codigo", column = @Column(name = "CODIGO")),
			@AttributeOverride(name = "nome", column = @Column(name = "NOME", length = 10)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public AghTesteId getId() {
		return this.id;
	}

	public void setId(AghTesteId id) {
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
		if (!(obj instanceof AghTeste)) {
			return false;
		}
		AghTeste other = (AghTeste) obj;
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