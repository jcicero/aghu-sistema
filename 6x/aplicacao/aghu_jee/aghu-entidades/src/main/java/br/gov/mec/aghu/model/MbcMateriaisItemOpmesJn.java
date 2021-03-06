package br.gov.mec.aghu.model;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import br.gov.mec.aghu.dominio.DominioSituacaoMaterialItem;
import br.gov.mec.aghu.core.model.BaseJournal;

@Entity
@SequenceGenerator(name="mbcMioJnSeq", sequenceName="AGH.mbc_mio_jn_seq",  allocationSize = 1)
@Table(name = "MBC_MATERIAIS_ITEM_OPMES_JN", schema = "AGH")
public class MbcMateriaisItemOpmesJn extends BaseJournal implements Serializable {

	private static final long serialVersionUID = -1502820713342058846L;
	
	private Short seq;
	
	private MbcItensRequisicaoOpmes itensRequisicaoOpmes;
	private FatProcedHospInternos procedHospInternos;
	private ScoMaterial material;
	private DominioSituacaoMaterialItem situacao;
	private Integer quantidadeSolicitada;
	private Integer quantidadeConsumida;
	
	private Date criadoEm;
	private Date modificadoEm;
	
	public MbcMateriaisItemOpmesJn(Short seq,
			MbcItensRequisicaoOpmes itensRequisicaoOpmes,
			FatProcedHospInternos procedHospInternos, ScoMaterial material,
			DominioSituacaoMaterialItem situacao, Integer quantidadeSolicitada,
			Integer quantidadeConsumida, Date criadoEm, Date modificadoEm,
			RapServidores rapServidores, RapServidores rapServidoresModificacao) {
		super();
		this.seq = seq;
		this.itensRequisicaoOpmes = itensRequisicaoOpmes;
		this.procedHospInternos = procedHospInternos;
		this.material = material;
		this.situacao = situacao;
		this.quantidadeSolicitada = quantidadeSolicitada;
		this.quantidadeConsumida = quantidadeConsumida;
		this.criadoEm = criadoEm;
		this.modificadoEm = modificadoEm;
		this.rapServidores = rapServidores;
		this.rapServidoresModificacao = rapServidoresModificacao;
	}

	private RapServidores rapServidores;
	private RapServidores rapServidoresModificacao;	
	
	public MbcMateriaisItemOpmesJn() {}
	
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mbcMioJnSeq")
	@NotNull
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IRO_SEQ")
	@NotNull
	public MbcItensRequisicaoOpmes getItensRequisicaoOpmes() {
		return itensRequisicaoOpmes;
	}

	public void setItensRequisicaoOpmes(MbcItensRequisicaoOpmes itensRequisicaoOpmes) {
		this.itensRequisicaoOpmes = itensRequisicaoOpmes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAT_CODIGO")
	@NotNull
	public ScoMaterial getMaterial() {
		return material;
	}

	public void setMaterial(ScoMaterial material) {
		this.material = material;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PHI_SEQ")
	public FatProcedHospInternos getProcedHospInternos() {
		return procedHospInternos;
	}

	public void setProcedHospInternos(FatProcedHospInternos procedHospInternos) {
		this.procedHospInternos = procedHospInternos;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "MODIFICADO_EM", length = 29)
	public Date getModificadoEm() {
		return modificadoEm;
	}


	public void setModificadoEm(Date modificadoEm) {
		this.modificadoEm = modificadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_MODIFICACAO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_MODIFICACAO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresModificacao() {
		return rapServidoresModificacao;
	}


	public void setRapServidoresModificacao(RapServidores rapServidoresModificacao) {
		this.rapServidoresModificacao = rapServidoresModificacao;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_CRIACAO", referencedColumnName = "MATRICULA", nullable = false),
				   @JoinColumn(name = "SER_VIN_CODIGO_CRIACAO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	@NotNull
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@NotNull
	@Enumerated(EnumType.STRING)
	public DominioSituacaoMaterialItem getSituacao() {
		return situacao;
	}

	public void setSituacao(DominioSituacaoMaterialItem situacao) {
		this.situacao = situacao;
	}

	@Column(name="QTD_SOLC")
	public Integer getQuantidadeSolicitada() {
		return quantidadeSolicitada;
	}

	public void setQuantidadeSolicitada(Integer quantidadeSolicitada) {
		this.quantidadeSolicitada = quantidadeSolicitada;
	}

	@Column(name="QTD_CONS")
	public Integer getQuantidadeConsumida() {
		return quantidadeConsumida;
	}

	public void setQuantidadeConsumida(Integer quantidadeConsumida) {
		this.quantidadeConsumida = quantidadeConsumida;
	}

	public enum Fields {
		
		ID("seq"),
		GRUPO_ALCADA_SEQ("grupoAlcada.seq"),
		NIVEL_ALCADA("nivelAlcada"),
		DESCRICAO("descricao"),
		VALOR_MINIMO("valorMinimo"),
		VALOR_MAXIMO("valorMaximo"),
		CRIADO_EM("criadoEm"),
		MODIFICADO_EM("modificadoEm"),
		RAP_SERVIDORES("rapServidores"),
		RAP_SERVIDORES_MODIFICACAO("rapServidoresModificacao"),
		PROCED_HOSP_INTERNOS("procedHospInternos"),
		MATERIAL("material"),
		MAT_CODIGO("material.codigo"),
		QTD_SOLC("quantidadeSolicitada"),
		QTD_CONS("quantidadeConsumida"),
		MATERIAL_CODIGO("material.codigo"),
		QUANTIDADE_SOLICITADA("quantidadeSolicitada"),
		IRO_SEQ("itensRequisicaoOpmes.seq");
		
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
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((itensRequisicaoOpmes == null) ? 0 : itensRequisicaoOpmes
						.hashCode());
		result = prime * result
				+ ((material == null) ? 0 : material.hashCode());
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
		MbcMateriaisItemOpmesJn other = (MbcMateriaisItemOpmesJn) obj;
		if (itensRequisicaoOpmes == null) {
			if (other.itensRequisicaoOpmes != null) {
				return false;
			}
		} else if (!itensRequisicaoOpmes.equals(other.itensRequisicaoOpmes)) {
			return false;
		}
		if (material == null) {
			if (other.material != null) {
				return false;
			}
		} else if (!material.equals(other.material)) {
			return false;
		}
		return true;
	}


}
