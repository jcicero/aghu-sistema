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
 * RapRealizacaoSignificativa generated by hbm2java
 */
@Entity
@Table(name = "RAP_REALIZACOES_SIGNIFICATIVAS", schema = "AGH")
public class RapRealizacaoSignificativa extends BaseEntityId<RapRealizacaoSignificativaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7487994861238828439L;
	private RapRealizacaoSignificativaId id;
	private Integer version;
	private RapServidores rapServidoresByRapRsiSerFk2;
	private RapItemAvaliacaoServ rapItemAvaliacaoServ;
	private RapServidores rapServidoresByRapRsiSerFk1;
	private String descricao;
	private Date criadoEm;
	private Date alteradoEm;

	public RapRealizacaoSignificativa() {
	}

	public RapRealizacaoSignificativa(RapRealizacaoSignificativaId id, RapItemAvaliacaoServ rapItemAvaliacaoServ,
			RapServidores rapServidoresByRapRsiSerFk1, String descricao, Date criadoEm) {
		this.id = id;
		this.rapItemAvaliacaoServ = rapItemAvaliacaoServ;
		this.rapServidoresByRapRsiSerFk1 = rapServidoresByRapRsiSerFk1;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
	}

	public RapRealizacaoSignificativa(RapRealizacaoSignificativaId id, RapServidores rapServidoresByRapRsiSerFk2,
			RapItemAvaliacaoServ rapItemAvaliacaoServ, RapServidores rapServidoresByRapRsiSerFk1, String descricao, Date criadoEm,
			Date alteradoEm) {
		this.id = id;
		this.rapServidoresByRapRsiSerFk2 = rapServidoresByRapRsiSerFk2;
		this.rapItemAvaliacaoServ = rapItemAvaliacaoServ;
		this.rapServidoresByRapRsiSerFk1 = rapServidoresByRapRsiSerFk1;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "iasAvsSeq", column = @Column(name = "IAS_AVS_SEQ", nullable = false)),
			@AttributeOverride(name = "iasSeqp", column = @Column(name = "IAS_SEQP", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public RapRealizacaoSignificativaId getId() {
		return this.id;
	}

	public void setId(RapRealizacaoSignificativaId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByRapRsiSerFk2() {
		return this.rapServidoresByRapRsiSerFk2;
	}

	public void setRapServidoresByRapRsiSerFk2(RapServidores rapServidoresByRapRsiSerFk2) {
		this.rapServidoresByRapRsiSerFk2 = rapServidoresByRapRsiSerFk2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "IAS_AVS_SEQ", referencedColumnName = "AVS_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "IAS_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public RapItemAvaliacaoServ getRapItemAvaliacaoServ() {
		return this.rapItemAvaliacaoServ;
	}

	public void setRapItemAvaliacaoServ(RapItemAvaliacaoServ rapItemAvaliacaoServ) {
		this.rapItemAvaliacaoServ = rapItemAvaliacaoServ;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_CRIADO", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO_CRIADO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByRapRsiSerFk1() {
		return this.rapServidoresByRapRsiSerFk1;
	}

	public void setRapServidoresByRapRsiSerFk1(RapServidores rapServidoresByRapRsiSerFk1) {
		this.rapServidoresByRapRsiSerFk1 = rapServidoresByRapRsiSerFk1;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 200)
	@Length(max = 200)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES_BY_RAP_RSI_SER_FK2("rapServidoresByRapRsiSerFk2"),
		RAP_ITENS_AVALIACAO_SERV("rapItemAvaliacaoServ"),
		RAP_SERVIDORES_BY_RAP_RSI_SER_FK1("rapServidoresByRapRsiSerFk1"),
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
		if (!(obj instanceof RapRealizacaoSignificativa)) {
			return false;
		}
		RapRealizacaoSignificativa other = (RapRealizacaoSignificativa) obj;
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
