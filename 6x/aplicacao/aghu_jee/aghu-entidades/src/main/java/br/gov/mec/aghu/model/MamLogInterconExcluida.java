package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamLogInterconExcluida generated by hbm2java
 */
@Entity
@Table(name = "MAM_LOG_INTERCON_EXCLUIDAS", schema = "AGH")
public class MamLogInterconExcluida extends BaseEntitySeq<Long> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5715560014103284677L;
	private Long seq;
	private Integer version;
	private Date dthrCriacao;
	private Date dthrValida;
	private Date dthrMvto;
	private Date dthrValidaMvto;
	private String observacao;
	private String indPendente;
	private Integer pacCodigo;
	private Integer conNumero;
	private Short espSeq;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Integer serMatriculaValida;
	private Short serVinCodigoValida;
	private Integer serMatriculaMvto;
	private Short serVinCodigoMvto;
	private Integer serMatriculaValidaMvto;
	private Short serVinCodigoValidaMvto;
	private Long ieoSeq;
	private Short eqpSeq;
	private Integer serMatriculaResponsavel;
	private Short serVinCodigoResponsavel;
	private String indImpresso;
	private String situacao;
	private Integer conNumeroMarcada;
	private String indDigitado;
	private Short espSeqAgenda;
	private String observacaoAdicional;
	private Short espSeqAdm;
	private Date dthrMarcada;
	private Date dthrAvisada;
	private Integer serMatriculaMarcada;
	private Short serVinCodigoMarcada;
	private Integer serMatriculaAvisada;
	private Short serVinCodigoAvisada;
	private Date dthrExcluida;
	private Integer serMatriculaExcluida;
	private Short serVinCodigoExcluida;
	private String indUrgente;

	public MamLogInterconExcluida() {
	}

	public MamLogInterconExcluida(Long seq, Date dthrCriacao, String indPendente, Integer pacCodigo, Integer serMatricula,
			Short serVinCodigo, String indImpresso, String situacao, String indDigitado, Date dthrExcluida, Integer serMatriculaExcluida,
			Short serVinCodigoExcluida) {
		this.seq = seq;
		this.dthrCriacao = dthrCriacao;
		this.indPendente = indPendente;
		this.pacCodigo = pacCodigo;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.indImpresso = indImpresso;
		this.situacao = situacao;
		this.indDigitado = indDigitado;
		this.dthrExcluida = dthrExcluida;
		this.serMatriculaExcluida = serMatriculaExcluida;
		this.serVinCodigoExcluida = serVinCodigoExcluida;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public MamLogInterconExcluida(Long seq, Date dthrCriacao, Date dthrValida, Date dthrMvto, Date dthrValidaMvto, String observacao,
			String indPendente, Integer pacCodigo, Integer conNumero, Short espSeq, Integer serMatricula, Short serVinCodigo,
			Integer serMatriculaValida, Short serVinCodigoValida, Integer serMatriculaMvto, Short serVinCodigoMvto,
			Integer serMatriculaValidaMvto, Short serVinCodigoValidaMvto, Long ieoSeq, Short eqpSeq, Integer serMatriculaResponsavel,
			Short serVinCodigoResponsavel, String indImpresso, String situacao, Integer conNumeroMarcada, String indDigitado,
			Short espSeqAgenda, String observacaoAdicional, Short espSeqAdm, Date dthrMarcada, Date dthrAvisada,
			Integer serMatriculaMarcada, Short serVinCodigoMarcada, Integer serMatriculaAvisada, Short serVinCodigoAvisada,
			Date dthrExcluida, Integer serMatriculaExcluida, Short serVinCodigoExcluida, String indUrgente) {
		this.seq = seq;
		this.dthrCriacao = dthrCriacao;
		this.dthrValida = dthrValida;
		this.dthrMvto = dthrMvto;
		this.dthrValidaMvto = dthrValidaMvto;
		this.observacao = observacao;
		this.indPendente = indPendente;
		this.pacCodigo = pacCodigo;
		this.conNumero = conNumero;
		this.espSeq = espSeq;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.serMatriculaValida = serMatriculaValida;
		this.serVinCodigoValida = serVinCodigoValida;
		this.serMatriculaMvto = serMatriculaMvto;
		this.serVinCodigoMvto = serVinCodigoMvto;
		this.serMatriculaValidaMvto = serMatriculaValidaMvto;
		this.serVinCodigoValidaMvto = serVinCodigoValidaMvto;
		this.ieoSeq = ieoSeq;
		this.eqpSeq = eqpSeq;
		this.serMatriculaResponsavel = serMatriculaResponsavel;
		this.serVinCodigoResponsavel = serVinCodigoResponsavel;
		this.indImpresso = indImpresso;
		this.situacao = situacao;
		this.conNumeroMarcada = conNumeroMarcada;
		this.indDigitado = indDigitado;
		this.espSeqAgenda = espSeqAgenda;
		this.observacaoAdicional = observacaoAdicional;
		this.espSeqAdm = espSeqAdm;
		this.dthrMarcada = dthrMarcada;
		this.dthrAvisada = dthrAvisada;
		this.serMatriculaMarcada = serMatriculaMarcada;
		this.serVinCodigoMarcada = serVinCodigoMarcada;
		this.serMatriculaAvisada = serMatriculaAvisada;
		this.serVinCodigoAvisada = serVinCodigoAvisada;
		this.dthrExcluida = dthrExcluida;
		this.serMatriculaExcluida = serMatriculaExcluida;
		this.serVinCodigoExcluida = serVinCodigoExcluida;
		this.indUrgente = indUrgente;
	}

	@Id
	@Column(name = "SEQ", unique = true, nullable = false)
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_CRIACAO", nullable = false, length = 29)
	public Date getDthrCriacao() {
		return this.dthrCriacao;
	}

	public void setDthrCriacao(Date dthrCriacao) {
		this.dthrCriacao = dthrCriacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_VALIDA", length = 29)
	public Date getDthrValida() {
		return this.dthrValida;
	}

	public void setDthrValida(Date dthrValida) {
		this.dthrValida = dthrValida;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_MVTO", length = 29)
	public Date getDthrMvto() {
		return this.dthrMvto;
	}

	public void setDthrMvto(Date dthrMvto) {
		this.dthrMvto = dthrMvto;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_VALIDA_MVTO", length = 29)
	public Date getDthrValidaMvto() {
		return this.dthrValidaMvto;
	}

	public void setDthrValidaMvto(Date dthrValidaMvto) {
		this.dthrValidaMvto = dthrValidaMvto;
	}

	@Column(name = "OBSERVACAO", length = 1000)
	@Length(max = 1000)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "IND_PENDENTE", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndPendente() {
		return this.indPendente;
	}

	public void setIndPendente(String indPendente) {
		this.indPendente = indPendente;
	}

	@Column(name = "PAC_CODIGO", nullable = false)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "CON_NUMERO")
	public Integer getConNumero() {
		return this.conNumero;
	}

	public void setConNumero(Integer conNumero) {
		this.conNumero = conNumero;
	}

	@Column(name = "ESP_SEQ")
	public Short getEspSeq() {
		return this.espSeq;
	}

	public void setEspSeq(Short espSeq) {
		this.espSeq = espSeq;
	}

	@Column(name = "SER_MATRICULA", nullable = false)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "SER_MATRICULA_VALIDA")
	public Integer getSerMatriculaValida() {
		return this.serMatriculaValida;
	}

	public void setSerMatriculaValida(Integer serMatriculaValida) {
		this.serMatriculaValida = serMatriculaValida;
	}

	@Column(name = "SER_VIN_CODIGO_VALIDA")
	public Short getSerVinCodigoValida() {
		return this.serVinCodigoValida;
	}

	public void setSerVinCodigoValida(Short serVinCodigoValida) {
		this.serVinCodigoValida = serVinCodigoValida;
	}

	@Column(name = "SER_MATRICULA_MVTO")
	public Integer getSerMatriculaMvto() {
		return this.serMatriculaMvto;
	}

	public void setSerMatriculaMvto(Integer serMatriculaMvto) {
		this.serMatriculaMvto = serMatriculaMvto;
	}

	@Column(name = "SER_VIN_CODIGO_MVTO")
	public Short getSerVinCodigoMvto() {
		return this.serVinCodigoMvto;
	}

	public void setSerVinCodigoMvto(Short serVinCodigoMvto) {
		this.serVinCodigoMvto = serVinCodigoMvto;
	}

	@Column(name = "SER_MATRICULA_VALIDA_MVTO")
	public Integer getSerMatriculaValidaMvto() {
		return this.serMatriculaValidaMvto;
	}

	public void setSerMatriculaValidaMvto(Integer serMatriculaValidaMvto) {
		this.serMatriculaValidaMvto = serMatriculaValidaMvto;
	}

	@Column(name = "SER_VIN_CODIGO_VALIDA_MVTO")
	public Short getSerVinCodigoValidaMvto() {
		return this.serVinCodigoValidaMvto;
	}

	public void setSerVinCodigoValidaMvto(Short serVinCodigoValidaMvto) {
		this.serVinCodigoValidaMvto = serVinCodigoValidaMvto;
	}

	@Column(name = "IEO_SEQ")
	public Long getIeoSeq() {
		return this.ieoSeq;
	}

	public void setIeoSeq(Long ieoSeq) {
		this.ieoSeq = ieoSeq;
	}

	@Column(name = "EQP_SEQ")
	public Short getEqpSeq() {
		return this.eqpSeq;
	}

	public void setEqpSeq(Short eqpSeq) {
		this.eqpSeq = eqpSeq;
	}

	@Column(name = "SER_MATRICULA_RESPONSAVEL")
	public Integer getSerMatriculaResponsavel() {
		return this.serMatriculaResponsavel;
	}

	public void setSerMatriculaResponsavel(Integer serMatriculaResponsavel) {
		this.serMatriculaResponsavel = serMatriculaResponsavel;
	}

	@Column(name = "SER_VIN_CODIGO_RESPONSAVEL")
	public Short getSerVinCodigoResponsavel() {
		return this.serVinCodigoResponsavel;
	}

	public void setSerVinCodigoResponsavel(Short serVinCodigoResponsavel) {
		this.serVinCodigoResponsavel = serVinCodigoResponsavel;
	}

	@Column(name = "IND_IMPRESSO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndImpresso() {
		return this.indImpresso;
	}

	public void setIndImpresso(String indImpresso) {
		this.indImpresso = indImpresso;
	}

	@Column(name = "SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getSituacao() {
		return this.situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Column(name = "CON_NUMERO_MARCADA")
	public Integer getConNumeroMarcada() {
		return this.conNumeroMarcada;
	}

	public void setConNumeroMarcada(Integer conNumeroMarcada) {
		this.conNumeroMarcada = conNumeroMarcada;
	}

	@Column(name = "IND_DIGITADO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndDigitado() {
		return this.indDigitado;
	}

	public void setIndDigitado(String indDigitado) {
		this.indDigitado = indDigitado;
	}

	@Column(name = "ESP_SEQ_AGENDA")
	public Short getEspSeqAgenda() {
		return this.espSeqAgenda;
	}

	public void setEspSeqAgenda(Short espSeqAgenda) {
		this.espSeqAgenda = espSeqAgenda;
	}

	@Column(name = "OBSERVACAO_ADICIONAL", length = 2000)
	@Length(max = 2000)
	public String getObservacaoAdicional() {
		return this.observacaoAdicional;
	}

	public void setObservacaoAdicional(String observacaoAdicional) {
		this.observacaoAdicional = observacaoAdicional;
	}

	@Column(name = "ESP_SEQ_ADM")
	public Short getEspSeqAdm() {
		return this.espSeqAdm;
	}

	public void setEspSeqAdm(Short espSeqAdm) {
		this.espSeqAdm = espSeqAdm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_MARCADA", length = 29)
	public Date getDthrMarcada() {
		return this.dthrMarcada;
	}

	public void setDthrMarcada(Date dthrMarcada) {
		this.dthrMarcada = dthrMarcada;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_AVISADA", length = 29)
	public Date getDthrAvisada() {
		return this.dthrAvisada;
	}

	public void setDthrAvisada(Date dthrAvisada) {
		this.dthrAvisada = dthrAvisada;
	}

	@Column(name = "SER_MATRICULA_MARCADA")
	public Integer getSerMatriculaMarcada() {
		return this.serMatriculaMarcada;
	}

	public void setSerMatriculaMarcada(Integer serMatriculaMarcada) {
		this.serMatriculaMarcada = serMatriculaMarcada;
	}

	@Column(name = "SER_VIN_CODIGO_MARCADA")
	public Short getSerVinCodigoMarcada() {
		return this.serVinCodigoMarcada;
	}

	public void setSerVinCodigoMarcada(Short serVinCodigoMarcada) {
		this.serVinCodigoMarcada = serVinCodigoMarcada;
	}

	@Column(name = "SER_MATRICULA_AVISADA")
	public Integer getSerMatriculaAvisada() {
		return this.serMatriculaAvisada;
	}

	public void setSerMatriculaAvisada(Integer serMatriculaAvisada) {
		this.serMatriculaAvisada = serMatriculaAvisada;
	}

	@Column(name = "SER_VIN_CODIGO_AVISADA")
	public Short getSerVinCodigoAvisada() {
		return this.serVinCodigoAvisada;
	}

	public void setSerVinCodigoAvisada(Short serVinCodigoAvisada) {
		this.serVinCodigoAvisada = serVinCodigoAvisada;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_EXCLUIDA", nullable = false, length = 29)
	public Date getDthrExcluida() {
		return this.dthrExcluida;
	}

	public void setDthrExcluida(Date dthrExcluida) {
		this.dthrExcluida = dthrExcluida;
	}

	@Column(name = "SER_MATRICULA_EXCLUIDA", nullable = false)
	public Integer getSerMatriculaExcluida() {
		return this.serMatriculaExcluida;
	}

	public void setSerMatriculaExcluida(Integer serMatriculaExcluida) {
		this.serMatriculaExcluida = serMatriculaExcluida;
	}

	@Column(name = "SER_VIN_CODIGO_EXCLUIDA", nullable = false)
	public Short getSerVinCodigoExcluida() {
		return this.serVinCodigoExcluida;
	}

	public void setSerVinCodigoExcluida(Short serVinCodigoExcluida) {
		this.serVinCodigoExcluida = serVinCodigoExcluida;
	}

	@Column(name = "IND_URGENTE", length = 1)
	@Length(max = 1)
	public String getIndUrgente() {
		return this.indUrgente;
	}

	public void setIndUrgente(String indUrgente) {
		this.indUrgente = indUrgente;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		DTHR_CRIACAO("dthrCriacao"),
		DTHR_VALIDA("dthrValida"),
		DTHR_MVTO("dthrMvto"),
		DTHR_VALIDA_MVTO("dthrValidaMvto"),
		OBSERVACAO("observacao"),
		IND_PENDENTE("indPendente"),
		PAC_CODIGO("pacCodigo"),
		CON_NUMERO("conNumero"),
		ESP_SEQ("espSeq"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		SER_MATRICULA_VALIDA("serMatriculaValida"),
		SER_VIN_CODIGO_VALIDA("serVinCodigoValida"),
		SER_MATRICULA_MVTO("serMatriculaMvto"),
		SER_VIN_CODIGO_MVTO("serVinCodigoMvto"),
		SER_MATRICULA_VALIDA_MVTO("serMatriculaValidaMvto"),
		SER_VIN_CODIGO_VALIDA_MVTO("serVinCodigoValidaMvto"),
		IEO_SEQ("ieoSeq"),
		EQP_SEQ("eqpSeq"),
		SER_MATRICULA_RESPONSAVEL("serMatriculaResponsavel"),
		SER_VIN_CODIGO_RESPONSAVEL("serVinCodigoResponsavel"),
		IND_IMPRESSO("indImpresso"),
		SITUACAO("situacao"),
		CON_NUMERO_MARCADA("conNumeroMarcada"),
		IND_DIGITADO("indDigitado"),
		ESP_SEQ_AGENDA("espSeqAgenda"),
		OBSERVACAO_ADICIONAL("observacaoAdicional"),
		ESP_SEQ_ADM("espSeqAdm"),
		DTHR_MARCADA("dthrMarcada"),
		DTHR_AVISADA("dthrAvisada"),
		SER_MATRICULA_MARCADA("serMatriculaMarcada"),
		SER_VIN_CODIGO_MARCADA("serVinCodigoMarcada"),
		SER_MATRICULA_AVISADA("serMatriculaAvisada"),
		SER_VIN_CODIGO_AVISADA("serVinCodigoAvisada"),
		DTHR_EXCLUIDA("dthrExcluida"),
		SER_MATRICULA_EXCLUIDA("serMatriculaExcluida"),
		SER_VIN_CODIGO_EXCLUIDA("serVinCodigoExcluida"),
		IND_URGENTE("indUrgente");

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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof MamLogInterconExcluida)) {
			return false;
		}
		MamLogInterconExcluida other = (MamLogInterconExcluida) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
