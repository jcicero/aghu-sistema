package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatValoresDiariasInternacao generated by hbm2java
 */
@Entity
@Table(name = "FAT_VALORES_DIARIAS_INTERNACAO", schema = "AGH")
public class FatValorDiariaInternacao extends BaseEntityId<FatValorDiariaInternacaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8764449308523959895L;
	private FatValorDiariaInternacaoId id;
	private FatDiariaInternacao fatDiariaInternacao;
	private BigDecimal valorServHosp;
	private BigDecimal valorServProf;
	private BigDecimal valorSadt;
	private String criadoPor;
	private Date criadoEm;
	private Date dataFimValidade;
	private String alteradoPor;
	private Date alteradoEm;
	private Integer version;

	public FatValorDiariaInternacao() {
	}

	public FatValorDiariaInternacao(FatValorDiariaInternacaoId id,
			FatDiariaInternacao fatDiariaInternacao,
			BigDecimal valorServHosp, BigDecimal valorServProf,
			BigDecimal valorSadt, String criadoPor, Date criadoEm) {
		this.id = id;
		this.fatDiariaInternacao = fatDiariaInternacao;
		this.valorServHosp = valorServHosp;
		this.valorServProf = valorServProf;
		this.valorSadt = valorSadt;
		this.criadoPor = criadoPor;
		this.criadoEm = criadoEm;
	}

	public FatValorDiariaInternacao(FatValorDiariaInternacaoId id,
			FatDiariaInternacao fatDiariaInternacao,
			BigDecimal valorServHosp, BigDecimal valorServProf,
			BigDecimal valorSadt, String criadoPor, Date criadoEm,
			Date dataFimValidade, String alteradoPor, Date alteradoEm) {
		this.id = id;
		this.fatDiariaInternacao = fatDiariaInternacao;
		this.valorServHosp = valorServHosp;
		this.valorServProf = valorServProf;
		this.valorSadt = valorSadt;
		this.criadoPor = criadoPor;
		this.criadoEm = criadoEm;
		this.dataFimValidade = dataFimValidade;
		this.alteradoPor = alteradoPor;
		this.alteradoEm = alteradoEm;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "dinSeq", column = @Column(name = "DIN_SEQ", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "dataInicioValidade", column = @Column(name = "DATA_INICIO_VALIDADE", nullable = false, length = 7)) })
	public FatValorDiariaInternacaoId getId() {
		return this.id;
	}

	public void setId(FatValorDiariaInternacaoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DIN_SEQ", nullable = false, insertable = false, updatable = false)
	public FatDiariaInternacao getFatDiariaInternacao() {
		return this.fatDiariaInternacao;
	}

	public void setFatDiariaInternacao(
			FatDiariaInternacao fatDiariaInternacao) {
		this.fatDiariaInternacao = fatDiariaInternacao;
	}

	@Column(name = "VALOR_SERV_HOSP", nullable = false, precision = 14)
	public BigDecimal getValorServHosp() {
		return this.valorServHosp;
	}

	public void setValorServHosp(BigDecimal valorServHosp) {
		this.valorServHosp = valorServHosp;
	}

	@Column(name = "VALOR_SERV_PROF", nullable = false, precision = 14)
	public BigDecimal getValorServProf() {
		return this.valorServProf;
	}

	public void setValorServProf(BigDecimal valorServProf) {
		this.valorServProf = valorServProf;
	}

	@Column(name = "VALOR_SADT", nullable = false, precision = 14)
	public BigDecimal getValorSadt() {
		return this.valorSadt;
	}

	public void setValorSadt(BigDecimal valorSadt) {
		this.valorSadt = valorSadt;
	}

	@Column(name = "CRIADO_POR", nullable = false, length = 30)
	@Length(max = 30)
	public String getCriadoPor() {
		return this.criadoPor;
	}

	public void setCriadoPor(String criadoPor) {
		this.criadoPor = criadoPor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_FIM_VALIDADE", length = 7)
	public Date getDataFimValidade() {
		return this.dataFimValidade;
	}

	public void setDataFimValidade(Date dataFimValidade) {
		this.dataFimValidade = dataFimValidade;
	}

	@Column(name = "ALTERADO_POR", length = 30)
	@Length(max = 30)
	public String getAlteradoPor() {
		return this.alteradoPor;
	}

	public void setAlteradoPor(String alteradoPor) {
		this.alteradoPor = alteradoPor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
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
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		FatValorDiariaInternacao other = (FatValorDiariaInternacao) obj;
		if (id == null) {
			if (other.id != null){
				return false;
			}
		} else if (!id.equals(other.id)){
			return false;
		}
		return true;
	}

	
	public enum Fields {
		DIN_SEQ("id.dinSeq"),
		DATA_INICIO_VALIDADE("id.dataInicioValidade"),
		DATA_FIM_VALIDADE("dataFimValidade"),
		DIARIA_INTERNACAO("fatDiariaInternacao"),
		;

		private String fields;

		private Fields(final String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}
}
