package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * ScoProgrCodAcessoForn generated by hbm2java
 */
@Entity
@SequenceGenerator(name="scoCafSq1", sequenceName="AGH.SCO_CAF_SQ1", allocationSize = 1)
@Table(name = "SCO_PROGR_COD_ACESSOS_FORN", schema = "AGH")
public class ScoProgrCodAcessoForn extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4806905558344755938L;
	private Integer seq;
	private Integer version;
	private ScoFornecedor scoFornecedor;
	private RapServidores rapServidoresByScoCafSerFk1;
	private RapServidores rapServidoresByScoCafSerAlteracaoFk1;
	private String codAcesso;
	private Date dtGeracao;
	private Date dtAlteracao;
	private Date dtImpressao;
	private Date dtEnvioFornecedor;
	private Date dtEnvioContato;

	public ScoProgrCodAcessoForn() {
	}

	public ScoProgrCodAcessoForn(Integer seq, ScoFornecedor scoFornecedor, RapServidores rapServidoresByScoCafSerFk1, String codAcesso) {
		this.seq = seq;
		this.scoFornecedor = scoFornecedor;
		this.rapServidoresByScoCafSerFk1 = rapServidoresByScoCafSerFk1;
		this.codAcesso = codAcesso;
	}

	public ScoProgrCodAcessoForn(Integer seq, ScoFornecedor scoFornecedor, RapServidores rapServidoresByScoCafSerFk1,
			RapServidores rapServidoresByScoCafSerAlteracaoFk1, String codAcesso, Date dtGeracao, Date dtAlteracao, Date dtImpressao,
			Date dtEnvioFornecedor, Date dtEnvioContato) {
		this.seq = seq;
		this.scoFornecedor = scoFornecedor;
		this.rapServidoresByScoCafSerFk1 = rapServidoresByScoCafSerFk1;
		this.rapServidoresByScoCafSerAlteracaoFk1 = rapServidoresByScoCafSerAlteracaoFk1;
		this.codAcesso = codAcesso;
		this.dtGeracao = dtGeracao;
		this.dtAlteracao = dtAlteracao;
		this.dtImpressao = dtImpressao;
		this.dtEnvioFornecedor = dtEnvioFornecedor;
		this.dtEnvioContato = dtEnvioContato;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "scoCafSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
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
	@JoinColumn(name = "FRN_NUMERO", nullable = false)
	public ScoFornecedor getScoFornecedor() {
		return this.scoFornecedor;
	}

	public void setScoFornecedor(ScoFornecedor scoFornecedor) {
		this.scoFornecedor = scoFornecedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByScoCafSerFk1() {
		return this.rapServidoresByScoCafSerFk1;
	}

	public void setRapServidoresByScoCafSerFk1(RapServidores rapServidoresByScoCafSerFk1) {
		this.rapServidoresByScoCafSerFk1 = rapServidoresByScoCafSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_ALTERACAO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERACAO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByScoCafSerAlteracaoFk1() {
		return this.rapServidoresByScoCafSerAlteracaoFk1;
	}

	public void setRapServidoresByScoCafSerAlteracaoFk1(RapServidores rapServidoresByScoCafSerAlteracaoFk1) {
		this.rapServidoresByScoCafSerAlteracaoFk1 = rapServidoresByScoCafSerAlteracaoFk1;
	}

	@Column(name = "COD_ACESSO", nullable = false, length = 10)
	@Length(max = 10)
	public String getCodAcesso() {
		return this.codAcesso;
	}

	public void setCodAcesso(String codAcesso) {
		this.codAcesso = codAcesso;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_GERACAO", length = 29)
	public Date getDtGeracao() {
		return this.dtGeracao;
	}

	public void setDtGeracao(Date dtGeracao) {
		this.dtGeracao = dtGeracao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ALTERACAO", length = 29)
	public Date getDtAlteracao() {
		return this.dtAlteracao;
	}

	public void setDtAlteracao(Date dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_IMPRESSAO", length = 29)
	public Date getDtImpressao() {
		return this.dtImpressao;
	}

	public void setDtImpressao(Date dtImpressao) {
		this.dtImpressao = dtImpressao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ENVIO_FORNECEDOR", length = 29)
	public Date getDtEnvioFornecedor() {
		return this.dtEnvioFornecedor;
	}

	public void setDtEnvioFornecedor(Date dtEnvioFornecedor) {
		this.dtEnvioFornecedor = dtEnvioFornecedor;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ENVIO_CONTATO", length = 29)
	public Date getDtEnvioContato() {
		return this.dtEnvioContato;
	}

	public void setDtEnvioContato(Date dtEnvioContato) {
		this.dtEnvioContato = dtEnvioContato;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		SCO_FORNECEDOR("scoFornecedor"),
		NRO_FORNECEDOR("scoFornecedor.numero"),
		RAP_SERVIDORES_BY_SCO_CAF_SER_FK1("rapServidoresByScoCafSerFk1"),
		RAP_SERVIDORES_BY_SCO_CAF_SER_ALTERACAO_FK1("rapServidoresByScoCafSerAlteracaoFk1"),
		COD_ACESSO("codAcesso"),
		DT_GERACAO("dtGeracao"),
		DT_ALTERACAO("dtAlteracao"),
		DT_IMPRESSAO("dtImpressao"),
		DT_ENVIO_FORNECEDOR("dtEnvioFornecedor"),
		DT_ENVIO_CONTATO("dtEnvioContato");

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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof ScoProgrCodAcessoForn)) {
			return false;
		}
		ScoProgrCodAcessoForn other = (ScoProgrCodAcessoForn) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
