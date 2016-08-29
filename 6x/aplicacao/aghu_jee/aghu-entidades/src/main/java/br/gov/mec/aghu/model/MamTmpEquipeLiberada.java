package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MamTmpEquipeLiberada generated by hbm2java
 */
@Entity
@Table(name = "MAM_TMP_EQUIPE_LIBERADAS", schema = "AGH")
public class MamTmpEquipeLiberada extends BaseEntityId<MamTmpEquipeLiberadaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7098215367296150510L;
	private MamTmpEquipeLiberadaId id;

	public MamTmpEquipeLiberada() {
	}

	public MamTmpEquipeLiberada(MamTmpEquipeLiberadaId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "eqpSeq", column = @Column(name = "EQP_SEQ", nullable = false)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public MamTmpEquipeLiberadaId getId() {
		return this.id;
	}

	public void setId(MamTmpEquipeLiberadaId id) {
		this.id = id;
	}

	public enum Fields {

		ID("id");

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
