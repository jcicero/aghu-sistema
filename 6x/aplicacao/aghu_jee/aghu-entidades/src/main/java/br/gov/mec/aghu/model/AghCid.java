package br.gov.mec.aghu.model;

// Generated 19/03/2010 17:30:52 by Hibernate Tools 3.2.5.Beta

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

import org.apache.commons.lang3.text.WordUtils;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSexoDeterminante;
import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.exception.BusinessExceptionCode;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AghCids generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aghCidSq1", sequenceName="AGH.AGH_CID_SQ1", allocationSize = 1)
@Table(name = "AGH_CIDS", schema = "AGH")
@org.hibernate.annotations.Cache(usage=org.hibernate.annotations.CacheConcurrencyStrategy.TRANSACTIONAL)
public class AghCid extends BaseEntitySeq<Integer> implements java.io.Serializable {

	private static final long serialVersionUID = 308467957047955789L;
	private Integer seq;
	private AghCid cid;
	private RapServidores servidor;
	private AghGrupoCids grupoCids;
	private String codigo;
	private String descricao;
	private DominioSituacao situacao;
	private Date criadoEm;
	private String cidInicialSecundario;
	private String cidFinalSecundario;
	private String descricaoEditada;
	private Boolean permitePrescQuimio;
	private Boolean exigeLocalTumor;
	private DominioSexoDeterminante restricaoSexo;
	private Boolean estadiavel;
	private Boolean exigeLaudoTratamento;
	private Short camposPlanejados;
	private Set<AghCid> cids = new HashSet<AghCid>(0);
	private Set<MamDiagnostico> diagnosticos = new HashSet<MamDiagnostico>(0);
	private Set<MbcDiagnosticoDescricao> diagnosticoDescricoes = new HashSet<MbcDiagnosticoDescricao>(0);
	private Set<AinCidsInternacao> cidsInternacao = new HashSet<AinCidsInternacao>(0);
	private Set<MpmAltaDiagPrincipal> altaDiagPrincipais = new HashSet<MpmAltaDiagPrincipal>(0);
	private Set<MpmAltaDiagSecundario> altaDiagSecundarios = new HashSet<MpmAltaDiagSecundario>(0);
	private Set<MamMotivoAtendimento> motivoAtendimentos = new HashSet<MamMotivoAtendimento>(0);
//	private List<MbcAgendaDiagnostico> agendaDiagnosticos = new ArrayList<MbcAgendaDiagnostico>(0);
	private Set<AghSinonimoCid> sinonimoCid = new HashSet<AghSinonimoCid>(0);
	
	private Set<MbcCidUsualEquipe> cidUsualEquipes = new HashSet<MbcCidUsualEquipe>(0);
	
	private Integer version;

	
	@SuppressWarnings("unused")
	private enum AghCidsExceptionCode implements BusinessExceptionCode{
		SEQ_IS_NOT_NULL,
		SERVIDOR_IS_NOT_NULL, 
		GCD_CPC_SEQ_IS_NOT_NULL, 
		GCD_SEQ_IS_NOT_NULL, 
		CODIGO_IS_NOT_NULL, 
		DESCRICAO_IS_NOT_NULL, 
		CRIADO_EM_IS_NOT_NULL, 
		SITUACAO_EM_IS_NOT_NULL, 
		IND_EXIGE_LOCAL_TUMOR_EM_IS_NOT_NULL, 		
		ESTADIAVEL_IS_NOT_NULL, 
		RESTRICAO_SEXO_IS_NOT_NULL, 
		PERMITE_PRESC_QUIMIO_IS_NOT_NULL,
		IND_EXIGE_LAUDO_TRATAMENTO_IS_NOT_NULL,
		AGH_CID_CK1, 
		CID_SECUNDARIOS_INCORRETOS,
		CID_IGUAL_CATEGORIA, 
		CID_SECUNDARIO_FINAL_IGUAL_CID_SECUNDARIO_INICIAL_CATEGORIA,
		CODIGO_NAO_PERTENCE_A_CATEGORIA_INFORMADA, CID_TAMANHO_INCORRETO, 
		
		
	}
	

	public AghCid() {
	}
	
	public AghCid(Integer seq) {
		this.seq = seq;
	}

