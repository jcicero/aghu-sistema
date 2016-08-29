package br.gov.mec.aghu.model;

// Generated 05/04/2011 11:18:40 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * VMmPessoaServidoresId generated by hbm2java
 */
@Embeddable
public class VMamPessoaServidoresId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6750451660062136703L;
	/**
	 * 
	 */
	
	private Short vinCodigo;	
	private Integer matricula;
	private Integer pesCodigo;
	private String pesNome;		
	private Date dataInicioVinculo;
	private DominioSituacao situacao;

	public VMamPessoaServidoresId() {
	}

	public VMamPessoaServidoresId(Short vinCodigo, Byte plano, String descConv,
			Integer pesCodigo, String pesNome, Integer matricula, Date dataInicioVinculo, 
			Date dataFimVinculo, DominioSituacao situacao) {
		this.vinCodigo = vinCodigo;	
		this.pesCodigo = pesCodigo;
		this.pesNome = pesNome;
		this.matricula = matricula;
		this.dataInicioVinculo = dataInicioVinculo;	
		this.situacao = situacao;
			
	}
	

	@Column(name = "VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getVinCodigo() {
		return this.vinCodigo;
	}

	public void setVinCodigo(Short vinCodigo) {
		this.vinCodigo = vinCodigo;
	}

	@Column(name = "MATRICULA", nullable = false, length = 60)
	public Integer getMatricula() {
		return this.matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	@Column(name = "PES_CODIGO",nullable = false)
	public Integer getPesCodigo() {
		return pesCodigo;
	}

	public void setPesCodigo(Integer pesCodigo) {
		this.pesCodigo = pesCodigo;
	}

	@Column(name = "PES_NOME", length = 60)
	public String getPesNome() {
		return this.pesNome;
	}
	
	public void setPesNome(String pesNome) {
		this.pesNome = pesNome;
	}	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO_VINCULO", nullable = false)
	public Date getDataInicioVinculo() {
		return dataInicioVinculo;
	}

	public void setDataInicioVinculo(Date dataInicioVinculo) {
		this.dataInicioVinculo = dataInicioVinculo;
	}
		
	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();	
		umHashCodeBuilder.append(this.getVinCodigo());
		umHashCodeBuilder.append(this.getPesCodigo());
		umHashCodeBuilder.append(this.getPesNome());
		umHashCodeBuilder.append(this.getMatricula());
		umHashCodeBuilder.append(this.getDataInicioVinculo());
		umHashCodeBuilder.append(this.getSituacao());
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
		if (!(obj instanceof VMamPessoaServidoresId)) {
			return false;
		}
		VMamPessoaServidoresId other = (VMamPessoaServidoresId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getVinCodigo(), other.getVinCodigo());
		umEqualsBuilder.append(this.getPesCodigo(), other.getPesCodigo());
		umEqualsBuilder.append(this.getPesNome(), other.getPesNome());
		umEqualsBuilder.append(this.getMatricula(), other.getMatricula());
		umEqualsBuilder.append(this.getDataInicioVinculo(), other.getDataInicioVinculo());
		umEqualsBuilder.append(this.getSituacao(), other.getSituacao());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
