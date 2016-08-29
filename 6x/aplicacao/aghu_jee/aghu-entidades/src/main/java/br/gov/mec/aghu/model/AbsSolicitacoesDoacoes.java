package br.gov.mec.aghu.model;

// Generated 08/02/2010 17:25:25 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AbsSolicitacoesDoacoes generated by hbm2java
 */
@Entity
@Table(name = "ABS_SOLICITACOES_DOACOES", schema = "AGH")
public class AbsSolicitacoesDoacoes extends BaseEntityId<AbsSolicitacoesDoacoesId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5834570103005232141L;
	private AbsSolicitacoesDoacoesId id;
	private Date dthrSolicitacao;
	private Short nroDoadores;
	private String observacao;
	private Date dtEncerramento;
	private String indSituacao;
	private Short serVinCodigo;
	private Integer serMatricula;
	private String indAutomatica;
	private Set<AbsDoacoes> doacoes = new HashSet<AbsDoacoes>(0);

	public AbsSolicitacoesDoacoes() {
	}

	public AbsSolicitacoesDoacoes(AbsSolicitacoesDoacoesId id,
			Date dthrSolicitacao, Short nroDoadores, String indSituacao,
			Short serVinCodigo, Integer serMatricula) {
		this.id = id;
		this.dthrSolicitacao = dthrSolicitacao;
		this.nroDoadores = nroDoadores;
		this.indSituacao = indSituacao;
		this.serVinCodigo = serVinCodigo;
		this.serMatricula = serMatricula;
	}

	public AbsSolicitacoesDoacoes(AbsSolicitacoesDoacoesId id,
			Date dthrSolicitacao, Short nroDoadores, String observacao,
			Date dtEncerramento, String indSituacao, Short serVinCodigo,
			Integer serMatricula, String indAutomatica, Set<AbsDoacoes> doacoes) {
		this.id = id;
		this.dthrSolicitacao = dthrSolicitacao;
		this.nroDoadores = nroDoadores;
		this.observacao = observacao;
		this.dtEncerramento = dtEncerramento;
		this.indSituacao = indSituacao;
		this.serVinCodigo = serVinCodigo;
		this.serMatricula = serMatricula;
		this.indAutomatica = indAutomatica;
		this.doacoes = doacoes;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "pacCodigo", column = @Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "sequencia", column = @Column(name = "SEQUENCIA", nullable = false, precision = 3, scale = 0)) })
	public AbsSolicitacoesDoacoesId getId() {
		return this.id;
	}

	public void setId(AbsSolicitacoesDoacoesId id) {
		this.id = id;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_SOLICITACAO", nullable = false, length = 7)
	public Date getDthrSolicitacao() {
		return this.dthrSolicitacao;
	}

	public void setDthrSolicitacao(Date dthrSolicitacao) {
		this.dthrSolicitacao = dthrSolicitacao;
	}

	@Column(name = "NRO_DOADORES", nullable = false, precision = 3, scale = 0)
	public Short getNroDoadores() {
		return this.nroDoadores;
	}

	public void setNroDoadores(Short nroDoadores) {
		this.nroDoadores = nroDoadores;
	}

	@Column(name = "OBSERVACAO", length = 60)
	@Length(max = 60)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_ENCERRAMENTO", length = 7)
	public Date getDtEncerramento() {
		return this.dtEncerramento;
	}

	public void setDtEncerramento(Date dtEncerramento) {
		this.dtEncerramento = dtEncerramento;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "IND_AUTOMATICA", length = 1)
	@Length(max = 1)
	public String getIndAutomatica() {
		return this.indAutomatica;
	}

	public void setIndAutomatica(String indAutomatica) {
		this.indAutomatica = indAutomatica;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "absSolicitacoesDoacoes")
	public Set<AbsDoacoes> getDoacoes() {
		return this.doacoes;
	}

	public void setDoacoes(Set<AbsDoacoes> doacoes) {
		this.doacoes = doacoes;
	}

	public enum Fields {
		PACIENTE_CODIGO("id.pacCodigo"), 
		SEQUENCIA("id.sequencia"),
		DTHR_SOLICITACAO("dthrSolicitacao"),
		;

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
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
		if (!(obj instanceof AbsSolicitacoesDoacoes)) {
			return false;
		}
		AbsSolicitacoesDoacoes other = (AbsSolicitacoesDoacoes) obj;
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
