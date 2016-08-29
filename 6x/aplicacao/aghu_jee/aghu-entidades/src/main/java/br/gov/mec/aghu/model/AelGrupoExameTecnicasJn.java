package br.gov.mec.aghu.model;

// Generated 25/08/2011 13:21:56 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelGrupoExameTecnicasJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name = "aelGrtJnSeq", sequenceName = "AGH.AEL_GRT_JN_SEQ", allocationSize = 1)
@Table(name = "AEL_GRUPO_EXAME_TECNICAS_JN", schema = "AGH")
@Immutable
public class AelGrupoExameTecnicasJn extends BaseJournal {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4249084641200489901L;
	/*private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer seq;
	private String descricao;
	private DominioSituacao indSituacao;
	private Date criadoEm;
	private RapServidores servidor;

	public AelGrupoExameTecnicasJn() {
	}

	public AelGrupoExameTecnicasJn(Long seqJn, String jnUser, Date jnDateTime,
			String jnOperation, Integer seq) {
		/*this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.seq = seq;
	}

	public AelGrupoExameTecnicasJn(Long seqJn, String jnUser, Date jnDateTime,
			String jnOperation, Integer seq, String descricao, DominioSituacao indSituacao,
			Date criadoEm, RapServidores servidor) {
		/*this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.seq = seq;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
	}

	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelGrtJnSeq")
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
	@Length(max = 30)
	public String getJnUser() {
		return this.jnUser;
	}

	public void setJnUser(String jnUser) {
		this.jnUser = jnUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "JN_DATE_TIME", nullable = false, length = 7)
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
	}
	*/
	
	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "DESCRICAO", length = 100)
	@Length(max = 100)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = true),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = true) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	public enum Fields {

		/*SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		SEQ("seq"),
		DESCRICAO("descricao"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
		SERVIDOR("servidor");

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
