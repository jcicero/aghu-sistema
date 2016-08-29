package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * RapTmpLocCargoGfipId generated by hbm2java
 */
@Embeddable
public class RapTmpLocCargoGfipId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2455598752908248522L;
	private Integer codStarh;
	private Date dataInicio;
	private Date dataFim;
	private Integer codOrganograma;
	private String local;
	private Integer codClh;
	private String cargo;
	private String codCbo2002;
	private Short gfip;
	private Integer version;

	public RapTmpLocCargoGfipId() {
	}

	public RapTmpLocCargoGfipId(Integer codStarh, Date dataInicio, Integer codOrganograma, Integer codClh, Short gfip, Integer version) {
		this.codStarh = codStarh;
		this.dataInicio = dataInicio;
		this.codOrganograma = codOrganograma;
		this.codClh = codClh;
		this.gfip = gfip;
		this.version = version;
	}

	public RapTmpLocCargoGfipId(Integer codStarh, Date dataInicio, Date dataFim, Integer codOrganograma, String local, Integer codClh,
			String cargo, String codCbo2002, Short gfip, Integer version) {
		this.codStarh = codStarh;
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.codOrganograma = codOrganograma;
		this.local = local;
		this.codClh = codClh;
		this.cargo = cargo;
		this.codCbo2002 = codCbo2002;
		this.gfip = gfip;
		this.version = version;
	}

	@Column(name = "COD_STARH", nullable = false)
	public Integer getCodStarh() {
		return this.codStarh;
	}

	public void setCodStarh(Integer codStarh) {
		this.codStarh = codStarh;
	}

	@Column(name = "DATA_INICIO", nullable = false, length = 29)
	public Date getDataInicio() {
		return this.dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	@Column(name = "DATA_FIM", length = 29)
	public Date getDataFim() {
		return this.dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	@Column(name = "COD_ORGANOGRAMA", nullable = false)
	public Integer getCodOrganograma() {
		return this.codOrganograma;
	}

	public void setCodOrganograma(Integer codOrganograma) {
		this.codOrganograma = codOrganograma;
	}

	@Column(name = "LOCAL", length = 60)
	@Length(max = 60)
	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Column(name = "COD_CLH", nullable = false)
	public Integer getCodClh() {
		return this.codClh;
	}

	public void setCodClh(Integer codClh) {
		this.codClh = codClh;
	}

	@Column(name = "CARGO", length = 100)
	@Length(max = 100)
	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Column(name = "COD_CBO_2002", length = 8)
	@Length(max = 8)
	public String getCodCbo2002() {
		return this.codCbo2002;
	}

	public void setCodCbo2002(String codCbo2002) {
		this.codCbo2002 = codCbo2002;
	}

	@Column(name = "GFIP", nullable = false)
	public Short getGfip() {
		return this.gfip;
	}

	public void setGfip(Short gfip) {
		this.gfip = gfip;
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
		umHashCodeBuilder.append(this.getDataFim());
		umHashCodeBuilder.append(this.getDataInicio());
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getLocal());
		umHashCodeBuilder.append(this.getCargo());
		umHashCodeBuilder.append(this.getCodStarh());
		umHashCodeBuilder.append(this.getGfip());
		umHashCodeBuilder.append(this.getCodOrganograma());
		umHashCodeBuilder.append(this.getCodClh());
		umHashCodeBuilder.append(this.getCodCbo2002());
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
		if (!(obj instanceof RapTmpLocCargoGfipId)) {
			return false;
		}
		RapTmpLocCargoGfipId other = (RapTmpLocCargoGfipId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getDataFim(), other.getDataFim());
		umEqualsBuilder.append(this.getDataInicio(), other.getDataInicio());
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getLocal(), other.getLocal());
		umEqualsBuilder.append(this.getCargo(), other.getCargo());
		umEqualsBuilder.append(this.getCodStarh(), other.getCodStarh());
		umEqualsBuilder.append(this.getGfip(), other.getGfip());
		umEqualsBuilder.append(this.getCodOrganograma(), other.getCodOrganograma());
		umEqualsBuilder.append(this.getCodClh(), other.getCodClh());
		umEqualsBuilder.append(this.getCodCbo2002(), other.getCodCbo2002());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
