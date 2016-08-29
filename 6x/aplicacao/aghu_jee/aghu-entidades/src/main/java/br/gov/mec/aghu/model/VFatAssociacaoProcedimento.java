package br.gov.mec.aghu.model;

// Generated 15/03/2011 17:37:19 by Hibernate Tools 3.2.5.Beta

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

import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * VFatAssociacaoProcedimentos generated by hbm2java
 */
@Entity
@Table(name = "V_FAT_ASSOCIACAO_PROCEDIMENTOS", schema = "AGH")
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_ONLY)
@Immutable
public class VFatAssociacaoProcedimento extends BaseEntityId<VFatAssociacaoProcedimentoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7046321211426814249L;

	private VFatAssociacaoProcedimentoId id;

	private FatProcedHospInternos procedimentoHospitalarInterno;
	
	private FatItensProcedHospitalar itemProcedimentoHospitalar;
	
	private FatConvenioSaudePlano convenioSaudePlano;
	
	private String iphIndProcPrincipalApac;
	private String iphIndProcSecundarioApac;
	private String iphCobraBpi;
	private Integer iphFcfSeq;
	private Boolean iphIndConsulta;
	private Boolean iphIndCobrancaDiaria;
	private Integer phiPhiSeq;
	
	public VFatAssociacaoProcedimento() {
	}

	public VFatAssociacaoProcedimento(VFatAssociacaoProcedimentoId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "cpgCphCspCnvCodigo", column = @Column(name = "CPG_CPH_CSP_CNV_CODIGO", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "cpgCphCspSeq", column = @Column(name = "CPG_CPH_CSP_SEQ", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "iphPhoSeq", column = @Column(name = "IPH_PHO_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "iphSeq", column = @Column(name = "IPH_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "phiSeq", column = @Column(name = "PHI_SEQ", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "codTabela", column = @Column(name = "COD_TABELA", nullable = false, precision = 10, scale = 0)),
			@AttributeOverride(name = "iphDescricao", column = @Column(name = "IPH_DESCRICAO", nullable = false, length = 250)),
			@AttributeOverride(name = "phiDescricao", column = @Column(name = "PHI_DESCRICAO", nullable = false, length = 200)),
			@AttributeOverride(name = "phiIndSituacao", column = @Column(name = "PHI_IND_SITUACAO", nullable = false, length = 1)),
			@AttributeOverride(name = "iphIndSituacao", column = @Column(name = "IPH_IND_SITUACAO", nullable = false, length = 1)),
			@AttributeOverride(name = "iphIndInternacao", column = @Column(name = "IPH_IND_INTERNACAO", nullable = false, length = 1)),
			@AttributeOverride(name = "iphIndTipoAih5", column = @Column(name = "IPH_IND_TIPO_AIH5", nullable = false, length = 1)),
			@AttributeOverride(name = "iphIndExigeConsulta", column = @Column(name = "IPH_IND_EXIGE_CONSULTA", nullable = false, length = 1)),
			@AttributeOverride(name = "iphIndCobrancaApac", column = @Column(name = "IPH_IND_COBRANCA_APAC", nullable = false, length = 1)),
			@AttributeOverride(name = "iphIndCobrancaConta", column = @Column(name = "IPH_IND_COBRANCA_CONTA", nullable = false, length = 1)),
			@AttributeOverride(name = "iphIndCobrancaAmbulatorio", column = @Column(name = "IPH_IND_COBRANCA_AMBULATORIO", nullable = false, length = 1)),
			@AttributeOverride(name = "iphIndModoLancamentoFat", column = @Column(name = "IPH_IND_MODO_LANCAMENTO_FAT", nullable = false, length = 1)),
			@AttributeOverride(name = "cpgGrcSeq", column = @Column(name = "CPG_GRC_SEQ", nullable = false, precision = 4, scale = 0))
			})

	public VFatAssociacaoProcedimentoId getId() {
		return this.id;
	}

	public void setId(VFatAssociacaoProcedimentoId id) {
		this.id = id;
	}
	
	@Column(name = "IPH_IND_PROC_PRINCIPAL_APAC", length = 4000)
	@Length(max = 4000)
	public String getIphIndProcPrincipalApac() {
		return this.iphIndProcPrincipalApac;
	}

	public void setIphIndProcPrincipalApac(String iphIndProcPrincipalApac) {
		this.iphIndProcPrincipalApac = iphIndProcPrincipalApac;
	}

	@Column(name = "IPH_IND_PROC_SECUNDARIO_APAC", length = 4000)
	@Length(max = 4000)
	public String getIphIndProcSecundarioApac() {
		return this.iphIndProcSecundarioApac;
	}

	public void setIphIndProcSecundarioApac(String iphIndProcSecundarioApac) {
		this.iphIndProcSecundarioApac = iphIndProcSecundarioApac;
	}
	
	@Column(name = "IPH_COBRA_BPI", length = 4000)
	@Length(max = 4000)
	public String getIphCobraBpi() {
		return this.iphCobraBpi;
	}

	public void setIphCobraBpi(String iphCobraBpi) {
		this.iphCobraBpi = iphCobraBpi;
	}

	@Column(name = "IPH_FCF_SEQ", precision = 5, scale = 0)
	public Integer getIphFcfSeq() {
		return this.iphFcfSeq;
	}

	public void setIphFcfSeq(Integer iphFcfSeq) {
		this.iphFcfSeq = iphFcfSeq;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PHI_SEQ", insertable= false, updatable = false)
	public FatProcedHospInternos getProcedimentoHospitalarInterno() {
		return this.procedimentoHospitalarInterno;
	}
	
	public void setProcedimentoHospitalarInterno(
			FatProcedHospInternos procedimentoHospitalarInterno) {
		this.procedimentoHospitalarInterno = procedimentoHospitalarInterno;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "IPH_SEQ", referencedColumnName = "SEQ", insertable= false, updatable = false),
			@JoinColumn(name = "IPH_PHO_SEQ", referencedColumnName = "PHO_SEQ", insertable= false, updatable = false) })
	public FatItensProcedHospitalar getItemProcedimentoHospitalar() {
		return itemProcedimentoHospitalar;
	}

	public void setItemProcedimentoHospitalar(
			FatItensProcedHospitalar itemProcedimentoHospitalar) {
		this.itemProcedimentoHospitalar = itemProcedimentoHospitalar;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "CPG_CPH_CSP_CNV_CODIGO", referencedColumnName = "CNV_CODIGO", insertable= false, updatable = false),
			@JoinColumn(name = "CPG_CPH_CSP_SEQ", referencedColumnName = "SEQ", insertable= false, updatable = false) })
	public FatConvenioSaudePlano getConvenioSaudePlano() {
		return convenioSaudePlano;
	}

	public void setConvenioSaudePlano(FatConvenioSaudePlano convenioSaudePlano) {
		this.convenioSaudePlano = convenioSaudePlano;
	}

	@Transient
	public String getSeqDescricao() {
		if(getId() != null && getId().getPhiSeq() != null){
			return getId().getPhiSeq().toString() + " - " + getId().getPhiDescricao();
		} else {
			return null;
		}
	}
	
	@Transient
	public String getCodigoTabelaDescricao() {
		return getId().getCodTabela().toString() + " - " + getId().getIphDescricao();
	}
	
	@Column(name = "IPH_IND_CONSULTA", nullable = false, insertable = false, updatable = false, length = 1)
	@org.hibernate.annotations.Type( type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIphIndConsulta() {
		return iphIndConsulta;
	}

	public void setIphIndConsulta(Boolean iphIndConsulta) {
		this.iphIndConsulta = iphIndConsulta;
	}	

    @Column(name = "IPH_IND_COBRANCA_DIARIAS", nullable = false)
    @org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIphIndCobrancaDiaria() {
		return iphIndCobrancaDiaria;
	}

	public void setIphIndCobrancaDiaria(Boolean iphIndCobrancaDiaria) {
		this.iphIndCobrancaDiaria = iphIndCobrancaDiaria;
	}
	
	
	@Column(name = "PHI_PHI_SEQ", nullable = true, precision = 6, scale = 0)
	public Integer getPhiPhiSeq() {
		return phiPhiSeq;
	}

	public void setPhiPhiSeq(Integer phiPhiSeq) {
		this.phiPhiSeq = phiPhiSeq;
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
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		VFatAssociacaoProcedimento other = (VFatAssociacaoProcedimento) obj;
		if (id == null) {
			if (other.id != null){
				return false;
			}
		} else if (!id.equals(other.id)){
			return false;
		}
		return true;
	}

	
	
	public enum Fields {
		CPG_CPH_CSP_CNV_CODIGO("id.cpgCphCspCnvCodigo"),
		CPG_CPH_CSP_SEQ("id.cpgCphCspSeq"),
		IPH_SEQ("id.iphSeq"),
		IPH_PHO_SEQ("id.iphPhoSeq"),
		IPH_DESCRICAO("id.iphDescricao"),
		PHI_SEQ("id.phiSeq"),
		PHI_DESCRICAO("id.phiDescricao"),
		PHI_SITUACAO("id.phiIndSituacao"),
		IPH_SITUACAO("id.iphIndSituacao"),
		IPH_IND_INTERNACAO("id.iphIndInternacao"),
		CONVENIO_SAUDE_PLANO("convenioSaudePlano"),
		CPG_GRC_SEQ("id.cpgGrcSeq"),
		COD_TABELA("id.codTabela"),
		PROCEDIMENTO_HOSPITALAR_INTERNO("procedimentoHospitalarInterno"),
		PHI_IND_SITUACAO("id.phiIndSituacao"),
		IPH_IND_SITUACAO("id.iphIndSituacao"),
		IPH_IND_CONSULTA("id.iphIndConsulta"),
		IPH("itemProcedimentoHospitalar"),
		IPH_IND_COBRANCA_DIARIA("iphIndCobrancaDiaria");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
		
	}


	
}
