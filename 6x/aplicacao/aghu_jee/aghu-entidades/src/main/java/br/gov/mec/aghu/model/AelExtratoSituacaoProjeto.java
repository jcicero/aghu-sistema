package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelExtratoSituacaoProjeto generated by hbm2java
 */
@Entity
@Table(name = "AEL_EXTRATO_SITUACAO_PROJETOS", schema = "AGH")
public class AelExtratoSituacaoProjeto extends BaseEntityId<AelExtratoSituacaoProjetoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6083242563641135081L;
	private AelExtratoSituacaoProjetoId id;
	private Integer version;
	private RapServidores rapServidores;
	private AelProjetoPesquisas aelProjetoPesquisas;
	private String situacao;
	private Date criadoEm;

	public AelExtratoSituacaoProjeto() {
	}

	public AelExtratoSituacaoProjeto(AelExtratoSituacaoProjetoId id, RapServidores rapServidores,
			AelProjetoPesquisas aelProjetoPesquisas, String situacao, Date criadoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.aelProjetoPesquisas = aelProjetoPesquisas;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "pjqSeq", column = @Column(name = "PJQ_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public AelExtratoSituacaoProjetoId getId() {
		return this.id;
	}

	public void setId(AelExtratoSituacaoProjetoId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PJQ_SEQ", nullable = false, insertable = false, updatable = false)
	public AelProjetoPesquisas getAelProjetoPesquisas() {
		return this.aelProjetoPesquisas;
	}

	public void setAelProjetoPesquisas(AelProjetoPesquisas aelProjetoPesquisas) {
		this.aelProjetoPesquisas = aelProjetoPesquisas;
	}

	@Column(name = "SITUACAO", nullable = false, length = 2)
	@Length(max = 2)
	public String getSituacao() {
		return this.situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
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

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		AEL_PROJETO_PESQUISAS("aelProjetoPesquisas"),
		SITUACAO("situacao"),
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
		if (!(obj instanceof AelExtratoSituacaoProjeto)) {
			return false;
		}
		AelExtratoSituacaoProjeto other = (AelExtratoSituacaoProjeto) obj;
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
