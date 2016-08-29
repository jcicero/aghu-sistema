package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name = "CLIENTE", schema = "AGH")
public class Cliente extends BaseEntityId<ClienteId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4801733899079445232L;
	private ClienteId id;

	public Cliente() {
	}

	public Cliente(ClienteId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "codCli", column = @Column(name = "COD_CLI", precision = 17, scale = 17)),
			@AttributeOverride(name = "nome", column = @Column(name = "NOME", length = 100)),
			@AttributeOverride(name = "cgc", column = @Column(name = "CGC", length = 20)),
			@AttributeOverride(name = "endereco", column = @Column(name = "ENDERECO", length = 100)),
			@AttributeOverride(name = "contatos", column = @Column(name = "CONTATOS", length = 250)),
			@AttributeOverride(name = "razao", column = @Column(name = "RAZAO", length = 100)),
			@AttributeOverride(name = "inscrEstadual", column = @Column(name = "INSCR_ESTADUAL", length = 20)),
			@AttributeOverride(name = "inscrMunicipal", column = @Column(name = "INSCR_MUNICIPAL", length = 20)),
			@AttributeOverride(name = "bairro", column = @Column(name = "BAIRRO", length = 30)),
			@AttributeOverride(name = "cidade", column = @Column(name = "CIDADE", length = 30)),
			@AttributeOverride(name = "uf", column = @Column(name = "UF", length = 2)),
			@AttributeOverride(name = "pais", column = @Column(name = "PAIS", length = 20)),
			@AttributeOverride(name = "cep", column = @Column(name = "CEP", length = 10)),
			@AttributeOverride(name = "ativo", column = @Column(name = "ATIVO", length = 1)),
			@AttributeOverride(name = "obs", column = @Column(name = "OBS", length = 1000)) })
	public ClienteId getId() {
		return this.id;
	}

	public void setId(ClienteId id) {
		this.id = id;
	}

	public enum Fields {

		ID("id");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Cliente)) {
			return false;
		}
		Cliente other = (Cliente) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
