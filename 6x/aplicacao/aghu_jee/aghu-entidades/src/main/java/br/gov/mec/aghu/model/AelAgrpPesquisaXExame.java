package br.gov.mec.aghu.model;

// Generated 13/05/2011 10:43:25 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AelAgrpPesquisaXExames generated by hbm2java
 */

@Entity
@SequenceGenerator(name="aelAxeSq1", sequenceName="AGH.AEL_AXE_SQ1", allocationSize = 1)
@Table(name = "AEL_AGRP_PESQUISA_X_EXAMES", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = {
		"aps_seq", "ufe_ema_exa_sigla", "ufe_ema_man_seq", "ufe_unf_seq" }))
public class AelAgrpPesquisaXExame extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6404076175414448400L;
	private Integer seq;
	private Integer version;
	private DominioSituacao indSituacao;
	private Date criadoEm;
	private AelAgrpPesquisas agrpPesquisa;
	private AelUnfExecutaExames unfExecutaExame;
	private RapServidores servidor;
	private String nomeLaudo;

	public AelAgrpPesquisaXExame() {
	}

	public AelAgrpPesquisaXExame(Integer seq, DominioSituacao indSituacao, Date criadoEm,
			AelAgrpPesquisas apsSeq, AelUnfExecutaExames unfExecutaExame, RapServidores servidor) {
		this.seq = seq;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.agrpPesquisa = apsSeq;
		this.unfExecutaExame = unfExecutaExame;
		this.servidor = servidor;
	}

	public AelAgrpPesquisaXExame(Integer seq, DominioSituacao indSituacao, Date criadoEm,
			AelAgrpPesquisas apsSeq, AelUnfExecutaExames unfExecutaExame, RapServidores servidor,
			String nomeLaudo) {
		this.seq = seq;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.agrpPesquisa = apsSeq;
		this.unfExecutaExame = unfExecutaExame;
		this.servidor = servidor;
		this.nomeLaudo = nomeLaudo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelAxeSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
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

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "UFE_EMA_EXA_SIGLA", referencedColumnName = "EMA_EXA_SIGLA", nullable = false),
			@JoinColumn(name = "UFE_EMA_MAN_SEQ", referencedColumnName = "EMA_MAN_SEQ", nullable = false),
			@JoinColumn(name = "UFE_UNF_SEQ", referencedColumnName = "UNF_SEQ", nullable = false)})
	public AelUnfExecutaExames getUnfExecutaExame() {
		return unfExecutaExame;
	}
	
	public void setUnfExecutaExame(AelUnfExecutaExames unfExecutaExame) {
		this.unfExecutaExame = unfExecutaExame;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Column(name = "NOME_LAUDO", length = 60)
	@Length(max = 60)
	public String getNomeLaudo() {
		return this.nomeLaudo;
	}

	public void setNomeLaudo(String nomeLaudo) {
		this.nomeLaudo = nomeLaudo;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "APS_SEQ")
	public AelAgrpPesquisas getAgrpPesquisa() {
		return agrpPesquisa;
	}
	
	public void setAgrpPesquisa(AelAgrpPesquisas agrpPesquisa) {
		this.agrpPesquisa = agrpPesquisa;
	}
	
	
	public enum Fields {
		SEQ("seq"),
		UFE_EMA_EXA_SIGLA("unfExecutaExame.id.emaExaSigla"),
		UFE_EMA_MAN_SEQ("unfExecutaExame.id.emaManSeq"),
		UFE_UNF_SEQ("unfExecutaExame.id.unfSeq.seq"),
		IND_SITUACAO("indSituacao"),
		NOME_LAUDO("nomeLaudo"),
		AGRP_PESQUISA("agrpPesquisa"),
		UNF_EXECUTA_EXAME("unfExecutaExame"),
		VERSION("version"),
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
	
	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AelAgrpPesquisaXExame)) {
			return false;
		}
		AelAgrpPesquisaXExame other = (AelAgrpPesquisaXExame) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
