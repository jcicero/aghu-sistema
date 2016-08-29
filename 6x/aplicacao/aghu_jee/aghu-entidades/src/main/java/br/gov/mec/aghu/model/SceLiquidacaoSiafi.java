package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityNumero;

/**
 * SceLiquidacaoSiafi generated by hbm2java
 */
@Entity
@Table(name = "SCE_LIQUIDACOES_SIAFI", schema = "AGH")
public class SceLiquidacaoSiafi extends BaseEntityNumero<String> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6191423849813712546L;
	private String numeroSiafi;
	private Integer version;
	private FsoFontesRecursoFinanc fsoFontesRecursoFinanc;
	private SceNotaRecebimento sceNotaRecebimento;
	private Date dtGeracao;
	private Date dtLiquidacao;
	private Double valor;
	private String indEnviado;
	private String nroEmpenho;
	private String tipo;
	private Short vinculacaoPagto;
	private Short recurso;
	private Short grupoDespesa;
	private String cit;
	private String sitDocHabil;
	private Short codAtivEconomica;
	private String categoria;
	private String codigoDeducao;
	private Integer frnNumeroFav;
	private Integer cnfFrnNumeroFav;
	private Short cnfAgbBcoCodigoFav;
	private Integer cnfAgbCodigoFav;
	private String cnfContaCorrenteFav;
	private Integer frnNumeroPag;
	private Integer cnfFrnNumeroPag;
	private Short cnfAgbBcoCodigoPag;
	private Integer cnfAgbCodigoPag;
	private String cnfContaCorrentePag;
	private String indOrigemLiquidacao;
	private String observacao;
	private Set<SceItemEnvioSiafi> sceItemEnvioSiafis = new HashSet<SceItemEnvioSiafi>(0);

	public SceLiquidacaoSiafi() {
	}

	public SceLiquidacaoSiafi(String numeroSiafi, FsoFontesRecursoFinanc fsoFontesRecursoFinanc,
			SceNotaRecebimento sceNotaRecebimento, Date dtGeracao, Double valor, String indEnviado) {
		this.numeroSiafi = numeroSiafi;
		this.fsoFontesRecursoFinanc = fsoFontesRecursoFinanc;
		this.sceNotaRecebimento = sceNotaRecebimento;
		this.dtGeracao = dtGeracao;
		this.valor = valor;
		this.indEnviado = indEnviado;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public SceLiquidacaoSiafi(String numeroSiafi, FsoFontesRecursoFinanc fsoFontesRecursoFinanc,
			SceNotaRecebimento sceNotaRecebimento, Date dtGeracao, Date dtLiquidacao, Double valor, String indEnviado,
			String nroEmpenho, String tipo, Short vinculacaoPagto, Short recurso, Short grupoDespesa, String cit, String sitDocHabil,
			Short codAtivEconomica, String categoria, String codigoDeducao, Integer frnNumeroFav, Integer cnfFrnNumeroFav,
			Short cnfAgbBcoCodigoFav, Integer cnfAgbCodigoFav, String cnfContaCorrenteFav, Integer frnNumeroPag,
			Integer cnfFrnNumeroPag, Short cnfAgbBcoCodigoPag, Integer cnfAgbCodigoPag, String cnfContaCorrentePag,
			String indOrigemLiquidacao, String observacao, Set<SceItemEnvioSiafi> sceItemEnvioSiafis) {
		this.numeroSiafi = numeroSiafi;
		this.fsoFontesRecursoFinanc = fsoFontesRecursoFinanc;
		this.sceNotaRecebimento = sceNotaRecebimento;
		this.dtGeracao = dtGeracao;
		this.dtLiquidacao = dtLiquidacao;
		this.valor = valor;
		this.indEnviado = indEnviado;
		this.nroEmpenho = nroEmpenho;
		this.tipo = tipo;
		this.vinculacaoPagto = vinculacaoPagto;
		this.recurso = recurso;
		this.grupoDespesa = grupoDespesa;
		this.cit = cit;
		this.sitDocHabil = sitDocHabil;
		this.codAtivEconomica = codAtivEconomica;
		this.categoria = categoria;
		this.codigoDeducao = codigoDeducao;
		this.frnNumeroFav = frnNumeroFav;
		this.cnfFrnNumeroFav = cnfFrnNumeroFav;
		this.cnfAgbBcoCodigoFav = cnfAgbBcoCodigoFav;
		this.cnfAgbCodigoFav = cnfAgbCodigoFav;
		this.cnfContaCorrenteFav = cnfContaCorrenteFav;
		this.frnNumeroPag = frnNumeroPag;
		this.cnfFrnNumeroPag = cnfFrnNumeroPag;
		this.cnfAgbBcoCodigoPag = cnfAgbBcoCodigoPag;
		this.cnfAgbCodigoPag = cnfAgbCodigoPag;
		this.cnfContaCorrentePag = cnfContaCorrentePag;
		this.indOrigemLiquidacao = indOrigemLiquidacao;
		this.observacao = observacao;
		this.sceItemEnvioSiafis = sceItemEnvioSiafis;
	}

	@Id
	@Column(name = "NUMERO_SIAFI", unique = true, nullable = false, length = 12)
	@Length(max = 12)
	public String getNumeroSiafi() {
		return this.numeroSiafi;
	}

	public void setNumeroSiafi(String numeroSiafi) {
		this.numeroSiafi = numeroSiafi;
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
	@JoinColumn(name = "FRF_CODIGO", nullable = false)
	public FsoFontesRecursoFinanc getFsoFontesRecursoFinanc() {
		return this.fsoFontesRecursoFinanc;
	}

	public void setFsoFontesRecursoFinanc(FsoFontesRecursoFinanc fsoFontesRecursoFinanc) {
		this.fsoFontesRecursoFinanc = fsoFontesRecursoFinanc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NRS_SEQ", nullable = false)
	public SceNotaRecebimento getSceNotaRecebimento() {
		return this.sceNotaRecebimento;
	}

	public void setSceNotaRecebimento(SceNotaRecebimento sceNotaRecebimento) {
		this.sceNotaRecebimento = sceNotaRecebimento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_GERACAO", nullable = false, length = 29)
	public Date getDtGeracao() {
		return this.dtGeracao;
	}

	public void setDtGeracao(Date dtGeracao) {
		this.dtGeracao = dtGeracao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_LIQUIDACAO", length = 29)
	public Date getDtLiquidacao() {
		return this.dtLiquidacao;
	}

	public void setDtLiquidacao(Date dtLiquidacao) {
		this.dtLiquidacao = dtLiquidacao;
	}

	@Column(name = "VALOR", nullable = false, precision = 17, scale = 17)
	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Column(name = "IND_ENVIADO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndEnviado() {
		return this.indEnviado;
	}

	public void setIndEnviado(String indEnviado) {
		this.indEnviado = indEnviado;
	}

	@Column(name = "NRO_EMPENHO", length = 12)
	@Length(max = 12)
	public String getNroEmpenho() {
		return this.nroEmpenho;
	}

	public void setNroEmpenho(String nroEmpenho) {
		this.nroEmpenho = nroEmpenho;
	}

	@Column(name = "TIPO", length = 1)
	@Length(max = 1)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "VINCULACAO_PAGTO")
	public Short getVinculacaoPagto() {
		return this.vinculacaoPagto;
	}

	public void setVinculacaoPagto(Short vinculacaoPagto) {
		this.vinculacaoPagto = vinculacaoPagto;
	}

	@Column(name = "RECURSO")
	public Short getRecurso() {
		return this.recurso;
	}

	public void setRecurso(Short recurso) {
		this.recurso = recurso;
	}

	@Column(name = "GRUPO_DESPESA")
	public Short getGrupoDespesa() {
		return this.grupoDespesa;
	}

	public void setGrupoDespesa(Short grupoDespesa) {
		this.grupoDespesa = grupoDespesa;
	}

	@Column(name = "CIT", length = 25)
	@Length(max = 25)
	public String getCit() {
		return this.cit;
	}

	public void setCit(String cit) {
		this.cit = cit;
	}

	@Column(name = "SIT_DOC_HABIL", length = 6)
	@Length(max = 6)
	public String getSitDocHabil() {
		return this.sitDocHabil;
	}

	public void setSitDocHabil(String sitDocHabil) {
		this.sitDocHabil = sitDocHabil;
	}

	@Column(name = "COD_ATIV_ECONOMICA")
	public Short getCodAtivEconomica() {
		return this.codAtivEconomica;
	}

	public void setCodAtivEconomica(Short codAtivEconomica) {
		this.codAtivEconomica = codAtivEconomica;
	}

	@Column(name = "CATEGORIA", length = 1)
	@Length(max = 1)
	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Column(name = "CODIGO_DEDUCAO", length = 4)
	@Length(max = 4)
	public String getCodigoDeducao() {
		return this.codigoDeducao;
	}

	public void setCodigoDeducao(String codigoDeducao) {
		this.codigoDeducao = codigoDeducao;
	}

	@Column(name = "FRN_NUMERO_FAV")
	public Integer getFrnNumeroFav() {
		return this.frnNumeroFav;
	}

	public void setFrnNumeroFav(Integer frnNumeroFav) {
		this.frnNumeroFav = frnNumeroFav;
	}

	@Column(name = "CNF_FRN_NUMERO_FAV")
	public Integer getCnfFrnNumeroFav() {
		return this.cnfFrnNumeroFav;
	}

	public void setCnfFrnNumeroFav(Integer cnfFrnNumeroFav) {
		this.cnfFrnNumeroFav = cnfFrnNumeroFav;
	}

	@Column(name = "CNF_AGB_BCO_CODIGO_FAV")
	public Short getCnfAgbBcoCodigoFav() {
		return this.cnfAgbBcoCodigoFav;
	}

	public void setCnfAgbBcoCodigoFav(Short cnfAgbBcoCodigoFav) {
		this.cnfAgbBcoCodigoFav = cnfAgbBcoCodigoFav;
	}

	@Column(name = "CNF_AGB_CODIGO_FAV")
	public Integer getCnfAgbCodigoFav() {
		return this.cnfAgbCodigoFav;
	}

	public void setCnfAgbCodigoFav(Integer cnfAgbCodigoFav) {
		this.cnfAgbCodigoFav = cnfAgbCodigoFav;
	}

	@Column(name = "CNF_CONTA_CORRENTE_FAV", length = 15)
	@Length(max = 15)
	public String getCnfContaCorrenteFav() {
		return this.cnfContaCorrenteFav;
	}

	public void setCnfContaCorrenteFav(String cnfContaCorrenteFav) {
		this.cnfContaCorrenteFav = cnfContaCorrenteFav;
	}

	@Column(name = "FRN_NUMERO_PAG")
	public Integer getFrnNumeroPag() {
		return this.frnNumeroPag;
	}

	public void setFrnNumeroPag(Integer frnNumeroPag) {
		this.frnNumeroPag = frnNumeroPag;
	}

	@Column(name = "CNF_FRN_NUMERO_PAG")
	public Integer getCnfFrnNumeroPag() {
		return this.cnfFrnNumeroPag;
	}

	public void setCnfFrnNumeroPag(Integer cnfFrnNumeroPag) {
		this.cnfFrnNumeroPag = cnfFrnNumeroPag;
	}

	@Column(name = "CNF_AGB_BCO_CODIGO_PAG")
	public Short getCnfAgbBcoCodigoPag() {
		return this.cnfAgbBcoCodigoPag;
	}

	public void setCnfAgbBcoCodigoPag(Short cnfAgbBcoCodigoPag) {
		this.cnfAgbBcoCodigoPag = cnfAgbBcoCodigoPag;
	}

	@Column(name = "CNF_AGB_CODIGO_PAG")
	public Integer getCnfAgbCodigoPag() {
		return this.cnfAgbCodigoPag;
	}

	public void setCnfAgbCodigoPag(Integer cnfAgbCodigoPag) {
		this.cnfAgbCodigoPag = cnfAgbCodigoPag;
	}

	@Column(name = "CNF_CONTA_CORRENTE_PAG", length = 15)
	@Length(max = 15)
	public String getCnfContaCorrentePag() {
		return this.cnfContaCorrentePag;
	}

	public void setCnfContaCorrentePag(String cnfContaCorrentePag) {
		this.cnfContaCorrentePag = cnfContaCorrentePag;
	}

	@Column(name = "IND_ORIGEM_LIQUIDACAO", length = 1)
	@Length(max = 1)
	public String getIndOrigemLiquidacao() {
		return this.indOrigemLiquidacao;
	}

	public void setIndOrigemLiquidacao(String indOrigemLiquidacao) {
		this.indOrigemLiquidacao = indOrigemLiquidacao;
	}

	@Column(name = "OBSERVACAO", length = 240)
	@Length(max = 240)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sceLiquidacaoSiafi")
	public Set<SceItemEnvioSiafi> getSceItemEnvioSiafis() {
		return this.sceItemEnvioSiafis;
	}

	public void setSceItemEnvioSiafis(Set<SceItemEnvioSiafi> sceItemEnvioSiafis) {
		this.sceItemEnvioSiafis = sceItemEnvioSiafis;
	}

	public enum Fields {

		NUMERO_SIAFI("numeroSiafi"),
		VERSION("version"),
		FSO_FONTES_RECURSO_FINANC("fsoFontesRecursoFinanc"),
		SCE_NOTA_RECEBIMENTO("sceNotaRecebimento"),
		DT_GERACAO("dtGeracao"),
		DT_LIQUIDACAO("dtLiquidacao"),
		VALOR("valor"),
		IND_ENVIADO("indEnviado"),
		NRO_EMPENHO("nroEmpenho"),
		TIPO("tipo"),
		VINCULACAO_PAGTO("vinculacaoPagto"),
		RECURSO("recurso"),
		GRUPO_DESPESA("grupoDespesa"),
		CIT("cit"),
		SIT_DOC_HABIL("sitDocHabil"),
		COD_ATIV_ECONOMICA("codAtivEconomica"),
		CATEGORIA("categoria"),
		CODIGO_DEDUCAO("codigoDeducao"),
		FRN_NUMERO_FAV("frnNumeroFav"),
		CNF_FRN_NUMERO_FAV("cnfFrnNumeroFav"),
		CNF_AGB_BCO_CODIGO_FAV("cnfAgbBcoCodigoFav"),
		CNF_AGB_CODIGO_FAV("cnfAgbCodigoFav"),
		CNF_CONTA_CORRENTE_FAV("cnfContaCorrenteFav"),
		FRN_NUMERO_PAG("frnNumeroPag"),
		CNF_FRN_NUMERO_PAG("cnfFrnNumeroPag"),
		CNF_AGB_BCO_CODIGO_PAG("cnfAgbBcoCodigoPag"),
		CNF_AGB_CODIGO_PAG("cnfAgbCodigoPag"),
		CNF_CONTA_CORRENTE_PAG("cnfContaCorrentePag"),
		IND_ORIGEM_LIQUIDACAO("indOrigemLiquidacao"),
		OBSERVACAO("observacao"),
		SCE_ITEM_ENVIO_SIAFIS("sceItemEnvioSiafis");

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
		result = prime * result + ((getNumeroSiafi() == null) ? 0 : getNumeroSiafi().hashCode());
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
		if (!(obj instanceof SceLiquidacaoSiafi)) {
			return false;
		}
		SceLiquidacaoSiafi other = (SceLiquidacaoSiafi) obj;
		if (getNumeroSiafi() == null) {
			if (other.getNumeroSiafi() != null) {
				return false;
			}
		} else if (!getNumeroSiafi().equals(other.getNumeroSiafi())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####
 
 @Transient public String getNumero(){ return this.getNumeroSiafi();} 
 public void setNumero(String numero){ this.setNumeroSiafi(numero);}
}
