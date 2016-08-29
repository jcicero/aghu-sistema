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
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MciAgrupamentoUnidReport generated by hbm2java
 */
@Entity
@Table(name = "MCI_AGRUPAMENTO_UNID_REPORTS", schema = "AGH")
public class MciAgrupamentoUnidReport extends BaseEntityId<MciAgrupamentoUnidReportId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4679806881242588401L;
	private MciAgrupamentoUnidReportId id;
	private Integer version;
	private MciParamReportCci mciParamReportCci;
	private RapServidores rapServidores;
	private MciTipoAgrupamentoUnidCci mciTipoAgrupamentoUnidCci;
	private Date criadoEm;
	private String indSituacao;
	private String indUsual;
	private Set<MciParamAgrupUnidCci> mciParamAgrupUnidCcies = new HashSet<MciParamAgrupUnidCci>(0);

	public MciAgrupamentoUnidReport() {
	}

	public MciAgrupamentoUnidReport(MciAgrupamentoUnidReportId id, MciParamReportCci mciParamReportCci,
			RapServidores rapServidores, MciTipoAgrupamentoUnidCci mciTipoAgrupamentoUnidCci, Date criadoEm, String indSituacao) {
		this.id = id;
		this.mciParamReportCci = mciParamReportCci;
		this.rapServidores = rapServidores;
		this.mciTipoAgrupamentoUnidCci = mciTipoAgrupamentoUnidCci;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
	}

	public MciAgrupamentoUnidReport(MciAgrupamentoUnidReportId id, MciParamReportCci mciParamReportCci,
			RapServidores rapServidores, MciTipoAgrupamentoUnidCci mciTipoAgrupamentoUnidCci, Date criadoEm, String indSituacao,
			String indUsual, Set<MciParamAgrupUnidCci> mciParamAgrupUnidCcies) {
		this.id = id;
		this.mciParamReportCci = mciParamReportCci;
		this.rapServidores = rapServidores;
		this.mciTipoAgrupamentoUnidCci = mciTipoAgrupamentoUnidCci;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.indUsual = indUsual;
		this.mciParamAgrupUnidCcies = mciParamAgrupUnidCcies;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "tauSeq", column = @Column(name = "TAU_SEQ", nullable = false)),
			@AttributeOverride(name = "pmcAplicacaoCodigo", column = @Column(name = "PMC_APLICACAO_CODIGO", nullable = false, length = 20)) })
	public MciAgrupamentoUnidReportId getId() {
		return this.id;
	}

	public void setId(MciAgrupamentoUnidReportId id) {
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
	@JoinColumn(name = "PMC_APLICACAO_CODIGO", nullable = false, insertable = false, updatable = false)
	public MciParamReportCci getMciParamReportCci() {
		return this.mciParamReportCci;
	}

	public void setMciParamReportCci(MciParamReportCci mciParamReportCci) {
		this.mciParamReportCci = mciParamReportCci;
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
	@JoinColumn(name = "TAU_SEQ", nullable = false, insertable = false, updatable = false)
	public MciTipoAgrupamentoUnidCci getMciTipoAgrupamentoUnidCci() {
		return this.mciTipoAgrupamentoUnidCci;
	}

	public void setMciTipoAgrupamentoUnidCci(MciTipoAgrupamentoUnidCci mciTipoAgrupamentoUnidCci) {
		this.mciTipoAgrupamentoUnidCci = mciTipoAgrupamentoUnidCci;
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

	@Column(name = "IND_USUAL", length = 1)
	@Length(max = 1)
	public String getIndUsual() {
		return this.indUsual;
	}

	public void setIndUsual(String indUsual) {
		this.indUsual = indUsual;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciAgrupamentoUnidReport")
	public Set<MciParamAgrupUnidCci> getMciParamAgrupUnidCcies() {
		return this.mciParamAgrupUnidCcies;
	}

	public void setMciParamAgrupUnidCcies(Set<MciParamAgrupUnidCci> mciParamAgrupUnidCcies) {
		this.mciParamAgrupUnidCcies = mciParamAgrupUnidCcies;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		MCI_PARAM_REPORT_CCIS("mciParamReportCci"),
		RAP_SERVIDORES("rapServidores"),
		MCI_TIPO_AGRUPAMENTO_UNID_CCIS("mciTipoAgrupamentoUnidCci"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao"),
		IND_USUAL("indUsual"),
		MCI_PARAM_AGRUP_UNID_CCIES("mciParamAgrupUnidCcies");

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
		if (!(obj instanceof MciAgrupamentoUnidReport)) {
			return false;
		}
		MciAgrupamentoUnidReport other = (MciAgrupamentoUnidReport) obj;
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
