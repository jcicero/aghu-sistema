package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmItemPrescParecerMdtos generated by hbm2java
 */
@Entity
@Table(name = "MPM_ITEM_PRESC_PARECER_MDTOS", schema = "AGH")
public class MpmItemPrescParecerMdto extends BaseEntityId<MpmItemPrescParecerMdtoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6684907418766893254L;
	
	private MpmItemPrescParecerMdtoId id;
	private MpmParecerUsoMdto mpmParecerUsoMdtos;
	private MpmItemPrescricaoMdto mpmItemPrescricaoMdto;

	private Set<VMpmPrescrMdtos> vMpmPrescMdtos;
	
	public MpmItemPrescParecerMdto() {
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "imePmdAtdSeq", column = @Column(name = "IME_PMD_ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "imePmdSeq", column = @Column(name = "IME_PMD_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "imeMedMatCodigo", column = @Column(name = "IME_MED_MAT_CODIGO", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "imeSeqp", column = @Column(name = "IME_SEQP", nullable = false, precision = 4, scale = 0)) })
	public MpmItemPrescParecerMdtoId getId() {
		return this.id;
	}

	public void setId(MpmItemPrescParecerMdtoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "IME_PMD_ATD_SEQ", referencedColumnName = "PMD_ATD_SEQ", insertable=false, updatable=false),
			@JoinColumn(name = "IME_PMD_SEQ", referencedColumnName = "PMD_SEQ", insertable=false, updatable=false),
			@JoinColumn(name = "IME_MED_MAT_CODIGO", referencedColumnName = "MED_MAT_CODIGO", insertable=false, updatable=false),
			@JoinColumn(name = "IME_SEQP", referencedColumnName = "SEQP", insertable=false, updatable=false) })
	public MpmItemPrescricaoMdto getMpmItemPrescricaoMdto() {
		return this.mpmItemPrescricaoMdto;
	}

	public void setMpmItemPrescricaoMdto(MpmItemPrescricaoMdto mpmItemPrescricaoMdto) {
		this.mpmItemPrescricaoMdto = mpmItemPrescricaoMdto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PUM_SEQ", nullable = false)
	public MpmParecerUsoMdto getMpmParecerUsoMdtos() {
		return this.mpmParecerUsoMdtos;
	}

	public void setMpmParecerUsoMdtos(MpmParecerUsoMdto mpmParecerUsoMdtos) {
		this.mpmParecerUsoMdtos = mpmParecerUsoMdtos;
	}
	

	@OneToMany(fetch = FetchType.LAZY, mappedBy="itemPrescParecerMdto")
	public Set<VMpmPrescrMdtos> getvMpmPrescMdtos() {
		return vMpmPrescMdtos;
	}

	public void setvMpmPrescMdtos(Set<VMpmPrescrMdtos> vMpmPrescMdtos) {
		this.vMpmPrescMdtos = vMpmPrescMdtos;
	}

	public enum Fields {
		IME_PMD_ATD_SEQ("id.imePmdAtdSeq"), IME_PMD_SEQ("id.imePmdSeq"), IME_SEQP("id.imeSeqp"), IME_MED_MAT_CODIGO("id.imeMedMatCodigo"),
		MPM_ITEM_PRESCRICAO_MDTOS("mpmItemPrescricaoMdto"),
		MPM_PARECER_USO_MDTOS("mpmParecerUsoMdtos"), MPM_PARECER_USO_MDTOS_SEQ("mpmParecerUsoMdtos.seq"), 
		V_MPM_PRESC_MTDOS("vMpmPrescMdtos");

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
		if (!(obj instanceof MpmItemPrescParecerMdto)) {
			return false;
		}
		MpmItemPrescParecerMdto other = (MpmItemPrescParecerMdto) obj;
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
