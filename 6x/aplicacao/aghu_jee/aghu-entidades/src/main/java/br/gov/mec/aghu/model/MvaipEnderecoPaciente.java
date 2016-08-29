package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MvaipEnderecoPaciente generated by hbm2java
 */
@Entity
@Table(name = "MVAIP_ENDERECOS_PACIENTES", schema = "AGH")
public class MvaipEnderecoPaciente extends BaseEntityId<MvaipEnderecoPacienteId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3396594618847706007L;
	private MvaipEnderecoPacienteId id;
	private String tipoEndereco;
	private String indPadrao;
	private Integer cddCodigo;
	private String ufSigla;
	private String logradouro;
	private Integer nroLogradouro;
	private String complLogradouro;
	private String bairro;
	private String cidade;
	private Integer cep;
	private Integer bclBaiCodigo;
	private Integer bclCloCep;
	private Integer bclCloLgrCodigo;
	private String indExclusaoForcada;

	public MvaipEnderecoPaciente() {
	}

	public MvaipEnderecoPaciente(MvaipEnderecoPacienteId id) {
		this.id = id;
	}

	public MvaipEnderecoPaciente(MvaipEnderecoPacienteId id, String tipoEndereco, String indPadrao, Integer cddCodigo,
			String ufSigla, String logradouro, Integer nroLogradouro, String complLogradouro, String bairro, String cidade,
			Integer cep, Integer bclBaiCodigo, Integer bclCloCep, Integer bclCloLgrCodigo, String indExclusaoForcada) {
		this.id = id;
		this.tipoEndereco = tipoEndereco;
		this.indPadrao = indPadrao;
		this.cddCodigo = cddCodigo;
		this.ufSigla = ufSigla;
		this.logradouro = logradouro;
		this.nroLogradouro = nroLogradouro;
		this.complLogradouro = complLogradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.bclBaiCodigo = bclBaiCodigo;
		this.bclCloCep = bclCloCep;
		this.bclCloLgrCodigo = bclCloLgrCodigo;
		this.indExclusaoForcada = indExclusaoForcada;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "pacCodigo", column = @Column(name = "PAC_CODIGO", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public MvaipEnderecoPacienteId getId() {
		return this.id;
	}

	public void setId(MvaipEnderecoPacienteId id) {
		this.id = id;
	}

	@Column(name = "TIPO_ENDERECO", length = 1)
	@Length(max = 1)
	public String getTipoEndereco() {
		return this.tipoEndereco;
	}

	public void setTipoEndereco(String tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}

	@Column(name = "IND_PADRAO", length = 1)
	@Length(max = 1)
	public String getIndPadrao() {
		return this.indPadrao;
	}

	public void setIndPadrao(String indPadrao) {
		this.indPadrao = indPadrao;
	}

	@Column(name = "CDD_CODIGO")
	public Integer getCddCodigo() {
		return this.cddCodigo;
	}

	public void setCddCodigo(Integer cddCodigo) {
		this.cddCodigo = cddCodigo;
	}

	@Column(name = "UF_SIGLA", length = 2)
	@Length(max = 2)
	public String getUfSigla() {
		return this.ufSigla;
	}

	public void setUfSigla(String ufSigla) {
		this.ufSigla = ufSigla;
	}

	@Column(name = "LOGRADOURO", length = 60)
	@Length(max = 60)
	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	@Column(name = "NRO_LOGRADOURO")
	public Integer getNroLogradouro() {
		return this.nroLogradouro;
	}

	public void setNroLogradouro(Integer nroLogradouro) {
		this.nroLogradouro = nroLogradouro;
	}

	@Column(name = "COMPL_LOGRADOURO", length = 20)
	@Length(max = 20)
	public String getComplLogradouro() {
		return this.complLogradouro;
	}

	public void setComplLogradouro(String complLogradouro) {
		this.complLogradouro = complLogradouro;
	}

	@Column(name = "BAIRRO", length = 20)
	@Length(max = 20)
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Column(name = "CIDADE", length = 25)
	@Length(max = 25)
	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Column(name = "CEP")
	public Integer getCep() {
		return this.cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	@Column(name = "BCL_BAI_CODIGO")
	public Integer getBclBaiCodigo() {
		return this.bclBaiCodigo;
	}

	public void setBclBaiCodigo(Integer bclBaiCodigo) {
		this.bclBaiCodigo = bclBaiCodigo;
	}

	@Column(name = "BCL_CLO_CEP")
	public Integer getBclCloCep() {
		return this.bclCloCep;
	}

	public void setBclCloCep(Integer bclCloCep) {
		this.bclCloCep = bclCloCep;
	}

	@Column(name = "BCL_CLO_LGR_CODIGO")
	public Integer getBclCloLgrCodigo() {
		return this.bclCloLgrCodigo;
	}

	public void setBclCloLgrCodigo(Integer bclCloLgrCodigo) {
		this.bclCloLgrCodigo = bclCloLgrCodigo;
	}

	@Column(name = "IND_EXCLUSAO_FORCADA", length = 1)
	@Length(max = 1)
	public String getIndExclusaoForcada() {
		return this.indExclusaoForcada;
	}

	public void setIndExclusaoForcada(String indExclusaoForcada) {
		this.indExclusaoForcada = indExclusaoForcada;
	}

	public enum Fields {

		ID("id"),
		TIPO_ENDERECO("tipoEndereco"),
		IND_PADRAO("indPadrao"),
		CDD_CODIGO("cddCodigo"),
		UF_SIGLA("ufSigla"),
		LOGRADOURO("logradouro"),
		NRO_LOGRADOURO("nroLogradouro"),
		COMPL_LOGRADOURO("complLogradouro"),
		BAIRRO("bairro"),
		CIDADE("cidade"),
		CEP("cep"),
		BCL_BAI_CODIGO("bclBaiCodigo"),
		BCL_CLO_CEP("bclCloCep"),
		BCL_CLO_LGR_CODIGO("bclCloLgrCodigo"),
		IND_EXCLUSAO_FORCADA("indExclusaoForcada");

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
		if (!(obj instanceof MvaipEnderecoPaciente)) {
			return false;
		}
		MvaipEnderecoPaciente other = (MvaipEnderecoPaciente) obj;
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
