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
 * PdtDescPadrao generated by hbm2java
 */
@Entity
@Table(name = "PDT_DESC_PADROES", schema = "AGH")
public class PdtDescPadrao extends BaseEntityId<PdtDescPadraoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4499743641464774649L;
	private PdtDescPadraoId id;
	private Integer version;
	private AghEspecialidades aghEspecialidades;
	private RapServidores rapServidores;
	private PdtProcDiagTerap pdtProcDiagTerap;
	private String descTecPadrao;
	private String titulo;
	private Date criadoEm;

	public PdtDescPadrao() {
	}

	public PdtDescPadrao(PdtDescPadraoId id, AghEspecialidades aghEspecialidades, RapServidores rapServidores,
			PdtProcDiagTerap pdtProcDiagTerap, String descTecPadrao, String titulo, Date criadoEm) {
		this.id = id;
		this.aghEspecialidades = aghEspecialidades;
		this.rapServidores = rapServidores;
		this.pdtProcDiagTerap = pdtProcDiagTerap;
		this.descTecPadrao = descTecPadrao;
		this.titulo = titulo;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "espSeq", column = @Column(name = "ESP_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public PdtDescPadraoId getId() {
		return this.id;
	}

	public void setId(PdtDescPadraoId id) {
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
	@JoinColumn(name = "ESP_SEQ", nullable = false, insertable = false, updatable = false)
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DPT_SEQ", nullable = false)
	public PdtProcDiagTerap getPdtProcDiagTerap() {
		return this.pdtProcDiagTerap;
	}

	public void setPdtProcDiagTerap(PdtProcDiagTerap pdtProcDiagTerap) {
		this.pdtProcDiagTerap = pdtProcDiagTerap;
	}

	@Column(name = "DESC_TEC_PADRAO", nullable = false, length = 4000)
	@Length(max = 4000)
	public String getDescTecPadrao() {
		return this.descTecPadrao;
	}

	public void setDescTecPadrao(String descTecPadrao) {
		this.descTecPadrao = descTecPadrao;
	}

	@Column(name = "TITULO", nullable = false, length = 120)
	@Length(max = 120)
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

		ID("id"),
		ID_SEQP("id.seqp"),
		ID_ESP_SEQ("id.espSeq"),
		VERSION("version"),
		AGH_ESPECIALIDADES("aghEspecialidades"),
		RAP_SERVIDORES("rapServidores"),
		PDT_PROC_DIAG_TERAPS("pdtProcDiagTerap"),
		SEQ_AGH_ESPECIALIDADES("aghEspecialidades.seq"),
		SEQ_PDT_PROC_DIAG_TERAPS("pdtProcDiagTerap.seq"),
		DESC_TEC_PADRAO("descTecPadrao"),
		TITULO("titulo"),
		CRIADO_EM("criadoEm");

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
		if (!(obj instanceof PdtDescPadrao)) {
			return false;
		}
		PdtDescPadrao other = (PdtDescPadrao) obj;
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
