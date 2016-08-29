package br.gov.mec.aghu.model;

// Generated Mar 21, 2011 1:21:18 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * VFatContasApacPacientes generated by hbm2java
 */
@Entity
@Table(name = "V_FAT_CONTAS_APAC_PACIENTES", schema = "AGH")
@Immutable
public class VFatContaApacPaciente extends BaseEntityId<VFatContaApacPacienteId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4947953840825106698L;
	private VFatContaApacPacienteId id;

	public VFatContaApacPaciente() {
	}

	public VFatContaApacPaciente(VFatContaApacPacienteId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "pacCodigo", column = @Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "pacNome", column = @Column(name = "PAC_NOME", nullable = false, length = 50)),
			@AttributeOverride(name = "pacProntuario", column = @Column(name = "PAC_PRONTUARIO", precision = 8, scale = 0)),
			@AttributeOverride(name = "capAtmNumero", column = @Column(name = "CAP_ATM_NUMERO", nullable = false, precision = 13, scale = 0)),
			@AttributeOverride(name = "capSeqp", column = @Column(name = "CAP_SEQP", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "capDtInicioValidade", column = @Column(name = "CAP_DT_INICIO_VALIDADE", nullable = false, length = 7)),
			@AttributeOverride(name = "capDtFimValidade", column = @Column(name = "CAP_DT_FIM_VALIDADE", length = 7)),
			@AttributeOverride(name = "capIndSituacao", column = @Column(name = "CAP_IND_SITUACAO", nullable = false, length = 1)),
			@AttributeOverride(name = "capCpeDtHrInicio", column = @Column(name = "CAP_CPE_DT_HR_INICIO", nullable = false, length = 7)),
			@AttributeOverride(name = "capCpeModulo", column = @Column(name = "CAP_CPE_MODULO", nullable = false, length = 4)),
			@AttributeOverride(name = "capCpeMes", column = @Column(name = "CAP_CPE_MES", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "capCpeAno", column = @Column(name = "CAP_CPE_ANO", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "capCidSeq", column = @Column(name = "CAP_CID_SEQ", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "capCidSeqSecundario", column = @Column(name = "CAP_CID_SEQ_SECUNDARIO", precision = 5, scale = 0)),
			@AttributeOverride(name = "atdIndTipoTratamento", column = @Column(name = "ATD_IND_TIPO_TRATAMENTO", precision = 2, scale = 0)),
			@AttributeOverride(name = "atmPhiSeq", column = @Column(name = "ATM_PHI_SEQ", precision = 6, scale = 0)),
			@AttributeOverride(name = "atdSeq", column = @Column(name = "ATD_SEQ", nullable = false, precision = 7, scale = 0)) })
	public VFatContaApacPacienteId getId() {
		return this.id;
	}

	public void setId(VFatContaApacPacienteId id) {
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
		if (!(obj instanceof VFatContaApacPaciente)) {
			return false;
		}
		VFatContaApacPaciente other = (VFatContaApacPaciente) obj;
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
