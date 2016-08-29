package br.gov.mec.aghu.model;

// Generated 17/03/2011 17:54:10 by Hibernate Tools 3.2.5.Beta

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
 * AelSismamaCitoRes generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelS06Sq1", sequenceName="AGH.AEL_S06_SQ1", allocationSize = 1)
@Table(name = "AEL_SISMAMA_CITO_RES", schema = "AGH")
public class AelSismamaCitoRes extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8056312529825219399L;
	private Integer seq;
	private Integer version;
	private AelSismamaCitoCad aelSismamaCitoCad;
	private String resposta;
	private Integer iseSoeSeq;
	private Short iseSeqp;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;

	public AelSismamaCitoRes() {
	}

	public AelSismamaCitoRes(Integer seq, AelSismamaCitoCad aelSismamaCitoCad,
			Integer iseSoeSeq, Short iseSeqp, Integer serMatricula, Short serVinCodigo) {
		this.seq = seq;
		this.aelSismamaCitoCad = aelSismamaCitoCad;
		this.iseSoeSeq = iseSoeSeq;
		this.iseSeqp = iseSeqp;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	public AelSismamaCitoRes(Integer seq, AelSismamaCitoCad aelSismamaCitoCad,
			String resposta, Integer iseSoeSeq, Short iseSeqp, Date criadoEm,
			Integer serMatricula, Short serVinCodigo) {
		this.seq = seq;
		this.aelSismamaCitoCad = aelSismamaCitoCad;
		this.resposta = resposta;
		this.iseSoeSeq = iseSoeSeq;
		this.iseSeqp = iseSeqp;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelS06Sq1")
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
	@JoinColumn(name = "S05_CODIGO", nullable = false)
	public AelSismamaCitoCad getAelSismamaCitoCad() {
		return this.aelSismamaCitoCad;
	}

	public void setAelSismamaCitoCad(AelSismamaCitoCad aelSismamaCitoCad) {
		this.aelSismamaCitoCad = aelSismamaCitoCad;
	}

	@Column(name = "RESPOSTA", length = 1000)
	@Length(max = 1000)
	public String getResposta() {
		return this.resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	@Column(name = "ISE_SOE_SEQ", nullable = false)
	public Integer getIseSoeSeq() {
		return this.iseSoeSeq;
	}

	public void setIseSoeSeq(Integer iseSoeSeq) {
		this.iseSoeSeq = iseSoeSeq;
	}

	@Column(name = "ISE_SEQP", nullable = false)
	public Short getIseSeqp() {
		return this.iseSeqp;
	}

	public void setIseSeqp(Short iseSeqp) {
		this.iseSeqp = iseSeqp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SER_MATRICULA", nullable = false)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	public enum Fields {

		SEQ("seq"),
		AEL_SISMAMA_CITO_CAD("aelSismamaCitoCad"),
		RESPOSTA("resposta"),
		ISE_SOE_SEQ("iseSoeSeq"),
		ISE_SEQP("iseSeqp"),
		CRIADO_EM("criadoEm"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo");

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
		if (!(obj instanceof AelSismamaCitoRes)) {
			return false;
		}
		AelSismamaCitoRes other = (AelSismamaCitoRes) obj;
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
