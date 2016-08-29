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
 * AbsDoadorImpedidoTmp generated by hbm2java
 */
@Entity
@Table(name = "ABS_DOADORES_IMPEDIDOS_TMP", schema = "AGH")
public class AbsDoadorImpedidoTmp extends BaseEntityId<AbsDoadorImpedidoTmpId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4696641957255436587L;
	private AbsDoadorImpedidoTmpId id;

	public AbsDoadorImpedidoTmp() {
	}

	public AbsDoadorImpedidoTmp(AbsDoadorImpedidoTmpId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "nome", column = @Column(name = "NOME", length = 32)),
			@AttributeOverride(name = "dtNascimento", column = @Column(name = "DT_NASCIMENTO", length = 6)),
			@AttributeOverride(name = "dtDoacao", column = @Column(name = "DT_DOACAO", length = 6)),
			@AttributeOverride(name = "motivo", column = @Column(name = "MOTIVO", length = 11)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public AbsDoadorImpedidoTmpId getId() {
		return this.id;
	}

	public void setId(AbsDoadorImpedidoTmpId id) {
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
