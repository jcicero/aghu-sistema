package br.gov.mec.aghu.model;

// Generated 19/04/2012 16:57:27 by Hibernate Tools 3.4.0.CR1

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
 * MbcAnestesiaDescricoes generated by hbm2java
 */
@Entity
@Table(name = "MBC_ANESTESIA_DESCRICOES", schema = "AGH")
public class MbcAnestesiaDescricoes extends BaseEntityId<MbcAnestesiaDescricoesId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5440417726910861813L;
	private MbcAnestesiaDescricoesId id;
	private Integer version;
	private Date criadoEm;
	private RapServidores servidor;
	private MbcTipoAnestesias tipoAnestesia;
	private MbcDescricaoCirurgica mbcDescricaoCirurgica;

	public MbcAnestesiaDescricoes() {
	}

	public MbcAnestesiaDescricoes(MbcAnestesiaDescricoesId id, Date criadoEm,
			RapServidores servidor, MbcTipoAnestesias tipoAnestesia) {
		this.id = id;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
		this.setTipoAnestesia(tipoAnestesia);
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "dcgCrgSeq", column = @Column(name = "DCG_CRG_SEQ", nullable = false)),
			@AttributeOverride(name = "dcgSeqp", column = @Column(name = "DCG_SEQP", nullable = false)),
			@AttributeOverride(name = "tanSeq", column = @Column(name = "TAN_SEQ", nullable = false)) })
	public MbcAnestesiaDescricoesId getId() {
		return this.id;
	}

	public void setId(MbcAnestesiaDescricoesId id) {
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@JoinColumns( {
		@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	public RapServidores getServidor() {
		return servidor;
	}
	
	public void setTipoAnestesia(MbcTipoAnestesias tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TAN_SEQ", nullable = false, insertable = false, updatable = false)
	public MbcTipoAnestesias getTipoAnestesia() {
		return tipoAnestesia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "DCG_CRG_SEQ", referencedColumnName = "CRG_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "DCG_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public MbcDescricaoCirurgica getMbcDescricaoCirurgica() {
		return this.mbcDescricaoCirurgica;
	}

	public void setMbcDescricaoCirurgica(MbcDescricaoCirurgica mbcDescricaoCirurgica) {
		this.mbcDescricaoCirurgica = mbcDescricaoCirurgica;
	}

	public enum Fields {
		DCG_CRG_SEQ("id.dcgCrgSeq"),
		DCG_SEQP("id.dcgSeqp"),
		TAN_SEQ("id.tanSeq"),
		TIPO_ANESTESIA("tipoAnestesia");

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
		if (!(obj instanceof MbcAnestesiaDescricoes)) {
			return false;
		}
		MbcAnestesiaDescricoes other = (MbcAnestesiaDescricoes) obj;
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
