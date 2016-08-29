package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * EstacaoId generated by hbm2java
 */
@Embeddable
public class EstacaoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7780964115916424329L;
	private Double codEst;
	private Double codLoc;
	private String nomeEst;
	private Double ramal;
	private Character prioridade;
	private String usuario;
	private String ip;
	private String ponto;
	private Double codCr;
	private String grupo;
	private Character ativo;
	private Double codAss;
	private Character operacional;
	private String observacoes;
	private Integer version;

	public EstacaoId() {
	}

	public EstacaoId(Integer version) {
		this.version = version;
	}

	public EstacaoId(Double codEst, Double codLoc, String nomeEst, Double ramal, Character prioridade, String usuario, String ip,
			String ponto, Double codCr, String grupo, Character ativo, Double codAss, Character operacional, String observacoes,
			Integer version) {
		this.codEst = codEst;
		this.codLoc = codLoc;
		this.nomeEst = nomeEst;
		this.ramal = ramal;
		this.prioridade = prioridade;
		this.usuario = usuario;
		this.ip = ip;
		this.ponto = ponto;
		this.codCr = codCr;
		this.grupo = grupo;
		this.ativo = ativo;
		this.codAss = codAss;
		this.operacional = operacional;
		this.observacoes = observacoes;
		this.version = version;
	}

	@Column(name = "COD_EST", precision = 17, scale = 17)
	public Double getCodEst() {
		return this.codEst;
	}

	public void setCodEst(Double codEst) {
		this.codEst = codEst;
	}

	@Column(name = "COD_LOC", precision = 17, scale = 17)
	public Double getCodLoc() {
		return this.codLoc;
	}

	public void setCodLoc(Double codLoc) {
		this.codLoc = codLoc;
	}

	@Column(name = "NOME_EST", length = 20)
	@Length(max = 20)
	public String getNomeEst() {
		return this.nomeEst;
	}

	public void setNomeEst(String nomeEst) {
		this.nomeEst = nomeEst;
	}

	@Column(name = "RAMAL", precision = 17, scale = 17)
	public Double getRamal() {
		return this.ramal;
	}

	public void setRamal(Double ramal) {
		this.ramal = ramal;
	}

	@Column(name = "PRIORIDADE", length = 1)
	public Character getPrioridade() {
		return this.prioridade;
	}

	public void setPrioridade(Character prioridade) {
		this.prioridade = prioridade;
	}

	@Column(name = "USUARIO", length = 40)
	@Length(max = 40)
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Column(name = "IP", length = 16)
	@Length(max = 16)
	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	@Column(name = "PONTO", length = 15)
	@Length(max = 15)
	public String getPonto() {
		return this.ponto;
	}

	public void setPonto(String ponto) {
		this.ponto = ponto;
	}

	@Column(name = "COD_CR", precision = 17, scale = 17)
	public Double getCodCr() {
		return this.codCr;
	}

	public void setCodCr(Double codCr) {
		this.codCr = codCr;
	}

	@Column(name = "GRUPO", length = 20)
	@Length(max = 20)
	public String getGrupo() {
		return this.grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Column(name = "ATIVO", length = 1)
	public Character getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Character ativo) {
		this.ativo = ativo;
	}

	@Column(name = "COD_ASS", precision = 17, scale = 17)
	public Double getCodAss() {
		return this.codAss;
	}

	public void setCodAss(Double codAss) {
		this.codAss = codAss;
	}

	@Column(name = "OPERACIONAL", length = 1)
	public Character getOperacional() {
		return this.operacional;
	}

	public void setOperacional(Character operacional) {
		this.operacional = operacional;
	}

	@Column(name = "OBSERVACOES", length = 240)
	@Length(max = 240)
	public String getObservacoes() {
		return this.observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
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
		umHashCodeBuilder.append(this.getGrupo());
		umHashCodeBuilder.append(this.getObservacoes());
		umHashCodeBuilder.append(this.getPrioridade());
		umHashCodeBuilder.append(this.getCodAss());
		umHashCodeBuilder.append(this.getAtivo());
		umHashCodeBuilder.append(this.getCodEst());
		umHashCodeBuilder.append(this.getCodLoc());
		umHashCodeBuilder.append(this.getRamal());
		umHashCodeBuilder.append(this.getUsuario());
		umHashCodeBuilder.append(this.getIp());
		umHashCodeBuilder.append(this.getPonto());
		umHashCodeBuilder.append(this.getCodCr());
		umHashCodeBuilder.append(this.getNomeEst());
		umHashCodeBuilder.append(this.getOperacional());
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
		if (!(obj instanceof EstacaoId)) {
			return false;
		}
		EstacaoId other = (EstacaoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getGrupo(), other.getGrupo());
		umEqualsBuilder.append(this.getObservacoes(), other.getObservacoes());
		umEqualsBuilder.append(this.getPrioridade(), other.getPrioridade());
		umEqualsBuilder.append(this.getCodAss(), other.getCodAss());
		umEqualsBuilder.append(this.getAtivo(), other.getAtivo());
		umEqualsBuilder.append(this.getCodEst(), other.getCodEst());
		umEqualsBuilder.append(this.getCodLoc(), other.getCodLoc());
		umEqualsBuilder.append(this.getRamal(), other.getRamal());
		umEqualsBuilder.append(this.getUsuario(), other.getUsuario());
		umEqualsBuilder.append(this.getIp(), other.getIp());
		umEqualsBuilder.append(this.getPonto(), other.getPonto());
		umEqualsBuilder.append(this.getCodCr(), other.getCodCr());
		umEqualsBuilder.append(this.getNomeEst(), other.getNomeEst());
		umEqualsBuilder.append(this.getOperacional(), other.getOperacional());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
