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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * PdtDadoImg generated by hbm2java
 */
@Entity
@Table(name = "PDT_DADOS_IMGS", schema = "AGH")
public class PdtDadoImg extends BaseEntityId<PdtDadoImgId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1475973399444074760L;
	private PdtDadoImgId id;
	private Integer version;
	private PdtDescricao pdtDescricao;
	private RapServidores rapServidores;
	private String texto;
	private Date criadoEm;
	private Short ordem;
	private PdtImg pdtImg;

	public PdtDadoImg() {
	}

	public PdtDadoImg(PdtDadoImgId id, PdtDescricao pdtDescricao, RapServidores rapServidores, Date criadoEm) {
		this.id = id;
		this.pdtDescricao = pdtDescricao;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
	}

	public PdtDadoImg(PdtDadoImgId id, PdtDescricao pdtDescricao, RapServidores rapServidores, String texto, Date criadoEm,
			Short ordem, PdtImg pdtImg) {
		this.id = id;
		this.pdtDescricao = pdtDescricao;
		this.rapServidores = rapServidores;
		this.texto = texto;
		this.criadoEm = criadoEm;
		this.ordem = ordem;
		this.pdtImg = pdtImg;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "ddtSeq", column = @Column(name = "DDT_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public PdtDadoImgId getId() {
		return this.id;
	}

	public void setId(PdtDadoImgId id) {
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
	@JoinColumn(name = "DDT_SEQ", nullable = false, insertable = false, updatable = false)
	public PdtDescricao getPdtDescricao() {
		return this.pdtDescricao;
	}

	public void setPdtDescricao(PdtDescricao pdtDescricao) {
		this.pdtDescricao = pdtDescricao;
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

	@Column(name = "TEXTO", length = 240)
	@Length(max = 240)
	public String getTexto() {
		return this.texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "ORDEM")
	public Short getOrdem() {
		return this.ordem;
	}

	public void setOrdem(Short ordem) {
		this.ordem = ordem;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "pdtDadoImg")
	public PdtImg getPdtImg() {
		return this.pdtImg;
	}

	public void setPdtImg(PdtImg pdtImg) {
		this.pdtImg = pdtImg;
	}

	public enum Fields {

		ID("id"),
		DDT_SEQ("id.ddtSeq"),
		VERSION("version"),
		PDT_DESCRICAO("pdtDescricao"),
		RAP_SERVIDORES("rapServidores"),
		TEXTO("texto"),
		CRIADO_EM("criadoEm"),
		ORDEM("ordem"),
		PDT_IMGS("pdtImg");

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
		if (!(obj instanceof PdtDadoImg)) {
			return false;
		}
		PdtDadoImg other = (PdtDadoImg) obj;
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
