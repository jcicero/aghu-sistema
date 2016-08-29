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
 * MpmAltaTrgMedicacao generated by hbm2java
 */
@Entity
@Table(name = "MPM_ALTA_TRG_MEDICACOES", schema = "AGH")
public class MpmAltaTrgMedicacao extends BaseEntityId<MpmAltaTrgMedicacaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6235672994829464392L;
	private MpmAltaTrgMedicacaoId id;
	private MpmAltaTriagem mpmAltaTriagens;
	private String descMedicacao;
	// TODO Dev Alterar mapeamento das colunas TDC_TRG_SEQ e TDC_SEQP para o pojo da tabela MAM_TRG_MEDICACOES
	private Long tdcTrgSeq;
	private Short tdcSeqp;

	public MpmAltaTrgMedicacao() {
	}

	public MpmAltaTrgMedicacao(MpmAltaTrgMedicacaoId id,
			MpmAltaTriagem mpmAltaTriagens, String descMedicacao,
			Long tdcTrgSeq, Short tdcSeqp) {
		this.id = id;
		this.mpmAltaTriagens = mpmAltaTriagens;
		this.descMedicacao = descMedicacao;
		this.tdcTrgSeq = tdcTrgSeq;
		this.tdcSeqp = tdcSeqp;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "atgAsuApaAtdSeq", column = @Column(name = "ATG_ASU_APA_ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "atgAsuApaSeq", column = @Column(name = "ATG_ASU_APA_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "atgAsuSeqp", column = @Column(name = "ATG_ASU_SEQP", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "atgSeqp", column = @Column(name = "ATG_SEQP", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 5, scale = 0)) })
	public MpmAltaTrgMedicacaoId getId() {
		return this.id;
	}

	public void setId(MpmAltaTrgMedicacaoId id) {
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

	@Column(name = "DESC_MEDICACAO", nullable = false, length = 4000)
	@Length(max = 4000)
	public String getDescMedicacao() {
		return this.descMedicacao;
	}

	public void setDescMedicacao(String descMedicacao) {
		this.descMedicacao = descMedicacao;
	}

	@Column(name = "TDC_TRG_SEQ", nullable = false, precision = 14, scale = 0)
	public Long getTdcTrgSeq() {
		return this.tdcTrgSeq;
	}

	public void setTdcTrgSeq(Long tdcTrgSeq) {
		this.tdcTrgSeq = tdcTrgSeq;
	}

	@Column(name = "TDC_SEQP", nullable = false, precision = 4, scale = 0)
	public Short getTdcSeqp() {
		return this.tdcSeqp;
	}

	public void setTdcSeqp(Short tdcSeqp) {
		this.tdcSeqp = tdcSeqp;
	}
	
	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof MpmAltaTrgMedicacao)) {
			return false;
		}
		MpmAltaTrgMedicacao castOther = (MpmAltaTrgMedicacao) other;

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
