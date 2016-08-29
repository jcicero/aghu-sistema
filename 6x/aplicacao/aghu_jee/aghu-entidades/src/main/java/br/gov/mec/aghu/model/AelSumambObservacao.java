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
 * AelSumambObservacao generated by hbm2java
 */
@Entity
@Table(name = "AEL_SUMAMB_OBSERVACAO", schema = "AGH")
public class AelSumambObservacao extends BaseEntityId<AelSumambObservacaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 126276871372153648L;
	private AelSumambObservacaoId id;

	public AelSumambObservacao() {
	}

	public AelSumambObservacao(AelSumambObservacaoId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "prontuario", column = @Column(name = "PRONTUARIO")),
			@AttributeOverride(name = "recemNascido", column = @Column(name = "RECEM_NASCIDO", length = 1)),
			@AttributeOverride(name = "pertenceSumario", column = @Column(name = "PERTENCE_SUMARIO", nullable = false, length = 1)),
			@AttributeOverride(name = "dthrEvento", column = @Column(name = "DTHR_EVENTO", nullable = false, length = 29)),
			@AttributeOverride(name = "codigoMensagem", column = @Column(name = "CODIGO_MENSAGEM", nullable = false)),
			@AttributeOverride(name = "descricao", column = @Column(name = "DESCRICAO", nullable = false)),
			@AttributeOverride(name = "pacCodigo", column = @Column(name = "PAC_CODIGO")),
			@AttributeOverride(name = "serVinCodigoConsultado", column = @Column(name = "SER_VIN_CODIGO_CONSULTADO")),
			@AttributeOverride(name = "serMatriculaConsultado", column = @Column(name = "SER_MATRICULA_CONSULTADO")),
			@AttributeOverride(name = "ltoLtoId", column = @Column(name = "LTO_LTO_ID", length = 5)),
			@AttributeOverride(name = "dthrFim", column = @Column(name = "DTHR_FIM", length = 29)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public AelSumambObservacaoId getId() {
		return this.id;
	}

	public void setId(AelSumambObservacaoId id) {
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
