package br.gov.mec.aghu.model;

// Generated 27/03/2012 08:36:07 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelGrpMacroLacunas generated by hbm2java
 */
@Entity
@Table(name = "AEL_GRP_MACRO_LACUNAS", schema = "AGH")
public class AelGrpMacroLacuna extends BaseEntityId<AelGrpMacroLacunaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9123978945094614953L;
	private AelGrpMacroLacunaId id;
	private AelTextoPadraoMacro aelTextoPadraoMacros;
	private String lacuna;
	private DominioSituacao indSituacao;
	private Date criadoEm;
	private RapServidores servidor;
	private Integer version;
	private Set<AelTxtMacroLacuna> aelTxtMacroLacunas = new HashSet<AelTxtMacroLacuna>(
			0);

	public AelGrpMacroLacuna() {
	}

	public AelGrpMacroLacuna(AelGrpMacroLacunaId id,
			AelTextoPadraoMacro aelTextoPadraoMacros, String lacuna,
			DominioSituacao indSituacao, Date criadoEm, Integer serMatricula,
			Short serVinCodigo) {
		this.id = id;
		this.aelTextoPadraoMacros = aelTextoPadraoMacros;
		this.lacuna = lacuna;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	public AelGrpMacroLacuna(AelGrpMacroLacunaId id,
			AelTextoPadraoMacro aelTextoPadraoMacros, String lacuna,
			DominioSituacao indSituacao, Date criadoEm, Set<AelTxtMacroLacuna> aelTxtMacroLacunas) {
		this.id = id;
		this.aelTextoPadraoMacros = aelTextoPadraoMacros;
		this.lacuna = lacuna;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.aelTxtMacroLacunas = aelTxtMacroLacunas;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "lufLubSeq", column = @Column(name = "LUF_LUB_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "lufSeqp", column = @Column(name = "LUF_SEQP", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 4, scale = 0)) })
	public AelGrpMacroLacunaId getId() {
		return this.id;
	}

	public void setId(AelGrpMacroLacunaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "LUF_LUB_SEQ", referencedColumnName = "LUB_SEQ", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "LUF_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public AelTextoPadraoMacro getAelTextoPadraoMacros() {
		return this.aelTextoPadraoMacros;
	}

	public void setAelTextoPadraoMacros(
			AelTextoPadraoMacro aelTextoPadraoMacros) {
		this.aelTextoPadraoMacros = aelTextoPadraoMacros;
	}

	@Column(name = "LACUNA", nullable = false, length = 10)
	@Length(max = 10)
	public String getLacuna() {
		return this.lacuna;
	}

	public void setLacuna(String lacuna) {
		this.lacuna = lacuna;
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
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable=false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable=false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aelGrpMacroLacunas")
	public Set<AelTxtMacroLacuna> getAelTxtMacroLacunas() {
		return this.aelTxtMacroLacunas;
	}

	public void setAelTxtMacroLacunas(
			Set<AelTxtMacroLacuna> aelTxtMacroLacunas) {
		this.aelTxtMacroLacunas = aelTxtMacroLacunas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		AelGrpMacroLacuna other = (AelGrpMacroLacuna) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	public enum Fields {
		LUF_LUB_SEQ("id.lufLubSeq"),
		LUF_SEQP("id.lufSeqp"),
		SEQP("id.seqp"),
		LACUNA("lacuna"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
		AEL_TEXTO_PADRAO_MACROS_LUB_SEQ("aelTextoPadraoMacros.id.lubSeq"),
		AEL_TEXTO_PADRAO_MACROS_SEQP("aelTextoPadraoMacros.id.seqp"),
		;

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
