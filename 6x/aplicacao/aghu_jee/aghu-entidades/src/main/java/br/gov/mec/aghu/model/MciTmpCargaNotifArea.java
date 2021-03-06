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
 * MciTmpCargaNotifArea generated by hbm2java
 */
@Entity
@Table(name = "MCI_TMP_CARGA_NOTIF_AREA", schema = "AGH")
public class MciTmpCargaNotifArea extends BaseEntityId<MciTmpCargaNotifAreaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9031470225860218462L;
	private MciTmpCargaNotifAreaId id;

	public MciTmpCargaNotifArea() {
	}

	public MciTmpCargaNotifArea(MciTmpCargaNotifAreaId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "data", column = @Column(name = "DATA", nullable = false, length = 29)),
			@AttributeOverride(name = "prontuario", column = @Column(name = "PRONTUARIO", nullable = false)),
			@AttributeOverride(name = "porSeq", column = @Column(name = "POR_SEQ", nullable = false)),
			@AttributeOverride(name = "dtInicioNotif", column = @Column(name = "DT_INICIO_NOTIF", nullable = false, length = 29)),
			@AttributeOverride(name = "dtFimNotif", column = @Column(name = "DT_FIM_NOTIF", length = 29)),
			@AttributeOverride(name = "qtDiasNotifTot", column = @Column(name = "QT_DIAS_NOTIF_TOT", nullable = false)),
			@AttributeOverride(name = "unfSeq", column = @Column(name = "UNF_SEQ")),
			@AttributeOverride(name = "qtDiasNotif", column = @Column(name = "QT_DIAS_NOTIF")),
			@AttributeOverride(name = "intSeq", column = @Column(name = "INT_SEQ", nullable = false)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public MciTmpCargaNotifAreaId getId() {
		return this.id;
	}

	public void setId(MciTmpCargaNotifAreaId id) {
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
