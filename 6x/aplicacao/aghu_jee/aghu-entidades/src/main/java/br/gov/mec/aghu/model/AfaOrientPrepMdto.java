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
 * AfaOrientPrepMdto generated by hbm2java
 */
@Entity
@Table(name = "AFA_ORIENT_PREP_MDTOS", schema = "AGH")
public class AfaOrientPrepMdto extends BaseEntityId<AfaOrientPrepMdtoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1068382705138193798L;
	private AfaOrientPrepMdtoId id;
	private Integer version;
	private RapServidores rapServidoresByAfaOpmSerFk2;
	private AfaTipoOrientacaoEtiqueta afaTipoOrientacaoEtiqueta;
	private RapServidores rapServidoresByAfaOpmSerFk1;
	private AfaItemPreparoMdto afaItemPreparoMdto;
	private Date criadoEm;
	private String descricao;
	private Date alteradoEm;
	private Short ordemVisualizacao;

	public AfaOrientPrepMdto() {
	}

	public AfaOrientPrepMdto(AfaOrientPrepMdtoId id, RapServidores rapServidoresByAfaOpmSerFk1,
			AfaItemPreparoMdto afaItemPreparoMdto, Date criadoEm) {
		this.id = id;
		this.rapServidoresByAfaOpmSerFk1 = rapServidoresByAfaOpmSerFk1;
		this.afaItemPreparoMdto = afaItemPreparoMdto;
		this.criadoEm = criadoEm;
	}

	public AfaOrientPrepMdto(AfaOrientPrepMdtoId id, RapServidores rapServidoresByAfaOpmSerFk2,
			AfaTipoOrientacaoEtiqueta afaTipoOrientacaoEtiqueta, RapServidores rapServidoresByAfaOpmSerFk1,
			AfaItemPreparoMdto afaItemPreparoMdto, Date criadoEm, String descricao, Date alteradoEm, Short ordemVisualizacao) {
		this.id = id;
		this.rapServidoresByAfaOpmSerFk2 = rapServidoresByAfaOpmSerFk2;
		this.afaTipoOrientacaoEtiqueta = afaTipoOrientacaoEtiqueta;
		this.rapServidoresByAfaOpmSerFk1 = rapServidoresByAfaOpmSerFk1;
		this.afaItemPreparoMdto = afaItemPreparoMdto;
		this.criadoEm = criadoEm;
		this.descricao = descricao;
		this.alteradoEm = alteradoEm;
		this.ordemVisualizacao = ordemVisualizacao;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)),
			@AttributeOverride(name = "itoSeqp", column = @Column(name = "ITO_SEQP", nullable = false)),
			@AttributeOverride(name = "itoPtoSeq", column = @Column(name = "ITO_PTO_SEQ", nullable = false)) })
	public AfaOrientPrepMdtoId getId() {
		return this.id;
	}

	public void setId(AfaOrientPrepMdtoId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByAfaOpmSerFk2() {
		return this.rapServidoresByAfaOpmSerFk2;
	}

	public void setRapServidoresByAfaOpmSerFk2(RapServidores rapServidoresByAfaOpmSerFk2) {
		this.rapServidoresByAfaOpmSerFk2 = rapServidoresByAfaOpmSerFk2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TOE_SEQ")
	public AfaTipoOrientacaoEtiqueta getAfaTipoOrientacaoEtiqueta() {
		return this.afaTipoOrientacaoEtiqueta;
	}

	public void setAfaTipoOrientacaoEtiqueta(AfaTipoOrientacaoEtiqueta afaTipoOrientacaoEtiqueta) {
		this.afaTipoOrientacaoEtiqueta = afaTipoOrientacaoEtiqueta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByAfaOpmSerFk1() {
		return this.rapServidoresByAfaOpmSerFk1;
	}

	public void setRapServidoresByAfaOpmSerFk1(RapServidores rapServidoresByAfaOpmSerFk1) {
		this.rapServidoresByAfaOpmSerFk1 = rapServidoresByAfaOpmSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "ITO_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "ITO_PTO_SEQ", referencedColumnName = "PTO_SEQ", nullable = false, insertable = false, updatable = false) })
	public AfaItemPreparoMdto getAfaItemPreparoMdto() {
		return this.afaItemPreparoMdto;
	}

	public void setAfaItemPreparoMdto(AfaItemPreparoMdto afaItemPreparoMdto) {
		this.afaItemPreparoMdto = afaItemPreparoMdto;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "DESCRICAO", length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "ORDEM_VISUALIZACAO")
	public Short getOrdemVisualizacao() {
		return this.ordemVisualizacao;
	}

	public void setOrdemVisualizacao(Short ordemVisualizacao) {
		this.ordemVisualizacao = ordemVisualizacao;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES_BY_AFA_OPM_SER_FK2("rapServidoresByAfaOpmSerFk2"),
		AFA_TIPO_ORIENTACAO_ETIQUETAS("afaTipoOrientacaoEtiqueta"),
		RAP_SERVIDORES_BY_AFA_OPM_SER_FK1("rapServidoresByAfaOpmSerFk1"),
		AFA_ITEM_PREPARO_MDTOS("afaItemPreparoMdto"),
		CRIADO_EM("criadoEm"),
		DESCRICAO("descricao"),
		ALTERADO_EM("alteradoEm"),
		ORDEM_VISUALIZACAO("ordemVisualizacao");

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
		if (!(obj instanceof AfaOrientPrepMdto)) {
			return false;
		}
		AfaOrientPrepMdto other = (AfaOrientPrepMdto) obj;
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
