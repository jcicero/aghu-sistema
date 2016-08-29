package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * McoProcReanimacao generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mcoPniSq1", sequenceName="AGH.MCO_PNI_SQ1", allocationSize = 1)
@Table(name = "MCO_PROC_REANIMACOES", schema = "AGH")
public class McoProcReanimacao extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -501315657547860738L;
	
	private Integer seq;
	private Integer version;
	private RapServidores rapServidores;
	private AfaMedicamento afaMedicamento;
	private AbsComponenteSanguineo absComponenteSanguineo;
	private String descricao;
	private DominioSituacao indSituacao;
	private Date criadoEm;
	
	// FIXME Implementar este relacionamento
	// private Set<McoReanimacaoRns> mcoReanimacaoRnses = new HashSet<McoReanimacaoRns>(0);

	public McoProcReanimacao() {
	}

	public McoProcReanimacao(Integer seq, RapServidores rapServidores, String descricao, DominioSituacao indSituacao, Date criadoEm) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	public McoProcReanimacao(Integer seq, RapServidores rapServidores, AfaMedicamento afaMedicamento,
			AbsComponenteSanguineo absComponenteSanguineo, String descricao, DominioSituacao indSituacao, Date criadoEm) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.afaMedicamento = afaMedicamento;
		this.absComponenteSanguineo = absComponenteSanguineo;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mcoPniSq1")
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MED_MAT_CODIGO")
	public AfaMedicamento getAfaMedicamento() {
		return this.afaMedicamento;
	}

	public void setAfaMedicamento(AfaMedicamento afaMedicamento) {
		this.afaMedicamento = afaMedicamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CSA_CODIGO")
	public AbsComponenteSanguineo getAbsComponenteSanguineo() {
		return this.absComponenteSanguineo;
	}

	public void setAbsComponenteSanguineo(AbsComponenteSanguineo absComponenteSanguineo) {
		this.absComponenteSanguineo = absComponenteSanguineo;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 100)
	@Length(max = 100)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Enumerated(EnumType.STRING)
	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@NotNull
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mcoProcReanimacao")
//	public Set<McoReanimacaoRns> getMcoReanimacaoRnses() {
//		return this.mcoReanimacaoRnses;
//	}
//
//	public void setMcoReanimacaoRnses(Set<McoReanimacaoRns> mcoReanimacaoRnses) {
//		this.mcoReanimacaoRnses = mcoReanimacaoRnses;
//	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		AFA_MEDICAMENTO("afaMedicamento"),
		ABS_COMPONENTE_SANGUINEO("absComponenteSanguineo"),
		DESCRICAO("descricao"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
//		MCO_REANIMACAO_RNSES("mcoReanimacaoRnses")

		SER_MATRICULA("rapServidores.id.matricula"),
		SER_VIN_CODIGO("rapServidores.id.vinCodigo"),
		MED_MAT_CODIGO("afaMedicamento.matCodigo"),
		CSA_CODIGO("absComponenteSanguineo.codigo")
		;

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
		if (!(obj instanceof McoProcReanimacao)) {
			return false;
		}
		McoProcReanimacao other = (McoProcReanimacao) obj;
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
