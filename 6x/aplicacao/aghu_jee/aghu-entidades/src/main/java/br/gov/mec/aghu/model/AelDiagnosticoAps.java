package br.gov.mec.aghu.model;

// Generated 20/04/2012 10:01:23 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;

import br.gov.mec.aghu.dominio.DominioSimNao;
import br.gov.mec.aghu.dominio.DominioSimNaoNaoAplicavel;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AelDiagnosticoAps generated by hbm2java
 */
@SuppressWarnings({"PMD.AghuUsoIndevidoDaEnumDominioSimNaoEntity"})
@Entity
@SequenceGenerator(name="aelLunSq1", sequenceName="AGH.AEL_LUN_SQ1", allocationSize = 1)
@Table(name = "AEL_DIAGNOSTICO_APS")
public class AelDiagnosticoAps extends BaseEntitySeq<Long> implements java.io.Serializable {

	private static final long serialVersionUID = -2878188024401744765L;
	
	private Long seq;
	private AelTopografiaAparelhos aelTopografiaAparelhos;
	
	private AelNomenclaturaEspecs aelNomenclaturaEspecs;
	private AelExameAp aelExameAp;
	private RapServidores servidor;
	private DominioSimNao neoplasiaMaligna;
	private DominioSimNaoNaoAplicavel margemComprometida;
	private DominioSimNao biopsia;
	private String diagnostico;
	private Date criadoEm;
	private Integer version;

	public AelDiagnosticoAps() {
	}

	public AelDiagnosticoAps(Long seq,
			AelTopografiaAparelhos aelTopografiaAparelhos,
			AelNomenclaturaEspecs aelNomenclaturaEspecs,
			AelExameAp aelExameAp, RapServidores servidor,
			DominioSimNao neoplasiaMaligna, DominioSimNaoNaoAplicavel margemComprometida,
			DominioSimNao biopsia, String diagnostico, Date criadoEm) {
		super();
		this.seq = seq;
		this.aelTopografiaAparelhos = aelTopografiaAparelhos;
		this.aelNomenclaturaEspecs = aelNomenclaturaEspecs;
		this.aelExameAp = aelExameAp;
		this.servidor = servidor;
		this.neoplasiaMaligna = neoplasiaMaligna;
		this.margemComprometida = margemComprometida;
		this.biopsia = biopsia;
		this.diagnostico = diagnostico;
		this.criadoEm = criadoEm;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelLunSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 14, scale = 0)
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "LUA_LUT_SEQ", referencedColumnName = "LUT_SEQ"),
			@JoinColumn(name = "LUA_SEQP", referencedColumnName = "SEQP") })
	public AelTopografiaAparelhos getAelTopografiaAparelhos() {
		return this.aelTopografiaAparelhos;
	}

	public void setAelTopografiaAparelhos(
			AelTopografiaAparelhos aelTopografiaAparelhos) {
		this.aelTopografiaAparelhos = aelTopografiaAparelhos;
	}

	@Column(name = "DIAGNOSTICO", length = 32000)
	@Lob
	@Type(type="text")	
	public String getDiagnostico() {
		return this.diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	@Column(name = "NEOPLASIA_MALIGNA", nullable = true, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getNeoplasiaMaligna() {
		return this.neoplasiaMaligna;
	}

	public void setNeoplasiaMaligna(DominioSimNao neoplasiaMaligna) {
		this.neoplasiaMaligna = neoplasiaMaligna;
	}

	@Column(name = "MARGEM_COMPROMETIDA", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNaoNaoAplicavel getMargemComprometida() {
		return this.margemComprometida;
	}

	public void setMargemComprometida(DominioSimNaoNaoAplicavel margemComprometida) {
		this.margemComprometida = margemComprometida;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	@NotNull
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "BIOPSIA", nullable = true, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getBiopsia() {
		return this.biopsia;
	}

	public void setBiopsia(DominioSimNao biopsia) {
		this.biopsia = biopsia;
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
	@JoinColumn(name = "LUX_SEQ", nullable = false)
	@NotNull
	public AelExameAp getAelExameAp() {
		return this.aelExameAp;
	}

	public void setAelExameAp(AelExameAp aelExameAp) {
		this.aelExameAp = aelExameAp;
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
		AEL_TOPOGRAFIA_APARELHOS("aelTopografiaAparelhos"),
		AEL_NOMENCLATURA_ESPECS("aelNomenclaturaEspecs"),
		AEL_EXAME_AP("aelExameAp"),
		SERVIDOR("servidor"),
		NEOPLASIA_MALIGNA("neoplasiaMaligna"),
		MARGEM_COMPROMETIDA("margemComprometida"),
		BIOPSIA("biopsia"),
		DIAGNOSTICO("diagnostico"),
		CRIADO_EM("criadoEm"),
		VERSION("version"), 
		LUX_SEQ("aelExameAp.seq");
		
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
		if (!(obj instanceof AelDiagnosticoAps)) {
			return false;
		}
		AelDiagnosticoAps other = (AelDiagnosticoAps) obj;
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
