package br.gov.mec.aghu.model;

// Generated 06/06/2011 11:40:46 by Hibernate Tools 3.4.0.CR1


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

import br.gov.mec.aghu.dominio.DominioClassifABC;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * SceEstqGerais generated by hbm2java
 */

@Entity
@Table(name = "sce_estq_gerais", schema = "agh")
public class SceEstoqueGeral extends BaseEntityId<SceEstoqueGeralId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8409714431804061224L;
	private SceEstoqueGeralId id;
	private Integer version;
	private ScoFornecedor fornecedor;
	private ScoUnidadeMedida unidadeMedida;
	private ScoMaterial material;
	private BigDecimal custoMedioPonderado;
	private Double residuo;
	private Double valor;
	private DominioClassifABC classificacaoAbc;
	private DominioClassifABC subClassificacaoAbc;
	private Integer qtde;
	private Double valorConsignado;
	private Integer qtdeConsignada;
	private Date dtCompetencia;
	private Integer mesCompetencia;
	private Integer anoCompetencia;
	private String mesAno;

	public SceEstoqueGeral() {
	}

	public SceEstoqueGeral(SceEstoqueGeralId id, Integer version,
			ScoFornecedor fornecedor, ScoUnidadeMedida unidadeMedida,
			ScoMaterial scoMaterial, BigDecimal custoMedioPonderado,
			Double residuo, Double valor, DominioClassifABC classifAbc,
			DominioClassifABC subClassifAbc, Integer qtde, Double valorConsignado,
			Integer qtdeConsignada) {
		super();
		this.id = id;
		this.version = version;
		this.fornecedor = fornecedor;
		this.unidadeMedida = unidadeMedida;
		this.material = scoMaterial;
		this.custoMedioPonderado = custoMedioPonderado;
		this.residuo = residuo;
		this.valor = valor;
		this.classificacaoAbc = classifAbc;
		this.subClassificacaoAbc = subClassifAbc;
		this.qtde = qtde;
		this.valorConsignado = valorConsignado;
		this.qtdeConsignada = qtdeConsignada;
	}

	@EmbeddedId
	@AttributeOverrides({
		@AttributeOverride(name = "matCodigo", column = @Column(name = "mat_codigo", nullable = false)),
		@AttributeOverride(name = "dtCompetencia", column = @Column(name = "dt_competencia", nullable = false, length = 29)),
		@AttributeOverride(name = "frnNumero", column = @Column(name = "frn_numero", nullable = false)) })
		public SceEstoqueGeralId getId() {
		return this.id;
	}

	public void setId(SceEstoqueGeralId id) {
		this.id = id;
	}

	@Version
	@Column(name = "version", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "frn_numero", nullable = false, insertable = false, updatable = false)
	public ScoFornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(ScoFornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "umd_codigo", nullable = false)
	public ScoUnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(ScoUnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mat_codigo", nullable = false, insertable = false, updatable = false)
	public ScoMaterial getMaterial() {
		return material;
	}

	public void setMaterial(ScoMaterial material) {
		this.material = material;
	}

	@Column(name = "custo_medio_ponderado", nullable = false, precision = 17, scale = 17)
	public BigDecimal getCustoMedioPonderado() {
		return this.custoMedioPonderado;
	}

	public void setCustoMedioPonderado(BigDecimal custoMedioPonderado) {
		this.custoMedioPonderado = custoMedioPonderado;
	}

	@Column(name = "residuo", nullable = false, precision = 17, scale = 17)
	public Double getResiduo() {
		return this.residuo;
	}

	public void setResiduo(Double residuo) {
		this.residuo = this.truncateHalfEven(residuo, 2);
	}

	@Column(name = "valor", nullable = false, precision = 17, scale = 17)
	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = this.truncateHalfEven(valor, 2);
	}

	@Column(name = "classif_abc", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioClassifABC getClassificacaoAbc() {
		return this.classificacaoAbc;
	}

	public void setClassificacaoAbc(DominioClassifABC classifAbc) {
		this.classificacaoAbc = classifAbc;
	}

	@Column(name = "sub_classif_abc", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioClassifABC getSubClassificacaoAbc() {
		return this.subClassificacaoAbc;
	}

	public void setSubClassificacaoAbc(DominioClassifABC subClassifAbc) {
		this.subClassificacaoAbc = subClassifAbc;
	}

	@Column(name = "qtde")
	public Integer getQtde() {
		return this.qtde;
	}

	public void setQtde(Integer qtde) {
		this.qtde = qtde;
	}

	@Column(name = "valor_consignado", precision = 17, scale = 17)
	public Double getValorConsignado() {
		return this.valorConsignado;
	}

	public void setValorConsignado(Double valorConsignado) {
		this.valorConsignado = valorConsignado;
	}

	@Column(name = "qtde_consignada")
	public Integer getQtdeConsignada() {
		return this.qtdeConsignada;
	}

	public void setQtdeConsignada(Integer qtdeConsignada) {
		this.qtdeConsignada = qtdeConsignada;
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
		if (!(obj instanceof SceEstoqueGeral)) {
			return false;
		}
		SceEstoqueGeral other = (SceEstoqueGeral) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}

	@Transient
	public Integer getMesCompetencia() {
		if(getDtCompetencia()!=null){
			Calendar data = Calendar.getInstance();
			data.setTime(getDtCompetencia());
			this.mesCompetencia = data.get(Calendar.MONTH)+1;
		}
		return this.mesCompetencia;
	}

	public void setMesCompetencia(Integer mesCompetencia) {
		this.mesCompetencia = mesCompetencia;
	}

	@Transient
	public Integer getAnoCompetencia() {
		if(getDtCompetencia()!=null){
			Calendar data = Calendar.getInstance();
			data.setTime(getDtCompetencia());
			this.anoCompetencia = data.get(Calendar.YEAR);
		}
		return this.anoCompetencia;
	}

	public void setAnoCompetencia(Integer anoCompetencia) {
		this.anoCompetencia = anoCompetencia;
	}

	@Transient
	public String getMesAno(){
		mesAno = getMesCompetencia().toString() + "/" + getAnoCompetencia().toString();
		return mesAno;
	}

	public void setMesAno(String mesAno){
		this.mesAno = mesAno;
	}

	@Transient
	public Date getDtCompetencia(){
		return dtCompetencia;
	}

	public void setDtCompetencia(Date dtCompetencia){
		this.dtCompetencia = dtCompetencia;
	}
	
	/**
	 * Método Utilizado para truncar valores. 
	 * Exemplo de utilização: Classe SceEstoqueGeral, para cálculos do módulo de estoque.
	 * @param valor - valor para ser truncado
	 * @param casas - quantidade de casas decimais 
	 * @return
	 */
	@Transient
	public Double truncate(Double valor, int casas){

		if(valor!=null){

			int index = valor.toString().lastIndexOf(".");

			if(index != -1){
				String subStringValor = valor.toString().substring(index).replace(".", "");

				if(subStringValor.length() > casas){

					valor = new BigDecimal(valor).setScale(casas, RoundingMode.DOWN).doubleValue();
				}

			}

		}
		
		return valor ;

	}
	
	/**
	 * Método Utilizado para truncar valores. 
	 * Exemplo de utilização: Classe SceEstoqueGeral, para cálculos do módulo de estoque.
	 * @param valor - valor para ser truncado
	 * @param casas - quantidade de casas decimais 
	 * @return
	 */
	@Transient
	public Double truncateHalfEven(Double valor, int casas){

		if(valor!=null){

			int index = valor.toString().lastIndexOf(".");

			if(index != -1){
				String subStringValor = valor.toString().substring(index).replace(".", "");

				if(subStringValor.length() > casas){

					valor = new BigDecimal(valor).setScale(casas, RoundingMode.HALF_EVEN).doubleValue();
					
				}

			}

		}
		return valor ;

	}
	
	/**
	 * Método Utilizado para truncar valores. 
	 * Exemplo de utilização: Classe SceEstoqueGeral, para cálculos do módulo de estoque.
	 * @param valor - valor para ser truncado
	 * @param casas - quantidade de casas decimais 
	 * @return
	 */
	public Double truncateFloor(Double valor, int casas){

		if(valor!=null){

			int index = valor.toString().lastIndexOf(".");

			if(index != -1){
				String subStringValor = valor.toString().substring(index).replace(".", "");

				if(subStringValor.length() > casas){

					valor = new BigDecimal(valor).setScale(casas, RoundingMode.FLOOR).doubleValue();
					
				}

			}

		}
		return valor ;

	}

	

	public enum Fields{

		ID("id"),
		DATA_COMPETENCIA("id.dtCompetencia"),
		MAT_CODIGO("id.matCodigo"),
		FRN_NUMERO("id.frnNumero"), 
		FORNECEDOR("fornecedor"),
		UNIDADE_MEDIDA("unidadeMedida"),
		MATERIAL("material"),
		CUSTO_MEDIO_PONDERADO("custoMedioPonderado"),
		RESIDUO("residuo"),
		VALOR("valor"),
		QUANTIDADE("qtde"),
		VALOR_CONSIGNADO("valorConsignado"),
		QUANTIDADE_CONSIGNADA("qtdeConsignada"),
		CLASSIFICACAO_ABC("classificacaoAbc"), 
		SUBCLASSIFICACAO_ABC("subClassificacaoAbc"), 
		DATA_COMPETENCIA_TRANS("dtCompetencia");

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
