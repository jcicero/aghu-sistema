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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MciParamReportExportacao generated by hbm2java
 */
@Entity
@Table(name = "MCI_PARAM_REPORT_EXPORTACOES", schema = "AGH")
public class MciParamReportExportacao extends BaseEntityId<MciParamReportExportacaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -759013767151343012L;
	private MciParamReportExportacaoId id;
	private Integer version;
	private MciProcessaExportacao mciProcessaExportacao;
	private MciParamReportUsuario mciParamReportUsuario;
	private Date criadoEm;

	public MciParamReportExportacao() {
	}

	public MciParamReportExportacao(MciParamReportExportacaoId id, MciProcessaExportacao mciProcessaExportacao,
			MciParamReportUsuario mciParamReportUsuario, Date criadoEm) {
		this.id = id;
		this.mciProcessaExportacao = mciProcessaExportacao;
		this.mciParamReportUsuario = mciParamReportUsuario;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "pruSeq", column = @Column(name = "PRU_SEQ", nullable = false)),
			@AttributeOverride(name = "pxpSeq", column = @Column(name = "PXP_SEQ", nullable = false)) })
	public MciParamReportExportacaoId getId() {
		return this.id;
	}

	public void setId(MciParamReportExportacaoId id) {
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
	@JoinColumn(name = "PXP_SEQ", nullable = false, insertable = false, updatable = false)
	public MciProcessaExportacao getMciProcessaExportacao() {
		return this.mciProcessaExportacao;
	}

	public void setMciProcessaExportacao(MciProcessaExportacao mciProcessaExportacao) {
		this.mciProcessaExportacao = mciProcessaExportacao;
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
		MCI_PROCESSA_EXPORTACOES("mciProcessaExportacao"),
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
		if (!(obj instanceof MciParamReportExportacao)) {
			return false;
		}
		MciParamReportExportacao other = (MciParamReportExportacao) obj;
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
