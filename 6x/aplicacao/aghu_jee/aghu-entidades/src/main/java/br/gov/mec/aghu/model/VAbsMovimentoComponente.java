package br.gov.mec.aghu.model;

// Generated 09/11/2010 09:24:40 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * VAbsMovimentosComponentes generated by hbm2java
 */
@Entity
@Table(name = "V_ABS_MOVIMENTOS_COMPONENTES", schema = "AGH")
@Immutable
public class VAbsMovimentoComponente extends BaseEntityId<VAbsMovimentoComponenteId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4120331009455285068L;
	private Short indCodigo;
	private Short bsaCodigo;
	private Integer pacCodigo;
	private Short unfSeq;
	private Byte mreSeq;
	private String observacao;
	private Integer serMatricula2;
	private Short serVinCodigo2;
	private String provaCruzada;
	private Byte qtdeUnidades;
	private Short qtdeMl;
	private String indFiltrado;
	private String indIrradiado;
	private String indLavado;
	private String indAferese;
	private Date dthrInicio;
	private Integer serMatriculaDthrInicio;
	private Short serVinCodigoDthrInicio;
	private Date dthrFim;
	private Integer serMatriculaDthrFim;
	private Short serVinCodigoDthrFim;
	private Integer aitIshSheAtdSeq;
	private Integer aitIshSheSeq;
	private Short aitIshSequencia;
	private Short aitSequencia;
	private Long nroPool;
	
	private AbsComponenteSanguineo componenteSanguineo;
	
	private VAbsMovimentoComponenteId id;

	private String origemDados;
	
	private String descricaoComponenteProcedimento;

	public VAbsMovimentoComponente() {
		this.origemDados = "Banco de Sangue";
	}

	public VAbsMovimentoComponente(VAbsMovimentoComponenteId id) {
		this.id = id;
		this.origemDados = "Banco de Sangue";
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "seq", column = @Column(name = "SEQ", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "mcoType", column = @Column(name = "MCO_TYPE", nullable = false, length = 10)),
			@AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "criadoEm", column = @Column(name = "CRIADO_EM", nullable = false, length = 7)),
			@AttributeOverride(name = "dthrMovimento", column = @Column(name = "DTHR_MOVIMENTO", nullable = false, length = 7)),
			@AttributeOverride(name = "indEstorno", column = @Column(name = "IND_ESTORNO", nullable = false, length = 1)),
			@AttributeOverride(name = "indCodigo", column = @Column(name = "IND_CODIGO", precision = 3, scale = 0)),
			@AttributeOverride(name = "bsaCodigo", column = @Column(name = "BSA_CODIGO", precision = 3, scale = 0)),
			@AttributeOverride(name = "pacCodigo", column = @Column(name = "PAC_CODIGO", precision = 8, scale = 0)),
			@AttributeOverride(name = "unfSeq", column = @Column(name = "UNF_SEQ", precision = 4, scale = 0)),
			@AttributeOverride(name = "mreSeq", column = @Column(name = "MRE_SEQ", precision = 2, scale = 0)),
			@AttributeOverride(name = "observacao", column = @Column(name = "OBSERVACAO", length = 1000)),
			@AttributeOverride(name = "mcoSeq", column = @Column(name = "MCO_SEQ", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "ecoBolNumero", column = @Column(name = "ECO_BOL_NUMERO", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "ecoBolBsaCodigo", column = @Column(name = "ECO_BOL_BSA_CODIGO", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "ecoBolData", column = @Column(name = "ECO_BOL_DATA", nullable = false, length = 7)),
			@AttributeOverride(name = "ecoCsaCodigo", column = @Column(name = "ECO_CSA_CODIGO", nullable = false, length = 2)),
			@AttributeOverride(name = "ecoSeqp", column = @Column(name = "ECO_SEQP", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "sequencia", column = @Column(name = "SEQUENCIA", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "indEstorno2", column = @Column(name = "IND_ESTORNO2", nullable = false, length = 1))
			})
	public VAbsMovimentoComponenteId getId() {
		return this.id;
	}

	public void setId(VAbsMovimentoComponenteId id) {
		this.id = id;
	}

	@Column(name = "IND_CODIGO", precision = 3, scale = 0)
	public Short getIndCodigo() {
		return this.indCodigo;
	}

	public void setIndCodigo(Short indCodigo) {
		this.indCodigo = indCodigo;
	}

	@Column(name = "BSA_CODIGO", precision = 3, scale = 0)
	public Short getBsaCodigo() {
		return this.bsaCodigo;
	}

	public void setBsaCodigo(Short bsaCodigo) {
		this.bsaCodigo = bsaCodigo;
	}

	@Column(name = "PAC_CODIGO", precision = 8, scale = 0)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "UNF_SEQ", precision = 4, scale = 0)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "MRE_SEQ", precision = 2, scale = 0)
	public Byte getMreSeq() {
		return this.mreSeq;
	}

	public void setMreSeq(Byte mreSeq) {
		this.mreSeq = mreSeq;
	}

	@Column(name = "OBSERVACAO", length = 1000)
	@Length(max = 1000)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "SER_MATRICULA2", precision = 7, scale = 0)
	public Integer getSerMatricula2() {
		return this.serMatricula2;
	}

	public void setSerMatricula2(Integer serMatricula2) {
		this.serMatricula2 = serMatricula2;
	}

	@Column(name = "SER_VIN_CODIGO2", precision = 3, scale = 0)
	public Short getSerVinCodigo2() {
		return this.serVinCodigo2;
	}

	public void setSerVinCodigo2(Short serVinCodigo2) {
		this.serVinCodigo2 = serVinCodigo2;
	}

	@Column(name = "PROVA_CRUZADA", length = 1)
	@Length(max = 1)
	public String getProvaCruzada() {
		return this.provaCruzada;
	}

	public void setProvaCruzada(String provaCruzada) {
		this.provaCruzada = provaCruzada;
	}

	@Column(name = "QTDE_UNIDADES", precision = 2, scale = 0)
	public Byte getQtdeUnidades() {
		return this.qtdeUnidades;
	}

	public void setQtdeUnidades(Byte qtdeUnidades) {
		this.qtdeUnidades = qtdeUnidades;
	}

	@Column(name = "QTDE_ML", precision = 3, scale = 0)
	public Short getQtdeMl() {
		return this.qtdeMl;
	}

	public void setQtdeMl(Short qtdeMl) {
		this.qtdeMl = qtdeMl;
	}

	@Column(name = "IND_FILTRADO", length = 1)
	@Length(max = 1)
	public String getIndFiltrado() {
		return this.indFiltrado;
	}

	public void setIndFiltrado(String indFiltrado) {
		this.indFiltrado = indFiltrado;
	}

	@Column(name = "IND_IRRADIADO", length = 1)
	@Length(max = 1)
	public String getIndIrradiado() {
		return this.indIrradiado;
	}

	public void setIndIrradiado(String indIrradiado) {
		this.indIrradiado = indIrradiado;
	}

	@Column(name = "IND_LAVADO", length = 1)
	@Length(max = 1)
	public String getIndLavado() {
		return this.indLavado;
	}

	public void setIndLavado(String indLavado) {
		this.indLavado = indLavado;
	}

	@Column(name = "IND_AFERESE", length = 1)
	@Length(max = 1)
	public String getIndAferese() {
		return this.indAferese;
	}

	public void setIndAferese(String indAferese) {
		this.indAferese = indAferese;
	}

	@Column(name = "DTHR_INICIO", length = 7)
	public Date getDthrInicio() {
		return this.dthrInicio;
	}

	public void setDthrInicio(Date dthrInicio) {
		this.dthrInicio = dthrInicio;
	}

	@Column(name = "SER_MATRICULA_DTHR_INICIO", precision = 7, scale = 0)
	public Integer getSerMatriculaDthrInicio() {
		return this.serMatriculaDthrInicio;
	}

	public void setSerMatriculaDthrInicio(Integer serMatriculaDthrInicio) {
		this.serMatriculaDthrInicio = serMatriculaDthrInicio;
	}

	@Column(name = "SER_VIN_CODIGO_DTHR_INICIO", precision = 3, scale = 0)
	public Short getSerVinCodigoDthrInicio() {
		return this.serVinCodigoDthrInicio;
	}

	public void setSerVinCodigoDthrInicio(Short serVinCodigoDthrInicio) {
		this.serVinCodigoDthrInicio = serVinCodigoDthrInicio;
	}

	@Column(name = "DTHR_FIM", length = 7)
	public Date getDthrFim() {
		return this.dthrFim;
	}

	public void setDthrFim(Date dthrFim) {
		this.dthrFim = dthrFim;
	}

	@Column(name = "SER_MATRICULA_DTHR_FIM", precision = 7, scale = 0)
	public Integer getSerMatriculaDthrFim() {
		return this.serMatriculaDthrFim;
	}

	public void setSerMatriculaDthrFim(Integer serMatriculaDthrFim) {
		this.serMatriculaDthrFim = serMatriculaDthrFim;
	}

	@Column(name = "SER_VIN_CODIGO_DTHR_FIM", precision = 3, scale = 0)
	public Short getSerVinCodigoDthrFim() {
		return this.serVinCodigoDthrFim;
	}

	public void setSerVinCodigoDthrFim(Short serVinCodigoDthrFim) {
		this.serVinCodigoDthrFim = serVinCodigoDthrFim;
	}

	@Column(name = "AIT_ISH_SHE_ATD_SEQ", precision = 7, scale = 0)
	public Integer getAitIshSheAtdSeq() {
		return this.aitIshSheAtdSeq;
	}

	public void setAitIshSheAtdSeq(Integer aitIshSheAtdSeq) {
		this.aitIshSheAtdSeq = aitIshSheAtdSeq;
	}

	@Column(name = "AIT_ISH_SHE_SEQ", precision = 5, scale = 0)
	public Integer getAitIshSheSeq() {
		return this.aitIshSheSeq;
	}

	public void setAitIshSheSeq(Integer aitIshSheSeq) {
		this.aitIshSheSeq = aitIshSheSeq;
	}

	@Column(name = "AIT_ISH_SEQUENCIA", precision = 3, scale = 0)
	public Short getAitIshSequencia() {
		return this.aitIshSequencia;
	}

	public void setAitIshSequencia(Short aitIshSequencia) {
		this.aitIshSequencia = aitIshSequencia;
	}

	@Column(name = "AIT_SEQUENCIA", precision = 3, scale = 0)
	public Short getAitSequencia() {
		return this.aitSequencia;
	}

	public void setAitSequencia(Short aitSequencia) {
		this.aitSequencia = aitSequencia;
	}

	@Column(name = "NRO_POOL", precision = 13, scale = 0)
	public Long getNroPool() {
		return this.nroPool;
	}

	public void setNroPool(Long nroPool) {
		this.nroPool = nroPool;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ECO_CSA_CODIGO", referencedColumnName = "CODIGO", insertable = false, updatable = false)
	public AbsComponenteSanguineo getComponenteSanguineo() {
		return componenteSanguineo;
	}

	public void setComponenteSanguineo(AbsComponenteSanguineo componenteSanguineo) {
		this.componenteSanguineo = componenteSanguineo;
	}
	
	
	@Transient
	public String getOrigemDados() {
		return origemDados;
	}

	public void setOrigemDados(String origemDados) {
		this.origemDados = origemDados;
	}
	
	@Transient
	public String getDescricaoComponenteProcedimento() {
		return descricaoComponenteProcedimento;
	}

	public void setDescricaoComponenteProcedimento(
			String descricaoComponenteProcedimento) {
		this.descricaoComponenteProcedimento = descricaoComponenteProcedimento;
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
		VAbsMovimentoComponente other = (VAbsMovimentoComponente) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}


	/**
	 * FIELDS
	 */
	public enum Fields {
		MCO_TYPE("id.mcoType"),
		IND_ESTORNO("id.indEstorno"),
		PAC_CODIGO("pacCodigo"),
		COMPONENTE_SANGUINEO("componenteSanguineo"),
		DTHR_MOVIMENTO("id.dthrMovimento"),
		DTHR_INICIO("dthrInicio");

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
