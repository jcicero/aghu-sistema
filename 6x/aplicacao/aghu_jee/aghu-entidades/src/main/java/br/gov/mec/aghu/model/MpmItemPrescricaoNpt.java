package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;

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
import javax.persistence.Version;

import br.gov.mec.aghu.dominio.DominioTipoVolume;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmItemPrescricaoNpts generated by hbm2java
 */
@Entity
@Table(name = "MPM_ITEM_PRESCRICAO_NPTS", schema = "AGH")
public class MpmItemPrescricaoNpt extends BaseEntityId<MpmItemPrescricaoNptId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4887331197819862341L;
	private MpmItemPrescricaoNptId id;
	private MpmComposicaoPrescricaoNpt mpmComposicaoPrescricaoNpts;
	private AfaComponenteNpt afaComponenteNpts;
	private AfaFormaDosagem afaFormaDosagens;
	private BigDecimal qtdePrescrita;
	private BigDecimal qtdeBaseCalculo;
	private BigDecimal qtdeCalculada;
	private DominioTipoVolume tipoParamCalculo;
	private BigDecimal totParamCalculo;
	private MpmUnidadeMedidaMedica unidadeMedidaMedicas;
	private Integer pcnCnpMedMatCodigo;
	private Short pcnSeqp;
	private BigDecimal percParamCalculo;
	private Integer version;

	public MpmItemPrescricaoNpt() {
	}

	public MpmItemPrescricaoNpt(MpmItemPrescricaoNptId id,
			MpmComposicaoPrescricaoNpt mpmComposicaoPrescricaoNpts,
			AfaComponenteNpt afaComponenteNpts, AfaFormaDosagem afaFormaDosagens) {
		this.id = id;
		this.mpmComposicaoPrescricaoNpts = mpmComposicaoPrescricaoNpts;
		this.afaComponenteNpts = afaComponenteNpts;
		this.afaFormaDosagens = afaFormaDosagens;
	}

	public MpmItemPrescricaoNpt(MpmItemPrescricaoNptId id,
			MpmComposicaoPrescricaoNpt mpmComposicaoPrescricaoNpts,
			AfaComponenteNpt afaComponenteNpts, AfaFormaDosagem afaFormaDosagens, BigDecimal qtdePrescrita,
			BigDecimal qtdeBaseCalculo, BigDecimal qtdeCalculada,
			DominioTipoVolume tipoParamCalculo, BigDecimal totParamCalculo,
			MpmUnidadeMedidaMedica unidadeMedidaMedicas, Integer pcnCnpMedMatCodigo, Short pcnSeqp,
			BigDecimal percParamCalculo) {
		this.id = id;
		this.mpmComposicaoPrescricaoNpts = mpmComposicaoPrescricaoNpts;
		this.afaComponenteNpts = afaComponenteNpts;
		this.afaFormaDosagens = afaFormaDosagens;
		this.qtdePrescrita = qtdePrescrita;
		this.qtdeBaseCalculo = qtdeBaseCalculo;
		this.qtdeCalculada = qtdeCalculada;
		this.tipoParamCalculo = tipoParamCalculo;
		this.totParamCalculo = totParamCalculo;
		this.unidadeMedidaMedicas = unidadeMedidaMedicas;
		this.pcnCnpMedMatCodigo = pcnCnpMedMatCodigo;
		this.pcnSeqp = pcnSeqp;
		this.percParamCalculo = percParamCalculo;
	}

	@EmbeddedId            
	@AttributeOverrides( {                                                     
			@AttributeOverride(name = "cptPnpAtdSeq", column = @Column(name = "CPT_PNP_ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "cptPnpSeq", column = @Column(name = "CPT_PNP_SEQ", nullable = false, precision = 14, scale = 0)),
			@AttributeOverride(name = "cptSeqp", column = @Column(name = "CPT_SEQP", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 3, scale = 0)) })
	public MpmItemPrescricaoNptId getId() {
		return this.id;
	}

	public void setId(MpmItemPrescricaoNptId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "CPT_PNP_ATD_SEQ", referencedColumnName = "PNP_ATD_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CPT_PNP_SEQ", referencedColumnName = "PNP_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CPT_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public MpmComposicaoPrescricaoNpt getMpmComposicaoPrescricaoNpts() {
		return this.mpmComposicaoPrescricaoNpts;
	}

	public void setMpmComposicaoPrescricaoNpts(
			MpmComposicaoPrescricaoNpt mpmComposicaoPrescricaoNpts) {
		this.mpmComposicaoPrescricaoNpts = mpmComposicaoPrescricaoNpts;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CNP_MED_MAT_CODIGO", nullable = false)
	public AfaComponenteNpt getAfaComponenteNpts() {
		return this.afaComponenteNpts;
	}

	public void setAfaComponenteNpts(AfaComponenteNpt afaComponenteNpts) {
		this.afaComponenteNpts = afaComponenteNpts;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FDS_SEQ", nullable = false)
	public AfaFormaDosagem getAfaFormaDosagens() {
		return this.afaFormaDosagens;
	}

	public void setAfaFormaDosagens(AfaFormaDosagem afaFormaDosagens) {
		this.afaFormaDosagens = afaFormaDosagens;
	}

	@Column(name = "QTDE_PRESCRITA", precision = 14, scale = 4)
	public BigDecimal getQtdePrescrita() {
		return this.qtdePrescrita;
	}

	public void setQtdePrescrita(BigDecimal qtdePrescrita) {
		this.qtdePrescrita = qtdePrescrita;
	}

	@Column(name = "QTDE_BASE_CALCULO", precision = 6)
	public BigDecimal getQtdeBaseCalculo() {
		return this.qtdeBaseCalculo;
	}

	public void setQtdeBaseCalculo(BigDecimal qtdeBaseCalculo) {
		this.qtdeBaseCalculo = qtdeBaseCalculo;
	}

	@Column(name = "QTDE_CALCULADA", precision = 14, scale = 4)
	public BigDecimal getQtdeCalculada() {
		return this.qtdeCalculada;
	}

	public void setQtdeCalculada(BigDecimal qtdeCalculada) {
		this.qtdeCalculada = qtdeCalculada;
	}

	@Column(name = "TIPO_PARAM_CALCULO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoVolume getTipoParamCalculo() {
		return this.tipoParamCalculo;
	}

	public void setTipoParamCalculo(DominioTipoVolume tipoParamCalculo) {
		this.tipoParamCalculo = tipoParamCalculo;
	}

	@Column(name = "TOT_PARAM_CALCULO", precision = 14, scale = 4)
	public BigDecimal getTotParamCalculo() {
		return this.totParamCalculo;
	}

	public void setTotParamCalculo(BigDecimal totParamCalculo) {
		this.totParamCalculo = totParamCalculo;
	}

		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UMM_SEQ")
	public MpmUnidadeMedidaMedica getUnidadeMedidaMedicas() {
		return this.unidadeMedidaMedicas;
	}

	public void setUnidadeMedidaMedicas(MpmUnidadeMedidaMedica unidadeMedidaMedicas) {
		this.unidadeMedidaMedicas = unidadeMedidaMedicas;
	}
	

	@Column(name = "PCN_CNP_MED_MAT_CODIGO", precision = 6, scale = 0)
	public Integer getPcnCnpMedMatCodigo() {
		return this.pcnCnpMedMatCodigo;
	}

	public void setPcnCnpMedMatCodigo(Integer pcnCnpMedMatCodigo) {
		this.pcnCnpMedMatCodigo = pcnCnpMedMatCodigo;
	}

	@Column(name = "PCN_SEQP", precision = 4, scale = 0)
	public Short getPcnSeqp() {
		return this.pcnSeqp;
	}

	public void setPcnSeqp(Short pcnSeqp) {
		this.pcnSeqp = pcnSeqp;
	}

	@Column(name = "PERC_PARAM_CALCULO", precision = 5)
	public BigDecimal getPercParamCalculo() {
		return this.percParamCalculo;
	}

	public void setPercParamCalculo(BigDecimal percParamCalculo) {
		this.percParamCalculo = percParamCalculo;
	}
	

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	
	public enum Fields {
		ID("id"),
		ID_CPT_PNP_ATD_SEQ("id.cptPnpAtdSeq"),
		ID_CPT_PNP_SEQ("id.cptPnpSeq"),
		ID_CPT_SEQP("id.cptSeqp"),
		ID_SEQP("id.seqp"),
		COMPOSICAO_PRESCRICAO_NPTS("mpmComposicaoPrescricaoNpts"),
		COMPONENTE_NPTS("afaComponenteNpts"),
		CNP_MED_MAT_CODIGO("afaComponenteNpts.medMatCodigo"),
		FORMA_DOSAGENS("afaFormaDosagens"),
		SEQ_AFA_FORMA_DOSAGENS("afaFormaDosagens.seq"),
		QTDE_PRESCRITA("qtdePrescrita"),
		UNIDADE_MEDIDA_MEDICAS("unidadeMedidaMedicas"),
		PCN_CNP_MED_MAT_CODIGO("pcnCnpMedMatCodigo"),
		PCN_SEQP("pcnSeqp"),
		QTDE_BASE_CALCULO("qtdeBaseCalculo"),
		QTDE_CALCULADA("qtdeCalculada"),
		TIPO_PARAM_CALCULO("tipoParamCalculo"), 
		TOT_PARAM_CALCULO("totParamCalculo"), 
		PERC_PARAM_CALCULO("percParamCalculo");

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
		if (!(obj instanceof MpmItemPrescricaoNpt)) {
			return false;
		}
		MpmItemPrescricaoNpt other = (MpmItemPrescricaoNpt) obj;
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
