package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioIndContaminacao;
import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;
import br.gov.mec.aghu.core.utils.StringUtil;

/**
 * PdtProcDiagTerap generated by hbm2java
 */
@Entity
@SequenceGenerator(name="pdtDptSq1", sequenceName="AGH.PDT_DPT_SQ1", allocationSize = 1)
@Table(name = "PDT_PROC_DIAG_TERAPS", schema = "AGH")
public class PdtProcDiagTerap extends BaseEntitySeq<Integer> implements java.io.Serializable {

	private static final long serialVersionUID = 8228985557276862288L;
	private Integer seq;
	private Integer version;
	private RapServidores servidor;
	private AelExames exame;
	private MbcProcedimentoCirurgicos procedimentoCirurgico;
	private String descricao;
	private DominioIndContaminacao contaminacao;
	private Short tempoMinimo;
	private DominioSituacao situacao;
	private Date criadoEm;
	private Set<PdtTecnicaPorProc> pdtTecnicaPorProces = new HashSet<PdtTecnicaPorProc>(0);
	private Set<PdtProc> pdtProces = new HashSet<PdtProc>(0);
	private Set<PdtDescPadrao> pdtDescPadraoes = new HashSet<PdtDescPadrao>(0);
	private Set<PdtGrupo> pdtGrupoes = new HashSet<PdtGrupo>(0);
	private Set<PdtEquipPorProc> pdtEquipPorProces = new HashSet<PdtEquipPorProc>(0);
	private Set<PdtCidPorProc> pdtCidPorProces = new HashSet<PdtCidPorProc>(0);
	
	//Transient
	private String tempoMinimoEditado;

	public PdtProcDiagTerap() {
	}

	public PdtProcDiagTerap(Integer seq, RapServidores servidor, String descricao, DominioIndContaminacao contaminacao, DominioSituacao situacao,
			Date criadoEm) {
		this.seq = seq;
		this.servidor = servidor;
		this.descricao = descricao;
		this.contaminacao = contaminacao;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
	}

	public PdtProcDiagTerap(Integer seq, RapServidores servidor, AelExames exame,
			MbcProcedimentoCirurgicos procedimentoCirurgico, String descricao, DominioIndContaminacao contaminacao, Short tempoMinimo,
			DominioSituacao situacao, Date criadoEm, Set<PdtTecnicaPorProc> pdtTecnicaPorProces, Set<PdtProc> pdtProces,
			Set<PdtDescPadrao> pdtDescPadraoes, Set<PdtGrupo> pdtGrupoes, Set<PdtEquipPorProc> pdtEquipPorProces,
			Set<PdtCidPorProc> pdtCidPorProces) {
		this.seq = seq;
		this.servidor = servidor;
		this.exame = exame;
		this.procedimentoCirurgico = procedimentoCirurgico;
		this.descricao = descricao;
		this.contaminacao = contaminacao;
		this.tempoMinimo = tempoMinimo;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.pdtTecnicaPorProces = pdtTecnicaPorProces;
		this.pdtProces = pdtProces;
		this.pdtDescPadraoes = pdtDescPadraoes;
		this.pdtGrupoes = pdtGrupoes;
		this.pdtEquipPorProces = pdtEquipPorProces;
		this.pdtCidPorProces = pdtCidPorProces;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "pdtDptSq1")
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EXA_SIGLA", insertable = false, updatable = false)
	public AelExames getExame() {
		return this.exame;
	}

