package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import br.gov.mec.aghu.dominio.DominioFormaContabilizacao;
import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MciLocalEtiologia generated by hbm2java
 */
@Entity
@Table(name = "MCI_LOCAL_ETIOLOGIAS", schema = "AGH")
public class MciLocalEtiologia extends BaseEntityId<MciLocalEtiologiaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7076595109808267487L;
	private MciLocalEtiologiaId id;
	private Integer version;
	private RapServidores rapServidores;
	private AghUnidadesFuncionais aghUnidadesFuncionais;
	private MciEtiologiaInfeccao mciEtiologiaInfeccao;
	private DominioFormaContabilizacao indFormaContabilizacao;
	private DominioSituacao indSituacao;
	private Date criadoEm;
	private Date alteradoEm;
	private RapServidores servidorMovimentado;

	public MciLocalEtiologia() {
	}

	public MciLocalEtiologia(MciLocalEtiologiaId id, RapServidores rapServidores, AghUnidadesFuncionais aghUnidadesFuncionais,
			MciEtiologiaInfeccao mciEtiologiaInfeccao, DominioFormaContabilizacao indFormaContabilizacao, DominioSituacao indSituacao, Date criadoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.aghUnidadesFuncionais = aghUnidadesFuncionais;
		this.mciEtiologiaInfeccao = mciEtiologiaInfeccao;
		this.indFormaContabilizacao = indFormaContabilizacao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "einTipo", column = @Column(name = "EIN_TIPO", nullable = false, length = 2)),
			@AttributeOverride(name = "unfSeq", column = @Column(name = "UNF_SEQ", nullable = false)) })
	public MciLocalEtiologiaId getId() {
		return this.id;
	}

	public void setId(MciLocalEtiologiaId id) {
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
	@JoinColumn(name = "UNF_SEQ", insertable = false, updatable = false)
	public AghUnidadesFuncionais getAghUnidadesFuncionais() {
		return this.aghUnidadesFuncionais;
	}

	public void setAghUnidadesFuncionais(AghUnidadesFuncionais aghUnidadesFuncionais) {
		this.aghUnidadesFuncionais = aghUnidadesFuncionais;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EIN_TIPO", insertable = false, updatable = false)
	public MciEtiologiaInfeccao getMciEtiologiaInfeccao() {
		return this.mciEtiologiaInfeccao;
	}

	public void setMciEtiologiaInfeccao(MciEtiologiaInfeccao mciEtiologiaInfeccao) {
		this.mciEtiologiaInfeccao = mciEtiologiaInfeccao;
	}

	@Column(name = "IND_FORMA_CONTABILIZACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioFormaContabilizacao getIndFormaContabilizacao() {
		return this.indFormaContabilizacao;
	}

	public void setIndFormaContabilizacao(DominioFormaContabilizacao indFormaContabilizacao) {
		this.indFormaContabilizacao = indFormaContabilizacao;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
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
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_MOVIMENTADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_MOVIMENTADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorMovimentado() {
		return this.servidorMovimentado;
	}

	public void setServidorMovimentado(
			RapServidores servidorMovimentado) {
		this.servidorMovimentado = servidorMovimentado;
	}

	public enum Fields {

		ID("id"),
		EIN_TIPO("id.einTipo"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		AGH_UNIDADES_FUNCIONAIS("aghUnidadesFuncionais"),
		UNF_SEQ("aghUnidadesFuncionais.seq"),
		MCI_ETIOLOGIA_INFECCAO("mciEtiologiaInfeccao"),
		IND_FORMA_CONTABILIZACAO("indFormaContabilizacao"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm");

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
		if (!(obj instanceof MciLocalEtiologia)) {
			return false;
		}
		MciLocalEtiologia other = (MciLocalEtiologia) obj;
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
