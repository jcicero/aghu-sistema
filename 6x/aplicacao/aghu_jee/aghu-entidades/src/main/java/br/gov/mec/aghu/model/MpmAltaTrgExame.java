package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmAltaTrgExame generated by hbm2java
 */
@Entity
@Table(name = "MPM_ALTA_TRG_EXAMES", schema = "AGH")
public class MpmAltaTrgExame extends BaseEntityId<MpmAltaTrgExameId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -739576324593794071L;
	private MpmAltaTrgExameId id;
	private MpmAltaTriagem mpmAltaTriagens;
	private String descExame;
	// TODO Dev Alterar mapeamento das colunas TXA_TRG_SEQ e TXA_SEQP para o pojo da tabela MAM_TRG_EXAMES 
	private Long txaTrgSeq;
	private Short txaSeqp;

	public MpmAltaTrgExame() {
	}

	public MpmAltaTrgExame(MpmAltaTrgExameId id,
			MpmAltaTriagem mpmAltaTriagens, String descExame, Long txaTrgSeq,
			Short txaSeqp) {
		this.id = id;
		this.mpmAltaTriagens = mpmAltaTriagens;
		this.descExame = descExame;
		this.txaTrgSeq = txaTrgSeq;
		this.txaSeqp = txaSeqp;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "atgAsuApaAtdSeq", column = @Column(name = "ATG_ASU_APA_ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "atgAsuApaSeq", column = @Column(name = "ATG_ASU_APA_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "atgAsuSeqp", column = @Column(name = "ATG_ASU_SEQP", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "atgSeqp", column = @Column(name = "ATG_SEQP", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 5, scale = 0)) })
	public MpmAltaTrgExameId getId() {
		return this.id;
	}

	public void setId(MpmAltaTrgExameId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "ATG_ASU_APA_ATD_SEQ", referencedColumnName = "ASU_APA_ATD_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "ATG_ASU_APA_SEQ", referencedColumnName = "ASU_APA_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "ATG_ASU_SEQP", referencedColumnName = "ASU_SEQP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "ATG_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public MpmAltaTriagem getMpmAltaTriagens() {
		return this.mpmAltaTriagens;
	}

	public void setMpmAltaTriagens(MpmAltaTriagem mpmAltaTriagens) {
		this.mpmAltaTriagens = mpmAltaTriagens;
	}

	@Column(name = "DESC_EXAME", nullable = false, length = 4000)
	@Length(max = 4000)
	public String getDescExame() {
		return this.descExame;
	}

	public void setDescExame(String descExame) {
		this.descExame = descExame;
	}

	@Column(name = "TXA_TRG_SEQ", nullable = false, precision = 14, scale = 0)
	public Long getTxaTrgSeq() {
		return this.txaTrgSeq;
	}

	public void setTxaTrgSeq(Long txaTrgSeq) {
		this.txaTrgSeq = txaTrgSeq;
	}

	@Column(name = "TXA_SEQP", nullable = false, precision = 4, scale = 0)
	public Short getTxaSeqp() {
		return this.txaSeqp;
	}

	public void setTxaSeqp(Short txaSeqp) {
		this.txaSeqp = txaSeqp;
	}
	
	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof MpmAltaTrgExame)) {
			return false;
		}
		MpmAltaTrgExame castOther = (MpmAltaTrgExame) other;

		return this.getId() != null && this.getId().equals(castOther.getId());
	}

	@Override
	public int hashCode() {
		int result = 17;
		
		result = 37 * result + (this.getId() == null ? 0 : this.getId().hashCode());
		
		return result;
	}	
	
	public enum Fields {
		ID("id"),
		ALTA_SUMARIO_APA_ATD_SEQ("mpmAltaTriagens.id.asuApaAtdSeq"), 
		ALTA_SUMARIO_APA_SEQ("mpmAltaTriagens.id.asuApaSeq"),
		ALTA_SUMARIO_SEQP("mpmAltaTriagens.id.asuSeqp"),
		ATG_SEQP("id.atgSeqp");

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