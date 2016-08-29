package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * MamUnidAtendeEspJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name = "aghMamUaeJnSeq", sequenceName = "AGH.MAM_UAE_JN_SEQ", allocationSize = 1)
@Table(name = "MAM_UNID_ATENDE_ESPS_JN", schema = "AGH")
@Immutable
public class MamUnidAtendeEspJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -6525678708421312156L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Short uanUnfSeq;
	private Short espSeq;
	private Date criadoEm;
	private DominioSituacao indSituacao;
	private Boolean indMarcaExtra;
	private String micNome;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Boolean indSoMarcaConsDia;
	private Date horaInicioMarcaCons;
	private Date horaFimMarcaCons;

	public MamUnidAtendeEspJn() {
	}

	public MamUnidAtendeEspJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Short uanUnfSeq, Short espSeq) {
		this.uanUnfSeq = uanUnfSeq;
		this.espSeq = espSeq;
	}

	public MamUnidAtendeEspJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Short uanUnfSeq, Short espSeq,
			Date criadoEm, DominioSituacao indSituacao, Boolean indMarcaExtra, String micNome, Integer serMatricula, Short serVinCodigo,
			Boolean indSoMarcaConsDia, Date horaInicioMarcaCons, Date horaFimMarcaCons) {
		this.uanUnfSeq = uanUnfSeq;
		this.espSeq = espSeq;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.indMarcaExtra = indMarcaExtra;
		this.micNome = micNome;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.indSoMarcaConsDia = indSoMarcaConsDia;
		this.horaInicioMarcaCons = horaInicioMarcaCons;
		this.horaFimMarcaCons = horaFimMarcaCons;
	}

	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aghMamUaeJnSeq")
	@NotNull
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}
	@Column(name = "UAN_UNF_SEQ", nullable = false)
	public Short getUanUnfSeq() {
		return this.uanUnfSeq;
	}

	public void setUanUnfSeq(Short uanUnfSeq) {
		this.uanUnfSeq = uanUnfSeq;
	}

	@Column(name = "ESP_SEQ", nullable = false)
	public Short getEspSeq() {
		return this.espSeq;
	}

	public void setEspSeq(Short espSeq) {
		this.espSeq = espSeq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", length = 1)	
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "IND_MARCA_EXTRA", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndMarcaExtra() {
		return this.indMarcaExtra;
	}

	public void setIndMarcaExtra(Boolean indMarcaExtra) {
		this.indMarcaExtra = indMarcaExtra;
	}

	@Column(name = "MIC_NOME", length = 50)
	@Length(max = 50)
	public String getMicNome() {
		return this.micNome;
	}

	public void setMicNome(String micNome) {
		this.micNome = micNome;
	}

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "IND_SO_MARCA_CONS_DIA", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndSoMarcaConsDia() {
		return this.indSoMarcaConsDia;
	}

	public void setIndSoMarcaConsDia(Boolean indSoMarcaConsDia) {
		this.indSoMarcaConsDia = indSoMarcaConsDia;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HORA_INICIO_MARCA_CONS", length = 29)
	public Date getHoraInicioMarcaCons() {
		return this.horaInicioMarcaCons;
	}

	public void setHoraInicioMarcaCons(Date horaInicioMarcaCons) {
		this.horaInicioMarcaCons = horaInicioMarcaCons;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HORA_FIM_MARCA_CONS", length = 29)
	public Date getHoraFimMarcaCons() {
		return this.horaFimMarcaCons;
	}

	public void setHoraFimMarcaCons(Date horaFimMarcaCons) {
		this.horaFimMarcaCons = horaFimMarcaCons;
	}

	public enum Fields {

		UAN_UNF_SEQ("uanUnfSeq"),
		ESP_SEQ("espSeq"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao"),
		IND_MARCA_EXTRA("indMarcaExtra"),
		MIC_NOME("micNome"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		IND_SO_MARCA_CONS_DIA("indSoMarcaConsDia"),
		HORA_INICIO_MARCA_CONS("horaInicioMarcaCons"),
		HORA_FIM_MARCA_CONS("horaFimMarcaCons");

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