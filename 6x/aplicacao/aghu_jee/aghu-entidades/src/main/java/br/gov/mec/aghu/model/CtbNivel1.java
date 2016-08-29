package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * CtbNivel1 generated by hbm2java
 */
@Entity
@SequenceGenerator(name="ctbNv1Sq1", sequenceName="AGH.CTB_NV1_SQ1", allocationSize = 1)
@Table(name = "CTB_NIVEL_1", schema = "AGH")
public class CtbNivel1 extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6504956739715638312L;
	private Short seq;
	private Integer version;
	private CtbNaturezaPlano ctbNaturezaPlano;
	private CtbGrupoNaturezaPlano ctbGrupoNaturezaPlano;
	private CtbTipoAberturaPlano ctbTipoAberturaPlano;
	private RapServidores rapServidores;
	private String descricao;
	private Date criadoEm;
	private Date alteradoEm;
	private Short ideSeq;

	public CtbNivel1() {
	}

	public CtbNivel1(Short seq, CtbTipoAberturaPlano ctbTipoAberturaPlano, RapServidores rapServidores, String descricao,
			Date criadoEm, Date alteradoEm, Short ideSeq) {
		this.seq = seq;
		this.ctbTipoAberturaPlano = ctbTipoAberturaPlano;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.ideSeq = ideSeq;
	}

	public CtbNivel1(Short seq, CtbNaturezaPlano ctbNaturezaPlano, CtbGrupoNaturezaPlano ctbGrupoNaturezaPlano,
			CtbTipoAberturaPlano ctbTipoAberturaPlano, RapServidores rapServidores, String descricao, Date criadoEm,
			Date alteradoEm, Short ideSeq) {
		this.seq = seq;
		this.ctbNaturezaPlano = ctbNaturezaPlano;
		this.ctbGrupoNaturezaPlano = ctbGrupoNaturezaPlano;
		this.ctbTipoAberturaPlano = ctbTipoAberturaPlano;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.ideSeq = ideSeq;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ctbNv1Sq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
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
	@JoinColumns({ @JoinColumn(name = "NTP_GNP_TAB_CODIGO", referencedColumnName = "GNP_TAB_CODIGO"),
			@JoinColumn(name = "NTP_GNP_CODIGO", referencedColumnName = "GNP_CODIGO"),
			@JoinColumn(name = "NTP_CODIGO", referencedColumnName = "CODIGO") })
	public CtbNaturezaPlano getCtbNaturezaPlano() {
		return this.ctbNaturezaPlano;
	}

	public void setCtbNaturezaPlano(CtbNaturezaPlano ctbNaturezaPlano) {
		this.ctbNaturezaPlano = ctbNaturezaPlano;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "GNP_TAB_CODIGO", referencedColumnName = "TAB_CODIGO"),
			@JoinColumn(name = "GNP_CODIGO", referencedColumnName = "CODIGO") })
	public CtbGrupoNaturezaPlano getCtbGrupoNaturezaPlano() {
		return this.ctbGrupoNaturezaPlano;
	}

	public void setCtbGrupoNaturezaPlano(CtbGrupoNaturezaPlano ctbGrupoNaturezaPlano) {
		this.ctbGrupoNaturezaPlano = ctbGrupoNaturezaPlano;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TAB_CODIGO", nullable = false)
	public CtbTipoAberturaPlano getCtbTipoAberturaPlano() {
		return this.ctbTipoAberturaPlano;
	}

	public void setCtbTipoAberturaPlano(CtbTipoAberturaPlano ctbTipoAberturaPlano) {
		this.ctbTipoAberturaPlano = ctbTipoAberturaPlano;
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

	@Column(name = "DESCRICAO", nullable = false, length = 240)
	@Length(max = 240)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", nullable = false, length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "IDE_SEQ", nullable = false)
	public Short getIdeSeq() {
		return this.ideSeq;
	}

	public void setIdeSeq(Short ideSeq) {
		this.ideSeq = ideSeq;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		CTB_NATUREZA_PLANOS("ctbNaturezaPlano"),
		CTB_GRUPO_NATUREZA_PLANOS("ctbGrupoNaturezaPlano"),
		CTB_TIPO_ABERTURA_PLANOS("ctbTipoAberturaPlano"),
		RAP_SERVIDORES("rapServidores"),
		DESCRICAO("descricao"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		IDE_SEQ("ideSeq");

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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof CtbNivel1)) {
			return false;
		}
		CtbNivel1 other = (CtbNivel1) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
