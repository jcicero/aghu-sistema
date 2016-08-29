package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;
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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;


import br.gov.mec.aghu.core.exception.BaseRuntimeException;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmComposicaoPrescricaoNpt generated by hbm2java
 */
@Entity
@Table(name = "MPM_COMPOSICAO_PRESCRICAO_NPTS", schema = "AGH")
public class MpmComposicaoPrescricaoNpt extends BaseEntityId<MpmComposicaoPrescricaoNptId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6786121325152978603L;
	private MpmComposicaoPrescricaoNptId id;
	private MpmPrescricaoNpt mpmPrescricaoNpts;
	private AfaTipoVelocAdministracoes afaTipoVelocAdministracoes;
	private AfaTipoComposicoes afaTipoComposicoes;
	private BigDecimal velocidadeAdministracao;
	private Byte qtdeHorasCorrer;
	private Set<MpmItemPrescricaoNpt> mpmItemPrescricaoNptses = new HashSet<MpmItemPrescricaoNpt>(
			0);

	public MpmComposicaoPrescricaoNpt() {
	}

	public MpmComposicaoPrescricaoNpt(MpmComposicaoPrescricaoNptId id,
			MpmPrescricaoNpt mpmPrescricaoNpts, AfaTipoComposicoes afaTipoComposicoes) {
		this.id = id;
		this.mpmPrescricaoNpts = mpmPrescricaoNpts;
		this.afaTipoComposicoes = afaTipoComposicoes;
	}

	public MpmComposicaoPrescricaoNpt(MpmComposicaoPrescricaoNptId id,
			MpmPrescricaoNpt mpmPrescricaoNpts,
			AfaTipoVelocAdministracoes afaTipoVelocAdministracoes,
			AfaTipoComposicoes afaTipoComposicoes,
			BigDecimal velocidadeAdministracao, Byte qtdeHorasCorrer,
			Set<MpmItemPrescricaoNpt> mpmItemPrescricaoNptses) {
		this.id = id;
		this.mpmPrescricaoNpts = mpmPrescricaoNpts;
		this.afaTipoVelocAdministracoes = afaTipoVelocAdministracoes;
		this.afaTipoComposicoes = afaTipoComposicoes;
		this.velocidadeAdministracao = velocidadeAdministracao;
		this.qtdeHorasCorrer = qtdeHorasCorrer;
		this.mpmItemPrescricaoNptses = mpmItemPrescricaoNptses;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "pnpAtdSeq", column = @Column(name = "PNP_ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "pnpSeq", column = @Column(name = "PNP_SEQ", nullable = false, precision = 14, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 3, scale = 0)) })
	public MpmComposicaoPrescricaoNptId getId() {
		return this.id;
	}

	public void setId(MpmComposicaoPrescricaoNptId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "PNP_ATD_SEQ", referencedColumnName = "ATD_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PNP_SEQ", referencedColumnName = "SEQ", nullable = false, insertable = false, updatable = false) })
	public MpmPrescricaoNpt getMpmPrescricaoNpts() {
		return this.mpmPrescricaoNpts;
	}

	public void setMpmPrescricaoNpts(MpmPrescricaoNpt mpmPrescricaoNpts) {
		this.mpmPrescricaoNpts = mpmPrescricaoNpts;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TVA_SEQ")
	public AfaTipoVelocAdministracoes getAfaTipoVelocAdministracoes() {
		return this.afaTipoVelocAdministracoes;
	}

	public void setAfaTipoVelocAdministracoes(AfaTipoVelocAdministracoes afaTipoVelocAdministracoes) {
		this.afaTipoVelocAdministracoes = afaTipoVelocAdministracoes;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "TIC_SEQ", nullable = false)
	public AfaTipoComposicoes getAfaTipoComposicoes() {
		return this.afaTipoComposicoes;
	}

	public void setAfaTipoComposicoes(AfaTipoComposicoes afaTipoComposicoes) {
		this.afaTipoComposicoes = afaTipoComposicoes;
	}

	@Column(name = "VELOCIDADE_ADMINISTRACAO", precision = 5, scale = 2)
	public BigDecimal getVelocidadeAdministracao() {
		return this.velocidadeAdministracao;
	}

	public void setVelocidadeAdministracao(BigDecimal velocidadeAdministracao) {
		this.velocidadeAdministracao = velocidadeAdministracao;
	}

	@Column(name = "QTDE_HORAS_CORRER", precision = 2, scale = 0)
	public Byte getQtdeHorasCorrer() {
		return this.qtdeHorasCorrer;
	}

	public void setQtdeHorasCorrer(Byte qtdeHorasCorrer) {
		this.qtdeHorasCorrer = qtdeHorasCorrer;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mpmComposicaoPrescricaoNpts")
	public Set<MpmItemPrescricaoNpt> getMpmItemPrescricaoNptses() {
		return this.mpmItemPrescricaoNptses;
	}

	public void setMpmItemPrescricaoNptses(
			Set<MpmItemPrescricaoNpt> mpmItemPrescricaoNptses) {
		this.mpmItemPrescricaoNptses = mpmItemPrescricaoNptses;
	}

	public enum Fields {
		ID_PNP_ATD_SEQ("id.pnpAtdSeq"),
		ID_PNP_SEQ("id.pnpSeq"),
		ID_SEQP("id.seqp"),
		MPM_PRESCRICAO_NPTS("mpmPrescricaoNpts"), 
		VELOCIDADE_ADMINISTRACAO("velocidadeAdministracao"), 
		QTDE_HORAS_CORRER("qtdeHorasCorrer"), 
		TIPO_VELOCIDADE_ADMINISTRACOES("afaTipoVelocAdministracoes"),
		SEQ_TIPO_VELOCIDADE_ADMINISTRACOES("afaTipoVelocAdministracoes.seq"),
		TIPO_COMPOSICOES("afaTipoComposicoes"),
		TIC_SEC("afaTipoComposicoes.seq"),
		ITENS_PRESCRISAO_NPT("mpmItemPrescricaoNptses"),ID("id");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validarComposicaoPrescricaoNpts() {
		if ((this.velocidadeAdministracao.intValue() < 0) || (this.qtdeHorasCorrer != null && this.qtdeHorasCorrer < 0)) {
			throw new BaseRuntimeException();
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
		if (!(obj instanceof MpmComposicaoPrescricaoNpt)) {
			return false;
		}
		MpmComposicaoPrescricaoNpt other = (MpmComposicaoPrescricaoNpt) obj;
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
