package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * RarChefiaPrograma generated by hbm2java
 */
@Entity
@Table(name = "RAR_CHEFIAS_PROGRAMA", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = { "pga_seq", "dt_inicio" }))
public class RarChefiaPrograma extends BaseEntityId<RarChefiaProgramaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6007940927087253276L;
	private RarChefiaProgramaId id;
	private Integer version;
	private RapServidores rapServidoresByRarChpSerFk3;
	private RapServidores rapServidoresByRarChpSerFk4;
	private RapServidores rapServidoresByRarChpSerFk1;
	private RapServidores rapServidoresByRarChpSerFk2;
	private RarPrograma rarPrograma;
	private Date dtInicio;
	private Date dtFim;
	private Date criadoEm;
	private Date alteradoEm;
	private Set<RarSubSecretaria> rarSubSecretarias = new HashSet<RarSubSecretaria>(0);

	public RarChefiaPrograma() {
	}

	public RarChefiaPrograma(RarChefiaProgramaId id, RapServidores rapServidoresByRarChpSerFk1,
			RapServidores rapServidoresByRarChpSerFk2, RarPrograma rarPrograma, Date dtInicio, Date criadoEm) {
		this.id = id;
		this.rapServidoresByRarChpSerFk1 = rapServidoresByRarChpSerFk1;
		this.rapServidoresByRarChpSerFk2 = rapServidoresByRarChpSerFk2;
		this.rarPrograma = rarPrograma;
		this.dtInicio = dtInicio;
		this.criadoEm = criadoEm;
	}

	public RarChefiaPrograma(RarChefiaProgramaId id, RapServidores rapServidoresByRarChpSerFk3,
			RapServidores rapServidoresByRarChpSerFk4, RapServidores rapServidoresByRarChpSerFk1,
			RapServidores rapServidoresByRarChpSerFk2, RarPrograma rarPrograma, Date dtInicio, Date dtFim, Date criadoEm,
			Date alteradoEm, Set<RarSubSecretaria> rarSubSecretarias) {
		this.id = id;
		this.rapServidoresByRarChpSerFk3 = rapServidoresByRarChpSerFk3;
		this.rapServidoresByRarChpSerFk4 = rapServidoresByRarChpSerFk4;
		this.rapServidoresByRarChpSerFk1 = rapServidoresByRarChpSerFk1;
		this.rapServidoresByRarChpSerFk2 = rapServidoresByRarChpSerFk2;
		this.rarPrograma = rarPrograma;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.rarSubSecretarias = rarSubSecretarias;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "pgaSeq", column = @Column(name = "PGA_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public RarChefiaProgramaId getId() {
		return this.id;
	}

	public void setId(RarChefiaProgramaId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByRarChpSerFk3() {
		return this.rapServidoresByRarChpSerFk3;
	}

	public void setRapServidoresByRarChpSerFk3(RapServidores rapServidoresByRarChpSerFk3) {
		this.rapServidoresByRarChpSerFk3 = rapServidoresByRarChpSerFk3;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_SECRETARIA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_SECRETARIA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByRarChpSerFk4() {
		return this.rapServidoresByRarChpSerFk4;
	}

	public void setRapServidoresByRarChpSerFk4(RapServidores rapServidoresByRarChpSerFk4) {
		this.rapServidoresByRarChpSerFk4 = rapServidoresByRarChpSerFk4;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByRarChpSerFk1() {
		return this.rapServidoresByRarChpSerFk1;
	}

	public void setRapServidoresByRarChpSerFk1(RapServidores rapServidoresByRarChpSerFk1) {
		this.rapServidoresByRarChpSerFk1 = rapServidoresByRarChpSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_CRIADO", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO_CRIADO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByRarChpSerFk2() {
		return this.rapServidoresByRarChpSerFk2;
	}

	public void setRapServidoresByRarChpSerFk2(RapServidores rapServidoresByRarChpSerFk2) {
		this.rapServidoresByRarChpSerFk2 = rapServidoresByRarChpSerFk2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PGA_SEQ", nullable = false, insertable = false, updatable = false)
	public RarPrograma getRarPrograma() {
		return this.rarPrograma;
	}

	public void setRarPrograma(RarPrograma rarPrograma) {
		this.rarPrograma = rarPrograma;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO", nullable = false, length = 29)
	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM", length = 29)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rarChefiaPrograma")
	public Set<RarSubSecretaria> getRarSubSecretarias() {
		return this.rarSubSecretarias;
	}

	public void setRarSubSecretarias(Set<RarSubSecretaria> rarSubSecretarias) {
		this.rarSubSecretarias = rarSubSecretarias;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES_BY_RAR_CHP_SER_FK3("rapServidoresByRarChpSerFk3"),
		RAP_SERVIDORES_BY_RAR_CHP_SER_FK4("rapServidoresByRarChpSerFk4"),
		RAP_SERVIDORES_BY_RAR_CHP_SER_FK1("rapServidoresByRarChpSerFk1"),
		RAP_SERVIDORES_BY_RAR_CHP_SER_FK2("rapServidoresByRarChpSerFk2"),
		RAR_PROGRAMAS("rarPrograma"),
		DT_INICIO("dtInicio"),
		DT_FIM("dtFim"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		RAR_SUB_SECRETARIAS("rarSubSecretarias");

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
		if (!(obj instanceof RarChefiaPrograma)) {
			return false;
		}
		RarChefiaPrograma other = (RarChefiaPrograma) obj;
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
