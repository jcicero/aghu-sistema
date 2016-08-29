package br.gov.mec.aghu.model;

// Generated 17/10/2011 14:21:24 by Hibernate Tools 3.4.0.CR1

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
 * EpeItemCuidadoSumarios generated by hbm2java
 */
@Entity
@Table(name = "EPE_ITEM_CUIDADO_SUMARIOS", schema = "AGH")
public class EpeItemCuidadoSumario extends BaseEntityId<EpeItemCuidadoSumarioId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4934281690774071559L;
	private EpeItemCuidadoSumarioId id;
	private Integer version;
	private EpeItemPrescricaoSumario itemPrescricaoSumario;
	private EpeCuidados cuidado;
	private MpmTipoFrequenciaAprazamento tipoFrequenciaAprazamento;
	private String descricao;
	private Integer frequencia;

	public EpeItemCuidadoSumario() {
	}

	public EpeItemCuidadoSumario(EpeItemCuidadoSumarioId id,
			EpeItemPrescricaoSumario itemPrescricaoSumario, EpeCuidados cuidado,
			MpmTipoFrequenciaAprazamento tipoFrequenciaAprazamento) {
		this.id = id;
		this.itemPrescricaoSumario = itemPrescricaoSumario;
		this.cuidado = cuidado;
		this.tipoFrequenciaAprazamento = tipoFrequenciaAprazamento;
	}

	public EpeItemCuidadoSumario(EpeItemCuidadoSumarioId id,
			EpeItemPrescricaoSumario itemPrescricaoSumario, EpeCuidados cuidado,
			MpmTipoFrequenciaAprazamento tipoFrequenciaAprazamento, String descricao, Integer frequencia) {
		this.id = id;
		this.itemPrescricaoSumario = itemPrescricaoSumario;
		this.cuidado = cuidado;
		this.tipoFrequenciaAprazamento = tipoFrequenciaAprazamento;
		this.descricao = descricao;
		this.frequencia = frequencia;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "isuSeq", column = @Column(name = "ISU_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 5, scale = 0)) })
	public EpeItemCuidadoSumarioId getId() {
		return this.id;
	}

	public void setId(EpeItemCuidadoSumarioId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false, precision = 9, scale = 0)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ISU_SEQ", nullable=false, insertable = false, updatable = false)
	public EpeItemPrescricaoSumario getItemPrescricaoSumario() {
		return this.itemPrescricaoSumario;
	}

	public void setItemPrescricaoSumario(
			EpeItemPrescricaoSumario itemPrescricaoSumario) {
		this.itemPrescricaoSumario = itemPrescricaoSumario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CUI_SEQ", nullable=false)
	public EpeCuidados getCuidado() {
		return cuidado;
	}

	public void setCuidado(
			EpeCuidados cuidado) {
		this.cuidado = cuidado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TFQ_SEQ", nullable=false)
	public MpmTipoFrequenciaAprazamento getTipoFrequenciaAprazamento() {
		return this.tipoFrequenciaAprazamento;
	}

	public void setTipoFrequenciaAprazamento(MpmTipoFrequenciaAprazamento tipoFrequenciaAprazamento) {
		this.tipoFrequenciaAprazamento = tipoFrequenciaAprazamento;
	}

	@Column(name = "DESCRICAO", length = 240)
	@Length(max = 240)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "FREQUENCIA", precision = 5, scale = 0)
	public Integer getFrequencia() {
		return this.frequencia;
	}

	public void setFrequencia(Integer frequencia) {
		this.frequencia = frequencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		EpeItemCuidadoSumario other = (EpeItemCuidadoSumario) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	

	
	public enum Fields {

		ID("id"),
		ITEM_PRESCRICAO_SUMARIO("itemPrescricaoSumario"),
		CUIDADO("cuidado"),
		TIPO_FREQUENCIA_APRAZAMENTO("tipoFrequenciaAprazamento"),
		DESCRICAO("descricao"),
		FREQUENCIA("frequencia");

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