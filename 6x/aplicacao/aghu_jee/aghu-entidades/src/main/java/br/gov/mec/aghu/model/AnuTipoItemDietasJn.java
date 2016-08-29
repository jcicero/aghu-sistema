package br.gov.mec.aghu.model;

// Generated 01/02/2011 14:23:05 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AnuTipoItemDietasJn generated by hbm2java
 */

@Entity
@SequenceGenerator(name = "ANU_TID_jn_seq", sequenceName = "AGH.ANU_TID_jn_seq", allocationSize = 1)
@Table(name = "ANU_TIPO_ITEM_DIETAS_JN", schema = "AGH")
@Immutable
public class AnuTipoItemDietasJn extends BaseJournal {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8742115210153781572L;
//	private Long seqJn;
//	private String jnUser;
//	private Date jnDateTime;
//	private String jnOperation;
	private Integer seq;
	private String descricao;
	private String sintaxeMedico;
	private String sintaxeNutricao;
	private String indDigitaQuantidade;
	private String indDigitaAprazamento;
	private String indAdulto;
	private String indPediatria;
	private String indNeonatologia;
	private String indDietaPadronizada;
	private Date criadoEm;
	private String indSituacao;
	private String descrComplMapaDieta;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Integer ummSeq;
	private String indItemUnico;
	private Short frequencia;
	private Short tfqSeq;

	public AnuTipoItemDietasJn() {
		super();
	}

	public AnuTipoItemDietasJn(long seqJn, String jnUser, Date jnDateTime,
			String jnOperation, int seq) {
		//this.seqJn = seqJn;
		//this.jnUser = jnUser;
		//this.jnDateTime = jnDateTime;
		//this.jnOperation = jnOperation;
		this.seq = seq;
	}
	
	public AnuTipoItemDietasJn(Long seqJn, String jnUser, Date jnDateTime,
			String jnOperation, Integer seq, String descricao,
			String sintaxeMedico, String sintaxeNutricao,
			String indDigitaQuantidade, String indDigitaAprazamento,
			String indAdulto, String indPediatria, String indNeonatologia,
			String indDietaPadronizada, Date criadoEm, String indSituacao,
			String descrComplMapaDieta, Integer serMatricula,
			Short serVinCodigo, Integer ummSeq, String indItemUnico,
			Short frequencia, Short tfqSeq) {
		//this.seqJn = seqJn;
		//this.jnUser = jnUser;
		//this.jnDateTime = jnDateTime;
		//this.jnOperation = jnOperation;
		this.seq = seq;
		this.descricao = descricao;
		this.sintaxeMedico = sintaxeMedico;
		this.sintaxeNutricao = sintaxeNutricao;
		this.indDigitaQuantidade = indDigitaQuantidade;
		this.indDigitaAprazamento = indDigitaAprazamento;
		this.indAdulto = indAdulto;
		this.indPediatria = indPediatria;
		this.indNeonatologia = indNeonatologia;
		this.indDietaPadronizada = indDietaPadronizada;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.descrComplMapaDieta = descrComplMapaDieta;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.ummSeq = ummSeq;
		this.indItemUnico = indItemUnico;
		this.frequencia = frequencia;
		this.tfqSeq = tfqSeq;
	}
	
	public void doSetPropriedades(Integer seq, String descricao,
			String sintaxeMedico, String sintaxeNutricao,
			String indDigitaQuantidade, String indDigitaAprazamento,
			String indAdulto, String indPediatria, String indNeonatologia,
			String indDietaPadronizada, Date criadoEm, String indSituacao,
			String descrComplMapaDieta, Integer serMatricula,
			Short serVinCodigo, Integer ummSeq, String indItemUnico,
			Short frequencia, Short tfqSeq) {
		//this.jnUser = jnUser;
		//this.jnDateTime = jnDateTime;
		//this.jnOperation = jnOperation;
		this.seq = seq;
		this.descricao = descricao;
		this.sintaxeMedico = sintaxeMedico;
		this.sintaxeNutricao = sintaxeNutricao;
		this.indDigitaQuantidade = indDigitaQuantidade;
		this.indDigitaAprazamento = indDigitaAprazamento;
		this.indAdulto = indAdulto;
		this.indPediatria = indPediatria;
		this.indNeonatologia = indNeonatologia;
		this.indDietaPadronizada = indDietaPadronizada;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.descrComplMapaDieta = descrComplMapaDieta;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.ummSeq = ummSeq;
		this.indItemUnico = indItemUnico;
		this.frequencia = frequencia;
		this.tfqSeq = tfqSeq;
	}
	
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ANU_TID_jn_seq")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	/*
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	public Long getSeqJn() {
		return this.seqJn;
	}

