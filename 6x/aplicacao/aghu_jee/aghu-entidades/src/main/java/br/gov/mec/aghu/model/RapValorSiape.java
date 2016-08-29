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
 * RapValorSiape generated by hbm2java
 */
@Entity
@Table(name = "RAP_VALORES_SIAPE", schema = "AGH")
public class RapValorSiape extends BaseEntityId<RapValorSiapeId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8475668439315315520L;
	private RapValorSiapeId id;

	public RapValorSiape() {
	}

	public RapValorSiape(RapValorSiapeId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "referencia", column = @Column(name = "REFERENCIA")),
			@AttributeOverride(name = "matricula", column = @Column(name = "MATRICULA")),
			@AttributeOverride(name = "codRubr", column = @Column(name = "COD_RUBR")),
			@AttributeOverride(name = "vlrRubr", column = @Column(name = "VLR_RUBR", precision = 17, scale = 17)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public RapValorSiapeId getId() {
		return this.id;
	}

	public void setId(RapValorSiapeId id) {
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

}
