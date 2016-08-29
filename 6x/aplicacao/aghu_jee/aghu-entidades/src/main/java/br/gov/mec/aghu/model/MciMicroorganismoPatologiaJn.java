package br.gov.mec.aghu.model;



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
import br.gov.mec.aghu.core.dominio.DominioOperacoesJournal;
import br.gov.mec.aghu.core.model.BaseJournal;

@Entity
@Table(name = "MCI_MICROORG_PATOLOGIAS_JN", schema = "AGH")
@SequenceGenerator(name = "mciMptJnSeq", sequenceName = "AGH.MCI_MPT_JN_SEQ", allocationSize = 1)
public class MciMicroorganismoPatologiaJn extends BaseJournal {

	private static final long serialVersionUID = 7006969920343703272L;
	private Integer seqPai;
	private Short seqP;
	private String descricao;
	private DominioSituacao situacao;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Date alteradoEm;
	private Integer serMatriculaMov;
	private Short serVinCodigoMov; 
	

	public MciMicroorganismoPatologiaJn() {
		super();
	}
	
	public MciMicroorganismoPatologiaJn(String nomeUsuario, DominioOperacoesJournal operacao, Integer seqPai, Short seqP,
			String descricao, DominioSituacao situacao, Date criadoEm, Integer serMatricula, Short serVinCodigo, 
			Date alteradoEm, Integer serMatriculaMov, Short serVinCodigoMov) {
		super();
		setNomeUsuario(nomeUsuario);
		setOperacao(operacao);
		this.seqPai = seqPai;
		this.seqP = seqP;
		this.descricao = descricao;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.alteradoEm = alteradoEm;
		this.serMatriculaMov = serMatriculaMov;
		this.serVinCodigoMov = serVinCodigoMov;
	}

	
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mciMptJnSeq")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@Column(name = "PAI_SEQ", nullable = false)
	public Integer getSeqPai() {
		return seqPai;
	}
	
	@Column(name = "SEQP", nullable = false)
	public Short getSeqP() {
		return seqP;
	}
	
	@Column(name = "IND_SITUACAO", length = 1, nullable = false)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return situacao;
	}
	
	@Column(name = "SER_MATRICULA", nullable = false)
	public Integer getSerMatricula() {
		return serMatricula;
	}
	
	@Column(name = "SER_VIN_CODIGO", nullable = false)
	public Short getSerVinCodigo() {
		return serVinCodigo;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return alteradoEm;
	}

	
	@Column(name = "SER_MATRICULA_MOVIMENTADO")
	public Integer getSerMatriculaMov() {
		return serMatriculaMov;
	}

	@Column(name = "SER_VIN_CODIGO_MOVIMENTADO")
	public Short getSerVinCodigoMov() {
		return serVinCodigoMov;
	}


	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}


	public void setSerMatriculaMov(Integer serMatriculaMov) {
		this.serMatriculaMov = serMatriculaMov;
	}


	public void setSerVinCodigoMov(Short serVinCodigoMov) {
		this.serVinCodigoMov = serVinCodigoMov;
	}


	public void setSeqPai(Integer seqPai) {
		this.seqPai = seqPai;
	}

	public void setSeqP(Short seqP) {
		this.seqP = seqP;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	public enum Fields {

		DESCRICAO("descricao"), 
		SITUACAO("situacao"), 
		CRIADO_EM("criadoEm"),
		PAI_SEQ("seqPai"),		
		SEQP("seqP"),		
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		SER_MATRICULA_MOV("serMatriculaMov"),
		SER_VIN_CODIGO_MOV("serVinCodigoMov"),
		ALTERADO_EM("alteradoEm");

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
