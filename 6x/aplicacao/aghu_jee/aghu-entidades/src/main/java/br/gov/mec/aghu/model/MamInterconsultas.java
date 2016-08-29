package br.gov.mec.aghu.model;

// Generated 07/04/2011 11:11:19 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioAvaliacaoInterconsulta;
import br.gov.mec.aghu.dominio.DominioIndPendenteAmbulatorio;
import br.gov.mec.aghu.dominio.DominioPrioridadeInterconsultas;
import br.gov.mec.aghu.dominio.DominioSituacaoInterconsultasPesquisa;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamInterconsultas generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamIeoSq1", sequenceName="AGH.MAM_IEO_SQ1", allocationSize = 1)
@Table(name = "MAM_INTERCONSULTAS", schema = "AGH")
public class MamInterconsultas extends BaseEntitySeq<Long> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5174524063648169801L;
	private Long seq;
	private Integer version;
	private MamInterconsultas mamInterconsultas;
	private String observacao;
	private Date dthrCriacao;
	private Date dthrValida;
	private Date dthrMvto;
	private Date dthrValidaMvto;
	private AipPacientes paciente;
	private DominioIndPendenteAmbulatorio pendente;
	private AacConsultas consulta;
	private AghEspecialidades especialidade;
	private RapServidores servidorValida; 
	private RapServidores servidorResponsavel; 
	private RapServidores servidor; 
	private RapServidores servidorMarcada; 
	private RapServidores servidorAvisada;	
	private Integer serMatriculaMvto;
	private Short serVinCodigoMvto;
	private Integer serMatriculaValidaMvto;
	private Short serVinCodigoValidaMvto;
	private AghEquipes equipe;
	private String indImpresso;
	private DominioSituacaoInterconsultasPesquisa situacao;
	private AacConsultas consultaMarcada; 
	private AacConsultas consultaRetorno; 
	private Boolean digitado;
	private AghEspecialidades especialidadeAgenda;
	private String observacaoAdicional;
	private AghEspecialidades especialidadeAdm;
	private Date dthrMarcada;
	private Date dthrAvisada;
	private String indUrgente;
	private String indCanceladoObito;
	private DominioAvaliacaoInterconsulta avaliacao;
	private RapServidores servidorAvalia; 
	private Date dthrAvaliacao;
	private String prioridade;
	private String tipoSolicitacao;
	private DominioPrioridadeInterconsultas prioridadeAprovada;
	private String parecerConsultor;
	private Date dthrConhecimentoConsultor;
	private Integer serMatriculaConhecimento;
	private Short serVinCodigoConhecimento;
	private Date dthrVisualizaResposta;
	private RapServidores servidorVisualiza;
	private Date dthrMarcacaoRetorno;
	private RapServidores servidorRetorno;
	private Date dthrAvisaRetorno;
	private RapServidores servidorAvisaRetorno;
	private Integer codigoPaciente;
	private Integer codigoEspecialidadeAdm;
	private VMamPessoaServidores vMamPessoaServidores;
