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
 * FcuEntrDadoManutGeral generated by hbm2java
 */
@Entity
@SequenceGenerator(name="fcuEmgSq1", sequenceName="AGH.FCU_EMG_SQ1", allocationSize = 1)
@Table(name = "FCU_ENTR_DADOS_MANUT_GERAL", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = { "dt_competencia",
		"cct_codigo" }))
public class FcuEntrDadoManutGeral extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7384694595515106230L;
	private Integer seq;
	private Integer version;
	private RapServidores rapServidores;
	private FccCentroCustos fccCentroCustos;
	private Date dtCompetencia;
	private Integer qtOrdens;
	private Date criadoEm;
	private String indProcessoMensal;

	public FcuEntrDadoManutGeral() {
	}

	public FcuEntrDadoManutGeral(Integer seq, RapServidores rapServidores, FccCentroCustos fccCentroCustos, Date dtCompetencia,
			Integer qtOrdens, Date criadoEm) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.fccCentroCustos = fccCentroCustos;
		this.dtCompetencia = dtCompetencia;
		this.qtOrdens = qtOrdens;
		this.criadoEm = criadoEm;
	}

	public FcuEntrDadoManutGeral(Integer seq, RapServidores rapServidores, FccCentroCustos fccCentroCustos, Date dtCompetencia,
			Integer qtOrdens, Date criadoEm, String indProcessoMensal) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.fccCentroCustos = fccCentroCustos;
		this.dtCompetencia = dtCompetencia;
		this.qtOrdens = qtOrdens;
		this.criadoEm = criadoEm;
		this.indProcessoMensal = indProcessoMensal;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "fcuEmgSq1")
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
	@Column(name = "DT_COMPETENCIA", nullable = false, length = 29)
	public Date getDtCompetencia() {
		return this.dtCompetencia;
	}

	public void setDtCompetencia(Date dtCompetencia) {
		this.dtCompetencia = dtCompetencia;
	}

	@Column(name = "QT_ORDENS", nullable = false)
	public Integer getQtOrdens() {
		return this.qtOrdens;
	}

	public void setQtOrdens(Integer qtOrdens) {
		this.qtOrdens = qtOrdens;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_PROCESSO_MENSAL", length = 1)
	@Length(max = 1)
	public String getIndProcessoMensal() {
		return this.indProcessoMensal;
	}

	public void setIndProcessoMensal(String indProcessoMensal) {
		this.indProcessoMensal = indProcessoMensal;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		FCC_CENTRO_CUSTOS("fccCentroCustos"),
		DT_COMPETENCIA("dtCompetencia"),
		QT_ORDENS("qtOrdens"),
		CRIADO_EM("criadoEm"),
		IND_PROCESSO_MENSAL("indProcessoMensal");

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
		if (!(obj instanceof FcuEntrDadoManutGeral)) {
			return false;
		}
		FcuEntrDadoManutGeral other = (FcuEntrDadoManutGeral) obj;
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
