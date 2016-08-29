package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MptItemCuidadoSumario generated by hbm2java
 */
@Entity
@Table(name = "MPT_ITEM_CUIDADO_SUMARIOS", schema = "AGH")
public class MptItemCuidadoSumario extends BaseEntityId<MptItemCuidadoSumarioId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -76072362434569135L;
	private MptItemCuidadoSumarioId id;
	private Integer version;
	private MptItemPrescricaoSumario mptItemPrescricaoSumario;
	private MpmTipoFrequenciaAprazamento mpmTipoFrequenciaAprazamento;
	private MpmCuidadoUsual mpmCuidadoUsual;
	private Integer frequencia;
	private String descricao;

	public MptItemCuidadoSumario() {
	}

	public MptItemCuidadoSumario(MptItemCuidadoSumarioId id, MptItemPrescricaoSumario mptItemPrescricaoSumario,
			MpmTipoFrequenciaAprazamento mpmTipoFrequenciaAprazamento, MpmCuidadoUsual mpmCuidadoUsual) {
		this.id = id;
		this.mptItemPrescricaoSumario = mptItemPrescricaoSumario;
		this.mpmTipoFrequenciaAprazamento = mpmTipoFrequenciaAprazamento;
		this.mpmCuidadoUsual = mpmCuidadoUsual;
	}

	public MptItemCuidadoSumario(MptItemCuidadoSumarioId id, MptItemPrescricaoSumario mptItemPrescricaoSumario,
			MpmTipoFrequenciaAprazamento mpmTipoFrequenciaAprazamento, MpmCuidadoUsual mpmCuidadoUsual, Integer frequencia, String descricao) {
		this.id = id;
		this.mptItemPrescricaoSumario = mptItemPrescricaoSumario;
		this.mpmTipoFrequenciaAprazamento = mpmTipoFrequenciaAprazamento;
		this.mpmCuidadoUsual = mpmCuidadoUsual;
		this.frequencia = frequencia;
		this.descricao = descricao;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "itqSeq", column = @Column(name = "ITQ_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public MptItemCuidadoSumarioId getId() {
		return this.id;
	}

	public void setId(MptItemCuidadoSumarioId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITQ_SEQ", insertable = false, updatable = false)	
	public MptItemPrescricaoSumario getMptItemPrescricaoSumario() {
		return this.mptItemPrescricaoSumario;
	}

	public void setMptItemPrescricaoSumario(MptItemPrescricaoSumario mptItemPrescricaoSumario) {
		this.mptItemPrescricaoSumario = mptItemPrescricaoSumario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TFQ_SEQ", nullable = false)
	public MpmTipoFrequenciaAprazamento getMpmTipoFrequenciaAprazamento() {
		return this.mpmTipoFrequenciaAprazamento;
	}

	public void setMpmTipoFrequenciaAprazamento(MpmTipoFrequenciaAprazamento mpmTipoFrequenciaAprazamento) {
		this.mpmTipoFrequenciaAprazamento = mpmTipoFrequenciaAprazamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CDU_SEQ", nullable = false)
	public MpmCuidadoUsual getMpmCuidadoUsual() {
		return this.mpmCuidadoUsual;
	}

	public void setMpmCuidadoUsual(MpmCuidadoUsual mpmCuidadoUsual) {
		this.mpmCuidadoUsual = mpmCuidadoUsual;
	}

	@Column(name = "FREQUENCIA")
	public Integer getFrequencia() {
		return this.frequencia;
	}

	public void setFrequencia(Integer frequencia) {
		this.frequencia = frequencia;
	}

	@Column(name = "DESCRICAO", length = 150)
	@Length(max = 150)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		MPT_ITEM_PRESCRICAO_SUMARIOS("mptItemPrescricaoSumario"),
		MPM_TIPO_FREQUENCIA_APRAZAMENTO("mpmTipoFrequenciaAprazamento"),
		MPM_CUIDADO_USUAL("mpmCuidadoUsual"),
		FREQUENCIA("frequencia"),
		DESCRICAO("descricao");

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
		if (!(obj instanceof MptItemCuidadoSumario)) {
			return false;
		}
		MptItemCuidadoSumario other = (MptItemCuidadoSumario) obj;
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