	public AghCid(Integer seq, RapServidores servidor, String codigo,
			String descricao, DominioSituacao situacao, Date criadoEm,
			Boolean permitePrescQuimio, Boolean exigeLocalTumor,
			DominioSexoDeterminante restricaoSexo, Boolean estadiavel,
			Boolean exigeLaudoTratamento) {
		this.seq = seq;
		this.servidor = servidor;

		this.codigo = codigo;
		this.descricao = descricao;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.permitePrescQuimio = permitePrescQuimio;
		this.exigeLocalTumor = exigeLocalTumor;
		this.restricaoSexo = restricaoSexo;
		this.estadiavel = estadiavel;
		this.exigeLaudoTratamento = exigeLaudoTratamento;
	}

	public AghCid(Integer seq, AghCid cid, RapServidores servidor,
			String codigo, String descricao, DominioSituacao situacao,
			Date criadoEm, String cidInicialSecundario,
			String cidFinalSecundario, String descricaoEditada,
			Boolean permitePrescQuimio, Boolean exigeLocalTumor,
			DominioSexoDeterminante restricaoSexo, Boolean estadiavel,
			Boolean exigeLaudoTratamento, Short camposPlanejados,
			Set<AghCid> cids) {
		this.seq = seq;
		this.cid = cid;
		this.servidor = servidor;
		this.codigo = codigo;
		this.descricao = descricao;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.cidInicialSecundario = cidInicialSecundario;
		this.cidFinalSecundario = cidFinalSecundario;
		this.descricaoEditada = descricaoEditada;
		this.permitePrescQuimio = permitePrescQuimio;
		this.exigeLocalTumor = exigeLocalTumor;
		this.restricaoSexo = restricaoSexo;
		this.estadiavel = estadiavel;
		this.exigeLaudoTratamento = exigeLaudoTratamento;
		this.camposPlanejados = camposPlanejados;
		this.cids = cids;
	}	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aghCidSq1")
	@Column(name = "SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CID_SEQ", nullable = true, insertable=true, updatable=true)
	public AghCid getCid() {
		return this.cid;
	}

	public void setCid(AghCid cid) {
		this.cid = cid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "GCD_SEQ", referencedColumnName = "SEQ", nullable = false, insertable=true, updatable=true),
			@JoinColumn(name = "GCD_CPC_SEQ", referencedColumnName = "CPC_SEQ", nullable = false, insertable=true, updatable=true) })
	@Cascade( {org.hibernate.annotations.CascadeType.MERGE})
	public AghGrupoCids getGrupoCids() {
		return this.grupoCids;
	}

	public void setGrupoCids(AghGrupoCids grupoCids) {
		this.grupoCids = grupoCids;
	}

	@Column(name = "CODIGO", nullable = false, unique = true, length = 5)
	@Length(max = 5)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 300)
	@Length(max = 300)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	/*
	 *  O método abaixo não deve ser utilizado pois causa
	 *  problema de ClassCastException quando o Hibernate
	 *  recupera a instância desse POJO. 
	 */
	
