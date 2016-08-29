package br.gov.mec.aghu.model;

// Generated 17/10/2011 14:21:24 by Hibernate Tools 3.4.0.CR1

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


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * EpeCaractDefDiagnosticos generated by hbm2java
 */
@Entity
@Table(name = "EPE_CARACT_DEF_DIAGNOSTICOS", schema = "AGH")
public class EpeCaractDefDiagnostico extends BaseEntityId<EpeCaractDefDiagnosticoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4516720775701431082L;
	private EpeCaractDefDiagnosticoId id;
	private Integer version;
	private EpeDiagnostico diagnostico;
	private EpeCaractDefinidora caractDefinidora;

	// Código Esperanto
	private Integer cdeCodigoEsperanto;
	private Short dgnSnbGnbSeqEsperanto;
	private Short dgnSnbSequenciaEsperanto;
	private Short dgnSequenciaEsperanto;
	
	@Column(name = "CDE_CODIGO_ESPERANTO", nullable = true, precision = 6, scale = 0)
	public Integer getCdeCodigoEsperanto() {
		return cdeCodigoEsperanto;
	}

	public void setCdeCodigoEsperanto(Integer cdeCodigoEsperanto) {
		this.cdeCodigoEsperanto = cdeCodigoEsperanto;
	}

	@Column(name = "DGN_SNB_GNB_SEQ_ESPERANTO", nullable = true, precision = 4, scale = 0)
	public Short getDgnSnbGnbSeqEsperanto() {
		return dgnSnbGnbSeqEsperanto;
	}

	public void setDgnSnbGnbSeqEsperanto(Short dgnSnbGnbSeqEsperanto) {
		this.dgnSnbGnbSeqEsperanto = dgnSnbGnbSeqEsperanto;
	}

	@Column(name = "DGN_SNB_SEQUENCIA_ESPERANTO", nullable = true, precision = 3, scale = 0)
	public Short getDgnSnbSequenciaEsperanto() {
		return dgnSnbSequenciaEsperanto;
	}

	public void setDgnSnbSequenciaEsperanto(Short dgnSnbSequenciaEsperanto) {
		this.dgnSnbSequenciaEsperanto = dgnSnbSequenciaEsperanto;
	}

	@Column(name = "DGN_SEQUENCIA_ESPERANTO", nullable = true, precision = 4, scale = 0)
	public Short getDgnSequenciaEsperanto() {
		return dgnSequenciaEsperanto;
	}

	public void setDgnSequenciaEsperanto(Short dgnSequenciaEsperanto) {
		this.dgnSequenciaEsperanto = dgnSequenciaEsperanto;
	}

	public EpeCaractDefDiagnostico() {
	}

	public EpeCaractDefDiagnostico(EpeCaractDefDiagnosticoId id,
			EpeDiagnostico diagnostico,
			EpeCaractDefinidora caractDefinidora) {
		this.id = id;
		this.diagnostico = diagnostico;
		this.caractDefinidora = caractDefinidora;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "cdeCodigo", column = @Column(name = "CDE_CODIGO", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "dgnSnbGnbSeq", column = @Column(name = "DGN_SNB_GNB_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "dgnSnbSequencia", column = @Column(name = "DGN_SNB_SEQUENCIA", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "dgnSequencia", column = @Column(name = "DGN_SEQUENCIA", nullable = false, precision = 4, scale = 0)) })
	public EpeCaractDefDiagnosticoId getId() {
		return this.id;
	}

	public void setId(EpeCaractDefDiagnosticoId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false, precision = 9, scale = 0)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "DGN_SNB_GNB_SEQ", referencedColumnName = "SNB_GNB_SEQ", nullable=false, insertable = false, updatable = false),
			@JoinColumn(name = "DGN_SNB_SEQUENCIA", referencedColumnName = "SNB_SEQUENCIA", nullable=false, insertable = false, updatable = false),
			@JoinColumn(name = "DGN_SEQUENCIA", referencedColumnName = "SEQUENCIA", nullable=false, insertable = false, updatable = false) })
	public EpeDiagnostico getDiagnostico() {
		return this.diagnostico;
	}

	public void setDiagnostico(EpeDiagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CDE_CODIGO", nullable = false, insertable = false, updatable = false)
	public EpeCaractDefinidora getCaractDefinidora() {
		return this.caractDefinidora;
	}

	public void setCaractDefinidora(
			EpeCaractDefinidora caractDefinidora) {
		this.caractDefinidora = caractDefinidora;
	}
	
	public enum Fields {
		DIAGNOSTICO_SNB_GNB_SEQ("diagnostico.id.snbGnbSeq"),
		DGN_SNB_GNB_SEQ("id.dgnSnbGnbSeq"),
		DGN_SNB_SEQUENCIA("id.dgnSnbSequencia"),
		DGN_SEQUENCIA("id.dgnSequencia"),
		CDE_CODIGO("id.cdeCodigo"),
		CARACT_DEFINIDORA("caractDefinidora"),
		DIAGNOSTICO("diagnostico");

		private String field;

		private Fields(String field) {
			this.field = field;
		}

		@Override
		public String toString() {
			return this.field;
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
		if (!(obj instanceof EpeCaractDefDiagnostico)) {
			return false;
		}
		EpeCaractDefDiagnostico other = (EpeCaractDefDiagnostico) obj;
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
