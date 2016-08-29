package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

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


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AbsMetodo generated by hbm2java
 */
@Entity
@SequenceGenerator(name="absMetSq1", sequenceName="AGH.ABS_MET_SQ1", allocationSize = 1)
@Table(name = "ABS_METODOS", schema = "AGH")
public class AbsMetodo extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 717761246966137902L;
	private Short seq;
	private Integer version;
	private RapServidores rapServidores;
	private String descricao;
	private String descricaoUsual;
	private String indSituacao;
	private Date criadoEm;
	
	// FIXME Implementar este relacionamento
//	private Set<AbsExameMetodos> absExameMetodoses = new HashSet<AbsExameMetodos>(0);

	public AbsMetodo() {
	}

	public AbsMetodo(Short seq, String descricao, String descricaoUsual) {
		this.seq = seq;
		this.descricao = descricao;
		this.descricaoUsual = descricaoUsual;
	}

	public AbsMetodo(Short seq, RapServidores rapServidores, String descricao, String descricaoUsual, String indSituacao,
			Date criadoEm
//			, Set<AbsExameMetodos> absExameMetodoses
		) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.descricaoUsual = descricaoUsual;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
//		this.absExameMetodoses = absExameMetodoses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "absMetSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "DESCRICAO_USUAL", nullable = false, length = 20)
	@Length(max = 20)
	public String getDescricaoUsual() {
		return this.descricaoUsual;
	}

	public void setDescricaoUsual(String descricaoUsual) {
		this.descricaoUsual = descricaoUsual;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "absMetodo")
//	public Set<AbsExameMetodos> getAbsExameMetodoses() {
//		return this.absExameMetodoses;
//	}
//
//	public void setAbsExameMetodoses(Set<AbsExameMetodos> absExameMetodoses) {
//		this.absExameMetodoses = absExameMetodoses;
//	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		DESCRICAO("descricao"),
		DESCRICAO_USUAL("descricaoUsual"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
//		ABS_EXAME_METODOSES("absExameMetodoses")
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
		if (!(obj instanceof AbsMetodo)) {
			return false;
		}
		AbsMetodo other = (AbsMetodo) obj;
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
