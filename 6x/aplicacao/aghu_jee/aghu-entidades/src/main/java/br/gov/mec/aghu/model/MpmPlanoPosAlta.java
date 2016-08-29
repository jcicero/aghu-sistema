package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
import javax.persistence.Transient;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSimNao;
import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MpmPlanoPosAltas generated by hbm2java
 */

@SuppressWarnings({"PMD.AghuUsoIndevidoDaEnumDominioSimNaoEntity"})
@Entity
@SequenceGenerator(name="mpmPlaSq1", sequenceName="AGH.MPM_PLA_SQ1", allocationSize = 1)
@Table(name = "MPM_PLANO_POS_ALTAS", schema = "AGH")
public class MpmPlanoPosAlta extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3223366352146073238L;
	private Short seq;
	private RapServidores servidorMatricula;
	private String descricao;
	private Date criadoEm;
	private Boolean indExigeComplemento;
	private DominioSituacao indSituacao;
	private DominioSimNao indOutros;
	private Integer version;
	//private Set<MpmAltaPlano> altaPlanos = new HashSet<MpmAltaPlano>(0);
	//private Set<MpmSumarioAlta> sumarioAltas = new HashSet<MpmSumarioAlta>(0);
	
	public MpmPlanoPosAlta() {
	}

	public MpmPlanoPosAlta(final Short seq, final RapServidores serMatricula, final String descricao, final Date criadoEm,
			final Boolean indExigeComplemento, final DominioSituacao indSituacao, final DominioSimNao indOutros) {
		this.seq = seq;
		this.servidorMatricula = serMatricula;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.indExigeComplemento = indExigeComplemento;
		this.indSituacao = indSituacao;
		this.indOutros = indOutros;
	}
	/*
	public MpmPlanoPosAlta(final Short seq, final RapServidores serMatricula, final String descricao, final Date criadoEm,
			final Boolean indExigeComplemento, final DominioSituacao indSituacao, final DominioSimNao indOutros,
			final Set<MpmAltaPlano> mpmAltaPlanoses, final Set<MpmSumarioAlta> mpmSumarioAltases) {
		this.seq = seq;
		this.servidorMatricula = serMatricula;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.indExigeComplemento = indExigeComplemento;
		this.indSituacao = indSituacao;
		this.indOutros = indOutros;
		this.altaPlanos = mpmAltaPlanoses;
		this.sumarioAltas = mpmSumarioAltases;
	}
	*/
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mpmPlaSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 4, scale = 0)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(final Short seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( { @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getSerMatricula() {
		return this.servidorMatricula;
	}

	public void setSerMatricula(final RapServidores serMatricula) {
		this.servidorMatricula = serMatricula;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(final String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(final Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_EXIGE_COMPLEMENTO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndExigeComplemento() {
		return this.indExigeComplemento;
	}

	public void setIndExigeComplemento(final Boolean isExigeComplemento) {
		this.indExigeComplemento = isExigeComplemento;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(final DominioSituacao isSituacao) {
		this.indSituacao = isSituacao;
	}

	@Column(name = "IND_OUTROS", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndOutros() {
		return this.indOutros;
	}

	public void setIndOutros(final DominioSimNao isOutros) {
		this.indOutros = isOutros;
	}
	
	//IndIndEmiteTicket
	@Transient
	public boolean isIndicOutros() {
		if (getIndOutros() != null) {
			return getIndOutros() == DominioSimNao.S;
		} else {
			return Boolean.FALSE;
		}
	}
	
	public void setIndicOutros(boolean valor) {
		setIndOutros(DominioSimNao.getInstance(valor));
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}	

	/*
	@OneToMany(fetch = FetchType.LAZY)
	public Set<MpmAltaPlano> getAltaPlanos() {
		return this.altaPlanos;
	}

	public void setAltaPlanos(final Set<MpmAltaPlano> mpmAltaPlanoses) {
		this.altaPlanos = mpmAltaPlanoses;
	}
	 */
	/*
	@OneToMany(fetch = FetchType.LAZY)
	public Set<MpmSumarioAlta> getSumarioAltas() {
		return this.sumarioAltas;
	}

	public void setSumarioAltas(final Set<MpmSumarioAlta> mpmSumarioAltases) {
		this.sumarioAltas = mpmSumarioAltases;
	}
	*/
	
	public enum Fields {
		SEQ("seq"),
		IND_SITUACAO("indSituacao"),
		DESCRICAO("descricao"),
		SERVIDOR("serMatricula")
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

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MpmPlanoPosAlta)) {
			return false;
		}
		MpmPlanoPosAlta other = (MpmPlanoPosAlta) obj;
		if (this.getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!this.getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.getSeq() == null) ? 0 : this.getSeq().hashCode());
		return result;
	}

}
