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
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MbcEspecificacaoIntubacoes generated by hbm2java
 */
@Entity
@Table(name = "MBC_ESPECIFICACAO_INTUBACOES", schema = "AGH")
public class MbcEspecificacaoIntubacoes extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9117160104583997139L;
	private Short seq;
	private Integer version;
	private String descricao;
	private Short ordem;
	private String tipo;
	private DominioSituacao situacao;
	private Date criadoEm;
	private RapServidores servidor;
	private Set<MbcFichaEspecifIntubacoes> mbcFichaEspecifIntubacoeses = new HashSet<MbcFichaEspecifIntubacoes>(
			0);

	public MbcEspecificacaoIntubacoes() {
	}

	public MbcEspecificacaoIntubacoes(Short seq, String descricao, Short ordem,
			String tipo, DominioSituacao situacao, Date criadoEm, RapServidores servidor) {
		this.seq = seq;
		this.descricao = descricao;
		this.ordem = ordem;
		this.tipo = tipo;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
	}

	public MbcEspecificacaoIntubacoes(Short seq, String descricao, Short ordem,
			String tipo, DominioSituacao situacao, Date criadoEm, RapServidores servidor,
			Set<MbcFichaEspecifIntubacoes> mbcFichaEspecifIntubacoeses) {
		this.seq = seq;
		this.descricao = descricao;
		this.ordem = ordem;
		this.tipo = tipo;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
		this.mbcFichaEspecifIntubacoeses = mbcFichaEspecifIntubacoeses;
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

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "ORDEM", nullable = false)
	public Short getOrdem() {
		return this.ordem;
	}

	public void setOrdem(Short ordem) {
		this.ordem = ordem;
	}

	@Column(name = "TIPO", nullable = false, length = 1)
	@Length(max = 1)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mbcEspecificacaoIntubacoes")
	public Set<MbcFichaEspecifIntubacoes> getMbcFichaEspecifIntubacoeses() {
		return this.mbcFichaEspecifIntubacoeses;
	}

	public void setMbcFichaEspecifIntubacoeses(
			Set<MbcFichaEspecifIntubacoes> mbcFichaEspecifIntubacoeses) {
		this.mbcFichaEspecifIntubacoeses = mbcFichaEspecifIntubacoeses;
	}

	public enum Fields {

		SEQ("seq"),
		DESCRICAO("descricao"),
		ORDEM("ordem"),
		TIPO("tipo"),
		SITUACAO("situacao"),
		CRIADO_EM("criadoEm"),
		SER_MATRICULA("servidor.id.matricula"),
		SER_VIN_CODIGO("servidor.id.vinCodigo"),
		MBC_FICHA_ESPECIF_INTUBACOESES("mbcFichaEspecifIntubacoeses");

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
		if (!(obj instanceof MbcEspecificacaoIntubacoes)) {
			return false;
		}
		MbcEspecificacaoIntubacoes other = (MbcEspecificacaoIntubacoes) obj;
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

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return servidor;
	}

}
