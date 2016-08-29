package br.gov.mec.aghu.model;

// Generated 28/03/2012 15:17:44 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.dominio.DominioTipoFluidoPerdido;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MbcFluidosPerdidos generated by hbm2java
 */
@Entity
@Table(name = "MBC_FLUIDOS_PERDIDOS", schema = "AGH")
public class MbcFluidoPerdido extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8086511380598432158L;
	private Short seq;
	private Integer version;
	private String descricao;
	private DominioTipoFluidoPerdido tipo;
	private DominioSituacao situacao;
	private Date criadoEm;
	/*private Integer serMatricula;
	private Short serVinCodigo;*/
	private RapServidores servidor;
	private Set<MbcFichaFluidoPerdido> mbcFichaFluidoPerdidoses = new HashSet<MbcFichaFluidoPerdido>(
			0);

	public MbcFluidoPerdido() {
	}

	@Id
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

	@Column(name = "DESCRICAO", nullable = false, length = 45)
	@Length(max = 45)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "TIPO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoFluidoPerdido getTipo() {
		return this.tipo;
	}

	@Column(name = "SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mbcFluidosPerdidos")
	public Set<MbcFichaFluidoPerdido> getMbcFichaFluidoPerdidoses() {
		return this.mbcFichaFluidoPerdidoses;
	}

	public void setMbcFichaFluidoPerdidoses(
			Set<MbcFichaFluidoPerdido> mbcFichaFluidoPerdidoses) {
		this.mbcFichaFluidoPerdidoses = mbcFichaFluidoPerdidoses;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO")})
	public RapServidores getServidor() {
		return servidor;
	}

	public void setTipo(DominioTipoFluidoPerdido tipo) {
		this.tipo = tipo;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	public enum Fields {

		SEQ("seq"),
		DESCRICAO("descricao"),
		TIPO("tipo"),
		SITUACAO("situacao"),
		CRIADO_EM("criadoEm"),
		SERVIDOR("servidor"),
		MBC_FICHA_FLUIDO_PERDIDOSES("mbcFichaFluidoPerdidoses");

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
		if (!(obj instanceof MbcFluidoPerdido)) {
			return false;
		}
		MbcFluidoPerdido other = (MbcFluidoPerdido) obj;
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
