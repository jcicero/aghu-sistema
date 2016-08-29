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
 * RapCurExperienciaProfi generated by hbm2java
 */
@Entity
@Table(name = "RAP_CUR_EXPERIENCIAS_PROFIS", schema = "AGH")
public class RapCurExperienciaProfi extends BaseEntityId<RapCurExperienciaProfiId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7694376547057127006L;
	private RapCurExperienciaProfiId id;
	private Integer version;
	private RapServidores rapServidores;
	private RapPessoasFisicas rapPessoasFisicas;
	private String funcao;
	private String setor;
	private String empresa;
	private Date dtInicio;
	private Date dtFim;
	private Date alteradoEm;

	public RapCurExperienciaProfi() {
	}

	public RapCurExperienciaProfi(RapCurExperienciaProfiId id, RapPessoasFisicas rapPessoasFisicas) {
		this.id = id;
		this.rapPessoasFisicas = rapPessoasFisicas;
	}

	public RapCurExperienciaProfi(RapCurExperienciaProfiId id, RapServidores rapServidores, RapPessoasFisicas rapPessoasFisicas,
			String funcao, String setor, String empresa, Date dtInicio, Date dtFim, Date alteradoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.rapPessoasFisicas = rapPessoasFisicas;
		this.funcao = funcao;
		this.setor = setor;
		this.empresa = empresa;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.alteradoEm = alteradoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "pesCodigo", column = @Column(name = "PES_CODIGO", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public RapCurExperienciaProfiId getId() {
		return this.id;
	}

	public void setId(RapCurExperienciaProfiId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PES_CODIGO", nullable = false, insertable = false, updatable = false)
	public RapPessoasFisicas getRapPessoasFisicas() {
		return this.rapPessoasFisicas;
	}

	public void setRapPessoasFisicas(RapPessoasFisicas rapPessoasFisicas) {
		this.rapPessoasFisicas = rapPessoasFisicas;
	}

	@Column(name = "FUNCAO", length = 60)
	@Length(max = 60)
	public String getFuncao() {
		return this.funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	@Column(name = "SETOR", length = 60)
	@Length(max = 60)
	public String getSetor() {
		return this.setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Column(name = "EMPRESA", length = 60)
	@Length(max = 60)
	public String getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO", length = 29)
	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM", length = 29)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
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
		RAP_SERVIDORES("rapServidores"),
		RAP_PESSOAS_FISICAS("rapPessoasFisicas"),
		FUNCAO("funcao"),
		SETOR("setor"),
		EMPRESA("empresa"),
		DT_INICIO("dtInicio"),
		DT_FIM("dtFim"),
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
		if (!(obj instanceof RapCurExperienciaProfi)) {
			return false;
		}
		RapCurExperienciaProfi other = (RapCurExperienciaProfi) obj;
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
