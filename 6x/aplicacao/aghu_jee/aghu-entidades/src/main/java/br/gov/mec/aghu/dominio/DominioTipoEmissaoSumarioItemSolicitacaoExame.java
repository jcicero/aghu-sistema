package br.gov.mec.aghu.dominio;

import br.gov.mec.aghu.core.dominio.Dominio;

/**
 * Tipo Emissao Sumario da entidade AelItemSolicitacaoExames.
 * 
 * @author rcorvalao
 *
 */
public enum DominioTipoEmissaoSumarioItemSolicitacaoExame implements Dominio {
	A, I, M, S
	;

	@Override
	public int getCodigo() {
		return this.ordinal();
	}

	@Override
	public String getDescricao() {
		return this.toString();
	}

}