//	private Integer serMatriculaAvisaRetorno;
//	private Short serVinCodigoAvisaRetorno;
	private Set<MamInterconsultas> mamInterconsultases = new HashSet<MamInterconsultas>(
			0);
	
	// O valor deste atributo é montado pela procedure P_MONTA_RESPOSTA
	private String respostaConcatenada; 

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamIeoSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 14, scale = 0)
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@Version
	@Column(name = "VERSION", nullable = false, precision = 9, scale = 0)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IEO_SEQ")
	public MamInterconsultas getMamInterconsultas() {
		return this.mamInterconsultas;
	}

	public void setMamInterconsultas(MamInterconsultas mamInterconsultas) {
		this.mamInterconsultas = mamInterconsultas;
	}

	@Column(name = "OBSERVACAO", nullable = false, length = 1000)
	@Length(max = 1000)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_CRIACAO", nullable = false, length = 7)
	public Date getDthrCriacao() {
		return this.dthrCriacao;
	}

	public void setDthrCriacao(Date dthrCriacao) {
		this.dthrCriacao = dthrCriacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_VALIDA", length = 7)
	public Date getDthrValida() {
		return this.dthrValida;
	}

	public void setDthrValida(Date dthrValida) {
		this.dthrValida = dthrValida;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_MVTO", length = 7)
	public Date getDthrMvto() {
		return this.dthrMvto;
	}

	public void setDthrMvto(Date dthrMvto) {
		this.dthrMvto = dthrMvto;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_VALIDA_MVTO", length = 7)
	public Date getDthrValidaMvto() {
		return this.dthrValidaMvto;
	}

	public void setDthrValidaMvto(Date dthrValidaMvto) {
		this.dthrValidaMvto = dthrValidaMvto;
	}

	@Column(name = "IND_PENDENTE", nullable=false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioIndPendenteAmbulatorio getPendente() {
		return this.pendente;
	}

	public void setPendente(DominioIndPendenteAmbulatorio pendente) {
		this.pendente = pendente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAC_CODIGO")
	public AipPacientes getPaciente() {
		return this.paciente;
	}
	
	@Column(name = "PAC_CODIGO", insertable=false, updatable=false)
	public Integer getCodigoPaciente() {
		return this.codigoPaciente;
	}

	public void setPaciente(AipPacientes paciente) {
		this.paciente = paciente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CON_NUMERO")
	public AacConsultas getConsulta() {
		return this.consulta;
	}

	public void setConsulta(AacConsultas consulta) {
		this.consulta = consulta;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ESP_SEQ")
	public AghEspecialidades getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(AghEspecialidades especialidade) {
		this.especialidade = especialidade;
	}

	@JoinColumns( {
		@JoinColumn(name = "SER_MATRICULA_VALIDA", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO_VALIDA", referencedColumnName = "VIN_CODIGO") }
	)
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	public RapServidores getServidorValida() {
		return servidorValida;
	}

	public void setServidorValida(RapServidores servidorValida) {
		this.servidorValida = servidorValida;
	}
	
	@Column(name = "SER_MATRICULA_MVTO", precision = 7, scale = 0)
	public Integer getSerMatriculaMvto() {
		return this.serMatriculaMvto;
	}

	public void setSerMatriculaMvto(Integer serMatriculaMvto) {
		this.serMatriculaMvto = serMatriculaMvto;
	}

	@Column(name = "SER_VIN_CODIGO_MVTO", precision = 3, scale = 0)
	public Short getSerVinCodigoMvto() {
		return this.serVinCodigoMvto;
	}

	public void setSerVinCodigoMvto(Short serVinCodigoMvto) {
		this.serVinCodigoMvto = serVinCodigoMvto;
	}

	@Column(name = "SER_MATRICULA_VALIDA_MVTO", precision = 7, scale = 0)
	public Integer getSerMatriculaValidaMvto() {
		return this.serMatriculaValidaMvto;
	}

	public void setSerMatriculaValidaMvto(Integer serMatriculaValidaMvto) {
		this.serMatriculaValidaMvto = serMatriculaValidaMvto;
	}

	@Column(name = "SER_VIN_CODIGO_VALIDA_MVTO", precision = 3, scale = 0)
	public Short getSerVinCodigoValidaMvto() {
		return this.serVinCodigoValidaMvto;
	}

	public void setSerVinCodigoValidaMvto(Short serVinCodigoValidaMvto) {
		this.serVinCodigoValidaMvto = serVinCodigoValidaMvto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EQP_SEQ")
	public AghEquipes getEquipe() {
		return this.equipe;
	}

	public void setEquipe(AghEquipes equipe) {
		this.equipe = equipe;
	}

	@Column(name = "IND_IMPRESSO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndImpresso() {
		return this.indImpresso;
	}


	public void setIndImpresso(String indImpresso) {
		this.indImpresso = indImpresso;
	}
		

	@Column(name = "SITUACAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoInterconsultasPesquisa getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacaoInterconsultasPesquisa situacao) {
		this.situacao = situacao;
	}

	@JoinColumn(name = "CON_NUMERO_MARCADA")
	@ManyToOne(fetch = FetchType.LAZY)
	public AacConsultas getConsultaMarcada() {
		return consultaMarcada;
	}

	public void setConsultaMarcada(AacConsultas consultaMarcada) {
		this.consultaMarcada = consultaMarcada;
	}
	
	@Column(name = "IND_DIGITADO", nullable = false, length = 1)
    @org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")       
	public Boolean getDigitado() {
		return this.digitado;
	}

	public void setDigitado(Boolean digitado) {
		this.digitado = digitado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ESP_SEQ_AGENDA")
	public AghEspecialidades getEspecialidadeAgenda() {
		return this.especialidadeAgenda;
	}

	public void setEspecialidadeAgenda(AghEspecialidades especialidadeAgenda) {
		this.especialidadeAgenda = especialidadeAgenda;
	}

	@Column(name = "OBSERVACAO_ADICIONAL", length = 2000)
	@Length(max = 2000)
	public String getObservacaoAdicional() {
		return this.observacaoAdicional;
	}

	public void setObservacaoAdicional(String observacaoAdicional) {
		this.observacaoAdicional = observacaoAdicional;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ESP_SEQ_ADM")
	public AghEspecialidades getEspecialidadeAdm() {
		return this.especialidadeAdm;
	}

	@Column(name = "ESP_SEQ_ADM", insertable=false, updatable=false)
	public Integer getCodigoEspecialidadeAdm() {
		return this.codigoEspecialidadeAdm;
	}
	
	public void setEspecialidadeAdm(AghEspecialidades especialidadeAdm) {
		this.especialidadeAdm = especialidadeAdm;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_MARCADA", length = 7)
	public Date getDthrMarcada() {
		return this.dthrMarcada;
	}

	public void setDthrMarcada(Date dthrMarcada) {
		this.dthrMarcada = dthrMarcada;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_AVISADA", length = 7)
	public Date getDthrAvisada() {
		return this.dthrAvisada;
	}

	public void setDthrAvisada(Date dthrAvisada) {
		this.dthrAvisada = dthrAvisada;
	}

	@Column(name = "IND_URGENTE", length = 1)
	@Length(max = 1)
	public String getIndUrgente() {
		return this.indUrgente;
	}

	public void setIndUrgente(String indUrgente) {
		this.indUrgente = indUrgente;
	}

	@Column(name = "IND_CANCELADO_OBITO", length = 1)
	@Length(max = 1)
	public String getIndCanceladoObito() {
		return this.indCanceladoObito;
	}

	public void setIndCanceladoObito(String indCanceladoObito) {
		this.indCanceladoObito = indCanceladoObito;
	}

	@Column(name = "AVALIACAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioAvaliacaoInterconsulta getAvaliacao() {
		return this.avaliacao;
	}

	public void setAvaliacao(DominioAvaliacaoInterconsulta avaliacao) {
		this.avaliacao = avaliacao;
	}

	@JoinColumns( {
		@JoinColumn(name = "SER_MATRICULA_AVALIA", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO_AVALIA", referencedColumnName = "VIN_CODIGO") }
	)
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	public RapServidores getServidorAvalia() {
		return servidorAvalia;
	}

	public void setServidorAvalia(RapServidores servidorAvalia) {
		this.servidorAvalia = servidorAvalia;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_AVALIACAO", length = 7)
	public Date getDthrAvaliacao() {
		return this.dthrAvaliacao;
	}

	public void setDthrAvaliacao(Date dthrAvaliacao) {
		this.dthrAvaliacao = dthrAvaliacao;
	}

	@Column(name = "PRIORIDADE", length = 1)
	@Length(max = 1)
	public String getPrioridade() {
		return this.prioridade;
	}

	public void setPrioridade(String prioridade) {
		this.prioridade = prioridade;
	}

	@Column(name = "TIPO_SOLICITACAO", length = 1)
	@Length(max = 1)
	public String getTipoSolicitacao() {
		return this.tipoSolicitacao;
	}

	public void setTipoSolicitacao(String tipoSolicitacao) {
		this.tipoSolicitacao = tipoSolicitacao;
	}

	@Column(name = "PRIORIDADE_APROVADA", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioPrioridadeInterconsultas getPrioridadeAprovada() {
		return prioridadeAprovada;
	}

	public void setPrioridadeAprovada(
			DominioPrioridadeInterconsultas prioridadeAprovada) {
		this.prioridadeAprovada = prioridadeAprovada;
	}

	@Column(name = "PARECER_CONSULTOR", length = 4000)
	@Length(max = 4000)
	public String getParecerConsultor() {
		return this.parecerConsultor;
	}

	public void setParecerConsultor(String parecerConsultor) {
		this.parecerConsultor = parecerConsultor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_CONHECIMENTO_CONSULTOR", length = 7)
	public Date getDthrConhecimentoConsultor() {
		return this.dthrConhecimentoConsultor;
	}

	public void setDthrConhecimentoConsultor(Date dthrConhecimentoConsultor) {
		this.dthrConhecimentoConsultor = dthrConhecimentoConsultor;
	}

	@Column(name = "SER_MATRICULA_CONHECIMENTO", precision = 7, scale = 0)
	public Integer getSerMatriculaConhecimento() {
		return this.serMatriculaConhecimento;
	}

	public void setSerMatriculaConhecimento(Integer serMatriculaConhecimento) {
		this.serMatriculaConhecimento = serMatriculaConhecimento;
	}

	@Column(name = "SER_VIN_CODIGO_CONHECIMENTO", precision = 3, scale = 0)
	public Short getSerVinCodigoConhecimento() {
		return this.serVinCodigoConhecimento;
	}

	public void setSerVinCodigoConhecimento(Short serVinCodigoConhecimento) {
		this.serVinCodigoConhecimento = serVinCodigoConhecimento;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_VISUALIZA_RESPOSTA", length = 7)
	public Date getDthrVisualizaResposta() {
		return this.dthrVisualizaResposta;
	}

	public void setDthrVisualizaResposta(Date dthrVisualizaResposta) {
		this.dthrVisualizaResposta = dthrVisualizaResposta;
	}

	@JoinColumn(name = "CON_NUMERO_RETORNO")
	@ManyToOne(fetch = FetchType.LAZY)
	public AacConsultas getConsultaRetorno() {
		return consultaRetorno;
	}

	public void setConsultaRetorno(AacConsultas consultaRetorno) {
		this.consultaRetorno = consultaRetorno;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_MARCACAO_RETORNO", length = 7)
	public Date getDthrMarcacaoRetorno() {
		return this.dthrMarcacaoRetorno;
	}

	public void setDthrMarcacaoRetorno(Date dthrMarcacaoRetorno) {
		this.dthrMarcacaoRetorno = dthrMarcacaoRetorno;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_AVISA_RETORNO", length = 7)
	public Date getDthrAvisaRetorno() {
		return this.dthrAvisaRetorno;
	}

	public void setDthrAvisaRetorno(Date dthrAvisaRetorno) {
		this.dthrAvisaRetorno = dthrAvisaRetorno;
	}
	
	@JoinColumns( {
		@JoinColumn(name = "SER_MATRICULA_AVISA_RETORNO", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO_AVISA_RETORNO", referencedColumnName = "VIN_CODIGO") }
	)
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	public RapServidores getServidorAvisaRetorno() {
		return servidorAvisaRetorno;
	}

	public void setServidorAvisaRetorno(RapServidores servidorAvisaRetorno) {
		this.servidorAvisaRetorno = servidorAvisaRetorno;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mamInterconsultas")
	public Set<MamInterconsultas> getMamInterconsultases() {
		return this.mamInterconsultases;
	}

	public void setMamInterconsultases(
			Set<MamInterconsultas> mamInterconsultases) {
		this.mamInterconsultases = mamInterconsultases;
	}
	
	@JoinColumns( {
		@JoinColumn(name = "SER_MATRICULA_RESPONSAVEL", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO_RESPONSAVEL", referencedColumnName = "VIN_CODIGO") }
	)
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	public RapServidores getServidorResponsavel() {
		return servidorResponsavel;
	}

	public void setServidorResponsavel(RapServidores servidorResponsavel) {
		this.servidorResponsavel = servidorResponsavel;
	}

	@JoinColumns( {
		@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") }
	)
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@JoinColumns( {
		@JoinColumn(name = "SER_MATRICULA_MARCADA", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO_MARCADA", referencedColumnName = "VIN_CODIGO") }
	)
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	public RapServidores getServidorMarcada() {
		return servidorMarcada;
	}

	public void setServidorMarcada(RapServidores servidorMarcada) {
		this.servidorMarcada = servidorMarcada;
	}

	@JoinColumns( {
		@JoinColumn(name = "SER_MATRICULA_AVISADA", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO_AVISADA", referencedColumnName = "VIN_CODIGO") }
	)
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	public RapServidores getServidorAvisada() {
		return servidorAvisada;
	}
	
	@JoinColumns( {
		@JoinColumn(name = "SER_MATRICULA_RETORNO", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO_RETORNO", referencedColumnName = "VIN_CODIGO") }
	)
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	public RapServidores getServidorRetorno() {
		return servidorRetorno;
	}

	public void setServidorRetorno(RapServidores servidorRetorno) {
		this.servidorRetorno = servidorRetorno;
	}

	public void setServidorAvisada(RapServidores servidorAvisada) {
		this.servidorAvisada = servidorAvisada;
	}
	
	@JoinColumns( {
		@JoinColumn(name = "SER_MATRICULA_VISUALIZA", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO_VISUALIZA", referencedColumnName = "VIN_CODIGO") }
	)
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	public RapServidores getServidorVisualiza() {
		return servidorVisualiza;
	}

	public void setServidorVisualiza(RapServidores servidorVisualiza) {
		this.servidorVisualiza = servidorVisualiza;
	}
	
	public enum Fields {
		CONSULTA("consulta"),CON_NUMERO("consulta.numero"),ESPECIALIDADE_ADM("especialidadeAdm"), ESP_SEQ_ADM("especialidadeAdm.seq"),DTHR_VALIDA("dthrValida"),
		PACIENTE("paciente"), PACIENTE_CODIGO("codigoPaciente"), ESPECIALIDADE_ADM_CODIGO("codigoEspecialidadeAdm"), SITUACAO("situacao"),PENDENTE("pendente"), IND_DIGITADO("digitado"), SEQ("seq"),
		SERVIDOR_VALIDA("servidorValida"), 
		SERVIDOR_AVALIA("servidorAvalia"), 
		SERVIDOR_RESPONSAVEL("servidorResponsavel"), 
		SERVIDOR_RESPONSAVEL_MATRICULA("servidorResponsavel.id.matricula"), 
		SERVIDOR_RESPONSAVEL_VINCODIGO("servidorResponsavel.id.vinCodigo"), 
		SERVIDOR("servidor"),
		IND_IMPRESSO("indImpresso"),
		SERVIDOR_MARCADA("servidorMarcada"), 
		SERVIDOR_AVISADA("servidorAvisada"), 
		ESPECIALIDADE("especialidade"), 
		ESPECIALIDADE_SEQ("especialidade.seq"), 
		ESPECIALIDADE_SIGLA("especialidade.sigla"),  
		ESPECIALIDADE_AGENDA("especialidadeAgenda"), 
		EQUIPE("equipe"), 
		EQUIPE_SEQ("equipe.seq"), 
		DTHR_MOVIMENTO("dthrValidaMvto"), 
		CONSULTA_MARCADA("consultaMarcada"), 
		CONSULTA_MARCADA_NUMERO("consultaMarcada.numero"), 
		CONSULTA_RETORNO("consultaRetorno"), 
		CONSULTA_RETORNO_NUMERO("consultaRetorno.numero"), 
		DTHR_CRIACAO("dthrCriacao"),
		AVALIACAO("avaliacao"),
		DTHR_AVISA_RETORNO("dthrAvisaRetorno"),
		PRIORIDADE_APROVADA("prioridadeAprovada"),
		UNIDADE_FUNCIONAL_SIGLA("consulta.gradeAgendamenConsulta.unidadeFuncional.sigla"),
		SERVIDOR_RETORNO("servidorRetorno"),
		SERVIDOR_VISUALIZA("servidorVisualiza"),
		VMAM_PESSOAS_SERVIDORES("vMamPessoaServidores"),
		IND_URGENTE("indUrgente"),
		OBSERVACAO("observacao"),
		OBSERVACAO_ADICIONAL("observacaoAdicional")
		;

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}

	@Transient
	public String getRespostaConcatenada() {
		return respostaConcatenada;
	}

	public void setRespostaConcatenada(String respostaConcatenada) {
		this.respostaConcatenada = respostaConcatenada;
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
		if (!(obj instanceof MamInterconsultas)) {
			return false;
		}
		MamInterconsultas other = (MamInterconsultas) obj;
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

	public void setCodigoPaciente(Integer codigoPaciente) {
		this.codigoPaciente = codigoPaciente;
	}

	public void setCodigoEspecialidadeAdm(Integer codigoEspecialidadeAdm) {
		this.codigoEspecialidadeAdm = codigoEspecialidadeAdm;
	}

	@JoinColumns( {
		@JoinColumn(name = "SER_MATRICULA_RESPONSAVEL", referencedColumnName = "MATRICULA",insertable=false,updatable=false),
		@JoinColumn(name = "SER_VIN_CODIGO_RESPONSAVEL", referencedColumnName = "VIN_CODIGO",insertable=false,updatable=false) }
	)
	@ManyToOne(fetch = FetchType.LAZY)
	public VMamPessoaServidores getvMamPessoaServidores() {
		return vMamPessoaServidores;
	}

	public void setvMamPessoaServidores(VMamPessoaServidores vMamPessoaServidores) {
		this.vMamPessoaServidores = vMamPessoaServidores;
	}

}
