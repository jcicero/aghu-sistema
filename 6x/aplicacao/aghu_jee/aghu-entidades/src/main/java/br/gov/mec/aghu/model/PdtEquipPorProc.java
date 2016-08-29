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
 * PdtEquipPorProc generated by hbm2java
 */
@Entity
@Table(name = "PDT_EQUIP_POR_PROCS", schema = "AGH")
public class PdtEquipPorProc extends BaseEntityId<PdtEquipPorProcId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8238807756909241184L;
	private PdtEquipPorProcId id;
	private Integer version;
	private RapServidores rapServidores;
	private PdtProcDiagTerap pdtProcDiagTerap;
	private PdtEquipamento pdtEquipamento;
	private Date criadoEm;

	public PdtEquipPorProc() {
	}

	public PdtEquipPorProc(PdtEquipPorProcId id, RapServidores rapServidores, PdtProcDiagTerap pdtProcDiagTerap,
			PdtEquipamento pdtEquipamento, Date criadoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.pdtProcDiagTerap = pdtProcDiagTerap;
		this.pdtEquipamento = pdtEquipamento;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "dptSeq", column = @Column(name = "DPT_SEQ", nullable = false)),
			@AttributeOverride(name = "deqSeq", column = @Column(name = "DEQ_SEQ", nullable = false)) })
	public PdtEquipPorProcId getId() {
		return this.id;
	}

	public void setId(PdtEquipPorProcId id) {
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
	@JoinColumn(name = "DPT_SEQ", insertable = false, updatable = false)
	public PdtProcDiagTerap getPdtProcDiagTerap() {
		return this.pdtProcDiagTerap;
	}

	public void setPdtProcDiagTerap(PdtProcDiagTerap pdtProcDiagTerap) {
		this.pdtProcDiagTerap = pdtProcDiagTerap;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DEQ_SEQ", insertable = false, updatable = false)
	public PdtEquipamento getPdtEquipamento() {
		return this.pdtEquipamento;
	}

	public void setPdtEquipamento(PdtEquipamento pdtEquipamento) {
		this.pdtEquipamento = pdtEquipamento;
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
		DEG_SEQ("id.deqSeq"),
		DEQ_SEQ("id.deqSeq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		PDT_PROC_DIAG_TERAPS("pdtProcDiagTerap"),
		PDT_EQUIPAMENTOS("pdtEquipamento"),
		CRIADO_EM("criadoEm"),
		DPT_SEQ("id.dptSeq"),;

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
		if (!(obj instanceof PdtEquipPorProc)) {
			return false;
		}
		PdtEquipPorProc other = (PdtEquipPorProc) obj;
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
