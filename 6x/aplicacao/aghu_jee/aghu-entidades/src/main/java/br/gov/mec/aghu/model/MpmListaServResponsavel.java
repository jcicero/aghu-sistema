package br.gov.mec.aghu.model;

// Generated 28/09/2011 11:01:38 by Hibernate Tools 3.4.0.CR1

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


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmListaServResponsaveis generated by hbm2java
 */

@Entity
@Table(name = "MPM_LISTA_SERV_RESPONSAVEIS", schema = "AGH")
public class MpmListaServResponsavel extends BaseEntityId<MpmListaServResponsavelId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4390167117672545436L;

	private MpmListaServResponsavelId id;
	
	private RapServidores servidor;
	private RapServidores servidorResponsavel;
	
	private Date criadoEm;

	// TODO ADICIONAR VERSION


	public MpmListaServResponsavel() {
	}

	public MpmListaServResponsavel(MpmListaServResponsavelId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA", nullable = false)),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO", nullable = false)),
			@AttributeOverride(name = "serMatriculaResponsavel", column = @Column(name = "SER_MATRICULA_RESPONSAVEL", nullable = false)),
			@AttributeOverride(name = "serVinCodigoResponsavel", column = @Column(name = "SER_VIN_CODIGO_RESPONSAVEL", nullable = false)) })
	public MpmListaServResponsavelId getId() {
		return this.id;
	}

	public void setId(MpmListaServResponsavelId id) {
		this.id = id;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false, insertable=false, updatable=false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false, insertable=false, updatable=false) })
	public RapServidores getServidor() {
		return servidor;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_RESPONSAVEL", referencedColumnName = "MATRICULA", nullable = false, insertable=false, updatable=false),
			@JoinColumn(name = "SER_VIN_CODIGO_RESPONSAVEL", referencedColumnName = "VIN_CODIGO", nullable = false, insertable=false, updatable=false) })
	public RapServidores getServidorResponsavel() {
		return servidorResponsavel;
	}


	
	@Column(name = "CRIADO_EM", nullable = true)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	public void setServidorResponsavel(RapServidores servidorResponsavel) {
		this.servidorResponsavel = servidorResponsavel;
	}
	
	public enum Fields {
		SERVIDOR("servidor"),
		SERVIDOR_RESPONSAVEL("servidorResponsavel"),
		CRIADO_EM("criadoEm");

		private String field;

		private Fields(String field) {
			this.field = field;
		}

		@Override
		public String toString() {
			return this.field;
		}
	}
	
	@Override
	public boolean equals(Object other) {
		if (!(other instanceof MpmListaServResponsavel)) {
			return false;
		}
		MpmListaServResponsavel castOther = (MpmListaServResponsavel) other;
		return new EqualsBuilder().append(this.id, castOther.getId())
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.id).toHashCode();
	}

}
