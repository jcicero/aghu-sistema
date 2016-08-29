package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * FcuAtividadeEspecif generated by hbm2java
 */
@Entity
@SequenceGenerator(name="fcuAesSq1", sequenceName="AGH.FCU_AES_SQ1", allocationSize = 1)
@Table(name = "FCU_ATIVIDADE_ESPECIFS", schema = "AGH")
public class FcuAtividadeEspecif extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -40118311899873257L;
	private Short seq;
	private Integer version;
	private FcuAtividade fcuAtividade;
	private AghEspecialidades aghEspecialidades;
	private RapServidores rapServidores;
	private Double duracao;
	private Date criadoEm;
	private String indSituacao;

	public FcuAtividadeEspecif() {
	}

	public FcuAtividadeEspecif(Short seq, FcuAtividade fcuAtividade, RapServidores rapServidores, Date criadoEm) {
		this.seq = seq;
		this.fcuAtividade = fcuAtividade;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
	}

	public FcuAtividadeEspecif(Short seq, FcuAtividade fcuAtividade, AghEspecialidades aghEspecialidades,
			RapServidores rapServidores, Double duracao, Date criadoEm, String indSituacao) {
		this.seq = seq;
		this.fcuAtividade = fcuAtividade;
		this.aghEspecialidades = aghEspecialidades;
		this.rapServidores = rapServidores;
		this.duracao = duracao;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "fcuAesSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATI_SEQ", nullable = false)
	public FcuAtividade getFcuAtividade() {
		return this.fcuAtividade;
	}

	public void setFcuAtividade(FcuAtividade fcuAtividade) {
		this.fcuAtividade = fcuAtividade;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ESP_SEQ")
	public AghEspecialidades getAghEspecialidades() {
		return this.aghEspecialidades;
	}

	public void setAghEspecialidades(AghEspecialidades aghEspecialidades) {
		this.aghEspecialidades = aghEspecialidades;
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

	@Column(name = "DURACAO", precision = 17, scale = 17)
	public Double getDuracao() {
		return this.duracao;
	}

	public void setDuracao(Double duracao) {
		this.duracao = duracao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		FCU_ATIVIDADES("fcuAtividade"),
		AGH_ESPECIALIDADES("aghEspecialidades"),
		RAP_SERVIDORES("rapServidores"),
		DURACAO("duracao"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao");

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
		if (!(obj instanceof FcuAtividadeEspecif)) {
			return false;
		}
		FcuAtividadeEspecif other = (FcuAtividadeEspecif) obj;
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