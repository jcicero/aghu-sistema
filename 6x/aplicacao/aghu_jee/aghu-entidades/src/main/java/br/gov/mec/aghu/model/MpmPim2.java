package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;
import java.util.Date;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.gov.mec.aghu.dominio.DominioDiagAltoRisco;
import br.gov.mec.aghu.dominio.DominioDiagBaixoRisco;
import br.gov.mec.aghu.dominio.DominioSimNao;
import br.gov.mec.aghu.dominio.DominioSituacaoPim2;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MpmPim2 generated by hbm2java
 */
@SuppressWarnings({"PMD.AghuUsoIndevidoDaEnumDominioSimNaoEntity"})
@Entity
@Table(name = "MPM_PIM2", schema = "AGH")
@SequenceGenerator(name="mpmpm2sq1", sequenceName="AGH.MPM_PM2_SQ1", allocationSize = 1)
public class MpmPim2 extends BaseEntitySeq<Long> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2728776247080970208L;
	private Long seq;
	private DominioSimNao admissaoEletiva;
	private DominioSimNao admissaoRecuperaCirProc;
	private DominioSimNao admissaoPosBypass;
	private DominioDiagAltoRisco diagAltoRisco;
	private DominioDiagBaixoRisco diagBaixoRisco;
	private DominioSimNao faltaRespostaPupilar;
	private BigDecimal excessoBase;
	private BigDecimal pao2;
	private BigDecimal fio2;
	private Short pressaoSistolica;
	private DominioSimNao ventilacaoMecanica;
	private Date dthrRealizacao;
	private Date dthrIngressoUnidade;
	private BigDecimal escorePim2;
	private BigDecimal probabilidadeMorte;
	private DominioSituacaoPim2 situacao;
	private Date criadoEm;
	private AghAtendimentos atendimento;
	private RapServidores servidor;

	public MpmPim2() {
	}

	public MpmPim2(Long seq, Date dthrIngressoUnidade, DominioSituacaoPim2 situacao,
			Date criadoEm, AghAtendimentos atendimento) {
		this.seq = seq;
		this.dthrIngressoUnidade = dthrIngressoUnidade;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.atendimento = atendimento;
	}

	public MpmPim2(Long seq, DominioSimNao admissaoEletiva,
			DominioSimNao admissaoRecuperaCirProc, DominioSimNao admissaoPosBypass,
			DominioDiagAltoRisco diagAltoRisco, DominioDiagBaixoRisco diagBaixoRisco,
			DominioSimNao faltaRespostaPupilar, BigDecimal excessoBase,
			BigDecimal pao2, BigDecimal fio2, Short pressaoSistolica,
			DominioSimNao ventilacaoMecanica, Date dthrRealizacao,
			Date dthrIngressoUnidade, BigDecimal escorePim2,
			BigDecimal probabilidadeMorte, DominioSituacaoPim2 situacao, Date criadoEm,
			AghAtendimentos atendimento) {
		this.seq = seq;
		this.admissaoEletiva = admissaoEletiva;
		this.admissaoRecuperaCirProc = admissaoRecuperaCirProc;
		this.admissaoPosBypass = admissaoPosBypass;
		this.diagAltoRisco = diagAltoRisco;
		this.diagBaixoRisco = diagBaixoRisco;
		this.faltaRespostaPupilar = faltaRespostaPupilar;
		this.excessoBase = excessoBase;
		this.pao2 = pao2;
		this.fio2 = fio2;
		this.pressaoSistolica = pressaoSistolica;
		this.ventilacaoMecanica = ventilacaoMecanica;
		this.dthrRealizacao = dthrRealizacao;
		this.dthrIngressoUnidade = dthrIngressoUnidade;
		this.escorePim2 = escorePim2;
		this.probabilidadeMorte = probabilidadeMorte;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.atendimento = atendimento;
	}

	@Id
	@Column(name = "SEQ", unique = true, nullable = false, precision = 10, scale = 0)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mpmpm2sq1")
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@Column(name = "ADMISSAO_ELETIVA", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getAdmissaoEletiva() {
		return this.admissaoEletiva;
	}

	public void setAdmissaoEletiva(DominioSimNao admissaoEletiva) {
		this.admissaoEletiva = admissaoEletiva;
	}

	@Column(name = "ADMISSAO_RECUPERA_CIR_PROC", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getAdmissaoRecuperaCirProc() {
		return this.admissaoRecuperaCirProc;
	}

	public void setAdmissaoRecuperaCirProc(DominioSimNao admissaoRecuperaCirProc) {
		this.admissaoRecuperaCirProc = admissaoRecuperaCirProc;
	}

	@Column(name = "ADMISSAO_POS_BYPASS", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getAdmissaoPosBypass() {
		return this.admissaoPosBypass;
	}

	public void setAdmissaoPosBypass(DominioSimNao admissaoPosBypass) {
		this.admissaoPosBypass = admissaoPosBypass;
	}

	@Column(name = "DIAG_ALTO_RISCO", precision = 2, scale = 0)
	@Enumerated(EnumType.ORDINAL)
	public DominioDiagAltoRisco getDiagAltoRisco() {
		return this.diagAltoRisco;
	}

	public void setDiagAltoRisco(DominioDiagAltoRisco diagAltoRisco) {
		this.diagAltoRisco = diagAltoRisco;
	}

	@Column(name = "DIAG_BAIXO_RISCO", precision = 2, scale = 0)
	@Enumerated(EnumType.ORDINAL)
	public DominioDiagBaixoRisco getDiagBaixoRisco() {
		return this.diagBaixoRisco;
	}

	public void setDiagBaixoRisco(DominioDiagBaixoRisco diagBaixoRisco) {
		this.diagBaixoRisco = diagBaixoRisco;
	}

	@Column(name = "FALTA_RESPOSTA_PUPILAR", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getFaltaRespostaPupilar() {
		return this.faltaRespostaPupilar;
	}

	public void setFaltaRespostaPupilar(DominioSimNao faltaRespostaPupilar) {
		this.faltaRespostaPupilar = faltaRespostaPupilar;
	}

	@Column(name = "EXCESSO_BASE", precision = 3, scale = 1)
	public BigDecimal getExcessoBase() {
		return this.excessoBase;
	}

	public void setExcessoBase(BigDecimal excessoBase) {
		this.excessoBase = excessoBase;
	}

	@Column(name = "PAO2", precision = 4, scale = 1)
	public BigDecimal getPao2() {
		return this.pao2;
	}

	public void setPao2(BigDecimal pao2) {
		this.pao2 = pao2;
	}

	@Column(name = "FIO2", precision = 3)
	public BigDecimal getFio2() {
		return this.fio2;
	}

	public void setFio2(BigDecimal fio2) {
		this.fio2 = fio2;
	}

	@Column(name = "PRESSAO_SISTOLICA", precision = 3, scale = 0)
	public Short getPressaoSistolica() {
		return this.pressaoSistolica;
	}

	public void setPressaoSistolica(Short pressaoSistolica) {
		this.pressaoSistolica = pressaoSistolica;
	}

	@Column(name = "VENTILACAO_MECANICA", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getVentilacaoMecanica() {
		return this.ventilacaoMecanica;
	}

	public void setVentilacaoMecanica(DominioSimNao ventilacaoMecanica) {
		this.ventilacaoMecanica = ventilacaoMecanica;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_REALIZACAO", length = 7)
	public Date getDthrRealizacao() {
		return this.dthrRealizacao;
	}

	public void setDthrRealizacao(Date dthrRealizacao) {
		this.dthrRealizacao = dthrRealizacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_INGRESSO_UNIDADE", nullable = false, length = 7)
	public Date getDthrIngressoUnidade() {
		return this.dthrIngressoUnidade;
	}

	public void setDthrIngressoUnidade(Date dthrIngressoUnidade) {
		this.dthrIngressoUnidade = dthrIngressoUnidade;
	}

	@Column(name = "ESCORE_PIM2", precision = 7, scale = 5)
	public BigDecimal getEscorePim2() {
		return this.escorePim2;
	}

	public void setEscorePim2(BigDecimal escorePim2) {
		this.escorePim2 = escorePim2;
	}

	@Column(name = "PROBABILIDADE_MORTE", precision = 5)
	public BigDecimal getProbabilidadeMorte() {
		return this.probabilidadeMorte;
	}

	public void setProbabilidadeMorte(BigDecimal probabilidadeMorte) {
		this.probabilidadeMorte = probabilidadeMorte;
	}

	@Column(name = "SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoPim2 getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacaoPim2 situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATD_SEQ", nullable = false)
	public AghAtendimentos getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(AghAtendimentos atendimento) {
		this.atendimento = atendimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seq == null) ? 0 : seq.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		MpmPim2 other = (MpmPim2) obj;
		if (seq == null) {
			if (other.seq != null) {
				return false;
			}
		} else if (!seq.equals(other.seq)) {
			return false;
		}
		return true;
	}
	
	public enum Fields {
		SITUACAO("situacao"), 
		ATD_SEQ("atendimento.seq"), 
		DTHR_INGRESSO_UNIDADE("dthrIngressoUnidade"),
		SERVIDOR("servidor"),
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
}