package br.gov.mec.aghu.emergencia.vo;

import java.io.Serializable;
import java.util.Date;

import br.gov.mec.aghu.dominio.DominioPacAtendimento;
import br.gov.mec.aghu.dominio.DominioTipoMovimento;

public class PacientesAguardandoAtendimentoVO implements Serializable {

	private static final long serialVersionUID = -3719423092534467385L;
	/**
	 * 
	 */
	private Long trgSeq;
	private Integer pacCodigo;
	private Short segSeq;
	private DominioPacAtendimento indPacAtendimento;
	private Boolean indPacEmergencia;
	private Short unfSeq;
	private DominioTipoMovimento ultTipoMvt;
	private Date dthrUltMvto;
	private Boolean indImediato;
	private Date dthrPrevAtend;
	private Short seqp;
	private Integer conNumero;
	private Date dthrEstorno;
	private Integer pacNumero;
	private String pacNome;
	private Integer pacProntuario;
	private Date pacDtNascimento;
	private Short espSeq;
	private String espSigla;
	private Date dthrInicio;
	private Integer grdSeq;
	private Integer atdSeq;
	
	
	public Integer getPacNumero() {
		return pacNumero;
	}
	public void setPacNumero(Integer pacNumero) {
		this.pacNumero = pacNumero;
	}
	public String getPacNome() {
		return pacNome;
	}
	public void setPacNome(String pacNome) {
		this.pacNome = pacNome;
	}
	public Date getPacDtNascimento() {
		return pacDtNascimento;
	}
	public void setPacDtNascimento(Date pacDtNascimento) {
		this.pacDtNascimento = pacDtNascimento;
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
	public Date getDthrInicio() {
		return dthrInicio;
	}
	public void setDthrInicio(Date dthrInicio) {
		this.dthrInicio = dthrInicio;
	}
	public Integer getGrdSeq() {
		return grdSeq;
	}
	public void setGrdSeq(Integer grdSeq) {
		this.grdSeq = grdSeq;
	}
	public Integer getAtdSeq() {
		return atdSeq;
	}
	public void setAtdSeq(Integer atdSeq) {
		this.atdSeq = atdSeq;
	}
	public Long getTrgSeq() {
		return trgSeq;
	}
	public void setTrgSeq(Long trgSeq) {
		this.trgSeq = trgSeq;
	}
	public Integer getPacCodigo() {
		return pacCodigo;
	}
	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}
	public Short getSegSeq() {
		return segSeq;
	}
	public void setSegSeq(Short segSeq) {
		this.segSeq = segSeq;
	}
	public DominioPacAtendimento getIndPacAtendimento() {
		return indPacAtendimento;
	}
	public void setIndPacAtendimento(DominioPacAtendimento indPacAtendimento) {
		this.indPacAtendimento = indPacAtendimento;
	}
	public Boolean getIndPacEmergencia() {
		return indPacEmergencia;
	}
	public void setIndPacEmergencia(Boolean indPacEmergencia) {
		this.indPacEmergencia = indPacEmergencia;
	}
	public Short getUnfSeq() {
		return unfSeq;
	}
	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}
	public DominioTipoMovimento getUltTipoMvt() {
		return ultTipoMvt;
	}
	public void setUltTipoMvt(DominioTipoMovimento ultTipoMvt) {
		this.ultTipoMvt = ultTipoMvt;
	}
	public Date getDthrUltMvto() {
		return dthrUltMvto;
	}
	public void setDthrUltMvto(Date dthrUltMvto) {
		this.dthrUltMvto = dthrUltMvto;
	}
	public Boolean getIndImediato() {
		return indImediato;
	}
	public void setIndImediato(Boolean indImediato) {
		this.indImediato = indImediato;
	}
	public Date getDthrPrevAtend() {
		return dthrPrevAtend;
	}
	public void setDthrPrevAtend(Date dthrPrevAtend) {
		this.dthrPrevAtend = dthrPrevAtend;
	}
	public Short getSeqp() {
		return seqp;
	}
	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}
	public Integer getConNumero() {
		return conNumero;
	}
	public void setConNumero(Integer conNumero) {
		this.conNumero = conNumero;
	}
	public Date getDthrEstorno() {
		return dthrEstorno;
	}
	public void setDthrEstorno(Date dthrEstorno) {
		this.dthrEstorno = dthrEstorno;
	}
	
	public Integer getPacProntuario() {
		return pacProntuario;
	}
	public void setPacProntuario(Integer pacProntuario) {
		this.pacProntuario = pacProntuario;
	}

	public enum Fields {
		TRG_SEQ("trgSeq"),
		PAC_CODIGO("pacCodigo"),		
		IND_PAC_ATENDIMENTO("indPacAtendimento"),
		IND_PAC_EMERGENCIA("indPacEmergencia"),
		UNF_SEQ("unfSeq"),
		ULT_TIPO_MVT("ultTipoMvt"),
		DTHR_ULT_MVTO("dthrUltMvto"),
		IND_IMEDIATO("indImediato"),
		DTHR_PREV_ATEND("dthrPrevAtend"),
		SEQP("seqp"),
		CON_NUMERO("conNumero"),
		DTHR_ESTORNO("dthrEstorno"),
		SEG_SEQ("segSeq");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}	
	
}
