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
 * AelPolSumExameMasc generated by hbm2java
 */
@Entity
@Table(name = "AEL_POL_SUM_EXAMES_MASC", schema = "AGH")
public class AelPolSumExameMasc extends BaseEntityId<AelPolSumExameMascId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2031333020497278293L;
	private AelPolSumExameMascId id;

	public AelPolSumExameMasc() {
	}

	public AelPolSumExameMasc(AelPolSumExameMascId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "prontuario", column = @Column(name = "PRONTUARIO")),
			@AttributeOverride(name = "ltoLtoId", column = @Column(name = "LTO_LTO_ID", length = 5)),
			@AttributeOverride(name = "recemNascido", column = @Column(name = "RECEM_NASCIDO", length = 1)),
			@AttributeOverride(name = "ufeEmaExaSigla", column = @Column(name = "UFE_EMA_EXA_SIGLA", nullable = false, length = 5)),
			@AttributeOverride(name = "ufeEmaManSeq", column = @Column(name = "UFE_EMA_MAN_SEQ", nullable = false)),
			@AttributeOverride(name = "ufeUnfSeq", column = @Column(name = "UFE_UNF_SEQ", nullable = false)),
			@AttributeOverride(name = "pertenceSumario", column = @Column(name = "PERTENCE_SUMARIO", nullable = false, length = 1)),
			@AttributeOverride(name = "iseSoeSeqDept", column = @Column(name = "ISE_SOE_SEQ_DEPT")),
			@AttributeOverride(name = "iseSeqpDept", column = @Column(name = "ISE_SEQP_DEPT")),
			@AttributeOverride(name = "iseSoeSeq", column = @Column(name = "ISE_SOE_SEQ", nullable = false)),
			@AttributeOverride(name = "iseSeqp", column = @Column(name = "ISE_SEQP", nullable = false)),
			@AttributeOverride(name = "descricao", column = @Column(name = "DESCRICAO")),
			@AttributeOverride(name = "dthrEventoLib", column = @Column(name = "DTHR_EVENTO_LIB", nullable = false, length = 29)),
			@AttributeOverride(name = "ordemRelatorio", column = @Column(name = "ORDEM_RELATORIO", nullable = false)),
			@AttributeOverride(name = "ordemAgrupamento", column = @Column(name = "ORDEM_AGRUPAMENTO", nullable = false)),
			@AttributeOverride(name = "pacCodigo", column = @Column(name = "PAC_CODIGO")),
			@AttributeOverride(name = "serVinCodigoConsultado", column = @Column(name = "SER_VIN_CODIGO_CONSULTADO")),
			@AttributeOverride(name = "serMatriculaConsultado", column = @Column(name = "SER_MATRICULA_CONSULTADO")),
			@AttributeOverride(name = "dthrFim", column = @Column(name = "DTHR_FIM", length = 29)),
			@AttributeOverride(name = "nroSessao", column = @Column(name = "NRO_SESSAO", nullable = false)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public AelPolSumExameMascId getId() {
		return this.id;
	}

	public void setId(AelPolSumExameMascId id) {
		this.id = id;
	}

	public enum Fields {

		ID("id"),
		PRONTUARIO("id.prontuario"),
		LTO_LTO_ID("id.ltoLtoId"),
		RECEM_NASCIDO("id.recemNascido"),
		UFE_EMA_EXA_SIGLA("id.ufeEmaExaSigla"),
		UFE_EMA_MAN_SEQ("id.ufeEmaManSeq"),
		UFE_UNF_SEQ("id.ufeUnfSeq"),
		PERTENCE_SUMARIO("id.pertenceSumario"),
		ISE_SOE_SEQ_DEPT("id.iseSoeSeqDept"),
		ISE_SEQP_DEPT("id.iseSeqpDept"),
		ISE_SOE_SEQ("id.iseSoeSeq"),
		ISE_SEQP("id.iseSeqp"),
		DESCRICAO("id.descricao"),
		DTHR_EVENTO_LIB("id.dthrEventoLib"),
		ORDEM_RELATORIO("id.ordemRelatorio"),
		ORDEM_AGRUPAMENTO("id.ordemAgrupamento"),
		DTHR_FIM("id.dthrFim");

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
