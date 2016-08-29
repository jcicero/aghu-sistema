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
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.dominio.DominioTamanhoForcipe;
import br.gov.mec.aghu.dominio.DominioTipoForcipe;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * McoCesarianaJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aghMcoFcpJnSeq", sequenceName="AGH.MCO_FCP_JN_SEQ", allocationSize = 1)
@Table(name = "MCO_FORCIPES_JN", schema = "AGH")
@Immutable
public class McoForcipesJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -6367153348473912774L;
	
	private Short nasGsoSeqp;
	private Integer nasGsoPacCodigo;
	private Integer nasSeqp;
	private DominioTipoForcipe tipoForcipe;
	private DominioTamanhoForcipe tamanhoForcipe;
	private Boolean indForcipeComRotacao;
	private Date criadoEm;

	public McoForcipesJn() {
	}

	public McoForcipesJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Short nasGsoSeqp, Integer nasGsoPacCodigo,
			Integer nasSeqp) {
		this.nasGsoSeqp = nasGsoSeqp;
		this.nasGsoPacCodigo = nasGsoPacCodigo;
		this.nasSeqp = nasSeqp;
	}
	
	public McoForcipesJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Short nasGsoSeqp, Integer nasGsoPacCodigo,
			Integer nasSeqp, DominioTipoForcipe tipoForcipe, DominioTamanhoForcipe tamanhoForcipe, Boolean indForcipeComRotacao,
			Date criadoEm) {
		this.nasGsoSeqp = nasGsoSeqp;
		this.nasGsoPacCodigo = nasGsoPacCodigo;
		this.nasSeqp = nasSeqp;
		this.tipoForcipe = tipoForcipe;
		this.tamanhoForcipe = tamanhoForcipe;
		this.indForcipeComRotacao = indForcipeComRotacao;
		this.criadoEm = criadoEm;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aghMcoFcpJnSeq")
	@NotNull
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}
	// ATUALIZADOR JOURNALS - ID
	
	@Column(name = "NAS_GSO_SEQP", nullable = false)
	public Short getNasGsoSeqp() {
		return this.nasGsoSeqp;
	}

	public void setNasGsoSeqp(Short nasGsoSeqp) {
		this.nasGsoSeqp = nasGsoSeqp;
	}

	@Column(name = "NAS_GSO_PAC_CODIGO", nullable = false)
	public Integer getNasGsoPacCodigo() {
		return this.nasGsoPacCodigo;
	}

	public void setNasGsoPacCodigo(Integer nasGsoPacCodigo) {
		this.nasGsoPacCodigo = nasGsoPacCodigo;
	}

	@Column(name = "NAS_SEQP", nullable = false)
	public Integer getNasSeqp() {
		return this.nasSeqp;
	}

	public void setNasSeqp(Integer nasSeqp) {
		this.nasSeqp = nasSeqp;
	}
	
	@Column(name = "TIPO_FORCIPE", nullable = false)
	@NotNull
	@Enumerated(EnumType.STRING)
	public DominioTipoForcipe getTipoForcipe() {
		return this.tipoForcipe;
	}

	public void setTipoForcipe(DominioTipoForcipe tipoForcipe) {
		this.tipoForcipe = tipoForcipe;
	}

	@Column(name = "TAMANHO_FORCIPE", nullable = false)
	@NotNull
	@Enumerated(EnumType.STRING)
	public DominioTamanhoForcipe getTamanhoForcipe() {
		return this.tamanhoForcipe;
	}

	public void setTamanhoForcipe(DominioTamanhoForcipe tamanhoForcipe) {
		this.tamanhoForcipe = tamanhoForcipe;
	}

	@Column(name = "IND_FORCIPE_COM_ROTACAO", nullable = false)
	@NotNull
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndForcipeComRotacao() {
		return this.indForcipeComRotacao;
	}

	public void setIndForcipeComRotacao(Boolean indForcipeComRotacao) {
		this.indForcipeComRotacao = indForcipeComRotacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

		NAS_GSO_SEQP("nasGsoSeqp"),
		NAS_GSO_PAC_CODIGO("nasGsoPacCodigo"),
		NAS_SEQP("nasSeqp"),
		CRIADO_EM("criadoEm");

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
