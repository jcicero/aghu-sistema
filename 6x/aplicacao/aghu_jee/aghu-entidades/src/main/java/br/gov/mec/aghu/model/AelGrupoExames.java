package br.gov.mec.aghu.model;

// Generated 12/03/2012 13:47:33 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.Set;

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AelGrupoExames generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelGexSq1", sequenceName="AGH.AEL_GEX_SQ1", allocationSize = 1)
@Table(name = "AEL_GRUPO_EXAMES", schema = "AGH")
public class AelGrupoExames extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5948067797090710128L;
	private Integer seq;
	private Integer version;
	private String descricao;
	private AghUnidadesFuncionais unidadeFuncional;
	private DominioSituacao situacao;
	private Date criadoEm;
	private Boolean agendaExMesmoHor;
	private Boolean calculaTempo;
	private RapServidores servidor;
	private Set<AelGradeAgendaExame> gradeAgendaExame;
	private Set<AelGrupoExameUnidExame> grupoExameUnidExame;

	public AelGrupoExames() {
	}

	public AelGrupoExames(Integer seq, String descricao, AghUnidadesFuncionais unidadeFuncional,
			DominioSituacao situacao, Date criadoEm, RapServidores servidor, 
			Boolean agendaExMesmoHor,
			Boolean calculaTempo) {
		this.seq = seq;
		this.descricao = descricao;
		this.unidadeFuncional = unidadeFuncional;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
		this.agendaExMesmoHor = agendaExMesmoHor;
		this.calculaTempo = calculaTempo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelGexSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 7, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Version
	@Column(name = "VERSION", nullable = false, precision = 9, scale = 0)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNF_SEQ", nullable = false)
	public AghUnidadesFuncionais getUnidadeFuncional() {
		return this.unidadeFuncional;
	}

	public void setUnidadeFuncional(AghUnidadesFuncionais unidadeFuncional) {
		this.unidadeFuncional = unidadeFuncional;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
	@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	
	@Column(name = "IND_AGENDA_EX_MESMO_HOR", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getAgendaExMesmoHor() {
		return this.agendaExMesmoHor;
	}

	public void setAgendaExMesmoHor(Boolean agendaExMesmoHor) {
		this.agendaExMesmoHor = agendaExMesmoHor;
	}

	@Column(name = "IND_CALCULA_TEMPO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getCalculaTempo() {
		return this.calculaTempo;
	}

	public void setCalculaTempo(Boolean calculaTempo) {
		this.calculaTempo = calculaTempo;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "grupoExame")
	public Set<AelGradeAgendaExame> getGradeAgendaExame() {
		return gradeAgendaExame;
	}
	
	public void setGradeAgendaExame(Set<AelGradeAgendaExame> gradeAgendaExame) {
		this.gradeAgendaExame = gradeAgendaExame;
	}	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "id.gexSeq")
	public Set<AelGrupoExameUnidExame> getGrupoExameUnidExame() {
		return grupoExameUnidExame;
	}
	
	public void setGrupoExameUnidExame(Set<AelGrupoExameUnidExame> grupoExameUnidExame) {
		this.grupoExameUnidExame = grupoExameUnidExame;
	}	

	public enum Fields {

		SEQ("seq"), 
		DESCRICAO("descricao"), 
		SITUACAO("situacao"), 
		CRIADO_EM("criadoEm"), 
		UNF_SEQ("unidadeFuncional.seq"), 
		UNIDADE_FUNCIONAL("unidadeFuncional"),
		GRADE_AGENDA_EXAME("gradeAgendaExame"),
		IND_AGENDA_EX_MESMO_HOR("agendaExMesmoHor"),
		IND_CALCULA_TEMPO("calculaTempo"),
		GRUPO_EXAME_UNID_EXAME("grupoExameUnidExame");

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
		if (!(obj instanceof AelGrupoExames)) {
			return false;
		}
		AelGrupoExames other = (AelGrupoExames) obj;
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
