package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * ClienteId generated by hbm2java
 */
@Embeddable
public class ClienteId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -152978040823729467L;
	private Double codCli;
	private String nome;
	private String cgc;
	private String endereco;
	private String contatos;
	private String razao;
	private String inscrEstadual;
	private String inscrMunicipal;
	private String bairro;
	private String cidade;
	private String uf;
	private String pais;
	private String cep;
	private Character ativo;
	private String obs;

	public ClienteId() {
	}

	public ClienteId(Double codCli, String nome, String cgc, String endereco, String contatos, String razao, String inscrEstadual,
			String inscrMunicipal, String bairro, String cidade, String uf, String pais, String cep, Character ativo, String obs) {
		this.codCli = codCli;
		this.nome = nome;
		this.cgc = cgc;
		this.endereco = endereco;
		this.contatos = contatos;
		this.razao = razao;
		this.inscrEstadual = inscrEstadual;
		this.inscrMunicipal = inscrMunicipal;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.pais = pais;
		this.cep = cep;
		this.ativo = ativo;
		this.obs = obs;
	}

	@Column(name = "COD_CLI", precision = 17, scale = 17)
	public Double getCodCli() {
		return this.codCli;
	}

	public void setCodCli(Double codCli) {
		this.codCli = codCli;
	}

	@Column(name = "NOME", length = 100)
	@Length(max = 100)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "CGC", length = 20)
	@Length(max = 20)
	public String getCgc() {
		return this.cgc;
	}

	public void setCgc(String cgc) {
		this.cgc = cgc;
	}

	@Column(name = "ENDERECO", length = 100)
	@Length(max = 100)
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Column(name = "CONTATOS", length = 250)
	@Length(max = 250)
	public String getContatos() {
		return this.contatos;
	}

	public void setContatos(String contatos) {
		this.contatos = contatos;
	}

	@Column(name = "RAZAO", length = 100)
	@Length(max = 100)
	public String getRazao() {
		return this.razao;
	}

	public void setRazao(String razao) {
		this.razao = razao;
	}

	@Column(name = "INSCR_ESTADUAL", length = 20)
	@Length(max = 20)
	public String getInscrEstadual() {
		return this.inscrEstadual;
	}

	public void setInscrEstadual(String inscrEstadual) {
		this.inscrEstadual = inscrEstadual;
	}

	@Column(name = "INSCR_MUNICIPAL", length = 20)
	@Length(max = 20)
	public String getInscrMunicipal() {
		return this.inscrMunicipal;
	}

	public void setInscrMunicipal(String inscrMunicipal) {
		this.inscrMunicipal = inscrMunicipal;
	}

	@Column(name = "BAIRRO", length = 30)
	@Length(max = 30)
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Column(name = "CIDADE", length = 30)
	@Length(max = 30)
	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Column(name = "UF", length = 2)
	@Length(max = 2)
	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Column(name = "PAIS", length = 20)
	@Length(max = 20)
	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Column(name = "CEP", length = 10)
	@Length(max = 10)
	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Column(name = "ATIVO", length = 1)
	public Character getAtivo() {
		return this.ativo;
	}

	public void setAtivo(Character ativo) {
		this.ativo = ativo;
	}

	@Column(name = "OBS", length = 1000)
	@Length(max = 1000)
	public String getObs() {
		return this.obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getNome());
		umHashCodeBuilder.append(this.getCep());
		umHashCodeBuilder.append(this.getBairro());
		umHashCodeBuilder.append(this.getCidade());
		umHashCodeBuilder.append(this.getPais());
		umHashCodeBuilder.append(this.getUf());
		umHashCodeBuilder.append(this.getObs());
		umHashCodeBuilder.append(this.getAtivo());
		umHashCodeBuilder.append(this.getCodCli());
		umHashCodeBuilder.append(this.getEndereco());
		umHashCodeBuilder.append(this.getCgc());
		umHashCodeBuilder.append(this.getContatos());
		umHashCodeBuilder.append(this.getRazao());
		umHashCodeBuilder.append(this.getInscrEstadual());
		umHashCodeBuilder.append(this.getInscrMunicipal());
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
		if (!(obj instanceof ClienteId)) {
			return false;
		}
		ClienteId other = (ClienteId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getNome(), other.getNome());
		umEqualsBuilder.append(this.getCep(), other.getCep());
		umEqualsBuilder.append(this.getBairro(), other.getBairro());
		umEqualsBuilder.append(this.getCidade(), other.getCidade());
		umEqualsBuilder.append(this.getPais(), other.getPais());
		umEqualsBuilder.append(this.getUf(), other.getUf());
		umEqualsBuilder.append(this.getObs(), other.getObs());
		umEqualsBuilder.append(this.getAtivo(), other.getAtivo());
		umEqualsBuilder.append(this.getCodCli(), other.getCodCli());
		umEqualsBuilder.append(this.getEndereco(), other.getEndereco());
		umEqualsBuilder.append(this.getCgc(), other.getCgc());
		umEqualsBuilder.append(this.getContatos(), other.getContatos());
		umEqualsBuilder.append(this.getRazao(), other.getRazao());
		umEqualsBuilder.append(this.getInscrEstadual(), other.getInscrEstadual());
		umEqualsBuilder.append(this.getInscrMunicipal(), other.getInscrMunicipal());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
