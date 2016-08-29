package br.gov.mec.aghu.model;


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
import javax.persistence.Version;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacaoExameInternet;
import br.gov.mec.aghu.dominio.DominioStatusExameInternet;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AelExameInternetStatus generated by hbm2java
 */
@Entity
@Table(name = "AEL_EXAME_INTERNET_STATUS", schema = "AGH")
@SequenceGenerator(name="aelSttSq1", sequenceName="AGH.AEL_STT_SQ1", allocationSize = 1)
public class AelExameInternetStatus extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2912587321708530893L;
	private Integer seq;
	private Integer version;
	private AelItemSolicitacaoExames itemSolicitacaoExames;
	private AelSolicitacaoExames solicitacaoExames;
	private AelExameInternetGrupo exameInternetGrupo;
	private DominioStatusExameInternet status;
	private DominioSituacaoExameInternet situacao;
	private Date dataHoraStatus;
	private RapServidores servidor;
	private String mensagem;
	
	public AelExameInternetStatus() {
	}

	public AelExameInternetStatus(Integer seq,
			AelItemSolicitacaoExames itemSolicitacaoExames,
			AelSolicitacaoExames solicitacaoExames,
			AelExameInternetGrupo exameInternetGrupo,
			DominioStatusExameInternet status,
			DominioSituacaoExameInternet situacao, Date dataHoraStatus,
			RapServidores servidor) {
		this.seq = seq;
		this.itemSolicitacaoExames = itemSolicitacaoExames;
		this.solicitacaoExames = solicitacaoExames;
		this.exameInternetGrupo = exameInternetGrupo;
		this.status = status;
		this.situacao = situacao;
		this.dataHoraStatus = dataHoraStatus;
		this.servidor = servidor;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelSttSq1")
	@Column(name = "SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "ISE_SOE_SEQ", referencedColumnName = "SOE_SEQ"),
			@JoinColumn(name = "ISE_SEQP", referencedColumnName = "SEQP") })
	public AelItemSolicitacaoExames getItemSolicitacaoExames() {
		return itemSolicitacaoExames;
	}

	public void setItemSolicitacaoExames(
			AelItemSolicitacaoExames itemSolicitacaoExames) {
		this.itemSolicitacaoExames = itemSolicitacaoExames;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SOE_SEQ", referencedColumnName = "SEQ", nullable = false)
	public AelSolicitacaoExames getSolicitacaoExames() {
		return solicitacaoExames;
	}

	public void setSolicitacaoExames(
			AelSolicitacaoExames solicitacaoExames) {
		this.solicitacaoExames = solicitacaoExames;
	}
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GEI_SEQ")	
	public AelExameInternetGrupo getExameInternetGrupo() {
		return exameInternetGrupo;
	}

	public void setExameInternetGrupo(AelExameInternetGrupo exameInternetGrupo) {
		this.exameInternetGrupo = exameInternetGrupo;
	}


	@Column(name = "STATUS", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioStatusExameInternet getStatus() {
		return status;
	}


	public void setStatus(DominioStatusExameInternet status) {
		this.status = status;
	}

	@Column(name = "SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoExameInternet getSituacao() {
		return situacao;
	}

	public void setSituacao(DominioSituacaoExameInternet situacao) {
		this.situacao = situacao;
	}

	@Column(name = "DTHR_STATUS", nullable = false, length = 29)
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDataHoraStatus() {
		return dataHoraStatus;
	}

	public void setDataHoraStatus(Date dataHoraStatus) {
		this.dataHoraStatus = dataHoraStatus;
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
	
	@Column(name = "MENSAGEM", length = 4000)	
	@Length(max = 4000)	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other == null) {
			return false;
		}
		if (!(other instanceof AelExameInternetStatus)) {
			return false;
		}
		
		AelExameInternetStatus castOther = (AelExameInternetStatus) other;
		
		return new EqualsBuilder().append(this.getSeq(), castOther.getSeq()).isEquals();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.getSeq()).toHashCode();
	}

	public enum Fields {
		SEQ("seq"),
		ITEM_SOLICITACAO_EXAME("itemSolicitacaoExames"),
		ITEM_SOLICITACAO_EXAME_SOE_SEQ("itemSolicitacaoExames.id.soeSeq"),
		ITEM_SOLICITACAO_EXAME_SEQP("itemSolicitacaoExames.id.seqp"),
        EXAME_INTERNET_GRUPO("exameInternetGrupo"),
        EXAME_INTERNET_GRUPO_SEQ("exameInternetGrupo.seq"),	
        STATUS("status"),
        SITUACAO("situacao"),
        DTHR_STATUS("dataHoraStatus"),
		SERVIDOR("servidor"),
		SERVIDOR_MATRICULA("servidor.id.matricula"),
		SERVIDOR_VIN_CODIGO("servidor.id.vinCodigo"),
		SOLICITACAO_EXAME("solicitacaoExames"),
		SOLICITACAO_EXAME_SEQ("solicitacaoExames.seq"),
		SOLICITACAO_EXAME_LOCALIZADOR("solicitacaoExames.localizador"),
		SOLICITACAO_EXAME_SERVIDOR_RESP("solicitacaoExames.servidorResponsabilidade"),
		MENSAGEM("mensagem");
		
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
