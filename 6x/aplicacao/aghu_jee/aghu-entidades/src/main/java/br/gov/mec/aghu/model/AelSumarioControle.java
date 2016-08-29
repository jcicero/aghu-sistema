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
 * AelSumarioControle generated by hbm2java
 */
@Entity
@Table(name = "AEL_SUMARIO_CONTROLE", schema = "AGH")
public class AelSumarioControle extends BaseEntityId<AelSumarioControleId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5606486982383423282L;
	private AelSumarioControleId id;

	public AelSumarioControle() {
	}

	public AelSumarioControle(AelSumarioControleId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "dataImpSumario", column = @Column(name = "DATA_IMP_SUMARIO", nullable = false, length = 29)),
			@AttributeOverride(name = "tipoEmissaoSumario", column = @Column(name = "TIPO_EMISSAO_SUMARIO", nullable = false, length = 1)),
			@AttributeOverride(name = "parte", column = @Column(name = "PARTE", nullable = false)),
			@AttributeOverride(name = "secaoProntuarioIni", column = @Column(name = "SECAO_PRONTUARIO_INI", nullable = false)),
			@AttributeOverride(name = "secaoProntuarioFim", column = @Column(name = "SECAO_PRONTUARIO_FIM", nullable = false)),
			@AttributeOverride(name = "dataPeriodoIni", column = @Column(name = "DATA_PERIODO_INI", length = 29)),
			@AttributeOverride(name = "dataPeriodoFim", column = @Column(name = "DATA_PERIODO_FIM", length = 29)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public AelSumarioControleId getId() {
		return this.id;
	}

	public void setId(AelSumarioControleId id) {
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
