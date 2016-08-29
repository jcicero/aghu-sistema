package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatConvFaixaEtarias generated by hbm2java
 */
@Entity
@Table(name = "FAT_CONV_FAIXA_ETARIAS", schema = "AGH")
public class FatConvFaixaEtaria extends BaseEntityId<FatConvFaixaEtariaId> implements java.io.Serializable {
	private static final long serialVersionUID = 3814480623458366242L;
	
	private FatConvFaixaEtariaId id;
	private Short idadeInicio;
	private Short idadeFim;
	private Date dtInicioValidade;
	private Date dtFimValidade;
	private Byte codigoSus;
	private DominioSituacao indSituacaoRegistro;
	private Set<FatConvFxEtariaItem> fatConvFxEtariasItenses = new HashSet<FatConvFxEtariaItem>(
			0);
	private Integer version;

	public FatConvFaixaEtaria() {
	}

	public FatConvFaixaEtaria(FatConvFaixaEtariaId id, Short idadeInicio,
			Short idadeFim, Date dtInicioValidade) {
		this.id = id;
		this.idadeInicio = idadeInicio;
		this.idadeFim = idadeFim;
		this.dtInicioValidade = dtInicioValidade;
	}

	public FatConvFaixaEtaria(FatConvFaixaEtariaId id, Short idadeInicio,
			Short idadeFim, Date dtInicioValidade, Date dtFimValidade,
			Byte codigoSus, DominioSituacao indSituacaoRegistro,
			Set<FatConvFxEtariaItem> fatConvFxEtariasItenses) {
		this.id = id;
		this.idadeInicio = idadeInicio;
		this.idadeFim = idadeFim;
		this.dtInicioValidade = dtInicioValidade;
		this.dtFimValidade = dtFimValidade;
		this.codigoSus = codigoSus;
		this.indSituacaoRegistro = indSituacaoRegistro;
		this.fatConvFxEtariasItenses = fatConvFxEtariasItenses;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "cnvCodigo", column = @Column(name = "CNV_CODIGO", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 2, scale = 0)) })
	public FatConvFaixaEtariaId getId() {
		return this.id;
	}

	public void setId(FatConvFaixaEtariaId id) {
		this.id = id;
	}

	@Column(name = "IDADE_INICIO", nullable = false, precision = 3, scale = 0)
	public Short getIdadeInicio() {
		return this.idadeInicio;
	}

	public void setIdadeInicio(Short idadeInicio) {
		this.idadeInicio = idadeInicio;
	}

	@Column(name = "IDADE_FIM", nullable = false, precision = 3, scale = 0)
	public Short getIdadeFim() {
		return this.idadeFim;
	}

	public void setIdadeFim(Short idadeFim) {
		this.idadeFim = idadeFim;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_INICIO_VALIDADE", nullable = false, length = 7)
	public Date getDtInicioValidade() {
		return this.dtInicioValidade;
	}

	public void setDtInicioValidade(Date dtInicioValidade) {
		this.dtInicioValidade = dtInicioValidade;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_FIM_VALIDADE", length = 7)
	public Date getDtFimValidade() {
		return this.dtFimValidade;
	}

	public void setDtFimValidade(Date dtFimValidade) {
		this.dtFimValidade = dtFimValidade;
	}

	@Column(name = "CODIGO_SUS", precision = 2, scale = 0)
	public Byte getCodigoSus() {
		return this.codigoSus;
	}

	public void setCodigoSus(Byte codigoSus) {
		this.codigoSus = codigoSus;
	}

	@Column(name = "IND_SITUACAO_REGISTRO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacaoRegistro() {
		return this.indSituacaoRegistro;
	}

	public void setIndSituacaoRegistro(DominioSituacao indSituacaoRegistro) {
		this.indSituacaoRegistro = indSituacaoRegistro;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatConvFaixaEtaria")
	public Set<FatConvFxEtariaItem> getFatConvFxEtariasItenses() {
		return this.fatConvFxEtariasItenses;
	}

	public void setFatConvFxEtariasItenses(
			Set<FatConvFxEtariaItem> fatConvFxEtariasItenses) {
		this.fatConvFxEtariasItenses = fatConvFxEtariasItenses;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
		
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		FatConvFaixaEtaria other = (FatConvFaixaEtaria) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}




	public enum Fields {

		CNV_CODIGO("id.cnvCodigo"),
		SEQP("id.seqp"),
		DT_INICIO_VALIDADE("dtInicioValidade"),
		DT_FIM_VALIDADE("dtFimValidade"),
		IDADE_INICIO("idadeInicio"),
		IDADE_FIM("idadeFim"),
		IND_SITUACAO_REGISTRO("indSituacaoRegistro"),
		CODIGO_SUS("codigoSus"),
		;

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

}
