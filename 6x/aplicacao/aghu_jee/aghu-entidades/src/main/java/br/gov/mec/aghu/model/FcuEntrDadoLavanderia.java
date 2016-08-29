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


import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * FcuEntrDadoLavanderia generated by hbm2java
 */
@Entity
@SequenceGenerator(name="fcuElvSq1", sequenceName="AGH.FCU_ELV_SQ1", allocationSize = 1)
@Table(name = "FCU_ENTR_DADOS_LAVANDERIA", schema = "AGH")
public class FcuEntrDadoLavanderia extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6775656600628436479L;
	private Integer seq;
	private Integer version;
	private RapServidores rapServidores;
	private FccCentroCustos fccCentroCustos;
	private Date dtFimValidade;
	private Double percRoupa;
	private Date criadoEm;
	private Short peso;
	private Date dtInicioValidade;

	public FcuEntrDadoLavanderia() {
	}

	public FcuEntrDadoLavanderia(Integer seq, RapServidores rapServidores, FccCentroCustos fccCentroCustos, Date dtInicioValidade) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.fccCentroCustos = fccCentroCustos;
		this.dtInicioValidade = dtInicioValidade;
	}

	public FcuEntrDadoLavanderia(Integer seq, RapServidores rapServidores, FccCentroCustos fccCentroCustos, Date dtFimValidade,
			Double percRoupa, Date criadoEm, Short peso, Date dtInicioValidade) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.fccCentroCustos = fccCentroCustos;
		this.dtFimValidade = dtFimValidade;
		this.percRoupa = percRoupa;
		this.criadoEm = criadoEm;
		this.peso = peso;
		this.dtInicioValidade = dtInicioValidade;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "fcuElvSq1")
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CCT_CODIGO", nullable = false)
	public FccCentroCustos getFccCentroCustos() {
		return this.fccCentroCustos;
	}

	public void setFccCentroCustos(FccCentroCustos fccCentroCustos) {
		this.fccCentroCustos = fccCentroCustos;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM_VALIDADE", length = 29)
	public Date getDtFimValidade() {
		return this.dtFimValidade;
	}

	public void setDtFimValidade(Date dtFimValidade) {
		this.dtFimValidade = dtFimValidade;
	}

	@Column(name = "PERC_ROUPA", precision = 17, scale = 17)
	public Double getPercRoupa() {
		return this.percRoupa;
	}

	public void setPercRoupa(Double percRoupa) {
		this.percRoupa = percRoupa;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "PESO")
	public Short getPeso() {
		return this.peso;
	}

	public void setPeso(Short peso) {
		this.peso = peso;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO_VALIDADE", nullable = false, length = 29)
	public Date getDtInicioValidade() {
		return this.dtInicioValidade;
	}

	public void setDtInicioValidade(Date dtInicioValidade) {
		this.dtInicioValidade = dtInicioValidade;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		FCC_CENTRO_CUSTOS("fccCentroCustos"),
		DT_FIM_VALIDADE("dtFimValidade"),
		PERC_ROUPA("percRoupa"),
		CRIADO_EM("criadoEm"),
		PESO("peso"),
		DT_INICIO_VALIDADE("dtInicioValidade");

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
		if (!(obj instanceof FcuEntrDadoLavanderia)) {
			return false;
		}
		FcuEntrDadoLavanderia other = (FcuEntrDadoLavanderia) obj;
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
