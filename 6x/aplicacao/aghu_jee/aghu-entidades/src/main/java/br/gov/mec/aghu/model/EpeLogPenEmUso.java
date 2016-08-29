package br.gov.mec.aghu.model;

// Generated 17/10/2011 14:21:24 by Hibernate Tools 3.4.0.CR1

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
 * EpeLogPenEmUsos generated by hbm2java
 */
@Entity
@Table(name = "EPE_LOG_PEN_EM_USOS", schema = "AGH")
public class EpeLogPenEmUso extends BaseEntityId<EpeLogPenEmUsoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6606351457247761875L;
	private EpeLogPenEmUsoId id;
	private Integer version;
	private Date criadoEm;
	private RapServidores servidor;
	private EpePrescricaoEnfermagem prescricaoEnfermagem;

	public EpeLogPenEmUso() {
	}

	public EpeLogPenEmUso(EpeLogPenEmUsoId id, Date criadoEm,
			RapServidores servidor) {
		this.id = id;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "penAtdSeq", column = @Column(name = "PEN_ATD_SEQ", nullable = false, precision = 9, scale = 0)),
			@AttributeOverride(name = "penSeq", column = @Column(name = "PEN_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "seq", column = @Column(name = "SEQ", nullable = false, precision = 8, scale = 0)) })
	public EpeLogPenEmUsoId getId() {
		return this.id;
	}

	public void setId(EpeLogPenEmUsoId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false, precision = 9, scale = 0)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "PEN_ATD_SEQ", referencedColumnName = "ATD_SEQ", nullable=false, insertable = false, updatable=false),
			@JoinColumn(name = "PEN_SEQ", referencedColumnName = "SEQ", nullable=false, insertable = false, updatable=false)})
	public EpePrescricaoEnfermagem getPrescricaoEnfermagem() {
		return this.prescricaoEnfermagem;
	}

	public void setPrescricaoEnfermagem(EpePrescricaoEnfermagem prescricaoEnfermagem) {
		this.prescricaoEnfermagem = prescricaoEnfermagem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		EpeLogPenEmUso other = (EpeLogPenEmUso) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
	
	
	public enum Fields {

		ID("id"),
		CRIADO_EM("criadoEm"),
		SERVIDOR("servidor"),
		PRESCRICAO_ENFERMAGEM("prescricaoEnfermagem");

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
