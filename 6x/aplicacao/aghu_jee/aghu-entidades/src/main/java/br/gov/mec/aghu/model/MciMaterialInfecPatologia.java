package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MciMaterialInfecPatologia generated by hbm2java
 */
@Entity
@Table(name = "MCI_MATERIAL_INFEC_PATOLOGIAS", schema = "AGH")
public class MciMaterialInfecPatologia extends BaseEntityId<MciMaterialInfecPatologiaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2928405649402275631L;
	private MciMaterialInfecPatologiaId id;
	private Integer version;
	private MciMaterialInfectante mciMaterialInfectante;
	private MciGrupoMatInfectante mciGrupoMatInfectante;
	private RapServidores rapServidoresByMciMipSerFk1;
	private MciPatologiaInfeccao mciPatologiaInfeccao;
	private RapServidores rapServidoresByMciMipSerFk2;
	private String indPrincipal;
	private String indSituacao;
	private Date criadoEm;
	private Date alteradoEm;

	public MciMaterialInfecPatologia() {
	}

	public MciMaterialInfecPatologia(MciMaterialInfecPatologiaId id, MciGrupoMatInfectante mciGrupoMatInfectante,
			RapServidores rapServidoresByMciMipSerFk1, MciPatologiaInfeccao mciPatologiaInfeccao, String indPrincipal,
			String indSituacao, Date criadoEm) {
		this.id = id;
		this.mciGrupoMatInfectante = mciGrupoMatInfectante;
		this.rapServidoresByMciMipSerFk1 = rapServidoresByMciMipSerFk1;
		this.mciPatologiaInfeccao = mciPatologiaInfeccao;
		this.indPrincipal = indPrincipal;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	public MciMaterialInfecPatologia(MciMaterialInfecPatologiaId id, MciMaterialInfectante mciMaterialInfectante,
			MciGrupoMatInfectante mciGrupoMatInfectante, RapServidores rapServidoresByMciMipSerFk1,
			MciPatologiaInfeccao mciPatologiaInfeccao, RapServidores rapServidoresByMciMipSerFk2, String indPrincipal,
			String indSituacao, Date criadoEm, Date alteradoEm) {
		this.id = id;
		this.mciMaterialInfectante = mciMaterialInfectante;
		this.mciGrupoMatInfectante = mciGrupoMatInfectante;
		this.rapServidoresByMciMipSerFk1 = rapServidoresByMciMipSerFk1;
		this.mciPatologiaInfeccao = mciPatologiaInfeccao;
		this.rapServidoresByMciMipSerFk2 = rapServidoresByMciMipSerFk2;
		this.indPrincipal = indPrincipal;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "paiSeq", column = @Column(name = "PAI_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public MciMaterialInfecPatologiaId getId() {
		return this.id;
	}

	public void setId(MciMaterialInfecPatologiaId id) {
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
	@JoinColumn(name = "MAI_SEQ")
	public MciMaterialInfectante getMciMaterialInfectante() {
		return this.mciMaterialInfectante;
	}

	public void setMciMaterialInfectante(MciMaterialInfectante mciMaterialInfectante) {
		this.mciMaterialInfectante = mciMaterialInfectante;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GMI_SEQ", nullable = false)
	public MciGrupoMatInfectante getMciGrupoMatInfectante() {
		return this.mciGrupoMatInfectante;
	}

	public void setMciGrupoMatInfectante(MciGrupoMatInfectante mciGrupoMatInfectante) {
		this.mciGrupoMatInfectante = mciGrupoMatInfectante;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByMciMipSerFk1() {
		return this.rapServidoresByMciMipSerFk1;
	}

	public void setRapServidoresByMciMipSerFk1(RapServidores rapServidoresByMciMipSerFk1) {
		this.rapServidoresByMciMipSerFk1 = rapServidoresByMciMipSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAI_SEQ", nullable = false, insertable = false, updatable = false)
	public MciPatologiaInfeccao getMciPatologiaInfeccao() {
		return this.mciPatologiaInfeccao;
	}

	public void setMciPatologiaInfeccao(MciPatologiaInfeccao mciPatologiaInfeccao) {
		this.mciPatologiaInfeccao = mciPatologiaInfeccao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_MOVIMENTADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_MOVIMENTADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByMciMipSerFk2() {
		return this.rapServidoresByMciMipSerFk2;
	}

	public void setRapServidoresByMciMipSerFk2(RapServidores rapServidoresByMciMipSerFk2) {
		this.rapServidoresByMciMipSerFk2 = rapServidoresByMciMipSerFk2;
	}

	@Column(name = "IND_PRINCIPAL", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndPrincipal() {
		return this.indPrincipal;
	}

	public void setIndPrincipal(String indPrincipal) {
		this.indPrincipal = indPrincipal;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		MCI_MATERIAL_INFECTANTES("mciMaterialInfectante"),
		MCI_GRUPO_MAT_INFECTANTES("mciGrupoMatInfectante"),
		RAP_SERVIDORES_BY_MCI_MIP_SER_FK1("rapServidoresByMciMipSerFk1"),
		MCI_PATOLOGIA_INFECCAO("mciPatologiaInfeccao"),
		RAP_SERVIDORES_BY_MCI_MIP_SER_FK2("rapServidoresByMciMipSerFk2"),
		IND_PRINCIPAL("indPrincipal"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm");

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
		if (!(obj instanceof MciMaterialInfecPatologia)) {
			return false;
		}
		MciMaterialInfecPatologia other = (MciMaterialInfecPatologia) obj;
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
