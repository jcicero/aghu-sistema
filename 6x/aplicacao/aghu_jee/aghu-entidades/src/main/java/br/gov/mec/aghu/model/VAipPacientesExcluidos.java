package br.gov.mec.aghu.model;

// Generated 02/03/2010 12:26:46 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * VAipPacientesExcluidos generated by hbm2java
 */
@Entity
@Table(name = "V_AIP_PACIENTES_EXCLUIDOS", schema = "AGH")
@Immutable
public class VAipPacientesExcluidos extends BaseEntityId<VAipPacientesExcluidosId> implements java.io.Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9039247153611076383L;
	private VAipPacientesExcluidosId id;

	public VAipPacientesExcluidos() {
	}

	public VAipPacientesExcluidos(VAipPacientesExcluidosId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "dtExclusao", column = @Column(name = "DT_EXCLUSAO", length = 7)),
			@AttributeOverride(name = "codigoAtual", column = @Column(name = "CODIGO_ATUAL", precision = 22, scale = 0)),
			@AttributeOverride(name = "prontuarioAtual", column = @Column(name = "PRONTUARIO_ATUAL", precision = 22, scale = 0)),
			@AttributeOverride(name = "nome", column = @Column(name = "NOME", length = 50)),
			@AttributeOverride(name = "dtNascimento", column = @Column(name = "DT_NASCIMENTO", length = 7)),
			@AttributeOverride(name = "codigoAntigo", column = @Column(name = "CODIGO_ANTIGO", precision = 8, scale = 0)),
			@AttributeOverride(name = "prontuarioAntigo", column = @Column(name = "PRONTUARIO_ANTIGO", precision = 8, scale = 0)) })
	public VAipPacientesExcluidosId getId() {
		return this.id;
	}

	public void setId(VAipPacientesExcluidosId id) {
		this.id = id;
	}

	public enum Fields {

		DATA_NASCIMENTO("id.dtNascimento"), DATA_EXCLUSAO("id.dtExclusao"), PRONT_EXCL(
				"id.prontuarioAntigo"), PRONT_ATUAL("id.prontuarioAtual"), NOME(
				"id.nome"), COD_ATUAL("id.codigoAtual");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
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
		if (!(obj instanceof VAipPacientesExcluidos)) {
			return false;
		}
		VAipPacientesExcluidos other = (VAipPacientesExcluidos) obj;
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
