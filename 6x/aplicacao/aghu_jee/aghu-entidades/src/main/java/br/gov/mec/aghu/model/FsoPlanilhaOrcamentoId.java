package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FsoPlanilhaOrcamentoId generated by hbm2java
 */
@Embeddable
public class FsoPlanilhaOrcamentoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7116803735846900421L;
	private Date dtCompetencia;
	private Short ntpGnpTabCodigo;
	private Integer ntpGnpCodigo;
	private Short ntpCodigo;
	private Short ntpSubCodigo;
	private Long fonteRecurso;
	private Short projInst;
	private Double realizado;
	private Double orcado;
	private Double alteracao;
	private Double saldo;
	private Double acumulado;
	private Short tfxCodigo;
	private Double orcadoAcumulado;
	private Integer avaliador;
	private Double metaVpa;
	private Short vincAvaliador;
	private Integer version;

	public FsoPlanilhaOrcamentoId() {
	}

	public FsoPlanilhaOrcamentoId(Date dtCompetencia, Short ntpGnpTabCodigo, Integer ntpGnpCodigo, Short ntpCodigo, Short ntpSubCodigo,
			Long fonteRecurso, Short projInst, Integer version) {
		this.dtCompetencia = dtCompetencia;
		this.ntpGnpTabCodigo = ntpGnpTabCodigo;
		this.ntpGnpCodigo = ntpGnpCodigo;
		this.ntpCodigo = ntpCodigo;
		this.ntpSubCodigo = ntpSubCodigo;
		this.fonteRecurso = fonteRecurso;
		this.projInst = projInst;
		this.version = version;
	}

	public FsoPlanilhaOrcamentoId(Date dtCompetencia, Short ntpGnpTabCodigo, Integer ntpGnpCodigo, Short ntpCodigo, Short ntpSubCodigo,
			Long fonteRecurso, Short projInst, Double realizado, Double orcado, Double alteracao, Double saldo, Double acumulado,
			Short tfxCodigo, Double orcadoAcumulado, Integer avaliador, Double metaVpa, Short vincAvaliador, Integer version) {
		this.dtCompetencia = dtCompetencia;
		this.ntpGnpTabCodigo = ntpGnpTabCodigo;
		this.ntpGnpCodigo = ntpGnpCodigo;
		this.ntpCodigo = ntpCodigo;
		this.ntpSubCodigo = ntpSubCodigo;
		this.fonteRecurso = fonteRecurso;
		this.projInst = projInst;
		this.realizado = realizado;
		this.orcado = orcado;
		this.alteracao = alteracao;
		this.saldo = saldo;
		this.acumulado = acumulado;
		this.tfxCodigo = tfxCodigo;
		this.orcadoAcumulado = orcadoAcumulado;
		this.avaliador = avaliador;
		this.metaVpa = metaVpa;
		this.vincAvaliador = vincAvaliador;
		this.version = version;
	}

	@Column(name = "DT_COMPETENCIA", nullable = false, length = 29)
	public Date getDtCompetencia() {
		return this.dtCompetencia;
	}

	public void setDtCompetencia(Date dtCompetencia) {
		this.dtCompetencia = dtCompetencia;
	}

	@Column(name = "NTP_GNP_TAB_CODIGO", nullable = false)
	public Short getNtpGnpTabCodigo() {
		return this.ntpGnpTabCodigo;
	}

	public void setNtpGnpTabCodigo(Short ntpGnpTabCodigo) {
		this.ntpGnpTabCodigo = ntpGnpTabCodigo;
	}

	@Column(name = "NTP_GNP_CODIGO", nullable = false)
	public Integer getNtpGnpCodigo() {
		return this.ntpGnpCodigo;
	}

	public void setNtpGnpCodigo(Integer ntpGnpCodigo) {
		this.ntpGnpCodigo = ntpGnpCodigo;
	}

	@Column(name = "NTP_CODIGO", nullable = false)
	public Short getNtpCodigo() {
		return this.ntpCodigo;
	}

	public void setNtpCodigo(Short ntpCodigo) {
		this.ntpCodigo = ntpCodigo;
	}

	@Column(name = "NTP_SUB_CODIGO", nullable = false)
	public Short getNtpSubCodigo() {
		return this.ntpSubCodigo;
	}

	public void setNtpSubCodigo(Short ntpSubCodigo) {
		this.ntpSubCodigo = ntpSubCodigo;
	}

	@Column(name = "FONTE_RECURSO", nullable = false)
	public Long getFonteRecurso() {
		return this.fonteRecurso;
	}

	public void setFonteRecurso(Long fonteRecurso) {
		this.fonteRecurso = fonteRecurso;
	}

	@Column(name = "PROJ_INST", nullable = false)
	public Short getProjInst() {
		return this.projInst;
	}

	public void setProjInst(Short projInst) {
		this.projInst = projInst;
	}

	@Column(name = "REALIZADO", precision = 17, scale = 17)
	public Double getRealizado() {
		return this.realizado;
	}

	public void setRealizado(Double realizado) {
		this.realizado = realizado;
	}

	@Column(name = "ORCADO", precision = 17, scale = 17)
	public Double getOrcado() {
		return this.orcado;
	}

	public void setOrcado(Double orcado) {
		this.orcado = orcado;
	}

	@Column(name = "ALTERACAO", precision = 17, scale = 17)
	public Double getAlteracao() {
		return this.alteracao;
	}

	public void setAlteracao(Double alteracao) {
		this.alteracao = alteracao;
	}

	@Column(name = "SALDO", precision = 17, scale = 17)
	public Double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	@Column(name = "ACUMULADO", precision = 17, scale = 17)
	public Double getAcumulado() {
		return this.acumulado;
	}

	public void setAcumulado(Double acumulado) {
		this.acumulado = acumulado;
	}

	@Column(name = "TFX_CODIGO")
	public Short getTfxCodigo() {
		return this.tfxCodigo;
	}

	public void setTfxCodigo(Short tfxCodigo) {
		this.tfxCodigo = tfxCodigo;
	}

	@Column(name = "ORCADO_ACUMULADO", precision = 17, scale = 17)
	public Double getOrcadoAcumulado() {
		return this.orcadoAcumulado;
	}

	public void setOrcadoAcumulado(Double orcadoAcumulado) {
		this.orcadoAcumulado = orcadoAcumulado;
	}

	@Column(name = "AVALIADOR")
	public Integer getAvaliador() {
		return this.avaliador;
	}

	public void setAvaliador(Integer avaliador) {
		this.avaliador = avaliador;
	}

	@Column(name = "META_VPA", precision = 17, scale = 17)
	public Double getMetaVpa() {
		return this.metaVpa;
	}

	public void setMetaVpa(Double metaVpa) {
		this.metaVpa = metaVpa;
	}

	@Column(name = "VINC_AVALIADOR")
	public Short getVincAvaliador() {
		return this.vincAvaliador;
	}

	public void setVincAvaliador(Short vincAvaliador) {
		this.vincAvaliador = vincAvaliador;
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
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getNtpGnpTabCodigo());
		umHashCodeBuilder.append(this.getNtpGnpCodigo());
		umHashCodeBuilder.append(this.getNtpCodigo());
		umHashCodeBuilder.append(this.getDtCompetencia());
		umHashCodeBuilder.append(this.getSaldo());
		umHashCodeBuilder.append(this.getNtpSubCodigo());
		umHashCodeBuilder.append(this.getFonteRecurso());
		umHashCodeBuilder.append(this.getProjInst());
		umHashCodeBuilder.append(this.getRealizado());
		umHashCodeBuilder.append(this.getOrcado());
		umHashCodeBuilder.append(this.getAlteracao());
		umHashCodeBuilder.append(this.getAcumulado());
		umHashCodeBuilder.append(this.getTfxCodigo());
		umHashCodeBuilder.append(this.getOrcadoAcumulado());
		umHashCodeBuilder.append(this.getAvaliador());
		umHashCodeBuilder.append(this.getMetaVpa());
		umHashCodeBuilder.append(this.getVincAvaliador());
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
		if (!(obj instanceof FsoPlanilhaOrcamentoId)) {
			return false;
		}
		FsoPlanilhaOrcamentoId other = (FsoPlanilhaOrcamentoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getNtpGnpTabCodigo(), other.getNtpGnpTabCodigo());
		umEqualsBuilder.append(this.getNtpGnpCodigo(), other.getNtpGnpCodigo());
		umEqualsBuilder.append(this.getNtpCodigo(), other.getNtpCodigo());
		umEqualsBuilder.append(this.getDtCompetencia(), other.getDtCompetencia());
		umEqualsBuilder.append(this.getSaldo(), other.getSaldo());
		umEqualsBuilder.append(this.getNtpSubCodigo(), other.getNtpSubCodigo());
		umEqualsBuilder.append(this.getFonteRecurso(), other.getFonteRecurso());
		umEqualsBuilder.append(this.getProjInst(), other.getProjInst());
		umEqualsBuilder.append(this.getRealizado(), other.getRealizado());
		umEqualsBuilder.append(this.getOrcado(), other.getOrcado());
		umEqualsBuilder.append(this.getAlteracao(), other.getAlteracao());
		umEqualsBuilder.append(this.getAcumulado(), other.getAcumulado());
		umEqualsBuilder.append(this.getTfxCodigo(), other.getTfxCodigo());
		umEqualsBuilder.append(this.getOrcadoAcumulado(), other.getOrcadoAcumulado());
		umEqualsBuilder.append(this.getAvaliador(), other.getAvaliador());
		umEqualsBuilder.append(this.getMetaVpa(), other.getMetaVpa());
		umEqualsBuilder.append(this.getVincAvaliador(), other.getVincAvaliador());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}