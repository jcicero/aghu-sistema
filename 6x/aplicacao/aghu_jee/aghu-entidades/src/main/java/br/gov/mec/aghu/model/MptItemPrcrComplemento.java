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
 * MptItemPrcrComplemento generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mptCplSq1", sequenceName="AGH.MPT_CPL_SQ1", allocationSize = 1)
@Table(name = "MPT_ITEM_PRCR_COMPLEMENTOS", schema = "AGH")
public class MptItemPrcrComplemento extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7723522089494580088L;
	private Integer seq;
	private Integer version;
	private MptItemPrcrModalidade mptItemPrcrModalidade;
	private RapServidores rapServidoresByMptCplSerFk1;
	private RapServidores rapServidoresByMptCplSerFk2;
	private String complemento;
	private String indSituacao;
	private Date criadoEm;
	private Date alteradoEm;

	public MptItemPrcrComplemento() {
	}

	public MptItemPrcrComplemento(Integer seq, MptItemPrcrModalidade mptItemPrcrModalidade, RapServidores rapServidoresByMptCplSerFk1,
			String complemento, String indSituacao, Date criadoEm) {
		this.seq = seq;
		this.mptItemPrcrModalidade = mptItemPrcrModalidade;
		this.rapServidoresByMptCplSerFk1 = rapServidoresByMptCplSerFk1;
		this.complemento = complemento;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	public MptItemPrcrComplemento(Integer seq, MptItemPrcrModalidade mptItemPrcrModalidade, RapServidores rapServidoresByMptCplSerFk1,
			RapServidores rapServidoresByMptCplSerFk2, String complemento, String indSituacao, Date criadoEm, Date alteradoEm) {
		this.seq = seq;
		this.mptItemPrcrModalidade = mptItemPrcrModalidade;
		this.rapServidoresByMptCplSerFk1 = rapServidoresByMptCplSerFk1;
		this.rapServidoresByMptCplSerFk2 = rapServidoresByMptCplSerFk2;
		this.complemento = complemento;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mptCplSq1")
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
	@JoinColumns({ @JoinColumn(name = "ITM_PTE_ATD_SEQ", referencedColumnName = "PTE_ATD_SEQ", nullable = false),
			@JoinColumn(name = "ITM_PTE_SEQ", referencedColumnName = "PTE_SEQ", nullable = false),
			@JoinColumn(name = "ITM_SEQP", referencedColumnName = "SEQP", nullable = false) })
	public MptItemPrcrModalidade getMptItemPrcrModalidade() {
		return this.mptItemPrcrModalidade;
	}

	public void setMptItemPrcrModalidade(MptItemPrcrModalidade mptItemPrcrModalidade) {
		this.mptItemPrcrModalidade = mptItemPrcrModalidade;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByMptCplSerFk1() {
		return this.rapServidoresByMptCplSerFk1;
	}

	public void setRapServidoresByMptCplSerFk1(RapServidores rapServidoresByMptCplSerFk1) {
		this.rapServidoresByMptCplSerFk1 = rapServidoresByMptCplSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_ALTERADO_POR", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO_POR", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByMptCplSerFk2() {
		return this.rapServidoresByMptCplSerFk2;
	}

	public void setRapServidoresByMptCplSerFk2(RapServidores rapServidoresByMptCplSerFk2) {
		this.rapServidoresByMptCplSerFk2 = rapServidoresByMptCplSerFk2;
	}

	@Column(name = "COMPLEMENTO", nullable = false, length = 500)
	@Length(max = 500)
	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
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
		MPT_ITEM_PRCR_MODALIDADES("mptItemPrcrModalidade"),
		RAP_SERVIDORES_BY_MPT_CPL_SER_FK1("rapServidoresByMptCplSerFk1"),
		RAP_SERVIDORES_BY_MPT_CPL_SER_FK2("rapServidoresByMptCplSerFk2"),
		COMPLEMENTO("complemento"),
		IND_SITUACAO("indSituacao"),
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
		if (!(obj instanceof MptItemPrcrComplemento)) {
			return false;
		}
		MptItemPrcrComplemento other = (MptItemPrcrComplemento) obj;
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