	public void setSeqJn(Long seqJn) {
		this.seqJn = seqJn;
	}

	@Column(name = "JN_USER", nullable = false, length = 30)
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
	public String getJnOperation() {
		return this.jnOperation;
	}

	public void setJnOperation(String jnOperation) {
		this.jnOperation = jnOperation;
	}
	*/

	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "DESCRICAO", length = 45)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "SINTAXE_MEDICO", length = 15)
	public String getSintaxeMedico() {
		return this.sintaxeMedico;
	}

	public void setSintaxeMedico(String sintaxeMedico) {
		this.sintaxeMedico = sintaxeMedico;
	}

	@Column(name = "SINTAXE_NUTRICAO", length = 15)
	public String getSintaxeNutricao() {
		return this.sintaxeNutricao;
	}

	public void setSintaxeNutricao(String sintaxeNutricao) {
		this.sintaxeNutricao = sintaxeNutricao;
	}

	@Column(name = "IND_DIGITA_QUANTIDADE", length = 1)
	public String getIndDigitaQuantidade() {
		return this.indDigitaQuantidade;
	}

	public void setIndDigitaQuantidade(String indDigitaQuantidade) {
		this.indDigitaQuantidade = indDigitaQuantidade;
	}

	@Column(name = "IND_DIGITA_APRAZAMENTO", length = 1)
	public String getIndDigitaAprazamento() {
		return this.indDigitaAprazamento;
	}

	public void setIndDigitaAprazamento(String indDigitaAprazamento) {
		this.indDigitaAprazamento = indDigitaAprazamento;
	}

	@Column(name = "IND_ADULTO", length = 1)
	public String getIndAdulto() {
		return this.indAdulto;
	}

	public void setIndAdulto(String indAdulto) {
		this.indAdulto = indAdulto;
	}

	@Column(name = "IND_PEDIATRIA", length = 1)
	public String getIndPediatria() {
		return this.indPediatria;
	}

	public void setIndPediatria(String indPediatria) {
		this.indPediatria = indPediatria;
	}

	@Column(name = "IND_NEONATOLOGIA", length = 1)
	public String getIndNeonatologia() {
		return this.indNeonatologia;
	}

	public void setIndNeonatologia(String indNeonatologia) {
		this.indNeonatologia = indNeonatologia;
	}

	@Column(name = "IND_DIETA_PADRONIZADA", length = 1)
	public String getIndDietaPadronizada() {
		return this.indDietaPadronizada;
	}

	public void setIndDietaPadronizada(String indDietaPadronizada) {
		this.indDietaPadronizada = indDietaPadronizada;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "DESCR_COMPL_MAPA_DIETA", length = 60)
	public String getDescrComplMapaDieta() {
		return this.descrComplMapaDieta;
	}

	public void setDescrComplMapaDieta(String descrComplMapaDieta) {
		this.descrComplMapaDieta = descrComplMapaDieta;
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

	@Column(name = "UMM_SEQ")
	public Integer getUmmSeq() {
		return this.ummSeq;
	}

	public void setUmmSeq(Integer ummSeq) {
		this.ummSeq = ummSeq;
	}

	@Column(name = "IND_ITEM_UNICO", length = 1)
	public String getIndItemUnico() {
		return this.indItemUnico;
	}

	public void setIndItemUnico(String indItemUnico) {
		this.indItemUnico = indItemUnico;
	}

	@Column(name = "FREQUENCIA")
	public Short getFrequencia() {
		return this.frequencia;
	}

	public void setFrequencia(Short frequencia) {
		this.frequencia = frequencia;
	}

	@Column(name = "TFQ_SEQ")
	public Short getTfqSeq() {
		return this.tfqSeq;
	}

	public void setTfqSeq(Short tfqSeq) {
		this.tfqSeq = tfqSeq;
	}

	public enum Fields {

		/*SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		SEQ("seq"),
		DESCRICAO("descricao"),
		SINTAXE_MEDICO("sintaxeMedico"),
		SINTAXE_NUTRICAO("sintaxeNutricao"),
		IND_DIGITA_QUANTIDADE("indDigitaQuantidade"),
		IND_DIGITA_APRAZAMENTO("indDigitaAprazamento"),
		IND_ADULTO("indAdulto"),
		IND_PEDIATRIA("indPediatria"),
		IND_NEONATOLOGIA("indNeonatologia"),
		IND_DIETA_PADRONIZADA("indDietaPadronizada"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao"),
		DESCR_COMPL_MAPA_DIETA("descrComplMapaDieta"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		UMM_SEQ("ummSeq"),
		IND_ITEM_UNICO("indItemUnico"),
		FREQUENCIA("frequencia"),
		TFQ_SEQ("tfqSeq");

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
