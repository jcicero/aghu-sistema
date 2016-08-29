package br.gov.mec.aghu.model;

// Generated 14/03/2011 11:13:41 by Hibernate Tools 3.2.5.Beta

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
 * AelCopiaResultados generated by hbm2java
 */

@Entity
@Table(name = "AEL_COPIA_RESULTADOS", schema = "AGH")
public class AelCopiaResultados extends BaseEntityId<AelCopiaResultadosId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4422832617977914372L;
	private AelCopiaResultadosId id;
	private FatConvenioSaude convenioSaude;
	private AelExamesMaterialAnalise examesMaterialAnalise;
	private Byte numero;
	private Date criadoEm;
	private RapServidores servidor;
	private Date alteradoEm;
	private RapServidores servidorAlterado;

	public AelCopiaResultados() {
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "emaExaSigla", column = @Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)),
			@AttributeOverride(name = "emaManSeq", column = @Column(name = "EMA_MAN_SEQ", nullable = false, precision = 5, scale = 0)) })
	public AelCopiaResultadosId getId() {
		return this.id;
	}

	public void setId(AelCopiaResultadosId id) {
		this.id = id;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="CNV_CODIGO", nullable = false, insertable=false, updatable=false)
	public FatConvenioSaude getConvenioSaude() {
		return convenioSaude;
	}

	public void setConvenioSaude(FatConvenioSaude convenioSaude) {
		this.convenioSaude = convenioSaude;
	}

	@Column(name = "NUMERO", nullable = false, precision = 2, scale = 0)
	public Byte getNumero() {
		return this.numero;
	}

	public void setNumero(Byte numero) {
		this.numero = numero;
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
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA", nullable = true),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO", nullable = true) })
	public RapServidores getServidorAlterado() {
		return servidorAlterado;
	}

	public void setServidorAlterado(RapServidores servidorAlterado) {
		this.servidorAlterado = servidorAlterado;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "EMA_EXA_SIGLA", referencedColumnName = "EXA_SIGLA", insertable = false, updatable = false),
			@JoinColumn(name = "EMA_MAN_SEQ", referencedColumnName = "MAN_SEQ", insertable = false, updatable = false) })
	public AelExamesMaterialAnalise getExamesMaterialAnalise() {
		return examesMaterialAnalise;
	}

	public void setExamesMaterialAnalise(
			AelExamesMaterialAnalise examesMaterialAnalise) {
		this.examesMaterialAnalise = examesMaterialAnalise;
	}

	public enum Fields {
		CNV_CODIGO("id.cnvCodigo"), EMA_EXA_SIGLA("id.emaExaSigla"), 
		EMA_MAN_SEQ("id.emaManSeq"), ORIGEM_ATENDIMENTO("id.origemAtendimento"),
		NUMERO("numero"), CRIADO_EM("criadoEm"),SERVIDOR("servidor"),CONVENIO_SAUDE("convenioSaude"),
		ALTERADO_EM("alteradoEm"),SERVIDOR_ALTERADO("servidorAlterado");

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
		if (!(obj instanceof AelCopiaResultados)) {
			return false;
		}
		AelCopiaResultados other = (AelCopiaResultados) obj;
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
