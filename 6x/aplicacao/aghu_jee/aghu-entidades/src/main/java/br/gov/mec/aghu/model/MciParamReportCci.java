package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityCodigo;

/**
 * MciParamReportCci generated by hbm2java
 */
@Entity
@Table(name = "MCI_PARAM_REPORT_CCIS", schema = "AGH")
public class MciParamReportCci extends BaseEntityCodigo<String> implements java.io.Serializable {

	private static final long serialVersionUID = 7814220726430128731L;
	
	private String aplicacaoCodigo;
	private Integer version;
	private RapServidores rapServidores;
	private String indProcedRisco;
	private String indEtiologia;
	private String indGrupoEtiologia;
	private String indTopografiaInfeccao;
	private String indTopografiaProcedimento;
	private String indProcedCirurgico;
	private String indConfCci;
	private String indPeriodo;
	private String indTipoPaciente;
	private String indUnidFuncional;
	private String indInfPaciente;
	private String indSitAtendimento;
	private String indGrupoConvenio;
	private String indAgrupaUnidade;
	private String indTipoNotificacao;
	private Date criadoEm;
	private String indSituacao;
	private Short nroDiasPesquisa;
	private String procedureExecucao;
	private String indFatorPredisponente;
	private String indGrupoMatInfectante;
	private Short nroCopiasSugerido;
	private Set<MciAgrupamentoUnidReport> mciAgrupamentoUnidReportes = new HashSet<MciAgrupamentoUnidReport>(0);
	private Set<MciParamReportUsuario> mciParamReportUsuarioes = new HashSet<MciParamReportUsuario>(0);
	private Set<MciGrpMatInfectanteReport> mciGrpMatInfectanteReportes = new HashSet<MciGrpMatInfectanteReport>(0);
	private Set<MciColunaReportCci> mciColunaReportCcies = new HashSet<MciColunaReportCci>(0);

	public MciParamReportCci() {
	}

