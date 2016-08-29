package br.gov.mec.aghu.model;

// Generated 10/03/2011 17:20:24 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelOrdExameMatAnalises generated by hbm2java
 */

@Entity
@Table(name = "AEL_ORD_EXAME_MAT_ANALISES", schema = "AGH")
public class AelOrdExameMatAnalise extends BaseEntityId<AelOrdExameMatAnaliseId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5927695192817182651L;
	private AelOrdExameMatAnaliseId id;
	private AelExamesMaterialAnalise examesMaterialAnalise;
	private Short ordemNivel1;
	private Short ordemNivel2;
	private Date criadoEm;
	private RapServidores servidor;
	private AelExames exame;
	private Integer version;

	public AelOrdExameMatAnalise() {
	}

	public AelOrdExameMatAnalise(AelOrdExameMatAnaliseId id,
			Short ordemNivel1, Short ordemNivel2, Date criadoEm,
			RapServidores servidor) {
		this.id = id;
		this.ordemNivel1 = ordemNivel1;
		this.ordemNivel2 = ordemNivel2;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "emaExaSigla", column = @Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)),
			@AttributeOverride(name = "emaManSeq", column = @Column(name = "EMA_MAN_SEQ", nullable = false, precision = 5, scale = 0)) })
	public AelOrdExameMatAnaliseId getId() {
		return this.id;
	}

	public void setId(AelOrdExameMatAnaliseId id) {
		this.id = id;
	}

	@Column(name = "ORDEM_NIVEL1", nullable = false, precision = 2, scale = 0)
	public Short getOrdemNivel1() {
		return this.ordemNivel1;
	}

	public void setOrdemNivel1(Short ordemNivel1) {
		this.ordemNivel1 = ordemNivel1;
	}

	@Column(name = "ORDEM_NIVEL2", nullable = false, precision = 4, scale = 0)
	public Short getOrdemNivel2() {
		return this.ordemNivel2;
	}

	public void setOrdemNivel2(Short ordemNivel2) {
		this.ordemNivel2 = ordemNivel2;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "EMA_EXA_SIGLA", referencedColumnName = "EXA_SIGLA", insertable = false, updatable = false),
			@JoinColumn(name = "EMA_MAN_SEQ", referencedColumnName = "MAN_SEQ", insertable = false, updatable = false) })
	public AelExamesMaterialAnalise getExamesMaterialAnalise() {
		return examesMaterialAnalise;
	}

	public void setExamesMaterialAnalise(AelExamesMaterialAnalise examesMaterialAnalise) {
		this.examesMaterialAnalise = examesMaterialAnalise;
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
		EMA_EXA_SIGLA("id.emaExaSigla"),
		EMA_MAN_SEQ("id.emaManSeq"),
		ORDEM_NIVEL1("ordemNivel1"),
		ORDEM_NIVEL2("ordemNivel2"),
		CRIADO_EM("criadoEm"),
		SERVIDOR("servidor"),
		EXAME_MAT_ANALISE("examesMaterialAnalise"),
		EXAME("exame"),
		DESCRICAO_EXAME("exame.descricao"),
		DESCRICAO_MATERIAL_ANALISE("examesMaterialAnalise.aelMateriaisAnalises.descricao");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "EMA_EXA_SIGLA", referencedColumnName = "SIGLA", insertable = false, updatable = false)})
	public AelExames getExame() {
		return exame;
	}

	public void setExame(AelExames exame) {
		this.exame = exame;
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
		if (!(obj instanceof AelOrdExameMatAnalise)) {
			return false;
		}
		AelOrdExameMatAnalise other = (AelOrdExameMatAnalise) obj;
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