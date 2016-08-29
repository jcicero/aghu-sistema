package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.dominio.DominioTipoSumarioAlta;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmServRecomendacaoAlta generated by hbm2java
 */

@Entity
@Table(name = "MPM_SERV_RECOMENDACAO_ALTAS", schema = "AGH")
public class MpmServRecomendacaoAlta extends BaseEntityId<MpmServRecomendacaoAltaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5836941729261471366L;
	private MpmServRecomendacaoAltaId id;
	private String descricao;
	private Date criadoEm;
	private DominioSituacao indSituacao;
	private DominioTipoSumarioAlta indTipoSumrAlta;
	private RapServidores servidor;

	public MpmServRecomendacaoAlta() {
	}

	public MpmServRecomendacaoAlta(MpmServRecomendacaoAltaId id,
			String descricao, Date criadoEm, DominioSituacao indSituacao,
			DominioTipoSumarioAlta indTipoSumrAlta) {
		this.id = id;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.indTipoSumrAlta = indTipoSumrAlta;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 5, scale = 0)) })
	public MpmServRecomendacaoAltaId getId() {
		return this.id;
	}

	public void setId(MpmServRecomendacaoAltaId id) {
		this.id = id;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 500)
	@Length(max = 500)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "IND_TIPO_SUMR_ALTA", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoSumarioAlta getIndTipoSumrAlta() {
		return this.indTipoSumrAlta;
	}	

	public void setIndTipoSumrAlta(DominioTipoSumarioAlta indTipoSumrAlta) {
		this.indTipoSumrAlta = indTipoSumrAlta;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false, insertable = false, updatable = false) })
	public RapServidores getServidor() {
		return servidor;
	}
	
	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	public enum Fields {
		SEQP("id.seqp"),
		DESCRICAO("descricao"),
		SERVIDOR_MAT("id.serMatricula"),
		SERVIDOR_VIN("id.serVinCodigo"),
		SERVIDOR("servidor");

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
		if (!(obj instanceof MpmServRecomendacaoAlta)) {
			return false;
		}
		MpmServRecomendacaoAlta other = (MpmServRecomendacaoAlta) obj;
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
