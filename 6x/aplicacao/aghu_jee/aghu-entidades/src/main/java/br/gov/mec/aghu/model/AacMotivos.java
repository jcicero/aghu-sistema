package br.gov.mec.aghu.model;

// Generated 12/02/2010 16:30:05 by Hibernate Tools 3.2.5.Beta

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityCodigo;

/**
 * AacMotivos generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aacMtoSq1", sequenceName="AGH.AAC_MTO_SQ1", allocationSize = 1)
@Table(name = "AAC_MOTIVOS", schema = "AGH")

public class AacMotivos extends BaseEntityCodigo<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5926548119696562672L;
	private Short codigo;
	private String descricao;
	private DominioSituacao indAtivo;
	private Set<AacConsultas> consultas = new HashSet<AacConsultas>(0);

	public AacMotivos() {
	}

	public AacMotivos(Short seq, String descricao, DominioSituacao indAtivo) {
		this.codigo = seq;
		this.descricao = descricao;
		this.indAtivo = indAtivo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aacMtoSq1")
	@Column(name = "SEQ", nullable = false, precision = 3, scale = 0)
	public Short getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Short seq) {
		this.codigo = seq;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndAtivo() {
		return indAtivo;
	}

	public void setIndAtivo(DominioSituacao indAtivo) {
		this.indAtivo = indAtivo;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "motivo")
	public Set<AacConsultas> getConsultas() {
		return consultas;
	}

	public void setConsultas(Set<AacConsultas> consultas) {
		this.consultas = consultas;
	}
	
	/**
	 * Campo sintético criado para mapear diretamente este dominio booleano em
	 * um componente selectOneCheckBox
	 * 
	 * @return
	 */
	@Transient
	public boolean isAtivo() {
		if (getIndAtivo() != null) {
			return getIndAtivo() == DominioSituacao.A;
		} else {
			return Boolean.FALSE;
		}
	}

	public void setAtivo(boolean valor) {
		setIndAtivo(DominioSituacao.getInstance(valor));
	}

	@Transient
	public String getDescricaoAtivo() {
		return isAtivo() ? "Sim" : "Não";
	}
	
	public enum Fields {

		CODIGO("codigo"), DESCRICAO("descricao"), IND_ATIVO("indAtivo");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		if (!(obj instanceof AacMotivos)) {
			return false;
		}
		AacMotivos other = (AacMotivos) obj;
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		return true;
	}



}
