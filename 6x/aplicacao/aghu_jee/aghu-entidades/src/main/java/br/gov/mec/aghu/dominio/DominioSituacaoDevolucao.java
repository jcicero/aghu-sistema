package br.gov.mec.aghu.dominio;

import br.gov.mec.aghu.core.dominio.Dominio;

public enum DominioSituacaoDevolucao implements Dominio{
	/**
	 *  P – Devolução Pendente
	 *	E - Devolução Encerrada
	 */
	P,
	E;

	@Override
	public int getCodigo() {
		return this.ordinal();
	}

	@Override
	public String getDescricao() {
		switch (this) {
		case P:
			return "Pendente";
		case E:
			return "Encerrada";
		default:
			return "";
		}
	}
}
