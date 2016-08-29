package br.gov.mec.aghu.model;

// Generated 21/01/2010 09:37:27 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.exception.BaseRuntimeException;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AinExtratoLeitos generated by hbm2java
 */
@Entity
@SequenceGenerator(name="ainExlSq1", sequenceName="AGH.AIN_EXL_SQ1", allocationSize = 1)
@Table(name = "AIN_EXTRATO_LEITOS", schema = "AGH")
public class AinExtratoLeitos extends BaseEntitySeq<Integer> implements java.io.Serializable {
	private static final long serialVersionUID = -4868269965053756027L;

	private Integer seq;

	private Date criadoEm;

	private RapServidores servidor;

	private AinTiposMovimentoLeito tipoMovimentoLeito;

	private Date dthrLancamento;

	private RapServidores servidorResponsavel;

	private AinInternacao internacao;

	private String justificativa;

	private Short tempoReserva;

	private AinAtendimentosUrgencia atendimentoUrgencia;

	private AipPacientes paciente;

	private AinLeitos leito;

	private AghOrigemEventos origemEventos;
	
	private Integer version;

	public AinExtratoLeitos() {
	}

	/**
	 * @return the paciente
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAC_CODIGO")
	public AipPacientes getPaciente() {
		return this.paciente;
	}

	/**
	 * @param paciente
	 *            the paciente to set
	 */
	public void setPaciente(AipPacientes paciente) {
		this.paciente = paciente;
	}

	/**
	 * @return the leito
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LTO_LTO_ID", nullable = false)
	public AinLeitos getLeito() {
		return this.leito;
	}

	/**
	 * @param leito
	 *            the leito to set
	 */
	public void setLeito(AinLeitos leito) {
		this.leito = leito;
	}

	/**
	 * @return the origemEventos
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OEV_SEQ")
	public AghOrigemEventos getOrigemEventos() {
		return this.origemEventos;
	}

	/**
	 * @param origemEventos
	 *            the origemEventos to set
	 */
	public void setOrigemEventos(AghOrigemEventos origemEventos) {
		this.origemEventos = origemEventos;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_LANCAMENTO", nullable = false)
	public Date getDthrLancamento() {
		return this.dthrLancamento;
	}

	public void setDthrLancamento(Date dthrLancamento) {
		this.dthrLancamento = dthrLancamento;
	}

	@Column(name = "JUSTIFICATIVA", length = 240)
	@Length(max = 240)
	public String getJustificativa() {
		return this.justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	@Column(name = "TEMPO_RESERVA", precision = 3, scale = 0)
	public Short getTempoReserva() {
		return this.tempoReserva;
	}

	public void setTempoReserva(Short tempoReserva) {
		this.tempoReserva = tempoReserva;
	}

	public enum Fields {
		COD_PACIENTE("paciente.codigo"), PACIENTE("paciente"), ORIGEM_EVENTOS(
				"origemEventos"), LEITO_ID("leito.leitoID"), CRIADO_EM(
				"criadoEm"), DATA_HORA_LANCAMENTO("dthrLancamento"), JUSTIFICATIVA(
				"justificativa"), INTERNACAO("internacao"), SEQ_INTERNACAO("internacao.seq"), DTHR_LANCAMENTO(
				"dthrLancamento"), TIPO_MOVIMENTO_LEITO("tipoMovimentoLeito"), TIPO_MOVIMENTO_LEITO_CODIGO(
				"tipoMovimentoLeito.codigo"), LEITO("leito"), SERVIDOR("servidor");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

	/**
	 * @return the servidor
	 */
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	public RapServidores getServidor() {
		return this.servidor;
	}

	/**
	 * @param servidor
	 *            the servidor to set
	 */
	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	/**
	 * @return the servidorResponsavel
	 */
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_RESP", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_RESP", referencedColumnName = "VIN_CODIGO") })
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	public RapServidores getServidorResponsavel() {
		return this.servidorResponsavel;
	}

	/**
	 * @param servidorResponsavel
	 *            the servidorResponsavel to set
	 */
	public void setServidorResponsavel(RapServidores servidorResponsavel) {
		this.servidorResponsavel = servidorResponsavel;
	}

	/**
	 * @return the internacao
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INT_SEQ")
	public AinInternacao getInternacao() {
		return this.internacao;
	}

	/**
	 * @param internacao
	 *            the internacao to set
	 */
	public void setInternacao(AinInternacao internacao) {
		this.internacao = internacao;
	}

	/**
	 * @return the tipoMovimentoLeito
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TML_CODIGO", nullable = false)
	public AinTiposMovimentoLeito getTipoMovimentoLeito() {
		return this.tipoMovimentoLeito;
	}

	/**
	 * @param tipoMovimentoLeito
	 *            the tipoMovimentoLeito to set
	 */
	public void setTipoMovimentoLeito(AinTiposMovimentoLeito tipoMovimentoLeito) {
		this.tipoMovimentoLeito = tipoMovimentoLeito;
	}

	/**
	 * @return the atendimentoUrgencia
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATU_SEQ")
	public AinAtendimentosUrgencia getAtendimentoUrgencia() {
		return this.atendimentoUrgencia;
	}

	/**
	 * @param atendimentoUrgencia
	 *            the atendimentoUrgencia to set
	 */
	public void setAtendimentoUrgencia(
			AinAtendimentosUrgencia atendimentoUrgencia) {
		this.atendimentoUrgencia = atendimentoUrgencia;
	}

	/**
	 * @return the seq
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ainExlSq1")
	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	/**
	 * @param seq
	 *            the seq to set
	 */
	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((this.seq == null) ? 0 : this.seq.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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
		AinExtratoLeitos other = (AinExtratoLeitos) obj;
		if (this.seq == null) {
			if (other.seq != null) {
				return false;
			}
		} else if (!this.seq.equals(other.seq)) {
			return false;
		}
		return true;
	}

	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validarExtratoLeito() {
		if (!((this.internacao != null && this.atendimentoUrgencia == null)
				|| (this.internacao == null && this.atendimentoUrgencia != null)
				|| (this.internacao == null && this.atendimentoUrgencia == null))) {
			throw new BaseRuntimeException();
		}
	}
	
}