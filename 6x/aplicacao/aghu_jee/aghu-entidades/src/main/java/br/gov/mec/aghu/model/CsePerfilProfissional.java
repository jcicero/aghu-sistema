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
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * CsePerfilProfissional generated by hbm2java
 */
@Entity
@SequenceGenerator(name="csePocSq1", sequenceName="AGH.CSE_POC_SQ1", allocationSize = 1)
@Table(name = "CSE_PERFIL_PROFISSIONAIS", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = { "oca_car_codigo",
		"oca_codigo", "per_nome", "vin_codigo", "cpr_codigo" }))
public class CsePerfilProfissional extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7616196495457420993L;
	private Integer seq;
	private Integer version;
	private RapConselhosProfissionais rapConselhosProfissionais;
	private RapVinculos rapVinculos;
	private RapOcupacaoCargo rapOcupacaoCargo;
	private String perNome;
	private Date criadoEm;
	private String criadoPor;

	public CsePerfilProfissional() {
	}

	public CsePerfilProfissional(Integer seq, RapVinculos rapVinculos, RapOcupacaoCargo rapOcupacaoCargo, String perNome,
			Date criadoEm, String criadoPor) {
		this.seq = seq;
		this.rapVinculos = rapVinculos;
		this.rapOcupacaoCargo = rapOcupacaoCargo;
		this.perNome = perNome;
		this.criadoEm = criadoEm;
		this.criadoPor = criadoPor;
	}

	public CsePerfilProfissional(Integer seq, RapConselhosProfissionais rapConselhosProfissionais, RapVinculos rapVinculos,
			RapOcupacaoCargo rapOcupacaoCargo, String perNome, Date criadoEm, String criadoPor) {
		this.seq = seq;
		this.rapConselhosProfissionais = rapConselhosProfissionais;
		this.rapVinculos = rapVinculos;
		this.rapOcupacaoCargo = rapOcupacaoCargo;
		this.perNome = perNome;
		this.criadoEm = criadoEm;
		this.criadoPor = criadoPor;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "csePocSq1")
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
	@JoinColumn(name = "CPR_CODIGO")
	public RapConselhosProfissionais getRapConselhosProfissionais() {
		return this.rapConselhosProfissionais;
	}

	public void setRapConselhosProfissionais(RapConselhosProfissionais rapConselhosProfissionais) {
		this.rapConselhosProfissionais = rapConselhosProfissionais;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VIN_CODIGO", nullable = false)
	public RapVinculos getRapVinculos() {
		return this.rapVinculos;
	}

	public void setRapVinculos(RapVinculos rapVinculos) {
		this.rapVinculos = rapVinculos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "OCA_CAR_CODIGO", referencedColumnName = "CAR_CODIGO", nullable = false),
			@JoinColumn(name = "OCA_CODIGO", referencedColumnName = "CODIGO", nullable = false) })
	public RapOcupacaoCargo getRapOcupacaoCargo() {
		return this.rapOcupacaoCargo;
	}

	public void setRapOcupacaoCargo(RapOcupacaoCargo rapOcupacaoCargo) {
		this.rapOcupacaoCargo = rapOcupacaoCargo;
	}

	@Column(name = "PER_NOME", nullable = false, length = 30)
	@Length(max = 30)
	public String getPerNome() {
		return this.perNome;
	}

	public void setPerNome(String perNome) {
		this.perNome = perNome;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "CRIADO_POR", nullable = false, length = 30)
	@Length(max = 30)
	public String getCriadoPor() {
		return this.criadoPor;
	}

	public void setCriadoPor(String criadoPor) {
		this.criadoPor = criadoPor;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_CONSELHOS_PROFISSIONAIS("rapConselhosProfissionais"),
		RAP_VINCULOS("rapVinculos"),
		RAP_OCUPACAO_CARGO("rapOcupacaoCargo"),
		PER_NOME("perNome"),
		CRIADO_EM("criadoEm"),
		CRIADO_POR("criadoPor");

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
		if (!(obj instanceof CsePerfilProfissional)) {
			return false;
		}
		CsePerfilProfissional other = (CsePerfilProfissional) obj;
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