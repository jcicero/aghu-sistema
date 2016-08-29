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
 * FcpContaCorrenteEncargo generated by hbm2java
 */
@Entity
@Table(name = "FCP_CONTA_CORRENTE_ENCARGOS", schema = "AGH")
public class FcpContaCorrenteEncargo extends BaseEntityId<FcpContaCorrenteEncargoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3264124951668574728L;
	private FcpContaCorrenteEncargoId id;
	private Integer version;
	private FcpAgenciaBanco fcpAgenciaBanco;
	private FcpEncargo fcpEncargo;
	private String indPreferencial;

	public FcpContaCorrenteEncargo() {
	}

	public FcpContaCorrenteEncargo(FcpContaCorrenteEncargoId id, FcpAgenciaBanco fcpAgenciaBanco, FcpEncargo fcpEncargo) {
		this.id = id;
		this.fcpAgenciaBanco = fcpAgenciaBanco;
		this.fcpEncargo = fcpEncargo;
	}

	public FcpContaCorrenteEncargo(FcpContaCorrenteEncargoId id, FcpAgenciaBanco fcpAgenciaBanco, FcpEncargo fcpEncargo,
			String indPreferencial) {
		this.id = id;
		this.fcpAgenciaBanco = fcpAgenciaBanco;
		this.fcpEncargo = fcpEncargo;
		this.indPreferencial = indPreferencial;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "ecgSeq", column = @Column(name = "ECG_SEQ", nullable = false)),
			@AttributeOverride(name = "agbBcoCodigo", column = @Column(name = "AGB_BCO_CODIGO", nullable = false)),
			@AttributeOverride(name = "agbCodigo", column = @Column(name = "AGB_CODIGO", nullable = false)),
			@AttributeOverride(name = "contaCorrente", column = @Column(name = "CONTA_CORRENTE", nullable = false, length = 15)) })
	public FcpContaCorrenteEncargoId getId() {
		return this.id;
	}

	public void setId(FcpContaCorrenteEncargoId id) {
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
			@JoinColumn(name = "AGB_BCO_CODIGO", referencedColumnName = "BCO_CODIGO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "AGB_CODIGO", referencedColumnName = "CODIGO", nullable = false, insertable = false, updatable = false) })
	public FcpAgenciaBanco getFcpAgenciaBanco() {
		return this.fcpAgenciaBanco;
	}

	public void setFcpAgenciaBanco(FcpAgenciaBanco fcpAgenciaBanco) {
		this.fcpAgenciaBanco = fcpAgenciaBanco;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ECG_SEQ", nullable = false, insertable = false, updatable = false)
	public FcpEncargo getFcpEncargo() {
		return this.fcpEncargo;
	}

	public void setFcpEncargo(FcpEncargo fcpEncargo) {
		this.fcpEncargo = fcpEncargo;
	}

	@Column(name = "IND_PREFERENCIAL", length = 1)
	@Length(max = 1)
	public String getIndPreferencial() {
		return this.indPreferencial;
	}

	public void setIndPreferencial(String indPreferencial) {
		this.indPreferencial = indPreferencial;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		FCP_AGENCIA_BANCO("fcpAgenciaBanco"),
		AGB_BCO_CODIGO("id.agbBcoCodigo"),
		AGB_CODIGO("id.agbCodigo"),
		FCP_ENCARGOS("fcpEncargo"),
		IND_PREFERENCIAL("indPreferencial");

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
		if (!(obj instanceof FcpContaCorrenteEncargo)) {
			return false;
		}
		FcpContaCorrenteEncargo other = (FcpContaCorrenteEncargo) obj;
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
