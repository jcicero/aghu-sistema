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
 * MciParamTopogProcedimento generated by hbm2java
 */
@Entity
@Table(name = "MCI_PARAM_TOPOG_PROCEDIMENTOS", schema = "AGH")
public class MciParamTopogProcedimento extends BaseEntityId<MciParamTopogProcedimentoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2610859039462973984L;
	private MciParamTopogProcedimentoId id;
	private Integer version;
	private RapServidores rapServidores;
	private MciParamReportUsuario mciParamReportUsuario;
	private MciTopografiaProcedimento mciTopografiaProcedimento;
	private Date criadoEm;

	public MciParamTopogProcedimento() {
	}

	public MciParamTopogProcedimento(MciParamTopogProcedimentoId id, RapServidores rapServidores,
			MciParamReportUsuario mciParamReportUsuario, MciTopografiaProcedimento mciTopografiaProcedimento, Date criadoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.mciParamReportUsuario = mciParamReportUsuario;
		this.mciTopografiaProcedimento = mciTopografiaProcedimento;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "pruSeq", column = @Column(name = "PRU_SEQ", nullable = false)),
			@AttributeOverride(name = "topSeq", column = @Column(name = "TOP_SEQ", nullable = false)) })
	public MciParamTopogProcedimentoId getId() {
		return this.id;
	}

	public void setId(MciParamTopogProcedimentoId id) {
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
	@JoinColumn(name = "PRU_SEQ", nullable = false, insertable = false, updatable = false)
	public MciParamReportUsuario getMciParamReportUsuario() {
		return this.mciParamReportUsuario;
	}

	public void setMciParamReportUsuario(MciParamReportUsuario mciParamReportUsuario) {
		this.mciParamReportUsuario = mciParamReportUsuario;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TOP_SEQ", nullable = false, insertable = false, updatable = false)
	public MciTopografiaProcedimento getMciTopografiaProcedimento() {
		return this.mciTopografiaProcedimento;
	}

	public void setMciTopografiaProcedimento(MciTopografiaProcedimento mciTopografiaProcedimento) {
		this.mciTopografiaProcedimento = mciTopografiaProcedimento;
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
		RAP_SERVIDORES("rapServidores"),
		MCI_PARAM_REPORT_USUARIOS("mciParamReportUsuario"),
		MCI_TOPOGRAFIA_PROCEDIMENTO("mciTopografiaProcedimento"),
		MCI_TOPOGRAFIA_PROCEDIMENTO_SEQ("mciTopografiaProcedimento.seq"),
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
		if (!(obj instanceof MciParamTopogProcedimento)) {
			return false;
		}
		MciParamTopogProcedimento other = (MciParamTopogProcedimento) obj;
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
