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
 * RapTmpAlunoUfrgs generated by hbm2java
 */
@Entity
@Table(name = "RAP_TMP_ALUNOS_UFRGS", schema = "AGH")
public class RapTmpAlunoUfrgs extends BaseEntityId<RapTmpAlunoUfrgsId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4249176723078230332L;
	private RapTmpAlunoUfrgsId id;

	public RapTmpAlunoUfrgs() {
	}

	public RapTmpAlunoUfrgs(RapTmpAlunoUfrgsId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "nome", column = @Column(name = "NOME", length = 50)),
			@AttributeOverride(name = "faculdade", column = @Column(name = "FACULDADE", length = 50)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public RapTmpAlunoUfrgsId getId() {
		return this.id;
	}

	public void setId(RapTmpAlunoUfrgsId id) {
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
		if (!(obj instanceof RapTmpAlunoUfrgs)) {
			return false;
		}
		RapTmpAlunoUfrgs other = (RapTmpAlunoUfrgs) obj;
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
