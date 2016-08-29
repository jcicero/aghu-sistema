package br.gov.mec.aghu.model;

// Generated 03/02/2011 17:20:07 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * VMpmMdtos generated by hbm2java
 */
@Entity
@Table(name = "V_MPM_MDTOS", schema = "AGH")
@Immutable
public class VMpmMdtos extends BaseEntityId<VMpmMdtosId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -550960096418071071L;

	private VMpmMdtosId id;

	private MpmTipoFrequenciaAprazamento tipoFrequenciaAprazamento;
	
	public VMpmMdtos() {
	}

	public VMpmMdtos(VMpmMdtosId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "mdbSeq", column = @Column(name = "MDB_SEQ", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "seq", column = @Column(name = "SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "tpFrequencia", column = @Column(name = "TP_FREQUENCIA", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "viaAdministracao", column = @Column(name = "VIA_ADMINISTRACAO", nullable = false, length = 2)),
			@AttributeOverride(name = "tpVelocid", column = @Column(name = "TP_VELOCID", precision = 3, scale = 0)),
			@AttributeOverride(name = "indSeNecessario", column = @Column(name = "IND_SE_NECESSARIO", nullable = false, length = 1)),
			@AttributeOverride(name = "frequencia", column = @Column(name = "FREQUENCIA", precision = 3, scale = 0)),
			@AttributeOverride(name = "hrInicioAdm", column = @Column(name = "HR_INICIO_ADM", length = 7)),
			@AttributeOverride(name = "gotejo", column = @Column(name = "GOTEJO", precision = 5)),
			@AttributeOverride(name = "qtdeCorrer", column = @Column(name = "QTDE_CORRER", precision = 2, scale = 0)),
			@AttributeOverride(name = "observacao", column = @Column(name = "OBSERVACAO", length = 240)),
			@AttributeOverride(name = "matCodigo", column = @Column(name = "MAT_CODIGO", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "seqItem", column = @Column(name = "SEQ_ITEM", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "fdsDose", column = @Column(name = "FDS_DOSE", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "dose", column = @Column(name = "DOSE", nullable = false, precision = 14, scale = 4)) })
	public VMpmMdtosId getId() {
		return this.id;
	}

	public void setId(VMpmMdtosId id) {
		this.id = id;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TP_FREQUENCIA", nullable = false, insertable = false, updatable = false)
	public MpmTipoFrequenciaAprazamento getTipoFrequenciaAprazamento() {
		return tipoFrequenciaAprazamento;
	}

	public void setTipoFrequenciaAprazamento(
			MpmTipoFrequenciaAprazamento tipoFrequenciaAprazamento) {
		this.tipoFrequenciaAprazamento = tipoFrequenciaAprazamento;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		VMpmMdtos other = (VMpmMdtos) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	public enum Fields {

		ID("id"),
		TIPO_FREQUENCIA_APRAZAMENTO("tipoFrequenciaAprazamento");

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
