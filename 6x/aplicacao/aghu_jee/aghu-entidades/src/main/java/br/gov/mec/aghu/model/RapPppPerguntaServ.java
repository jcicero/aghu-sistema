package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * RapPppPerguntaServ generated by hbm2java
 */
@Entity
@Table(name = "RAP_PPP_PERGUNTAS_SERV", schema = "AGH")
public class RapPppPerguntaServ extends BaseEntityId<RapPppPerguntaServId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5740862279478788656L;
	private RapPppPerguntaServId id;
	private Integer version;
	private RapServidores rapServidores;
	private RapPppPerguntaEpi rapPppPerguntaEpi;
	private String resposta;
	private String observacao;

	public RapPppPerguntaServ() {
	}

	public RapPppPerguntaServ(RapPppPerguntaServId id, RapServidores rapServidores, RapPppPerguntaEpi rapPppPerguntaEpi) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.rapPppPerguntaEpi = rapPppPerguntaEpi;
	}

	public RapPppPerguntaServ(RapPppPerguntaServId id, RapServidores rapServidores, RapPppPerguntaEpi rapPppPerguntaEpi,
			String resposta, String observacao) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.rapPppPerguntaEpi = rapPppPerguntaEpi;
		this.resposta = resposta;
		this.observacao = observacao;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA", nullable = false)),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO", nullable = false)),
			@AttributeOverride(name = "pepSeq", column = @Column(name = "PEP_SEQ", nullable = false)) })
	public RapPppPerguntaServId getId() {
		return this.id;
	}

	public void setId(RapPppPerguntaServId id) {
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
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false, insertable = false, updatable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PEP_SEQ", nullable = false, insertable = false, updatable = false)
	public RapPppPerguntaEpi getRapPppPerguntaEpi() {
		return this.rapPppPerguntaEpi;
	}

	public void setRapPppPerguntaEpi(RapPppPerguntaEpi rapPppPerguntaEpi) {
		this.rapPppPerguntaEpi = rapPppPerguntaEpi;
	}

	@Column(name = "RESPOSTA", length = 1)
	@Length(max = 1)
	public String getResposta() {
		return this.resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	@Column(name = "OBSERVACAO", length = 240)
	@Length(max = 240)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		RAP_PPP_PERGUNTAS_EPI("rapPppPerguntaEpi"),
		RESPOSTA("resposta"),
		OBSERVACAO("observacao");

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
		if (!(obj instanceof RapPppPerguntaServ)) {
			return false;
		}
		RapPppPerguntaServ other = (RapPppPerguntaServ) obj;
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
