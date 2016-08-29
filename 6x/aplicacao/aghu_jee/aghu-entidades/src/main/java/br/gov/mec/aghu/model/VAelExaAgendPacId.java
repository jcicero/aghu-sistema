package br.gov.mec.aghu.model;

// Generated 21/06/2012 16:43:58 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.hibernate.validator.constraints.Length;

/**
 * VAelExaAgendPacId generated by hbm2java
 */
@Embeddable
public class VAelExaAgendPacId implements java.io.Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -701809334340403703L;
	private Integer pacCodigo;
	private Integer iseSoeSeq;
	private Date hedDthrAgenda;
	private String exaSigla;
	private Integer manSeq;
	private Short unfSeq;
	private String descricaoExame;
	private Integer iseSolicitacao;
	private Short hedGaeUnfSeq;
	private Integer hedGaeSeqp;
	private Date dataSolic;

	public VAelExaAgendPacId() {
	}

	public VAelExaAgendPacId(Integer pacCodigo, Integer iseSoeSeq, Date hedDthrAgenda,
			String exaSigla, Integer manSeq, Short unfSeq, String descricaoExame,
			Integer iseSolicitacao, Short hedGaeUnfSeq, Integer hedGaeSeqp,
			Date dataSolic) {
		this.pacCodigo = pacCodigo;
		this.iseSoeSeq = iseSoeSeq;
		this.hedDthrAgenda = hedDthrAgenda;
		this.exaSigla = exaSigla;
		this.manSeq = manSeq;
		this.unfSeq = unfSeq;
		this.descricaoExame = descricaoExame;
		this.iseSolicitacao = iseSolicitacao;
		this.hedGaeUnfSeq = hedGaeUnfSeq;
		this.hedGaeSeqp = hedGaeSeqp;
		this.dataSolic = dataSolic;
	}

	@Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "ISE_SOE_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getIseSoeSeq() {
		return this.iseSoeSeq;
	}

	public void setIseSoeSeq(Integer iseSoeSeq) {
		this.iseSoeSeq = iseSoeSeq;
	}

	@Column(name = "HED_DTHR_AGENDA", nullable = false, length = 7)
	public Date getHedDthrAgenda() {
		return this.hedDthrAgenda;
	}

	public void setHedDthrAgenda(Date hedDthrAgenda) {
		this.hedDthrAgenda = hedDthrAgenda;
	}

	@Column(name = "EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getExaSigla() {
		return this.exaSigla;
	}

	public void setExaSigla(String exaSigla) {
		this.exaSigla = exaSigla;
	}

	@Column(name = "MAN_SEQ", nullable = false, precision = 5, scale = 0)
	public Integer getManSeq() {
		return this.manSeq;
	}

	public void setManSeq(Integer manSeq) {
		this.manSeq = manSeq;
	}

	@Column(name = "UNF_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "DESCRICAO_EXAME", nullable = false, length = 100)
	@Length(max = 100)
	public String getDescricaoExame() {
		return this.descricaoExame;
	}

	public void setDescricaoExame(String descricaoExame) {
		this.descricaoExame = descricaoExame;
	}

	@Column(name = "ISE_SOLICITACAO", nullable = false, precision = 8, scale = 0)
	public Integer getIseSolicitacao() {
		return this.iseSolicitacao;
	}

	public void setIseSolicitacao(Integer iseSolicitacao) {
		this.iseSolicitacao = iseSolicitacao;
	}

	@Column(name = "HED_GAE_UNF_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getHedGaeUnfSeq() {
		return this.hedGaeUnfSeq;
	}

	public void setHedGaeUnfSeq(Short hedGaeUnfSeq) {
		this.hedGaeUnfSeq = hedGaeUnfSeq;
	}

	@Column(name = "HED_GAE_SEQP", nullable = false, precision = 7, scale = 0)
	public Integer getHedGaeSeqp() {
		return this.hedGaeSeqp;
	}

	public void setHedGaeSeqp(Integer hedGaeSeqp) {
		this.hedGaeSeqp = hedGaeSeqp;
	}

	@Column(name = "DATA_SOLIC", nullable = false, length = 7)
	public Date getDataSolic() {
		return this.dataSolic;
	}

	public void setDataSolic(Date dataSolic) {
		this.dataSolic = dataSolic;
	}

	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof VAelExaAgendPacId)) {
			return false;
		}
		VAelExaAgendPacId castOther = (VAelExaAgendPacId) other;

		return (this.getPacCodigo() == castOther.getPacCodigo())
				&& (this.getIseSoeSeq() == castOther.getIseSoeSeq())
				&& ((this.getHedDthrAgenda() == castOther.getHedDthrAgenda()) || (this
						.getHedDthrAgenda() != null
						&& castOther.getHedDthrAgenda() != null && this
						.getHedDthrAgenda()
						.equals(castOther.getHedDthrAgenda())))
				&& ((this.getExaSigla() == castOther.getExaSigla()) || (this
						.getExaSigla() != null
						&& castOther.getExaSigla() != null && this
						.getExaSigla().equals(castOther.getExaSigla())))
				&& (this.getManSeq() == castOther.getManSeq())
				&& (this.getUnfSeq() == castOther.getUnfSeq())
				&& ((this.getDescricaoExame() == castOther.getDescricaoExame()) || (this
						.getDescricaoExame() != null
						&& castOther.getDescricaoExame() != null && this
						.getDescricaoExame().equals(
								castOther.getDescricaoExame())))
				&& (this.getIseSolicitacao() == castOther.getIseSolicitacao())
				&& (this.getHedGaeUnfSeq() == castOther.getHedGaeUnfSeq())
				&& (this.getHedGaeSeqp() == castOther.getHedGaeSeqp())
				&& ((this.getDataSolic() == castOther.getDataSolic()) || (this
						.getDataSolic() != null
						&& castOther.getDataSolic() != null && this
						.getDataSolic().equals(castOther.getDataSolic())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPacCodigo();
		result = 37 * result + this.getIseSoeSeq();
		result = 37
				* result
				+ (getHedDthrAgenda() == null ? 0 : this.getHedDthrAgenda()
						.hashCode());
		result = 37 * result
				+ (getExaSigla() == null ? 0 : this.getExaSigla().hashCode());
		result = 37 * result + this.getManSeq();
		result = 37 * result + this.getUnfSeq();
		result = 37
				* result
				+ (getDescricaoExame() == null ? 0 : this.getDescricaoExame()
						.hashCode());
		result = 37 * result + this.getIseSolicitacao();
		result = 37 * result + this.getHedGaeUnfSeq();
		result = 37 * result + this.getHedGaeSeqp();
		result = 37 * result
				+ (getDataSolic() == null ? 0 : this.getDataSolic().hashCode());
		return result;
	}

}
