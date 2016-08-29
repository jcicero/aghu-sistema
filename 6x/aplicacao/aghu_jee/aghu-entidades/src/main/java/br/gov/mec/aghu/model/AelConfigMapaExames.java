package br.gov.mec.aghu.model;

// Generated 25/03/2011 14:28:40 by Hibernate Tools 3.2.5.Beta

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


import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelConfigMapaExames generated by hbm2java
 */
@Entity
@Table(name = "AEL_CONFIG_MAPA_EXAMES", schema = "AGH")
public class AelConfigMapaExames extends BaseEntityId<AelConfigMapaExamesId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2389702841550850633L;
	private AelConfigMapaExamesId id;
	private Integer version;
	private Date criadoEm;

	private DominioSituacao indSituacao;
	private RapServidores rapServidores;
	
	private AelConfigMapa configMapa;
	private AelUnfExecutaExames aelUnfExecutaExames;
	
	public AelConfigMapaExames() {
	}

	public AelConfigMapaExames(AelConfigMapaExamesId id, Integer version,
			Date criadoEm, DominioSituacao indSituacao,
			RapServidores rapServidores) {
		super();
		this.id = id;
		this.version = version;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.rapServidores = rapServidores;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "cgmSeq", column = @Column(name = "CGM_SEQ", nullable = false)),
			@AttributeOverride(name = "ufeUnfSeq", column = @Column(name = "UFE_UNF_SEQ", nullable = false)),
			@AttributeOverride(name = "ufeEmaExaSigla", column = @Column(name = "UFE_EMA_EXA_SIGLA", nullable = false, length = 5)),
			@AttributeOverride(name = "ufeEmaManSeq", column = @Column(name = "UFE_EMA_MAN_SEQ", nullable = false)) })
	public AelConfigMapaExamesId getId() {
		return this.id;
	}

	public void setId(AelConfigMapaExamesId id) {
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
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "UFE_EMA_EXA_SIGLA", referencedColumnName = "EMA_EXA_SIGLA",insertable=false, updatable=false),
			@JoinColumn(name = "UFE_EMA_MAN_SEQ", referencedColumnName = "EMA_MAN_SEQ",insertable=false, updatable=false),
			@JoinColumn(name = "UFE_UNF_SEQ", referencedColumnName = "UNF_SEQ",insertable=false, updatable=false)})
	public AelUnfExecutaExames getAelUnfExecutaExames() {
		return this.aelUnfExecutaExames;
	}

	public void setAelUnfExecutaExames(AelUnfExecutaExames aelUnfExecutaExames) {
		this.aelUnfExecutaExames = aelUnfExecutaExames;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CGM_SEQ",insertable=false, updatable=false)
	public AelConfigMapa getConfigMapa() {
		return configMapa;
	}

	public void setConfigMapa(AelConfigMapa configMapa) {
		this.configMapa = configMapa;
	}


	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}
	
	public enum Fields {
		AEL_UNF_EXECUTA_EXAMES("aelUnfExecutaExames"),
		CONFIG_MAPA("configMapa"),
		RAP_SERVIDORES("rapServidores"),
		UFE_EMA_EXA_SIGLA("id.ufeEmaExaSigla"),
		UFE_EMA_MAN_SEQ("id.ufeEmaManSeq"),
		UFE_UNF_SEQ("id.ufeUnfSeq"),
		CGM_SEQ("id.cgmSeq"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm");

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
		if (!(obj instanceof AelConfigMapaExames)) {
			return false;
		}
		AelConfigMapaExames other = (AelConfigMapaExames) obj;
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