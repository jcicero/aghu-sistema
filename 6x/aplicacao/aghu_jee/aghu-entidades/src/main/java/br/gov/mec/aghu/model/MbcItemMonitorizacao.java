package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MbcItemMonitorizacao generated by hbm2java
 */
@Entity
@Table(name = "MBC_ITEM_MONITORIZACOES", schema = "AGH")
public class MbcItemMonitorizacao extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8213641710494464369L;
	private Short seq;
	private Integer version;
	private RapServidores rapServidores;
	private MbcMonitorizacao mbcMonitorizacao;
	private MbcTipoItemMonitorizacao mbcTipoItemMonitorizacao;
	private Short ordem;
	private Date criadoEm;
	private DominioSituacao situacao;
	private Set<MbcFichaMonitorizacao> mbcFichaMonitorizacaoes = new HashSet<MbcFichaMonitorizacao>(0);

	public MbcItemMonitorizacao() {
	}

	public MbcItemMonitorizacao(Short seq, RapServidores rapServidores, MbcMonitorizacao mbcMonitorizacao,
			MbcTipoItemMonitorizacao mbcTipoItemMonitorizacao, Short ordem, Date criadoEm, DominioSituacao situacao) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.mbcMonitorizacao = mbcMonitorizacao;
		this.mbcTipoItemMonitorizacao = mbcTipoItemMonitorizacao;
		this.ordem = ordem;
		this.criadoEm = criadoEm;
		this.situacao = situacao;
	}

	public MbcItemMonitorizacao(Short seq, RapServidores rapServidores, MbcMonitorizacao mbcMonitorizacao,
			MbcTipoItemMonitorizacao mbcTipoItemMonitorizacao, Short ordem, Date criadoEm, DominioSituacao situacao,
			Set<MbcFichaMonitorizacao> mbcFichaMonitorizacaoes) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.mbcMonitorizacao = mbcMonitorizacao;
		this.mbcTipoItemMonitorizacao = mbcTipoItemMonitorizacao;
		this.ordem = ordem;
		this.criadoEm = criadoEm;
		this.situacao = situacao;
		this.mbcFichaMonitorizacaoes = mbcFichaMonitorizacaoes;
	}

	@Id
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
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MOZ_SEQ", nullable = false)
	public MbcMonitorizacao getMbcMonitorizacao() {
		return this.mbcMonitorizacao;
	}

	public void setMbcMonitorizacao(MbcMonitorizacao mbcMonitorizacao) {
		this.mbcMonitorizacao = mbcMonitorizacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TMZ_SEQ", nullable = false)
	public MbcTipoItemMonitorizacao getMbcTipoItemMonitorizacao() {
		return this.mbcTipoItemMonitorizacao;
	}

	public void setMbcTipoItemMonitorizacao(MbcTipoItemMonitorizacao mbcTipoItemMonitorizacao) {
		this.mbcTipoItemMonitorizacao = mbcTipoItemMonitorizacao;
	}

	@Column(name = "ORDEM", nullable = false)
	public Short getOrdem() {
		return this.ordem;
	}

	public void setOrdem(Short ordem) {
		this.ordem = ordem;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mbcItemMonitorizacao")
	public Set<MbcFichaMonitorizacao> getMbcFichaMonitorizacaoes() {
		return this.mbcFichaMonitorizacaoes;
	}

	public void setMbcFichaMonitorizacaoes(Set<MbcFichaMonitorizacao> mbcFichaMonitorizacaoes) {
		this.mbcFichaMonitorizacaoes = mbcFichaMonitorizacaoes;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		MBC_MONITORIZACOES("mbcMonitorizacao"),
		MBC_TIPO_ITEM_MONITORIZACOES("mbcTipoItemMonitorizacao"),
		ORDEM("ordem"),
		CRIADO_EM("criadoEm"),
		SITUACAO("situacao"),
		MBC_FICHA_MONITORIZACAOES("mbcFichaMonitorizacaoes");

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
		if (!(obj instanceof MbcItemMonitorizacao)) {
			return false;
		}
		MbcItemMonitorizacao other = (MbcItemMonitorizacao) obj;
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
