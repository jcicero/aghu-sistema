package br.gov.mec.aghu.model;

// Generated 15/03/2012 12:28:14 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AfaTempoEstabilidades generated by hbm2java
 */
@Entity
@Table(name = "AFA_TEMPO_ESTABILIDADES")
public class AfaTempoEstabilidades extends BaseEntityId<AfaTempoEstabilidadesId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1030734494608672327L;
	private AfaTempoEstabilidadesId id;
	private Integer version;
	private Short utpSeq;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Short tempo;
	private Date criadoEm;
	private String indSituacao;

	public AfaTempoEstabilidades() {
	}
	
	public enum Fields{
		UTPSEQ("utpSeq");
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}

	public AfaTempoEstabilidades(AfaTempoEstabilidadesId id, Short utpSeq,
			Integer serMatricula, Short serVinCodigo, Short tempo, Date criadoEm) {
		this.id = id;
		this.utpSeq = utpSeq;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.tempo = tempo;
		this.criadoEm = criadoEm;
	}

	public AfaTempoEstabilidades(AfaTempoEstabilidadesId id, Short utpSeq,
			Integer serMatricula, Short serVinCodigo, Short tempo, Date criadoEm,
			String indSituacao) {
		this.id = id;
		this.utpSeq = utpSeq;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.tempo = tempo;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "medMatCodigo", column = @Column(name = "MED_MAT_CODIGO", nullable = false)),
			@AttributeOverride(name = "condicaoEstabilidade", column = @Column(name = "CONDICAO_ESTABILIDADE", nullable = false, length = 1)) })
	public AfaTempoEstabilidadesId getId() {
		return this.id;
	}

	public void setId(AfaTempoEstabilidadesId id) {
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

	@Column(name = "UTP_SEQ", nullable = false)
	public Short getUtpSeq() {
		return this.utpSeq;
	}

	public void setUtpSeq(Short utpSeq) {
		this.utpSeq = utpSeq;
	}

	@Column(name = "SER_MATRICULA", nullable = false)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "TEMPO", nullable = false)
	public Short getTempo() {
		return this.tempo;
	}

	public void setTempo(Short tempo) {
		this.tempo = tempo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
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
		if (!(obj instanceof AfaTempoEstabilidades)) {
			return false;
		}
		AfaTempoEstabilidades other = (AfaTempoEstabilidades) obj;
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
