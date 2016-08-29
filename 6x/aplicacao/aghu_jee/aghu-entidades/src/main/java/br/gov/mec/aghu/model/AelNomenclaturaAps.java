package br.gov.mec.aghu.model;

// Generated 20/04/2012 10:01:23 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AelNomenclaturaAps generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelLo6Sq1", sequenceName="AGH.AEL_LO6_SQ1", allocationSize = 1)
@Table(name = "AEL_NOMENCLATURA_APS")
public class AelNomenclaturaAps extends BaseEntitySeq<Long> implements java.io.Serializable {

	private static final long serialVersionUID = 1638697812371636919L;
	
	private Long seq;
	private Date criadoEm;
	private AelExameAp aelExameAp;
	private AelNomenclaturaEspecs aelNomenclaturaEspecs;
	private RapServidores servidor;
	private Integer version;
	
	public AelNomenclaturaAps() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelLo6Sq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 14, scale = 0)
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
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
	@JoinColumn(name = "LUX_SEQ", nullable = false)
	public AelExameAp getAelExameAp() {
		return this.aelExameAp;
	}

	public void setAelExameAp(AelExameAp aelExameAp) {
		this.aelExameAp = aelExameAp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "LUE_LUG_SEQ", referencedColumnName = "LUG_SEQ"),
			@JoinColumn(name = "LUE_SEQP", referencedColumnName = "SEQP") })
	public AelNomenclaturaEspecs getAelNomenclaturaEspecs() {
		return aelNomenclaturaEspecs;
	}

	public void setAelNomenclaturaEspecs(AelNomenclaturaEspecs aelNomenclaturaEspecs) {
		this.aelNomenclaturaEspecs = aelNomenclaturaEspecs;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable=false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable=false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public enum Fields {		
		SEQ("seq"), 
		CRIADO_EM("criadoEm"),
		AEL_EXAME_AP("aelExameAp"),
		AEL_NOMENCLATURA_ESPECS("aelNomenclaturaEspecs"),
		AEL_NOMENCLATURA_ESPECS_DESCRICAO("aelNomenclaturaEspecs.descricao"),
		SERVIDOR("servidor"),
		LUE_LUG_SEQ("aelNomenclaturaEspecs.id.lugSeq"),
		LUE_SEQP("aelNomenclaturaEspecs.id.seqp"),
		LUX_SEQ("aelExameAp.seq"),
		VERSION("version");
		
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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof AelNomenclaturaAps)) {
			return false;
		}
		AelNomenclaturaAps other = (AelNomenclaturaAps) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
