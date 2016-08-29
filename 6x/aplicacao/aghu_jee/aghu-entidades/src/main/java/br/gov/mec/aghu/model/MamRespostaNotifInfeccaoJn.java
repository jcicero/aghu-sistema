package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * MamRespostaNotifInfeccaoJn generated by hbm2java
 */
@Entity
@Table(name = "MAM_RESPOSTA_NOTIF_INFECCOE_JN", schema = "AGH")
@Immutable
public class MamRespostaNotifInfeccaoJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -3605740513254303307L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Long pnnSeq;
	private Short seqp;
	private String infeccao;
	private String endometrite;
	private String feridaOperatoria;
	private String indAnalisadoCcih;
	private String indUserRespondeu;
	private Integer conNumero;
	private String observacao;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private String confirmacao;
	private String contaminacaoCcih;
	private String infeccaoCcih;
	private String endometriteCcih;
	private String feridaOperatoriaCcih;
	private Short topSeq;
	private Short topSeqSeg;

	public MamRespostaNotifInfeccaoJn() {
	}

	public MamRespostaNotifInfeccaoJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Long pnnSeq, Short seqp) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.pnnSeq = pnnSeq;
		this.seqp = seqp;
	}

	public MamRespostaNotifInfeccaoJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Long pnnSeq, Short seqp,
			String infeccao, String endometrite, String feridaOperatoria, String indAnalisadoCcih, String indUserRespondeu,
			Integer conNumero, String observacao, Date criadoEm, Integer serMatricula, Short serVinCodigo, String confirmacao,
			String contaminacaoCcih, String infeccaoCcih, String endometriteCcih, String feridaOperatoriaCcih, Short topSeq,
			Short topSeqSeg) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.pnnSeq = pnnSeq;
		this.seqp = seqp;
		this.infeccao = infeccao;
		this.endometrite = endometrite;
		this.feridaOperatoria = feridaOperatoria;
		this.indAnalisadoCcih = indAnalisadoCcih;
		this.indUserRespondeu = indUserRespondeu;
		this.conNumero = conNumero;
		this.observacao = observacao;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.confirmacao = confirmacao;
		this.contaminacaoCcih = contaminacaoCcih;
		this.infeccaoCcih = infeccaoCcih;
		this.endometriteCcih = endometriteCcih;
		this.feridaOperatoriaCcih = feridaOperatoriaCcih;
		this.topSeq = topSeq;
		this.topSeqSeg = topSeqSeg;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}
	// ATUALIZADOR JOURNALS - ID
	
