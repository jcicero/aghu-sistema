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
 * AelTopografiaAps generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelLo7Sq1", sequenceName="AGH.AEL_LO7_SQ1", allocationSize = 1)
@Table(name = "AEL_TOPOGRAFIA_APS")
public class AelTopografiaAps extends BaseEntitySeq<Long> implements java.io.Serializable {

	private static final long serialVersionUID = 943837523859993708L;
	
	private Long seq;
	private AelTopografiaAparelhos aelTopografiaAparelhos;
	private Date criadoEm;
	private AelExameAp aelExameAp;
	private RapServidores servidor;
	private Integer version;
	
	public AelTopografiaAps() {
	}
	
	public AelTopografiaAps(Long seq,
			AelTopografiaAparelhos aelTopografiaAparelhos, Date criadoEm,
			AelExameAp aelExameAp, RapServidores servidor) {
		super();
		this.seq = seq;
		this.aelTopografiaAparelhos = aelTopografiaAparelhos;
		this.criadoEm = criadoEm;
		this.aelExameAp = aelExameAp;
		this.servidor = servidor;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelLo7Sq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 14, scale = 0)
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "LUA_LUT_SEQ", referencedColumnName = "LUT_SEQ", nullable = false),
			@JoinColumn(name = "LUA_SEQP", referencedColumnName = "SEQP", nullable = false) })
	public AelTopografiaAparelhos getAelTopografiaAparelhos() {
		return this.aelTopografiaAparelhos;
	}

	public void setAelTopografiaAparelhos(
			AelTopografiaAparelhos aelTopografiaAparelhos) {
		this.aelTopografiaAparelhos = aelTopografiaAparelhos;
	}
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LUX_SEQ", nullable = false)
	public AelExameAp getAelExameAp() {
		return this.aelExameAp;
	}

	public void setAelExameAp(AelExameAp aelExameAp) {
		this.aelExameAp = aelExameAp;
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
		LUX_SEQ("aelExameAp.seq"),
		SERVIDOR("servidor"),
		VERSION("version"), 
		AEL_TOPOGRAFIA_APARELHOS("aelTopografiaAparelhos"),
		AEL_TOPOGRAFIA_APARELHOS_DESCRICAO("aelTopografiaAparelhos.descricao"),
		LUA_LUT_SEQ("aelTopografiaAparelhos.id.lutSeq"), 
		LUA_SEQP("aelTopografiaAparelhos.id.seqp");
		
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
		if (!(obj instanceof AelTopografiaAps)) {
			return false;
		}
		AelTopografiaAps other = (AelTopografiaAps) obj;
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
