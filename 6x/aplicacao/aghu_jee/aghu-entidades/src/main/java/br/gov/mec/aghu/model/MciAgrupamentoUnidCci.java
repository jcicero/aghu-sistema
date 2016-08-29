package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MciAgrupamentoUnidCci generated by hbm2java
 */
@Entity
@Table(name = "MCI_AGRUPAMENTO_UNID_CCIS", schema = "AGH")
public class MciAgrupamentoUnidCci extends BaseEntityId<MciAgrupamentoUnidCciId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1483129515056826309L;
	private MciAgrupamentoUnidCciId id;
	private Integer version;
	private RapServidores rapServidoresByMciAucSerFk1;
	private MciTipoAgrupamentoUnidCci mciTipoAgrupamentoUnidCci;
	private RapServidores rapServidoresByMciAucSerFk2;
	private String descricao;
	private String descricaoExterna;
	private Short ordem;
	private String indSituacao;
	private Date criadoEm;
	private Date alteradoEm;
	private String indTotal;
	private String indSubTotal;
	private Set<MciLinhaTmpEstatistica> mciLinhaTmpEstatisticaes = new HashSet<MciLinhaTmpEstatistica>(0);
	private Set<MciGrupoUnidCci> mciGrupoUnidCcies = new HashSet<MciGrupoUnidCci>(0);
	private Set<MciAgrupLinhaExportacao> mciAgrupLinhaExportacaoes = new HashSet<MciAgrupLinhaExportacao>(0);

	public MciAgrupamentoUnidCci() {
	}

	public MciAgrupamentoUnidCci(MciAgrupamentoUnidCciId id, RapServidores rapServidoresByMciAucSerFk1,
			MciTipoAgrupamentoUnidCci mciTipoAgrupamentoUnidCci, Short ordem, String indSituacao, Date criadoEm, String indTotal,
			String indSubTotal) {
		this.id = id;
		this.rapServidoresByMciAucSerFk1 = rapServidoresByMciAucSerFk1;
		this.mciTipoAgrupamentoUnidCci = mciTipoAgrupamentoUnidCci;
		this.ordem = ordem;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.indTotal = indTotal;
		this.indSubTotal = indSubTotal;
	}

	public MciAgrupamentoUnidCci(MciAgrupamentoUnidCciId id, RapServidores rapServidoresByMciAucSerFk1,
			MciTipoAgrupamentoUnidCci mciTipoAgrupamentoUnidCci, RapServidores rapServidoresByMciAucSerFk2, String descricao,
			String descricaoExterna, Short ordem, String indSituacao, Date criadoEm, Date alteradoEm, String indTotal,
			String indSubTotal, Set<MciLinhaTmpEstatistica> mciLinhaTmpEstatisticaes, Set<MciGrupoUnidCci> mciGrupoUnidCcies,
			Set<MciAgrupLinhaExportacao> mciAgrupLinhaExportacaoes) {
		this.id = id;
		this.rapServidoresByMciAucSerFk1 = rapServidoresByMciAucSerFk1;
		this.mciTipoAgrupamentoUnidCci = mciTipoAgrupamentoUnidCci;
		this.rapServidoresByMciAucSerFk2 = rapServidoresByMciAucSerFk2;
		this.descricao = descricao;
		this.descricaoExterna = descricaoExterna;
		this.ordem = ordem;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.indTotal = indTotal;
		this.indSubTotal = indSubTotal;
		this.mciLinhaTmpEstatisticaes = mciLinhaTmpEstatisticaes;
		this.mciGrupoUnidCcies = mciGrupoUnidCcies;
		this.mciAgrupLinhaExportacaoes = mciAgrupLinhaExportacaoes;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "tauSeq", column = @Column(name = "TAU_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public MciAgrupamentoUnidCciId getId() {
		return this.id;
	}

	public void setId(MciAgrupamentoUnidCciId id) {
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
	public RapServidores getRapServidoresByMciAucSerFk1() {
		return this.rapServidoresByMciAucSerFk1;
	}

	public void setRapServidoresByMciAucSerFk1(RapServidores rapServidoresByMciAucSerFk1) {
		this.rapServidoresByMciAucSerFk1 = rapServidoresByMciAucSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TAU_SEQ", nullable = false, insertable = false, updatable = false)
	public MciTipoAgrupamentoUnidCci getMciTipoAgrupamentoUnidCci() {
		return this.mciTipoAgrupamentoUnidCci;
	}

	public void setMciTipoAgrupamentoUnidCci(MciTipoAgrupamentoUnidCci mciTipoAgrupamentoUnidCci) {
		this.mciTipoAgrupamentoUnidCci = mciTipoAgrupamentoUnidCci;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_MOVIMENTADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_MOVIMENTADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByMciAucSerFk2() {
		return this.rapServidoresByMciAucSerFk2;
	}

	public void setRapServidoresByMciAucSerFk2(RapServidores rapServidoresByMciAucSerFk2) {
		this.rapServidoresByMciAucSerFk2 = rapServidoresByMciAucSerFk2;
	}

	@Column(name = "DESCRICAO", length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "DESCRICAO_EXTERNA", length = 60)
	@Length(max = 60)
	public String getDescricaoExterna() {
		return this.descricaoExterna;
	}

	public void setDescricaoExterna(String descricaoExterna) {
		this.descricaoExterna = descricaoExterna;
	}

	@Column(name = "ORDEM", nullable = false)
	public Short getOrdem() {
		return this.ordem;
	}

	public void setOrdem(Short ordem) {
		this.ordem = ordem;
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

	@Column(name = "IND_TOTAL", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndTotal() {
		return this.indTotal;
	}

	public void setIndTotal(String indTotal) {
		this.indTotal = indTotal;
	}

	@Column(name = "IND_SUB_TOTAL", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSubTotal() {
		return this.indSubTotal;
	}

	public void setIndSubTotal(String indSubTotal) {
		this.indSubTotal = indSubTotal;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciAgrupamentoUnidCci")
	public Set<MciLinhaTmpEstatistica> getMciLinhaTmpEstatisticaes() {
		return this.mciLinhaTmpEstatisticaes;
	}

	public void setMciLinhaTmpEstatisticaes(Set<MciLinhaTmpEstatistica> mciLinhaTmpEstatisticaes) {
		this.mciLinhaTmpEstatisticaes = mciLinhaTmpEstatisticaes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciAgrupamentoUnidCci")
	public Set<MciGrupoUnidCci> getMciGrupoUnidCcies() {
		return this.mciGrupoUnidCcies;
	}

	public void setMciGrupoUnidCcies(Set<MciGrupoUnidCci> mciGrupoUnidCcies) {
		this.mciGrupoUnidCcies = mciGrupoUnidCcies;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciAgrupamentoUnidCci")
	public Set<MciAgrupLinhaExportacao> getMciAgrupLinhaExportacaoes() {
		return this.mciAgrupLinhaExportacaoes;
	}

	public void setMciAgrupLinhaExportacaoes(Set<MciAgrupLinhaExportacao> mciAgrupLinhaExportacaoes) {
		this.mciAgrupLinhaExportacaoes = mciAgrupLinhaExportacaoes;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES_BY_MCI_AUC_SER_FK1("rapServidoresByMciAucSerFk1"),
		MCI_TIPO_AGRUPAMENTO_UNID_CCIS("mciTipoAgrupamentoUnidCci"),
		RAP_SERVIDORES_BY_MCI_AUC_SER_FK2("rapServidoresByMciAucSerFk2"),
		DESCRICAO("descricao"),
		DESCRICAO_EXTERNA("descricaoExterna"),
		ORDEM("ordem"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		IND_TOTAL("indTotal"),
		IND_SUB_TOTAL("indSubTotal"),
		MCI_LINHA_TMP_ESTATISTICAES("mciLinhaTmpEstatisticaes"),
		MCI_GRUPO_UNID_CCIES("mciGrupoUnidCcies"),
		MCI_AGRUP_LINHA_EXPORTACAOES("mciAgrupLinhaExportacaoes");

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
		if (!(obj instanceof MciAgrupamentoUnidCci)) {
			return false;
		}
		MciAgrupamentoUnidCci other = (MciAgrupamentoUnidCci) obj;
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
