package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamParamPreferido generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamPpfSq1", sequenceName="AGH.MAM_PPF_SQ1", allocationSize = 1)
@Table(name = "MAM_PARAM_PREFERIDOS", schema = "AGH")
public class MamParamPreferido extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5213870842910387552L;
	private Integer seq;
	private Integer version;
	private AghEspecialidades aghEspecialidades;
	private RapServidores rapServidoresByMamPpfSerFk1;
	private RapServidores rapServidoresByMamPpfSerFk2;
	private AghUnidadesFuncionais aghUnidadesFuncionais;
	private AghEquipes aghEquipes;
	private Date criadoEm;
	private String indSituacao;
	private String turno;
	private String indUsoSala;

	public MamParamPreferido() {
	}

	public MamParamPreferido(Integer seq, RapServidores rapServidoresByMamPpfSerFk1, AghUnidadesFuncionais aghUnidadesFuncionais,
			Date criadoEm, String indSituacao) {
		this.seq = seq;
		this.rapServidoresByMamPpfSerFk1 = rapServidoresByMamPpfSerFk1;
		this.aghUnidadesFuncionais = aghUnidadesFuncionais;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
	}

	public MamParamPreferido(Integer seq, AghEspecialidades aghEspecialidades, RapServidores rapServidoresByMamPpfSerFk1,
			RapServidores rapServidoresByMamPpfSerFk2, AghUnidadesFuncionais aghUnidadesFuncionais, AghEquipes aghEquipes,
			Date criadoEm, String indSituacao, String turno, String indUsoSala) {
		this.seq = seq;
		this.aghEspecialidades = aghEspecialidades;
		this.rapServidoresByMamPpfSerFk1 = rapServidoresByMamPpfSerFk1;
		this.rapServidoresByMamPpfSerFk2 = rapServidoresByMamPpfSerFk2;
		this.aghUnidadesFuncionais = aghUnidadesFuncionais;
		this.aghEquipes = aghEquipes;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.turno = turno;
		this.indUsoSala = indUsoSala;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamPpfSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
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
	@JoinColumn(name = "ESP_SEQ")
	public AghEspecialidades getAghEspecialidades() {
		return this.aghEspecialidades;
	}

	public void setAghEspecialidades(AghEspecialidades aghEspecialidades) {
		this.aghEspecialidades = aghEspecialidades;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByMamPpfSerFk1() {
		return this.rapServidoresByMamPpfSerFk1;
	}

	public void setRapServidoresByMamPpfSerFk1(RapServidores rapServidoresByMamPpfSerFk1) {
		this.rapServidoresByMamPpfSerFk1 = rapServidoresByMamPpfSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_PROFISSIONAL", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_PROFISSIONAL", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByMamPpfSerFk2() {
		return this.rapServidoresByMamPpfSerFk2;
	}

	public void setRapServidoresByMamPpfSerFk2(RapServidores rapServidoresByMamPpfSerFk2) {
		this.rapServidoresByMamPpfSerFk2 = rapServidoresByMamPpfSerFk2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNF_SEQ", nullable = false)
	public AghUnidadesFuncionais getAghUnidadesFuncionais() {
		return this.aghUnidadesFuncionais;
	}

	public void setAghUnidadesFuncionais(AghUnidadesFuncionais aghUnidadesFuncionais) {
		this.aghUnidadesFuncionais = aghUnidadesFuncionais;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EQP_SEQ")
	public AghEquipes getAghEquipes() {
		return this.aghEquipes;
	}

	public void setAghEquipes(AghEquipes aghEquipes) {
		this.aghEquipes = aghEquipes;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "TURNO", length = 1)
	@Length(max = 1)
	public String getTurno() {
		return this.turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	@Column(name = "IND_USO_SALA", length = 1)
	@Length(max = 1)
	public String getIndUsoSala() {
		return this.indUsoSala;
	}

	public void setIndUsoSala(String indUsoSala) {
		this.indUsoSala = indUsoSala;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		AGH_ESPECIALIDADES("aghEspecialidades"),
		RAP_SERVIDORES_BY_MAM_PPF_SER_FK1("rapServidoresByMamPpfSerFk1"),
		RAP_SERVIDORES_BY_MAM_PPF_SER_FK2("rapServidoresByMamPpfSerFk2"),
		AGH_UNIDADES_FUNCIONAIS("aghUnidadesFuncionais"),
		AGH_EQUIPES("aghEquipes"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao"),
		TURNO("turno"),
		IND_USO_SALA("indUsoSala");

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
		if (!(obj instanceof MamParamPreferido)) {
			return false;
		}
		MamParamPreferido other = (MamParamPreferido) obj;
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
