package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

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


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmCuidadoUsualUnf generated by hbm2java
 */
@Entity
@Table(name = "MPM_CUIDADO_USUAL_UNFS", schema = "AGH")
public class MpmCuidadoUsualUnf extends BaseEntityId<MpmCuidadoUsualUnfId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3251471536099123589L;
	private MpmCuidadoUsualUnfId id;
	private MpmCuidadoUsual mpmCuidadoUsuais;
	private Date criadoEm;
	private RapServidores rapServidores;
	private AghUnidadesFuncionais unidadeFuncional;

	public MpmCuidadoUsualUnf() {
	}

	public MpmCuidadoUsualUnf(MpmCuidadoUsualUnfId id,
			MpmCuidadoUsual mpmCuidadoUsuais, Date criadoEm,
			RapServidores rapServidores) {
		this.id = id;
		this.mpmCuidadoUsuais = mpmCuidadoUsuais;
		this.criadoEm = criadoEm;
		this.rapServidores = rapServidores;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "cduSeq", column = @Column(name = "CDU_SEQ", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "unfSeq", column = @Column(name = "UNF_SEQ", nullable = false, precision = 4, scale = 0)) })
	public MpmCuidadoUsualUnfId getId() {
		return this.id;
	}

	public void setId(MpmCuidadoUsualUnfId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CDU_SEQ", nullable = false, insertable = false, updatable = false)
	public MpmCuidadoUsual getMpmCuidadoUsuais() {
		return this.mpmCuidadoUsuais;
	}

	public void setMpmCuidadoUsuais(MpmCuidadoUsual mpmCuidadoUsuais) {
		this.mpmCuidadoUsuais = mpmCuidadoUsuais;
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
	@JoinColumns( { @JoinColumn(name = "SER_MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO") })
	public RapServidores getRapServidores() {
		return rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	public enum Fields {
		ID("id"), CDU_SEQ("mpmCuidadoUsuais"), UNIDADE_FUNCIONAL(
				"unidadeFuncional"), CRIADO_EM("criadoEm"), RAP_SERVIDORES(
				"rapServidores");

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
	@JoinColumn(name = "UNF_SEQ", nullable = false, insertable = false, updatable = false)
	public AghUnidadesFuncionais getUnidadeFuncional() {
		return unidadeFuncional;
	}

	public void setUnidadeFuncional(AghUnidadesFuncionais unidadeFuncional) {
		this.unidadeFuncional = unidadeFuncional;
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
		if (!(obj instanceof MpmCuidadoUsualUnf)) {
			return false;
		}
		MpmCuidadoUsualUnf other = (MpmCuidadoUsualUnf) obj;
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
