package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatApacCampoSessoes generated by hbm2java
 */
@Entity
@Table(name = "FAT_APAC_CAMPO_SESSOES", schema = "AGH")
public class FatApacCampoSessao extends BaseEntityId<FatApacCampoSessaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7005678451400299780L;
	private FatApacCampoSessaoId id;
	private Byte camposSessao;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Date dtFim;
	private Integer cidSeq;

	public FatApacCampoSessao() {
	}

	public FatApacCampoSessao(FatApacCampoSessaoId id,
			Byte camposSessao, Date criadoEm, Integer serMatricula,
			Short serVinCodigo) {
		this.id = id;
		this.camposSessao = camposSessao;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	public FatApacCampoSessao(FatApacCampoSessaoId id,
			Byte camposSessao, Date criadoEm, Integer serMatricula,
			Short serVinCodigo, Date dtFim, Integer cidSeq) {
		this.id = id;
		this.camposSessao = camposSessao;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.dtFim = dtFim;
		this.cidSeq = cidSeq;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "atmNumero", column = @Column(name = "ATM_NUMERO", nullable = false, precision = 13, scale = 0)),
			@AttributeOverride(name = "dtInicio", column = @Column(name = "DT_INICIO", nullable = false, length = 7)) })
	public FatApacCampoSessaoId getId() {
		return this.id;
	}

	public void setId(FatApacCampoSessaoId id) {
		this.id = id;
	}

	@Column(name = "CAMPOS_SESSAO", nullable = false, scale = 0)
	public Byte getCamposSessao() {
		return this.camposSessao;
	}

	public void setCamposSessao(Byte camposSessao) {
		this.camposSessao = camposSessao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_FIM", length = 7)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	@Column(name = "CID_SEQ", precision = 5, scale = 0)
	public Integer getCidSeq() {
		return this.cidSeq;
	}

	public void setCidSeq(Integer cidSeq) {
		this.cidSeq = cidSeq;
	}

	public enum Fields {
		ATM_NUMERO("id.atmNumero"),DT_INICIO("id.dtInicio");

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
		if (!(obj instanceof FatApacCampoSessao)) {
			return false;
		}
		FatApacCampoSessao other = (FatApacCampoSessao) obj;
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