	public MciParamReportCci(RapServidores rapServidores, String indProcedRisco, String indEtiologia,
			String indGrupoEtiologia, String indTopografiaInfeccao, String indTopografiaProcedimento, String indProcedCirurgico,
			String indConfCci, String indPeriodo, String indTipoPaciente, String indUnidFuncional, String indInfPaciente,
			String indSitAtendimento, String indGrupoConvenio, String indAgrupaUnidade, String indTipoNotificacao, Date criadoEm,
			String indSituacao, String indFatorPredisponente, String indGrupoMatInfectante, Short nroCopiasSugerido) {
		this.rapServidores = rapServidores;
		this.indProcedRisco = indProcedRisco;
		this.indEtiologia = indEtiologia;
		this.indGrupoEtiologia = indGrupoEtiologia;
		this.indTopografiaInfeccao = indTopografiaInfeccao;
		this.indTopografiaProcedimento = indTopografiaProcedimento;
		this.indProcedCirurgico = indProcedCirurgico;
		this.indConfCci = indConfCci;
		this.indPeriodo = indPeriodo;
		this.indTipoPaciente = indTipoPaciente;
		this.indUnidFuncional = indUnidFuncional;
		this.indInfPaciente = indInfPaciente;
		this.indSitAtendimento = indSitAtendimento;
		this.indGrupoConvenio = indGrupoConvenio;
		this.indAgrupaUnidade = indAgrupaUnidade;
		this.indTipoNotificacao = indTipoNotificacao;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.indFatorPredisponente = indFatorPredisponente;
		this.indGrupoMatInfectante = indGrupoMatInfectante;
		this.nroCopiasSugerido = nroCopiasSugerido;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public MciParamReportCci(RapServidores rapServidores, String indProcedRisco, String indEtiologia,
			String indGrupoEtiologia, String indTopografiaInfeccao, String indTopografiaProcedimento, String indProcedCirurgico,
			String indConfCci, String indPeriodo, String indTipoPaciente, String indUnidFuncional, String indInfPaciente,
			String indSitAtendimento, String indGrupoConvenio, String indAgrupaUnidade, String indTipoNotificacao, Date criadoEm,
			String indSituacao, Short nroDiasPesquisa, String procedureExecucao, String indFatorPredisponente,
			String indGrupoMatInfectante, Short nroCopiasSugerido, Set<MciAgrupamentoUnidReport> mciAgrupamentoUnidReportes,
			Set<MciParamReportUsuario> mciParamReportUsuarioes, Set<MciGrpMatInfectanteReport> mciGrpMatInfectanteReportes,
			Set<MciColunaReportCci> mciColunaReportCcies) {
		this.rapServidores = rapServidores;
		this.indProcedRisco = indProcedRisco;
		this.indEtiologia = indEtiologia;
		this.indGrupoEtiologia = indGrupoEtiologia;
		this.indTopografiaInfeccao = indTopografiaInfeccao;
		this.indTopografiaProcedimento = indTopografiaProcedimento;
		this.indProcedCirurgico = indProcedCirurgico;
		this.indConfCci = indConfCci;
		this.indPeriodo = indPeriodo;
		this.indTipoPaciente = indTipoPaciente;
		this.indUnidFuncional = indUnidFuncional;
		this.indInfPaciente = indInfPaciente;
		this.indSitAtendimento = indSitAtendimento;
		this.indGrupoConvenio = indGrupoConvenio;
		this.indAgrupaUnidade = indAgrupaUnidade;
		this.indTipoNotificacao = indTipoNotificacao;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.nroDiasPesquisa = nroDiasPesquisa;
		this.procedureExecucao = procedureExecucao;
		this.indFatorPredisponente = indFatorPredisponente;
		this.indGrupoMatInfectante = indGrupoMatInfectante;
		this.nroCopiasSugerido = nroCopiasSugerido;
		this.mciAgrupamentoUnidReportes = mciAgrupamentoUnidReportes;
		this.mciParamReportUsuarioes = mciParamReportUsuarioes;
		this.mciGrpMatInfectanteReportes = mciGrpMatInfectanteReportes;
		this.mciColunaReportCcies = mciColunaReportCcies;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "aghAplicacao"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "APLICACAO_CODIGO", unique = true, nullable = false, length = 20)
	@Length(max = 20)
	public String getAplicacaoCodigo() {
		return this.aplicacaoCodigo;
	}

	public void setAplicacaoCodigo(String aplicacaoCodigo) {
		this.aplicacaoCodigo = aplicacaoCodigo;
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

	@Column(name = "IND_PROCED_RISCO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndProcedRisco() {
		return this.indProcedRisco;
	}

	public void setIndProcedRisco(String indProcedRisco) {
		this.indProcedRisco = indProcedRisco;
	}

	@Column(name = "IND_ETIOLOGIA", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndEtiologia() {
		return this.indEtiologia;
	}

	public void setIndEtiologia(String indEtiologia) {
		this.indEtiologia = indEtiologia;
	}

	@Column(name = "IND_GRUPO_ETIOLOGIA", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndGrupoEtiologia() {
		return this.indGrupoEtiologia;
	}

	public void setIndGrupoEtiologia(String indGrupoEtiologia) {
		this.indGrupoEtiologia = indGrupoEtiologia;
	}

	@Column(name = "IND_TOPOGRAFIA_INFECCAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndTopografiaInfeccao() {
		return this.indTopografiaInfeccao;
	}

	public void setIndTopografiaInfeccao(String indTopografiaInfeccao) {
		this.indTopografiaInfeccao = indTopografiaInfeccao;
	}

	@Column(name = "IND_TOPOGRAFIA_PROCEDIMENTO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndTopografiaProcedimento() {
		return this.indTopografiaProcedimento;
	}

	public void setIndTopografiaProcedimento(String indTopografiaProcedimento) {
		this.indTopografiaProcedimento = indTopografiaProcedimento;
	}

	@Column(name = "IND_PROCED_CIRURGICO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndProcedCirurgico() {
		return this.indProcedCirurgico;
	}

	public void setIndProcedCirurgico(String indProcedCirurgico) {
		this.indProcedCirurgico = indProcedCirurgico;
	}

	@Column(name = "IND_CONF_CCI", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndConfCci() {
		return this.indConfCci;
	}

	public void setIndConfCci(String indConfCci) {
		this.indConfCci = indConfCci;
	}

	@Column(name = "IND_PERIODO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndPeriodo() {
		return this.indPeriodo;
	}

	public void setIndPeriodo(String indPeriodo) {
		this.indPeriodo = indPeriodo;
	}

	@Column(name = "IND_TIPO_PACIENTE", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndTipoPaciente() {
		return this.indTipoPaciente;
	}

	public void setIndTipoPaciente(String indTipoPaciente) {
		this.indTipoPaciente = indTipoPaciente;
	}

	@Column(name = "IND_UNID_FUNCIONAL", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndUnidFuncional() {
		return this.indUnidFuncional;
	}

	public void setIndUnidFuncional(String indUnidFuncional) {
		this.indUnidFuncional = indUnidFuncional;
	}

	@Column(name = "IND_INF_PACIENTE", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndInfPaciente() {
		return this.indInfPaciente;
	}

	public void setIndInfPaciente(String indInfPaciente) {
		this.indInfPaciente = indInfPaciente;
	}

	@Column(name = "IND_SIT_ATENDIMENTO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSitAtendimento() {
		return this.indSitAtendimento;
	}

	public void setIndSitAtendimento(String indSitAtendimento) {
		this.indSitAtendimento = indSitAtendimento;
	}

	@Column(name = "IND_GRUPO_CONVENIO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndGrupoConvenio() {
		return this.indGrupoConvenio;
	}

	public void setIndGrupoConvenio(String indGrupoConvenio) {
		this.indGrupoConvenio = indGrupoConvenio;
	}

	@Column(name = "IND_AGRUPA_UNIDADE", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndAgrupaUnidade() {
		return this.indAgrupaUnidade;
	}

	public void setIndAgrupaUnidade(String indAgrupaUnidade) {
		this.indAgrupaUnidade = indAgrupaUnidade;
	}

	@Column(name = "IND_TIPO_NOTIFICACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndTipoNotificacao() {
		return this.indTipoNotificacao;
	}

	public void setIndTipoNotificacao(String indTipoNotificacao) {
		this.indTipoNotificacao = indTipoNotificacao;
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

	@Column(name = "NRO_DIAS_PESQUISA")
	public Short getNroDiasPesquisa() {
		return this.nroDiasPesquisa;
	}

	public void setNroDiasPesquisa(Short nroDiasPesquisa) {
		this.nroDiasPesquisa = nroDiasPesquisa;
	}

	@Column(name = "PROCEDURE_EXECUCAO", length = 30)
	@Length(max = 30)
	public String getProcedureExecucao() {
		return this.procedureExecucao;
	}

	public void setProcedureExecucao(String procedureExecucao) {
		this.procedureExecucao = procedureExecucao;
	}

	@Column(name = "IND_FATOR_PREDISPONENTE", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndFatorPredisponente() {
		return this.indFatorPredisponente;
	}

	public void setIndFatorPredisponente(String indFatorPredisponente) {
		this.indFatorPredisponente = indFatorPredisponente;
	}

	@Column(name = "IND_GRUPO_MAT_INFECTANTE", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndGrupoMatInfectante() {
		return this.indGrupoMatInfectante;
	}

	public void setIndGrupoMatInfectante(String indGrupoMatInfectante) {
		this.indGrupoMatInfectante = indGrupoMatInfectante;
	}

	@Column(name = "NRO_COPIAS_SUGERIDO", nullable = false)
	public Short getNroCopiasSugerido() {
		return this.nroCopiasSugerido;
	}

	public void setNroCopiasSugerido(Short nroCopiasSugerido) {
		this.nroCopiasSugerido = nroCopiasSugerido;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciParamReportCci")
	public Set<MciAgrupamentoUnidReport> getMciAgrupamentoUnidReportes() {
		return this.mciAgrupamentoUnidReportes;
	}

	public void setMciAgrupamentoUnidReportes(Set<MciAgrupamentoUnidReport> mciAgrupamentoUnidReportes) {
		this.mciAgrupamentoUnidReportes = mciAgrupamentoUnidReportes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciParamReportCci")
	public Set<MciParamReportUsuario> getMciParamReportUsuarioes() {
		return this.mciParamReportUsuarioes;
	}

	public void setMciParamReportUsuarioes(Set<MciParamReportUsuario> mciParamReportUsuarioes) {
		this.mciParamReportUsuarioes = mciParamReportUsuarioes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciParamReportCci")
	public Set<MciGrpMatInfectanteReport> getMciGrpMatInfectanteReportes() {
		return this.mciGrpMatInfectanteReportes;
	}

	public void setMciGrpMatInfectanteReportes(Set<MciGrpMatInfectanteReport> mciGrpMatInfectanteReportes) {
		this.mciGrpMatInfectanteReportes = mciGrpMatInfectanteReportes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciParamReportCci")
	public Set<MciColunaReportCci> getMciColunaReportCcies() {
		return this.mciColunaReportCcies;
	}

	public void setMciColunaReportCcies(Set<MciColunaReportCci> mciColunaReportCcies) {
		this.mciColunaReportCcies = mciColunaReportCcies;
	}

	public enum Fields {

		APLICACAO_CODIGO("aplicacaoCodigo"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		IND_PROCED_RISCO("indProcedRisco"),
		IND_ETIOLOGIA("indEtiologia"),
		IND_GRUPO_ETIOLOGIA("indGrupoEtiologia"),
		IND_TOPOGRAFIA_INFECCAO("indTopografiaInfeccao"),
		IND_TOPOGRAFIA_PROCEDIMENTO("indTopografiaProcedimento"),
		IND_PROCED_CIRURGICO("indProcedCirurgico"),
		IND_CONF_CCI("indConfCci"),
		IND_PERIODO("indPeriodo"),
		IND_TIPO_PACIENTE("indTipoPaciente"),
		IND_UNID_FUNCIONAL("indUnidFuncional"),
		IND_INF_PACIENTE("indInfPaciente"),
		IND_SIT_ATENDIMENTO("indSitAtendimento"),
		IND_GRUPO_CONVENIO("indGrupoConvenio"),
		IND_AGRUPA_UNIDADE("indAgrupaUnidade"),
		IND_TIPO_NOTIFICACAO("indTipoNotificacao"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao"),
		NRO_DIAS_PESQUISA("nroDiasPesquisa"),
		PROCEDURE_EXECUCAO("procedureExecucao"),
		IND_FATOR_PREDISPONENTE("indFatorPredisponente"),
		IND_GRUPO_MAT_INFECTANTE("indGrupoMatInfectante"),
		NRO_COPIAS_SUGERIDO("nroCopiasSugerido"),
		MCI_AGRUPAMENTO_UNID_REPORTES("mciAgrupamentoUnidReportes"),
		MCI_PARAM_REPORT_USUARIOES("mciParamReportUsuarioes"),
		MCI_GRP_MAT_INFECTANTE_REPORTES("mciGrpMatInfectanteReportes"),
		MCI_COLUNA_REPORT_CCIES("mciColunaReportCcies");

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
		result = prime * result + ((getAplicacaoCodigo() == null) ? 0 : getAplicacaoCodigo().hashCode());
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
		if (!(obj instanceof MciParamReportCci)) {
			return false;
		}
		MciParamReportCci other = (MciParamReportCci) obj;
		if (getAplicacaoCodigo() == null) {
			if (other.getAplicacaoCodigo() != null) {
				return false;
			}
		} else if (!getAplicacaoCodigo().equals(other.getAplicacaoCodigo())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####
 
 @Transient public String getCodigo(){ return this.getAplicacaoCodigo();} 
 public void setCodigo(String codigo){ this.setAplicacaoCodigo(codigo);}
}
