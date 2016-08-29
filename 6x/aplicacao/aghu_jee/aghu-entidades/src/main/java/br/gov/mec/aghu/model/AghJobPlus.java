package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AghJobPlus generated by hbm2java
 */
@Entity
@Table(name = "AGH_JOBS_PLUS", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = { "nome", "banco" }))
public class AghJobPlus extends BaseEntityId<AghJobPlusId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4882322232553603451L;
	private AghJobPlusId id;

	public AghJobPlus() {
	}

	public AghJobPlus(AghJobPlusId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "nome", column = @Column(name = "NOME", nullable = false, length = 500)),
			@AttributeOverride(name = "banco", column = @Column(name = "BANCO", length = 10)),
			@AttributeOverride(name = "analistasResp", column = @Column(name = "ANALISTAS_RESP", length = 100)),
			@AttributeOverride(name = "periodicidade", column = @Column(name = "PERIODICIDADE", nullable = false, length = 4000)),
			@AttributeOverride(name = "criadoEm", column = @Column(name = "CRIADO_EM", length = 29)),
			@AttributeOverride(name = "situacao", column = @Column(name = "SITUACAO", length = 1)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public AghJobPlusId getId() {
		return this.id;
	}

	public void setId(AghJobPlusId id) {
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
