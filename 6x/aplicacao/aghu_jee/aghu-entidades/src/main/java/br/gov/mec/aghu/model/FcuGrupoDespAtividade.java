package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * FcuGrupoDespAtividade generated by hbm2java
 */
@Entity
@SequenceGenerator(name="fcuGdaSq1", sequenceName="AGH.FCU_GDA_SQ1", allocationSize = 1)
@Table(name = "FCU_GRUPO_DESP_ATIVIDADES", schema = "AGH")
public class FcuGrupoDespAtividade extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5328230225124780240L;
	private Integer seq;
	private Integer version;
	private Date dtCompetencia;
	private Short atiSeq;
	private String itemDescricao;
	private Short cdrSeq;
	private Short gccFornecedor;
	private Short gccCtroProducao;
	private Double valor;
	private Double qtde;
	private Double vlrCombustiveis;
	private Double vlrEngenharia;
	private Double vlrEscritorio;
	private Double vlrGases;
	private Double vlrHigiene;
	private Double vlrLaborDiag;
	private Double vlrMatMedicos;
	private Double vlrMedicamento;
	private Double vlrOpme;
	private Double vlrSnd;
	private Double vlrOutros;
	private Double vlrRouparia;

	public FcuGrupoDespAtividade() {
	}

	public FcuGrupoDespAtividade(Integer seq, Short atiSeq) {
		this.seq = seq;
		this.atiSeq = atiSeq;
	}

	public FcuGrupoDespAtividade(Integer seq, Date dtCompetencia, Short atiSeq, String itemDescricao, Short cdrSeq, Short gccFornecedor,
			Short gccCtroProducao, Double valor, Double qtde, Double vlrCombustiveis, Double vlrEngenharia, Double vlrEscritorio,
			Double vlrGases, Double vlrHigiene, Double vlrLaborDiag, Double vlrMatMedicos, Double vlrMedicamento, Double vlrOpme,
			Double vlrSnd, Double vlrOutros, Double vlrRouparia) {
		this.seq = seq;
		this.dtCompetencia = dtCompetencia;
		this.atiSeq = atiSeq;
		this.itemDescricao = itemDescricao;
		this.cdrSeq = cdrSeq;
		this.gccFornecedor = gccFornecedor;
		this.gccCtroProducao = gccCtroProducao;
		this.valor = valor;
		this.qtde = qtde;
		this.vlrCombustiveis = vlrCombustiveis;
		this.vlrEngenharia = vlrEngenharia;
		this.vlrEscritorio = vlrEscritorio;
		this.vlrGases = vlrGases;
		this.vlrHigiene = vlrHigiene;
		this.vlrLaborDiag = vlrLaborDiag;
		this.vlrMatMedicos = vlrMatMedicos;
		this.vlrMedicamento = vlrMedicamento;
		this.vlrOpme = vlrOpme;
		this.vlrSnd = vlrSnd;
		this.vlrOutros = vlrOutros;
		this.vlrRouparia = vlrRouparia;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "fcuGdaSq1")
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_COMPETENCIA", length = 29)
	public Date getDtCompetencia() {
		return this.dtCompetencia;
	}

	public void setDtCompetencia(Date dtCompetencia) {
		this.dtCompetencia = dtCompetencia;
	}

	@Column(name = "ATI_SEQ", nullable = false)
	public Short getAtiSeq() {
		return this.atiSeq;
	}

	public void setAtiSeq(Short atiSeq) {
		this.atiSeq = atiSeq;
	}

	@Column(name = "ITEM_DESCRICAO", length = 100)
	@Length(max = 100)
	public String getItemDescricao() {
		return this.itemDescricao;
	}

	public void setItemDescricao(String itemDescricao) {
		this.itemDescricao = itemDescricao;
	}

	@Column(name = "CDR_SEQ")
	public Short getCdrSeq() {
		return this.cdrSeq;
	}

	public void setCdrSeq(Short cdrSeq) {
		this.cdrSeq = cdrSeq;
	}

	@Column(name = "GCC_FORNECEDOR")
	public Short getGccFornecedor() {
		return this.gccFornecedor;
	}

	public void setGccFornecedor(Short gccFornecedor) {
		this.gccFornecedor = gccFornecedor;
	}

	@Column(name = "GCC_CTRO_PRODUCAO")
	public Short getGccCtroProducao() {
		return this.gccCtroProducao;
	}

	public void setGccCtroProducao(Short gccCtroProducao) {
		this.gccCtroProducao = gccCtroProducao;
	}

	@Column(name = "VALOR", precision = 17, scale = 17)
	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	@Column(name = "QTDE", precision = 17, scale = 17)
	public Double getQtde() {
		return this.qtde;
	}

	public void setQtde(Double qtde) {
		this.qtde = qtde;
	}

	@Column(name = "VLR_COMBUSTIVEIS", precision = 17, scale = 17)
	public Double getVlrCombustiveis() {
		return this.vlrCombustiveis;
	}

	public void setVlrCombustiveis(Double vlrCombustiveis) {
		this.vlrCombustiveis = vlrCombustiveis;
	}

	@Column(name = "VLR_ENGENHARIA", precision = 17, scale = 17)
	public Double getVlrEngenharia() {
		return this.vlrEngenharia;
	}

	public void setVlrEngenharia(Double vlrEngenharia) {
		this.vlrEngenharia = vlrEngenharia;
	}

	@Column(name = "VLR_ESCRITORIO", precision = 17, scale = 17)
	public Double getVlrEscritorio() {
		return this.vlrEscritorio;
	}

	public void setVlrEscritorio(Double vlrEscritorio) {
		this.vlrEscritorio = vlrEscritorio;
	}

	@Column(name = "VLR_GASES", precision = 17, scale = 17)
	public Double getVlrGases() {
		return this.vlrGases;
	}

	public void setVlrGases(Double vlrGases) {
		this.vlrGases = vlrGases;
	}

	@Column(name = "VLR_HIGIENE", precision = 17, scale = 17)
	public Double getVlrHigiene() {
		return this.vlrHigiene;
	}

	public void setVlrHigiene(Double vlrHigiene) {
		this.vlrHigiene = vlrHigiene;
	}

	@Column(name = "VLR_LABOR_DIAG", precision = 17, scale = 17)
	public Double getVlrLaborDiag() {
		return this.vlrLaborDiag;
	}

	public void setVlrLaborDiag(Double vlrLaborDiag) {
		this.vlrLaborDiag = vlrLaborDiag;
	}

	@Column(name = "VLR_MAT_MEDICOS", precision = 17, scale = 17)
	public Double getVlrMatMedicos() {
		return this.vlrMatMedicos;
	}

	public void setVlrMatMedicos(Double vlrMatMedicos) {
		this.vlrMatMedicos = vlrMatMedicos;
	}

	@Column(name = "VLR_MEDICAMENTO", precision = 17, scale = 17)
	public Double getVlrMedicamento() {
		return this.vlrMedicamento;
	}

	public void setVlrMedicamento(Double vlrMedicamento) {
		this.vlrMedicamento = vlrMedicamento;
	}

	@Column(name = "VLR_OPME", precision = 17, scale = 17)
	public Double getVlrOpme() {
		return this.vlrOpme;
	}

	public void setVlrOpme(Double vlrOpme) {
		this.vlrOpme = vlrOpme;
	}

	@Column(name = "VLR_SND", precision = 17, scale = 17)
	public Double getVlrSnd() {
		return this.vlrSnd;
	}

	public void setVlrSnd(Double vlrSnd) {
		this.vlrSnd = vlrSnd;
	}

	@Column(name = "VLR_OUTROS", precision = 17, scale = 17)
	public Double getVlrOutros() {
		return this.vlrOutros;
	}

	public void setVlrOutros(Double vlrOutros) {
		this.vlrOutros = vlrOutros;
	}

	@Column(name = "VLR_ROUPARIA", precision = 17, scale = 17)
	public Double getVlrRouparia() {
		return this.vlrRouparia;
	}

	public void setVlrRouparia(Double vlrRouparia) {
		this.vlrRouparia = vlrRouparia;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		DT_COMPETENCIA("dtCompetencia"),
		ATI_SEQ("atiSeq"),
		ITEM_DESCRICAO("itemDescricao"),
		CDR_SEQ("cdrSeq"),
		GCC_FORNECEDOR("gccFornecedor"),
		GCC_CTRO_PRODUCAO("gccCtroProducao"),
		VALOR("valor"),
		QTDE("qtde"),
		VLR_COMBUSTIVEIS("vlrCombustiveis"),
		VLR_ENGENHARIA("vlrEngenharia"),
		VLR_ESCRITORIO("vlrEscritorio"),
		VLR_GASES("vlrGases"),
		VLR_HIGIENE("vlrHigiene"),
		VLR_LABOR_DIAG("vlrLaborDiag"),
		VLR_MAT_MEDICOS("vlrMatMedicos"),
		VLR_MEDICAMENTO("vlrMedicamento"),
		VLR_OPME("vlrOpme"),
		VLR_SND("vlrSnd"),
		VLR_OUTROS("vlrOutros"),
		VLR_ROUPARIA("vlrRouparia");

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
		if (!(obj instanceof FcuGrupoDespAtividade)) {
			return false;
		}
		FcuGrupoDespAtividade other = (FcuGrupoDespAtividade) obj;
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
