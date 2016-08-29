package br.gov.mec.aghu.registrocolaborador.exceptioncode;

import br.gov.mec.aghu.core.exception.BusinessExceptionCode;

public enum ServidorRNExceptionCode implements BusinessExceptionCode {
	
	MENSAGEM_VINCULO_INATIVO, MENSAGEM_INFORMAR_HORARIO, MENSAGEM_INFORMAR_OCUPACAO,
	MENSAGEM_DATA_INICIO_SUPERIOR, MENSAGEM_DATA_INICIO_POSTERIOR_DATA_ATUAL,
	MENSAGEM_DATA_FIM_ANTERIOR_DATA_INICIO, MENSAGEM_DATA_TERMINO_OBRIGATORIA,
	MENSAGEM_CENTRO_CUSTO_LOTACAO_INATIVO, MENSAGEM_CENTRO_CUSTO_ATUACAO_INATIVO,		
	MENSAGEM_CENTRO_CUSTO_SEM_ORGANOGRAMA, MENSAGEM_VINCULO_CONTROLADO_STARH,
	MENSAGEM_USUARIO_SEM_PERMISSAO_ALTERAR_SERVIDOR, MENSAGEM_GPPG_SEM_PERMISSAO_ALTERAR,
	MENSAGEM_INCLUSAO_VINCULO_CONTROLADO_STARH, MENSAGEM_PROBLEMA_GERACAO_MATRICULA,
	MENSAGEM_DATA_NASCIMENTO_SUPERIOR_DATA_ATUAL, MENSAGEM_DATA_INICIO_POSTERIOR_DATA_FIM,
	MENSAGEM_EXCLUSAO_DATA_FIM_VINCULO, MENSAGEM_EXIGE_CPF_RG, MENSAGEM_PESSOA_FISICA_OBRIGATORIO,
	MENSAGEM_VINCULO_OBRIGATORIO, MENSAGEM_CC_LOTACAO_OBRIGATORIO, MENSAGEM_INFORMAR_CCUSTO_LOTACAO,
	MENSAGEM_SERVIDOR_MATRICULA_NULA, SERVIDOR_ID_DUPLICADO
	;		


}
