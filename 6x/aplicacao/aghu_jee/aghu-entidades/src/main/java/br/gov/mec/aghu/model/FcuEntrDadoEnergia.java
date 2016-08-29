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
 * FcuEntrDadoEnergia generated by hbm2java
 */
@Entity
@SequenceGenerator(name="fcuEenSq1", sequenceName="AGH.FCU_EEN_SQ1", allocationSize = 1)
@Table(name = "FCU_ENTR_DADOS_ENERGIA", schema = "AGH")
public class FcuEntrDadoEnergia extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9082899123611712650L;
	private Short seq;
	private Integer version;
	private RapServidores rapServidores;
	private FccCentroCustos fccCentroCustos;
	private Date dtInicioValidade;
	private Date dtFimValidade;
	private Double qtConsumo;
	private Date criadoEm;

	public FcuEntrDadoEnergia() {
	}

	public FcuEntrDadoEnergia(Short seq, RapServidores rapServidores, FccCentroCustos fccCentroCustos, Date dtInicioValidade,
			Double qtConsumo) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.fccCentroCustos = fccCentroCustos;
		this.dtInicioValidade = dtInicioValidade;
		this.qtConsumo = qtConsumo;
	}

	public FcuEntrDadoEnergia(Short seq, RapServidores rapServidores, FccCentroCustos fccCentroCustos, Date dtInicioValidade,
			Date dtFimValidade, Double qtConsumo, Date criadoEm) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.fccCentroCustos = fccCentroCustos;
		this.dtInicioValidade = dtInicioValidade;
		this.dtFimValidade = dtFimValidade;
		this.qtConsumo = qtConsumo;
		this.criadoEm = criadoEm;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "fcuEenSq1")
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CCT_CODIGO", nullable = false)
	public FccCentroCustos getFccCentroCustos() {
		return this.fccCentroCustos;
	}

	public void setFccCentroCustos(FccCentroCustos fccCentroCustos) {
		this.fccCentroCustos = fccCentroCustos;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO_VALIDADE", nullable = false, length = 29)
	public Date getDtInicioValidade() {
		return this.dtInicioValidade;
	}

	public void setDtInicioValidade(Date dtInicioValidade) {
		this.dtInicioValidade = dtInicioValidade;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM_VALIDADE", length = 29)
	public Date getDtFimValidade() {
		return this.dtFimValidade;
	}

	public void setDtFimValidade(Date dtFimValidade) {
		this.dtFimValidade = dtFimValidade;
	}

	@Column(name = "QT_CONSUMO", nullable = false, precision = 17, scale = 17)
	public Double getQtConsumo() {
		return this.qtConsumo;
	}

	public void setQtConsumo(Double qtConsumo) {
		this.qtConsumo = qtConsumo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		FCC_CENTRO_CUSTOS("fccCentroCustos"),
		DT_INICIO_VALIDADE("dtInicioValidade"),
		DT_FIM_VALIDADE("dtFimValidade"),
		QT_CONSUMO("qtConsumo"),
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
		if (!(obj instanceof FcuEntrDadoEnergia)) {
			return false;
		}
		FcuEntrDadoEnergia other = (FcuEntrDadoEnergia) obj;
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
