package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityCodigo;

/**
 * FatTiposTransplante generated by hbm2java
 */
@Entity
@Table(name = "FAT_TIPOS_TRANSPLANTE", schema = "AGH")
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.TRANSACTIONAL)
public class FatTipoTransplante extends BaseEntityCodigo<String> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8048990921356429107L;
	private String codigo;
	private String descricao;
	private String indInformaSus;
	private String indTipoTransplante;
	private Short qtdMesesAcomp;
	private Set<FatExcCnvGrpItemProc> fatExcCnvGrpItemProcs = new HashSet<FatExcCnvGrpItemProc>(0);
	private Set<FatCompatExclusItem> fatCompatExclusItenses = new HashSet<FatCompatExclusItem>(0);
	private Set<FatItemProcHospTransp> fatItemProcHospTransps = new HashSet<FatItemProcHospTransp>(0);
	private Integer version;

	public FatTipoTransplante() {
	}

	public FatTipoTransplante(String codigo, String descricao,
			String indTipoTransplante) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.indTipoTransplante = indTipoTransplante;
	}

	public FatTipoTransplante(String codigo, String descricao,
			String indInformaSus, String indTipoTransplante,
			Short qtdMesesAcomp,
			Set<FatExcCnvGrpItemProc> fatExcCnvGrpItemProcs,
			Set<FatCompatExclusItem> fatCompatExclusItenses,
			Set<FatItemProcHospTransp> fatItemProcHospTransps) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.indInformaSus = indInformaSus;
		this.indTipoTransplante = indTipoTransplante;
		this.qtdMesesAcomp = qtdMesesAcomp;
		this.fatExcCnvGrpItemProcs = fatExcCnvGrpItemProcs;
		this.fatCompatExclusItenses = fatCompatExclusItenses;
		this.fatItemProcHospTransps = fatItemProcHospTransps;
	}

	@Id
	@Column(name = "CODIGO", unique = true, nullable = false, length = 10)
	@Length(max = 10)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 100)
	@Length(max = 100)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_INFORMA_SUS", length = 1)
	@Length(max = 1)
	public String getIndInformaSus() {
		return this.indInformaSus;
	}

	public void setIndInformaSus(String indInformaSus) {
		this.indInformaSus = indInformaSus;
	}

	@Column(name = "IND_TIPO_TRANSPLANTE", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndTipoTransplante() {
		return this.indTipoTransplante;
	}

	public void setIndTipoTransplante(String indTipoTransplante) {
		this.indTipoTransplante = indTipoTransplante;
	}

	@Column(name = "QTD_MESES_ACOMP", precision = 4, scale = 0)
	public Short getQtdMesesAcomp() {
		return this.qtdMesesAcomp;
	}

	public void setQtdMesesAcomp(Short qtdMesesAcomp) {
		this.qtdMesesAcomp = qtdMesesAcomp;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatTipoTransplante")
	public Set<FatExcCnvGrpItemProc> getFatExcCnvGrpItemProcs() {
		return this.fatExcCnvGrpItemProcs;
	}

	public void setFatExcCnvGrpItemProcs(
			Set<FatExcCnvGrpItemProc> fatExcCnvGrpItemProcs) {
		this.fatExcCnvGrpItemProcs = fatExcCnvGrpItemProcs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoTransplante")
	public Set<FatCompatExclusItem> getFatCompatExclusItenses() {
		return this.fatCompatExclusItenses;
	}

	public void setFatCompatExclusItenses(
			Set<FatCompatExclusItem> fatCompatExclusItenses) {
		this.fatCompatExclusItenses = fatCompatExclusItenses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatTipoTransplante")
	public Set<FatItemProcHospTransp> getFatItemProcHospTransps() {
		return this.fatItemProcHospTransps;
	}

	public void setFatItemProcHospTransps(
			Set<FatItemProcHospTransp> fatItemProcHospTransps) {
		this.fatItemProcHospTransps = fatItemProcHospTransps;
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
		result = prime * result + ((getCodigo() == null)
				? 0
				: getCodigo().hashCode());
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
		if (!(obj instanceof FatTipoTransplante)) {
			return false;
		}
		FatTipoTransplante other = (FatTipoTransplante) obj;
		if (getCodigo() == null) {
			if (other.getCodigo() != null) {
				return false;
			}
		} else if (!getCodigo().equals(other.getCodigo())) {
			return false;
		}
		return true;
	}

	public enum Fields {
		
		CODIGO("codigo"),
		DESCRICAO("descricao"),
		IND_INFORMA_SUS("indInformaSus"),
		IND_TIPO_TRANSPLANTE("indTipoTransplante"),
		QTD_MESES_ACOMP("qtdMesesAcomp");
		
		private String fields;

		private Fields(final String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}
	
}
