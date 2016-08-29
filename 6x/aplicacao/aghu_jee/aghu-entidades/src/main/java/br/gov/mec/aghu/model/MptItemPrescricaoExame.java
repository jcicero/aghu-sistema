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
 * MptItemPrescricaoExame generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mptIpxSq1", sequenceName="AGH.MPT_IPX_SQ1", allocationSize = 1)
@Table(name = "MPT_ITEM_PRESCRICAO_EXAMES", schema = "AGH")
public class MptItemPrescricaoExame extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7118818857523614492L;
	private Integer seq;
	private Integer version;
	private MptPrescricaoExame mptPrescricaoExame;
	private RapServidores rapServidoresByMptIpxSerFk1;
	private RapServidores rapServidoresByMptIpxSerFk2;
	private MpaCadOrdItemExame mpaCadOrdItemExame;
	private Date criadoEm;
	private String indMarcado;
	private String indSolicGerada;
	private Date alteradoEm;

	public MptItemPrescricaoExame() {
	}

	public MptItemPrescricaoExame(Integer seq, MptPrescricaoExame mptPrescricaoExame, RapServidores rapServidoresByMptIpxSerFk1,
			MpaCadOrdItemExame mpaCadOrdItemExame, Date criadoEm, String indMarcado, String indSolicGerada) {
		this.seq = seq;
		this.mptPrescricaoExame = mptPrescricaoExame;
		this.rapServidoresByMptIpxSerFk1 = rapServidoresByMptIpxSerFk1;
		this.mpaCadOrdItemExame = mpaCadOrdItemExame;
		this.criadoEm = criadoEm;
		this.indMarcado = indMarcado;
		this.indSolicGerada = indSolicGerada;
	}

	public MptItemPrescricaoExame(Integer seq, MptPrescricaoExame mptPrescricaoExame, RapServidores rapServidoresByMptIpxSerFk1,
			RapServidores rapServidoresByMptIpxSerFk2, MpaCadOrdItemExame mpaCadOrdItemExame, Date criadoEm, String indMarcado,
			String indSolicGerada, Date alteradoEm) {
		this.seq = seq;
		this.mptPrescricaoExame = mptPrescricaoExame;
		this.rapServidoresByMptIpxSerFk1 = rapServidoresByMptIpxSerFk1;
		this.rapServidoresByMptIpxSerFk2 = rapServidoresByMptIpxSerFk2;
		this.mpaCadOrdItemExame = mpaCadOrdItemExame;
		this.criadoEm = criadoEm;
		this.indMarcado = indMarcado;
		this.indSolicGerada = indSolicGerada;
		this.alteradoEm = alteradoEm;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mptIpxSq1")
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
	@JoinColumn(name = "PXA_SEQ", nullable = false)
	public MptPrescricaoExame getMptPrescricaoExame() {
		return this.mptPrescricaoExame;
	}

	public void setMptPrescricaoExame(MptPrescricaoExame mptPrescricaoExame) {
		this.mptPrescricaoExame = mptPrescricaoExame;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByMptIpxSerFk1() {
		return this.rapServidoresByMptIpxSerFk1;
	}

	public void setRapServidoresByMptIpxSerFk1(RapServidores rapServidoresByMptIpxSerFk1) {
		this.rapServidoresByMptIpxSerFk1 = rapServidoresByMptIpxSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_ALTERA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByMptIpxSerFk2() {
		return this.rapServidoresByMptIpxSerFk2;
	}

	public void setRapServidoresByMptIpxSerFk2(RapServidores rapServidoresByMptIpxSerFk2) {
		this.rapServidoresByMptIpxSerFk2 = rapServidoresByMptIpxSerFk2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "CIX_COX_SEQ", referencedColumnName = "COX_SEQ", nullable = false),
			@JoinColumn(name = "CIX_SEQP", referencedColumnName = "SEQP", nullable = false) })
	public MpaCadOrdItemExame getMpaCadOrdItemExame() {
		return this.mpaCadOrdItemExame;
	}

	public void setMpaCadOrdItemExame(MpaCadOrdItemExame mpaCadOrdItemExame) {
		this.mpaCadOrdItemExame = mpaCadOrdItemExame;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_MARCADO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndMarcado() {
		return this.indMarcado;
	}

	public void setIndMarcado(String indMarcado) {
		this.indMarcado = indMarcado;
	}

	@Column(name = "IND_SOLIC_GERADA", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSolicGerada() {
		return this.indSolicGerada;
	}

	public void setIndSolicGerada(String indSolicGerada) {
		this.indSolicGerada = indSolicGerada;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		MPT_PRESCRICAO_EXAMES("mptPrescricaoExame"),
		RAP_SERVIDORES_BY_MPT_IPX_SER_FK1("rapServidoresByMptIpxSerFk1"),
		RAP_SERVIDORES_BY_MPT_IPX_SER_FK2("rapServidoresByMptIpxSerFk2"),
		MPA_CAD_ORD_ITEM_EXAME("mpaCadOrdItemExame"),
		CRIADO_EM("criadoEm"),
		IND_MARCADO("indMarcado"),
		IND_SOLIC_GERADA("indSolicGerada"),
		ALTERADO_EM("alteradoEm");

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
		if (!(obj instanceof MptItemPrescricaoExame)) {
			return false;
		}
		MptItemPrescricaoExame other = (MptItemPrescricaoExame) obj;
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
