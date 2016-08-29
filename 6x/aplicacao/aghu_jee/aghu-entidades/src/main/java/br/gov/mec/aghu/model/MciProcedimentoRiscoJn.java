package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * MciProcedimentoRiscoJn generated by hbm2java
 */

@Entity
@SequenceGenerator(name="mciProcedRiscoJn", sequenceName="AGH.MCI_POR_JN_SEQ", allocationSize = 1)
@Table(name = "MCI_PROCEDIMENTO_RISCOS_JN", schema = "AGH")
public class MciProcedimentoRiscoJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = 7982427416654867267L;
	private Short seq;
	private String descricao;
	private DominioSituacao indSituacao;
	private String indPermSobreposicao;
	private Short grauRisco;
	private Date criadoEm;
	private Date alteradoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Integer serMatriculaMovimentado;
	private Short serVinCodigoMovimentado;
	private String indInformacaoHora;

	public MciProcedimentoRiscoJn() {
	}

	public MciProcedimentoRiscoJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Short seq) {
		this.seq = seq;
	}

	public MciProcedimentoRiscoJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Short seq, String descricao,
			DominioSituacao indSituacao, String indPermSobreposicao, Short grauRisco, Date criadoEm, Date alteradoEm, Integer serMatricula,
			Short serVinCodigo, Integer serMatriculaMovimentado, Short serVinCodigoMovimentado, String indInformacaoHora) {
		this.seq = seq;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.indPermSobreposicao = indPermSobreposicao;
		this.grauRisco = grauRisco;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.serMatriculaMovimentado = serMatriculaMovimentado;
		this.serVinCodigoMovimentado = serVinCodigoMovimentado;
		this.indInformacaoHora = indInformacaoHora;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mciProcedRiscoJn")
	@Column(name = "SEQ_JN", nullable = false, precision = 12, scale = 0)
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Column(name = "SEQ", nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	@Column(name = "DESCRICAO", length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "IND_PERM_SOBREPOSICAO", length = 1)
	@Length(max = 1)
	public String getIndPermSobreposicao() {
		return this.indPermSobreposicao;
	}

	public void setIndPermSobreposicao(String indPermSobreposicao) {
		this.indPermSobreposicao = indPermSobreposicao;
	}

	@Column(name = "GRAU_RISCO")
	public Short getGrauRisco() {
		return this.grauRisco;
	}

	public void setGrauRisco(Short grauRisco) {
		this.grauRisco = grauRisco;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
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

	@Column(name = "SER_MATRICULA_MOVIMENTADO")
	public Integer getSerMatriculaMovimentado() {
		return this.serMatriculaMovimentado;
	}

	public void setSerMatriculaMovimentado(Integer serMatriculaMovimentado) {
		this.serMatriculaMovimentado = serMatriculaMovimentado;
	}

	@Column(name = "SER_VIN_CODIGO_MOVIMENTADO")
	public Short getSerVinCodigoMovimentado() {
		return this.serVinCodigoMovimentado;
	}

	public void setSerVinCodigoMovimentado(Short serVinCodigoMovimentado) {
		this.serVinCodigoMovimentado = serVinCodigoMovimentado;
	}

	@Column(name = "IND_INFORMACAO_HORA", length = 1)
	@Length(max = 1)
	public String getIndInformacaoHora() {
		return this.indInformacaoHora;
	}

	public void setIndInformacaoHora(String indInformacaoHora) {
		this.indInformacaoHora = indInformacaoHora;
	}

	public enum Fields {

		SEQ("seq"),
		DESCRICAO("descricao"),
		IND_SITUACAO("indSituacao"),
		IND_PERM_SOBREPOSICAO("indPermSobreposicao"),
		GRAU_RISCO("grauRisco"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		SER_MATRICULA_MOVIMENTADO("serMatriculaMovimentado"),
		SER_VIN_CODIGO_MOVIMENTADO("serVinCodigoMovimentado"),
		IND_INFORMACAO_HORA("indInformacaoHora");

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
