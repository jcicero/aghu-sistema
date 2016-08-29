package br.gov.mec.aghu.model;

// Generated 21/09/2011 17:21:15 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * SceItemRms generated by hbm2java
 */
@Entity
@Table(name = "SCE_ITEM_RMS", schema = "AGH")
public class SceItemRms extends BaseEntityId<SceItemRmsId> implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7181535810531281323L;
	private SceItemRmsId id;
	private SceReqMaterial sceReqMateriais;
	private SceEstoqueAlmoxarifado estoqueAlmoxarifado;
	private ScoUnidadeMedida scoUnidadeMedida;
	private Integer qtdeRequisitada;
	private Boolean indTemEstoque;
	private Integer qtdeEntregue;
	private String observacao;
	private Integer itpPdmNumero;
	private Short itpNumero;
	private Integer qtdeDevolvida;
	private Integer qtdeTerceiros;
	private Integer qtdeEmDevolucao;
	private SceItemRmps sceItemRmps;

	private String mediaTrintaDias;
	private String mediaSemestre;
	private String materialDesc;
	
	private Integer codigoMaterial; 
	private String nomeMaterial; 
	private String descricaoMaterial; 
	private String codigoUnidadeMedida; 
	private Integer numeroFornecedor; 
	private String nomeFantasiaFornecedor;
	

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "rmsSeq", column = @Column(name = "RMS_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "ealSeq", column = @Column(name = "EAL_SEQ", nullable = false, precision = 7, scale = 0)) })
	public SceItemRmsId getId() {
		return this.id;
	}

	public void setId(SceItemRmsId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RMS_SEQ", nullable = false, insertable = false, updatable = false)
	public SceReqMaterial getSceReqMateriais() {
		return this.sceReqMateriais;
	}

	public void setSceReqMateriais(SceReqMaterial sceReqMateriais) {
		this.sceReqMateriais = sceReqMateriais;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EAL_SEQ", nullable = false, insertable = false, updatable = false)
	public SceEstoqueAlmoxarifado getEstoqueAlmoxarifado() {
		return this.estoqueAlmoxarifado;
	}

	public void setEstoqueAlmoxarifado(SceEstoqueAlmoxarifado estoqueAlmoxarifado) {
		this.estoqueAlmoxarifado = estoqueAlmoxarifado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UMD_CODIGO", nullable = false)
	public ScoUnidadeMedida getScoUnidadeMedida() {
		return this.scoUnidadeMedida;
	}

	public void setScoUnidadeMedida(ScoUnidadeMedida scoUnidadeMedida) {
		this.scoUnidadeMedida = scoUnidadeMedida;
	}

	@Column(name = "QTDE_REQUISITADA", nullable = false, precision = 7, scale = 0)
	public Integer getQtdeRequisitada() {
		return this.qtdeRequisitada;
	}

	public void setQtdeRequisitada(Integer qtdeRequisitada) {
		this.qtdeRequisitada = qtdeRequisitada;
	}

	@Column(name = "IND_TEM_ESTOQUE", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndTemEstoque() {
		return this.indTemEstoque;
	}

	public void setIndTemEstoque(Boolean indTemEstoque) {
		this.indTemEstoque = indTemEstoque;
	}

	@Column(name = "QTDE_ENTREGUE", precision = 7, scale = 0)
	public Integer getQtdeEntregue() {
		return this.qtdeEntregue;
	}

	public void setQtdeEntregue(Integer qtdeEntregue) {
		this.qtdeEntregue = qtdeEntregue;
	}

	@Column(name = "OBSERVACAO", length = 120)
	@Length(max = 120)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	@Column(name = "ITP_PDM_NUMERO", precision = 7, scale = 0)
	public Integer getItpPdmNumero() {
		return itpPdmNumero;
	}

	public void setItpPdmNumero(Integer itpPdmNumero) {
		this.itpPdmNumero = itpPdmNumero;
	}

	@Column(name = "ITP_NUMERO", precision = 7, scale = 0)
	public Short getItpNumero() {
		return itpNumero;
	}

	public void setItpNumero(Short itpNumero) {
		this.itpNumero = itpNumero;
	}
	
	@Column(name = "QTDE_DEVOLVIDA", precision = 7, scale = 0)
	public Integer getQtdeDevolvida() {
		return this.qtdeDevolvida;
	}

	public void setQtdeDevolvida(Integer qtdeDevolvida) {
		this.qtdeDevolvida = qtdeDevolvida;
	}

	@Column(name = "QTDE_TERCEIROS", precision = 7, scale = 0)
	public Integer getQtdeTerceiros() {
		return this.qtdeTerceiros;
	}

	public void setQtdeTerceiros(Integer qtdeTerceiros) {
		this.qtdeTerceiros = qtdeTerceiros;
	}

	@Column(name = "QTDE_EM_DEVOLUCAO", precision = 7, scale = 0)
	public Integer getQtdeEmDevolucao() {
		return this.qtdeEmDevolucao;
	}

	public void setQtdeEmDevolucao(Integer qtdeEmDevolucao) {
		this.qtdeEmDevolucao = qtdeEmDevolucao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "IPS_RMP_SEQ", referencedColumnName = "RMP_SEQ"),
			@JoinColumn(name = "IPS_NUMERO", referencedColumnName = "NUMERO") })
	public SceItemRmps getSceItemRmps() {
		return this.sceItemRmps;
	}

	public void setSceItemRmps(SceItemRmps sceItemRmps) {
		this.sceItemRmps = sceItemRmps;
	}
	
	public enum Fields {
		ID("id"),
		RMS_SEQ("id.rmsSeq"),
		EAL_SEQ("id.ealSeq"),
		SCE_REQ_MATERIAIS("sceReqMateriais"),
		SCE_REQ_MATERIAIS_SEQ("sceReqMateriais.seq"),
		SCE_ESTOQUE_ALMOXARIFADO("estoqueAlmoxarifado"),
		SCO_UNIDADE_MEDIDA("scoUnidadeMedida"),
		QTD_REQUISITADA("qtdeRequisitada"),
		IND_TEM_ESTOQUE("indTemEstoque"),
		QTDE_ENTREGUE("qtdeEntregue"),
		OBSERVACAO("observacao"),
		ITP_PDM_NUMERO("itpPdmNumero"),
		ITP_NUMERO("itpNumero"),
		QTDE_DEVOLVIDA("qtdeDevolvida"),
		QTDE_TERCEIROS("qtdeTerceiros"),
		QTDE_EM_DEVOLUCAO("qtdeEmDevolucao"),
		SCE_ITEM_RMPS("sceItemRmps"), 
		CODIGO_MATERIAL("codigoMaterial"), 
		NOME_MATERIAL("nomeMaterial"), 
		DESCRICAO_MATERIAL("descricaoMaterial"), 
		CODIGO_UNIDADE_MEDIDA("codigoUnidadeMedida"), 
		NUMERO_FORNECEDOR("numeroFornecedor"), 
		NOME_FANTASIA_FORNECEDOR("nomeFantasiaFornecedor"),
		ESTOQUE_ALMOXARIFADO("estoqueAlmoxarifado"),
		REQUISICAO_MATERIAL("sceReqMateriais")
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		SceItemRms other = (SceItemRms) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}

		return true;
	}

	@Transient
	public String getMediaTrintaDias() {
		return mediaTrintaDias;
	}

	public void setMediaTrintaDias(String mediaTrintaDias) {
		this.mediaTrintaDias = mediaTrintaDias;
	}

	@Transient
	public String getMediaSemestre() {
		return mediaSemestre;
	}

	public void setMediaSemestre(String mediaSemestre) {
		this.mediaSemestre = mediaSemestre;
	}

	@Transient
	public String getMaterialDesc() {
		return materialDesc;
	}

	public void setMaterialDesc(String material) {
		this.materialDesc = material;
	}

	@Transient
	public Integer getCodigoMaterial() {
		return codigoMaterial;
	}

	public void setCodigoMaterial(Integer codigoMaterial) {
		this.codigoMaterial = codigoMaterial;
	}

	@Transient
	public String getNomeMaterial() {
		return nomeMaterial;
	}

	public void setNomeMaterial(String nomeMaterial) {
		this.nomeMaterial = nomeMaterial;
	}

	@Transient
	public String getDescricaoMaterial() {
		return descricaoMaterial;
	}

	public void setDescricaoMaterial(String descricaoMaterial) {
		this.descricaoMaterial = descricaoMaterial;
	}

	@Transient
	public String getCodigoUnidadeMedida() {
		return codigoUnidadeMedida;
	}

	public void setCodigoUnidadeMedida(String codigoUnidadeMedida) {
		this.codigoUnidadeMedida = codigoUnidadeMedida;
	}

	@Transient
	public Integer getNumeroFornecedor() {
		return numeroFornecedor;
	}

	public void setNumeroFornecedor(Integer numeroFornecedor) {
		this.numeroFornecedor = numeroFornecedor;
	}

	@Transient
	public String getNomeFantasiaFornecedor() {
		return nomeFantasiaFornecedor;
	}

	public void setNomeFantasiaFornecedor(String nomeFantasiaFornecedor) {
		this.nomeFantasiaFornecedor = nomeFantasiaFornecedor;
	}
	
	@Transient
	public String getCodigoENomeMaterial(){
		return this.codigoMaterial + " - "+ (this.nomeMaterial!=null?this.nomeMaterial:""); 
	}
	
	@Transient
	public String getCodigoNomeFantasiaFornecedor() {
		return getNumeroFornecedor() + " - " + getNomeFantasiaFornecedor();
	}
}