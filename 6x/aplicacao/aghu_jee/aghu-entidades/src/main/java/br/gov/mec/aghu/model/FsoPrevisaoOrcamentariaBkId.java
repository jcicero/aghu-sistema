package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FsoPrevisaoOrcamentariaBkId generated by hbm2java
 */
@Embeddable
public class FsoPrevisaoOrcamentariaBkId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6785740377373863063L;
	private Short cvfCodigo;
	private Date exoExercicio;
	private Short seqp;
	private Integer gndCodigo;
	private Integer ntdGndCodigo;
	private Short ntdCodigo;
	private Double valorOrcado;
	private Double valorComprometido;
	private Double valorRealizado;
	private Date criadoEm;
	private Date alteradoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Integer serMatriculaAlterado;
	private Short serVinCodigoAlterado;
	private Long ptbCodigo;
	private Integer version;

	public FsoPrevisaoOrcamentariaBkId() {
	}

	public FsoPrevisaoOrcamentariaBkId(Short cvfCodigo, Date exoExercicio, Short seqp, Date criadoEm, Integer serMatricula,
			Short serVinCodigo, Integer version) {
		this.cvfCodigo = cvfCodigo;
		this.exoExercicio = exoExercicio;
		this.seqp = seqp;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.version = version;
	}

	public FsoPrevisaoOrcamentariaBkId(Short cvfCodigo, Date exoExercicio, Short seqp, Integer gndCodigo, Integer ntdGndCodigo,
			Short ntdCodigo, Double valorOrcado, Double valorComprometido, Double valorRealizado, Date criadoEm, Date alteradoEm,
			Integer serMatricula, Short serVinCodigo, Integer serMatriculaAlterado, Short serVinCodigoAlterado, Long ptbCodigo, Integer version) {
		this.cvfCodigo = cvfCodigo;
		this.exoExercicio = exoExercicio;
		this.seqp = seqp;
		this.gndCodigo = gndCodigo;
		this.ntdGndCodigo = ntdGndCodigo;
		this.ntdCodigo = ntdCodigo;
		this.valorOrcado = valorOrcado;
		this.valorComprometido = valorComprometido;
		this.valorRealizado = valorRealizado;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.serMatriculaAlterado = serMatriculaAlterado;
		this.serVinCodigoAlterado = serVinCodigoAlterado;
		this.ptbCodigo = ptbCodigo;
		this.version = version;
	}

	@Column(name = "CVF_CODIGO", nullable = false)
	public Short getCvfCodigo() {
		return this.cvfCodigo;
	}

	public void setCvfCodigo(Short cvfCodigo) {
		this.cvfCodigo = cvfCodigo;
	}

	@Column(name = "EXO_EXERCICIO", nullable = false, length = 29)
	public Date getExoExercicio() {
		return this.exoExercicio;
	}

	public void setExoExercicio(Date exoExercicio) {
		this.exoExercicio = exoExercicio;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Column(name = "GND_CODIGO")
	public Integer getGndCodigo() {
		return this.gndCodigo;
	}

	public void setGndCodigo(Integer gndCodigo) {
		this.gndCodigo = gndCodigo;
	}

	@Column(name = "NTD_GND_CODIGO")
	public Integer getNtdGndCodigo() {
		return this.ntdGndCodigo;
	}

	public void setNtdGndCodigo(Integer ntdGndCodigo) {
		this.ntdGndCodigo = ntdGndCodigo;
	}

	@Column(name = "NTD_CODIGO")
	public Short getNtdCodigo() {
		return this.ntdCodigo;
	}

	public void setNtdCodigo(Short ntdCodigo) {
		this.ntdCodigo = ntdCodigo;
	}

	@Column(name = "VALOR_ORCADO", precision = 17, scale = 17)
	public Double getValorOrcado() {
		return this.valorOrcado;
	}

	public void setValorOrcado(Double valorOrcado) {
		this.valorOrcado = valorOrcado;
	}

	@Column(name = "VALOR_COMPROMETIDO", precision = 17, scale = 17)
	public Double getValorComprometido() {
		return this.valorComprometido;
	}

	public void setValorComprometido(Double valorComprometido) {
		this.valorComprometido = valorComprometido;
	}

	@Column(name = "VALOR_REALIZADO", precision = 17, scale = 17)
	public Double getValorRealizado() {
		return this.valorRealizado;
	}

	public void setValorRealizado(Double valorRealizado) {
		this.valorRealizado = valorRealizado;
	}

	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "SER_MATRICULA", nullable = false)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "SER_MATRICULA_ALTERADO")
	public Integer getSerMatriculaAlterado() {
		return this.serMatriculaAlterado;
	}

	public void setSerMatriculaAlterado(Integer serMatriculaAlterado) {
		this.serMatriculaAlterado = serMatriculaAlterado;
	}

	@Column(name = "SER_VIN_CODIGO_ALTERADO")
	public Short getSerVinCodigoAlterado() {
		return this.serVinCodigoAlterado;
	}

	public void setSerVinCodigoAlterado(Short serVinCodigoAlterado) {
		this.serVinCodigoAlterado = serVinCodigoAlterado;
	}

	@Column(name = "PTB_CODIGO")
	public Long getPtbCodigo() {
		return this.ptbCodigo;
	}

	public void setPtbCodigo(Long ptbCodigo) {
		this.ptbCodigo = ptbCodigo;
	}

	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCriadoEm());
		umHashCodeBuilder.append(this.getSerMatricula());
		umHashCodeBuilder.append(this.getSerVinCodigo());
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getAlteradoEm());
		umHashCodeBuilder.append(this.getSeqp());
		umHashCodeBuilder.append(this.getValorRealizado());
		umHashCodeBuilder.append(this.getCvfCodigo());
		umHashCodeBuilder.append(this.getGndCodigo());
		umHashCodeBuilder.append(this.getPtbCodigo());
		umHashCodeBuilder.append(this.getSerMatriculaAlterado());
		umHashCodeBuilder.append(this.getSerVinCodigoAlterado());
		umHashCodeBuilder.append(this.getNtdCodigo());
		umHashCodeBuilder.append(this.getNtdGndCodigo());
		umHashCodeBuilder.append(this.getExoExercicio());
		umHashCodeBuilder.append(this.getValorComprometido());
		umHashCodeBuilder.append(this.getValorOrcado());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof FsoPrevisaoOrcamentariaBkId)) {
			return false;
		}
		FsoPrevisaoOrcamentariaBkId other = (FsoPrevisaoOrcamentariaBkId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCriadoEm(), other.getCriadoEm());
		umEqualsBuilder.append(this.getSerMatricula(), other.getSerMatricula());
		umEqualsBuilder.append(this.getSerVinCodigo(), other.getSerVinCodigo());
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getAlteradoEm(), other.getAlteradoEm());
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getValorRealizado(), other.getValorRealizado());
		umEqualsBuilder.append(this.getCvfCodigo(), other.getCvfCodigo());
		umEqualsBuilder.append(this.getGndCodigo(), other.getGndCodigo());
		umEqualsBuilder.append(this.getPtbCodigo(), other.getPtbCodigo());
		umEqualsBuilder.append(this.getSerMatriculaAlterado(), other.getSerMatriculaAlterado());
		umEqualsBuilder.append(this.getSerVinCodigoAlterado(), other.getSerVinCodigoAlterado());
		umEqualsBuilder.append(this.getNtdCodigo(), other.getNtdCodigo());
		umEqualsBuilder.append(this.getNtdGndCodigo(), other.getNtdGndCodigo());
		umEqualsBuilder.append(this.getExoExercicio(), other.getExoExercicio());
		umEqualsBuilder.append(this.getValorComprometido(), other.getValorComprometido());
		umEqualsBuilder.append(this.getValorOrcado(), other.getValorOrcado());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
