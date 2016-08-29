package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

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


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AnuViaAdmEtiqueta generated by hbm2java
 */
@Entity
@Table(name = "ANU_VIA_ADM_ETIQUETAS", schema = "AGH")
public class AnuViaAdmEtiqueta extends BaseEntityId<AnuViaAdmEtiquetaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -646735696565564520L;
	private AnuViaAdmEtiquetaId id;
	private Integer version;
	private RapServidores rapServidores;
	private Date criadoEm;
	private String indSituacao;
	private String descricao;

	public AnuViaAdmEtiqueta() {
	}

	public AnuViaAdmEtiqueta(AnuViaAdmEtiquetaId id, RapServidores rapServidores, Date criadoEm, String descricao) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
		this.descricao = descricao;
	}

	public AnuViaAdmEtiqueta(AnuViaAdmEtiquetaId id, RapServidores rapServidores, Date criadoEm, String indSituacao, String descricao) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.descricao = descricao;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "viaAdm", column = @Column(name = "VIA_ADM", nullable = false, length = 15)),
			@AttributeOverride(name = "tipoPac", column = @Column(name = "TIPO_PAC", nullable = false, length = 15)) })
	public AnuViaAdmEtiquetaId getId() {
		return this.id;
	}

	public void setId(AnuViaAdmEtiquetaId id) {
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
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

	@Column(name = "DESCRICAO", nullable = false, length = 500)
	@Length(max = 500)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao"),
		DESCRICAO("descricao");

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
		if (!(obj instanceof AnuViaAdmEtiqueta)) {
			return false;
		}
		AnuViaAdmEtiqueta other = (AnuViaAdmEtiqueta) obj;
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
