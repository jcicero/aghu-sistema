package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * CseTipoConexPerfil generated by hbm2java
 */
@Entity
@SequenceGenerator(name="cseTcpSq1", sequenceName="AGH.CSE_TCP_SQ1", allocationSize = 1)
@Table(name = "CSE_TIPO_CONEX_PERFIS", schema = "AGH")
public class CseTipoConexPerfil extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8311974260287628457L;
	private Short seq;
	private Integer version;
	private String instancia;
	private String tipo;
	private String tablespaceDefault;
	private String tablespaceTemporario;

	public CseTipoConexPerfil() {
	}

	public CseTipoConexPerfil(Short seq, String instancia) {
		this.seq = seq;
		this.instancia = instancia;
	}

	public CseTipoConexPerfil(Short seq, String instancia, String tipo, String tablespaceDefault, String tablespaceTemporario) {
		this.seq = seq;
		this.instancia = instancia;
		this.tipo = tipo;
		this.tablespaceDefault = tablespaceDefault;
		this.tablespaceTemporario = tablespaceTemporario;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "cseTcpSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "INSTANCIA", nullable = false, length = 20)
	@Length(max = 20)
	public String getInstancia() {
		return this.instancia;
	}

	public void setInstancia(String instancia) {
		this.instancia = instancia;
	}

	@Column(name = "TIPO", length = 1)
	@Length(max = 1)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "TABLESPACE_DEFAULT", length = 240)
	@Length(max = 240)
	public String getTablespaceDefault() {
		return this.tablespaceDefault;
	}

	public void setTablespaceDefault(String tablespaceDefault) {
		this.tablespaceDefault = tablespaceDefault;
	}

	@Column(name = "TABLESPACE_TEMPORARIO", length = 240)
	@Length(max = 240)
	public String getTablespaceTemporario() {
		return this.tablespaceTemporario;
	}

	public void setTablespaceTemporario(String tablespaceTemporario) {
		this.tablespaceTemporario = tablespaceTemporario;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		INSTANCIA("instancia"),
		TIPO("tipo"),
		TABLESPACE_DEFAULT("tablespaceDefault"),
		TABLESPACE_TEMPORARIO("tablespaceTemporario");

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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof CseTipoConexPerfil)) {
			return false;
		}
		CseTipoConexPerfil other = (CseTipoConexPerfil) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
