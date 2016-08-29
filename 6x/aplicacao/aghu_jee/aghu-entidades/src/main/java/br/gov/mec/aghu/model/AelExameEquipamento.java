package br.gov.mec.aghu.model;

// Generated 25/01/2012 15:12:30 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.Table;
import javax.persistence.Version;


import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelExamesEquipamentos generated by hbm2java
 */
@Entity
@Table(name = "AEL_EXAMES_EQUIPAMENTOS", schema = "AGH")
public class AelExameEquipamento extends BaseEntityId<AelExameEquipamentoId> implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -198538146889611106L;
	private AelExameEquipamentoId id;
	private Integer version;
	private RapServidores servidor;
	private DominioSituacao situacao;
	private AelCampoLaudo campoLaudo;
	private Boolean pertenceCarga;
	private AelExamesMaterialAnalise exameMaterialAnalise;


	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "eemEmaExaSigla", column = @Column(name = "EEM_EMA_EXA_SIGLA", nullable = false, length = 5)),
			@AttributeOverride(name = "eemEmaManSeq", column = @Column(name = "EEM_EMA_MAN_SEQ", nullable = false)),
			@AttributeOverride(name = "eemEquSeq", column = @Column(name = "EEM_EQU_SEQ", nullable = false)),
			@AttributeOverride(name = "eemProgramacao", column = @Column(name = "EEM_PROGRAMACAO", nullable = false, length = 1)),
			@AttributeOverride(name = "codigo", column = @Column(name = "CODIGO", nullable = false, length = 3)),
			@AttributeOverride(name = "numero", column = @Column(name = "NUMERO", nullable = false, length = 2)) })
	public AelExameEquipamentoId getId() {
		return this.id;
	}

	public void setId(AelExameEquipamentoId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = true)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return situacao;
	}
	
	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CAL_SEQ")
	public AelCampoLaudo getCampoLaudo() {
		return campoLaudo;
	}

	public void setCampoLaudo(AelCampoLaudo campoLaudo) {
		this.campoLaudo = campoLaudo;
	}

	@Column(name = "IND_PERTENCE_CARGA", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getPertenceCarga() {
		return pertenceCarga;
	}
	
	public void setPertenceCarga(Boolean pertenceCarga) {
		this.pertenceCarga = pertenceCarga;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "EEM_EMA_EXA_SIGLA", referencedColumnName = "EXA_SIGLA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "EEM_EMA_MAN_SEQ", referencedColumnName = "MAN_SEQ", nullable = false, insertable = false, updatable = false) })
	public AelExamesMaterialAnalise getExameMaterialAnalise() {
		return exameMaterialAnalise;
	}
	
	public void setExameMaterialAnalise(AelExamesMaterialAnalise exameMaterialAnalise) {
		this.exameMaterialAnalise = exameMaterialAnalise;
	}
	
	public enum Fields {
		ID("id"),
		EEM_EMA_EXA_SIGLA("id.eemEmaExaSigla"),
		EEM_EMA_MAN_SEQ("id.eemEmaManSeq"),
		EEM_EQU_SEQ("id.eemEquSeq"),
		EEM_PROGRAMACAO("id.eemProgramacao"),
		CODIGO("id.codigo"),
		NUMERO("id.numero"),
		SERVIDOR("servidor"),
		SITUACAO("situacao"),
		CAMPO_LAUDO("campoLaudo"),
		PERTENCE_CARGA("pertenceCarga");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
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
		if (!(obj instanceof AelExameEquipamento)) {
			return false;
		}
		AelExameEquipamento other = (AelExameEquipamento) obj;
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
