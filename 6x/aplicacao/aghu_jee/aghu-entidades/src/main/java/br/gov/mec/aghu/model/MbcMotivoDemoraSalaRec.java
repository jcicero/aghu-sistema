package br.gov.mec.aghu.model;

// Generated 17/06/2010 15:43:38 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MbcMotivoDemoraSalaRecs generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mbcMsrSq1", sequenceName="AGH.MBC_MSR_SQ1", allocationSize = 1)
@Table(name = "MBC_MOTIVO_DEMORA_SALA_RECS", schema = "AGH")

public class MbcMotivoDemoraSalaRec extends BaseEntitySeq<Short> implements java.io.Serializable {

	// TODO Implementar triggers (não foi implementado, pois o mapeamento
	// foi feito na implementação do módulo de internação)
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6128889347387109851L;
	private Short seq;
	private RapServidores servidor;
	private String descricao;
	private DominioSituacao situacao;
	private Date criadoEm;
	private Set<MbcCirurgias> cirurgias = new HashSet<MbcCirurgias>(0);
	
	//TODO Implementar version quando necessário
	//private Integer version;

	public MbcMotivoDemoraSalaRec() {
	}

	public MbcMotivoDemoraSalaRec(Short seq, RapServidores servidor,
			String descricao, DominioSituacao situacao, Date criadoEm) {
		this.seq = seq;
		this.servidor = servidor;
		this.descricao = descricao;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
	}

	public MbcMotivoDemoraSalaRec(Short seq, RapServidores servidor,
			String descricao, DominioSituacao situacao, Date criadoEm,
			Set<MbcCirurgias> cirurgias) {
		this.seq = seq;
		this.servidor = servidor;
		this.descricao = descricao;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.cirurgias = cirurgias;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mbcMsrSq1")
	@Column(name = "SEQ", nullable = false, precision = 3, scale = 0)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Column(name = "DESCRICAO", unique = true, nullable = false, length = 120)
	@Length(max = 120)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "SITUACAO", nullable = false, length=1)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "motivoDemoraSalaRecuperacao")
	public Set<MbcCirurgias> getCirurgias() {
		return this.cirurgias;
	}

	public void setCirurgias(Set<MbcCirurgias> cirurgias) {
		this.cirurgias = cirurgias;
	}
	
	/*
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seq == null) ? 0 : seq.hashCode());
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
		MbcMotivoDemoraSalaRec other = (MbcMotivoDemoraSalaRec) obj;
		if (seq == null) {
			if (other.seq != null) {
				return false;
			}
		} else if (!seq.equals(other.seq)) {
			return false;
		}
		return true;
	}
	
	public enum Fields {

		SEQ("seq"),
		SERVIDOR("servidor"),
		DESCRICAO("descricao"),
		SITUACAO("situacao"),
		CRIADO_EM("criadoEm"),
		CIRURGIAS("cirurgias");

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
