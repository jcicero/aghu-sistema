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


import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AelListaPacRedome generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelLprSq1", sequenceName="AGH.AEL_LPR_SQ1", allocationSize = 1)
@Table(name = "AEL_LISTA_PAC_REDOMES", schema = "AGH")
public class AelListaPacRedome extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8645583599152707622L;
	private Integer seq;
	private Integer version;
	private RapServidores rapServidores;
	private AelListaRedome aelListaRedome;
	private AelSeqCodbarraRedome aelSeqCodbarraRedome;
	private Short ordem;
	private Date criadoEm;
	private Short linha;
	private Short coluna;
	private Set<AelOcorrenciaRedome> aelOcorrenciaRedomes = new HashSet<AelOcorrenciaRedome>(0);

	public AelListaPacRedome() {
	}

	public AelListaPacRedome(Integer seq, RapServidores rapServidores, AelListaRedome aelListaRedome,
			AelSeqCodbarraRedome aelSeqCodbarraRedome) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.aelListaRedome = aelListaRedome;
		this.aelSeqCodbarraRedome = aelSeqCodbarraRedome;
	}

	public AelListaPacRedome(Integer seq, RapServidores rapServidores, AelListaRedome aelListaRedome,
			AelSeqCodbarraRedome aelSeqCodbarraRedome, Short ordem, Date criadoEm, Short linha, Short coluna,
			Set<AelOcorrenciaRedome> aelOcorrenciaRedomes) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.aelListaRedome = aelListaRedome;
		this.aelSeqCodbarraRedome = aelSeqCodbarraRedome;
		this.ordem = ordem;
		this.criadoEm = criadoEm;
		this.linha = linha;
		this.coluna = coluna;
		this.aelOcorrenciaRedomes = aelOcorrenciaRedomes;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelLprSq1")
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LRD_SEQ", nullable = false)
	public AelListaRedome getAelListaRedome() {
		return this.aelListaRedome;
	}

	public void setAelListaRedome(AelListaRedome aelListaRedome) {
		this.aelListaRedome = aelListaRedome;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SCR_SEQ", nullable = false)
	public AelSeqCodbarraRedome getAelSeqCodbarraRedome() {
		return this.aelSeqCodbarraRedome;
	}

	public void setAelSeqCodbarraRedome(AelSeqCodbarraRedome aelSeqCodbarraRedome) {
		this.aelSeqCodbarraRedome = aelSeqCodbarraRedome;
	}

	@Column(name = "ORDEM")
	public Short getOrdem() {
		return this.ordem;
	}

	public void setOrdem(Short ordem) {
		this.ordem = ordem;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "LINHA")
	public Short getLinha() {
		return this.linha;
	}

	public void setLinha(Short linha) {
		this.linha = linha;
	}

	@Column(name = "COLUNA")
	public Short getColuna() {
		return this.coluna;
	}

	public void setColuna(Short coluna) {
		this.coluna = coluna;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aelListaPacRedome")
	public Set<AelOcorrenciaRedome> getAelOcorrenciaRedomes() {
		return this.aelOcorrenciaRedomes;
	}

	public void setAelOcorrenciaRedomes(Set<AelOcorrenciaRedome> aelOcorrenciaRedomes) {
		this.aelOcorrenciaRedomes = aelOcorrenciaRedomes;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		AEL_LISTA_REDOMES("aelListaRedome"),
		AEL_SEQ_CODBARRA_REDOME("aelSeqCodbarraRedome"),
		ORDEM("ordem"),
		CRIADO_EM("criadoEm"),
		LINHA("linha"),
		COLUNA("coluna"),
		AEL_OCORRENCIA_REDOMES("aelOcorrenciaRedomes");

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
		if (!(obj instanceof AelListaPacRedome)) {
			return false;
		}
		AelListaPacRedome other = (AelListaPacRedome) obj;
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