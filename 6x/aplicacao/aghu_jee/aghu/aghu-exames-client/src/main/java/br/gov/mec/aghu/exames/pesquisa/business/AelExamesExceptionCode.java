package br.gov.mec.aghu.exames.pesquisa.business;

import br.gov.mec.aghu.core.exception.ApplicationBusinessException;
import br.gov.mec.aghu.core.exception.BusinessExceptionCode;

public enum AelExamesExceptionCode implements BusinessExceptionCode {
		AEL_00351, AEL_00369, AEL_00343, AEL_00344, CHK_AEL_EXAMES_MPA_POP_EXAMES
		, CHK_AEL_EXAMES_AEL_ORD_EXAME_MAT_ANALISES, CHK_AEL_EXAMES_MPA_CAD_ORD_ITEM_EXAMES
		, CHK_AEL_EXAMES_AEL_EXAMES_MATERIAL_ANALISE
		, CHK_AEL_EXAMES_AEL_ITEM_SOLICITACAO_EXAMES, CHK_AEL_EXAMES_AEL_UNF_EXECUTA_EXAMES
		, CHK_AEL_EXAMES_AEL_GRADE_AGENDA_EXAMES, AEL_EMA_EXA_FK1;
		
		/*
		AEL_00351,AEL_00369,AEL_00343,AEL_00344,CHK_AEL_EXAMES_MPA_POP_EXAMES,
		CHK_AEL_EXAMES_AEL_ORD_EXAME_MAT_ANALISES,CHK_AEL_EXAMES_MPA_CAD_ORD_ITEM_EXAMES,
		CHK_AEL_EXAMES_AEL_EXAMES_MATERIAL_ANALISE,CHK_AEL_EXAMES_AEL_TMP_PESQ_EXAMES,
		CHK_AEL_EXAMES_AEL_ITEM_SOLICITACAO_EXAMES,CHK_AEL_EXAMES_AEL_UNF_EXECUTA_EXAMES,
		CHK_AEL_EXAMES_AEL_GRADE_AGENDA_EXAMES,AEL_EMA_EXA_FK1;
		*/		

		public void throwException() throws ApplicationBusinessException {
			throw new ApplicationBusinessException(this);
		}

}
