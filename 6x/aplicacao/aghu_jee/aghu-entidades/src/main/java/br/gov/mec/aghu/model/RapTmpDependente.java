package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * RapTmpDependente generated by hbm2java
 */
@Entity
@Table(name = "RAP_TMP_DEPENDENTES", schema = "AGH")
public class RapTmpDependente extends BaseEntityId<RapTmpDependenteId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -932346064214090856L;
	private RapTmpDependenteId id;
	private Integer version;
	private String lotSeq;
	private String oldNome;
	private Date oldDtNascimento;
	private String oldSexo;
	private Short oldGrauParentesco;
	private Integer oldPacProntuario;
	private String newNome;
	private Date newDtNascimento;
	private String newSexo;
	private Integer newPacProntuario;
	private Short newGrauParentesco;
	private Integer serMatricula;
	private Short serVinCodigo;

	public RapTmpDependente() {
	}

	public RapTmpDependente(RapTmpDependenteId id) {
		this.id = id;
	}

	public RapTmpDependente(RapTmpDependenteId id, String lotSeq, String oldNome, Date oldDtNascimento, String oldSexo,
			Short oldGrauParentesco, Integer oldPacProntuario, String newNome, Date newDtNascimento, String newSexo,
			Integer newPacProntuario, Short newGrauParentesco, Integer serMatricula, Short serVinCodigo) {
		this.id = id;
		this.lotSeq = lotSeq;
		this.oldNome = oldNome;
		this.oldDtNascimento = oldDtNascimento;
		this.oldSexo = oldSexo;
		this.oldGrauParentesco = oldGrauParentesco;
		this.oldPacProntuario = oldPacProntuario;
		this.newNome = newNome;
		this.newDtNascimento = newDtNascimento;
		this.newSexo = newSexo;
		this.newPacProntuario = newPacProntuario;
		this.newGrauParentesco = newGrauParentesco;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "pesCodigo", column = @Column(name = "PES_CODIGO", nullable = false)),
			@AttributeOverride(name = "codigo", column = @Column(name = "CODIGO", nullable = false)),
			@AttributeOverride(name = "operacao", column = @Column(name = "OPERACAO", nullable = false, length = 3)),
			@AttributeOverride(name = "dthrOperacao", column = @Column(name = "DTHR_OPERACAO", nullable = false, length = 29)) })
	public RapTmpDependenteId getId() {
		return this.id;
	}

	public void setId(RapTmpDependenteId id) {
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

	@Column(name = "LOT_SEQ", length = 10)
	@Length(max = 10)
	public String getLotSeq() {
		return this.lotSeq;
	}

	public void setLotSeq(String lotSeq) {
		this.lotSeq = lotSeq;
	}

	@Column(name = "OLD_NOME", length = 50)
	@Length(max = 50)
	public String getOldNome() {
		return this.oldNome;
	}

	public void setOldNome(String oldNome) {
		this.oldNome = oldNome;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "OLD_DT_NASCIMENTO", length = 29)
	public Date getOldDtNascimento() {
		return this.oldDtNascimento;
	}

	public void setOldDtNascimento(Date oldDtNascimento) {
		this.oldDtNascimento = oldDtNascimento;
	}

	@Column(name = "OLD_SEXO", length = 1)
	@Length(max = 1)
	public String getOldSexo() {
		return this.oldSexo;
	}

	public void setOldSexo(String oldSexo) {
		this.oldSexo = oldSexo;
	}

	@Column(name = "OLD_GRAU_PARENTESCO")
	public Short getOldGrauParentesco() {
		return this.oldGrauParentesco;
	}

	public void setOldGrauParentesco(Short oldGrauParentesco) {
		this.oldGrauParentesco = oldGrauParentesco;
	}

	@Column(name = "OLD_PAC_PRONTUARIO")
	public Integer getOldPacProntuario() {
		return this.oldPacProntuario;
	}

	public void setOldPacProntuario(Integer oldPacProntuario) {
		this.oldPacProntuario = oldPacProntuario;
	}

	@Column(name = "NEW_NOME", length = 50)
	@Length(max = 50)
	public String getNewNome() {
		return this.newNome;
	}

	public void setNewNome(String newNome) {
		this.newNome = newNome;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "NEW_DT_NASCIMENTO", length = 29)
	public Date getNewDtNascimento() {
		return this.newDtNascimento;
	}

	public void setNewDtNascimento(Date newDtNascimento) {
		this.newDtNascimento = newDtNascimento;
	}

	@Column(name = "NEW_SEXO", length = 1)
	@Length(max = 1)
	public String getNewSexo() {
		return this.newSexo;
	}

	public void setNewSexo(String newSexo) {
		this.newSexo = newSexo;
	}

	@Column(name = "NEW_PAC_PRONTUARIO")
	public Integer getNewPacProntuario() {
		return this.newPacProntuario;
	}

	public void setNewPacProntuario(Integer newPacProntuario) {
		this.newPacProntuario = newPacProntuario;
	}

	@Column(name = "NEW_GRAU_PARENTESCO")
	public Short getNewGrauParentesco() {
		return this.newGrauParentesco;
	}

	public void setNewGrauParentesco(Short newGrauParentesco) {
		this.newGrauParentesco = newGrauParentesco;
	}

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		LOT_SEQ("lotSeq"),
		OLD_NOME("oldNome"),
		OLD_DT_NASCIMENTO("oldDtNascimento"),
		OLD_SEXO("oldSexo"),
		OLD_GRAU_PARENTESCO("oldGrauParentesco"),
		OLD_PAC_PRONTUARIO("oldPacProntuario"),
		NEW_NOME("newNome"),
		NEW_DT_NASCIMENTO("newDtNascimento"),
		NEW_SEXO("newSexo"),
		NEW_PAC_PRONTUARIO("newPacProntuario"),
		NEW_GRAU_PARENTESCO("newGrauParentesco"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo");

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
		if (!(obj instanceof RapTmpDependente)) {
			return false;
		}
		RapTmpDependente other = (RapTmpDependente) obj;
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
