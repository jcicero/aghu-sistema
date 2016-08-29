package br.gov.mec.aghu.model;

// Generated 11/03/2011 16:57:37 by Hibernate Tools 3.3.0.GA

import java.math.BigDecimal;
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
import javax.persistence.Version;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacaoAmostra;
import br.gov.mec.aghu.dominio.DominioUnidadeMedidaTempo;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelAmostras generated by hbm2java
 */

@Entity
@Table(name = "AEL_AMOSTRAS", schema = "AGH")
public class AelAmostras extends BaseEntityId<AelAmostrasId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -514192587666077419L;
	private AelAmostrasId id;
	private AelSolicitacaoExames solicitacaoExame;
	private AghUnidadesFuncionais unidadesFuncionais;
	private AelMateriaisAnalises materiaisAnalises;
	private AelRecipienteColeta recipienteColeta;
	private DominioSituacaoAmostra situacao;
	private Date dthrPrevistaColeta;
	private AelAnticoagulante anticoagulante;
	private Date dthrEntrada;
	private RapServidores servidor;
	private BigDecimal tempoIntervaloColeta;
	private DominioUnidadeMedidaTempo unidTempoIntervaloColeta;
	private Short nroInterno;
	private AelSalasExecutorasExames salasExecutorasExames;
	private Integer nroUnico;
	private Date dtNumeroUnico;
	private AelCadGuiche guiche;
	private String nroFrascoFabricante;
	private AelConfigMapa configMapa;
	private Set<AelAmostraItemExames> aelAmostraItemExames = new HashSet<AelAmostraItemExames>(0);
	private Integer version;


	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "soeSeq", column = @Column(name = "SOE_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 3, scale = 0)) })
	public AelAmostrasId getId() {
		return this.id;
	}

	public void setId(AelAmostrasId id) {
		this.id = id;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SOE_SEQ", insertable = false, updatable = false)
	public AelSolicitacaoExames getSolicitacaoExame() {
		return this.solicitacaoExame;
	}

	public void setSolicitacaoExame(AelSolicitacaoExames aelSolicitacaoExames) {
		this.solicitacaoExame = aelSolicitacaoExames;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNF_SEQ")
	public AghUnidadesFuncionais getUnidadesFuncionais() {
		return unidadesFuncionais;
	}

	public void setUnidadesFuncionais(AghUnidadesFuncionais unidadesFuncionais) {
		this.unidadesFuncionais = unidadesFuncionais;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAN_SEQ")
	public AelMateriaisAnalises getMateriaisAnalises() {
		return materiaisAnalises;
	}

	public void setMateriaisAnalises(AelMateriaisAnalises materiaisAnalises) {
		this.materiaisAnalises = materiaisAnalises;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RCO_SEQ")
	public AelRecipienteColeta getRecipienteColeta() {
		return recipienteColeta;
	}

	public void setRecipienteColeta(AelRecipienteColeta recipienteColeta) {
		this.recipienteColeta = recipienteColeta;
	}

	@Column(name = "SITUACAO", nullable = true, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoAmostra getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacaoAmostra situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_PREVISTA_COLETA", length = 29)
	public Date getDthrPrevistaColeta() {
		return this.dthrPrevistaColeta;
	}

	public void setDthrPrevistaColeta(Date dthrPrevistaColeta) {
		this.dthrPrevistaColeta = dthrPrevistaColeta;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATC_SEQ")
	public AelAnticoagulante getAnticoagulante() {
		return anticoagulante;
	}

	public void setAnticoagulante(AelAnticoagulante anticoagulante) {
		this.anticoagulante = anticoagulante;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_ENTRADA", length = 29)
	public Date getDthrEntrada() {
		return this.dthrEntrada;
	}

	public void setDthrEntrada(Date dthrEntrada) {
		this.dthrEntrada = dthrEntrada;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = true),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = true) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Column(name = "TEMPO_INTERVALO_COLETA", precision = 6)
	public BigDecimal getTempoIntervaloColeta() {
		return this.tempoIntervaloColeta;
	}

	public void setTempoIntervaloColeta(BigDecimal tempoIntervaloColeta) {
		if (tempoIntervaloColeta != null) {
			tempoIntervaloColeta = tempoIntervaloColeta.setScale(2, BigDecimal.ROUND_HALF_UP);			
		}
		this.tempoIntervaloColeta = tempoIntervaloColeta;
	}

	@Column(name = "UNID_TEMPO_INTERVALO_COLETA", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioUnidadeMedidaTempo getUnidTempoIntervaloColeta() {
		return this.unidTempoIntervaloColeta;
	}

	public void setUnidTempoIntervaloColeta(DominioUnidadeMedidaTempo p) {
		this.unidTempoIntervaloColeta = p;
	}

	@Column(name = "NRO_INTERNO", precision = 4, scale = 0)
	public Short getNroInterno() {
		return this.nroInterno;
	}

	public void setNroInterno(Short nroInterno) {
		this.nroInterno = nroInterno;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SEE_UNF_SEQ", referencedColumnName = "UNF_SEQ", nullable = true),
			@JoinColumn(name = "SEE_SEQP", referencedColumnName = "SEQP", nullable = true) })
	public AelSalasExecutorasExames getSalasExecutorasExames() {
		return salasExecutorasExames;
	}

	public void setSalasExecutorasExames(AelSalasExecutorasExames salasExecutorasExames) {
		this.salasExecutorasExames = salasExecutorasExames;
	}

	@Column(name = "NRO_UNICO", precision = 6, scale = 0)
	public Integer getNroUnico() {
		return this.nroUnico;
	}

	public void setNroUnico(Integer nroUnico) {
		this.nroUnico = nroUnico;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_NUMERO_UNICO", length = 7)
	public Date getDtNumeroUnico() {
		return this.dtNumeroUnico;
	}

	public void setDtNumeroUnico(Date dtNumeroUnico) {
		this.dtNumeroUnico = dtNumeroUnico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CGU_SEQ")
	public AelCadGuiche getGuiche() {
		return guiche;
	}

	public void setGuiche(AelCadGuiche guiche) {
		this.guiche = guiche;
	}

	@Column(name = "NRO_FRASCO_FABRICANTE", length = 30)
	@Length(max = 30)
	public String getNroFrascoFabricante() {
		return this.nroFrascoFabricante;
	}

	public void setNroFrascoFabricante(String nroFrascoFabricante) {
		this.nroFrascoFabricante = nroFrascoFabricante;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CGM_SEQ")
	public AelConfigMapa getConfigMapa() {
		return configMapa;
	}

	public void setConfigMapa(AelConfigMapa configMapa) {
		this.configMapa = configMapa;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aelAmostras")
	public Set<AelAmostraItemExames> getAelAmostraItemExames() {
		return this.aelAmostraItemExames;
	}

	public void setAelAmostraItemExames(
			Set<AelAmostraItemExames> aelAmostraItemExames) {
		this.aelAmostraItemExames = aelAmostraItemExames;
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
		SOE_SEQ("id.soeSeq"),
		SEQP("id.seqp"),
		SOLICITACAO_EXAME("solicitacaoExame"),
		UNIDADE_FUNCIONAL("unidadesFuncionais"),
		MATERIAL_ANALISE("materiaisAnalises"),
		RECIPIENTE_COLETA("recipienteColeta"), 
		SITUACAO("situacao"),
		DTHR_PREVISTA_COLETA("dthrPrevistaColeta"),
		ANTICOAGULANTE("anticoagulante"),
		DTHR_ENTRADA("dthrEntrada"),
		SERVIDOR("servidor"),
		TEMPO_INTERVALO_COLETA("tempoIntervaloColeta"),
		UNID_TEMPO_INTERVALO_COLETA("unidTempoIntervaloColeta"),
		NRO_INTERNO("nroInterno"),
		SALA_EXECUTORA_EXAME("salasExecutorasExames"),
		NRO_UNICO("nroUnico"),
		DT_NUMERO_UNICO("dtNumeroUnico"),
		CGU_SEQ("guiche.seq"),
		NRO_FRASCO_FABRICANTE("nroFrascoFabricante"),
		CONFIG_MAPA("configMapa"),
		CGM_SEQ("configMapa.seq"),
		AMOSTRA_ITEM_EXAMES("aelAmostraItemExames"),
		UNF_SEQ("unidadesFuncionais.seq"),
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
		if (!(obj instanceof AelAmostras)) {
			return false;
		}
		AelAmostras other = (AelAmostras) obj;
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
