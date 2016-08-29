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
 * AnuItemGrupoQuadroDieta generated by hbm2java
 */
@Entity
@Table(name = "ANU_ITEM_GRUPO_QUADRO_DIETAS", schema = "AGH")
public class AnuItemGrupoQuadroDieta extends BaseEntityId<AnuItemGrupoQuadroDietaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 910198479364014546L;
	private AnuItemGrupoQuadroDietaId id;
	private Integer version;
	private RapServidores rapServidores;
	private AnuGrupoQuadroDieta anuGrupoQuadroDieta;
	private AnuRefeicao anuRefeicao;
	private AnuHabitoAlimUsual anuHabitoAlimUsual;
	private Date criadoEm;
	private String indSituacao;

	public AnuItemGrupoQuadroDieta() {
	}

	public AnuItemGrupoQuadroDieta(AnuItemGrupoQuadroDietaId id, RapServidores rapServidores,
			AnuGrupoQuadroDieta anuGrupoQuadroDieta, Date criadoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.anuGrupoQuadroDieta = anuGrupoQuadroDieta;
		this.criadoEm = criadoEm;
	}

	public AnuItemGrupoQuadroDieta(AnuItemGrupoQuadroDietaId id, RapServidores rapServidores,
			AnuGrupoQuadroDieta anuGrupoQuadroDieta, AnuRefeicao anuRefeicao, AnuHabitoAlimUsual anuHabitoAlimUsual,
			Date criadoEm, String indSituacao) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.anuGrupoQuadroDieta = anuGrupoQuadroDieta;
		this.anuRefeicao = anuRefeicao;
		this.anuHabitoAlimUsual = anuHabitoAlimUsual;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "gqdSeq", column = @Column(name = "GQD_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public AnuItemGrupoQuadroDietaId getId() {
		return this.id;
	}

	public void setId(AnuItemGrupoQuadroDietaId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GQD_SEQ", nullable = false, insertable = false, updatable = false)
	public AnuGrupoQuadroDieta getAnuGrupoQuadroDieta() {
		return this.anuGrupoQuadroDieta;
	}

	public void setAnuGrupoQuadroDieta(AnuGrupoQuadroDieta anuGrupoQuadroDieta) {
		this.anuGrupoQuadroDieta = anuGrupoQuadroDieta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "REF_SEQ")
	public AnuRefeicao getAnuRefeicao() {
		return this.anuRefeicao;
	}

	public void setAnuRefeicao(AnuRefeicao anuRefeicao) {
		this.anuRefeicao = anuRefeicao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HAU_SEQ")
	public AnuHabitoAlimUsual getAnuHabitoAlimUsual() {
		return this.anuHabitoAlimUsual;
	}

	public void setAnuHabitoAlimUsual(AnuHabitoAlimUsual anuHabitoAlimUsual) {
		this.anuHabitoAlimUsual = anuHabitoAlimUsual;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		ANU_GRUPO_QUADRO_DIETAS("anuGrupoQuadroDieta"),
		ANU_REFEICOES("anuRefeicao"),
		ANU_HABITO_ALIM_USUAIS("anuHabitoAlimUsual"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao");

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
		if (!(obj instanceof AnuItemGrupoQuadroDieta)) {
			return false;
		}
		AnuItemGrupoQuadroDieta other = (AnuItemGrupoQuadroDieta) obj;
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
