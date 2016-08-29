package br.gov.mec.aghu.model;

// Generated 15/05/2012 13:40:34 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.dominio.DominioSituacaoHorario;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * VAelGradeHrAgenda generated by hbm2java
 */
@Entity
@Table(name = "V_AEL_GRADE_HR_AGENDA_AGHU", schema = "AGH")
@Immutable
public class VAelGradeHrAgenda extends BaseEntityId<VAelGradeHrAgendaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5822032670279571061L;
	private VAelGradeHrAgendaId id;
	private DominioSituacaoHorario situacao;
	private Integer codPaciente;

	public VAelGradeHrAgenda() {
	}

	public VAelGradeHrAgenda(VAelGradeHrAgendaId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "grade", column = @Column(name = "GRADE", precision = 4, scale = 0)),
			@AttributeOverride(name = "seqGrade", column = @Column(name = "SEQ_GRADE", precision = 7, scale = 0)),
			@AttributeOverride(name = "dthrAgenda", column = @Column(name = "DTHR_AGENDA", length = 8)),
			@AttributeOverride(name = "dtAgenda", column = @Column(name = "DT_AGENDA", length = 7)),
			@AttributeOverride(name = "hrAgenda", column = @Column(name = "HR_AGENDA", length = 5)),
			@AttributeOverride(name = "tipo", column = @Column(name = "TIPO", precision = 3, scale = 0)),
			@AttributeOverride(name = "extra", column = @Column(name = "EXTRA", length = 1))})
			
	public VAelGradeHrAgendaId getId() {
		return this.id;
	}

	public void setId(VAelGradeHrAgendaId id) {
		this.id = id;
	}

	@Column(name = "SIT", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoHorario getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacaoHorario situacao) {
		this.situacao = situacao;
	}
	
	@Column(name = "COD_PACIENTE", precision = 22, scale = 0)
	public Integer getCodPaciente() {
		return this.codPaciente;
	}

	public void setCodPaciente(Integer codPaciente) {
		this.codPaciente = codPaciente;
	}

	public enum Fields {
		
		SITUACAO("situacao"),
		GRADE("id.grade"),
		SEQ_GRADE("id.seqGrade"),
		DTHR_AGENDA("id.dthrAgenda");


		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codPaciente == null) ? 0 : codPaciente.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((situacao == null) ? 0 : situacao.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		VAelGradeHrAgenda other = (VAelGradeHrAgenda) obj;
		if (codPaciente == null) {
			if (other.codPaciente != null){
				return false;
			}
		} else if (!codPaciente.equals(other.codPaciente)){
			return false;
		}
		if (id == null) {
			if (other.id != null){
				return false;
			}
		} else if (!id.equals(other.id)){
			return false;
		}
		if (situacao != other.situacao){
			return false;
		}
		return true;
	}
	
}