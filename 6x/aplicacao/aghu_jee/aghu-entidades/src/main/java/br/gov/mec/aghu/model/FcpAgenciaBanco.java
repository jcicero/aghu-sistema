package br.gov.mec.aghu.model;

// Generated 10/08/2010 17:33:16 by Hibernate Tools 3.3.0.GA

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FcpAgenciaBancos generated by hbm2java
 */

@Entity
@Table(name = "FCP_AGENCIA_BANCOS", schema = "AGH")
public class FcpAgenciaBanco extends BaseEntityId<FcpAgenciaBancoId> implements java.io.Serializable {

	private static final long serialVersionUID = -2238810004943941195L;
	private FcpAgenciaBancoId id;
	private String descricao;
	private Set<FatItemContaHospitalar> itensContaHospitalar = new HashSet<FatItemContaHospitalar>(0);
	private FcpBanco fcpBanco;
	private Integer version;
	
	public FcpAgenciaBanco() {
	}
	
	public void setAgenciaBanco(final FcpBanco fcpBanco) {
		this.fcpBanco = fcpBanco;
	}

	public FcpAgenciaBanco(FcpAgenciaBancoId id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public FcpAgenciaBanco(FcpAgenciaBancoId id, String descricao,
			Set<FatItemContaHospitalar> itensContaHospitalar) {
		this.id = id;
		this.descricao = descricao;
		this.itensContaHospitalar = itensContaHospitalar;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "bcoCodigo", column = @Column(name = "BCO_CODIGO", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "codigo", column = @Column(name = "CODIGO", nullable = false, precision = 5, scale = 0)) })
	public FcpAgenciaBancoId getId() {
		return this.id;
	}

	public void setId(FcpAgenciaBancoId id) {
		this.id = id;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "agenciaBanco")
	public Set<FatItemContaHospitalar> getItensContaHospitalar() {
		return this.itensContaHospitalar;
	}

	public void setItensContaHospitalar(
			Set<FatItemContaHospitalar> itensContaHospitalar) {
		this.itensContaHospitalar = itensContaHospitalar;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "BCO_CODIGO", nullable = false, insertable = false, updatable = false)
	public FcpBanco getFcpBanco() {
		return this.fcpBanco;
	}
	
	public void setFcpBanco(FcpBanco fcpBanco) {
		this.fcpBanco = fcpBanco;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return version;
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
		if (!(obj instanceof FcpAgenciaBanco)) {
			return false;
		}
		FcpAgenciaBanco other = (FcpAgenciaBanco) obj;
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

		ID("id"),
		ID_CODIGO("id.codigo"),
		ID_BCO_CODIGO("id.bcoCodigo"),
		BANCO("fcpBanco"),
		BANCO_CODIGO("fcpBanco.codigo"),
		BANCO_NOME("fcpBanco.nome"),
		DESCRICAO("descricao"),
		ITENS_CONTA_HOSPITALAR("itensContaHospitalar");

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
