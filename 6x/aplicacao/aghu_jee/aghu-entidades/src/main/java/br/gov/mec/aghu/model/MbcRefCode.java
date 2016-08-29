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
 * MbcRefCode generated by hbm2java
 */
@Entity
@Table(name = "MBC_REF_CODES", schema = "AGH")
public class MbcRefCode extends BaseEntityId<MbcRefCodeId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3579802732373997979L;
	private MbcRefCodeId id;

	public MbcRefCode() {
	}

	public MbcRefCode(MbcRefCodeId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "rvLowValue", column = @Column(name = "RV_LOW_VALUE", nullable = false, length = 240)),
			@AttributeOverride(name = "rvDomain", column = @Column(name = "RV_DOMAIN", nullable = false, length = 100)),
			@AttributeOverride(name = "rvHighValue", column = @Column(name = "RV_HIGH_VALUE", length = 240)),
			@AttributeOverride(name = "rvAbbreviation", column = @Column(name = "RV_ABBREVIATION", length = 240)),
			@AttributeOverride(name = "rvMeaning", column = @Column(name = "RV_MEANING", length = 240)),
			@AttributeOverride(name = "rvType", column = @Column(name = "RV_TYPE", length = 10)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public MbcRefCodeId getId() {
		return this.id;
	}

	public void setId(MbcRefCodeId id) {
		this.id = id;
	}

	public enum Fields {

		ID("id"),
		DOMINIO("id.rvDomain"),
		ABBREVIATION("id.rvAbbreviation"),
		RV_MEANING("id.rvMeaning"),
		RV_LOW_VALUE("id.rvLowValue");
		

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
