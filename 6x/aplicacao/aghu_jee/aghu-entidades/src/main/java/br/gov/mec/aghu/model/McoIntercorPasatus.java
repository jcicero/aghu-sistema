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
 * McoIntercorPasatus generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mcoOpaSq1", sequenceName="AGH.MCO_OPA_SQ1", allocationSize = 1)
@Table(name = "MCO_INTERCOR_PASATUS", schema = "AGH")
public class McoIntercorPasatus extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1669050454015952648L;
	private Integer seq;
	private Integer version;
	private AghCid aghCid;
	private RapServidores rapServidores;
	private String descricao;
	private String indSituacao;
	private String mensagemAlerta;
	private Date criadoEm;
	
	// FIXME Implementar este relacionamento
//	private Set<McoIntercorrenciaGestacoes> mcoIntercorrenciaGestacoeses = new HashSet<McoIntercorrenciaGestacoes>(0);

	public McoIntercorPasatus() {
	}

	public McoIntercorPasatus(Integer seq, RapServidores rapServidores, String descricao, Date criadoEm) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
	}

	public McoIntercorPasatus(Integer seq, AghCid aghCid, RapServidores rapServidores, String descricao, String indSituacao,
			String mensagemAlerta, Date criadoEm
//			, Set<McoIntercorrenciaGestacoes> mcoIntercorrenciaGestacoeses
			) {
		this.seq = seq;
		this.aghCid = aghCid;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.mensagemAlerta = mensagemAlerta;
		this.criadoEm = criadoEm;
//		this.mcoIntercorrenciaGestacoeses = mcoIntercorrenciaGestacoeses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mcoOpaSq1")
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
	@JoinColumn(name = "CID_SEQ")
	public AghCid getAghCid() {
		return this.aghCid;
	}

	public void setAghCid(AghCid aghCid) {
		this.aghCid = aghCid;
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

	@Column(name = "DESCRICAO", nullable = false, length = 120)
	@Length(max = 120)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "MENSAGEM_ALERTA", length = 100)
	@Length(max = 100)
	public String getMensagemAlerta() {
		return this.mensagemAlerta;
	}

	public void setMensagemAlerta(String mensagemAlerta) {
		this.mensagemAlerta = mensagemAlerta;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mcoIntercorPasatus")
//	public Set<McoIntercorrenciaGestacoes> getMcoIntercorrenciaGestacoeses() {
//		return this.mcoIntercorrenciaGestacoeses;
//	}
//
//	public void setMcoIntercorrenciaGestacoeses(Set<McoIntercorrenciaGestacoes> mcoIntercorrenciaGestacoeses) {
//		this.mcoIntercorrenciaGestacoeses = mcoIntercorrenciaGestacoeses;
//	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		AGH_CID("aghCid"),
		RAP_SERVIDORES("rapServidores"),
		DESCRICAO("descricao"),
		IND_SITUACAO("indSituacao"),
		MENSAGEM_ALERTA("mensagemAlerta"),
		CRIADO_EM("criadoEm"),
//		MCO_INTERCORRENCIA_GESTACOESES("mcoIntercorrenciaGestacoeses")
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
		if (!(obj instanceof McoIntercorPasatus)) {
			return false;
		}
		McoIntercorPasatus other = (McoIntercorPasatus) obj;
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
