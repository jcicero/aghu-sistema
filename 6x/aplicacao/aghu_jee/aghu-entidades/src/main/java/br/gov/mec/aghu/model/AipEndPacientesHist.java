package br.gov.mec.aghu.model;

// Generated 26/02/2010 19:31:12 by Hibernate Tools 3.2.5.Beta

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
import javax.persistence.Table;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSimNao;
import br.gov.mec.aghu.dominio.DominioTipoEndereco;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AipEndPacientesHist generated by hbm2java
 */
@SuppressWarnings({"PMD.AghuUsoIndevidoDaEnumDominioSimNaoEntity"})
@Entity
@Table(name = "AIP_END_PACIENTES_HIST", schema = "AGH")

public class AipEndPacientesHist extends BaseEntityId<AipEndPacientesHistId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6610146147637126907L;
	private AipEndPacientesHistId id;
	private DominioTipoEndereco tipoEndereco;
	private DominioSimNao indPadrao;
	private AipCidades cidade;
	private AipUfs uf;
	private String logradouro;
	private Integer nroLogradouro;
	private String complLogradouro;
	private String bairro;
	private String nomeCidade;
	private Integer cep;
	//private Integer bclBaiCodigo;
	//private Integer bclCloCep;
	//private Integer bclCloLgrCodigo;
	private AipBairrosCepLogradouro bairroCepLogradouro;
	private DominioSimNao indExclusaoForcada;

	public AipEndPacientesHist() {
	}

	public AipEndPacientesHist(AipEndPacientesHistId id) {
		this.id = id;
	}

	public AipEndPacientesHist(AipEndPacientesHistId id,
			DominioTipoEndereco tipoEndereco, DominioSimNao indPadrao,
			AipCidades cidade, AipUfs uf, String logradouro,
			Integer nroLogradouro, String complLogradouro, String bairro,
			AipBairrosCepLogradouro bairroCepLogradouro, String nomeCidade,
			Integer cep, DominioSimNao indExclusaoForcada) {
		this.id = id;
		this.tipoEndereco = tipoEndereco;
		this.indPadrao = indPadrao;
		this.cidade = cidade;
		this.uf = uf;
		this.logradouro = logradouro;
		this.nroLogradouro = nroLogradouro;
		this.complLogradouro = complLogradouro;
		this.bairro = bairro;
		this.nomeCidade = nomeCidade;
		this.cep = cep;
		this.bairroCepLogradouro = bairroCepLogradouro;
		//this.bclBaiCodigo = bclBaiCodigo;
		//this.bclCloCep = bclCloCep;
		//this.bclCloLgrCodigo = bclCloLgrCodigo;
		this.indExclusaoForcada = indExclusaoForcada;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "pacCodigo", column = @Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 3, scale = 0)) })
	public AipEndPacientesHistId getId() {
		return this.id;
	}

	public void setId(AipEndPacientesHistId id) {
		this.id = id;
	}

	@Column(name = "TIPO_ENDERECO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoEndereco getTipoEndereco() {
		return this.tipoEndereco;
	}

	public void setTipoEndereco(DominioTipoEndereco tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	@Column(name = "IND_PADRAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndPadrao() {
		return this.indPadrao;
	}

	public void setIndPadrao(DominioSimNao indPadrao) {
		this.indPadrao = indPadrao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CDD_CODIGO")
	public AipCidades getCidade() {
		return this.cidade;
	}

	public void setCidade(AipCidades cidade) {
		this.cidade = cidade;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UF_SIGLA")
	public AipUfs getUf() {
		return this.uf;
	}

	public void setUf(AipUfs uf) {
		this.uf = uf;
	}

	@Column(name = "LOGRADOURO", length = 120)
	@Length(max = 120)
	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	@Column(name = "NRO_LOGRADOURO", precision = 5, scale = 0)
	public Integer getNroLogradouro() {
		return this.nroLogradouro;
	}

	public void setNroLogradouro(Integer nroLogradouro) {
		this.nroLogradouro = nroLogradouro;
	}

	@Column(name = "COMPL_LOGRADOURO", length = 20)
	@Length(max = 20, message = "Complemento do logradouro deve ter no máximo 20 caracteres")
	public String getComplLogradouro() {
		return this.complLogradouro;
	}

	public void setComplLogradouro(String complLogradouro) {
		this.complLogradouro = complLogradouro;
	}

	@Column(name = "BAIRRO", length = 100)
	@Length(max = 100, message = "Bairro deve ter no máximo 20 caracteres")
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Column(name = "CIDADE", length = 40)
	@Length(max = 40)
	public String getNomeCidade() {
		return this.nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	@Column(name = "CEP", precision = 8, scale = 0)
	public Integer getCep() {
		return this.cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "BCL_CLO_LGR_CODIGO", referencedColumnName = "CLO_LGR_CODIGO"),
			@JoinColumn(name = "BCL_CLO_CEP", referencedColumnName = "CLO_CEP"),
			@JoinColumn(name = "BCL_BAI_CODIGO", referencedColumnName = "BAI_CODIGO") })
	public AipBairrosCepLogradouro getBairroCepLogradouro() {
		return this.bairroCepLogradouro;
	}

	public void setBairroCepLogradouro(
			AipBairrosCepLogradouro bairroCepLogradouro) {
		this.bairroCepLogradouro = bairroCepLogradouro;
	}
	
	/*
	@Column(name = "BCL_BAI_CODIGO", precision = 5, scale = 0)
	public Integer getBclBaiCodigo() {
		return this.bclBaiCodigo;
	}

	public void setBclBaiCodigo(Integer bclBaiCodigo) {
		this.bclBaiCodigo = bclBaiCodigo;
	}

	@Column(name = "BCL_CLO_CEP", precision = 8, scale = 0)
	public Integer getBclCloCep() {
		return this.bclCloCep;
	}

	public void setBclCloCep(Integer bclCloCep) {
		this.bclCloCep = bclCloCep;
	}

	@Column(name = "BCL_CLO_LGR_CODIGO", precision = 6, scale = 0)
	public Integer getBclCloLgrCodigo() {
		return this.bclCloLgrCodigo;
	}

	public void setBclCloLgrCodigo(Integer bclCloLgrCodigo) {
		this.bclCloLgrCodigo = bclCloLgrCodigo;
	}*/

	@Column(name = "IND_EXCLUSAO_FORCADA", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndExclusaoForcada() {
		return this.indExclusaoForcada;
	}

	public void setIndExclusaoForcada(DominioSimNao indExclusaoForcada) {
		this.indExclusaoForcada = indExclusaoForcada;
	}
	
	public enum Fields {
		PAC_CODIGO("id.pacCodigo");
		
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
		if (!(obj instanceof AipEndPacientesHist)) {
			return false;
		}
		AipEndPacientesHist other = (AipEndPacientesHist) obj;
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