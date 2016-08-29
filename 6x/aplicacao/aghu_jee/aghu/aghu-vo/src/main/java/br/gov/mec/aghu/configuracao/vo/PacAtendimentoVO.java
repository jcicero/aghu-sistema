package br.gov.mec.aghu.configuracao.vo;

import java.util.Date;

import br.gov.mec.aghu.core.commons.BaseBean;

/**
 * @author israel.haas
 * 
 */
public class PacAtendimentoVO implements BaseBean {

	private static final long serialVersionUID = -6699757543577462874L;
	
	private Date dtConsulta;
	private Integer atdSeq;
	private Integer atdSerMatricula;
	private Short atdSerVinCodigo;
	private Short atdUnfSeq;
	private Short espSeq;
	private String espSigla;
	
	public Date getDtConsulta() {
		return dtConsulta;
	}

	public void setDtConsulta(Date dtConsulta) {
		this.dtConsulta = dtConsulta;
	}

	public Integer getAtdSeq() {
		return atdSeq;
	}

	public void setAtdSeq(Integer atdSeq) {
		this.atdSeq = atdSeq;
	}

	public Integer getAtdSerMatricula() {
		return atdSerMatricula;
	}

	public void setAtdSerMatricula(Integer atdSerMatricula) {
		this.atdSerMatricula = atdSerMatricula;
	}

	public Short getAtdSerVinCodigo() {
		return atdSerVinCodigo;
	}

	public void setAtdSerVinCodigo(Short atdSerVinCodigo) {
		this.atdSerVinCodigo = atdSerVinCodigo;
	}

	public Short getAtdUnfSeq() {
		return atdUnfSeq;
	}

	public void setAtdUnfSeq(Short atdUnfSeq) {
		this.atdUnfSeq = atdUnfSeq;
	}

	public Short getEspSeq() {
		return espSeq;
	}

	public void setEspSeq(Short espSeq) {
		this.espSeq = espSeq;
	}

	public String getEspSigla() {
		return espSigla;
	}

	public void setEspSigla(String espSigla) {
		this.espSigla = espSigla;
	}
}
