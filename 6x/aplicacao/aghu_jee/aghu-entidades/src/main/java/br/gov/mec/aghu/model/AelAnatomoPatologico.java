package br.gov.mec.aghu.model;

// Generated 10/04/2012 14:34:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AelAnatomoPatologicos generated by hbm2java
 */
@Entity
@SequenceGenerator(name = "aelLumSq1", sequenceName = "AGH.AEL_LUM_SQ1", allocationSize = 1)
@Table(name = "AEL_ANATOMO_PATOLOGICOS",
	uniqueConstraints = @UniqueConstraint(columnNames = { "LU2_SEQ", "NUMERO_AP" }))
public class AelAnatomoPatologico extends BaseEntitySeq<Long> implements java.io.Serializable {

	private static final long serialVersionUID = 8547727056995473448L;

	private Long seq;
	private Long numeroAp;
	private Date criadoEm;

	private AelAtendimentoDiversos atendimentoDiversos;

	private AghAtendimentos atendimento;
	private RapServidores servidor;
	private Integer version;

	private Set<AelExameAp> aelExameApses = new HashSet<AelExameAp>(0);
	private Set<AelExameAp> aelExameApsOrigens = new HashSet<AelExameAp>(0);
	private Set<AelApXPatologista> aelApXPatologistas = new HashSet<AelApXPatologista>(0);
	
	private AelConfigExLaudoUnico configExame;
	
	private Integer lu2VersaoConf;

	public AelAnatomoPatologico() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelLumSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 14, scale = 0)
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(final Long seq) {
		this.seq = seq;
	}

	@Column(name = "NUMERO_AP", nullable = false, precision = 10, scale = 0)
	public Long getNumeroAp() {
		return this.numeroAp;
	}

	public void setNumeroAp(final Long numeroAp) {
		this.numeroAp = numeroAp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(final Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATV_SEQ")
	public AelAtendimentoDiversos getAtendimentoDiversos() {
		return atendimentoDiversos;
	}

	public void setAtendimentoDiversos(final AelAtendimentoDiversos atendimentoDiversos) {
		this.atendimentoDiversos = atendimentoDiversos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATD_SEQ")
	public AghAtendimentos getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(final AghAtendimentos atendimento) {
		this.atendimento = atendimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(final RapServidores servidor) {
		this.servidor = servidor;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return version;
	}

	public void setVersion(final Integer version) {
		this.version = version;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aelAnatomoPatologicos")
	public Set<AelExameAp> getAelExameApses() {
		return this.aelExameApses;
	}

	public void setAelExameApses(final Set<AelExameAp> aelExameApses) {
		this.aelExameApses = aelExameApses;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aelAnatomoPatologicos")
	public Set<AelExameAp> getAelExameApsOrigens() {
		return this.aelExameApsOrigens;
	}

	public void setAelExameApsOrigens(final Set<AelExameAp> aelExameApsOrigens) {
		this.aelExameApsOrigens = aelExameApsOrigens;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aelAnatomoPatologicos")
	public Set<AelApXPatologista> getAelApXPatologistas() {
		return aelApXPatologistas;
	}

	public void setAelApXPatologistas(final Set<AelApXPatologista> aelApXPatologistas) {
		this.aelApXPatologistas = aelApXPatologistas;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LU2_SEQ", nullable = false)
	public AelConfigExLaudoUnico getConfigExame() {
		return configExame;
	}

	public void setConfigExame(AelConfigExLaudoUnico configExame) {
		this.configExame = configExame;
	}
	
	@Column(name = "LU2_VERSAO_CONF", nullable = false)
	public Integer getLu2VersaoConf() {
		return lu2VersaoConf;
	}

	public void setLu2VersaoConf(Integer lu2VersaoConf) {
		this.lu2VersaoConf = lu2VersaoConf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seq == null) ? 0 : seq.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final AelAnatomoPatologico other = (AelAnatomoPatologico) obj;
		if (seq == null) {
			if (other.seq != null) {
				return false;
			}
		} else if (!seq.equals(other.seq)) {
			return false;
		}
		return true;
	}

	public enum Fields {
		SEQ("seq"), 
		NUMERO_AP("numeroAp"), 
		AEL_AP_X_PATOLOGISTAS ("aelApXPatologistas"),
		CONFIG_EXAME("configExame"),
		CONFIG_EXAME_SEQ("configExame.seq"),
		AEL_EXAME_AP("aelExameApses"),
		ATD_SEQ("atendimento"),
		ATV_SEQ("atendimentoDiversos"),
		CRIADO_EM("criadoEm")
		;
		
		private String fields;

		private Fields(final String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

}