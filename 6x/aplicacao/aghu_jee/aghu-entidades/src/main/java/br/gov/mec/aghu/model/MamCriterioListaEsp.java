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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MamCriterioListaEsp generated by hbm2java
 */
@Entity
@Table(name = "MAM_CRITERIO_LISTA_ESPS", schema = "AGH")
public class MamCriterioListaEsp extends BaseEntityId<MamCriterioListaEspId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3135788746853732529L;
	private MamCriterioListaEspId id;
	private Integer version;
	private AghEspecialidades aghEspecialidades;
	private MamCriterioMinhaLista mamCriterioMinhaLista;
	private Date criadoEm;
	private String indSituacao;

	public MamCriterioListaEsp() {
	}

	public MamCriterioListaEsp(MamCriterioListaEspId id, AghEspecialidades aghEspecialidades,
			MamCriterioMinhaLista mamCriterioMinhaLista, Date criadoEm, String indSituacao) {
		this.id = id;
		this.aghEspecialidades = aghEspecialidades;
		this.mamCriterioMinhaLista = mamCriterioMinhaLista;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "cmlSeq", column = @Column(name = "CML_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public MamCriterioListaEspId getId() {
		return this.id;
	}

	public void setId(MamCriterioListaEspId id) {
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
	@JoinColumn(name = "ESP_SEQ", nullable = false)
	public AghEspecialidades getAghEspecialidades() {
		return this.aghEspecialidades;
	}

	public void setAghEspecialidades(AghEspecialidades aghEspecialidades) {
		this.aghEspecialidades = aghEspecialidades;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CML_SEQ", nullable = false, insertable = false, updatable = false)
	public MamCriterioMinhaLista getMamCriterioMinhaLista() {
		return this.mamCriterioMinhaLista;
	}

	public void setMamCriterioMinhaLista(MamCriterioMinhaLista mamCriterioMinhaLista) {
		this.mamCriterioMinhaLista = mamCriterioMinhaLista;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		AGH_ESPECIALIDADES("aghEspecialidades"),
		MAM_CRITERIO_MINHA_LISTAS("mamCriterioMinhaLista"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao");

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
		if (!(obj instanceof MamCriterioListaEsp)) {
			return false;
		}
		MamCriterioListaEsp other = (MamCriterioListaEsp) obj;
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
