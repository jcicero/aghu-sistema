package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MptControleFreqSessao generated by hbm2java
 */
@Entity
@Table(name = "MPT_CONTROLE_FREQ_SESSOES", schema = "AGH")
public class MptControleFreqSessao extends BaseEntityId<MptControleFreqSessaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4046857287130954507L;
	private MptControleFreqSessaoId id;
	private Integer version;
	private MptAgendaSessao mptAgendaSessao;
	private RapServidores rapServidores;
	private MptTipoOcorrenciaSessao mptTipoOcorrenciaSessao;
	private Date criadoEm;
	private String indSituacao;
	private String anotacoes;
	private Date dthrAgenda;
	private Set<MptExtratoCtrlFreqSessao> mptExtratoCtrlFreqSessaoes = new HashSet<MptExtratoCtrlFreqSessao>(0);

	public MptControleFreqSessao() {
	}

	public MptControleFreqSessao(MptControleFreqSessaoId id, MptAgendaSessao mptAgendaSessao, RapServidores rapServidores,
			Date criadoEm, String indSituacao, Date dthrAgenda) {
		this.id = id;
		this.mptAgendaSessao = mptAgendaSessao;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.dthrAgenda = dthrAgenda;
	}

	public MptControleFreqSessao(MptControleFreqSessaoId id, MptAgendaSessao mptAgendaSessao, RapServidores rapServidores,
			MptTipoOcorrenciaSessao mptTipoOcorrenciaSessao, Date criadoEm, String indSituacao, String anotacoes, Date dthrAgenda,
			Set<MptExtratoCtrlFreqSessao> mptExtratoCtrlFreqSessaoes) {
		this.id = id;
		this.mptAgendaSessao = mptAgendaSessao;
		this.rapServidores = rapServidores;
		this.mptTipoOcorrenciaSessao = mptTipoOcorrenciaSessao;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.anotacoes = anotacoes;
		this.dthrAgenda = dthrAgenda;
		this.mptExtratoCtrlFreqSessaoes = mptExtratoCtrlFreqSessaoes;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "ageSeq", column = @Column(name = "AGE_SEQ", nullable = false)),
			@AttributeOverride(name = "data", column = @Column(name = "DATA", nullable = false, length = 29)) })
	public MptControleFreqSessaoId getId() {
		return this.id;
	}

	public void setId(MptControleFreqSessaoId id) {
		this.id = id;
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
	@JoinColumn(name = "AGE_SEQ", nullable = false, insertable = false, updatable = false)
	public MptAgendaSessao getMptAgendaSessao() {
		return this.mptAgendaSessao;
	}

	public void setMptAgendaSessao(MptAgendaSessao mptAgendaSessao) {
		this.mptAgendaSessao = mptAgendaSessao;
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
	@JoinColumn(name = "TOS_SEQ")
	public MptTipoOcorrenciaSessao getMptTipoOcorrenciaSessao() {
		return this.mptTipoOcorrenciaSessao;
	}

	public void setMptTipoOcorrenciaSessao(MptTipoOcorrenciaSessao mptTipoOcorrenciaSessao) {
		this.mptTipoOcorrenciaSessao = mptTipoOcorrenciaSessao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "ANOTACOES", length = 500)
	@Length(max = 500)
	public String getAnotacoes() {
		return this.anotacoes;
	}

	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_AGENDA", nullable = false, length = 29)
	public Date getDthrAgenda() {
		return this.dthrAgenda;
	}

	public void setDthrAgenda(Date dthrAgenda) {
		this.dthrAgenda = dthrAgenda;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mptControleFreqSessao")
	public Set<MptExtratoCtrlFreqSessao> getMptExtratoCtrlFreqSessaoes() {
		return this.mptExtratoCtrlFreqSessaoes;
	}

	public void setMptExtratoCtrlFreqSessaoes(Set<MptExtratoCtrlFreqSessao> mptExtratoCtrlFreqSessaoes) {
		this.mptExtratoCtrlFreqSessaoes = mptExtratoCtrlFreqSessaoes;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		MPT_AGENDA_SESSOES("mptAgendaSessao"),
		RAP_SERVIDORES("rapServidores"),
		MPT_TIPO_OCORRENCIA_SESSOES("mptTipoOcorrenciaSessao"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao"),
		ANOTACOES("anotacoes"),
		DTHR_AGENDA("dthrAgenda"),
		MPT_EXTRATO_CTRL_FREQ_SESSAOES("mptExtratoCtrlFreqSessaoes");

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
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
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
		if (!(obj instanceof MptControleFreqSessao)) {
			return false;
		}
		MptControleFreqSessao other = (MptControleFreqSessao) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
