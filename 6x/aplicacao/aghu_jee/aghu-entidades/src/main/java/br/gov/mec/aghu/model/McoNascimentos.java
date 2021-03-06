package br.gov.mec.aghu.model;

// Generated 26/02/2010 17:37:25 by Hibernate Tools 3.2.5.Beta

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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioApresentacao;
import br.gov.mec.aghu.dominio.DominioModoNascimento;
import br.gov.mec.aghu.dominio.DominioRNClassificacaoNascimento;
import br.gov.mec.aghu.dominio.DominioTipoNascimento;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * McoNascimentos generated by hbm2java
 */
@SuppressWarnings({"PMD.AghuUsoIndevidoDaEnumDominioSimNaoEntity"})
@Entity
@Table(name = "MCO_NASCIMENTOS", schema = "AGH")
public class McoNascimentos extends BaseEntityId<McoNascimentosId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4754547207559088946L;
	private McoNascimentosId id;
	private McoGestacoes mcoGestacoes;
	private DominioTipoNascimento tipo;
	private DominioModoNascimento modo;
	private Boolean indEpisotomia;
	private Short periodoDilatacao;
	private Short periodoExpulsivo;
	private Short pesoPlacenta;
	private Short compCordao;
	private Date dthrNascimento;
	private Date criadoEm;
	private Short tanSeq;
	private Short eqpSeq;
	private Integer serMatricula;
	private Short serVinCodigo;
	private DominioRNClassificacaoNascimento rnClassificacao;
	private DominioApresentacao apresentacao;
	private Short pesoNamAbo;
	private String observacao;
	private Boolean indAcompanhante;
	private Short sciUnfSeq;
	private Short sciSeqp;
	private Set<McoProfNascs> mcoProfNascses = new HashSet<McoProfNascs>(0);
	private McoForcipes mcoForcipes;
	private McoCesarianas mcoCesarianas;
	private Set<McoIntercorrenciaNascs> mcoIntercorrenciaNascses = new HashSet<McoIntercorrenciaNascs>(0);

	public McoNascimentos() {
	}

	public McoNascimentos(McoNascimentosId id, McoGestacoes mcoGestacoes,
			DominioTipoNascimento tipo, Date criadoEm, Integer serMatricula, Short serVinCodigo) {
		this.id = id;
		this.mcoGestacoes = mcoGestacoes;
		this.tipo = tipo;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	public McoNascimentos(McoNascimentosId id, McoGestacoes mcoGestacoes,
			DominioTipoNascimento tipo, DominioModoNascimento modo, Boolean indEpisotomia,
			Short periodoDilatacao, Short periodoExpulsivo, Short pesoPlacenta,
			Short compCordao, Date dthrNascimento, Date criadoEm, Short tanSeq,
			Short eqpSeq, Integer serMatricula, Short serVinCodigo,
			DominioRNClassificacaoNascimento rnClassificacao, DominioApresentacao apresentacao, Short pesoNamAbo,
			String observacao, Boolean indAcompanhante,	Set<McoProfNascs> mcoProfNascses, McoForcipes mcoForcipes,
			Set<McoIntercorrenciaNascs> mcoIntercorrenciaNascses) {
		this.id = id;
		this.mcoGestacoes = mcoGestacoes;
		this.tipo = tipo;
		this.modo = modo;
		this.indEpisotomia = indEpisotomia;
		this.periodoDilatacao = periodoDilatacao;
		this.periodoExpulsivo = periodoExpulsivo;
		this.pesoPlacenta = pesoPlacenta;
		this.compCordao = compCordao;
		this.dthrNascimento = dthrNascimento;
		this.criadoEm = criadoEm;
		this.tanSeq = tanSeq;
		this.eqpSeq = eqpSeq;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.rnClassificacao = rnClassificacao;
		this.apresentacao = apresentacao;
		this.pesoNamAbo = pesoNamAbo;
		this.observacao = observacao;
		this.indAcompanhante = indAcompanhante;
		this.mcoProfNascses = mcoProfNascses;
		this.mcoForcipes = mcoForcipes;
		this.mcoIntercorrenciaNascses = mcoIntercorrenciaNascses;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "gsoPacCodigo", column = @Column(name = "GSO_PAC_CODIGO", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "gsoSeqp", column = @Column(name = "GSO_SEQP", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 2, scale = 0)) })
	public McoNascimentosId getId() {
		return this.id;
	}

	public void setId(McoNascimentosId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "GSO_PAC_CODIGO", referencedColumnName = "PAC_CODIGO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "GSO_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public McoGestacoes getMcoGestacoes() {
		return this.mcoGestacoes;
	}

	public void setMcoGestacoes(McoGestacoes mcoGestacoes) {
		this.mcoGestacoes = mcoGestacoes;
	}

	@Column(name = "TIPO", nullable = false)
	@Enumerated(EnumType.STRING)
	public DominioTipoNascimento getTipo() {
		return this.tipo;
	}

	public void setTipo(DominioTipoNascimento tipo) {
		this.tipo = tipo;
	}

	@Column(name = "MODO")
	@Enumerated(EnumType.STRING)
	public DominioModoNascimento getModo() {
		return this.modo;
	}

	public void setModo(DominioModoNascimento modo) {
		this.modo = modo;
	}

	@Column(name = "IND_EPISOTOMIA")
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndEpisotomia() {
		return this.indEpisotomia;
	}

	public void setIndEpisotomia(Boolean indEpisotomia) {
		this.indEpisotomia = indEpisotomia;
	}

	@Column(name = "PERIODO_DILATACAO", precision = 4, scale = 0)
	public Short getPeriodoDilatacao() {
		return this.periodoDilatacao;
	}

	public void setPeriodoDilatacao(Short periodoDilatacao) {
		this.periodoDilatacao = periodoDilatacao;
	}

	@Column(name = "PERIODO_EXPULSIVO", precision = 4, scale = 0)
	public Short getPeriodoExpulsivo() {
		return this.periodoExpulsivo;
	}

	public void setPeriodoExpulsivo(Short periodoExpulsivo) {
		this.periodoExpulsivo = periodoExpulsivo;
	}

	@Column(name = "PESO_PLACENTA", precision = 4, scale = 0)
	public Short getPesoPlacenta() {
		return this.pesoPlacenta;
	}

	public void setPesoPlacenta(Short pesoPlacenta) {
		this.pesoPlacenta = pesoPlacenta;
	}

	@Column(name = "COMP_CORDAO", precision = 2, scale = 0)
	public Short getCompCordao() {
		return this.compCordao;
	}

	public void setCompCordao(Short compCordao) {
		this.compCordao = compCordao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_NASCIMENTO")
	public Date getDthrNascimento() {
		return this.dthrNascimento;
	}

	public void setDthrNascimento(Date dthrNascimento) {
		this.dthrNascimento = dthrNascimento;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "TAN_SEQ", precision = 3, scale = 0)
	public Short getTanSeq() {
		return this.tanSeq;
	}

	public void setTanSeq(Short tanSeq) {
		this.tanSeq = tanSeq;
	}

	@Column(name = "EQP_SEQ", precision = 4, scale = 0)
	public Short getEqpSeq() {
		return this.eqpSeq;
	}

	public void setEqpSeq(Short eqpSeq) {
		this.eqpSeq = eqpSeq;
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

	@Column(name = "RN_CLASSIFICACAO")
	@Enumerated(EnumType.STRING)
	public DominioRNClassificacaoNascimento getRnClassificacao() {
		return this.rnClassificacao;
	}

	public void setRnClassificacao(DominioRNClassificacaoNascimento rnClassificacao) {
		this.rnClassificacao = rnClassificacao;
	}

	@Column(name = "APRESENTACAO")
	@Enumerated(EnumType.STRING)
	public DominioApresentacao getApresentacao() {
		return this.apresentacao;
	}

	public void setApresentacao(DominioApresentacao apresentacao) {
		this.apresentacao = apresentacao;
	}

	@Column(name = "PESO_NAM_ABO", precision = 4, scale = 0)
	public Short getPesoNamAbo() {
		return this.pesoNamAbo;
	}

	public void setPesoNamAbo(Short pesoNamAbo) {
		this.pesoNamAbo = pesoNamAbo;
	}

	@Column(name = "OBSERVACAO", length = 1000)
	@Length(max = 1000)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "IND_ACOMPANHANTE", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndAcompanhante() {
		return this.indAcompanhante;
	}

	public void setIndAcompanhante(Boolean indAcompanhante) {
		this.indAcompanhante = indAcompanhante;
	}
	
	@Column(name = "SCI_UNF_SEQ", precision = 4, scale = 0)
	public Short getSciUnfSeq() {
		return this.sciUnfSeq;
	}

	public void setSciUnfSeq(Short sciUnfSeq) {
		this.sciUnfSeq = sciUnfSeq;
	}

	@Column(name = "SCI_SEQP", precision = 3, scale = 0)
	public Short getSciSeqp() {
		return this.sciSeqp;
	}

	public void setSciSeqp(Short sciSeqp) {
		this.sciSeqp = sciSeqp;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mcoNascimentos")
	public Set<McoProfNascs> getMcoProfNascses() {
		return this.mcoProfNascses;
	}

	public void setMcoProfNascses(Set<McoProfNascs> mcoProfNascses) {
		this.mcoProfNascses = mcoProfNascses;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "mcoNascimentos")
	public McoForcipes getMcoForcipes() {
		return this.mcoForcipes;
	}

	public void setMcoForcipes(McoForcipes mcoForcipes) {
		this.mcoForcipes = mcoForcipes;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "mcoNascimentos")	
	public McoCesarianas getMcoCesarianas() {
		return mcoCesarianas;
	}

	public void setMcoCesarianas(McoCesarianas mcoCesarianas) {
		this.mcoCesarianas = mcoCesarianas;
	}
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mcoNascimentos")
	public Set<McoIntercorrenciaNascs> getMcoIntercorrenciaNascses() {
		return this.mcoIntercorrenciaNascses;
	}

	public void setMcoIntercorrenciaNascses(
			Set<McoIntercorrenciaNascs> mcoIntercorrenciaNascses) {
		this.mcoIntercorrenciaNascses = mcoIntercorrenciaNascses;
	}

	public enum Fields {
		GSO_PAC_CODIGO("id.gsoPacCodigo"), 
		GSO_SEQP("id.gsoSeqp"), 
		DTHR_NASCIMENTO("dthrNascimento"),
		SEQP("id.seqp"),
		RN_CLASSIFICACAO("rnClassificacao"),
		MCO_FORCIPES("mcoForcipes"),
		MCO_CESARIANAS("mcoCesarianas"),
		EQP_SEQ("eqpSeq"),
		IND_ACOMPANHANTE("indAcompanhante"),
		OBSERVACAO("observacao"),
		TIPO("tipo"),
		PERIODO_EXPULSIVO("periodoExpulsivo");
		
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
		if (!(obj instanceof McoNascimentos)) {
			return false;
		}
		McoNascimentos other = (McoNascimentos) obj;
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
