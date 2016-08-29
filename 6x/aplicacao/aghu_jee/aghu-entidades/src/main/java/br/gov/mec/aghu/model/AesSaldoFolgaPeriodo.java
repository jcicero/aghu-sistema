package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AesSaldoFolgaPeriodo generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aesSfpSq1", sequenceName="AGH.AES_SFP_SQ1", allocationSize = 1)
@Table(name = "AES_SALDOS_FOLGAS_PERIODOS", schema = "AGH")
public class AesSaldoFolgaPeriodo extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6385908031622513759L;
	private Integer seq;
	private Integer version;
	private AesPeriodoEscala aesPeriodoEscala;
	private RapServidores rapServidores;
	private Short saldoFolga;
	private Set<AesDataFolga> aesDataFolgas = new HashSet<AesDataFolga>(0);

	public AesSaldoFolgaPeriodo() {
	}

	public AesSaldoFolgaPeriodo(Integer seq, AesPeriodoEscala aesPeriodoEscala, RapServidores rapServidores, Short saldoFolga) {
		this.seq = seq;
		this.aesPeriodoEscala = aesPeriodoEscala;
		this.rapServidores = rapServidores;
		this.saldoFolga = saldoFolga;
	}

	public AesSaldoFolgaPeriodo(Integer seq, AesPeriodoEscala aesPeriodoEscala, RapServidores rapServidores, Short saldoFolga,
			Set<AesDataFolga> aesDataFolgas) {
		this.seq = seq;
		this.aesPeriodoEscala = aesPeriodoEscala;
		this.rapServidores = rapServidores;
		this.saldoFolga = saldoFolga;
		this.aesDataFolgas = aesDataFolgas;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aesSfpSq1")
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
	@JoinColumns({ @JoinColumn(name = "PFE_ARE_CODIGO", referencedColumnName = "ARE_CODIGO", nullable = false),
			@JoinColumn(name = "PFE_SEQUENCIA", referencedColumnName = "SEQUENCIA", nullable = false) })
	public AesPeriodoEscala getAesPeriodoEscala() {
		return this.aesPeriodoEscala;
	}

	public void setAesPeriodoEscala(AesPeriodoEscala aesPeriodoEscala) {
		this.aesPeriodoEscala = aesPeriodoEscala;
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

	@Column(name = "SALDO_FOLGA", nullable = false)
	public Short getSaldoFolga() {
		return this.saldoFolga;
	}

	public void setSaldoFolga(Short saldoFolga) {
		this.saldoFolga = saldoFolga;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aesSaldoFolgaPeriodo")
	public Set<AesDataFolga> getAesDataFolgas() {
		return this.aesDataFolgas;
	}

	public void setAesDataFolgas(Set<AesDataFolga> aesDataFolgas) {
		this.aesDataFolgas = aesDataFolgas;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		AES_PERIODOS_ESCALA("aesPeriodoEscala"),
		RAP_SERVIDORES("rapServidores"),
		SALDO_FOLGA("saldoFolga"),
		AES_DATA_FOLGAS("aesDataFolgas");

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
		if (!(obj instanceof AesSaldoFolgaPeriodo)) {
			return false;
		}
		AesSaldoFolgaPeriodo other = (AesSaldoFolgaPeriodo) obj;
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