//	@Transient
//	public boolean isSituacao(){
//		if(DominioSituacao.A.equals(this.situacao)) {
//			return true;
//		}else{
//			return false;
//		}
//	}
	
	@Transient
	public boolean isAtivo() {
		if (this.situacao != null && this.situacao.isAtivo()) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}
	
	
	@Transient
	public void setAtivo(boolean ativo) {
		if (ativo) {
			this.situacao = DominioSituacao.A;
		} else {
			this.situacao = DominioSituacao.I;
		}
	}
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}


	@Column(name = "CID_INICIAL_SECUNDARIO", length = 5)
	@Length(max = 5)
	public String getCidInicialSecundario() {
		return this.cidInicialSecundario;
	}

	public void setCidInicialSecundario(String cidInicialSecundario) {
		this.cidInicialSecundario = cidInicialSecundario;
	}


	@Column(name = "CID_FINAL_SECUNDARIO", length = 5)
	@Length(max = 5)
	public String getCidFinalSecundario() {
		return this.cidFinalSecundario;
	}

	public void setCidFinalSecundario(String cidFinalSecundario) {
		this.cidFinalSecundario = cidFinalSecundario;
	}

	@Column(name = "DESCRICAO_EDITADA", length = 300)
	@Length(max = 300)
	public String getDescricaoEditada() {
		return this.descricaoEditada;
	}

	public void setDescricaoEditada(String descricaoEditada) {
		this.descricaoEditada = descricaoEditada;
	}

	@Column(name = "IND_PERMITE_PRESC_QUIMIO", nullable = false, length = 1)
	@org.hibernate.annotations.Type( type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getPermitePrescQuimio() {
		return this.permitePrescQuimio;
	}

	public void setPermitePrescQuimio(Boolean permitePrescQuimio) {
		this.permitePrescQuimio = permitePrescQuimio;
	}

	@Column(name = "IND_EXIGE_LOCAL_TUMOR", nullable = false, length = 1)
	@org.hibernate.annotations.Type( type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndExigeLocalTumor() {
		return this.exigeLocalTumor;
	}

	public void setIndExigeLocalTumor(Boolean exigeLocalTumor) {
		this.exigeLocalTumor = exigeLocalTumor;
	}

	@Column(name = "IND_RESTRICAO_SEXO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSexoDeterminante getRestricaoSexo() {
		return this.restricaoSexo;
	}

	public void setRestricaoSexo(DominioSexoDeterminante restricaoSexo) {
		this.restricaoSexo = restricaoSexo;
	}

	@Column(name = "IND_ESTADIAVEL", nullable = false, length = 1)
	@org.hibernate.annotations.Type( type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getEstadiavel() {
		return this.estadiavel;
	}

	public void setEstadiavel(Boolean estadiavel) {
		this.estadiavel = estadiavel;
	}

	@Column(name = "IND_EXIGE_LAUDO_TRATAMENTO", nullable = false, length = 1)
	@org.hibernate.annotations.Type( type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getExigeLaudoTratamento() {
		return this.exigeLaudoTratamento;
	}

	public void setExigeLaudoTratamento(Boolean exigeLaudoTratamento) {
		this.exigeLaudoTratamento = exigeLaudoTratamento;
	}

	@Column(name = "CAMPOS_PLANEJADOS", precision = 4, scale = 0)
	public Short getCamposPlanejados() {
		return this.camposPlanejados;
	}

	public void setCamposPlanejados(Short camposPlanejados) {
		this.camposPlanejados = camposPlanejados;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cid")
	public Set<AghCid> getCids() {
		return this.cids;
	}

	public void setCids(Set<AghCid> cids) {
		this.cids = cids;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cid")
	public Set<MamDiagnostico> getDiagnosticos() {
		return this.diagnosticos;
	}

	public void setDiagnosticos(Set<MamDiagnostico> diagnosticos) {
		this.diagnosticos = diagnosticos;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cid")
	public Set<AinCidsInternacao> getCidsInternacao() {
		return this.cidsInternacao;
	}

	public void setCidsInternacao(Set<AinCidsInternacao> cidsInternacao) {
		this.cidsInternacao = cidsInternacao;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cid")
	public Set<MpmAltaDiagPrincipal> getAltaDiagPrincipais() {
		return this.altaDiagPrincipais;
	}

	public void setAltaDiagPrincipais(Set<MpmAltaDiagPrincipal> altaDiagPrincipais) {
		this.altaDiagPrincipais = altaDiagPrincipais;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cid")
	public Set<MamMotivoAtendimento> getMotivoAtendimentos() {
		return this.motivoAtendimentos;
	}

	public void setMotivoAtendimentos(Set<MamMotivoAtendimento> motivoAtendimentos) {
		this.motivoAtendimentos = motivoAtendimentos;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cidSeq")
	public Set<MpmAltaDiagSecundario> getAltaDiagSecundarios() {
		return this.altaDiagSecundarios;
	}

	public void setAltaDiagSecundarios(Set<MpmAltaDiagSecundario> altaDiagSecundarios) {
		this.altaDiagSecundarios = altaDiagSecundarios;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public void setCidUsualEquipes(Set<MbcCidUsualEquipe> cidUsualEquipes) {
		this.cidUsualEquipes = cidUsualEquipes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aghCid")
	public Set<MbcCidUsualEquipe> getCidUsualEquipes() {
		return cidUsualEquipes;
	}

	public static enum Fields {
		GCD_SEQ("grupoCids.id.seq"), CODIGO("codigo"), DESCRICAO("descricao"), DESCRICAO_EDITADA("descricaoEditada"), GCD_CPC_SEQ(
				"grupoCids.id.cpcSeq"), CID_SEQ("cid.seq"),CID("cid"), SITUACAO("situacao"), SEQ("seq"),
				CRIADO_EM ("criadoEm"), RESTRICAO_SEXO("restricaoSexo"), DIAGNOSTICO_DESCRICOES("diagnosticoDescricoes"),
				CID_USUAL_EQUIPES("cidUsualEquipes"), SERVIDOR("servidor"), GRUPO_CID("grupoCids")
				,SINONIMO_CID("sinonimoCid"), CID_INICIAL_SECUNDARIO("cidInicialSecundario"),
				CID_FINAL_SECUNDARIO("cidFinalSecundario"), CIDS("cids"), DIAGNOSTICOS("diagnosticos");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

		
	@Override
	public int hashCode() {
		return this.getSeq() == null ? 0 : this.getSeq().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AghCid)) {
			return false;
		}
		
		AghCid other = (AghCid) obj;
		return this.getSeq() != null && this.getSeq().equals(other.getSeq());
	}
	
	
	@Transient
	public String getCodigoDescricaoCID(){
		final Integer tamanho = 115;
		String descricaoCompleta = getCodigoDescricaoCompletaCID();
		
		if (descricaoCompleta.length() > tamanho) {
			descricaoCompleta = descricaoCompleta.substring(0, tamanho) + " ...";
		} 
		
		return descricaoCompleta;
	}
	
	@Transient
	public String getCodigoDescricaoCompletaCID(){
		StringBuilder sbDescricao = new StringBuilder();
		sbDescricao.append(this.getCodigo())
		.append(" - ")
		.append(this.getDescricao());
		
		return sbDescricao.toString();
	}
	
	@Transient
	public String getDescricaoSituacao() {
		return getSituacao().getDescricao();
	}
	
	@Transient
	public String getCodigoDescricaoCapitalize() {
		return WordUtils.capitalizeFully(this.getDescricao()) + " (" + this.getCodigo() + ")";
	}
	
	@Transient
	public String getCapituloCidCodigoDescricao() {
		StringBuilder strBuilder = new StringBuilder();
		boolean hasCodigo = false;
		
		//_cid.grupoCids.capituloCid.seq
		if (this.getGrupoCids() != null && this.getGrupoCids().getCapituloCid() != null && this.getGrupoCids().getCapituloCid().getSeq() != null) {
			strBuilder.append(this.getGrupoCids().getCapituloCid().getSeq());
			hasCodigo = true;
		}
		
		//_cid.grupoCids.capituloCid.descricao
		if (this.getGrupoCids() != null && this.getGrupoCids().getCapituloCid() != null && !StringUtils.isBlank(this.getGrupoCids().getCapituloCid().getDescricao())) {
			if (hasCodigo) {
				strBuilder.append(" - ");
			}
			strBuilder.append(this.getGrupoCids().getCapituloCid().getDescricao());
		}
		
		return strBuilder.toString(); 
	}

	public void setDiagnosticoDescricoes(Set<MbcDiagnosticoDescricao> diagnosticoDescricoes) {
		this.diagnosticoDescricoes = diagnosticoDescricoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cid")
	public Set<MbcDiagnosticoDescricao> getDiagnosticoDescricoes() {
		return diagnosticoDescricoes;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aghCid")
	public Set<AghSinonimoCid> getSinonimoCid() {
		return sinonimoCid;
	}

	public void setSinonimoCid(Set<AghSinonimoCid> sinonimoCid) {
		this.sinonimoCid = sinonimoCid;
	}
	
//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aghCid")
//	public List<MbcAgendaDiagnostico> getAgendaDiagnosticos() {
//		return agendaDiagnosticos;
//	}
//
//	public void setAgendaDiagnosticos(List<MbcAgendaDiagnostico> agendaDiagnosticos) {
//		this.agendaDiagnosticos = agendaDiagnosticos;
//	}
	
}
