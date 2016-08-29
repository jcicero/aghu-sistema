package br.gov.mec.aghu.model;

// Generated 23/01/2012 11:24:23 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSexo;
import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.dominio.DominioUnidadeMedidaIdade;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelValoresNormalidCampos generated by hbm2java
 */
@Entity
@Table(name = "AEL_VALORES_NORMALID_CAMPOS", schema = "AGH")
public class AelValorNormalidCampo extends BaseEntityId<AelValorNormalidCampoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8625516558198722226L;
	private AelValorNormalidCampoId id;
	private Integer version;
	private Date dthrInicial;
	private String valorMinimo;
	private String valorMaximo;
	private Short qtdeCasasDecimais = 0;
	private DominioSituacao situacao;
	private Date dthrFinal;
	private String valorMinimoAceitavel;
	private String valorMaximoAceitavel;
	private String valorMinimoAbsurdo;
	private String valorMaximoAbsurdo;
	private DominioSexo sexo;
	private Short idadeMinima;
	private Short idadeMaxima;
	private RapServidores servidor;
	private DominioUnidadeMedidaIdade unidMedidaIdade;
	private AelUnidMedValorNormal unidadeMedida;
	private DominioUnidadeMedidaIdade unidMedidaIdadeMin;
	private AelCampoLaudo campoLaudo;

	public AelValorNormalidCampo() {
	}

	public AelValorNormalidCampo(AelValorNormalidCampoId id,
			Date dthrInicial, RapServidores servidor) {
		this.id = id;
		this.dthrInicial = dthrInicial;
		this.servidor = servidor;
	
	}

	public AelValorNormalidCampo(AelValorNormalidCampoId id,
			Date dthrInicial, String valorMinimo, String valorMaximo,
			Short qtdeCasasDecimais, DominioSituacao situacao, Date dthrFinal,
			String valorMinimoAceitavel, String valorMaximoAceitavel,
			String valorMinimoAbsurdo, String valorMaximoAbsurdo, DominioSexo sexo,
			Short idadeMinima, Short idadeMaxima, RapServidores servidor, DominioUnidadeMedidaIdade unidMedidaIdade, AelUnidMedValorNormal unidadeMedida,
			DominioUnidadeMedidaIdade unidMedidaIdadeMin) {
		this.id = id;
		this.dthrInicial = dthrInicial;
		this.valorMinimo = valorMinimo;
		this.valorMaximo = valorMaximo;
		this.qtdeCasasDecimais = qtdeCasasDecimais;
		this.situacao = situacao;
		this.dthrFinal = dthrFinal;
		this.valorMinimoAceitavel = valorMinimoAceitavel;
		this.valorMaximoAceitavel = valorMaximoAceitavel;
		this.valorMinimoAbsurdo = valorMinimoAbsurdo;
		this.valorMaximoAbsurdo = valorMaximoAbsurdo;
		this.sexo = sexo;
		this.idadeMinima = idadeMinima;
		this.idadeMaxima = idadeMaxima;
		this.servidor = servidor;
		this.unidMedidaIdade = unidMedidaIdade;
		this.unidadeMedida = unidadeMedida;
		this.unidMedidaIdadeMin = unidMedidaIdadeMin;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "calSeq", column = @Column(name = "CAL_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public AelValorNormalidCampoId getId() {
		return this.id;
	}

	public void setId(AelValorNormalidCampoId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_INICIAL", nullable = false, length = 29)
	public Date getDthrInicial() {
		return this.dthrInicial;
	}

	public void setDthrInicial(Date dthrInicial) {
		this.dthrInicial = dthrInicial;
	}

	@Column(name = "VALOR_MINIMO", length = 15)
	@Length(max = 15)
	public String getValorMinimo() {
		return this.valorMinimo;
	}

	public void setValorMinimo(String valorMinimo) {
		this.valorMinimo = valorMinimo;
	}

	@Column(name = "VALOR_MAXIMO", length = 15)
	@Length(max = 15)
	public String getValorMaximo() {
		return this.valorMaximo;
	}

	public void setValorMaximo(String valorMaximo) {
		this.valorMaximo = valorMaximo;
	}

	@Column(name = "QTDE_CASAS_DECIMAIS")
	public Short getQtdeCasasDecimais() {
		return this.qtdeCasasDecimais;
	}

	public void setQtdeCasasDecimais(Short qtdeCasasDecimais) {
		this.qtdeCasasDecimais = qtdeCasasDecimais;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao indSituacao) {
		this.situacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_FINAL", length = 29)
	public Date getDthrFinal() {
		return this.dthrFinal;
	}

	public void setDthrFinal(Date dthrFinal) {
		this.dthrFinal = dthrFinal;
	}

	@Column(name = "VALOR_MINIMO_ACEITAVEL", length = 15)
	@Length(max = 15)
	public String getValorMinimoAceitavel() {
		return this.valorMinimoAceitavel;
	}

	public void setValorMinimoAceitavel(String valorMinimoAceitavel) {
		this.valorMinimoAceitavel = valorMinimoAceitavel;
	}

	@Column(name = "VALOR_MAXIMO_ACEITAVEL", length = 15)
	@Length(max = 15)
	public String getValorMaximoAceitavel() {
		return this.valorMaximoAceitavel;
	}

	public void setValorMaximoAceitavel(String valorMaximoAceitavel) {
		this.valorMaximoAceitavel = valorMaximoAceitavel;
	}

	@Column(name = "VALOR_MINIMO_ABSURDO", length = 15)
	@Length(max = 15)
	public String getValorMinimoAbsurdo() {
		return this.valorMinimoAbsurdo;
	}

	public void setValorMinimoAbsurdo(String valorMinimoAbsurdo) {
		this.valorMinimoAbsurdo = valorMinimoAbsurdo;
	}

	@Column(name = "VALOR_MAXIMO_ABSURDO", length = 15)
	@Length(max = 15)
	public String getValorMaximoAbsurdo() {
		return this.valorMaximoAbsurdo;
	}

	public void setValorMaximoAbsurdo(String valorMaximoAbsurdo) {
		this.valorMaximoAbsurdo = valorMaximoAbsurdo;
	}

	@Column(name = "SEXO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSexo getSexo() {
		return this.sexo;
	}

	public void setSexo(DominioSexo sexo) {
		this.sexo = sexo;
	}

	@Column(name = "IDADE_MINIMA")
	public Short getIdadeMinima() {
		return this.idadeMinima;
	}

	public void setIdadeMinima(Short idadeMinima) {
		this.idadeMinima = idadeMinima;
	}

	@Column(name = "IDADE_MAXIMA")
	public Short getIdadeMaxima() {
		return this.idadeMaxima;
	}

	public void setIdadeMaxima(Short idadeMaxima) {
		this.idadeMaxima = idadeMaxima;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	@Column(name = "UNID_MEDIDA_IDADE", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioUnidadeMedidaIdade getUnidMedidaIdade() {
		return this.unidMedidaIdade;
	}

	public void setUnidMedidaIdade(DominioUnidadeMedidaIdade unidMedidaIdade) {
		this.unidMedidaIdade = unidMedidaIdade;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UMV_SEQ")
	public AelUnidMedValorNormal getUnidadeMedida() {
		return this.unidadeMedida;
	}

	public void setUnidadeMedida(AelUnidMedValorNormal unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	@Column(name = "UNID_MEDIDA_IDADE_MIN", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioUnidadeMedidaIdade getUnidMedidaIdadeMin() {
		return this.unidMedidaIdadeMin;
	}

	public void setUnidMedidaIdadeMin(DominioUnidadeMedidaIdade unidMedidaIdadeMin) {
		this.unidMedidaIdadeMin = unidMedidaIdadeMin;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="CAL_SEQ", nullable = false, insertable=false, updatable=false)
	public AelCampoLaudo getCampoLaudo() {
		return campoLaudo;
	}
	
	public void setCampoLaudo(AelCampoLaudo campoLaudo) {
		this.campoLaudo = campoLaudo;
	}
	
	public enum Fields {
		ID("id"),
		CAL_SEQ("id.calSeq"),
		SEQP("id.seqp"),
		DTHR_INICIAL("dthrInicial"),
		VALOR_MINIMO("valorMinimo"),
		VALOR_MAXIMO("valorMaximo"),
		QTDE_CASAS_DEC("qtdeCasasDecimais"),
		SITUACAO("situacao"),
		DTHR_FINAL("dthrFinal"),
		VALOR_MIN_ACEITAVEL("valorMinimoAceitavel"),
		VALOR_MAX_ACEITAVEL("valorMaximoAceitavel"),
		VALOR_MIN_ABSURDO("valorMinimoAbsurdo"),
		VALOR_MAX_ABSURDO("valorMaximoAbsurdo"),
		SEXO("sexo"),
		IDADE_MINIMA("idadeMinima"),
		IDADE_MAXIMA("idadeMaxima"),
		SERVIDOR("servidor"),
		UNID_MEDIDA_IDADE("unidMedidaIdade"),
		UNID_MEDIDA("unidadeMedida"),
		UNID_MEDIDA_MIN("unidMedidaIdadeMin"),
		CAMPO_LAUDO("campoLaudo");

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
		if (!(obj instanceof AelValorNormalidCampo)) {
			return false;
		}
		AelValorNormalidCampo other = (AelValorNormalidCampo) obj;
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