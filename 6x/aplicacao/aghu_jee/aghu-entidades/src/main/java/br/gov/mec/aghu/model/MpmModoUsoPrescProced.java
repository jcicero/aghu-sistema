package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;


import org.apache.commons.lang3.StringUtils;

import br.gov.mec.aghu.model.interfaces.IItemPrescricaoMedica;
import br.gov.mec.aghu.core.exception.BaseRuntimeException;
import br.gov.mec.aghu.core.exception.BusinessExceptionCode;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmModoUsoPrescProced generated by hbm2java
 */
@Entity

@Table(name = "MPM_MODO_USO_PRESC_PROCEDS", schema = "AGH")
public class MpmModoUsoPrescProced extends BaseEntityId<MpmModoUsoPrescProcedId> implements java.io.Serializable, IItemPrescricaoMedica {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7425441531169816348L;
	private MpmModoUsoPrescProcedId id;
	private MpmTipoModoUsoProcedimento tipoModUsoProcedimento;
	private MpmPrescricaoProcedimento prescricaoProcedimento;
	private Short quantidade;
	private Integer version;

	private enum MpmModoUsoPrescProcedExceptionCode implements BusinessExceptionCode {
		MPM_MUP_CK1
	}
	
	public MpmModoUsoPrescProced() {
	}

	public MpmModoUsoPrescProced(MpmModoUsoPrescProcedId id,
			MpmTipoModoUsoProcedimento tipoModUsoProcedimento,
			MpmPrescricaoProcedimento prescricaoProcedimento) {
		this.id = id;
		this.tipoModUsoProcedimento = tipoModUsoProcedimento;
		this.prescricaoProcedimento = prescricaoProcedimento;
	}

	public MpmModoUsoPrescProced(MpmModoUsoPrescProcedId id,
			MpmTipoModoUsoProcedimento tipoModUsoProcedimento,
			MpmPrescricaoProcedimento prescricaoProcedimento,
			Short quantidade) {
		this.id = id;
		this.tipoModUsoProcedimento = tipoModUsoProcedimento;
		this.prescricaoProcedimento = prescricaoProcedimento;
		this.quantidade = quantidade;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "pprAtdSeq", column = @Column(name = "PPR_ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "pprSeq", column = @Column(name = "PPR_SEQ", nullable = false, precision = 14, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 8, scale = 0)) })
	public MpmModoUsoPrescProcedId getId() {
		return this.id;
	}

	public void setId(MpmModoUsoPrescProcedId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "TUP_PED_SEQ", referencedColumnName = "PED_SEQ", nullable = false),
			@JoinColumn(name = "TUP_SEQP", referencedColumnName = "SEQP", nullable = false) })
	public MpmTipoModoUsoProcedimento getTipoModUsoProcedimento() {
		return this.tipoModUsoProcedimento;
	}

	public void setTipoModUsoProcedimento(MpmTipoModoUsoProcedimento tipoModUsoProcedimento) {
		this.tipoModUsoProcedimento = tipoModUsoProcedimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "PPR_ATD_SEQ", referencedColumnName = "ATD_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PPR_SEQ", referencedColumnName = "SEQ", nullable = false, insertable = false, updatable = false) })
	public MpmPrescricaoProcedimento getPrescricaoProcedimento() {
		return this.prescricaoProcedimento;
	}

	public void setPrescricaoProcedimento(MpmPrescricaoProcedimento prescricaoProcedimento) {
		this.prescricaoProcedimento = prescricaoProcedimento;
	}

	@Column(name = "QUANTIDADE", precision = 3, scale = 0)
	public Short getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Short quantidade) {
		this.quantidade = quantidade;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}	
	
	/**
	 * ORADB procedure forms MPMP_POPULA_PROCEDIMENTO
	 * @see br.gov.mec.aghu.model.interfaces.PrescricaoMedicaDescricao#getDescricaoFormatada()
	 */
	@Override
	@Transient
	public String getDescricaoFormatada() {
		StringBuffer descricao = new StringBuffer();
		
		if (this.tipoModUsoProcedimento != null) {
			descricao.append(this.getTipoModUsoProcedimento().getDescricao());
		}
		if (this.quantidade != null) {
			descricao.append(' ').append(this.getQuantidade());
			if (this.tipoModUsoProcedimento.getUnidadeMedidaMedica() != null && StringUtils.isNotBlank(this.getTipoModUsoProcedimento().getUnidadeMedidaMedica().getDescricao())) {
				descricao.append(' ').append(this.getTipoModUsoProcedimento().getUnidadeMedidaMedica().getDescricao());
			}
			descricao.append("; ");
		} else {
			descricao.append("; ");
		}
		
		return descricao.toString();
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
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
		MpmModoUsoPrescProced other = (MpmModoUsoPrescProced) obj;
		if (this.id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!this.id.equals(other.id)) {
			return false;
		}
		return true;
	}

	public enum Fields {
		ID("id"),
		TIPO_MOD_USO_PROCEDIMENTO("tipoModUsoProcedimento"),
		TIPO_MOD_USO_PROCEDIMENTO_PED_SEQ("tipoModUsoProcedimento.id.pedSeq"),
		TIPO_MOD_USO_PROCEDIMENTO_SEQP("tipoModUsoProcedimento.id.seqp"),
		PRESCRICAO_PROCEDIMENTO("prescricaoProcedimento"),
		QUANTIDADE("quantidade"),
		PPR_ATD_SEQ("id.pprAtdSeq"),
		PPR_SEQ("id.pprSeq"),
		SEQP("id.seqp");
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}
	
	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validarDados(){
		//quantidade is null or quantidade > 0              
		if(!(this.quantidade == null || this.quantidade > 0)){
			throw new BaseRuntimeException(MpmModoUsoPrescProcedExceptionCode.MPM_MUP_CK1);
		}
	}
	
}
