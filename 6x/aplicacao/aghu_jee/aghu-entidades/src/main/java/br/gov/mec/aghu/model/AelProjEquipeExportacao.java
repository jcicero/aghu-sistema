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
 * AelProjEquipeExportacao generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelPeeSq1", sequenceName="AGH.AEL_PEE_SQ1", allocationSize = 1)
@Table(name = "AEL_PROJ_EQUIPE_EXPORTACOES", schema = "AGH")
public class AelProjEquipeExportacao extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7505184303889424189L;
	private Integer seq;
	private Integer version;
	private RapServidores rapServidoresByAelPeeSerFk1;
	private RapServidores rapServidoresByPeeSerFk;
	private AelProjetoPesquisas aelProjetoPesquisas;
	private AelProjPesquisaExportacao aelProjPesquisaExportacao;
	private RapServidores rapServidoresByAelPeeSerFk2;
	private Date criadoEm;
	private Integer cartaoUfrgs;
	private String nomePesquisadorHcpa;
	private Date dtInicio;
	private Date dtFim;
	private String formaParticipacao;
	private Date dthrExportacao;
	private Long codAutor;

	public AelProjEquipeExportacao() {
	}

	public AelProjEquipeExportacao(Integer seq, RapServidores rapServidoresByAelPeeSerFk1, AelProjetoPesquisas aelProjetoPesquisas,
			Date criadoEm, Date dtInicio, String formaParticipacao, Long codAutor) {
		this.seq = seq;
		this.rapServidoresByAelPeeSerFk1 = rapServidoresByAelPeeSerFk1;
		this.aelProjetoPesquisas = aelProjetoPesquisas;
		this.criadoEm = criadoEm;
		this.dtInicio = dtInicio;
		this.formaParticipacao = formaParticipacao;
		this.codAutor = codAutor;
	}

	public AelProjEquipeExportacao(Integer seq, RapServidores rapServidoresByAelPeeSerFk1, RapServidores rapServidoresByPeeSerFk,
			AelProjetoPesquisas aelProjetoPesquisas, AelProjPesquisaExportacao aelProjPesquisaExportacao,
			RapServidores rapServidoresByAelPeeSerFk2, Date criadoEm, Integer cartaoUfrgs, String nomePesquisadorHcpa, Date dtInicio,
			Date dtFim, String formaParticipacao, Date dthrExportacao, Long codAutor) {
		this.seq = seq;
		this.rapServidoresByAelPeeSerFk1 = rapServidoresByAelPeeSerFk1;
		this.rapServidoresByPeeSerFk = rapServidoresByPeeSerFk;
		this.aelProjetoPesquisas = aelProjetoPesquisas;
		this.aelProjPesquisaExportacao = aelProjPesquisaExportacao;
		this.rapServidoresByAelPeeSerFk2 = rapServidoresByAelPeeSerFk2;
		this.criadoEm = criadoEm;
		this.cartaoUfrgs = cartaoUfrgs;
		this.nomePesquisadorHcpa = nomePesquisadorHcpa;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.formaParticipacao = formaParticipacao;
		this.dthrExportacao = dthrExportacao;
		this.codAutor = codAutor;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelPeeSq1")
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByAelPeeSerFk1() {
		return this.rapServidoresByAelPeeSerFk1;
	}

	public void setRapServidoresByAelPeeSerFk1(RapServidores rapServidoresByAelPeeSerFk1) {
		this.rapServidoresByAelPeeSerFk1 = rapServidoresByAelPeeSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_RESPONSAVEL", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_RESPONSAVEL", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByPeeSerFk() {
		return this.rapServidoresByPeeSerFk;
	}

	public void setRapServidoresByPeeSerFk(RapServidores rapServidoresByPeeSerFk) {
		this.rapServidoresByPeeSerFk = rapServidoresByPeeSerFk;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PJQ_SEQ", nullable = false)
	public AelProjetoPesquisas getAelProjetoPesquisas() {
		return this.aelProjetoPesquisas;
	}

	public void setAelProjetoPesquisas(AelProjetoPesquisas aelProjetoPesquisas) {
		this.aelProjetoPesquisas = aelProjetoPesquisas;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PPX_SEQ")
	public AelProjPesquisaExportacao getAelProjPesquisaExportacao() {
		return this.aelProjPesquisaExportacao;
	}

	public void setAelProjPesquisaExportacao(AelProjPesquisaExportacao aelProjPesquisaExportacao) {
		this.aelProjPesquisaExportacao = aelProjPesquisaExportacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_EXPORTADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_EXPORTADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByAelPeeSerFk2() {
		return this.rapServidoresByAelPeeSerFk2;
	}

	public void setRapServidoresByAelPeeSerFk2(RapServidores rapServidoresByAelPeeSerFk2) {
		this.rapServidoresByAelPeeSerFk2 = rapServidoresByAelPeeSerFk2;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "CARTAO_UFRGS")
	public Integer getCartaoUfrgs() {
		return this.cartaoUfrgs;
	}

	public void setCartaoUfrgs(Integer cartaoUfrgs) {
		this.cartaoUfrgs = cartaoUfrgs;
	}

	@Column(name = "NOME_PESQUISADOR_HCPA", length = 72)
	@Length(max = 72)
	public String getNomePesquisadorHcpa() {
		return this.nomePesquisadorHcpa;
	}

	public void setNomePesquisadorHcpa(String nomePesquisadorHcpa) {
		this.nomePesquisadorHcpa = nomePesquisadorHcpa;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO", nullable = false, length = 29)
	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM", length = 29)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	@Column(name = "FORMA_PARTICIPACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getFormaParticipacao() {
		return this.formaParticipacao;
	}

	public void setFormaParticipacao(String formaParticipacao) {
		this.formaParticipacao = formaParticipacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_EXPORTACAO", length = 29)
	public Date getDthrExportacao() {
		return this.dthrExportacao;
	}

	public void setDthrExportacao(Date dthrExportacao) {
		this.dthrExportacao = dthrExportacao;
	}

	@Column(name = "COD_AUTOR", nullable = false)
	public Long getCodAutor() {
		return this.codAutor;
	}

	public void setCodAutor(Long codAutor) {
		this.codAutor = codAutor;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES_BY_AEL_PEE_SER_FK1("rapServidoresByAelPeeSerFk1"),
		RAP_SERVIDORES_BY_PEE_SER_FK("rapServidoresByPeeSerFk"),
		AEL_PROJETO_PESQUISAS("aelProjetoPesquisas"),
		AEL_PROJ_PESQUISA_EXPORTACOES("aelProjPesquisaExportacao"),
		RAP_SERVIDORES_BY_AEL_PEE_SER_FK2("rapServidoresByAelPeeSerFk2"),
		CRIADO_EM("criadoEm"),
		CARTAO_UFRGS("cartaoUfrgs"),
		NOME_PESQUISADOR_HCPA("nomePesquisadorHcpa"),
		DT_INICIO("dtInicio"),
		DT_FIM("dtFim"),
		FORMA_PARTICIPACAO("formaParticipacao"),
		DTHR_EXPORTACAO("dthrExportacao"),
		COD_AUTOR("codAutor");

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
		if (!(obj instanceof AelProjEquipeExportacao)) {
			return false;
		}
		AelProjEquipeExportacao other = (AelProjEquipeExportacao) obj;
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
