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
 * AgfaOruOut generated by hbm2java
 */
@Entity
@Table(name = "AGFA_ORU_OUT", schema = "AGH")
public class AgfaOruOut extends BaseEntityId<AgfaOruOutId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7859326184987583017L;
	private AgfaOruOutId id;

	public AgfaOruOut() {
	}

	public AgfaOruOut(AgfaOruOutId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "oru01HisDate", column = @Column(name = "ORU_01_HIS_DATE", length = 29)),
			@AttributeOverride(name = "msh07Date", column = @Column(name = "MSH_07_DATE", length = 29)),
			@AttributeOverride(name = "pid02Id", column = @Column(name = "PID_02_ID", length = 48)),
			@AttributeOverride(name = "obr32AuthorId", column = @Column(name = "OBR_32_AUTHOR_ID", length = 50)),
			@AttributeOverride(name = "obr32AuthorName", column = @Column(name = "OBR_32_AUTHOR_NAME", length = 50)),
			@AttributeOverride(name = "obr27ValidateDate", column = @Column(name = "OBR_27_VALIDATE_DATE", length = 29)),
			@AttributeOverride(name = "oru02StatusHis", column = @Column(name = "ORU_02_STATUS_HIS", length = 1)),
			@AttributeOverride(name = "obr03BatchId", column = @Column(name = "OBR_03_BATCH_ID", length = 22)),
			@AttributeOverride(name = "obr03AccNumber", column = @Column(name = "OBR_03_ACC_NUMBER", length = 50)),
			@AttributeOverride(name = "obr25StatusRep", column = @Column(name = "OBR_25_STATUS_REP", length = 50)),
			@AttributeOverride(name = "obx05Observation", column = @Column(name = "OBX_05_OBSERVATION")),
			@AttributeOverride(name = "oru03IdReport", column = @Column(name = "ORU_03_ID_REPORT", length = 10)),
			@AttributeOverride(name = "obr02QpExamId", column = @Column(name = "OBR_02_QP_EXAM_ID", length = 30)) })
	public AgfaOruOutId getId() {
		return this.id;
	}

	public void setId(AgfaOruOutId id) {
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
