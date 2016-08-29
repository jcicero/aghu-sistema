package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

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
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * PdtComplementoPorCid generated by hbm2java
 */
@Entity
@Table(name = "PDT_COMPLEMENTO_POR_CIDS", schema = "AGH")
public class PdtComplementoPorCid extends BaseEntityId<PdtComplementoPorCidId> implements java.io.Serializable {

	private static final long serialVersionUID = 7883900418402767061L;
	private PdtComplementoPorCidId id;
	private Integer version;
	private RapServidores rapServidores;
	private PdtCidPorProc pdtCidPorProc;
	private String descricao;
	private DominioSituacao indSituacao;
	private Date criadoEm;
	private Set<PdtCidDesc> pdtCidDesces = new HashSet<PdtCidDesc>(0);

	public PdtComplementoPorCid() {
	}

	public PdtComplementoPorCid(PdtComplementoPorCidId id, RapServidores rapServidores, PdtCidPorProc pdtCidPorProc,
			String descricao, DominioSituacao indSituacao, Date criadoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.pdtCidPorProc = pdtCidPorProc;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	public PdtComplementoPorCid(PdtComplementoPorCidId id, RapServidores rapServidores, PdtCidPorProc pdtCidPorProc,
			String descricao, DominioSituacao indSituacao, Date criadoEm, Set<PdtCidDesc> pdtCidDesces) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.pdtCidPorProc = pdtCidPorProc;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.pdtCidDesces = pdtCidDesces;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "cxpDptSeq", column = @Column(name = "CXP_DPT_SEQ", nullable = false)),
			@AttributeOverride(name = "cxpCidSeq", column = @Column(name = "CXP_CID_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public PdtComplementoPorCidId getId() {
		return this.id;
	}

	public void setId(PdtComplementoPorCidId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CXP_DPT_SEQ", referencedColumnName = "DPT_SEQ", insertable = false, updatable = false),
			@JoinColumn(name = "CXP_CID_SEQ", referencedColumnName = "CID_SEQ", insertable = false, updatable = false) })
	public PdtCidPorProc getPdtCidPorProc() {
		return this.pdtCidPorProc;
	}

	public void setPdtCidPorProc(PdtCidPorProc pdtCidPorProc) {
		this.pdtCidPorProc = pdtCidPorProc;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pdtComplementoPorCid")
	public Set<PdtCidDesc> getPdtCidDesces() {
		return this.pdtCidDesces;
	}

	public void setPdtCidDesces(Set<PdtCidDesc> pdtCidDesces) {
		this.pdtCidDesces = pdtCidDesces;
	}

	public enum Fields {

		ID("id"),
		ID_CXP_DPT_SEQ("id.cxpDptSeq"),
		ID_CXP_CID_SEQ("id.cxpCidSeq"),
		ID_SEQP("id.seqp"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		PDT_CID_POR_PROCS("pdtCidPorProc"),
		DESCRICAO("descricao"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
		PDT_CID_DESCES("pdtCidDesces");

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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (!super.equals(obj)){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		PdtComplementoPorCid other = (PdtComplementoPorCid) obj;
		if (id == null) {
			if (other.id != null){
				return false;
			}
		} else if (!id.equals(other.id)){
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return descricao;
	}
	

}
