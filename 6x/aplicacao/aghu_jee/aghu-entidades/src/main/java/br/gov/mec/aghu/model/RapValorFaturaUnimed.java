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
 * RapValorFaturaUnimed generated by hbm2java
 */
@Entity
@Table(name = "RAP_VALORES_FATURA_UNIMED", schema = "AGH")
public class RapValorFaturaUnimed extends BaseEntityId<RapValorFaturaUnimedId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6860973442160242591L;
	private RapValorFaturaUnimedId id;

	public RapValorFaturaUnimed() {
	}

	public RapValorFaturaUnimed(RapValorFaturaUnimedId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "codStarh", column = @Column(name = "COD_STARH", nullable = false)),
			@AttributeOverride(name = "nome", column = @Column(name = "NOME", length = 25)),
			@AttributeOverride(name = "valor", column = @Column(name = "VALOR", length = 6)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public RapValorFaturaUnimedId getId() {
		return this.id;
	}

	public void setId(RapValorFaturaUnimedId id) {
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
