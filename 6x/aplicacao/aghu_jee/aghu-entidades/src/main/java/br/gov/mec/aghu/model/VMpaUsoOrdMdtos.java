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
 * VMpaUsoOrdMdtos generated by hbm2java
 */
@Entity
@Table(name = "V_MPA_USO_ORD_MDTOS", schema = "AGH")
@Immutable
public class VMpaUsoOrdMdtos extends BaseEntityId<VMpaUsoOrdMdtosId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7474773714517021746L;

	private VMpaUsoOrdMdtosId id;
	
	private MpmTipoFrequenciaAprazamento tipoFrequenciaAprazamento;
	
	public VMpaUsoOrdMdtos() {
	}

	public VMpaUsoOrdMdtos(VMpaUsoOrdMdtosId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "uomSeq", column = @Column(name = "UOM_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "comSeq", column = @Column(name = "COM_SEQ", precision = 8, scale = 0)),
			@AttributeOverride(name = "umeUspApaAtdSeq", column = @Column(name = "UME_USP_APA_ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "umeUspApaSeq", column = @Column(name = "UME_USP_APA_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "umeUspVpaPtaSeq", column = @Column(name = "UME_USP_VPA_PTA_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "umeUspVpaSeqp", column = @Column(name = "UME_USP_VPA_SEQP", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "umeUspSeq", column = @Column(name = "UME_USP_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "umeCamCitVpaPtaSeq", column = @Column(name = "UME_CAM_CIT_VPA_PTA_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "umeCamCitVpaSeqp", column = @Column(name = "UME_CAM_CIT_VPA_SEQP", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "umeCamCitSeqp", column = @Column(name = "UME_CAM_CIT_SEQP", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "umeCamSeqp", column = @Column(name = "UME_CAM_SEQP", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "tfqSeq", column = @Column(name = "TFQ_SEQ", precision = 4, scale = 0)),
			@AttributeOverride(name = "vadSigla", column = @Column(name = "VAD_SIGLA", length = 2)),
			@AttributeOverride(name = "tvaSeq", column = @Column(name = "TVA_SEQ", precision = 3, scale = 0)),
			@AttributeOverride(name = "indSeNecessario", column = @Column(name = "IND_SE_NECESSARIO", nullable = false, length = 1)),
			@AttributeOverride(name = "frequencia", column = @Column(name = "FREQUENCIA", precision = 5, scale = 0)),
			@AttributeOverride(name = "horaInicioAdministracao", column = @Column(name = "HORA_INICIO_ADMINISTRACAO", length = 7)),
			@AttributeOverride(name = "gotejo", column = @Column(name = "GOTEJO", precision = 5)),
			@AttributeOverride(name = "qtdeHorasCorrer", column = @Column(name = "QTDE_HORAS_CORRER", precision = 2, scale = 0)),
			@AttributeOverride(name = "observacao", column = @Column(name = "OBSERVACAO", length = 240)),
			@AttributeOverride(name = "indSolucao", column = @Column(name = "IND_SOLUCAO", nullable = false, length = 1)),
			@AttributeOverride(name = "uimSeqp", column = @Column(name = "UIM_SEQP", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "medMatCodigo", column = @Column(name = "MED_MAT_CODIGO", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "fdsSeq", column = @Column(name = "FDS_SEQ", precision = 6, scale = 0)),
			@AttributeOverride(name = "dose", column = @Column(name = "DOSE", precision = 14, scale = 4)),
			@AttributeOverride(name = "pmdAtdSeq", column = @Column(name = "PMD_ATD_SEQ", precision = 7, scale = 0)),
			@AttributeOverride(name = "pmdSeq", column = @Column(name = "PMD_SEQ", precision = 14, scale = 0)),
			@AttributeOverride(name = "unidHorasCorrer", column = @Column(name = "UNID_HORAS_CORRER", length = 1)),
			@AttributeOverride(name = "indBombaInfusao", column = @Column(name = "IND_BOMBA_INFUSAO", length = 1)),
			@AttributeOverride(name = "medMatCodigoDiluente", column = @Column(name = "MED_MAT_CODIGO_DILUENTE", precision = 6, scale = 0)),
			@AttributeOverride(name = "volumeDiluenteMl", column = @Column(name = "VOLUME_DILUENTE_ML", precision = 8, scale = 3)) })
	public VMpaUsoOrdMdtosId getId() {
		return this.id;
	}

	public void setId(VMpaUsoOrdMdtosId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TFQ_SEQ", nullable = false, insertable = false, updatable = false)
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
		VMpaUsoOrdMdtos other = (VMpaUsoOrdMdtos) obj;
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
