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
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * CtbRelacionaSubNatureza generated by hbm2java
 */
@Entity
@SequenceGenerator(name="ctbRsnSq1", sequenceName="AGH.CTB_RSN_SQ1", allocationSize = 1)
@Table(name = "CTB_RELACIONA_SUB_NATUREZAS", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = "descricao"))
public class CtbRelacionaSubNatureza extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3020203192818578995L;
	private Short seq;
	private Integer version;
	private RapServidores rapServidoresByCtbRsnSerFk1;
	private RapServidores rapServidoresByCtbRsnSerFk2;
	private CtbSubNaturezaPlano ctbSubNaturezaPlanosByCtbRsnSnpFk1;
	private CtbClassifFinanN3 ctbClassifFinanN3;
	private CtbSubNaturezaPlano ctbSubNaturezaPlanosByCtbRsnSnpFk2;
	private String descricao;
	private Date criadoEm;
	private Date alteradoEm;

	public CtbRelacionaSubNatureza() {
	}

	public CtbRelacionaSubNatureza(Short seq, RapServidores rapServidoresByCtbRsnSerFk1,
			CtbSubNaturezaPlano ctbSubNaturezaPlanosByCtbRsnSnpFk1, CtbClassifFinanN3 ctbClassifFinanN3,
			CtbSubNaturezaPlano ctbSubNaturezaPlanosByCtbRsnSnpFk2, String descricao) {
		this.seq = seq;
		this.rapServidoresByCtbRsnSerFk1 = rapServidoresByCtbRsnSerFk1;
		this.ctbSubNaturezaPlanosByCtbRsnSnpFk1 = ctbSubNaturezaPlanosByCtbRsnSnpFk1;
		this.ctbClassifFinanN3 = ctbClassifFinanN3;
		this.ctbSubNaturezaPlanosByCtbRsnSnpFk2 = ctbSubNaturezaPlanosByCtbRsnSnpFk2;
		this.descricao = descricao;
	}

	public CtbRelacionaSubNatureza(Short seq, RapServidores rapServidoresByCtbRsnSerFk1, RapServidores rapServidoresByCtbRsnSerFk2,
			CtbSubNaturezaPlano ctbSubNaturezaPlanosByCtbRsnSnpFk1, CtbClassifFinanN3 ctbClassifFinanN3,
			CtbSubNaturezaPlano ctbSubNaturezaPlanosByCtbRsnSnpFk2, String descricao, Date criadoEm, Date alteradoEm) {
		this.seq = seq;
		this.rapServidoresByCtbRsnSerFk1 = rapServidoresByCtbRsnSerFk1;
		this.rapServidoresByCtbRsnSerFk2 = rapServidoresByCtbRsnSerFk2;
		this.ctbSubNaturezaPlanosByCtbRsnSnpFk1 = ctbSubNaturezaPlanosByCtbRsnSnpFk1;
		this.ctbClassifFinanN3 = ctbClassifFinanN3;
		this.ctbSubNaturezaPlanosByCtbRsnSnpFk2 = ctbSubNaturezaPlanosByCtbRsnSnpFk2;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ctbRsnSq1")
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByCtbRsnSerFk1() {
		return this.rapServidoresByCtbRsnSerFk1;
	}

	public void setRapServidoresByCtbRsnSerFk1(RapServidores rapServidoresByCtbRsnSerFk1) {
		this.rapServidoresByCtbRsnSerFk1 = rapServidoresByCtbRsnSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_POR", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_POR", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByCtbRsnSerFk2() {
		return this.rapServidoresByCtbRsnSerFk2;
	}

	public void setRapServidoresByCtbRsnSerFk2(RapServidores rapServidoresByCtbRsnSerFk2) {
		this.rapServidoresByCtbRsnSerFk2 = rapServidoresByCtbRsnSerFk2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SNP_NTP_GNP_TAB_CODIGO", referencedColumnName = "NTP_GNP_TAB_CODIGO", nullable = false),
			@JoinColumn(name = "SNP_NTP_GNP_CODIGO", referencedColumnName = "NTP_GNP_CODIGO", nullable = false),
			@JoinColumn(name = "SNP_NTP_CODIGO", referencedColumnName = "NTP_CODIGO", nullable = false),
			@JoinColumn(name = "SNP_CODIGO", referencedColumnName = "CODIGO", nullable = false) })
	public CtbSubNaturezaPlano getCtbSubNaturezaPlanosByCtbRsnSnpFk1() {
		return this.ctbSubNaturezaPlanosByCtbRsnSnpFk1;
	}

	public void setCtbSubNaturezaPlanosByCtbRsnSnpFk1(CtbSubNaturezaPlano ctbSubNaturezaPlanosByCtbRsnSnpFk1) {
		this.ctbSubNaturezaPlanosByCtbRsnSnpFk1 = ctbSubNaturezaPlanosByCtbRsnSnpFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "FN3_FN2_FN1_CODIGO", referencedColumnName = "FN2_FN1_CODIGO", nullable = false),
			@JoinColumn(name = "FN3_FN2_CODIGO", referencedColumnName = "FN2_CODIGO", nullable = false),
			@JoinColumn(name = "FN3_CODIGO", referencedColumnName = "CODIGO", nullable = false) })
	public CtbClassifFinanN3 getCtbClassifFinanN3() {
		return this.ctbClassifFinanN3;
	}

	public void setCtbClassifFinanN3(CtbClassifFinanN3 ctbClassifFinanN3) {
		this.ctbClassifFinanN3 = ctbClassifFinanN3;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SNP_NTP_GNP_TAB_CODIGO_TEM", referencedColumnName = "NTP_GNP_TAB_CODIGO", nullable = false),
			@JoinColumn(name = "SNP_NTP_GNP_CODIGO_TEM", referencedColumnName = "NTP_GNP_CODIGO", nullable = false),
			@JoinColumn(name = "SNP_NTP_CODIGO_TEM", referencedColumnName = "NTP_CODIGO", nullable = false),
			@JoinColumn(name = "SNP_CODIGO_TEM", referencedColumnName = "CODIGO", nullable = false) })
	public CtbSubNaturezaPlano getCtbSubNaturezaPlanosByCtbRsnSnpFk2() {
		return this.ctbSubNaturezaPlanosByCtbRsnSnpFk2;
	}

	public void setCtbSubNaturezaPlanosByCtbRsnSnpFk2(CtbSubNaturezaPlano ctbSubNaturezaPlanosByCtbRsnSnpFk2) {
		this.ctbSubNaturezaPlanosByCtbRsnSnpFk2 = ctbSubNaturezaPlanosByCtbRsnSnpFk2;
	}

	@Column(name = "DESCRICAO", unique = true, nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
		RAP_SERVIDORES_BY_CTB_RSN_SER_FK1("rapServidoresByCtbRsnSerFk1"),
		RAP_SERVIDORES_BY_CTB_RSN_SER_FK2("rapServidoresByCtbRsnSerFk2"),
		CTB_SUB_NATUREZA_PLANOS_BY_CTB_RSN_SNP_FK1("ctbSubNaturezaPlanosByCtbRsnSnpFk1"),
		CTB_CLASSIF_FINAN_N3("ctbClassifFinanN3"),
		CTB_SUB_NATUREZA_PLANOS_BY_CTB_RSN_SNP_FK2("ctbSubNaturezaPlanosByCtbRsnSnpFk2"),
		DESCRICAO("descricao"),
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
		if (!(obj instanceof CtbRelacionaSubNatureza)) {
			return false;
		}
		CtbRelacionaSubNatureza other = (CtbRelacionaSubNatureza) obj;
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
