package br.gov.mec.aghu.model;

// Generated 28/03/2012 15:17:44 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import br.gov.mec.aghu.dominio.DominioAbordagemNeuroeixoNvlPuncionados;
import br.gov.mec.aghu.dominio.DominioBloqueioNeuroeixoNvlPuncionados;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MbcNeuroeixoNvlPuncionados generated by hbm2java
 */
@Entity
@Table(name = "MBC_NEUROEIXO_NVL_PUNCIONADOS", schema = "AGH")
public class MbcNeuroeixoNvlPuncionados extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6455032807094290755L;
	private Integer seq;
	private Integer version;
	private MbcAnestRegionalNeuroeixos mbcAnestRegionalNeuroeixos;
	private MbcNivelPuncionado mbcNivelPuncionados;
	private MbcPosicionamento mbcPosicionamentos;
	private Date criadoEm;
	private RapServidores servidor;
	private DominioBloqueioNeuroeixoNvlPuncionados bloqueio;
	private DominioAbordagemNeuroeixoNvlPuncionados abordagem;

	public MbcNeuroeixoNvlPuncionados() {
	}


	public MbcNeuroeixoNvlPuncionados(Integer seq, Integer version,
			MbcAnestRegionalNeuroeixos mbcAnestRegionalNeuroeixos,
			MbcNivelPuncionado mbcNivelPuncionados,
			MbcPosicionamento mbcPosicionamentos, Date criadoEm,
			RapServidores servidor,
			DominioBloqueioNeuroeixoNvlPuncionados bloqueio,
			DominioAbordagemNeuroeixoNvlPuncionados abordagem) {
		super();
		this.seq = seq;
		this.version = version;
		this.mbcAnestRegionalNeuroeixos = mbcAnestRegionalNeuroeixos;
		this.mbcNivelPuncionados = mbcNivelPuncionados;
		this.mbcPosicionamentos = mbcPosicionamentos;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
		this.bloqueio = bloqueio;
		this.abordagem = abordagem;
	}


	@Id
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
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
	@JoinColumn(name = "NEU_SEQ", nullable = false)
	public MbcAnestRegionalNeuroeixos getMbcAnestRegionalNeuroeixos() {
		return this.mbcAnestRegionalNeuroeixos;
	}

	public void setMbcAnestRegionalNeuroeixos(
			MbcAnestRegionalNeuroeixos mbcAnestRegionalNeuroeixos) {
		this.mbcAnestRegionalNeuroeixos = mbcAnestRegionalNeuroeixos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PUN_SEQ")
	public MbcNivelPuncionado getMbcNivelPuncionados() {
		return this.mbcNivelPuncionados;
	}

	public void setMbcNivelPuncionados(MbcNivelPuncionado mbcNivelPuncionados) {
		this.mbcNivelPuncionados = mbcNivelPuncionados;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "POI_SEQ")
	public MbcPosicionamento getMbcPosicionamentos() {
		return this.mbcPosicionamentos;
	}

	public void setMbcPosicionamentos(MbcPosicionamento mbcPosicionamentos) {
		this.mbcPosicionamentos = mbcPosicionamentos;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO")})
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Column(name = "BLOQUEIO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioBloqueioNeuroeixoNvlPuncionados getBloqueio() {
		return this.bloqueio;
	}

	public void setBloqueio(DominioBloqueioNeuroeixoNvlPuncionados bloqueio) {
		this.bloqueio = bloqueio;
	}

	@Column(name = "ABORDAGEM", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioAbordagemNeuroeixoNvlPuncionados getAbordagem() {
		return this.abordagem;
	}

	public void setAbordagem(DominioAbordagemNeuroeixoNvlPuncionados abordagem) {
		this.abordagem = abordagem;
	}

	public enum Fields {

		SEQ("seq"),
		MBC_ANEST_REGIONAL_NEUROEIXOS("mbcAnestRegionalNeuroeixos"),
		MBC_NIVEL_PUNCIONADOS("mbcNivelPuncionados"),
		MBC_POSICIONAMENTOS("mbcPosicionamentos"),
		CRIADO_EM("criadoEm"),
		BLOQUEIO("bloqueio"),
		ABORDAGEM("abordagem");

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
		if (!(obj instanceof MbcNeuroeixoNvlPuncionados)) {
			return false;
		}
		MbcNeuroeixoNvlPuncionados other = (MbcNeuroeixoNvlPuncionados) obj;
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
