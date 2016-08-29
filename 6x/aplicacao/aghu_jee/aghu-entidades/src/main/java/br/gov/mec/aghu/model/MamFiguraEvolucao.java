package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamFiguraEvolucao generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamFieSq1", sequenceName="AGH.MAM_FIE_SQ1", allocationSize = 1)
@Table(name = "MAM_FIGURA_EVOLUCOES", schema = "AGH")
public class MamFiguraEvolucao extends BaseEntitySeq<Long> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2996280746386924707L;
	private Long seq;
	private Integer version;
	private MamFiguraEvolucao mamFiguraEvolucao;
	private RapServidores rapServidoresByMamFieSerFk3;
	private MamTipoItemEvolucao mamTipoItemEvolucao;
	private AacConsultas aacConsultas;
	private RapServidores rapServidoresByMamFieSerFk1;
	private RapServidores rapServidoresByMamFieSerFk4;
	private MamFigura mamFigura;
	private RapServidores rapServidoresByMamFieSerFk2;
	private AipPacientes aipPacientes;
	private Date dthrCriacao;
	private Date dthrValida;
	private Date dthrMvto;
	private Date dthrValidaMvto;
	private String indPendente;
	private MamImagemEvolucao mamImagemEvolucao;
	private Set<MamFiguraEvolucao> mamFiguraEvolucaoes = new HashSet<MamFiguraEvolucao>(0);

	public MamFiguraEvolucao() {
	}

	public MamFiguraEvolucao(Long seq, MamTipoItemEvolucao mamTipoItemEvolucao, RapServidores rapServidoresByMamFieSerFk1,
			MamFigura mamFigura, AipPacientes aipPacientes, Date dthrCriacao, String indPendente) {
		this.seq = seq;
		this.mamTipoItemEvolucao = mamTipoItemEvolucao;
		this.rapServidoresByMamFieSerFk1 = rapServidoresByMamFieSerFk1;
		this.mamFigura = mamFigura;
		this.aipPacientes = aipPacientes;
		this.dthrCriacao = dthrCriacao;
		this.indPendente = indPendente;
	}

	public MamFiguraEvolucao(Long seq, MamFiguraEvolucao mamFiguraEvolucao, RapServidores rapServidoresByMamFieSerFk3,
			MamTipoItemEvolucao mamTipoItemEvolucao, AacConsultas aacConsultas, RapServidores rapServidoresByMamFieSerFk1,
			RapServidores rapServidoresByMamFieSerFk4, MamFigura mamFigura, RapServidores rapServidoresByMamFieSerFk2,
			AipPacientes aipPacientes, Date dthrCriacao, Date dthrValida, Date dthrMvto, Date dthrValidaMvto, String indPendente,
			MamImagemEvolucao mamImagemEvolucao, Set<MamFiguraEvolucao> mamFiguraEvolucaoes) {
		this.seq = seq;
		this.mamFiguraEvolucao = mamFiguraEvolucao;
		this.rapServidoresByMamFieSerFk3 = rapServidoresByMamFieSerFk3;
		this.mamTipoItemEvolucao = mamTipoItemEvolucao;
		this.aacConsultas = aacConsultas;
		this.rapServidoresByMamFieSerFk1 = rapServidoresByMamFieSerFk1;
		this.rapServidoresByMamFieSerFk4 = rapServidoresByMamFieSerFk4;
		this.mamFigura = mamFigura;
		this.rapServidoresByMamFieSerFk2 = rapServidoresByMamFieSerFk2;
		this.aipPacientes = aipPacientes;
		this.dthrCriacao = dthrCriacao;
		this.dthrValida = dthrValida;
		this.dthrMvto = dthrMvto;
		this.dthrValidaMvto = dthrValidaMvto;
		this.indPendente = indPendente;
		this.mamImagemEvolucao = mamImagemEvolucao;
		this.mamFiguraEvolucaoes = mamFiguraEvolucaoes;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamFieSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
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
	@JoinColumn(name = "FIE_SEQ")
	public MamFiguraEvolucao getMamFiguraEvolucao() {
		return this.mamFiguraEvolucao;
	}

	public void setMamFiguraEvolucao(MamFiguraEvolucao mamFiguraEvolucao) {
		this.mamFiguraEvolucao = mamFiguraEvolucao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_MVTO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_MVTO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByMamFieSerFk3() {
		return this.rapServidoresByMamFieSerFk3;
	}

	public void setRapServidoresByMamFieSerFk3(RapServidores rapServidoresByMamFieSerFk3) {
		this.rapServidoresByMamFieSerFk3 = rapServidoresByMamFieSerFk3;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TIE_SEQ", nullable = false)
	public MamTipoItemEvolucao getMamTipoItemEvolucao() {
		return this.mamTipoItemEvolucao;
	}

	public void setMamTipoItemEvolucao(MamTipoItemEvolucao mamTipoItemEvolucao) {
		this.mamTipoItemEvolucao = mamTipoItemEvolucao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CON_NUMERO")
	public AacConsultas getAacConsultas() {
		return this.aacConsultas;
	}

	public void setAacConsultas(AacConsultas aacConsultas) {
		this.aacConsultas = aacConsultas;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByMamFieSerFk1() {
		return this.rapServidoresByMamFieSerFk1;
	}

	public void setRapServidoresByMamFieSerFk1(RapServidores rapServidoresByMamFieSerFk1) {
		this.rapServidoresByMamFieSerFk1 = rapServidoresByMamFieSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_VALIDA_MVTO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_VALIDA_MVTO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByMamFieSerFk4() {
		return this.rapServidoresByMamFieSerFk4;
	}

	public void setRapServidoresByMamFieSerFk4(RapServidores rapServidoresByMamFieSerFk4) {
		this.rapServidoresByMamFieSerFk4 = rapServidoresByMamFieSerFk4;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FIG_SEQ", nullable = false)
	public MamFigura getMamFigura() {
		return this.mamFigura;
	}

	public void setMamFigura(MamFigura mamFigura) {
		this.mamFigura = mamFigura;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_VALIDA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_VALIDA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByMamFieSerFk2() {
		return this.rapServidoresByMamFieSerFk2;
	}

	public void setRapServidoresByMamFieSerFk2(RapServidores rapServidoresByMamFieSerFk2) {
		this.rapServidoresByMamFieSerFk2 = rapServidoresByMamFieSerFk2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAC_CODIGO", nullable = false)
	public AipPacientes getAipPacientes() {
		return this.aipPacientes;
	}

	public void setAipPacientes(AipPacientes aipPacientes) {
		this.aipPacientes = aipPacientes;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_CRIACAO", nullable = false, length = 29)
	public Date getDthrCriacao() {
		return this.dthrCriacao;
	}

	public void setDthrCriacao(Date dthrCriacao) {
		this.dthrCriacao = dthrCriacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_VALIDA", length = 29)
	public Date getDthrValida() {
		return this.dthrValida;
	}

	public void setDthrValida(Date dthrValida) {
		this.dthrValida = dthrValida;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_MVTO", length = 29)
	public Date getDthrMvto() {
		return this.dthrMvto;
	}

	public void setDthrMvto(Date dthrMvto) {
		this.dthrMvto = dthrMvto;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_VALIDA_MVTO", length = 29)
	public Date getDthrValidaMvto() {
		return this.dthrValidaMvto;
	}

	public void setDthrValidaMvto(Date dthrValidaMvto) {
		this.dthrValidaMvto = dthrValidaMvto;
	}

	@Column(name = "IND_PENDENTE", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndPendente() {
		return this.indPendente;
	}

	public void setIndPendente(String indPendente) {
		this.indPendente = indPendente;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "mamFiguraEvolucao")
	public MamImagemEvolucao getMamImagemEvolucao() {
		return this.mamImagemEvolucao;
	}

	public void setMamImagemEvolucao(MamImagemEvolucao mamImagemEvolucao) {
		this.mamImagemEvolucao = mamImagemEvolucao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mamFiguraEvolucao")
	public Set<MamFiguraEvolucao> getMamFiguraEvolucaoes() {
		return this.mamFiguraEvolucaoes;
	}

	public void setMamFiguraEvolucaoes(Set<MamFiguraEvolucao> mamFiguraEvolucaoes) {
		this.mamFiguraEvolucaoes = mamFiguraEvolucaoes;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		MAM_FIGURA_EVOLUCOES("mamFiguraEvolucao"),
		RAP_SERVIDORES_BY_MAM_FIE_SER_FK3("rapServidoresByMamFieSerFk3"),
		MAM_TIPO_ITEM_EVOLUCAO("mamTipoItemEvolucao"),
		AAC_CONSULTAS("aacConsultas"),
		RAP_SERVIDORES_BY_MAM_FIE_SER_FK1("rapServidoresByMamFieSerFk1"),
		RAP_SERVIDORES_BY_MAM_FIE_SER_FK4("rapServidoresByMamFieSerFk4"),
		MAM_FIGURAS("mamFigura"),
		RAP_SERVIDORES_BY_MAM_FIE_SER_FK2("rapServidoresByMamFieSerFk2"),
		AIP_PACIENTES("aipPacientes"),
		DTHR_CRIACAO("dthrCriacao"),
		DTHR_VALIDA("dthrValida"),
		DTHR_MVTO("dthrMvto"),
		DTHR_VALIDA_MVTO("dthrValidaMvto"),
		IND_PENDENTE("indPendente"),
		MAM_IMAGEM_EVOLUCOES("mamImagemEvolucao"),
		MAM_FIGURA_EVOLUCAOES("mamFiguraEvolucaoes"),
		CON_NUMERO("aacConsultas.numero");

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
		if (!(obj instanceof MamFiguraEvolucao)) {
			return false;
		}
		MamFiguraEvolucao other = (MamFiguraEvolucao) obj;
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
