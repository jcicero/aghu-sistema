package br.gov.mec.aghu.model;

// Generated 07/03/2010 18:57:10 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AipPosicaoFonemasPacientes generated by hbm2java
 */
@Entity
@Table(name = "AIP_POSI_FONEMAS_PACIENTES", schema = "AGH")

public class AipPosicaoFonemasPacientes extends BaseEntityId<AipPosicaoFonemasPacientesId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1202768663125597972L;

	private AipPosicaoFonemasPacientesId id;
	
	private AipFonemaPacientes fonema;
	
	private Integer version;
	
	public AipPosicaoFonemasPacientes() {
	}

	public AipPosicaoFonemasPacientes(AipPosicaoFonemasPacientesId id) {
		this.id = id;
	}
	
	public AipPosicaoFonemasPacientes(AipPosicaoFonemasPacientesId id, AipFonemaPacientes fonema) {
		this.id = id;
		this.fonema = fonema;
	}
	
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "seq", column = @Column(name = "FNP_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "posicao", column = @Column(name = "POSICAO", nullable = false, precision = 2, scale = 0))})
	public AipPosicaoFonemasPacientesId getId() {
		return this.id;
	}

	public void setId(AipPosicaoFonemasPacientesId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FNP_SEQ", nullable = false, insertable = false, updatable = false)
	public AipFonemaPacientes getFonema() {
		return fonema;
	}

	public void setFonema(AipFonemaPacientes fonema) {
		this.fonema = fonema;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)	
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public enum Fields {
		CODIGO_PACIENTE("id.seq");
		
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
		if (!(obj instanceof AipPosicaoFonemasPacientes)) {
			return false;
		}
		AipPosicaoFonemasPacientes other = (AipPosicaoFonemasPacientes) obj;
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
