package br.gov.mec.aghu.model;

// Generated 08/02/2010 17:25:25 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioModuloFatContaApac;
import br.gov.mec.aghu.dominio.DominioSituacaoContaApac;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * @autor rodrigo.saraujo
 * #42229 Incluido para migrar P4 - RN_ATMP_VER_APAC_AUT
 */
@Entity
@Table(name = "FAT_CONTA_APACS", schema = "HIST")
public class FatContaApacsHist extends BaseEntityId<FatContaApacId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7670264598225172629L;
	/**
	 * 
	 */
	
	private FatContaApacId id;
	private AacAtendimentoApacs aacAtendimentoApacs;
	private FatContaApac fatContaApacsByFatCapCapFk1;
	private FatContaApac fatContaApacsByFatCapCapFk2;
	private String capType;
	private Date dtInicioValidade;
	private Date dtFimValidade;
	private String indTipoApac;
	private Date dtEmissao;
	private DominioSituacaoContaApac indSituacao;
	private String indTransplante;
	private String indMetastase;
	private BigDecimal creatinina;
	private Short camposPlanejados;
	private BigDecimal ureiaAntes;
	private Short ciclosPrevistos;
	private BigDecimal ureiaDepois;
	private String hepatitec;
	private Date dtProcessamento;
	private String hepatiteb;
	private Date dtObitoAlta;
	private String hiv;
	private String hla;
	private Date cpeDtHrInicio;
	private DominioModuloFatContaApac cpeModulo;
	private Byte cpeMes;
	private Short cpeAno;
	private Byte mcaSeq;
	private AipPacientes paciente;
	private AipPacientesHist pacienteHist;
	private Integer cidSeq;
	private Integer cidSeqSecundario;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Byte etmSeq;
	private Byte ftrSeq;
	private String criadoPor;
	private Date criadoEm;
	private String alteradoPor;
	private Date alteradoEm;
	private String cpeModuloCompl;
	private Byte cpeMesCompl;
	private Short cpeAnoCompl;
	private Date cpeDtHrInicioCompl;
	private String indResultApac;
	private Short camposPlanejadosReal;
	private String indCtrlFrequencia;
	private String indImpresso;
	private Set<FatContaApac> fatContaApacsesForFatCapCapFk2 = new HashSet<FatContaApac>(
			0);
	private Set<FatContaApac> fatContaApacsesForFatCapCapFk1 = new HashSet<FatContaApac>(
			0);

	public FatContaApacsHist() {
	}

	public FatContaApacsHist(FatContaApacId id,
			AacAtendimentoApacs aacAtendimentoApacs, String capType,
			Date dtInicioValidade, String indTipoApac, DominioSituacaoContaApac indSituacao,
			Date cpeDtHrInicio, DominioModuloFatContaApac cpeModulo, Byte cpeMes, Short cpeAno,
			Byte mcaSeq, AipPacientes paciente, Integer cidSeq, Integer serMatricula,
			Short serVinCodigo, String criadoPor, Date criadoEm,
			String indCtrlFrequencia, String indImpresso) {
		this.id = id;
		this.aacAtendimentoApacs = aacAtendimentoApacs;
		this.capType = capType;
		this.dtInicioValidade = dtInicioValidade;
		this.indTipoApac = indTipoApac;
		this.indSituacao = indSituacao;
		this.cpeDtHrInicio = cpeDtHrInicio;
		this.cpeModulo = cpeModulo;
		this.cpeMes = cpeMes;
		this.cpeAno = cpeAno;
		this.mcaSeq = mcaSeq;
		this.paciente = paciente;
		this.cidSeq = cidSeq;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.criadoPor = criadoPor;
		this.criadoEm = criadoEm;
		this.indCtrlFrequencia = indCtrlFrequencia;
		this.indImpresso = indImpresso;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "atmNumero", column = @Column(name = "ATM_NUMERO", nullable = false, precision = 13, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 2, scale = 0)) })
	public FatContaApacId getId() {
		return this.id;
	}

	public void setId(FatContaApacId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATM_NUMERO", nullable = false, insertable = false, updatable = false)
	public AacAtendimentoApacs getAacAtendimentoApacs() {
		return this.aacAtendimentoApacs;
	}

	public void setAacAtendimentoApacs(AacAtendimentoApacs aacAtendimentoApacs) {
		this.aacAtendimentoApacs = aacAtendimentoApacs;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "CAP_ATM_NUMERO_REAPRESENTA", referencedColumnName = "ATM_NUMERO"),
			@JoinColumn(name = "CAP_SEQP_REAPRESENTA", referencedColumnName = "SEQP") })
	public FatContaApac getFatContaApacsByFatCapCapFk1() {
		return this.fatContaApacsByFatCapCapFk1;
	}

	public void setFatContaApacsByFatCapCapFk1(
			FatContaApac fatContaApacsByFatCapCapFk1) {
		this.fatContaApacsByFatCapCapFk1 = fatContaApacsByFatCapCapFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "CAP_ATM_NUMERO", referencedColumnName = "ATM_NUMERO"),
			@JoinColumn(name = "CAP_SEQP", referencedColumnName = "SEQP") })
	public FatContaApac getFatContaApacsByFatCapCapFk2() {
		return this.fatContaApacsByFatCapCapFk2;
	}

	public void setFatContaApacsByFatCapCapFk2(
			FatContaApac fatContaApacsByFatCapCapFk2) {
		this.fatContaApacsByFatCapCapFk2 = fatContaApacsByFatCapCapFk2;
	}

	@Column(name = "CAP_TYPE", nullable = false, length = 10)
	@Length(max = 10)
	public String getCapType() {
		return this.capType;
	}

	public void setCapType(String capType) {
		this.capType = capType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO_VALIDADE", nullable = false, length = 7)
	public Date getDtInicioValidade() {
		return this.dtInicioValidade;
	}

	public void setDtInicioValidade(Date dtInicioValidade) {
		this.dtInicioValidade = dtInicioValidade;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM_VALIDADE", length = 7)
	public Date getDtFimValidade() {
		return this.dtFimValidade;
	}

	public void setDtFimValidade(Date dtFimValidade) {
		this.dtFimValidade = dtFimValidade;
	}

	@Column(name = "IND_TIPO_APAC", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndTipoApac() {
		return this.indTipoApac;
	}

	public void setIndTipoApac(String indTipoApac) {
		this.indTipoApac = indTipoApac;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_EMISSAO", length = 7)
	public Date getDtEmissao() {
		return this.dtEmissao;
	}

	public void setDtEmissao(Date dtEmissao) {
		this.dtEmissao = dtEmissao;
	}

	
	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoContaApac getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacaoContaApac indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "IND_TRANSPLANTE", length = 1)
	@Length(max = 1)
	public String getIndTransplante() {
		return this.indTransplante;
	}

	public void setIndTransplante(String indTransplante) {
		this.indTransplante = indTransplante;
	}

	@Column(name = "IND_METASTASE", length = 1)
	@Length(max = 1)
	public String getIndMetastase() {
		return this.indMetastase;
	}

	public void setIndMetastase(String indMetastase) {
		this.indMetastase = indMetastase;
	}

	@Column(name = "CREATININA", precision = 8)
	public BigDecimal getCreatinina() {
		return this.creatinina;
	}

	public void setCreatinina(BigDecimal creatinina) {
		this.creatinina = creatinina;
	}

	@Column(name = "CAMPOS_PLANEJADOS", precision = 3, scale = 0)
	public Short getCamposPlanejados() {
		return this.camposPlanejados;
	}

	public void setCamposPlanejados(Short camposPlanejados) {
		this.camposPlanejados = camposPlanejados;
	}

	@Column(name = "UREIA_ANTES", precision = 4, scale = 1)
	public BigDecimal getUreiaAntes() {
		return this.ureiaAntes;
	}

	public void setUreiaAntes(BigDecimal ureiaAntes) {
		this.ureiaAntes = ureiaAntes;
	}

	@Column(name = "CICLOS_PREVISTOS", precision = 3, scale = 0)
	public Short getCiclosPrevistos() {
		return this.ciclosPrevistos;
	}

	public void setCiclosPrevistos(Short ciclosPrevistos) {
		this.ciclosPrevistos = ciclosPrevistos;
	}

	@Column(name = "UREIA_DEPOIS", precision = 4, scale = 1)
	public BigDecimal getUreiaDepois() {
		return this.ureiaDepois;
	}

	public void setUreiaDepois(BigDecimal ureiaDepois) {
		this.ureiaDepois = ureiaDepois;
	}

	@Column(name = "HEPATITEC", length = 1)
	@Length(max = 1)
	public String getHepatitec() {
		return this.hepatitec;
	}

	public void setHepatitec(String hepatitec) {
		this.hepatitec = hepatitec;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_PROCESSAMENTO", length = 7)
	public Date getDtProcessamento() {
		return this.dtProcessamento;
	}

	public void setDtProcessamento(Date dtProcessamento) {
		this.dtProcessamento = dtProcessamento;
	}

	@Column(name = "HEPATITEB", length = 1)
	@Length(max = 1)
	public String getHepatiteb() {
		return this.hepatiteb;
	}

	public void setHepatiteb(String hepatiteb) {
		this.hepatiteb = hepatiteb;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_OBITO_ALTA", length = 7)
	public Date getDtObitoAlta() {
		return this.dtObitoAlta;
	}

	public void setDtObitoAlta(Date dtObitoAlta) {
		this.dtObitoAlta = dtObitoAlta;
	}

	@Column(name = "HIV", length = 1)
	@Length(max = 1)
	public String getHiv() {
		return this.hiv;
	}

	public void setHiv(String hiv) {
		this.hiv = hiv;
	}

	@Column(name = "HLA", length = 1)
	@Length(max = 1)
	public String getHla() {
		return this.hla;
	}

	public void setHla(String hla) {
		this.hla = hla;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CPE_DT_HR_INICIO", nullable = false, length = 7)
	public Date getCpeDtHrInicio() {
		return this.cpeDtHrInicio;
	}

	public void setCpeDtHrInicio(Date cpeDtHrInicio) {
		this.cpeDtHrInicio = cpeDtHrInicio;
	}

	@Column(name = "CPE_MODULO", nullable = false, length = 4)
	@Enumerated(EnumType.STRING)
	public DominioModuloFatContaApac getCpeModulo() {
		return this.cpeModulo;
	}

	public void setCpeModulo(DominioModuloFatContaApac cpeModulo) {
		this.cpeModulo = cpeModulo;
	}

	@Column(name = "CPE_MES", nullable = false, precision = 2, scale = 0)
	public Byte getCpeMes() {
		return this.cpeMes;
	}

	public void setCpeMes(Byte cpeMes) {
		this.cpeMes = cpeMes;
	}

	@Column(name = "CPE_ANO", nullable = false, precision = 4, scale = 0)
	public Short getCpeAno() {
		return this.cpeAno;
	}

	public void setCpeAno(Short cpeAno) {
		this.cpeAno = cpeAno;
	}

	@Column(name = "MCA_SEQ", nullable = false, precision = 2, scale = 0)
	public Byte getMcaSeq() {
		return this.mcaSeq;
	}

	public void setMcaSeq(Byte mcaSeq) {
		this.mcaSeq = mcaSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "PAC_CODIGO", nullable = false, referencedColumnName = "CODIGO")
	public AipPacientes getPaciente() {
		return this.paciente;
	}

	public void setPaciente(AipPacientes paciente) {
		this.paciente = paciente;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAC_CODIGO", nullable = true, referencedColumnName = "CODIGO", updatable=false, insertable=false)
	public AipPacientesHist getPacienteHist() {
		return pacienteHist;
	}

	public void setPacienteHist(AipPacientesHist pacienteHist) {
		this.pacienteHist = pacienteHist;
	}

	@Column(name = "CID_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getCidSeq() {
		return this.cidSeq;
	}

	public void setCidSeq(Integer cidSeq) {
		this.cidSeq = cidSeq;
	}

	@Column(name = "CID_SEQ_SECUNDARIO", precision = 5, scale = 0)
	public Integer getCidSeqSecundario() {
		return this.cidSeqSecundario;
	}

	public void setCidSeqSecundario(Integer cidSeqSecundario) {
		this.cidSeqSecundario = cidSeqSecundario;
	}

	@Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "ETM_SEQ", precision = 2, scale = 0)
	public Byte getEtmSeq() {
		return this.etmSeq;
	}

	public void setEtmSeq(Byte etmSeq) {
		this.etmSeq = etmSeq;
	}

	@Column(name = "FTR_SEQ", precision = 2, scale = 0)
	public Byte getFtrSeq() {
		return this.ftrSeq;
	}

	public void setFtrSeq(Byte ftrSeq) {
		this.ftrSeq = ftrSeq;
	}

	@Column(name = "CRIADO_POR", nullable = false, length = 30)
	@Length(max = 30)
	public String getCriadoPor() {
		return this.criadoPor;
	}

	public void setCriadoPor(String criadoPor) {
		this.criadoPor = criadoPor;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "ALTERADO_POR", length = 30)
	@Length(max = 30)
	public String getAlteradoPor() {
		return this.alteradoPor;
	}

	public void setAlteradoPor(String alteradoPor) {
		this.alteradoPor = alteradoPor;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "CPE_MODULO_COMPL", length = 4)
	@Length(max = 4)
	public String getCpeModuloCompl() {
		return this.cpeModuloCompl;
	}

	public void setCpeModuloCompl(String cpeModuloCompl) {
		this.cpeModuloCompl = cpeModuloCompl;
	}

	@Column(name = "CPE_MES_COMPL", precision = 2, scale = 0)
	public Byte getCpeMesCompl() {
		return this.cpeMesCompl;
	}

	public void setCpeMesCompl(Byte cpeMesCompl) {
		this.cpeMesCompl = cpeMesCompl;
	}

	@Column(name = "CPE_ANO_COMPL", precision = 4, scale = 0)
	public Short getCpeAnoCompl() {
		return this.cpeAnoCompl;
	}

	public void setCpeAnoCompl(Short cpeAnoCompl) {
		this.cpeAnoCompl = cpeAnoCompl;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CPE_DT_HR_INICIO_COMPL", length = 7)
	public Date getCpeDtHrInicioCompl() {
		return this.cpeDtHrInicioCompl;
	}

	public void setCpeDtHrInicioCompl(Date cpeDtHrInicioCompl) {
		this.cpeDtHrInicioCompl = cpeDtHrInicioCompl;
	}

	@Column(name = "IND_RESULT_APAC", length = 1)
	@Length(max = 1)
	public String getIndResultApac() {
		return this.indResultApac;
	}

	public void setIndResultApac(String indResultApac) {
		this.indResultApac = indResultApac;
	}

	@Column(name = "CAMPOS_PLANEJADOS_REAL", precision = 4, scale = 0)
	public Short getCamposPlanejadosReal() {
		return this.camposPlanejadosReal;
	}

	public void setCamposPlanejadosReal(Short camposPlanejadosReal) {
		this.camposPlanejadosReal = camposPlanejadosReal;
	}

	@Column(name = "IND_CTRL_FREQUENCIA", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndCtrlFrequencia() {
		return this.indCtrlFrequencia;
	}

	public void setIndCtrlFrequencia(String indCtrlFrequencia) {
		this.indCtrlFrequencia = indCtrlFrequencia;
	}

	@Column(name = "IND_IMPRESSO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndImpresso() {
		return this.indImpresso;
	}

	public void setIndImpresso(String indImpresso) {
		this.indImpresso = indImpresso;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatContaApacsByFatCapCapFk2")
	public Set<FatContaApac> getFatContaApacsesForFatCapCapFk2() {
		return this.fatContaApacsesForFatCapCapFk2;
	}

	public void setFatContaApacsesForFatCapCapFk2(
			Set<FatContaApac> fatContaApacsesForFatCapCapFk2) {
		this.fatContaApacsesForFatCapCapFk2 = fatContaApacsesForFatCapCapFk2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatContaApacsByFatCapCapFk1")
	public Set<FatContaApac> getFatContaApacsesForFatCapCapFk1() {
		return this.fatContaApacsesForFatCapCapFk1;
	}

	public void setFatContaApacsesForFatCapCapFk1(
			Set<FatContaApac> fatContaApacsesForFatCapCapFk1) {
		this.fatContaApacsesForFatCapCapFk1 = fatContaApacsesForFatCapCapFk1;
	}
	
	public enum Fields {
		COD_PACIENTE("paciente.codigo"),
		PACIENTE("paciente"),
		PACIENTE_HIST("pacienteHist"),
		DT_INICIO_VALIDADE("dtInicioValidade"),
		DT_FIM_VALIDADE("dtFimValidade"),
		AAC_ATENDIMENTO_APACS("aacAtendimentoApacs"),
		IND_SITUACAO("indSituacao"),
		CPE_MODULO("cpeModulo"),
		CPE_DTHR_INICIO("cpeDtHrInicio"),
		CPE_MES("cpeMes"),
		CPE_ANO("cpeAno"),
		ATM_CODIGO("id.atmNumero"),
		SEQP("id.seqp"),
		DT_OBITO_ALTA("dtObitoAlta"),
		IND_CTRL_FREQUENCIA("indCtrlFrequencia"),
		CAP_TYPE("capType"),
		;
		
		
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
		if (!(obj instanceof FatContaApacsHist)) {
			return false;
		}
		FatContaApacsHist other = (FatContaApacsHist) obj;
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
