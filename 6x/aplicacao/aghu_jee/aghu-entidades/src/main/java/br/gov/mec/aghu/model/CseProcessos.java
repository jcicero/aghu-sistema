package br.gov.mec.aghu.model;

// Generated 15/06/2011 21:07:17 by Hibernate Tools 3.4.0.CR1

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

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * CseProcessos generated by hbm2java
 */
@Entity
@SequenceGenerator(name="csePrvSq1", sequenceName="AGH.CSE_PRV_SQ1", allocationSize = 1)
@Table(name = "CSE_PROCESSOS", schema = "AGH")
public class CseProcessos extends BaseEntitySeq<Short> implements java.io.Serializable {
	private static final long serialVersionUID = 5869204345163599400L;
	
	private Short seq;
	private CseProcessos processo;
	private String nome;
	private String descricao;
	private String responsabilidade;
	private DominioSituacao situacao;
	private Date criadoEm;
	private RapServidores servidor;
	private Set<CsePerfilProcessos> perfilProcessos = new HashSet<CsePerfilProcessos>(0);
	private Set<CseProcessos> processos = new HashSet<CseProcessos>(0);
	private Set<MamTipoAtestadoProcesso> tipoAtestadoProcesso = new HashSet<MamTipoAtestadoProcesso>(
			0);
	private Set<CsePerfilProcessos> perfilProcessosPai = new HashSet<CsePerfilProcessos>(
			0);
	
	public CseProcessos() {
	}

	public CseProcessos(Short seq, String nome, String descricao,
			String responsabilidade, DominioSituacao situacao, Date criadoEm,
			RapServidores servidor) {
		this.seq = seq;
		this.nome = nome;
		this.descricao = descricao;
		this.responsabilidade = responsabilidade;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
	}

	public CseProcessos(Short seq, CseProcessos processo, String nome,
			String descricao, String responsabilidade, DominioSituacao situacao,
			Date criadoEm, RapServidores servidor, Set<CsePerfilProcessos> csePerfilProcessos,
			Set<CseProcessos> cseProcessos) {
		this.seq = seq;
		this.processo = processo;
		this.nome = nome;
		this.descricao = descricao;
		this.responsabilidade = responsabilidade;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.perfilProcessos = csePerfilProcessos;
		this.processos = cseProcessos;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "csePrvSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 4, scale = 0)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ROC_SEQ")
	public CseProcessos getProcesso() {
		return this.processo;
	}

	public void setProcesso(CseProcessos processo) {
		this.processo = processo;
	}

	@Column(name = "NOME", nullable = false, length = 120)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 500)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "RESPONSABILIDADE", nullable = false, length = 120)
	public String getResponsabilidade() {
		return this.responsabilidade;
	}

	public void setResponsabilidade(String responsabilidade) {
		this.responsabilidade = responsabilidade;
	}
	
	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
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
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "processo")
	public Set<CsePerfilProcessos> getPerfilProcessos() {
		return this.perfilProcessos;
	}

	public void setPerfilProcessos(
			Set<CsePerfilProcessos> perfilProcessos) {
		this.perfilProcessos = perfilProcessos;
	}
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "ROC_SEQ", referencedColumnName="ROC_SEQ")
	public Set<CsePerfilProcessos> getPerfilProcessosPai() {
		return perfilProcessosPai;
	}

	public void setPerfilProcessosPai(Set<CsePerfilProcessos> perfilProcessosPai) {
		this.perfilProcessosPai = perfilProcessosPai;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "processo")
	public Set<CseProcessos> getCseProcessos() {
		return this.processos;
	}

	public void setCseProcessos(Set<CseProcessos> cseProcessos) {
		this.processos = cseProcessos;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cseProcessos")
	public Set<MamTipoAtestadoProcesso> getTipoAtestadoProcesso() {
		return tipoAtestadoProcesso;
	}

	public void setTipoAtestadoProcesso(Set<MamTipoAtestadoProcesso> tipoAtestadoProcesso) {
		this.tipoAtestadoProcesso = tipoAtestadoProcesso;
	}
	
	public enum Fields {
		SEQ("seq")
		, SITUACAO("situacao")
		, SERVIDOR("servidor")
		, ROC_SEQ("processo.seq")
		, PERFIL_PROCESSO("perfilProcessos")
		, PROCESSO_PAI("perfilProcessosPai")	
		, TIPO_ATESTADO_PROCESSO("tipoAtestadoProcesso")		
		, PROCESSO("processo")
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
		if (!(obj instanceof CseProcessos)) {
			return false;
		}
		CseProcessos other = (CseProcessos) obj;
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
