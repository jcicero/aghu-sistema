package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
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
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MptGrauHistopatologico generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mptGhiSq1", sequenceName="AGH.MPT_GHI_SQ1", allocationSize = 1)
@Table(name = "MPT_GRAU_HISTOPATOLOGICOS", schema = "AGH")
public class MptGrauHistopatologico extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2976121616160697650L;
	private Integer seq;
	private Integer version;
	private RapServidores rapServidores;
	private String descricao;
	private Date alteradoEm;
	private String indSituacao;
	private Set<MptLaudoIdentifPatologia> mptLaudoIdentifPatologiaes = new HashSet<MptLaudoIdentifPatologia>(0);

	public MptGrauHistopatologico() {
	}

	public MptGrauHistopatologico(Integer seq, RapServidores rapServidores, String descricao, Date alteradoEm, String indSituacao) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.alteradoEm = alteradoEm;
		this.indSituacao = indSituacao;
	}

	public MptGrauHistopatologico(Integer seq, RapServidores rapServidores, String descricao, Date alteradoEm, String indSituacao,
			Set<MptLaudoIdentifPatologia> mptLaudoIdentifPatologiaes) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.alteradoEm = alteradoEm;
		this.indSituacao = indSituacao;
		this.mptLaudoIdentifPatologiaes = mptLaudoIdentifPatologiaes;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mptGhiSq1")
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", nullable = false, length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mptGrauHistopatologico")
	public Set<MptLaudoIdentifPatologia> getMptLaudoIdentifPatologiaes() {
		return this.mptLaudoIdentifPatologiaes;
	}

	public void setMptLaudoIdentifPatologiaes(Set<MptLaudoIdentifPatologia> mptLaudoIdentifPatologiaes) {
		this.mptLaudoIdentifPatologiaes = mptLaudoIdentifPatologiaes;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		DESCRICAO("descricao"),
		ALTERADO_EM("alteradoEm"),
		IND_SITUACAO("indSituacao"),
		MPT_LAUDO_IDENTIF_PATOLOGIAES("mptLaudoIdentifPatologiaes");

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
		if (!(obj instanceof MptGrauHistopatologico)) {
			return false;
		}
		MptGrauHistopatologico other = (MptGrauHistopatologico) obj;
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
