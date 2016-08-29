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
 * UsuTr064pon generated by hbm2java
 */
@Entity
@Table(name = "USU_TR064PON", schema = "AGH")
public class UsuTr064pon extends BaseEntityId<UsuTr064ponId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6809068245121306052L;
	private UsuTr064ponId id;

	public UsuTr064pon() {
	}

	public UsuTr064pon(UsuTr064ponId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "usuNumemp", column = @Column(name = "USU_NUMEMP")),
			@AttributeOverride(name = "usuTipcol", column = @Column(name = "USU_TIPCOL")),
			@AttributeOverride(name = "usuNumcad", column = @Column(name = "USU_NUMCAD")),
			@AttributeOverride(name = "usuDiaho1", column = @Column(name = "USU_DIAHO1", length = 29)),
			@AttributeOverride(name = "usuDiaho2", column = @Column(name = "USU_DIAHO2", length = 29)),
			@AttributeOverride(name = "usuStaacc", column = @Column(name = "USU_STAACC")),
			@AttributeOverride(name = "usuJnUsu", column = @Column(name = "USU_JN_USU", length = 30)),
			@AttributeOverride(name = "usuJnOper", column = @Column(name = "USU_JN_OPER", length = 30)),
			@AttributeOverride(name = "usuJnData", column = @Column(name = "USU_JN_DATA", length = 29)) })
	public UsuTr064ponId getId() {
		return this.id;
	}

	public void setId(UsuTr064ponId id) {
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
		if (!(obj instanceof UsuTr064pon)) {
			return false;
		}
		UsuTr064pon other = (UsuTr064pon) obj;
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
