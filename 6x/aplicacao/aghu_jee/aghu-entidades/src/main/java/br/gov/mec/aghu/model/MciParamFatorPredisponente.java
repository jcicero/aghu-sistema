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


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MciParamFatorPredisponente generated by hbm2java
 */
@Entity
@Table(name = "MCI_PARAM_FATOR_PREDISPONENTES", schema = "AGH")
public class MciParamFatorPredisponente extends BaseEntityId<MciParamFatorPredisponenteId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2635013592754333749L;
	private MciParamFatorPredisponenteId id;
	private Integer version;
	private MciFatorPredisponentes mciFatorPredisponentes;
	private RapServidores rapServidores;
	private MciParamReportUsuario mciParamReportUsuario;
	private Date criadoEm;

	public MciParamFatorPredisponente() {
	}

	public MciParamFatorPredisponente(MciParamFatorPredisponenteId id, MciFatorPredisponentes mciFatorPredisponentes,
			RapServidores rapServidores, MciParamReportUsuario mciParamReportUsuario, Date criadoEm) {
		this.id = id;
		this.mciFatorPredisponentes = mciFatorPredisponentes;
		this.rapServidores = rapServidores;
		this.mciParamReportUsuario = mciParamReportUsuario;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "pruSeq", column = @Column(name = "PRU_SEQ", nullable = false)),
			@AttributeOverride(name = "fpdSeq", column = @Column(name = "FPD_SEQ", nullable = false)) })
	public MciParamFatorPredisponenteId getId() {
		return this.id;
	}

	public void setId(MciParamFatorPredisponenteId id) {
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
	@JoinColumn(name = "FPD_SEQ", nullable = false, insertable = false, updatable = false)
	public MciFatorPredisponentes getMciFatorPredisponentes() {
		return this.mciFatorPredisponentes;
	}

	public void setMciFatorPredisponentes(MciFatorPredisponentes mciFatorPredisponentes) {
		this.mciFatorPredisponentes = mciFatorPredisponentes;
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
	@JoinColumn(name = "PRU_SEQ", nullable = false, insertable = false, updatable = false)
	public MciParamReportUsuario getMciParamReportUsuario() {
		return this.mciParamReportUsuario;
	}

	public void setMciParamReportUsuario(MciParamReportUsuario mciParamReportUsuario) {
		this.mciParamReportUsuario = mciParamReportUsuario;
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
		VERSION("version"),
		MCI_FATOR_PREDISPONENTES("mciFatorPredisponentes"),
		RAP_SERVIDORES("rapServidores"),
		MCI_PARAM_REPORT_USUARIOS("mciParamReportUsuario"),
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
		if (!(obj instanceof MciParamFatorPredisponente)) {
			return false;
		}
		MciParamFatorPredisponente other = (MciParamFatorPredisponente) obj;
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
