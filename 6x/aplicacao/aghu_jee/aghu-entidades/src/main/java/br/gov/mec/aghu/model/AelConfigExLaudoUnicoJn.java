package br.gov.mec.aghu.model;

// Generated 09/04/2012 13:17:38 by Hibernate Tools 3.4.0.CR1

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
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.dominio.DominioUnidadeTempoLiberacao;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelConfigExLaudoUnicosJn generated by hbm2java
 */
@Entity
@Table(name = "AEL_CONFIG_EX_LAUDO_UNICOS_JN")
@SequenceGenerator(name = "aelLu2JnSeq", sequenceName = "AEL_LU2_JN_SEQ", allocationSize = 1)
@Immutable
public class AelConfigExLaudoUnicoJn extends BaseJournal implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 42210741360701876L;

	private Integer seq;
	private String nome;
	private String sigla;
	private Boolean imagem;
	private Boolean macro;
	private Boolean micro;
	private Boolean lamina;
	private Short tempoAposLib;
	private DominioUnidadeTempoLiberacao unidTempoLib;
	private DominioSituacao situacao;
	private Date criadoEm;
	private Boolean laudoAnterior;
	private RapServidores servidor;
	private Long ultimoNumero;

	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelLu2JnSeq")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Column(name = "SEQ", nullable = false, precision = 5, scale = 0)
	@NotNull
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "NOME", length = 500)
	@Length(max = 500)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "SIGLA", length = 3)
	@Length(max = 3)
	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Column(name = "IND_IMAGEM", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getImagem() {
		return imagem;
	}

	public void setImagem(Boolean imagem) {
		this.imagem = imagem;
	}

	@Column(name = "IND_MACRO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getMacro() {
		return macro;
	}

	public void setMacro(Boolean macro) {
		this.macro = macro;
	}

	@Column(name = "IND_MICRO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getMicro() {
		return micro;
	}

	public void setMicro(Boolean micro) {
		this.micro = micro;
	}

	@Column(name = "IND_LAMINA", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")	
	public Boolean getLamina() {
		return lamina;
	}

	public void setLamina(Boolean lamina) {
		this.lamina = lamina;
	}

	@Column(name = "TEMPO_APOS_LIB", precision = 3, scale = 0)
	public Short getTempoAposLib() {
		return this.tempoAposLib;
	}

	public void setTempoAposLib(Short tempoAposLib) {
		this.tempoAposLib = tempoAposLib;
	}

	@Column(name = "UNID_TEMPO_LIB", length = 1)
	@Enumerated(EnumType.STRING)	
	public DominioUnidadeTempoLiberacao getUnidTempoLib() {
		return this.unidTempoLib;
	}

	public void setUnidTempoLib(DominioUnidadeTempoLiberacao unidTempoLib) {
		this.unidTempoLib = unidTempoLib;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Enumerated(EnumType.STRING)	
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_LAUDO_ANTERIOR", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")	
	public Boolean getLaudoAnterior() {
		return laudoAnterior;
	}

	public void setLaudoAnterior(Boolean laudoAnterior) {
		this.laudoAnterior = laudoAnterior;
	}

	@Column(name = "ULTIMO_NUM", precision = 10, scale = 0)
	public Long getUltimoNumero() {
		return ultimoNumero;
	}

	public void setUltimoNumero(Long ultimoNumero) {
		this.ultimoNumero = ultimoNumero;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
		@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	public enum Fields {

		SEQ("seq"),
		NOME("nome"),
		IMAGEM("imagem"),
		MACRO("macro"),
		MICRO("micro"),
		LAMINA("lamina"),
		TEMPO_APOS_LIB("tempoAposLib"),
		UNID_TEMPO_LIB("unidTempoLib"),
		SITUACAO("situacao"),
		CRIADO_EM("criadoEm"),
		LAUDO_ANTERIOR("laudoAnterior"),
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
