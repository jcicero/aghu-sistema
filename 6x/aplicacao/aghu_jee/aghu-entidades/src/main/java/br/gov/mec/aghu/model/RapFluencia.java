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
 * RapFluencia generated by hbm2java
 */
@Entity
@Table(name = "RAP_FLUENCIAS", schema = "AGH")
public class RapFluencia extends BaseEntityId<RapFluenciaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8584574403274809280L;
	private RapFluenciaId id;
	private Integer version;
	private RapServidores rapServidores;
	private RapIdioma rapIdioma;
	private RapPessoasFisicas rapPessoasFisicas;
	private String indFala;
	private String indLe;
	private String indEscreve;
	private Date alteradoEm;

	public RapFluencia() {
	}

	public RapFluencia(RapFluenciaId id, RapIdioma rapIdioma, RapPessoasFisicas rapPessoasFisicas, String indFala, String indLe,
			String indEscreve) {
		this.id = id;
		this.rapIdioma = rapIdioma;
		this.rapPessoasFisicas = rapPessoasFisicas;
		this.indFala = indFala;
		this.indLe = indLe;
		this.indEscreve = indEscreve;
	}

	public RapFluencia(RapFluenciaId id, RapServidores rapServidores, RapIdioma rapIdioma, RapPessoasFisicas rapPessoasFisicas,
			String indFala, String indLe, String indEscreve, Date alteradoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.rapIdioma = rapIdioma;
		this.rapPessoasFisicas = rapPessoasFisicas;
		this.indFala = indFala;
		this.indLe = indLe;
		this.indEscreve = indEscreve;
		this.alteradoEm = alteradoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "pesCodigo", column = @Column(name = "PES_CODIGO", nullable = false)),
			@AttributeOverride(name = "idiCodigo", column = @Column(name = "IDI_CODIGO", nullable = false)) })
	public RapFluenciaId getId() {
		return this.id;
	}

	public void setId(RapFluenciaId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "IDI_CODIGO", nullable = false, insertable = false, updatable = false)
	public RapIdioma getRapIdioma() {
		return this.rapIdioma;
	}

	public void setRapIdioma(RapIdioma rapIdioma) {
		this.rapIdioma = rapIdioma;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PES_CODIGO", nullable = false, insertable = false, updatable = false)
	public RapPessoasFisicas getRapPessoasFisicas() {
		return this.rapPessoasFisicas;
	}

	public void setRapPessoasFisicas(RapPessoasFisicas rapPessoasFisicas) {
		this.rapPessoasFisicas = rapPessoasFisicas;
	}

	@Column(name = "IND_FALA", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndFala() {
		return this.indFala;
	}

	public void setIndFala(String indFala) {
		this.indFala = indFala;
	}

	@Column(name = "IND_LE", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndLe() {
		return this.indLe;
	}

	public void setIndLe(String indLe) {
		this.indLe = indLe;
	}

	@Column(name = "IND_ESCREVE", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndEscreve() {
		return this.indEscreve;
	}

	public void setIndEscreve(String indEscreve) {
		this.indEscreve = indEscreve;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		RAP_IDIOMAS("rapIdioma"),
		RAP_PESSOAS_FISICAS("rapPessoasFisicas"),
		IND_FALA("indFala"),
		IND_LE("indLe"),
		IND_ESCREVE("indEscreve"),
		ALTERADO_EM("alteradoEm");

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
		if (!(obj instanceof RapFluencia)) {
			return false;
		}
		RapFluencia other = (RapFluencia) obj;
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
