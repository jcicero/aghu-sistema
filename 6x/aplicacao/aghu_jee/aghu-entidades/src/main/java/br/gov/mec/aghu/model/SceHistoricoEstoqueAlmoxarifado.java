package br.gov.mec.aghu.model;

// Generated 12/12/2011 09:29:46 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * SceHistEstqAlmoxs generated by hbm2java
 */
@Entity
@Table(name = "SCE_HIST_ESTQ_ALMOXS", schema = "AGH", 
		uniqueConstraints = @UniqueConstraint(columnNames = {"MAT_CODIGO", "DT_COMPETENCIA", "ALM_SEQ", "FRN_NUMERO" }))
public class SceHistoricoEstoqueAlmoxarifado extends BaseEntityId<SceHistoricoEstoqueAlmoxarifadoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4380238046802011189L;
	private SceHistoricoEstoqueAlmoxarifadoId id;
	private Integer version;
	private SceAlmoxarifado almoxarifado;
	private ScoMaterial material;
	private ScoUnidadeMedida unidadeMedida;
	private Date dataGeracao;
	private RapServidores servidor;
	private Boolean estocavel;
	private Boolean estoqueMinimoCalculado;
	private Boolean pontoPedidoCalculado;
	private DominioSituacao situacao;
	private Date dataGeracaoHistorico;
	private RapServidores servidorHistorico;
	private Integer quantidadeEmUso;
	private ScoFornecedor fornecedor;
	private Integer quantidadeBloqueada;
	private Integer quantidadeBloqueadaProblema;
	private Integer quantidadeDisponivel;
	private Integer quantidadePontoPedido;
	private Integer quantidadeEstoqueMinimo;
	private Integer quantidadeEstoqueMaximo;
	private Integer tempoReposicao;
	private ScoSolicitacaoDeCompra solicitacaoCompra;
	private String endereco;
	private Date dataAlteracao;
	private RapServidores servidorAlterado;
	private Date dataDesativacao;
	private RapServidores servidorDesativado;
	private Boolean controleValidade;
	private Date dataUltimoConsumo;
	private Date dataUltimaCompra;
	private Date dataUltimaCompraFf;
	private Boolean consignado;
	private Integer quantidadeBloqueadaEntradaTransferencia;

	private Set<SceHistoricoEstoqueAlmoxarifadoMovimento> historicoEstoqueAlmoxarifadoMovimentos = new HashSet<SceHistoricoEstoqueAlmoxarifadoMovimento>(0);

	public SceHistoricoEstoqueAlmoxarifado() {
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "seq", column = @Column(name = "SEQ", nullable = false)),
			@AttributeOverride(name = "dtCompetencia", column = @Column(name = "DT_COMPETENCIA", nullable = false, length = 29)) })
	public SceHistoricoEstoqueAlmoxarifadoId getId() {
		return this.id;
	}

	public void setId(SceHistoricoEstoqueAlmoxarifadoId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return version;
	}
	
	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ALM_SEQ", referencedColumnName = "SEQ", nullable = false)
	public SceAlmoxarifado getAlmoxarifado() {
		return almoxarifado;
	}

	public void setAlmoxarifado(SceAlmoxarifado almoxarifado) {
		this.almoxarifado = almoxarifado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAT_CODIGO", nullable = false)
	public ScoMaterial getMaterial() {
		return material;
	}

	public void setMaterial(ScoMaterial material) {
		this.material = material;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UMD_CODIGO", referencedColumnName = "CODIGO", nullable = false)
	public ScoUnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(ScoUnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_GERACAO", nullable = false, length = 29)
	public Date getDataGeracao() {
		return dataGeracao;
	}

	public void setDataGeracao(Date dataGeracao) {
		this.dataGeracao = dataGeracao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Column(name = "IND_ESTOCAVEL", length = 1, nullable = false)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getEstocavel() {
		return estocavel;
	}

	public void setEstocavel(Boolean estocavel) {
		this.estocavel = estocavel;
	}

	@Column(name = "IND_ESTQ_MIN_CALC", length = 1, nullable = false)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getEstoqueMinimoCalculado() {
		return estoqueMinimoCalculado;
	}

	public void setEstoqueMinimoCalculado(Boolean estoqueMinimoCalculado) {
		this.estoqueMinimoCalculado = estoqueMinimoCalculado;
	}

	@Column(name = "IND_PONTO_PEDIDO_CALC", length = 1, nullable = false)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getPontoPedidoCalculado() {
		return pontoPedidoCalculado;
	}

	public void setPontoPedidoCalculado(Boolean pontoPedidoCalculado) {
		this.pontoPedidoCalculado = pontoPedidoCalculado;
	}

	@Column(name = "IND_SITUACAO", length = 1, nullable = false)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_GERACAO_HISTORICO", nullable = false, length = 29)
	public Date getDataGeracaoHistorico() {
		return dataGeracaoHistorico;
	}

	public void setDataGeracaoHistorico(Date dataGeracaoHistorico) {
		this.dataGeracaoHistorico = dataGeracaoHistorico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_HISTORICO", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO_HISTORICO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidorHistorico() {
		return servidorHistorico;
	}

	public void setServidorHistorico(RapServidores servidorHistorico) {
		this.servidorHistorico = servidorHistorico;
	}

	@Column(name = "QTDE_EM_USO")
	public Integer getQuantidadeEmUso() {
		return quantidadeEmUso;
	}

	public void setQuantidadeEmUso(Integer quantidadeEmUso) {
		this.quantidadeEmUso = quantidadeEmUso;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FRN_NUMERO")
	public ScoFornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(ScoFornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@Column(name = "QTDE_BLOQUEADA")
	public Integer getQuantidadeBloqueada() {
		return quantidadeBloqueada;
	}

	public void setQuantidadeBloqueada(Integer quantidadeBloqueada) {
		this.quantidadeBloqueada = quantidadeBloqueada;
	}

	@Column(name = "QTDE_BLOQ_PROBLEMA")
	public Integer getQuantidadeBloqueadaProblema() {
		return quantidadeBloqueadaProblema;
	}

	public void setQuantidadeBloqueadaProblema(
			Integer quantidadeBloqueadaProblema) {
		this.quantidadeBloqueadaProblema = quantidadeBloqueadaProblema;
	}

	@Column(name = "QTDE_DISPONIVEL")
	public Integer getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}

	public void setQuantidadeDisponivel(Integer quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}

	@Column(name = "QTDE_PONTO_PEDIDO")
	public Integer getQuantidadePontoPedido() {
		return quantidadePontoPedido;
	}

	public void setQuantidadePontoPedido(Integer quantidadePontoPedido) {
		this.quantidadePontoPedido = quantidadePontoPedido;
	}

	@Column(name = "QTDE_ESTQ_MIN")
	public Integer getQuantidadeEstoqueMinimo() {
		return quantidadeEstoqueMinimo;
	}

	public void setQuantidadeEstoqueMinimo(Integer quantidadeEstoqueMinimo) {
		this.quantidadeEstoqueMinimo = quantidadeEstoqueMinimo;
	}

	@Column(name = "QTDE_ESTQ_MAX")
	public Integer getQuantidadeEstoqueMaximo() {
		return quantidadeEstoqueMaximo;
	}

	public void setQuantidadeEstoqueMaximo(Integer quantidadeEstoqueMaximo) {
		this.quantidadeEstoqueMaximo = quantidadeEstoqueMaximo;
	}

	@Column(name = "TEMPO_REPOSICAO")
	public Integer getTempoReposicao() {
		return this.tempoReposicao;
	}

	public void setTempoReposicao(Integer tempoReposicao) {
		this.tempoReposicao = tempoReposicao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SLC_NUMERO", referencedColumnName = "NUMERO")
	public ScoSolicitacaoDeCompra getSolicitacaoCompra() {
		return solicitacaoCompra;
	}

	public void setSolicitacaoCompra(ScoSolicitacaoDeCompra solicitacaoCompra) {
		this.solicitacaoCompra = solicitacaoCompra;
	}

	@Column(name = "ENDERECO", length = 4)
	@Length(max = 4)
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ALTERACAO", length = 29)
	public Date getDataAlteracao() {
		return dataAlteracao;
	}

	public void setDataAlteracao(Date dataAlteracao) {
		this.dataAlteracao = dataAlteracao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorAlterado() {
		return servidorAlterado;
	}

	public void setServidorAlterado(RapServidores servidorAlterado) {
		this.servidorAlterado = servidorAlterado;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_DESATIVACAO", length = 29)
	public Date getDataDesativacao() {
		return dataDesativacao;
	}

	public void setDataDesativacao(Date dataDesativacao) {
		this.dataDesativacao = dataDesativacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_DESATIVADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_DESATIVADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorDesativado() {
		return servidorDesativado;
	}

	public void setServidorDesativado(RapServidores servidorDesativado) {
		this.servidorDesativado = servidorDesativado;
	}

	@Column(name = "IND_CONTROLE_VALIDADE", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getControleValidade() {
		return controleValidade;
	}

	public void setControleValidade(Boolean controleValidade) {
		this.controleValidade = controleValidade;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ULTIMO_CONSUMO", length = 29)
	public Date getDataUltimoConsumo() {
		return dataUltimoConsumo;
	}

	public void setDataUltimoConsumo(Date dataUltimoConsumo) {
		this.dataUltimoConsumo = dataUltimoConsumo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ULTIMA_COMPRA", length = 29)
	public Date getDataUltimaCompra() {
		return dataUltimaCompra;
	}

	public void setDataUltimaCompra(Date dataUltimaCompra) {
		this.dataUltimaCompra = dataUltimaCompra;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ULTIMA_COMPRA_FF", length = 29)
	public Date getDataUltimaCompraFf() {
		return dataUltimaCompraFf;
	}

	public void setDataUltimaCompraFf(Date dataUltimaCompraFf) {
		this.dataUltimaCompraFf = dataUltimaCompraFf;
	}

	@Column(name = "IND_CONSIGNADO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getConsignado() {
		return consignado;
	}

	public void setConsignado(Boolean consignado) {
		this.consignado = consignado;
	}

	@Column(name = "QTDE_BLOQ_ENTR_TRANSF")
	public Integer getQuantidadeBloqueadaEntradaTransferencia() {
		return quantidadeBloqueadaEntradaTransferencia;
	}

	public void setQuantidadeBloqueadaEntradaTransferencia(
			Integer quantidadeBloqueadaEntradaTransferencia) {
		this.quantidadeBloqueadaEntradaTransferencia = quantidadeBloqueadaEntradaTransferencia;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "historicoEstoqueAlmoxarifado")
	public Set<SceHistoricoEstoqueAlmoxarifadoMovimento> getHistoricoEstoqueAlmoxarifadoMovimentos() {
		return historicoEstoqueAlmoxarifadoMovimentos;
	}
	
	public void setHistoricoEstoqueAlmoxarifadoMovimentos(Set<SceHistoricoEstoqueAlmoxarifadoMovimento> historicoEstoqueAlmoxarifadoMovimentos) {
		this.historicoEstoqueAlmoxarifadoMovimentos = historicoEstoqueAlmoxarifadoMovimentos;
	}
	
	public enum Fields {
		ID("id"),
		ID_SEQ("id.seq"),
		ID_DATA_COMPETENCIA("id.dataCompetencia"),
		ALMOXARIFADO("almoxarifado"),
		MATERIAL("material"),
		UNIDADE_MEDIDA("unidadeMedida"),
		DATA_GERACAO("dataGeracao"),
		SERVIDOR("servidor"),
		ESTOCAVEL("estocavel"),
		ESTOQUE_MINIMO_CALCULADO("estoqueMinimoCalculado"),
		PONTO_PEDIDO_CALCULADO("pontoPedidoCalculado"),
		SITUACAO("situacao"),
		DATA_GERACAO_HISTORICO("dataGeracaoHistorico"),
		SERVIDOR_HISTORICO("servidorHistorico"),
		QUANTIDADE_EM_USO("quantidadeEmUso"),
		FORNECEDOR("fornecedor"),
		QUANTIDADE_BLOQUEADA("quantidadeBloqueada"),
		QUANTIDADE_BLOQUEADA_PROBLEMA("quantidadeBloqueadaProblema"),
		QUANTIDADE_DISPONIVEL("quantidadeDisponivel"),
		QUANTIDADE_PONTO_PEDIDO("quantidadePontoPedido"),
		QUANTIDADE_ESTOQUE_MINIMO("quantidadeEstoqueMinimo"),
		QUANTIDADE_ESTOQUE_MAXIMO("quantidadeEstoqueMaximo"),
		TEMPO_REPOSICAO("tempoReposicao"),
		SOLICITACAO_COMPRA("solicitacaoCompra"),
		ENDERECO("endereco"),
		DATA_ALTERACAO("dataAlteracao"),
		SERVIDOR_ALTERADO("servidorAlterado"),
		DATA_DESATIVACAO("dataDesativacao"),
		SERVIDOR_DESATIVADO("servidorDesativado"),
		CONTROLE_VALIDADE("controleValidade"),
		DATA_ULTIMO_CONSUMO("dataUltimoConsumo"),
		DATA_ULTIMA_COMPRA("dataUltimaCompra"),
		DATA_ULTIMACOMPRA_FF("dataUltimaCompraFf"),
		CONSIGNADO("consignado"),
		QUANTIDADE_BLOQUEADA_ENTRADA_TRANSFERENCIA("quantidadeBloqueadaEntradaTransferencia");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
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
		if (!(obj instanceof SceHistoricoEstoqueAlmoxarifado)) {
			return false;
		}
		SceHistoricoEstoqueAlmoxarifado other = (SceHistoricoEstoqueAlmoxarifado) obj;
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
