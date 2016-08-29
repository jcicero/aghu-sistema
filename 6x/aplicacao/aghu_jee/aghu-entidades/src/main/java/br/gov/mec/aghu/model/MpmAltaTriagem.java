package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmAltaTriagem generated by hbm2java
 */

@Entity
@Table(name = "MPM_ALTA_TRIAGENS", schema = "AGH")
public class MpmAltaTriagem extends BaseEntityId<MpmAltaTriagemId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1103764172481465864L;
	private MpmAltaTriagemId id;
	private MpmAltaSumario altaSumario;
	private String descQueixa;
	private String descComplemento;
	private String responsavel;
	private String registroResponsavel;
	private MamTriagens triagem;
	private Set<MpmAltaTrgExame> altaTrgExames = new HashSet<MpmAltaTrgExame>(
			0);
	private Set<MpmAltaTrgAlergia> altaTrgAlergias = new HashSet<MpmAltaTrgAlergia>(
			0);
	private Set<MpmAltaTrgSinalVital> altaTrgSinalVitais = new HashSet<MpmAltaTrgSinalVital>(
			0);
	private Set<MpmAltaTrgMedicacao> altaTrgMedicacoes = new HashSet<MpmAltaTrgMedicacao>(
			0);

	public MpmAltaTriagem() {
	}

	public MpmAltaTriagem(MpmAltaTriagemId id,
			MpmAltaSumario altaSumario, String descQueixa, MamTriagens triagem) {
		this.id = id;
		this.altaSumario = altaSumario;
		this.descQueixa = descQueixa;
		this.triagem = triagem;
	}

	public MpmAltaTriagem(MpmAltaTriagemId id,
			MpmAltaSumario altaSumario, String descQueixa,
			String descComplemento, String responsavel,
			String registroResponsavel, MamTriagens triagem,
			Set<MpmAltaTrgExame> altaTrgExames,
			Set<MpmAltaTrgAlergia> altaTrgAlergias,
			Set<MpmAltaTrgSinalVital> altaTrgSinalVitais,
			Set<MpmAltaTrgMedicacao> altaTrgMedicacoes) {
		this.id = id;
		this.altaSumario = altaSumario;
		this.descQueixa = descQueixa;
		this.descComplemento = descComplemento;
		this.responsavel = responsavel;
		this.registroResponsavel = registroResponsavel;
		this.triagem = triagem;
		this.altaTrgExames = altaTrgExames;
		this.altaTrgAlergias = altaTrgAlergias;
		this.altaTrgSinalVitais = altaTrgSinalVitais;
		this.altaTrgMedicacoes = altaTrgMedicacoes;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "asuApaAtdSeq", column = @Column(name = "ASU_APA_ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "asuApaSeq", column = @Column(name = "ASU_APA_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "asuSeqp", column = @Column(name = "ASU_SEQP", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 5, scale = 0)) })
	public MpmAltaTriagemId getId() {
		return this.id;
	}

	public void setId(MpmAltaTriagemId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "ASU_APA_ATD_SEQ", referencedColumnName = "APA_ATD_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "ASU_APA_SEQ", referencedColumnName = "APA_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "ASU_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public MpmAltaSumario getAltaSumario() {
		return this.altaSumario;
	}

	public void setAltaSumario(MpmAltaSumario altaSumario) {
		this.altaSumario = altaSumario;
	}

	@Column(name = "DESC_QUEIXA", nullable = false, length = 2000)
	@Length(max = 2000)
	public String getDescQueixa() {
		return this.descQueixa;
	}

	public void setDescQueixa(String descQueixa) {
		this.descQueixa = descQueixa;
	}

	@Column(name = "DESC_COMPLEMENTO", length = 2000)
	@Length(max = 2000)
	public String getDescComplemento() {
		return this.descComplemento;
	}

	public void setDescComplemento(String descComplemento) {
		this.descComplemento = descComplemento;
	}

	@Column(name = "RESPONSAVEL", length = 120)
	@Length(max = 120)
	public String getResponsavel() {
		return this.responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	@Column(name = "REGISTRO_RESPONSAVEL", length = 60)
	@Length(max = 60)
	public String getRegistroResponsavel() {
		return this.registroResponsavel;
	}

	public void setRegistroResponsavel(String registroResponsavel) {
		this.registroResponsavel = registroResponsavel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TRG_SEQ", nullable = false)
	public MamTriagens getTriagem() {
		return this.triagem;
	}

	public void setTriagem(MamTriagens triagem) {
		this.triagem = triagem;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mpmAltaTriagens")
	public Set<MpmAltaTrgExame> getAltaTrgExames() {
		return this.altaTrgExames;
	}

	public void setAltaTrgExames(Set<MpmAltaTrgExame> altaTrgExames) {
		this.altaTrgExames = altaTrgExames;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mpmAltaTriagens")
	public Set<MpmAltaTrgAlergia> getAltaTrgAlergias() {
		return this.altaTrgAlergias;
	}

	public void setAltaTrgAlergias(
			Set<MpmAltaTrgAlergia> altaTrgAlergias) {
		this.altaTrgAlergias = altaTrgAlergias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mpmAltaTriagens")
	public Set<MpmAltaTrgSinalVital> getAltaTrgSinalVitais() {
		return this.altaTrgSinalVitais;
	}

	public void setAltaTrgSinalVitais(
			Set<MpmAltaTrgSinalVital> altaTrgSinalVitais) {
		this.altaTrgSinalVitais = altaTrgSinalVitais;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mpmAltaTriagens")
	public Set<MpmAltaTrgMedicacao> getAltaTrgMedicacoes() {
		return this.altaTrgMedicacoes;
	}

	public void setAltaTrgMedicacoes(
			Set<MpmAltaTrgMedicacao> altaTrgMedicacoes) {
		this.altaTrgMedicacoes = altaTrgMedicacoes;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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
		MpmAltaTriagem other = (MpmAltaTriagem) obj;
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
		ALTA_SUMARIO("altaSumario"),
		ID_ALTA_SUMARIO("altaSumario.id"),
		DESC_QUEIXA("descQueixa"),
		DESC_COMPLEMENTO("descComplemento"),
		RESPONSAVEL("responsavel"),
		REGISTRO_RESPONSAVEL("registroResponsavel"),
		TRIAGEM("triagem"),
		ALTA_TRG_EXAMES("altaTrgExames"),
		ALTA_TRG_ALERGIAS("altaTrgAlergias"),
		ALTA_TRG_SINAL_VITAIS("altaTrgSinalVitais"),
		ALTA_TRG_MEDICACOES("altaTrgMedicacoes");

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
