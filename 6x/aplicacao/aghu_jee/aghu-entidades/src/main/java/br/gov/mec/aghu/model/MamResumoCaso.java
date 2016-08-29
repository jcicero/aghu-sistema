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
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamResumoCaso generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamRscSq1", sequenceName="AGH.MAM_RSC_SQ1", allocationSize = 1)
@Table(name = "MAM_RESUMO_CASOS", schema = "AGH")
public class MamResumoCaso extends BaseEntitySeq<Long> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3510251058724649635L;
	private Long seq;
	private Integer version;
	private MamEmgGrpPlanoResumo mamEmgGrpPlanoResumo;
	private String descricao;
	private Long trgSeq;
	private Integer atdSeq;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Date criadoEm;
	private Date alteradoEm;

	public MamResumoCaso() {
	}

	public MamResumoCaso(Long seq, String descricao) {
		this.seq = seq;
		this.descricao = descricao;
	}

	public MamResumoCaso(Long seq, MamEmgGrpPlanoResumo mamEmgGrpPlanoResumo, String descricao, Long trgSeq, Integer atdSeq,
			Integer serMatricula, Short serVinCodigo, Date criadoEm, Date alteradoEm) {
		this.seq = seq;
		this.mamEmgGrpPlanoResumo = mamEmgGrpPlanoResumo;
		this.descricao = descricao;
		this.trgSeq = trgSeq;
		this.atdSeq = atdSeq;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamRscSq1")
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
	@JoinColumn(name = "EGP_SEQ")
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

	@Column(name = "ATD_SEQ")
	public Integer getAtdSeq() {
		return this.atdSeq;
	}

	public void setAtdSeq(Integer atdSeq) {
		this.atdSeq = atdSeq;
	}

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		MAM_EMG_GRP_PLANO_RESUMOS("mamEmgGrpPlanoResumo"),
		DESCRICAO("descricao"),
		TRG_SEQ("trgSeq"),
		ATD_SEQ("atdSeq"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm");

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
		if (!(obj instanceof MamResumoCaso)) {
			return false;
		}
		MamResumoCaso other = (MamResumoCaso) obj;
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