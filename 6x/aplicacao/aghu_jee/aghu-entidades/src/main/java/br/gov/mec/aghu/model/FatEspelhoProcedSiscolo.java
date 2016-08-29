package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

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


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatEspelhoProcedSiscolos generated by hbm2java
 */
@Entity
@Table(name = "FAT_ESPELHO_PROCED_SISCOLOS", schema = "AGH")
public class FatEspelhoProcedSiscolo extends BaseEntityId<FatEspelhoProcedSiscoloId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4678043903397710434L;
	private FatEspelhoProcedSiscoloId id;
	private FatCompetencia fatCompetencia;

	public FatEspelhoProcedSiscolo() {
	}

	public FatEspelhoProcedSiscolo(FatEspelhoProcedSiscoloId id,
			FatCompetencia fatCompetencia) {
		this.id = id;
		this.fatCompetencia = fatCompetencia;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "prontuario", column = @Column(name = "PRONTUARIO", precision = 8, scale = 0)),
			@AttributeOverride(name = "nome", column = @Column(name = "NOME", length = 50)),
			@AttributeOverride(name = "nomeMae", column = @Column(name = "NOME_MAE", length = 50)),
			@AttributeOverride(name = "rg", column = @Column(name = "RG", precision = 10, scale = 0)),
			@AttributeOverride(name = "orgaoEmisRg", column = @Column(name = "ORGAO_EMIS_RG", length = 10)),
			@AttributeOverride(name = "ufEmisRg", column = @Column(name = "UF_EMIS_RG", length = 2)),
			@AttributeOverride(name = "cpf", column = @Column(name = "CPF", precision = 11, scale = 0)),
			@AttributeOverride(name = "dtNascimento", column = @Column(name = "DT_NASCIMENTO", length = 7)),
			@AttributeOverride(name = "idade", column = @Column(name = "IDADE", precision = 2, scale = 0)),
			@AttributeOverride(name = "logradouro", column = @Column(name = "LOGRADOURO", length = 35)),
			@AttributeOverride(name = "nroLogradouro", column = @Column(name = "NRO_LOGRADOURO", precision = 5, scale = 0)),
			@AttributeOverride(name = "complLogradouro", column = @Column(name = "COMPL_LOGRADOURO", length = 10)),
			@AttributeOverride(name = "bairro", column = @Column(name = "BAIRRO", length = 20)),
			@AttributeOverride(name = "codIbge", column = @Column(name = "COD_IBGE", precision = 8, scale = 0)),
			@AttributeOverride(name = "uf", column = @Column(name = "UF", length = 2)),
			@AttributeOverride(name = "raca", column = @Column(name = "RACA", precision = 2, scale = 0)),
			@AttributeOverride(name = "telefone", column = @Column(name = "TELEFONE", length = 11)),
			@AttributeOverride(name = "cep", column = @Column(name = "CEP", precision = 8, scale = 0)),
			@AttributeOverride(name = "grauInstrucao", column = @Column(name = "GRAU_INSTRUCAO", precision = 1, scale = 0)),
			@AttributeOverride(name = "citolAnterior", column = @Column(name = "CITOL_ANTERIOR", length = 13)),
			@AttributeOverride(name = "tpCitAnterior", column = @Column(name = "TP_CIT_ANTERIOR", precision = 2, scale = 0)),
			@AttributeOverride(name = "infCl22", column = @Column(name = "INF_CL_22", length = 1)),
			@AttributeOverride(name = "infCl23", column = @Column(name = "INF_CL_23", length = 1)),
			@AttributeOverride(name = "infCl24", column = @Column(name = "INF_CL_24", length = 1)),
			@AttributeOverride(name = "infCl25", column = @Column(name = "INF_CL_25", length = 1)),
			@AttributeOverride(name = "inspecaoColo", column = @Column(name = "INSPECAO_COLO", length = 1)),
			@AttributeOverride(name = "dtUltMenstruacao", column = @Column(name = "DT_ULT_MENSTRUACAO", length = 7)),
			@AttributeOverride(name = "dtColeta", column = @Column(name = "DT_COLETA", length = 7)),
			@AttributeOverride(name = "cgcHcpa", column = @Column(name = "CGC_HCPA", precision = 14, scale = 0)),
			@AttributeOverride(name = "dtRecebimento", column = @Column(name = "DT_RECEBIMENTO", length = 7)),
			@AttributeOverride(name = "nroSolicitacao", column = @Column(name = "NRO_SOLICITACAO", precision = 8, scale = 0)),
			@AttributeOverride(name = "normal", column = @Column(name = "NORMAL", length = 1)),
			@AttributeOverride(name = "alter03", column = @Column(name = "ALTER_03", length = 1)),
			@AttributeOverride(name = "alter04", column = @Column(name = "ALTER_04", length = 1)),
			@AttributeOverride(name = "alter05", column = @Column(name = "ALTER_05", length = 1)),
			@AttributeOverride(name = "alter06", column = @Column(name = "ALTER_06", length = 1)),
			@AttributeOverride(name = "alter07", column = @Column(name = "ALTER_07", length = 1)),
			@AttributeOverride(name = "micro09", column = @Column(name = "MICRO_09", length = 1)),
			@AttributeOverride(name = "micro10", column = @Column(name = "MICRO_10", length = 1)),
			@AttributeOverride(name = "micro11", column = @Column(name = "MICRO_11", length = 1)),
			@AttributeOverride(name = "micro12", column = @Column(name = "MICRO_12", length = 1)),
			@AttributeOverride(name = "micro13", column = @Column(name = "MICRO_13", length = 1)),
			@AttributeOverride(name = "micro14", column = @Column(name = "MICRO_14", length = 1)),
			@AttributeOverride(name = "micro15", column = @Column(name = "MICRO_15", length = 1)),
			@AttributeOverride(name = "micro16", column = @Column(name = "MICRO_16", length = 1)),
			@AttributeOverride(name = "micro17", column = @Column(name = "MICRO_17", length = 1)),
			@AttributeOverride(name = "alter19", column = @Column(name = "ALTER_19", length = 1)),
			@AttributeOverride(name = "alter20", column = @Column(name = "ALTER_20", length = 1)),
			@AttributeOverride(name = "alter21", column = @Column(name = "ALTER_21", length = 1)),
			@AttributeOverride(name = "celGlandulares", column = @Column(name = "CEL_GLANDULARES", length = 1)),
			@AttributeOverride(name = "celEndometriais", column = @Column(name = "CEL_ENDOMETRIAIS", length = 1)),
			@AttributeOverride(name = "amostra", column = @Column(name = "AMOSTRA", length = 2)),
			@AttributeOverride(name = "dtLiberacao", column = @Column(name = "DT_LIBERACAO", length = 7)),
			@AttributeOverride(name = "cpfResponsavel", column = @Column(name = "CPF_RESPONSAVEL", precision = 11, scale = 0)),
			@AttributeOverride(name = "cartaoSus", column = @Column(name = "CARTAO_SUS", precision = 15, scale = 0)),
			@AttributeOverride(name = "dataPrevia", column = @Column(name = "DATA_PREVIA", length = 7)),
			@AttributeOverride(name = "prevCancer", column = @Column(name = "PREV_CANCER", length = 1)),
			@AttributeOverride(name = "prevAnoMes", column = @Column(name = "PREV_ANO_MES", length = 7)),
			@AttributeOverride(name = "usaPilula", column = @Column(name = "USA_PILULA", length = 1)),
			@AttributeOverride(name = "palpaMamas", column = @Column(name = "PALPA_MAMAS", length = 1)),
			@AttributeOverride(name = "parenteCancer", column = @Column(name = "PARENTE_CANCER", length = 1)),
			@AttributeOverride(name = "sangueRsex", column = @Column(name = "SANGUE_RSEX", length = 1)),
			@AttributeOverride(name = "sangueAposMeno", column = @Column(name = "SANGUE_APOS_MENO", length = 1)),
			@AttributeOverride(name = "exameMamas", column = @Column(name = "EXAME_MAMAS", length = 1)),
			@AttributeOverride(name = "exMamasAnoMes", column = @Column(name = "EX_MAMAS_ANO_MES", length = 7)),
			@AttributeOverride(name = "adequabilidade", column = @Column(name = "ADEQUABILIDADE", precision = 3, scale = 0)),
			@AttributeOverride(name = "limiteNormal", column = @Column(name = "LIMITE_NORMAL", length = 1)),
			@AttributeOverride(name = "dst", column = @Column(name = "DST", length = 1)),
			@AttributeOverride(name = "exClinicoMamas", column = @Column(name = "EX_CLINICO_MAMAS", length = 1)),
			@AttributeOverride(name = "noduloMamaMd", column = @Column(name = "NODULO_MAMA_MD", length = 1)),
			@AttributeOverride(name = "noduloMamaMe", column = @Column(name = "NODULO_MAMA_ME", length = 1)),
			@AttributeOverride(name = "exClinMamasMd", column = @Column(name = "EX_CLIN_MAMAS_MD", length = 1)),
			@AttributeOverride(name = "exClinMamasMe", column = @Column(name = "EX_CLIN_MAMAS_ME", length = 1)),
			@AttributeOverride(name = "encMamografia", column = @Column(name = "ENC_MAMOGRAFIA", length = 1)),
			@AttributeOverride(name = "encConsultaMama", column = @Column(name = "ENC_CONSULTA_MAMA", length = 1)),
			@AttributeOverride(name = "encConsultaColo", column = @Column(name = "ENC_CONSULTA_COLO", length = 1)),
			@AttributeOverride(name = "nroExame", column = @Column(name = "NRO_EXAME", precision = 14, scale = 0)),
			@AttributeOverride(name = "pmrSeq", column = @Column(name = "PMR_SEQ", precision = 10, scale = 0)),
			@AttributeOverride(name = "cpeDtHrInicio", column = @Column(name = "CPE_DT_HR_INICIO", nullable = false, length = 7)),
			@AttributeOverride(name = "cpeModulo", column = @Column(name = "CPE_MODULO", nullable = false, length = 4)),
			@AttributeOverride(name = "cpeMes", column = @Column(name = "CPE_MES", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "cpeAno", column = @Column(name = "CPE_ANO", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "unfSeq", column = @Column(name = "UNF_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "iphPhoSeq", column = @Column(name = "IPH_PHO_SEQ", precision = 4, scale = 0)),
			@AttributeOverride(name = "iphSeq", column = @Column(name = "IPH_SEQ", precision = 8, scale = 0)),
			@AttributeOverride(name = "vlrProc", column = @Column(name = "VLR_PROC", precision = 14)),
			@AttributeOverride(name = "vlrSadt", column = @Column(name = "VLR_SADT", precision = 14)),
			@AttributeOverride(name = "vlrServHosp", column = @Column(name = "VLR_SERV_HOSP", precision = 14)),
			@AttributeOverride(name = "vlrServProf", column = @Column(name = "VLR_SERV_PROF", precision = 14)),
			@AttributeOverride(name = "vlrAnest", column = @Column(name = "VLR_ANEST", precision = 14)),
			@AttributeOverride(name = "criadoEm", column = @Column(name = "CRIADO_EM", length = 7)),
			@AttributeOverride(name = "criadoPor", column = @Column(name = "CRIADO_POR", length = 30)),
			@AttributeOverride(name = "codTabela", column = @Column(name = "COD_TABELA", precision = 10, scale = 0)),
			@AttributeOverride(name = "indConsistente", column = @Column(name = "IND_CONSISTENTE", length = 1)),
			@AttributeOverride(name = "fccSeq", column = @Column(name = "FCC_SEQ", precision = 5, scale = 0)),
			@AttributeOverride(name = "fcfSeq", column = @Column(name = "FCF_SEQ", precision = 5, scale = 0)),
			@AttributeOverride(name = "CRejAus", column = @Column(name = "C_REJ_AUS", length = 1)),
			@AttributeOverride(name = "CRejDan", column = @Column(name = "C_REJ_DAN", length = 1)),
			@AttributeOverride(name = "CRejAlh", column = @Column(name = "C_REJ_ALH", length = 1)),
			@AttributeOverride(name = "CRejAesp", column = @Column(name = "C_REJ_AESP", length = 40)),
			@AttributeOverride(name = "CRejOut", column = @Column(name = "C_REJ_OUT", length = 1)),
			@AttributeOverride(name = "CRejOesp", column = @Column(name = "C_REJ_OESP", length = 40)),
			@AttributeOverride(name = "CAdqMat", column = @Column(name = "C_ADQ_MAT", length = 1)),
			@AttributeOverride(name = "CAdqAcel", column = @Column(name = "C_ADQ_ACEL", length = 1)),
			@AttributeOverride(name = "CAdqSang", column = @Column(name = "C_ADQ_SANG", length = 1)),
			@AttributeOverride(name = "CAdqPio", column = @Column(name = "C_ADQ_PIO", length = 1)),
			@AttributeOverride(name = "CAdqArt", column = @Column(name = "C_ADQ_ART", length = 1)),
			@AttributeOverride(name = "CAdqInt", column = @Column(name = "C_ADQ_INT", length = 1)),
			@AttributeOverride(name = "CAdqOut", column = @Column(name = "C_ADQ_OUT", length = 1)),
			@AttributeOverride(name = "CBemOut", column = @Column(name = "C_BEM_OUT", length = 1)),
			@AttributeOverride(name = "CBemOutr", column = @Column(name = "C_BEM_OUTR", length = 40)),
			@AttributeOverride(name = "CEpiEsc", column = @Column(name = "C_EPI_ESC", length = 1)),
			@AttributeOverride(name = "CEpiGla", column = @Column(name = "C_EPI_GLA", length = 1)),
			@AttributeOverride(name = "CEpiMet", column = @Column(name = "C_EPI_MET", length = 1)),
			@AttributeOverride(name = "CAtiEsc", column = @Column(name = "C_ATI_ESC", length = 1)),
			@AttributeOverride(name = "CAtiGla", column = @Column(name = "C_ATI_GLA", length = 1)),
			@AttributeOverride(name = "CAtiInd", column = @Column(name = "C_ATI_IND", length = 1)),
			@AttributeOverride(name = "CCelEsca", column = @Column(name = "C_CEL_ESCA", length = 1)),
			@AttributeOverride(name = "CGlaAden", column = @Column(name = "C_GLA_ADEN", length = 1)),
			@AttributeOverride(name = "CNeoMali", column = @Column(name = "C_NEO_MALI", length = 1)),
			@AttributeOverride(name = "CNeoMout", column = @Column(name = "C_NEO_MOUT", length = 40)),
			@AttributeOverride(name = "CObsGer", column = @Column(name = "C_OBS_GER", length = 10)),
			@AttributeOverride(name = "CMicOut", column = @Column(name = "C_MIC_OUT", length = 1)),
			@AttributeOverride(name = "CMicOutr", column = @Column(name = "C_MIC_OUTR", length = 40)),
			@AttributeOverride(name = "CAdqCont", column = @Column(name = "C_ADQ_CONT", length = 1)),
			@AttributeOverride(name = "CCelEndo", column = @Column(name = "C_CEL_ENDO", length = 1)) })
	public FatEspelhoProcedSiscoloId getId() {
		return this.id;
	}

	public void setId(FatEspelhoProcedSiscoloId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "CPE_MODULO", referencedColumnName = "MODULO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CPE_MES", referencedColumnName = "MES", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CPE_ANO", referencedColumnName = "ANO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CPE_DT_HR_INICIO", referencedColumnName = "DT_HR_INICIO", nullable = false, insertable = false, updatable = false) })
	public FatCompetencia getFatCompetencia() {
		return this.fatCompetencia;
	}

	public void setFatCompetencia(FatCompetencia fatCompetencia) {
		this.fatCompetencia = fatCompetencia;
	}

	public enum Fields {

		ID("id"),
		CPE_MODULO("id.cpeModulo"),
		CPE_MES("id.cpeMes"),
		CPE_ANO("id.cpeAno"),
		CPE_DT_HR_INICIO("id.cpeDtHrInicio"),
		DATA_PREVIA("id.dataPrevia"),
		FAT_COMPETENCIA("fatCompetencia"), 
		PMR_SEQ("id.pmrSeq"), 
		UNF_SEQ("id.unfSeq");

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
		if (!(obj instanceof FatEspelhoProcedSiscolo)) {
			return false;
		}
		FatEspelhoProcedSiscolo other = (FatEspelhoProcedSiscolo) obj;
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
