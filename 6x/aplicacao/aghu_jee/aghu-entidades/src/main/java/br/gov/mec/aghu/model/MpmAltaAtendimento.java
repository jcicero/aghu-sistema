package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioTipoRegistro;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmAltaAtendimentos generated by hbm2java
 */
@Entity
@Table(name = "MPM_ALTA_ATENDIMENTOS", schema = "AGH")
public class MpmAltaAtendimento extends BaseEntityId<MpmAltaAtendimentoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8087548199658589080L;
	private MpmAltaAtendimentoId id;
	private MpmAltaSumario altaSumario;
	private String descAgenda;
	private DominioTipoRegistro indTipoRegistro;
	private String responsavel;
	private String registroResponsavel;
	private AghEspecialidades especialidade;
	private MamRegistro rgtSeq;
	private Date dthrRegistro;
	private Set<MpmAltaAtendMotivo> altaAtendMotivos = new HashSet<MpmAltaAtendMotivo>(
			0);
	private Set<MpmAltaAtendRegistro> altaAtendRegistros = new HashSet<MpmAltaAtendRegistro>(
			0);

	public MpmAltaAtendimento() {
	}

	public MpmAltaAtendimento(MpmAltaAtendimentoId id,
			MpmAltaSumario mpmAltaSumarios, String descAgenda,
			DominioTipoRegistro indTipoRegistro, AghEspecialidades espSeq) {
		this.id = id;
		this.altaSumario = mpmAltaSumarios;
		this.descAgenda = descAgenda;
		this.indTipoRegistro = indTipoRegistro;
		this.especialidade = espSeq;
	}

	public MpmAltaAtendimento(MpmAltaAtendimentoId id,
			MpmAltaSumario mpmAltaSumarios, String descAgenda,
			DominioTipoRegistro indTipoRegistro, String responsavel,
			String registroResponsavel, AghEspecialidades espSeq, MamRegistro rgtSeq,
			Date dthrRegistro, Set<MpmAltaAtendMotivo> mpmAltaAtendMotivoses,
			Set<MpmAltaAtendRegistro> mpmAltaAtendRegistroses) {
		this.id = id;
		this.altaSumario = mpmAltaSumarios;
		this.descAgenda = descAgenda;
		this.indTipoRegistro = indTipoRegistro;
		this.responsavel = responsavel;
		this.registroResponsavel = registroResponsavel;
		this.especialidade = espSeq;
		this.rgtSeq = rgtSeq;
		this.dthrRegistro = dthrRegistro;
		this.altaAtendMotivos = mpmAltaAtendMotivoses;
		this.altaAtendRegistros = mpmAltaAtendRegistroses;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "asuApaAtdSeq", column = @Column(name = "ASU_APA_ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "asuApaSeq", column = @Column(name = "ASU_APA_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "asuSeqp", column = @Column(name = "ASU_SEQP", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 5, scale = 0)) })
	public MpmAltaAtendimentoId getId() {
		return this.id;
	}

	public void setId(MpmAltaAtendimentoId id) {
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

	public void setAltaSumario(MpmAltaSumario mpmAltaSumarios) {
		this.altaSumario = mpmAltaSumarios;
	}

	@Column(name = "DESC_AGENDA", nullable = false, length = 500)
	@Length(max = 500)
	public String getDescAgenda() {
		return this.descAgenda;
	}

	public void setDescAgenda(String descAgenda) {
		this.descAgenda = descAgenda;
	}

	@Column(name = "IND_TIPO_REGISTRO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoRegistro getIndTipoRegistro() {
		return this.indTipoRegistro;
	}

	public void setIndTipoRegistro(DominioTipoRegistro indTipoRegistro) {
		this.indTipoRegistro = indTipoRegistro;
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
	@JoinColumn(name = "ESP_SEQ", referencedColumnName = "SEQ", nullable = false)
	public AghEspecialidades getAghEspecialidade() {
		return this.especialidade;
	}

	public void setAghEspecialidade(AghEspecialidades aghEspecialidade) {
		this.especialidade = aghEspecialidade;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RGT_SEQ", referencedColumnName= "SEQ")
	public MamRegistro getRgtSeq() {
		return this.rgtSeq;
	}

	public void setRgtSeq(MamRegistro rgtSeq) {
		this.rgtSeq = rgtSeq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_REGISTRO")
	public Date getDthrRegistro() {
		return this.dthrRegistro;
	}

	public void setDthrRegistro(Date dthrRegistro) {
		this.dthrRegistro = dthrRegistro;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "altaAtendimento")
	public Set<MpmAltaAtendMotivo> getAltaAtendMotivos() {
		return this.altaAtendMotivos;
	}

	public void setAltaAtendMotivos(
			Set<MpmAltaAtendMotivo> mpmAltaAtendMotivoses) {
		this.altaAtendMotivos = mpmAltaAtendMotivoses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "altaAtendimento")
	public Set<MpmAltaAtendRegistro> getAltaAtendRegistros() {
		return this.altaAtendRegistros;
	}

	public void setAltaAtendRegistros(
			Set<MpmAltaAtendRegistro> mpmAltaAtendRegistroses) {
		this.altaAtendRegistros = mpmAltaAtendRegistroses;
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
		if (!(obj instanceof MpmAltaConsultoria)) {
			return false;
		}
		MpmAltaAtendimento other = (MpmAltaAtendimento) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}

	public enum Fields {
		ALTASUMARIO("altaSumario"),
		ID_ALTA_SUMARIO("altaSumario.id"), 
		SEQP("id.seqp");

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
