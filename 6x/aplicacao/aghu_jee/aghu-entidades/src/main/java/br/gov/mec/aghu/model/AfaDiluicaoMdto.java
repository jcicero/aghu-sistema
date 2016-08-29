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


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AfaDiluicaoMdto generated by hbm2java
 */
@Entity
@Table(name = "AFA_DILUICAO_MDTOS", schema = "AGH")
public class AfaDiluicaoMdto extends BaseEntityId<AfaDiluicaoMdtoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 692435650667405377L;
	private AfaDiluicaoMdtoId id;
	private Integer version;
	private RapServidores rapServidores;
	private AfaMedicamento afaMedicamento;
	private AfaFormaDosagem afaFormaDosagem;
	private Date criadoEm;
	private Date dthrInicio;
	private Date dthrFim;
	private Double qtdeUnidade;
	private Double qtdeMl;

	public AfaDiluicaoMdto() {
	}

	public AfaDiluicaoMdto(AfaDiluicaoMdtoId id, RapServidores rapServidores, AfaMedicamento afaMedicamento,
			AfaFormaDosagem afaFormaDosagem, Date criadoEm, Date dthrInicio, Double qtdeUnidade, Double qtdeMl) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.afaMedicamento = afaMedicamento;
		this.afaFormaDosagem = afaFormaDosagem;
		this.criadoEm = criadoEm;
		this.dthrInicio = dthrInicio;
		this.qtdeUnidade = qtdeUnidade;
		this.qtdeMl = qtdeMl;
	}

	public AfaDiluicaoMdto(AfaDiluicaoMdtoId id, RapServidores rapServidores, AfaMedicamento afaMedicamento,
			AfaFormaDosagem afaFormaDosagem, Date criadoEm, Date dthrInicio, Date dthrFim, Double qtdeUnidade, Double qtdeMl) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.afaMedicamento = afaMedicamento;
		this.afaFormaDosagem = afaFormaDosagem;
		this.criadoEm = criadoEm;
		this.dthrInicio = dthrInicio;
		this.dthrFim = dthrFim;
		this.qtdeUnidade = qtdeUnidade;
		this.qtdeMl = qtdeMl;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "medMatCodigo", column = @Column(name = "MED_MAT_CODIGO", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public AfaDiluicaoMdtoId getId() {
		return this.id;
	}

	public void setId(AfaDiluicaoMdtoId id) {
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
	@JoinColumn(name = "MED_MAT_CODIGO", nullable = false, insertable = false, updatable = false)
	public AfaMedicamento getAfaMedicamento() {
		return this.afaMedicamento;
	}

	public void setAfaMedicamento(AfaMedicamento afaMedicamento) {
		this.afaMedicamento = afaMedicamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FDS_SEQ", nullable = false)
	public AfaFormaDosagem getAfaFormaDosagem() {
		return this.afaFormaDosagem;
	}

	public void setAfaFormaDosagem(AfaFormaDosagem afaFormaDosagem) {
		this.afaFormaDosagem = afaFormaDosagem;
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
	@Column(name = "DTHR_INICIO", nullable = false, length = 29)
	public Date getDthrInicio() {
		return this.dthrInicio;
	}

	public void setDthrInicio(Date dthrInicio) {
		this.dthrInicio = dthrInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_FIM", length = 29)
	public Date getDthrFim() {
		return this.dthrFim;
	}

	public void setDthrFim(Date dthrFim) {
		this.dthrFim = dthrFim;
	}

	@Column(name = "QTDE_UNIDADE", nullable = false, precision = 17, scale = 17)
	public Double getQtdeUnidade() {
		return this.qtdeUnidade;
	}

	public void setQtdeUnidade(Double qtdeUnidade) {
		this.qtdeUnidade = qtdeUnidade;
	}

	@Column(name = "QTDE_ML", nullable = false, precision = 17, scale = 17)
	public Double getQtdeMl() {
		return this.qtdeMl;
	}

	public void setQtdeMl(Double qtdeMl) {
		this.qtdeMl = qtdeMl;
	}

	public enum Fields {

		ID("id"),
		MED_MAT_CODIGO("id.medMatCodigo"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		AFA_MEDICAMENTO("afaMedicamento"),
		AFA_FORMA_DOSAGEM("afaFormaDosagem"),
		CRIADO_EM("criadoEm"),
		DTHR_INICIO("dthrInicio"),
		DTHR_FIM("dthrFim"),
		QTDE_UNIDADE("qtdeUnidade"),
		QTDE_ML("qtdeMl");

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
		if (!(obj instanceof AfaDiluicaoMdto)) {
			return false;
		}
		AfaDiluicaoMdto other = (AfaDiluicaoMdto) obj;
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
