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
 * MbcAgendaProcedimento generated by hbm2java
 */
@Entity
@Table(name = "MBC_AGENDA_PROCEDIMENTOS", schema = "AGH")
public class MbcAgendaProcedimento extends BaseEntityId<MbcAgendaProcedimentoId> implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8799215171376660788L;
	private MbcAgendaProcedimentoId id;
	private Integer version;
	private MbcAgendas mbcAgendas;
	private RapServidores rapServidores;
	private MbcEspecialidadeProcCirgs mbcEspecialidadeProcCirgs;
	private Date criadoEm;
	private Short qtde;
	private MbcProcedimentoCirurgicos procedimentoCirurgico;

	public MbcAgendaProcedimento() {
	}

	public MbcAgendaProcedimento(MbcAgendaProcedimentoId id, MbcAgendas mbcAgendas, RapServidores rapServidores,
			MbcEspecialidadeProcCirgs mbcEspecialidadeProcCirgs, Date criadoEm) {
		this.id = id;
		this.mbcAgendas = mbcAgendas;
		this.rapServidores = rapServidores;
		this.mbcEspecialidadeProcCirgs = mbcEspecialidadeProcCirgs;
		this.criadoEm = criadoEm;
	}

	public MbcAgendaProcedimento(MbcAgendaProcedimentoId id, MbcAgendas mbcAgendas, RapServidores rapServidores,
			MbcEspecialidadeProcCirgs mbcEspecialidadeProcCirgs, Date criadoEm, Short qtde) {
		this.id = id;
		this.mbcAgendas = mbcAgendas;
		this.rapServidores = rapServidores;
		this.mbcEspecialidadeProcCirgs = mbcEspecialidadeProcCirgs;
		this.criadoEm = criadoEm;
		this.qtde = qtde;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "agdSeq", column = @Column(name = "AGD_SEQ", nullable = false)),
			@AttributeOverride(name = "eprPciSeq", column = @Column(name = "EPR_PCI_SEQ", nullable = false)),
			@AttributeOverride(name = "eprEspSeq", column = @Column(name = "EPR_ESP_SEQ", nullable = false)) })
	public MbcAgendaProcedimentoId getId() {
		return this.id;
	}

	public void setId(MbcAgendaProcedimentoId id) {
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
	@JoinColumn(name = "AGD_SEQ", nullable = false, insertable = false, updatable = false)
	public MbcAgendas getMbcAgendas() {
		return this.mbcAgendas;
	}

	public void setMbcAgendas(MbcAgendas mbcAgendas) {
		this.mbcAgendas = mbcAgendas;
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
	@JoinColumns({
			@JoinColumn(name = "EPR_PCI_SEQ", referencedColumnName = "PCI_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "EPR_ESP_SEQ", referencedColumnName = "ESP_SEQ", nullable = false, insertable = false, updatable = false) })
	public MbcEspecialidadeProcCirgs getMbcEspecialidadeProcCirgs() {
		return this.mbcEspecialidadeProcCirgs;
	}

	public void setMbcEspecialidadeProcCirgs(MbcEspecialidadeProcCirgs mbcEspecialidadeProcCirgs) {
		this.mbcEspecialidadeProcCirgs = mbcEspecialidadeProcCirgs;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "QTDE")
	public Short getQtde() {
		return this.qtde;
	}

	public void setQtde(Short qtde) {
		this.qtde = qtde;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EPR_PCI_SEQ", insertable=false, updatable=false,referencedColumnName="SEQ")
	public MbcProcedimentoCirurgicos getProcedimentoCirurgico() {
		return this.procedimentoCirurgico;
	}

	public void setProcedimentoCirurgico(
			MbcProcedimentoCirurgicos procedimentoCirurgico) {
		this.procedimentoCirurgico = procedimentoCirurgico;
	}

	public enum Fields {

		ID("id"),
		ID_AGD_SEQ("id.agdSeq"),
		EPR_PCI_SEQ("id.eprPciSeq"),
		EPR_ESP_SEQ("id.eprEspSeq"),
		VERSION("version"),
		MBC_AGENDAS("mbcAgendas"),
		MBC_AGENDAS_ID("mbcAgendas.seq"),
		RAP_SERVIDORES("rapServidores"),
		MBC_ESPECIALIDADE_PROC_CIRGS("mbcEspecialidadeProcCirgs"),
		PROCEDIMENTO_CIRURGICO("procedimentoCirurgico"),
		CRIADO_EM("criadoEm"),
		QTDE("qtde");

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
		if (!(obj instanceof MbcAgendaProcedimento)) {
			return false;
		}
		MbcAgendaProcedimento other = (MbcAgendaProcedimento) obj;
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
