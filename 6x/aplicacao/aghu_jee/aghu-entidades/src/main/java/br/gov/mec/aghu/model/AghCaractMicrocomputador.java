package br.gov.mec.aghu.model;

// Generated 01/07/2011 18:03:49 by Hibernate Tools 3.2.5.Beta

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
 * AghCaractMicrocomputadores generated by hbm2java
 */
@Entity
@Table(name = "AGH_CARACT_MICROCOMPUTADORES", schema = "AGH")
public class AghCaractMicrocomputador extends BaseEntityId<AghCaractMicrocomputadorId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -963789175077392359L;
	private AghCaractMicrocomputadorId id;
	
	private RapServidores servidor;
	private AghMicrocomputador microcomputador;
	private Date criadoEm;
	private Integer version;



	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "micNome", column = @Column(name = "MIC_NOME", nullable = false, length = 50)),
			@AttributeOverride(name = "caracteristica", column = @Column(name = "CARACTERISTICA", nullable = false, length = 30)) })
	public AghCaractMicrocomputadorId getId() {
		return this.id;
	}

	public void setId(AghCaractMicrocomputadorId id) {
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
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MIC_NOME", referencedColumnName = "NOME", nullable = false, insertable = false, updatable = false)
	public AghMicrocomputador getMicrocomputador(){
		return this.microcomputador;
	}
	
	public void setMicrocomputador(AghMicrocomputador microcomputador) {
		this.microcomputador = microcomputador;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	public enum Fields {
		MIC_NOME("id.micNome"),
		CARACTERISTICA("id.caracteristica");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
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
		AghCaractMicrocomputador other = (AghCaractMicrocomputador) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}