/* ATUALIZADOR JOURNALS - Get / Set	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	public Long getSeqJn() {
		return this.seqJn;
	}

	public void setSeqJn(Long seqJn) {
		this.seqJn = seqJn;
	}

	@Column(name = "JN_USER", nullable = false, length = 30)
	@Length(max = 30)
	public String getJnUser() {
		return this.jnUser;
	}

	public void setJnUser(String jnUser) {
		this.jnUser = jnUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "JN_DATE_TIME", nullable = false, length = 29)
	public Date getJnDateTime() {
		return this.jnDateTime;
	}

	public void setJnDateTime(Date jnDateTime) {
		this.jnDateTime = jnDateTime;
	}

	@Column(name = "JN_OPERATION", nullable = false, length = 3)
	@Length(max = 3)
	public String getJnOperation() {
		return this.jnOperation;
	}

	public void setJnOperation(String jnOperation) {
		this.jnOperation = jnOperation;
	}*/

	@Column(name = "PNN_SEQ", nullable = false)
	public Long getPnnSeq() {
		return this.pnnSeq;
	}

	public void setPnnSeq(Long pnnSeq) {
		this.pnnSeq = pnnSeq;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Column(name = "INFECCAO", length = 1)
	@Length(max = 1)
	public String getInfeccao() {
		return this.infeccao;
	}

	public void setInfeccao(String infeccao) {
		this.infeccao = infeccao;
	}

	@Column(name = "ENDOMETRITE", length = 1)
	@Length(max = 1)
	public String getEndometrite() {
		return this.endometrite;
	}

	public void setEndometrite(String endometrite) {
		this.endometrite = endometrite;
	}

	@Column(name = "FERIDA_OPERATORIA", length = 1)
	@Length(max = 1)
	public String getFeridaOperatoria() {
		return this.feridaOperatoria;
	}

	public void setFeridaOperatoria(String feridaOperatoria) {
		this.feridaOperatoria = feridaOperatoria;
	}

	@Column(name = "IND_ANALISADO_CCIH", length = 1)
	@Length(max = 1)
	public String getIndAnalisadoCcih() {
		return this.indAnalisadoCcih;
	}

	public void setIndAnalisadoCcih(String indAnalisadoCcih) {
		this.indAnalisadoCcih = indAnalisadoCcih;
	}

	@Column(name = "IND_USER_RESPONDEU", length = 1)
	@Length(max = 1)
	public String getIndUserRespondeu() {
		return this.indUserRespondeu;
	}

	public void setIndUserRespondeu(String indUserRespondeu) {
		this.indUserRespondeu = indUserRespondeu;
	}

	@Column(name = "CON_NUMERO")
	public Integer getConNumero() {
		return this.conNumero;
	}

	public void setConNumero(Integer conNumero) {
		this.conNumero = conNumero;
	}

	@Column(name = "OBSERVACAO", length = 500)
	@Length(max = 500)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "CONFIRMACAO", length = 1)
	@Length(max = 1)
	public String getConfirmacao() {
		return this.confirmacao;
	}

	public void setConfirmacao(String confirmacao) {
		this.confirmacao = confirmacao;
	}

	@Column(name = "CONTAMINACAO_CCIH", length = 1)
	@Length(max = 1)
	public String getContaminacaoCcih() {
		return this.contaminacaoCcih;
	}

	public void setContaminacaoCcih(String contaminacaoCcih) {
		this.contaminacaoCcih = contaminacaoCcih;
	}

	@Column(name = "INFECCAO_CCIH", length = 1)
	@Length(max = 1)
	public String getInfeccaoCcih() {
		return this.infeccaoCcih;
	}

	public void setInfeccaoCcih(String infeccaoCcih) {
		this.infeccaoCcih = infeccaoCcih;
	}

	@Column(name = "ENDOMETRITE_CCIH", length = 1)
	@Length(max = 1)
	public String getEndometriteCcih() {
		return this.endometriteCcih;
	}

	public void setEndometriteCcih(String endometriteCcih) {
		this.endometriteCcih = endometriteCcih;
	}

	@Column(name = "FERIDA_OPERATORIA_CCIH", length = 1)
	@Length(max = 1)
	public String getFeridaOperatoriaCcih() {
		return this.feridaOperatoriaCcih;
	}

	public void setFeridaOperatoriaCcih(String feridaOperatoriaCcih) {
		this.feridaOperatoriaCcih = feridaOperatoriaCcih;
	}

	@Column(name = "TOP_SEQ")
	public Short getTopSeq() {
		return this.topSeq;
	}

	public void setTopSeq(Short topSeq) {
		this.topSeq = topSeq;
	}

	@Column(name = "TOP_SEQ_SEG")
	public Short getTopSeqSeg() {
		return this.topSeqSeg;
	}

	public void setTopSeqSeg(Short topSeqSeg) {
		this.topSeqSeg = topSeqSeg;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		PNN_SEQ("pnnSeq"),
		SEQP("seqp"),
		INFECCAO("infeccao"),
		ENDOMETRITE("endometrite"),
		FERIDA_OPERATORIA("feridaOperatoria"),
		IND_ANALISADO_CCIH("indAnalisadoCcih"),
		IND_USER_RESPONDEU("indUserRespondeu"),
		CON_NUMERO("conNumero"),
		OBSERVACAO("observacao"),
		CRIADO_EM("criadoEm"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		CONFIRMACAO("confirmacao"),
		CONTAMINACAO_CCIH("contaminacaoCcih"),
		INFECCAO_CCIH("infeccaoCcih"),
		ENDOMETRITE_CCIH("endometriteCcih"),
		FERIDA_OPERATORIA_CCIH("feridaOperatoriaCcih"),
		TOP_SEQ("topSeq"),
		TOP_SEQ_SEG("topSeqSeg");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

}
