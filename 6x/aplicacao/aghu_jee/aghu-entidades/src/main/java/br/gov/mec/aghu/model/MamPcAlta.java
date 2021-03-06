package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MamPcAlta generated by hbm2java
 */
@Entity
@Table(name = "MAM_PC_ALTAS", schema = "AGH")
public class MamPcAlta extends BaseEntityId<MamPcAltaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3977724902263686930L;
	private MamPcAltaId id;
	private Integer version;
	private MamPcPaciente mamPcPaciente;
	private Integer asuApaAtdSeq;
	private Integer asuApaSeq;
	private Short asuSeqp;
	private String ltoLtoId;
	private Short qrtNumero;
	private Short unfSeq;

	public MamPcAlta() {
	}

	public MamPcAlta(MamPcAltaId id, MamPcPaciente mamPcPaciente, Integer asuApaAtdSeq, Integer asuApaSeq, Short asuSeqp, Short unfSeq) {
		this.id = id;
		this.mamPcPaciente = mamPcPaciente;
		this.asuApaAtdSeq = asuApaAtdSeq;
		this.asuApaSeq = asuApaSeq;
		this.asuSeqp = asuSeqp;
		this.unfSeq = unfSeq;
	}

	public MamPcAlta(MamPcAltaId id, MamPcPaciente mamPcPaciente, Integer asuApaAtdSeq, Integer asuApaSeq, Short asuSeqp, String ltoLtoId,
			Short qrtNumero, Short unfSeq) {
		this.id = id;
		this.mamPcPaciente = mamPcPaciente;
		this.asuApaAtdSeq = asuApaAtdSeq;
		this.asuApaSeq = asuApaSeq;
		this.asuSeqp = asuSeqp;
		this.ltoLtoId = ltoLtoId;
		this.qrtNumero = qrtNumero;
		this.unfSeq = unfSeq;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "ppePleSeq", column = @Column(name = "PPE_PLE_SEQ", nullable = false)),
			@AttributeOverride(name = "ppeSeqp", column = @Column(name = "PPE_SEQP", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public MamPcAltaId getId() {
		return this.id;
	}

	public void setId(MamPcAltaId id) {
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
	@JoinColumns({
			@JoinColumn(name = "PPE_PLE_SEQ", referencedColumnName = "PLE_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "PPE_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public MamPcPaciente getMamPcPaciente() {
		return this.mamPcPaciente;
	}

	public void setMamPcPaciente(MamPcPaciente mamPcPaciente) {
		this.mamPcPaciente = mamPcPaciente;
	}

	@Column(name = "ASU_APA_ATD_SEQ", nullable = false)
	public Integer getAsuApaAtdSeq() {
		return this.asuApaAtdSeq;
	}

	public void setAsuApaAtdSeq(Integer asuApaAtdSeq) {
		this.asuApaAtdSeq = asuApaAtdSeq;
	}

	@Column(name = "ASU_APA_SEQ", nullable = false)
	public Integer getAsuApaSeq() {
		return this.asuApaSeq;
	}

	public void setAsuApaSeq(Integer asuApaSeq) {
		this.asuApaSeq = asuApaSeq;
	}

	@Column(name = "ASU_SEQP", nullable = false)
	public Short getAsuSeqp() {
		return this.asuSeqp;
	}

	public void setAsuSeqp(Short asuSeqp) {
		this.asuSeqp = asuSeqp;
	}

	@Column(name = "LTO_LTO_ID", length = 5)
	@Length(max = 5)
	public String getLtoLtoId() {
		return this.ltoLtoId;
	}

	public void setLtoLtoId(String ltoLtoId) {
		this.ltoLtoId = ltoLtoId;
	}

	@Column(name = "QRT_NUMERO")
	public Short getQrtNumero() {
		return this.qrtNumero;
	}

	public void setQrtNumero(Short qrtNumero) {
		this.qrtNumero = qrtNumero;
	}

	@Column(name = "UNF_SEQ", nullable = false)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		MAM_PC_PACIENTES("mamPcPaciente"),
		ASU_APA_ATD_SEQ("asuApaAtdSeq"),
		ASU_APA_SEQ("asuApaSeq"),
		ASU_SEQP("asuSeqp"),
		LTO_LTO_ID("ltoLtoId"),
		QRT_NUMERO("qrtNumero"),
		UNF_SEQ("unfSeq");

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
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
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
		if (!(obj instanceof MamPcAlta)) {
			return false;
		}
		MamPcAlta other = (MamPcAlta) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
