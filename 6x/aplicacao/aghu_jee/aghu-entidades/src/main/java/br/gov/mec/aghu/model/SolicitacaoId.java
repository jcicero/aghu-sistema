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
 * SolicitacaoId generated by hbm2java
 */
@Embeddable
public class SolicitacaoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7558878019270842136L;
	private Double idsolicitacao;
	private String nome;
	private String matricula;
	private String cpf;
	private String area;
	private String ramal;
	private String email;
	private String vinculo;
	private Date data;

	public SolicitacaoId() {
	}

	public SolicitacaoId(Double idsolicitacao, String nome, String matricula, String cpf, String area, String ramal, String email,
			String vinculo, Date data) {
		this.idsolicitacao = idsolicitacao;
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
		this.area = area;
		this.ramal = ramal;
		this.email = email;
		this.vinculo = vinculo;
		this.data = data;
	}

	@Column(name = "IDSOLICITACAO", precision = 17, scale = 17)
	public Double getIdsolicitacao() {
		return this.idsolicitacao;
	}

	public void setIdsolicitacao(Double idsolicitacao) {
		this.idsolicitacao = idsolicitacao;
	}

	@Column(name = "NOME", length = 100)
	@Length(max = 100)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "MATRICULA", length = 10)
	@Length(max = 10)
	public String getMatricula() {
		return this.matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Column(name = "CPF", length = 11)
	@Length(max = 11)
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Column(name = "AREA", length = 60)
	@Length(max = 60)
	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Column(name = "RAMAL", length = 100)
	@Length(max = 100)
	public String getRamal() {
		return this.ramal;
	}

	public void setRamal(String ramal) {
		this.ramal = ramal;
	}

	@Column(name = "EMAIL", length = 100)
	@Length(max = 100)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "VINCULO", length = 1)
	@Length(max = 1)
	public String getVinculo() {
		return this.vinculo;
	}

	public void setVinculo(String vinculo) {
		this.vinculo = vinculo;
	}

	@Column(name = "DATA", length = 29)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getData());
		umHashCodeBuilder.append(this.getMatricula());
		umHashCodeBuilder.append(this.getNome());
		umHashCodeBuilder.append(this.getEmail());
		umHashCodeBuilder.append(this.getArea());
		umHashCodeBuilder.append(this.getCpf());
		umHashCodeBuilder.append(this.getRamal());
		umHashCodeBuilder.append(this.getVinculo());
		umHashCodeBuilder.append(this.getIdsolicitacao());
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
		if (!(obj instanceof SolicitacaoId)) {
			return false;
		}
		SolicitacaoId other = (SolicitacaoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getData(), other.getData());
		umEqualsBuilder.append(this.getMatricula(), other.getMatricula());
		umEqualsBuilder.append(this.getNome(), other.getNome());
		umEqualsBuilder.append(this.getEmail(), other.getEmail());
		umEqualsBuilder.append(this.getArea(), other.getArea());
		umEqualsBuilder.append(this.getCpf(), other.getCpf());
		umEqualsBuilder.append(this.getRamal(), other.getRamal());
		umEqualsBuilder.append(this.getVinculo(), other.getVinculo());
		umEqualsBuilder.append(this.getIdsolicitacao(), other.getIdsolicitacao());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
