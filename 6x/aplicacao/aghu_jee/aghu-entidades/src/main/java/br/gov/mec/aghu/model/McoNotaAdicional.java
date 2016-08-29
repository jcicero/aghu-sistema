package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioEventoNotaAdicional;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * McoNotaAdicional generated by hbm2java
 */
@Entity
@Table(name = "MCO_NOTAS_ADICIONAIS", schema = "AGH")
public class McoNotaAdicional extends BaseEntityId<McoNotaAdicionalId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3695485956042998148L;
	private McoNotaAdicionalId id;
	private Integer version;
	private DominioEventoNotaAdicional evento;
	private Integer conNumero;
	private Short rnaSeqp;
	private String notaAdicional;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Date criadoEm;

	public McoNotaAdicional() {
	}

	public McoNotaAdicional(McoNotaAdicionalId id, DominioEventoNotaAdicional evento, Integer serMatricula, Short serVinCodigo, Date criadoEm) {
		this.id = id;
		this.evento = evento;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.criadoEm = criadoEm;
	}

	public McoNotaAdicional(McoNotaAdicionalId id, DominioEventoNotaAdicional evento, Integer conNumero, Short rnaSeqp, String notaAdicional,
			Integer serMatricula, Short serVinCodigo, Date criadoEm) {
		this.id = id;
		this.evento = evento;
		this.conNumero = conNumero;
		this.rnaSeqp = rnaSeqp;
		this.notaAdicional = notaAdicional;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "gsoPacCodigo", column = @Column(name = "GSO_PAC_CODIGO", nullable = false)),
			@AttributeOverride(name = "gsoSeqp", column = @Column(name = "GSO_SEQP", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public McoNotaAdicionalId getId() {
		return this.id;
	}

	public void setId(McoNotaAdicionalId id) {
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

	@Column(name = "EVENTO", nullable = false, length = 30)
	@Enumerated(EnumType.STRING)
	public DominioEventoNotaAdicional getEvento() {
		return this.evento;
	}

	public void setEvento(DominioEventoNotaAdicional evento) {
		this.evento = evento;
	}

	@Column(name = "CON_NUMERO")
	public Integer getConNumero() {
		return this.conNumero;
	}

	public void setConNumero(Integer conNumero) {
		this.conNumero = conNumero;
	}

	@Column(name = "RNA_SEQP")
	public Short getRnaSeqp() {
		return this.rnaSeqp;
	}

	public void setRnaSeqp(Short rnaSeqp) {
		this.rnaSeqp = rnaSeqp;
	}

	@Column(name = "NOTA_ADICIONAL", length = 3000)
	@Length(max = 3000)
	public String getNotaAdicional() {
		return this.notaAdicional;
	}

	public void setNotaAdicional(String notaAdicional) {
		this.notaAdicional = notaAdicional;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

		ID("id"),
		GSO_PAC_CODIGO("id.gsoPacCodigo"),
		GSO_SEQP("id.gsoSeqp"),
		SEQP("id.seqp"),
		VERSION("version"),
		EVENTO("evento"),
		CON_NUMERO("conNumero"),
		RNA_SEQP("rnaSeqp"),
		NOTA_ADICIONAL("notaAdicional"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		CRIADO_EM("criadoEm");

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
		if (!(obj instanceof McoNotaAdicional)) {
			return false;
		}
		McoNotaAdicional other = (McoNotaAdicional) obj;
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
