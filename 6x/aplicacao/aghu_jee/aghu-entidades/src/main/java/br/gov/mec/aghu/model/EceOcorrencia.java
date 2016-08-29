package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacaoOcorencia;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * EceOcorrencia generated by hbm2java
 */
@Entity
@Table(name = "ECE_OCORRENCIAS", schema = "AGH")
public class EceOcorrencia extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3319956138240933571L;
	private Integer seq;
	private Integer version;
	private EceMaterialEmpregado eceMaterialEmpregado;
	private FatProcedHospInternos fatProcedHospInternos;
	private RapServidores rapServidores;
	private EceKit eceKit;
	private String descricao;
	private Double quantidade;
	private DominioSituacaoOcorencia situacao;
	private Date alteradoEm;
	private Date criadoEm;

	public EceOcorrencia() {
	}

	public EceOcorrencia(Integer seq, RapServidores rapServidores, Date criadoEm) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
	}

	public EceOcorrencia(Integer seq, EceMaterialEmpregado eceMaterialEmpregado, FatProcedHospInternos fatProcedHospInternos,
			RapServidores rapServidores, EceKit eceKit, String descricao, Double quantidade, DominioSituacaoOcorencia situacao, Date alteradoEm,
			Date criadoEm) {
		this.seq = seq;
		this.eceMaterialEmpregado = eceMaterialEmpregado;
		this.fatProcedHospInternos = fatProcedHospInternos;
		this.rapServidores = rapServidores;
		this.eceKit = eceKit;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.situacao = situacao;
		this.alteradoEm = alteradoEm;
		this.criadoEm = criadoEm;
	}

	@Id
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
	@JoinColumn(name = "MEG_SEQ")
	public EceMaterialEmpregado getEceMaterialEmpregado() {
		return this.eceMaterialEmpregado;
	}

	public void setEceMaterialEmpregado(EceMaterialEmpregado eceMaterialEmpregado) {
		this.eceMaterialEmpregado = eceMaterialEmpregado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PHI_SEQ")
	public FatProcedHospInternos getFatProcedHospInternos() {
		return this.fatProcedHospInternos;
	}

	public void setFatProcedHospInternos(FatProcedHospInternos fatProcedHospInternos) {
		this.fatProcedHospInternos = fatProcedHospInternos;
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
	@JoinColumn(name = "KTS_SEQ")
	public EceKit getEceKit() {
		return this.eceKit;
	}

	public void setEceKit(EceKit eceKit) {
		this.eceKit = eceKit;
	}

	@Column(name = "DESCRICAO", length = 100)
	@Length(max = 100)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "QUANTIDADE", precision = 17, scale = 17)
	public Double getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	@Column(name = "SITUACAO")
	@Enumerated(EnumType.STRING)
	public DominioSituacaoOcorencia getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacaoOcorencia situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		ECE_MATERIAL_EMPREGADOS("eceMaterialEmpregado"),
		FAT_PROCED_HOSP_INTERNOS("fatProcedHospInternos"),
		RAP_SERVIDORES("rapServidores"),
		ECE_KITS("eceKit"),
		DESCRICAO("descricao"),
		QUANTIDADE("quantidade"),
		SITUACAO("situacao"),
		ALTERADO_EM("alteradoEm"),
		CRIADO_EM("criadoEm");

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
		if (!(obj instanceof EceOcorrencia)) {
			return false;
		}
		EceOcorrencia other = (EceOcorrencia) obj;
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
