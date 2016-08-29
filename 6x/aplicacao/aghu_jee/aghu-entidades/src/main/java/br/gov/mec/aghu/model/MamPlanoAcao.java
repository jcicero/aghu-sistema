package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamPlanoAcao generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamPloSq1", sequenceName="AGH.MAM_PLO_SQ1", allocationSize = 1)
@Table(name = "MAM_PLANO_ACOES", schema = "AGH")
public class MamPlanoAcao extends BaseEntitySeq<Long> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -312526633096734599L;
	private Long seq;
	private Integer version;
	private MamEmgGrpPlanoResumo mamEmgGrpPlanoResumo;
	private String descricao;
	private Long trgSeq;

	public MamPlanoAcao() {
	}

	public MamPlanoAcao(Long seq, MamEmgGrpPlanoResumo mamEmgGrpPlanoResumo, String descricao) {
		this.seq = seq;
		this.mamEmgGrpPlanoResumo = mamEmgGrpPlanoResumo;
		this.descricao = descricao;
	}

	public MamPlanoAcao(Long seq, MamEmgGrpPlanoResumo mamEmgGrpPlanoResumo, String descricao, Long trgSeq) {
		this.seq = seq;
		this.mamEmgGrpPlanoResumo = mamEmgGrpPlanoResumo;
		this.descricao = descricao;
		this.trgSeq = trgSeq;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamPloSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
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
	@JoinColumn(name = "EGP_SEQ", nullable = false)
	public MamEmgGrpPlanoResumo getMamEmgGrpPlanoResumo() {
		return this.mamEmgGrpPlanoResumo;
	}

	public void setMamEmgGrpPlanoResumo(MamEmgGrpPlanoResumo mamEmgGrpPlanoResumo) {
		this.mamEmgGrpPlanoResumo = mamEmgGrpPlanoResumo;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 4000)
	@Length(max = 4000)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "TRG_SEQ")
	public Long getTrgSeq() {
		return this.trgSeq;
	}

	public void setTrgSeq(Long trgSeq) {
		this.trgSeq = trgSeq;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		MAM_EMG_GRP_PLANO_RESUMOS("mamEmgGrpPlanoResumo"),
		DESCRICAO("descricao"),
		TRG_SEQ("trgSeq");

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
		if (!(obj instanceof MamPlanoAcao)) {
			return false;
		}
		MamPlanoAcao other = (MamPlanoAcao) obj;
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
