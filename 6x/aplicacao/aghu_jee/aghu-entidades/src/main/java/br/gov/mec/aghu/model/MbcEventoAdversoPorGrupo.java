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
 * MbcEventoAdversoPorGrupo generated by hbm2java
 */
@Entity
@Table(name = "MBC_EVENTO_ADVERSO_POR_GRUPOS", schema = "AGH")
public class MbcEventoAdversoPorGrupo extends BaseEntityId<MbcEventoAdversoPorGrupoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8270577903664201829L;
	private MbcEventoAdversoPorGrupoId id;
	private Integer version;
	private RapServidores rapServidores;
	private MbcGrpEventoAdverso mbcGrpEventoAdverso;
	private MbcEventoAdverso mbcEventoAdverso;
	private Date criadoEm;

	public MbcEventoAdversoPorGrupo() {
	}

	public MbcEventoAdversoPorGrupo(MbcEventoAdversoPorGrupoId id, RapServidores rapServidores,
			MbcGrpEventoAdverso mbcGrpEventoAdverso, MbcEventoAdverso mbcEventoAdverso, Date criadoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.mbcGrpEventoAdverso = mbcGrpEventoAdverso;
		this.mbcEventoAdverso = mbcEventoAdverso;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "eadSeq", column = @Column(name = "EAD_SEQ", nullable = false)),
			@AttributeOverride(name = "geaSeq", column = @Column(name = "GEA_SEQ", nullable = false)) })
	public MbcEventoAdversoPorGrupoId getId() {
		return this.id;
	}

	public void setId(MbcEventoAdversoPorGrupoId id) {
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
	@JoinColumn(name = "GEA_SEQ", nullable = false, insertable = false, updatable = false)
	public MbcGrpEventoAdverso getMbcGrpEventoAdverso() {
		return this.mbcGrpEventoAdverso;
	}

	public void setMbcGrpEventoAdverso(MbcGrpEventoAdverso mbcGrpEventoAdverso) {
		this.mbcGrpEventoAdverso = mbcGrpEventoAdverso;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EAD_SEQ", nullable = false, insertable = false, updatable = false)
	public MbcEventoAdverso getMbcEventoAdverso() {
		return this.mbcEventoAdverso;
	}

	public void setMbcEventoAdverso(MbcEventoAdverso mbcEventoAdverso) {
		this.mbcEventoAdverso = mbcEventoAdverso;
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
		MBC_GRP_EVENTO_ADVERSOS("mbcGrpEventoAdverso"),
		MBC_EVENTO_ADVERSO("mbcEventoAdverso"),
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
		if (!(obj instanceof MbcEventoAdversoPorGrupo)) {
			return false;
		}
		MbcEventoAdversoPorGrupo other = (MbcEventoAdversoPorGrupo) obj;
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