package br.gov.mec.aghu.model;

// Generated 17/03/2011 17:16:33 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelExamesMatAnaliseJn generated by hbm2java
 */

@Entity
@SequenceGenerator(name = "aelEmaJnSq1", sequenceName = "AGH.AEL_EMA_JN_SEQ", allocationSize = 1)
@Table(name = "AEL_EXAMES_MAT_ANALISE_JN", schema = "AGH")
@Immutable
public class AelExamesMatAnaliseJn extends BaseJournal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4491180278472661064L;
	private String exaSigla;
	private Integer manSeq;
	private Integer natureza;
	private String indSolicInformaColetas;
	private String indGeraItemPorColetas;
	private String indJejum;
	private String indNpo;
	private String indPreparo;
	private String indDietaDiferenciada;
	private String indSituacao;
	private String indExigeRegiaoAnatomica;
	private String indVerificaMedicacao;
	private String indDependente;
	private String indUsaIntervaloCadastrado;
	private String pertenceSumario;
	private Short intervaloMinTempoSolic;
	private String unidTempoColetaAmostras;
	private Short qtdeDiasValidade;
	private Short tempoMinParaAgenda;
	private Integer serMatriculaAlterado;
	private Short serVinCodigoAlterado;
	private Short tempoJejumNpo;
	private String indTipoTelaLiberaResu;
	private String indCci;
	private String indPertenceContador;
	private String indImpTicketPaciente;
	private String indLimitaSolic;
	private Short tempoLimiteSolic;
	private String unidTempoLimiteSol;
	private Short nroAmostrasSolic;
	private Short nroAmostraDefault;
	private Short nroAmostraTempo;
	private Short tempoLimitePeriodo;
	private String unidTempoLimitePeriodo;
	private Date tempoHoraAmostraDefault;
	private Short tempoDiaAmostraDefault;
	private String indFormaRespiracao;
	private String indPermiteSolicAlta;
	private Short tempoSolicAlta;
	private Short tempoSolicAltaCompl;
	private String indComedi;
	
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelEmaJnSq1")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	public AelExamesMatAnaliseJn() {
	}

	public AelExamesMatAnaliseJn(String exaSigla, Integer manSeq) {
		this.exaSigla = exaSigla;
		this.manSeq = manSeq;
	}
	
	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public AelExamesMatAnaliseJn( 
			String exaSigla, 
			Integer manSeq, 
			Integer natureza,
			String indSolicInformaColetas, 
			String indGeraItemPorColetas,
			String indJejum, 
			String indNpo, 
			String indPreparo,
			String indDietaDiferenciada, 
			String indSituacao,
			String indExigeRegiaoAnatomica, 
			String indVerificaMedicacao,
			String indDependente, 
			String indUsaIntervaloCadastrado,
			String pertenceSumario, 
			Short intervaloMinTempoSolic,
			String unidTempoColetaAmostras, 
			Short qtdeDiasValidade,
			Short tempoMinParaAgenda, 
			Integer serMatriculaAlterado,
			Short serVinCodigoAlterado, 
			Short tempoJejumNpo,
			String indTipoTelaLiberaResu, 
			String indCci,
			String indPertenceContador, 
			String indImpTicketPaciente,
			String indLimitaSolic, 
			Short tempoLimiteSolic,
			String unidTempoLimiteSol, 
			Short nroAmostrasSolic,
			Short nroAmostraDefault, 
			Short nroAmostraTempo,
			Short tempoLimitePeriodo, 
			String unidTempoLimitePeriodo,
			Date tempoHoraAmostraDefault, 
			Short tempoDiaAmostraDefault,
			String indFormaRespiracao, 
			String indPermiteSolicAlta,
			Short tempoSolicAlta, 
			Short tempoSolicAltaCompl, 
			String indComedi) {
		this.exaSigla = exaSigla;
		this.manSeq = manSeq;
		this.natureza = natureza;
		this.indSolicInformaColetas = indSolicInformaColetas;
		this.indGeraItemPorColetas = indGeraItemPorColetas;
		this.indJejum = indJejum;
		this.indNpo = indNpo;
		this.indPreparo = indPreparo;
		this.indDietaDiferenciada = indDietaDiferenciada;
		this.indSituacao = indSituacao;
		this.indExigeRegiaoAnatomica = indExigeRegiaoAnatomica;
		this.indVerificaMedicacao = indVerificaMedicacao;
		this.indDependente = indDependente;
		this.indUsaIntervaloCadastrado = indUsaIntervaloCadastrado;
		this.pertenceSumario = pertenceSumario;
		this.intervaloMinTempoSolic = intervaloMinTempoSolic;
		this.unidTempoColetaAmostras = unidTempoColetaAmostras;
		this.qtdeDiasValidade = qtdeDiasValidade;
		this.tempoMinParaAgenda = tempoMinParaAgenda;
		this.serMatriculaAlterado = serMatriculaAlterado;
		this.serVinCodigoAlterado = serVinCodigoAlterado;
		this.tempoJejumNpo = tempoJejumNpo;
		this.indTipoTelaLiberaResu = indTipoTelaLiberaResu;
		this.indCci = indCci;
		this.indPertenceContador = indPertenceContador;
		this.indImpTicketPaciente = indImpTicketPaciente;
		this.indLimitaSolic = indLimitaSolic;
		this.tempoLimiteSolic = tempoLimiteSolic;
		this.unidTempoLimiteSol = unidTempoLimiteSol;
		this.nroAmostrasSolic = nroAmostrasSolic;
		this.nroAmostraDefault = nroAmostraDefault;
		this.nroAmostraTempo = nroAmostraTempo;
		this.tempoLimitePeriodo = tempoLimitePeriodo;
		this.unidTempoLimitePeriodo = unidTempoLimitePeriodo;
		this.tempoHoraAmostraDefault = tempoHoraAmostraDefault;
		this.tempoDiaAmostraDefault = tempoDiaAmostraDefault;
		this.indFormaRespiracao = indFormaRespiracao;
		this.indPermiteSolicAlta = indPermiteSolicAlta;
		this.tempoSolicAlta = tempoSolicAlta;
		this.tempoSolicAltaCompl = tempoSolicAltaCompl;
		this.indComedi = indComedi;
	}

	@Column(name = "EXA_SIGLA", nullable = false, length = 5)
	public String getExaSigla() {
		return this.exaSigla;
	}

	public void setExaSigla(String exaSigla) {
		this.exaSigla = exaSigla;
	}

	@Column(name = "MAN_SEQ", nullable = false)
	public Integer getManSeq() {
		return this.manSeq;
	}

	public void setManSeq(Integer manSeq) {
		this.manSeq = manSeq;
	}

	@Column(name = "NATUREZA")
	public Integer getNatureza() {
		return this.natureza;
	}

	public void setNatureza(Integer natureza) {
		this.natureza = natureza;
	}

	@Column(name = "IND_SOLIC_INFORMA_COLETAS", length = 1)
	public String getIndSolicInformaColetas() {
		return this.indSolicInformaColetas;
	}

	public void setIndSolicInformaColetas(String indSolicInformaColetas) {
		this.indSolicInformaColetas = indSolicInformaColetas;
	}

	@Column(name = "IND_GERA_ITEM_POR_COLETAS", length = 1)
	public String getIndGeraItemPorColetas() {
		return this.indGeraItemPorColetas;
	}

	public void setIndGeraItemPorColetas(String indGeraItemPorColetas) {
		this.indGeraItemPorColetas = indGeraItemPorColetas;
	}

	@Column(name = "IND_JEJUM", length = 1)
	public String getIndJejum() {
		return this.indJejum;
	}

	public void setIndJejum(String indJejum) {
		this.indJejum = indJejum;
	}

	@Column(name = "IND_NPO", length = 1)
	public String getIndNpo() {
		return this.indNpo;
	}

	public void setIndNpo(String indNpo) {
		this.indNpo = indNpo;
	}

	@Column(name = "IND_PREPARO", length = 1)
	public String getIndPreparo() {
		return this.indPreparo;
	}

	public void setIndPreparo(String indPreparo) {
		this.indPreparo = indPreparo;
	}

	@Column(name = "IND_DIETA_DIFERENCIADA", length = 1)
	public String getIndDietaDiferenciada() {
		return this.indDietaDiferenciada;
	}

	public void setIndDietaDiferenciada(String indDietaDiferenciada) {
		this.indDietaDiferenciada = indDietaDiferenciada;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "IND_EXIGE_REGIAO_ANATOMICA", length = 1)
	public String getIndExigeRegiaoAnatomica() {
		return this.indExigeRegiaoAnatomica;
	}

	public void setIndExigeRegiaoAnatomica(String indExigeRegiaoAnatomica) {
		this.indExigeRegiaoAnatomica = indExigeRegiaoAnatomica;
	}

	@Column(name = "IND_VERIFICA_MEDICACAO", length = 1)
	public String getIndVerificaMedicacao() {
		return this.indVerificaMedicacao;
	}

	public void setIndVerificaMedicacao(String indVerificaMedicacao) {
		this.indVerificaMedicacao = indVerificaMedicacao;
	}

	@Column(name = "IND_DEPENDENTE", length = 1)
	public String getIndDependente() {
		return this.indDependente;
	}

	public void setIndDependente(String indDependente) {
		this.indDependente = indDependente;
	}

	@Column(name = "IND_USA_INTERVALO_CADASTRADO", length = 1)
	public String getIndUsaIntervaloCadastrado() {
		return this.indUsaIntervaloCadastrado;
	}

	public void setIndUsaIntervaloCadastrado(String indUsaIntervaloCadastrado) {
		this.indUsaIntervaloCadastrado = indUsaIntervaloCadastrado;
	}

	@Column(name = "PERTENCE_SUMARIO", length = 1)
	public String getPertenceSumario() {
		return this.pertenceSumario;
	}

	public void setPertenceSumario(String pertenceSumario) {
		this.pertenceSumario = pertenceSumario;
	}

	@Column(name = "INTERVALO_MIN_TEMPO_SOLIC")
	public Short getIntervaloMinTempoSolic() {
		return this.intervaloMinTempoSolic;
	}

	public void setIntervaloMinTempoSolic(Short intervaloMinTempoSolic) {
		this.intervaloMinTempoSolic = intervaloMinTempoSolic;
	}

	@Column(name = "UNID_TEMPO_COLETA_AMOSTRAS", length = 1)
	public String getUnidTempoColetaAmostras() {
		return this.unidTempoColetaAmostras;
	}

	public void setUnidTempoColetaAmostras(String unidTempoColetaAmostras) {
		this.unidTempoColetaAmostras = unidTempoColetaAmostras;
	}

	@Column(name = "QTDE_DIAS_VALIDADE")
	public Short getQtdeDiasValidade() {
		return this.qtdeDiasValidade;
	}

	public void setQtdeDiasValidade(Short qtdeDiasValidade) {
		this.qtdeDiasValidade = qtdeDiasValidade;
	}

	@Column(name = "TEMPO_MIN_PARA_AGENDA")
	public Short getTempoMinParaAgenda() {
		return this.tempoMinParaAgenda;
	}

	public void setTempoMinParaAgenda(Short tempoMinParaAgenda) {
		this.tempoMinParaAgenda = tempoMinParaAgenda;
	}

	@Column(name = "SER_MATRICULA_ALTERADO")
	public Integer getSerMatriculaAlterado() {
		return this.serMatriculaAlterado;
	}

	public void setSerMatriculaAlterado(Integer serMatriculaAlterado) {
		this.serMatriculaAlterado = serMatriculaAlterado;
	}

	@Column(name = "SER_VIN_CODIGO_ALTERADO")
	public Short getSerVinCodigoAlterado() {
		return this.serVinCodigoAlterado;
	}

	public void setSerVinCodigoAlterado(Short serVinCodigoAlterado) {
		this.serVinCodigoAlterado = serVinCodigoAlterado;
	}

	@Column(name = "TEMPO_JEJUM_NPO")
	public Short getTempoJejumNpo() {
		return this.tempoJejumNpo;
	}

	public void setTempoJejumNpo(Short tempoJejumNpo) {
		this.tempoJejumNpo = tempoJejumNpo;
	}

	@Column(name = "IND_TIPO_TELA_LIBERA_RESU", length = 1)
	public String getIndTipoTelaLiberaResu() {
		return this.indTipoTelaLiberaResu;
	}

	public void setIndTipoTelaLiberaResu(String indTipoTelaLiberaResu) {
		this.indTipoTelaLiberaResu = indTipoTelaLiberaResu;
	}

	@Column(name = "IND_CCI", length = 1)
	public String getIndCci() {
		return this.indCci;
	}

	public void setIndCci(String indCci) {
		this.indCci = indCci;
	}

	@Column(name = "IND_PERTENCE_CONTADOR", length = 1)
	public String getIndPertenceContador() {
		return this.indPertenceContador;
	}

	public void setIndPertenceContador(String indPertenceContador) {
		this.indPertenceContador = indPertenceContador;
	}

	@Column(name = "IND_IMP_TICKET_PACIENTE", length = 1)
	public String getIndImpTicketPaciente() {
		return this.indImpTicketPaciente;
	}

	public void setIndImpTicketPaciente(String indImpTicketPaciente) {
		this.indImpTicketPaciente = indImpTicketPaciente;
	}

	@Column(name = "IND_LIMITA_SOLIC", length = 1)
	public String getIndLimitaSolic() {
		return this.indLimitaSolic;
	}

	public void setIndLimitaSolic(String indLimitaSolic) {
		this.indLimitaSolic = indLimitaSolic;
	}

	@Column(name = "TEMPO_LIMITE_SOLIC")
	public Short getTempoLimiteSolic() {
		return this.tempoLimiteSolic;
	}

	public void setTempoLimiteSolic(Short tempoLimiteSolic) {
		this.tempoLimiteSolic = tempoLimiteSolic;
	}

	@Column(name = "UNID_TEMPO_LIMITE_SOL", length = 1)
	public String getUnidTempoLimiteSol() {
		return this.unidTempoLimiteSol;
	}

	public void setUnidTempoLimiteSol(String unidTempoLimiteSol) {
		this.unidTempoLimiteSol = unidTempoLimiteSol;
	}

	@Column(name = "NRO_AMOSTRAS_SOLIC")
	public Short getNroAmostrasSolic() {
		return this.nroAmostrasSolic;
	}

	public void setNroAmostrasSolic(Short nroAmostrasSolic) {
		this.nroAmostrasSolic = nroAmostrasSolic;
	}

	@Column(name = "NRO_AMOSTRA_DEFAULT")
	public Short getNroAmostraDefault() {
		return this.nroAmostraDefault;
	}

	public void setNroAmostraDefault(Short nroAmostraDefault) {
		this.nroAmostraDefault = nroAmostraDefault;
	}

	@Column(name = "NRO_AMOSTRA_TEMPO")
	public Short getNroAmostraTempo() {
		return this.nroAmostraTempo;
	}

	public void setNroAmostraTempo(Short nroAmostraTempo) {
		this.nroAmostraTempo = nroAmostraTempo;
	}

	@Column(name = "TEMPO_LIMITE_PERIODO")
	public Short getTempoLimitePeriodo() {
		return this.tempoLimitePeriodo;
	}

	public void setTempoLimitePeriodo(Short tempoLimitePeriodo) {
		this.tempoLimitePeriodo = tempoLimitePeriodo;
	}

	@Column(name = "UNID_TEMPO_LIMITE_PERIODO", length = 1)
	public String getUnidTempoLimitePeriodo() {
		return this.unidTempoLimitePeriodo;
	}

	public void setUnidTempoLimitePeriodo(String unidTempoLimitePeriodo) {
		this.unidTempoLimitePeriodo = unidTempoLimitePeriodo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TEMPO_HORA_AMOSTRA_DEFAULT", length = 29)
	public Date getTempoHoraAmostraDefault() {
		return this.tempoHoraAmostraDefault;
	}

	public void setTempoHoraAmostraDefault(Date tempoHoraAmostraDefault) {
		this.tempoHoraAmostraDefault = tempoHoraAmostraDefault;
	}

	@Column(name = "TEMPO_DIA_AMOSTRA_DEFAULT")
	public Short getTempoDiaAmostraDefault() {
		return this.tempoDiaAmostraDefault;
	}

	public void setTempoDiaAmostraDefault(Short tempoDiaAmostraDefault) {
		this.tempoDiaAmostraDefault = tempoDiaAmostraDefault;
	}

	@Column(name = "IND_FORMA_RESPIRACAO", length = 1)
	public String getIndFormaRespiracao() {
		return this.indFormaRespiracao;
	}

	public void setIndFormaRespiracao(String indFormaRespiracao) {
		this.indFormaRespiracao = indFormaRespiracao;
	}

	@Column(name = "IND_PERMITE_SOLIC_ALTA", length = 1)
	public String getIndPermiteSolicAlta() {
		return this.indPermiteSolicAlta;
	}

	public void setIndPermiteSolicAlta(String indPermiteSolicAlta) {
		this.indPermiteSolicAlta = indPermiteSolicAlta;
	}

	@Column(name = "TEMPO_SOLIC_ALTA")
	public Short getTempoSolicAlta() {
		return this.tempoSolicAlta;
	}

	public void setTempoSolicAlta(Short tempoSolicAlta) {
		this.tempoSolicAlta = tempoSolicAlta;
	}

	@Column(name = "TEMPO_SOLIC_ALTA_COMPL")
	public Short getTempoSolicAltaCompl() {
		return this.tempoSolicAltaCompl;
	}

	public void setTempoSolicAltaCompl(Short tempoSolicAltaCompl) {
		this.tempoSolicAltaCompl = tempoSolicAltaCompl;
	}

	@Column(name = "IND_COMEDI", length = 1)
	public String getIndComedi() {
		return this.indComedi;
	}

	public void setIndComedi(String indComedi) {
		this.indComedi = indComedi;
	}
	public enum Fields {

		EXA_SIGLA("exaSigla"),
		MAN_SEQ("manSeq"),
		NATUREZA("natureza"),
		IND_SOLIC_INFORMA_COLETAS("indSolicInformaColetas"),
		IND_GERA_ITEM_POR_COLETAS("indGeraItemPorColetas"),
		IND_JEJUM("indJejum"),
		IND_NPO("indNpo"),
		IND_PREPARO("indPreparo"),
		IND_DIETA_DIFERENCIADA("indDietaDiferenciada"),
		IND_SITUACAO("indSituacao"),
		IND_EXIGE_REGIAO_ANATOMICA("indExigeRegiaoAnatomica"),
		IND_VERIFICA_MEDICACAO("indVerificaMedicacao"),
		IND_DEPENDENTE("indDependente"),
		IND_USA_INTERVALO_CADASTRADO("indUsaIntervaloCadastrado"),
		PERTENCE_SUMARIO("pertenceSumario"),
		INTERVALO_MIN_TEMPO_SOLIC("intervaloMinTempoSolic"),
		UNID_TEMPO_COLETA_AMOSTRAS("unidTempoColetaAmostras"),
		QTDE_DIAS_VALIDADE("qtdeDiasValidade"),
		TEMPO_MIN_PARA_AGENDA("tempoMinParaAgenda"),
		SER_MATRICULA_ALTERADO("serMatriculaAlterado"),
		SER_VIN_CODIGO_ALTERADO("serVinCodigoAlterado"),
		TEMPO_JEJUM_NPO("tempoJejumNpo"),
		IND_TIPO_TELA_LIBERA_RESU("indTipoTelaLiberaResu"),
		IND_CCI("indCci"),
		IND_PERTENCE_CONTADOR("indPertenceContador"),
		IND_IMP_TICKET_PACIENTE("indImpTicketPaciente"),
		IND_LIMITA_SOLIC("indLimitaSolic"),
		TEMPO_LIMITE_SOLIC("tempoLimiteSolic"),
		UNID_TEMPO_LIMITE_SOL("unidTempoLimiteSol"),
		NRO_AMOSTRAS_SOLIC("nroAmostrasSolic"),
		NRO_AMOSTRA_DEFAULT("nroAmostraDefault"),
		NRO_AMOSTRA_TEMPO("nroAmostraTempo"),
		TEMPO_LIMITE_PERIODO("tempoLimitePeriodo"),
		UNID_TEMPO_LIMITE_PERIODO("unidTempoLimitePeriodo"),
		TEMPO_HORA_AMOSTRA_DEFAULT("tempoHoraAmostraDefault"),
		TEMPO_DIA_AMOSTRA_DEFAULT("tempoDiaAmostraDefault"),
		IND_FORMA_RESPIRACAO("indFormaRespiracao"),
		IND_PERMITE_SOLIC_ALTA("indPermiteSolicAlta"),
		TEMPO_SOLIC_ALTA("tempoSolicAlta"),
		TEMPO_SOLIC_ALTA_COMPL("tempoSolicAltaCompl"),
		IND_COMEDI("indComedi");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

}