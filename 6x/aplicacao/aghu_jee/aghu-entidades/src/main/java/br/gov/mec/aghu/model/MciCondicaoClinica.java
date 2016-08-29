package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MciCondicaoClinica generated by hbm2java
 */
@Entity
@Table(name = "MCI_CONDICAO_CLINICAS", schema = "AGH")
public class MciCondicaoClinica extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1512900249999254029L;
	private Short seq;
	private Integer version;
	private RapServidores rapServidores;
	private String descricao;
	private String indSituacao;
	private Date criadoEm;
	private String indGmr;
	private Set<MciItemCondicaoClinica> mciItemCondicaoClinicaes = new HashSet<MciItemCondicaoClinica>(0);
	private Set<MciCriterioPortal> mciCriterioPortals = new HashSet<MciCriterioPortal>(0);

	public MciCondicaoClinica() {
	}

	public MciCondicaoClinica(Short seq, RapServidores rapServidores, String descricao, Date criadoEm, String indGmr) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.indGmr = indGmr;
	}

	public MciCondicaoClinica(Short seq, RapServidores rapServidores, String descricao, String indSituacao, Date criadoEm,
			String indGmr, Set<MciItemCondicaoClinica> mciItemCondicaoClinicaes, Set<MciCriterioPortal> mciCriterioPortals) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.indGmr = indGmr;
		this.mciItemCondicaoClinicaes = mciItemCondicaoClinicaes;
		this.mciCriterioPortals = mciCriterioPortals;
	}

	@Id
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
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

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_GMR", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndGmr() {
		return this.indGmr;
	}

	public void setIndGmr(String indGmr) {
		this.indGmr = indGmr;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciCondicaoClinica")
	public Set<MciItemCondicaoClinica> getMciItemCondicaoClinicaes() {
		return this.mciItemCondicaoClinicaes;
	}

	public void setMciItemCondicaoClinicaes(Set<MciItemCondicaoClinica> mciItemCondicaoClinicaes) {
		this.mciItemCondicaoClinicaes = mciItemCondicaoClinicaes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciCondicaoClinica")
	public Set<MciCriterioPortal> getMciCriterioPortals() {
		return this.mciCriterioPortals;
	}

	public void setMciCriterioPortals(Set<MciCriterioPortal> mciCriterioPortals) {
		this.mciCriterioPortals = mciCriterioPortals;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		DESCRICAO("descricao"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
		IND_GMR("indGmr"),
		MCI_ITEM_CONDICAO_CLINICAES("mciItemCondicaoClinicaes"),
		MCI_CRITERIO_PORTALS("mciCriterioPortals");

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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof MciCondicaoClinica)) {
			return false;
		}
		MciCondicaoClinica other = (MciCondicaoClinica) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
