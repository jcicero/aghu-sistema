package br.gov.mec.aghu.model;

// Generated 25/01/2011 10:42:05 by Hibernate Tools 3.3.0.GA

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelItensPedidosExames generated by hbm2java
 */
@Entity
@Table(name = "AEL_ITENS_PEDIDOS_EXAMES", schema = "AGH")
public class AelItemPedidoExame extends BaseEntityId<AelItemPedidoExameId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8887243663600850294L;
	private AelItemPedidoExameId id;
	private AelPedidoExame aelPedidosExames;

	public AelItemPedidoExame() {
	}

	public AelItemPedidoExame(AelItemPedidoExameId id,
			AelPedidoExame aelPedidosExames) {
		this.id = id;
		this.aelPedidosExames = aelPedidosExames;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "pexSeq", column = @Column(name = "PEX_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "ufeEmaExaSigla", column = @Column(name = "UFE_EMA_EXA_SIGLA", nullable = false, length = 5)),
			@AttributeOverride(name = "ufeEmaManSeq", column = @Column(name = "UFE_EMA_MAN_SEQ", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "ufeUnfSeq", column = @Column(name = "UFE_UNF_SEQ", nullable = false, precision = 4, scale = 0)) })
	public AelItemPedidoExameId getId() {
		return this.id;
	}

	public void setId(AelItemPedidoExameId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PEX_SEQ", nullable = false, insertable = false, updatable = false)
	public AelPedidoExame getAelPedidosExames() {
		return this.aelPedidosExames;
	}

	public void setAelPedidosExames(AelPedidoExame aelPedidosExames) {
		this.aelPedidosExames = aelPedidosExames;
	}
	
	public enum Fields {
		UFE_EMA_EXA_SIGLA("id.ufeEmaExaSigla"),
				UFE_EMA_MAN_SEQ("id.ufeEmaManSeq"),
				UFE_UNF_SEQ("id.ufeUnfSeq");

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
		if (!(obj instanceof AelItemPedidoExame)) {
			return false;
		}
		AelItemPedidoExame other = (AelItemPedidoExame) obj;
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
