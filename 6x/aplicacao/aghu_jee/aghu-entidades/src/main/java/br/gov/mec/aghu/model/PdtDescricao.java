package br.gov.mec.aghu.model;

// Generated Mar 21, 2011 1:21:18 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
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

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacaoDescricao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;
import br.gov.mec.aghu.core.utils.StringUtil;

/**
 * PdtDescricoes generated by hbm2java
 */
@Entity
@SequenceGenerator(name="pdtDdtSq1", sequenceName="AGH.PDT_DDT_SQ1", allocationSize = 1)
@Table(name = "PDT_DESCRICOES", schema = "AGH")
public class PdtDescricao extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6471093084893752282L;
	private Integer seq;
	private DominioSituacaoDescricao situacao;
	private Date dthrConclusao;
	private Date dthrExecucao;
	private String complemento;
	private MbcCirurgias mbcCirurgias;
	private AelItemSolicitacaoExames itemSolicitacaoExame;
	private AghEspecialidades especialidade;
	private Date criadoEm;
	private RapServidores servidor;
	private Boolean resultadoNormal;
	private String nomeResponsavel;
	
	private Set<PdtDadoImg> pdtDadoImg;
	private Set<PdtCidDesc> cidsDesc;
	private Set<PdtProf> pdtProfs;
	private Set<PdtProc> pdtProcs;
	
	private String descricaoPdtProgDiag;

	public PdtDescricao() {
	}

	public PdtDescricao(Integer seq, DominioSituacaoDescricao situacao, Date criadoEm,
			RapServidores servidor, Boolean resultadoNormal) {
		this.seq = seq;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
		this.resultadoNormal = resultadoNormal;
	}

	public PdtDescricao(Integer seq, DominioSituacaoDescricao situacao, Date dthrConclusao,
			Date dthrExecucao, String complemento, MbcCirurgias mbcCirurgias,
			AelItemSolicitacaoExames itemSolicitacaoExame, AghEspecialidades especialidade, Date criadoEm,
			RapServidores servidor, Boolean resultadoNormal) {
		this.seq = seq;
		this.situacao = situacao;
		this.dthrConclusao = dthrConclusao;
		this.dthrExecucao = dthrExecucao;
		this.complemento = complemento;
		this.mbcCirurgias = mbcCirurgias;
		this.itemSolicitacaoExame = itemSolicitacaoExame;
		this.especialidade = especialidade;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
		this.resultadoNormal = resultadoNormal;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "pdtDdtSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "SITUACAO", nullable = false, length = 3)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoDescricao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacaoDescricao situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_CONCLUSAO")
	public Date getDthrConclusao() {
		return this.dthrConclusao;
	}

	public void setDthrConclusao(Date dthrConclusao) {
		this.dthrConclusao = dthrConclusao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_EXECUCAO")
	public Date getDthrExecucao() {
		return this.dthrExecucao;
	}

	public void setDthrExecucao(Date dthrExecucao) {
		this.dthrExecucao = dthrExecucao;
	}

	@Column(name = "COMPLEMENTO", length = 2000)
	@Length(max = 2000)
	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CRG_SEQ")
	public MbcCirurgias getMbcCirurgias() {
		return this.mbcCirurgias;
	}

	public void setMbcCirurgias(MbcCirurgias mbcCirurgias) {
		this.mbcCirurgias = mbcCirurgias;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "ISE_SOE_SEQ", referencedColumnName = "SOE_SEQ", insertable = false, updatable = false),
		@JoinColumn(name = "ISE_SEQP", referencedColumnName = "SEQP", insertable = false, updatable = false) })
	public AelItemSolicitacaoExames getItemSolicitacaoExame() {
		return this.itemSolicitacaoExame;
	}
	
	public void setItemSolicitacaoExame(AelItemSolicitacaoExames itemSolicitacaoExame) {
		this.itemSolicitacaoExame = itemSolicitacaoExame;
	}	

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "ESP_SEQ", nullable = false, referencedColumnName = "SEQ")
	public AghEspecialidades getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(AghEspecialidades especialidade) {
		this.especialidade = especialidade;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
		@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false)})
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Column(name = "IND_RESULTADO_NORMAL", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getResultadoNormal() {
		return this.resultadoNormal;
	}

	public void setResultadoNormal(Boolean resultadoNormal) {
		this.resultadoNormal = resultadoNormal;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pdtDescricao")
	public Set<PdtDadoImg> getPdtDadoImg() {
		return pdtDadoImg;
	}

	public void setPdtDadoImg(Set<PdtDadoImg> pdtDadoImg) {
		this.pdtDadoImg = pdtDadoImg;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pdtDescricao")
	public Set<PdtCidDesc> getCidsDesc() {
		return cidsDesc;
	}

	public void setCidsDesc(Set<PdtCidDesc> cidsDesc) {
		this.cidsDesc = cidsDesc;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}

	@Transient
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	@Transient
	public String getDescricaoPdtProgDiag() {
		return descricaoPdtProgDiag;
	}

	public void setDescricaoPdtProgDiag(String descricaoPdtProgDiag) {
		this.descricaoPdtProgDiag = descricaoPdtProgDiag;
	}
	
	@Transient
	public String getDescricaoPdtProgDiagTrunc(Long size) {
		return StringUtil.trunc(getDescricaoPdtProgDiag(), true, size);
	}
	
	@Transient
	public String getNomeResponsavelTrunc(Long size) {
		return StringUtil.trunc(getNomeResponsavel(), true, size);
	}

	public void setPdtProfs(Set<PdtProf> pdtProfs) {
		this.pdtProfs = pdtProfs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pdtDescricao")
	public Set<PdtProf> getPdtProfs() {
		return pdtProfs;
	}
	
	public void setPdtProcs(Set<PdtProc> pdtProcs) {
		this.pdtProcs = pdtProcs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pdtDescricao")
	public Set<PdtProc> getPdtProcs() {
		return pdtProcs;
	}

	public enum Fields {

		SEQ("seq"),
		SITUACAO("situacao"),
		DTHR_CONCLUSAO("dthrConclusao"),
		DTHR_EXECUCAO("dthrExecucao"),
		COMPLEMENTO("complemento"),
		CRG_SEQ("mbcCirurgias.seq"),
		ITEM_SOLICITACAO_EXAME("itemSolicitacaoExame"),
		ESPECIALIDADE("especialidade"),
		CRIADO_EM("criadoEm"),
		RESULTADO_NORMAL("resultadoNormal"),
		SERVIDOR("servidor"),
		SERVIDOR_MATRICULA("servidor.id.matricula"),
		SERVIDOR_VIN_CODIGO("servidor.id.vinCodigo"),
		MBC_CIRURGIAS("mbcCirurgias"),
		PDT_PROFS("pdtProfs"),
		PDT_PROCS("pdtProcs");		

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
		if (!(obj instanceof PdtDescricao)) {
			return false;
		}
		PdtDescricao other = (PdtDescricao) obj;
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
