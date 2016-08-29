package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelItemResulImpressao generated by hbm2java
 */
@Entity
@Table(name = "AEL_ITENS_RESUL_IMPRESSAO", schema = "AGH")
public class AelItemResulImpressao extends BaseEntityId<AelItemResulImpressaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4642729798857088994L;
	private AelItemResulImpressaoId id;
	private AelItemSolicitacaoExames aelItemSolicitacaoExames;

	public AelItemResulImpressao() {
	}

	public AelItemResulImpressao(AelItemResulImpressaoId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "seq", column = @Column(name = "SEQ", nullable = false)),
			@AttributeOverride(name = "iseSoeSeq", column = @Column(name = "ISE_SOE_SEQ", nullable = false)),
			@AttributeOverride(name = "iseSeqp", column = @Column(name = "ISE_SEQP", nullable = false)),
			@AttributeOverride(name = "nroVias", column = @Column(name = "NRO_VIAS")),
			@AttributeOverride(name = "ordemImpressao", column = @Column(name = "ORDEM_IMPRESSAO", nullable = false)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public AelItemResulImpressaoId getId() {
		return this.id;
	}

	public void setId(AelItemResulImpressaoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "ISE_SOE_SEQ", referencedColumnName = "SOE_SEQ", updatable = false, insertable = false),
			@JoinColumn(name = "ISE_SEQP", referencedColumnName = "SEQP", updatable = false, insertable = false)})
	public AelItemSolicitacaoExames getAelItemSolicitacaoExames() {
		return aelItemSolicitacaoExames;
	}

	public void setAelItemSolicitacaoExames(
			AelItemSolicitacaoExames aelItemSolicitacaoExames) {
		this.aelItemSolicitacaoExames = aelItemSolicitacaoExames;
	}
	
	public enum Fields {

		ID("id"),
		ISE_SOE_SEQ("id.iseSoeSeq"),
		ISE_SEQP("id.iseSeqp"),
		ITEM_SOLICITACAO_EXAMES("aelItemSolicitacaoExames");

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
