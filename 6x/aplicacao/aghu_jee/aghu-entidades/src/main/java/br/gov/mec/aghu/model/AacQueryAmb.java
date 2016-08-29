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
 * AacQueryAmb generated by hbm2java
 */
@Entity
@Table(name = "AAC_QUERY_AMB", schema = "AGH")
public class AacQueryAmb extends BaseEntityId<AacQueryAmbId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7082015421608313177L;
	private AacQueryAmbId id;

	public AacQueryAmb() {
	}

	public AacQueryAmb(AacQueryAmbId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "pacCodigo", column = @Column(name = "PAC_CODIGO")),
			@AttributeOverride(name = "qtdCons", column = @Column(name = "QTD_CONS", precision = 17, scale = 17)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public AacQueryAmbId getId() {
		return this.id;
	}

	public void setId(AacQueryAmbId id) {
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
