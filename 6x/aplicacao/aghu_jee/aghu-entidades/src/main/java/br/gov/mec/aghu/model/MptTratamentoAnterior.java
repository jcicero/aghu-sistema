package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MptTratamentoAnterior generated by hbm2java
 */
@Entity
@Table(name = "MPT_TRATAMENTO_ANTERIORES", schema = "AGH")
public class MptTratamentoAnterior extends BaseEntityId<MptTratamentoAnteriorId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5098426859780404688L;
	private MptTratamentoAnteriorId id;
	private Integer version;
	private RapServidores rapServidores;
	private MptTipoTratAnterior mptTipoTratAnterior;
	private MpaVersaoProtAssistencial mpaVersaoProtAssistencial;
	private MptLaudoTratAnterior mptLaudoTratAnterior;
	private String outroTratamento;
	private Date alteradoEm;
	private Date data;

	public MptTratamentoAnterior() {
	}

	public MptTratamentoAnterior(MptTratamentoAnteriorId id, RapServidores rapServidores,
			MptLaudoTratAnterior mptLaudoTratAnterior, Date alteradoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.mptLaudoTratAnterior = mptLaudoTratAnterior;
		this.alteradoEm = alteradoEm;
	}

	public MptTratamentoAnterior(MptTratamentoAnteriorId id, RapServidores rapServidores,
			MptTipoTratAnterior mptTipoTratAnterior, MpaVersaoProtAssistencial mpaVersaoProtAssistencial,
			MptLaudoTratAnterior mptLaudoTratAnterior, String outroTratamento, Date alteradoEm, Date data) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.mptTipoTratAnterior = mptTipoTratAnterior;
		this.mpaVersaoProtAssistencial = mpaVersaoProtAssistencial;
		this.mptLaudoTratAnterior = mptLaudoTratAnterior;
		this.outroTratamento = outroTratamento;
		this.alteradoEm = alteradoEm;
		this.data = data;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "ltaLauTrpSeq", column = @Column(name = "LTA_LAU_TRP_SEQ", nullable = false)),
			@AttributeOverride(name = "ltaLauSeqp", column = @Column(name = "LTA_LAU_SEQP", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public MptTratamentoAnteriorId getId() {
		return this.id;
	}

	public void setId(MptTratamentoAnteriorId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TTA_SEQ")
	public MptTipoTratAnterior getMptTipoTratAnterior() {
		return this.mptTipoTratAnterior;
	}

	public void setMptTipoTratAnterior(MptTipoTratAnterior mptTipoTratAnterior) {
		this.mptTipoTratAnterior = mptTipoTratAnterior;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "VPA_PTA_SEQ", referencedColumnName = "PTA_SEQ"),
			@JoinColumn(name = "VPA_SEQP", referencedColumnName = "SEQP") })
	public MpaVersaoProtAssistencial getMpaVersaoProtAssistencial() {
		return this.mpaVersaoProtAssistencial;
	}

	public void setMpaVersaoProtAssistencial(MpaVersaoProtAssistencial mpaVersaoProtAssistencial) {
		this.mpaVersaoProtAssistencial = mpaVersaoProtAssistencial;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "LTA_LAU_TRP_SEQ", referencedColumnName = "LAU_TRP_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "LTA_LAU_SEQP", referencedColumnName = "LAU_SEQP", nullable = false, insertable = false, updatable = false) })
	public MptLaudoTratAnterior getMptLaudoTratAnterior() {
		return this.mptLaudoTratAnterior;
	}

	public void setMptLaudoTratAnterior(MptLaudoTratAnterior mptLaudoTratAnterior) {
		this.mptLaudoTratAnterior = mptLaudoTratAnterior;
	}

	@Column(name = "OUTRO_TRATAMENTO", length = 120)
	@Length(max = 120)
	public String getOutroTratamento() {
		return this.outroTratamento;
	}

	public void setOutroTratamento(String outroTratamento) {
		this.outroTratamento = outroTratamento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", nullable = false, length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA", length = 29)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		MPT_TIPO_TRAT_ANTERIORES("mptTipoTratAnterior"),
		MPA_VERSAO_PROT_ASSISTENCIAIS("mpaVersaoProtAssistencial"),
		MPT_LAUDO_TRAT_ANTERIORES("mptLaudoTratAnterior"),
		OUTRO_TRATAMENTO("outroTratamento"),
		ALTERADO_EM("alteradoEm"),
		DATA("data");

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
		if (!(obj instanceof MptTratamentoAnterior)) {
			return false;
		}
		MptTratamentoAnterior other = (MptTratamentoAnterior) obj;
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
