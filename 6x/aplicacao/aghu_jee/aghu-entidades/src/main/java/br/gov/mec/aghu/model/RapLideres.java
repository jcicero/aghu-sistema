package br.gov.mec.aghu.model;

// Generated 08/02/2010 14:48:54 by Hibernate Tools 3.2.5.Beta

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
 * RapLideres generated by hbm2java
 */
@Entity
@Table(name = "RAP_LIDERES", schema = "AGH")
public class RapLideres extends BaseEntityId<RapLideresId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4390495096797759395L;
	/**
	 * Chave primária da base de dados.
	 */
	private RapLideresId id;
	/**
	 * Chefia do Centro de Custo
	 */
	private RapChefias chefia;
	/**
	 * Servidor da instituição.
	 */
	private RapServidores servidor;
	/**
	 * Data de início da vigência desta liderança.
	 */
	private Date dtInicio;
	/**
	 * Data de término da vigência desta liderença.
	 */
	private Date dtFim;

	public RapLideres() {
	}

	public RapLideres(RapLideresId id, RapChefias rapChefias, Integer serMatricula,
			Short serVinCodigo, Date dtInicio) {
		this.id = id;
		this.chefia = rapChefias;
		this.dtInicio = dtInicio;
	}

	public RapLideres(RapLideresId id, RapChefias rapChefias, Integer serMatricula,
			Short serVinCodigo, Date dtInicio, Date dtFim) {
		this.id = id;
		this.chefia = rapChefias;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "cheSeq", column = @Column(name = "CHE_SEQ", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 3, scale = 0)) })
	public RapLideresId getId() {
		return this.id;
	}

	public void setId(RapLideresId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CHE_SEQ", nullable = false, insertable = false, updatable = false)
	public RapChefias getChefia() {
		return this.chefia;
	}

	public void setChefia(RapChefias rapChefias) {
		this.chefia = rapChefias;
	}


	@Temporal(TemporalType.DATE)
	@Column(name = "DT_INICIO", nullable = false, length = 7)
	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_FIM", length = 7)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}
	
	public enum Fields {
		DATA_FIM("dtFim");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}

	/**
	 * @return the servidor
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return servidor;
	}

	/**
	 * @param servidor the servidor to set
	 */
	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
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
		if (!(obj instanceof RapLideres)) {
			return false;
		}
		RapLideres other = (RapLideres) obj;
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
