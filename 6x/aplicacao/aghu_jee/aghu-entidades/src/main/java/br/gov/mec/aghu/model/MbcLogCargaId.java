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
 * MbcLogCargaId generated by hbm2java
 */
@Embeddable
public class MbcLogCargaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -552855745428819323L;
	private String tabela;
	private String erro;
	private Date criadoEm;
	private String msg;
	private Integer version;

	public MbcLogCargaId() {
	}

	public MbcLogCargaId(Integer version) {
		this.version = version;
	}

	public MbcLogCargaId(String tabela, String erro, Date criadoEm, String msg, Integer version) {
		this.tabela = tabela;
		this.erro = erro;
		this.criadoEm = criadoEm;
		this.msg = msg;
		this.version = version;
	}

	@Column(name = "TABELA", length = 10)
	@Length(max = 10)
	public String getTabela() {
		return this.tabela;
	}

	public void setTabela(String tabela) {
		this.tabela = tabela;
	}

	@Column(name = "ERRO", length = 20)
	@Length(max = 20)
	public String getErro() {
		return this.erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "MSG", length = 100)
	@Length(max = 100)
	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
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
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getTabela());
		umHashCodeBuilder.append(this.getErro());
		umHashCodeBuilder.append(this.getMsg());
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
		if (!(obj instanceof MbcLogCargaId)) {
			return false;
		}
		MbcLogCargaId other = (MbcLogCargaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCriadoEm(), other.getCriadoEm());
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getTabela(), other.getTabela());
		umEqualsBuilder.append(this.getErro(), other.getErro());
		umEqualsBuilder.append(this.getMsg(), other.getMsg());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}