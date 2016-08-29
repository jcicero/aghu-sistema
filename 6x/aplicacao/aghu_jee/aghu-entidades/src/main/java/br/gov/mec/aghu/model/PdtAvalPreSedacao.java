package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.hibernate.annotations.Parameter;

import br.gov.mec.aghu.dominio.DominioAsa;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * PdtProc generated by hbm2java
 */
@Entity
@Table(name = "PDT_AVAL_PRE_SEDACAO", schema = "AGH")
public class PdtAvalPreSedacao extends BaseEntitySeq<Integer> implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9036087401455944506L;
	private Integer ddtSeq;
	private Integer version;
	private PdtDescricao pdtDescricao;
	private PdtViaAereas viaAereas;
	private Boolean indParticAvalCli;
	private String avaliacaoClinica;
	private RapServidores rapServidores;
	private DominioAsa asa;
	private Short tempoJejum;
	private String exameFisico;
	private String comorbidades;
	private Date criadoEm;

	public PdtAvalPreSedacao() {
	}

	public PdtAvalPreSedacao(Integer ddtSeq, PdtDescricao pdtDescricao, RapServidores rapServidores) {
		this.ddtSeq = ddtSeq;
		this.pdtDescricao = pdtDescricao;
		this.rapServidores = rapServidores;
	
	}

	public PdtAvalPreSedacao(Integer ddtSeq, PdtDescricao pdtDescricao, RapServidores rapServidores, Date criadoEm) {
		this.ddtSeq = ddtSeq;
		this.pdtDescricao = pdtDescricao;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
	}



	@Id
	@Column(name = "DDT_SEQ")
	public Integer getDdtSeq() {
		return this.ddtSeq;
	}

	public void setDdtSeq(Integer ddtSeq) {
		this.ddtSeq = ddtSeq;
	}
	
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn(name = "DDT_SEQ")
	public PdtDescricao getPdtDescricao() {
		return this.pdtDescricao;
	}

	public void setPdtDescricao(PdtDescricao pdtDescricao) {
		this.pdtDescricao = pdtDescricao;
	}
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DVA_SEQ")
	public PdtViaAereas getViaAereas() {
		return viaAereas;
	}

	public void setViaAereas(PdtViaAereas viaAereas) {
		this.viaAereas = viaAereas;
	} 

	@Column(name = "IND_PARTIC_AVAL_CLI", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndParticAvalCli() {
		return indParticAvalCli;
	}

	public void setIndParticAvalCli(Boolean indParticAvalCli) {
		this.indParticAvalCli = indParticAvalCli;
	}
	
	
	@Column(name = "AVALIACAO_CLINICA", length = 500)
	public String getAvaliacaoClinica() {
		return this.avaliacaoClinica;
	}

	public void setAvaliacaoClinica(String avaliacaoClinica) {
		this.avaliacaoClinica = avaliacaoClinica;
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
	
	@Column(name = "ASA")
	@org.hibernate.annotations.Type(parameters = { @Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioAsa") }, type = "br.gov.mec.aghu.core.model.jpa.DominioUserType")
	public DominioAsa getAsa() {
		return this.asa;
	}

	public void setAsa(DominioAsa asa) {
		this.asa = asa;
	}	
	
	@Column(name = "TEMPO_JEJUM", length = 1)
	public Short getTempoJejum() {
		return tempoJejum;
	}

	public void setTempoJejum(Short tempoJejum) {
		this.tempoJejum = tempoJejum;
	}
	

	@Column(name = "COMORBIDADES", length = 500)
	public String getComorbidades() {
		return this.comorbidades;
	}

	public void setComorbidades(String comorbidades) {
		this.comorbidades = comorbidades;
	}

	
	@Column(name = "EXAME_FISICO", length = 500)
	public String getExameFisico() {
		return this.exameFisico;
	}

	public void setExameFisico(String exameFisico) {
		this.exameFisico = exameFisico;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

		DDT_SEQ("ddtSeq"),
		VERSION("version"),
		PDT_DESCRICAO("pdtDescricao"),
		IND_PARTIC_AVAL_CLI("indParticAvalCli"),
		RAP_SERVIDORES("rapServidores"),
		ASA("asa"),
		TEMPO_JEJUM("tempoJejum"),
		EXAME_FISICO("exameFisico"),
		COMORBIDADES("comorbidades"),
		VIAS_AEREAS("viaAereas"),
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
		result = prime * result + ((ddtSeq == null) ? 0 : ddtSeq.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		PdtAvalPreSedacao other = (PdtAvalPreSedacao) obj;
		if (ddtSeq == null) {
			if (other.ddtSeq != null) {
				return false;
			}
		} else if (!ddtSeq.equals(other.ddtSeq)) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

	@Transient public Integer getSeq(){ return this.getDdtSeq();} 
	 public void setSeq(Integer seq){ this.setDdtSeq(seq);}

}
