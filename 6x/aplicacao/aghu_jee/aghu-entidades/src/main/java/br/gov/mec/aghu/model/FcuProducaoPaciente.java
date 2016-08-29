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
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * FcuProducaoPaciente generated by hbm2java
 */
@Entity
@SequenceGenerator(name="fcuPpcSq1", sequenceName="AGH.FCU_PPC_SQ1", allocationSize = 1)
@Table(name = "FCU_PRODUCAO_PACIENTES", schema = "AGH")
public class FcuProducaoPaciente extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6217106418795671943L;
	private Integer seq;
	private Integer version;
	private FcuAtividade fcuAtividade;
	private Date dtCompetencia;
	private Short ftdSeq;
	private String itemDescricao;
	private Short gccCtroProducao;
	private Double qtde;
	private Double peso;
	private String calculaCusto;
	private Short espSeq;
	private Short unfSeq;
	private Integer pacCodigo;
	private Integer atdSeq;
	private Short cnvCodigo;
	private Integer cctCodigo;
	private Integer serMatriculaProf;
	private Short serVinCodigoProf;
	private String cidSeq;
	private Integer atvSeq;
	private Integer atuSeq;
	private Short cpcSeq;
	private Short gcdSeq;
	private Double vlrCustoDireto;
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
	private Double vlrCustoIndireto;
	private Integer leitoDia;
	private Integer ssmCodigo;
	private Short serVinCodigo;
	private Integer serMatricula;
	private String tipoPrescricao;
	private String tipoEntrPaciente;
	private String descricao;
	private Short fatGrpCodigo;
	private Short fatSgrCodigo;
	private Short fatFogCodigo;
	private String diversasContas;

	public FcuProducaoPaciente() {
	}

	public FcuProducaoPaciente(Integer seq, FcuAtividade fcuAtividade, Date dtCompetencia, Short ftdSeq, Short gccCtroProducao) {
		this.seq = seq;
		this.fcuAtividade = fcuAtividade;
		this.dtCompetencia = dtCompetencia;
		this.ftdSeq = ftdSeq;
		this.gccCtroProducao = gccCtroProducao;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public FcuProducaoPaciente(Integer seq, FcuAtividade fcuAtividade, Date dtCompetencia, Short ftdSeq, String itemDescricao,
			Short gccCtroProducao, Double qtde, Double peso, String calculaCusto, Short espSeq, Short unfSeq, Integer pacCodigo,
			Integer atdSeq, Short cnvCodigo, Integer cctCodigo, Integer serMatriculaProf, Short serVinCodigoProf, String cidSeq,
			Integer atvSeq, Integer atuSeq, Short cpcSeq, Short gcdSeq, Double vlrCustoDireto, Double vlrCombustiveis,
			Double vlrEngenharia, Double vlrEscritorio, Double vlrGases, Double vlrHigiene, Double vlrLaborDiag, Double vlrMatMedicos,
			Double vlrMedicamento, Double vlrOpme, Double vlrSnd, Double vlrOutros, Double vlrRouparia, Double vlrCustoIndireto,
			Integer leitoDia, Integer ssmCodigo, Short serVinCodigo, Integer serMatricula, String tipoPrescricao,
			String tipoEntrPaciente, String descricao, Short fatGrpCodigo, Short fatSgrCodigo, Short fatFogCodigo,
			String diversasContas) {
		this.seq = seq;
		this.fcuAtividade = fcuAtividade;
		this.dtCompetencia = dtCompetencia;
		this.ftdSeq = ftdSeq;
		this.itemDescricao = itemDescricao;
		this.gccCtroProducao = gccCtroProducao;
		this.qtde = qtde;
		this.peso = peso;
		this.calculaCusto = calculaCusto;
		this.espSeq = espSeq;
		this.unfSeq = unfSeq;
		this.pacCodigo = pacCodigo;
		this.atdSeq = atdSeq;
		this.cnvCodigo = cnvCodigo;
		this.cctCodigo = cctCodigo;
		this.serMatriculaProf = serMatriculaProf;
		this.serVinCodigoProf = serVinCodigoProf;
		this.cidSeq = cidSeq;
		this.atvSeq = atvSeq;
		this.atuSeq = atuSeq;
		this.cpcSeq = cpcSeq;
		this.gcdSeq = gcdSeq;
		this.vlrCustoDireto = vlrCustoDireto;
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
		this.vlrCustoIndireto = vlrCustoIndireto;
		this.leitoDia = leitoDia;
		this.ssmCodigo = ssmCodigo;
		this.serVinCodigo = serVinCodigo;
		this.serMatricula = serMatricula;
		this.tipoPrescricao = tipoPrescricao;
		this.tipoEntrPaciente = tipoEntrPaciente;
		this.descricao = descricao;
		this.fatGrpCodigo = fatGrpCodigo;
		this.fatSgrCodigo = fatSgrCodigo;
		this.fatFogCodigo = fatFogCodigo;
		this.diversasContas = diversasContas;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "fcuPpcSq1")
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
	@JoinColumn(name = "ATI_SEQ", nullable = false)
	public FcuAtividade getFcuAtividade() {
		return this.fcuAtividade;
	}

	public void setFcuAtividade(FcuAtividade fcuAtividade) {
		this.fcuAtividade = fcuAtividade;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_COMPETENCIA", nullable = false, length = 29)
	public Date getDtCompetencia() {
		return this.dtCompetencia;
	}

	public void setDtCompetencia(Date dtCompetencia) {
		this.dtCompetencia = dtCompetencia;
	}

	@Column(name = "FTD_SEQ", nullable = false)
	public Short getFtdSeq() {
		return this.ftdSeq;
	}

	public void setFtdSeq(Short ftdSeq) {
		this.ftdSeq = ftdSeq;
	}

	@Column(name = "ITEM_DESCRICAO", length = 100)
	@Length(max = 100)
	public String getItemDescricao() {
		return this.itemDescricao;
	}

	public void setItemDescricao(String itemDescricao) {
		this.itemDescricao = itemDescricao;
	}

	@Column(name = "GCC_CTRO_PRODUCAO", nullable = false)
	public Short getGccCtroProducao() {
		return this.gccCtroProducao;
	}

	public void setGccCtroProducao(Short gccCtroProducao) {
		this.gccCtroProducao = gccCtroProducao;
	}

	@Column(name = "QTDE", precision = 17, scale = 17)
	public Double getQtde() {
		return this.qtde;
	}

	public void setQtde(Double qtde) {
		this.qtde = qtde;
	}

	@Column(name = "PESO", precision = 17, scale = 17)
	public Double getPeso() {
		return this.peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Column(name = "CALCULA_CUSTO", length = 1)
	@Length(max = 1)
	public String getCalculaCusto() {
		return this.calculaCusto;
	}

	public void setCalculaCusto(String calculaCusto) {
		this.calculaCusto = calculaCusto;
	}

	@Column(name = "ESP_SEQ")
	public Short getEspSeq() {
		return this.espSeq;
	}

	public void setEspSeq(Short espSeq) {
		this.espSeq = espSeq;
	}

	@Column(name = "UNF_SEQ")
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "PAC_CODIGO")
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "ATD_SEQ")
	public Integer getAtdSeq() {
		return this.atdSeq;
	}

	public void setAtdSeq(Integer atdSeq) {
		this.atdSeq = atdSeq;
	}

	@Column(name = "CNV_CODIGO")
	public Short getCnvCodigo() {
		return this.cnvCodigo;
	}

	public void setCnvCodigo(Short cnvCodigo) {
		this.cnvCodigo = cnvCodigo;
	}

	@Column(name = "CCT_CODIGO")
	public Integer getCctCodigo() {
		return this.cctCodigo;
	}

	public void setCctCodigo(Integer cctCodigo) {
		this.cctCodigo = cctCodigo;
	}

	@Column(name = "SER_MATRICULA_PROF")
	public Integer getSerMatriculaProf() {
		return this.serMatriculaProf;
	}

	public void setSerMatriculaProf(Integer serMatriculaProf) {
		this.serMatriculaProf = serMatriculaProf;
	}

	@Column(name = "SER_VIN_CODIGO_PROF")
	public Short getSerVinCodigoProf() {
		return this.serVinCodigoProf;
	}

	public void setSerVinCodigoProf(Short serVinCodigoProf) {
		this.serVinCodigoProf = serVinCodigoProf;
	}

	@Column(name = "CID_SEQ", length = 5)
	@Length(max = 5)
	public String getCidSeq() {
		return this.cidSeq;
	}

	public void setCidSeq(String cidSeq) {
		this.cidSeq = cidSeq;
	}

	@Column(name = "ATV_SEQ")
	public Integer getAtvSeq() {
		return this.atvSeq;
	}

	public void setAtvSeq(Integer atvSeq) {
		this.atvSeq = atvSeq;
	}

	@Column(name = "ATU_SEQ")
	public Integer getAtuSeq() {
		return this.atuSeq;
	}

	public void setAtuSeq(Integer atuSeq) {
		this.atuSeq = atuSeq;
	}

	@Column(name = "CPC_SEQ")
	public Short getCpcSeq() {
		return this.cpcSeq;
	}

	public void setCpcSeq(Short cpcSeq) {
		this.cpcSeq = cpcSeq;
	}

	@Column(name = "GCD_SEQ")
	public Short getGcdSeq() {
		return this.gcdSeq;
	}

	public void setGcdSeq(Short gcdSeq) {
		this.gcdSeq = gcdSeq;
	}

	@Column(name = "VLR_CUSTO_DIRETO", precision = 17, scale = 17)
	public Double getVlrCustoDireto() {
		return this.vlrCustoDireto;
	}

	public void setVlrCustoDireto(Double vlrCustoDireto) {
		this.vlrCustoDireto = vlrCustoDireto;
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

	@Column(name = "VLR_CUSTO_INDIRETO", precision = 17, scale = 17)
	public Double getVlrCustoIndireto() {
		return this.vlrCustoIndireto;
	}

	public void setVlrCustoIndireto(Double vlrCustoIndireto) {
		this.vlrCustoIndireto = vlrCustoIndireto;
	}

	@Column(name = "LEITO_DIA")
	public Integer getLeitoDia() {
		return this.leitoDia;
	}

	public void setLeitoDia(Integer leitoDia) {
		this.leitoDia = leitoDia;
	}

	@Column(name = "SSM_CODIGO")
	public Integer getSsmCodigo() {
		return this.ssmCodigo;
	}

	public void setSsmCodigo(Integer ssmCodigo) {
		this.ssmCodigo = ssmCodigo;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "TIPO_PRESCRICAO", length = 2)
	@Length(max = 2)
	public String getTipoPrescricao() {
		return this.tipoPrescricao;
	}

	public void setTipoPrescricao(String tipoPrescricao) {
		this.tipoPrescricao = tipoPrescricao;
	}

	@Column(name = "TIPO_ENTR_PACIENTE", length = 1)
	@Length(max = 1)
	public String getTipoEntrPaciente() {
		return this.tipoEntrPaciente;
	}

	public void setTipoEntrPaciente(String tipoEntrPaciente) {
		this.tipoEntrPaciente = tipoEntrPaciente;
	}

	@Column(name = "DESCRICAO", length = 100)
	@Length(max = 100)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "FAT_GRP_CODIGO")
	public Short getFatGrpCodigo() {
		return this.fatGrpCodigo;
	}

	public void setFatGrpCodigo(Short fatGrpCodigo) {
		this.fatGrpCodigo = fatGrpCodigo;
	}

	@Column(name = "FAT_SGR_CODIGO")
	public Short getFatSgrCodigo() {
		return this.fatSgrCodigo;
	}

	public void setFatSgrCodigo(Short fatSgrCodigo) {
		this.fatSgrCodigo = fatSgrCodigo;
	}

	@Column(name = "FAT_FOG_CODIGO")
	public Short getFatFogCodigo() {
		return this.fatFogCodigo;
	}

	public void setFatFogCodigo(Short fatFogCodigo) {
		this.fatFogCodigo = fatFogCodigo;
	}

	@Column(name = "DIVERSAS_CONTAS", length = 1)
	@Length(max = 1)
	public String getDiversasContas() {
		return this.diversasContas;
	}

	public void setDiversasContas(String diversasContas) {
		this.diversasContas = diversasContas;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		FCU_ATIVIDADES("fcuAtividade"),
		DT_COMPETENCIA("dtCompetencia"),
		FTD_SEQ("ftdSeq"),
		ITEM_DESCRICAO("itemDescricao"),
		GCC_CTRO_PRODUCAO("gccCtroProducao"),
		QTDE("qtde"),
		PESO("peso"),
		CALCULA_CUSTO("calculaCusto"),
		ESP_SEQ("espSeq"),
		UNF_SEQ("unfSeq"),
		PAC_CODIGO("pacCodigo"),
		ATD_SEQ("atdSeq"),
		CNV_CODIGO("cnvCodigo"),
		CCT_CODIGO("cctCodigo"),
		SER_MATRICULA_PROF("serMatriculaProf"),
		SER_VIN_CODIGO_PROF("serVinCodigoProf"),
		CID_SEQ("cidSeq"),
		ATV_SEQ("atvSeq"),
		ATU_SEQ("atuSeq"),
		CPC_SEQ("cpcSeq"),
		GCD_SEQ("gcdSeq"),
		VLR_CUSTO_DIRETO("vlrCustoDireto"),
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
		VLR_ROUPARIA("vlrRouparia"),
		VLR_CUSTO_INDIRETO("vlrCustoIndireto"),
		LEITO_DIA("leitoDia"),
		SSM_CODIGO("ssmCodigo"),
		SER_VIN_CODIGO("serVinCodigo"),
		SER_MATRICULA("serMatricula"),
		TIPO_PRESCRICAO("tipoPrescricao"),
		TIPO_ENTR_PACIENTE("tipoEntrPaciente"),
		DESCRICAO("descricao"),
		FAT_GRP_CODIGO("fatGrpCodigo"),
		FAT_SGR_CODIGO("fatSgrCodigo"),
		FAT_FOG_CODIGO("fatFogCodigo"),
		DIVERSAS_CONTAS("diversasContas");

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
		if (!(obj instanceof FcuProducaoPaciente)) {
			return false;
		}
		FcuProducaoPaciente other = (FcuProducaoPaciente) obj;
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