	public void setExame(AelExames exame) {
		this.exame = exame;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PCI_SEQ")
	public MbcProcedimentoCirurgicos getProcedimentoCirurgico() {
		return this.procedimentoCirurgico;
	}

	public void setProcedimentoCirurgico(MbcProcedimentoCirurgicos procedimentoCirurgico) {
		this.procedimentoCirurgico = procedimentoCirurgico;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 120)
	@Length(max = 120)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_CONTAMINACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioIndContaminacao getContaminacao() {
		return this.contaminacao;
	}

	public void setContaminacao(DominioIndContaminacao contaminacao) {
		this.contaminacao = contaminacao;
	}

	@Column(name = "TEMPO_MINIMO")
	public Short getTempoMinimo() {
		return this.tempoMinimo;
	}

	public void setTempoMinimo(Short tempoMinimo) {
		this.tempoMinimo = tempoMinimo;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pdtProcDiagTerap")
	public Set<PdtTecnicaPorProc> getPdtTecnicaPorProces() {
		return this.pdtTecnicaPorProces;
	}

	public void setPdtTecnicaPorProces(Set<PdtTecnicaPorProc> pdtTecnicaPorProces) {
		this.pdtTecnicaPorProces = pdtTecnicaPorProces;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pdtProcDiagTerap")
	public Set<PdtProc> getPdtProces() {
		return this.pdtProces;
	}

	public void setPdtProces(Set<PdtProc> pdtProces) {
		this.pdtProces = pdtProces;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pdtProcDiagTerap")
	public Set<PdtDescPadrao> getPdtDescPadraoes() {
		return this.pdtDescPadraoes;
	}

	public void setPdtDescPadraoes(Set<PdtDescPadrao> pdtDescPadraoes) {
		this.pdtDescPadraoes = pdtDescPadraoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pdtProcDiagTerap")
	public Set<PdtGrupo> getPdtGrupoes() {
		return this.pdtGrupoes;
	}

	public void setPdtGrupoes(Set<PdtGrupo> pdtGrupoes) {
		this.pdtGrupoes = pdtGrupoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pdtProcDiagTerap")
	public Set<PdtEquipPorProc> getPdtEquipPorProces() {
		return this.pdtEquipPorProces;
	}

	public void setPdtEquipPorProces(Set<PdtEquipPorProc> pdtEquipPorProces) {
		this.pdtEquipPorProces = pdtEquipPorProces;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pdtProcDiagTerap")
	public Set<PdtCidPorProc> getPdtCidPorProces() {
		return this.pdtCidPorProces;
	}

	public void setPdtCidPorProces(Set<PdtCidPorProc> pdtCidPorProces) {
		this.pdtCidPorProces = pdtCidPorProces;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		SERVIDOR("servidor"),
		SERVIDOR_ID_MATRICULA("servidor.id.matricula"),
		SERVIDOR_ID_VINCODIGO("servidor.id.vinCodigo"),
		EXAME("exame"),
		EXAME_SIGLA("exame.sigla"),
		PROCEDIMENTO_CIRURGICO("procedimentoCirurgico"),
		PROCEDIMENTO_CIRURGICO_SEQ("procedimentoCirurgico.seq"),
		DESCRICAO("descricao"),
		CONTAMINACAO("contaminacao"),
		TEMPO_MINIMO("tempoMinimo"),
		SITUACAO("situacao"),
		CRIADO_EM("criadoEm"),
		PDT_TECNICA_POR_PROCES("pdtTecnicaPorProces"),
		PDT_PROCES("pdtProces"),
		PDT_DESC_PADRAOES("pdtDescPadraoes"),
		PDT_GRUPOES("pdtGrupoes"),
		PDT_EQUIP_POR_PROCES("pdtEquipPorProces"),
		PDT_CID_POR_PROCES("pdtCidPorProces");

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
		if (!(obj instanceof PdtProcDiagTerap)) {
			return false;
		}
		PdtProcDiagTerap other = (PdtProcDiagTerap) obj;
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
	
	@Transient
	public String getDescricaoEditadaTrunc(Long size) {
		return StringUtil.trunc(descricao, true, size);
	}

	@Transient
	public String getTempoMinimoEditado() {
		return tempoMinimoEditado;
	}

	public void setTempoMinimoEditado(String tempoMinimoEditado) {
		this.tempoMinimoEditado = tempoMinimoEditado;
	}

}
