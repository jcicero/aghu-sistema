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
 * AelAnatomopatologicoIg generated by hbm2java
 */
@Entity
@Table(name = "AEL_ANATOMOPATOLOGICOS_IG", schema = "AGH")
public class AelAnatomopatologicoIg extends BaseEntityId<AelAnatomopatologicoIgId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6883581944824696057L;
	private AelAnatomopatologicoIgId id;
	private Integer version;
	private RapServidores rapServidores;
	private String pecaCirurgica;
	private Short qtApMaligno;
	private Short qtApMalignoMc;
	private Date criadoEm;

	public AelAnatomopatologicoIg() {
	}

	public AelAnatomopatologicoIg(AelAnatomopatologicoIgId id, RapServidores rapServidores, String pecaCirurgica, Date criadoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.pecaCirurgica = pecaCirurgica;
		this.criadoEm = criadoEm;
	}

	public AelAnatomopatologicoIg(AelAnatomopatologicoIgId id, RapServidores rapServidores, String pecaCirurgica, Short qtApMaligno,
			Short qtApMalignoMc, Date criadoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.pecaCirurgica = pecaCirurgica;
		this.qtApMaligno = qtApMaligno;
		this.qtApMalignoMc = qtApMalignoMc;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "dtCompetencia", column = @Column(name = "DT_COMPETENCIA", nullable = false, length = 29)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public AelAnatomopatologicoIgId getId() {
		return this.id;
	}

	public void setId(AelAnatomopatologicoIgId id) {
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

	@Column(name = "PECA_CIRURGICA", nullable = false, length = 2)
	@Length(max = 2)
	public String getPecaCirurgica() {
		return this.pecaCirurgica;
	}

	public void setPecaCirurgica(String pecaCirurgica) {
		this.pecaCirurgica = pecaCirurgica;
	}

	@Column(name = "QT_AP_MALIGNO")
	public Short getQtApMaligno() {
		return this.qtApMaligno;
	}

	public void setQtApMaligno(Short qtApMaligno) {
		this.qtApMaligno = qtApMaligno;
	}

	@Column(name = "QT_AP_MALIGNO_MC")
	public Short getQtApMalignoMc() {
		return this.qtApMalignoMc;
	}

	public void setQtApMalignoMc(Short qtApMalignoMc) {
		this.qtApMalignoMc = qtApMalignoMc;
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
		PECA_CIRURGICA("pecaCirurgica"),
		QT_AP_MALIGNO("qtApMaligno"),
		QT_AP_MALIGNO_MC("qtApMalignoMc"),
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
		if (!(obj instanceof AelAnatomopatologicoIg)) {
			return false;
		}
		AelAnatomopatologicoIg other = (AelAnatomopatologicoIg) obj;
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
