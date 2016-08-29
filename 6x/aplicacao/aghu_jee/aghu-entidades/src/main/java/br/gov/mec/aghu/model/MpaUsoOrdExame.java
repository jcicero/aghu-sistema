package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MpaUsoOrdExame generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mpaUoeSq1", sequenceName="AGH.MPA_UOE_SQ1", allocationSize = 1)
@Table(name = "MPA_USO_ORD_EXAMES", schema = "AGH")
public class MpaUsoOrdExame extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8335997946836178118L;
	private Integer seq;
	private Integer version;
	private MpaUsoOrdExame mpaUsoOrdExame;
	private RapServidores rapServidores;
	private MpaUsoExameDiagnostico mpaUsoExameDiagnostico;
	private MpaCadOrdExame mpaCadOrdExame;
	private Date criadoEm;
	private String infClinicas;
	private String recemNascido;
	private String usaAntimicrobianos;
	private String indSituacao;
	private Set<MpaUsoOrdItemExame> mpaUsoOrdItemExamees = new HashSet<MpaUsoOrdItemExame>(0);
	private Set<MpaUsoOrdExame> mpaUsoOrdExamees = new HashSet<MpaUsoOrdExame>(0);

	public MpaUsoOrdExame() {
	}

	public MpaUsoOrdExame(Integer seq, RapServidores rapServidores, MpaUsoExameDiagnostico mpaUsoExameDiagnostico, Date criadoEm,
			String indSituacao) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.mpaUsoExameDiagnostico = mpaUsoExameDiagnostico;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
	}

	public MpaUsoOrdExame(Integer seq, MpaUsoOrdExame mpaUsoOrdExame, RapServidores rapServidores,
			MpaUsoExameDiagnostico mpaUsoExameDiagnostico, MpaCadOrdExame mpaCadOrdExame, Date criadoEm, String infClinicas,
			String recemNascido, String usaAntimicrobianos, String indSituacao, Set<MpaUsoOrdItemExame> mpaUsoOrdItemExamees,
			Set<MpaUsoOrdExame> mpaUsoOrdExamees) {
		this.seq = seq;
		this.mpaUsoOrdExame = mpaUsoOrdExame;
		this.rapServidores = rapServidores;
		this.mpaUsoExameDiagnostico = mpaUsoExameDiagnostico;
		this.mpaCadOrdExame = mpaCadOrdExame;
		this.criadoEm = criadoEm;
		this.infClinicas = infClinicas;
		this.recemNascido = recemNascido;
		this.usaAntimicrobianos = usaAntimicrobianos;
		this.indSituacao = indSituacao;
		this.mpaUsoOrdItemExamees = mpaUsoOrdItemExamees;
		this.mpaUsoOrdExamees = mpaUsoOrdExamees;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mpaUoeSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
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
	@JoinColumn(name = "UOE_SEQ")
	public MpaUsoOrdExame getMpaUsoOrdExame() {
		return this.mpaUsoOrdExame;
	}

	public void setMpaUsoOrdExame(MpaUsoOrdExame mpaUsoOrdExame) {
		this.mpaUsoOrdExame = mpaUsoOrdExame;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "UED_USP_APA_ATD_SEQ", referencedColumnName = "USP_APA_ATD_SEQ", nullable = false),
			@JoinColumn(name = "UED_USP_APA_SEQ", referencedColumnName = "USP_APA_SEQ", nullable = false),
			@JoinColumn(name = "UED_USP_VPA_PTA_SEQ", referencedColumnName = "USP_VPA_PTA_SEQ", nullable = false),
			@JoinColumn(name = "UED_USP_VPA_SEQP", referencedColumnName = "USP_VPA_SEQP", nullable = false),
			@JoinColumn(name = "UED_USP_SEQ", referencedColumnName = "USP_SEQ", nullable = false),
			@JoinColumn(name = "UED_CED_CIT_VPA_PTA_SEQ", referencedColumnName = "CED_CIT_VPA_PTA_SEQ", nullable = false),
			@JoinColumn(name = "UED_CED_CIT_VPA_SEQP", referencedColumnName = "CED_CIT_VPA_SEQP", nullable = false),
			@JoinColumn(name = "UED_CED_CIT_SEQP", referencedColumnName = "CED_CIT_SEQP", nullable = false),
			@JoinColumn(name = "UED_CED_SEQP", referencedColumnName = "CED_SEQP", nullable = false) })
	public MpaUsoExameDiagnostico getMpaUsoExameDiagnostico() {
		return this.mpaUsoExameDiagnostico;
	}

	public void setMpaUsoExameDiagnostico(MpaUsoExameDiagnostico mpaUsoExameDiagnostico) {
		this.mpaUsoExameDiagnostico = mpaUsoExameDiagnostico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COX_SEQ")
	public MpaCadOrdExame getMpaCadOrdExame() {
		return this.mpaCadOrdExame;
	}

	public void setMpaCadOrdExame(MpaCadOrdExame mpaCadOrdExame) {
		this.mpaCadOrdExame = mpaCadOrdExame;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "INF_CLINICAS", length = 500)
	@Length(max = 500)
	public String getInfClinicas() {
		return this.infClinicas;
	}

	public void setInfClinicas(String infClinicas) {
		this.infClinicas = infClinicas;
	}

	@Column(name = "RECEM_NASCIDO", length = 1)
	@Length(max = 1)
	public String getRecemNascido() {
		return this.recemNascido;
	}

	public void setRecemNascido(String recemNascido) {
		this.recemNascido = recemNascido;
	}

	@Column(name = "USA_ANTIMICROBIANOS", length = 1)
	@Length(max = 1)
	public String getUsaAntimicrobianos() {
		return this.usaAntimicrobianos;
	}

	public void setUsaAntimicrobianos(String usaAntimicrobianos) {
		this.usaAntimicrobianos = usaAntimicrobianos;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 2)
	@Length(max = 2)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mpaUsoOrdExame")
	public Set<MpaUsoOrdItemExame> getMpaUsoOrdItemExamees() {
		return this.mpaUsoOrdItemExamees;
	}

	public void setMpaUsoOrdItemExamees(Set<MpaUsoOrdItemExame> mpaUsoOrdItemExamees) {
		this.mpaUsoOrdItemExamees = mpaUsoOrdItemExamees;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mpaUsoOrdExame")
	public Set<MpaUsoOrdExame> getMpaUsoOrdExamees() {
		return this.mpaUsoOrdExamees;
	}

	public void setMpaUsoOrdExamees(Set<MpaUsoOrdExame> mpaUsoOrdExamees) {
		this.mpaUsoOrdExamees = mpaUsoOrdExamees;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		MPA_USO_ORD_EXAMES("mpaUsoOrdExame"),
		RAP_SERVIDORES("rapServidores"),
		MPA_USO_EXAME_DIAGNOSTICOS("mpaUsoExameDiagnostico"),
		MPA_CAD_ORD_EXAMES("mpaCadOrdExame"),
		CRIADO_EM("criadoEm"),
		INF_CLINICAS("infClinicas"),
		RECEM_NASCIDO("recemNascido"),
		USA_ANTIMICROBIANOS("usaAntimicrobianos"),
		IND_SITUACAO("indSituacao"),
		MPA_USO_ORD_ITEM_EXAMEES("mpaUsoOrdItemExamees"),
		MPA_USO_ORD_EXAMEES("mpaUsoOrdExamees");

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
		if (!(obj instanceof MpaUsoOrdExame)) {
			return false;
		}
		MpaUsoOrdExame other = (MpaUsoOrdExame) obj;
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
