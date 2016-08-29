package br.gov.mec.aghu.dominio;

import br.gov.mec.aghu.core.dominio.Dominio;

public enum DominioSituacaoSaps3 implements Dominio {
	
	/**
	 * Pendente
	 */
	P,
	/**
	 * Efetivada
	 */
	E,
	/**
	 * Isenta por saída da CTI antes 24 horas
	 */
	A;

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
			return "Efetivada";
		case A:
			return "Isenta por saída da CTI antes 24 horas";
		default:
			return "";
		}
	}
}
