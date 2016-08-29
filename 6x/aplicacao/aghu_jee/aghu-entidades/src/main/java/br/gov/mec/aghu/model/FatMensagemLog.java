package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioModuloMensagem;
import br.gov.mec.aghu.dominio.DominioSituacaoMensagemLog;
import br.gov.mec.aghu.core.persistence.BaseEntityCodigo;

/**
 * FatMensagensLog generated by hbm2java
 */
@Entity
@Table(name = "FAT_MENSAGENS_LOG", schema = "AGH")
public class FatMensagemLog extends BaseEntityCodigo<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4574849647509799517L;
	private Integer codigo;
	private Integer version;
	private String erro;
	private DominioModuloMensagem modulo;
	private DominioSituacaoMensagemLog situacao;
	private String indSecretario;

	public FatMensagemLog() {
	}
	
	public FatMensagemLog(Integer codigo) {
		this.codigo = codigo;
	}

	@Id
	@Column(name="CODIGO", nullable = false, unique = true)
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}
	
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	@Column(name = "ERRO", length = 300, insertable=false, updatable=true)
	@Length(max = 300)
	public String getErro() {
		return erro;
	}
	
	public void setErro(String erro) {
		this.erro = erro;
	}
	
	@Column(name = "MODULO", length = 30)
	@Enumerated(EnumType.STRING)
	public DominioModuloMensagem getModulo() {
		return modulo;
	}
	
	public void setModulo(DominioModuloMensagem modulo) {
		this.modulo = modulo;
	}
	
	@Column(name = "SITUACAO", length = 30)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoMensagemLog getSituacao() {
		return situacao;
	}
	
	public void setSituacao(DominioSituacaoMensagemLog situacao) {
		this.situacao = situacao;
	}
	
	@Column(name = "IND_SECRETARIO", length = 1)
	@Length(max = 1)
	public String getIndSecretario() {
		return indSecretario;
	}
	
	public void setIndSecretario(String indSecretario) {
		this.indSecretario = indSecretario;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		
		HashCodeBuilder hashCode = new HashCodeBuilder();
		hashCode.append(codigo);
		
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		FatMensagemLog other = (FatMensagemLog) obj;
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		return true;
	}

	public enum Fields {
		
		SITUACAO("situacao"),
		ERRO("erro"),
		MODULO("modulo"),
		IND_SECRETARIO("indSecretario"),
		CODIGO("codigo");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}
	
}