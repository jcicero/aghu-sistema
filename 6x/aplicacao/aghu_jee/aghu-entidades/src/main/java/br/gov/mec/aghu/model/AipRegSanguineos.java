package br.gov.mec.aghu.model;

// Generated 26/02/2010 17:37:25 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioCoombs;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AipRegSanguineos generated by hbm2java
 */
@Entity
@Table(name = "AIP_REG_SANGUINEOS", schema = "AGH")
public class AipRegSanguineos extends BaseEntityId<AipRegSanguineosId> implements java.io.Serializable {

	private static final long serialVersionUID = 9119718147698886068L;
	
	private AipRegSanguineosId id;
	private String grupoSanguineo;
	private String fatorRh;
	private DominioCoombs coombs;
	private Date criadoEm;
	private Short iseSeqp;
	private Integer iseSoeSeq;
	private Short iseSeqpRh;
	private Integer iseSoeSeqRh;
	private Short iseSeqpCoombs;
	private Integer iseSoeSeqCoombs;
	
	private Integer version;

	public AipRegSanguineos() {
	}

	public AipRegSanguineos(AipRegSanguineosId id, String grupoSanguineo,
			String fatorRh, DominioCoombs coombs, Date criadoEm, Short iseSeqp,
			Integer iseSoeSeq, Short iseSeqpRh, Integer iseSoeSeqRh,
			Short iseSeqpCoombs, Integer iseSoeSeqCoombs) {
		this.id = id;
		this.grupoSanguineo = grupoSanguineo;
		this.fatorRh = fatorRh;
		this.coombs = coombs;
		this.criadoEm = criadoEm;
		this.iseSeqp = iseSeqp;
		this.iseSoeSeq = iseSoeSeq;
		this.iseSeqpRh = iseSeqpRh;
		this.iseSoeSeqRh = iseSoeSeqRh;
		this.iseSeqpCoombs = iseSeqpCoombs;
		this.iseSoeSeqCoombs = iseSoeSeqCoombs;
	}
	

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "pacCodigo", column = @Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0))})
	public AipRegSanguineosId getId() {
		return this.id;
	}

	public void setId(AipRegSanguineosId id) {
		this.id = id;
	}

	@Column(name = "GRUPO_SANGUINEO", length = 2)
	@Length(max = 2)
	public String getGrupoSanguineo() {
		return this.grupoSanguineo;
	}

	public void setGrupoSanguineo(String grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	@Column(name = "FATOR_RH", length = 1)
	@Length(max = 1)
	public String getFatorRh() {
		return this.fatorRh;
	}

	public void setFatorRh(String fatorRh) {
		this.fatorRh = fatorRh;
	}

	@Column(name = "COOMBS")
	@Enumerated(EnumType.STRING)
	public DominioCoombs getCoombs() {
		return this.coombs;
	}

	public void setCoombs(DominioCoombs coombs) {
		this.coombs = coombs;
	}

	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "ISE_SEQP", precision = 3, scale = 0)
	public Short getIseSeqp() {
		return this.iseSeqp;
	}

	public void setIseSeqp(Short iseSeqp) {
		this.iseSeqp = iseSeqp;
	}

	@Column(name = "ISE_SOE_SEQ", precision = 8, scale = 0)
	public Integer getIseSoeSeq() {
		return this.iseSoeSeq;
	}

	public void setIseSoeSeq(Integer iseSoeSeq) {
		this.iseSoeSeq = iseSoeSeq;
	}

	@Column(name = "ISE_SEQP_RH", precision = 3, scale = 0)
	public Short getIseSeqpRh() {
		return this.iseSeqpRh;
	}

	public void setIseSeqpRh(Short iseSeqpRh) {
		this.iseSeqpRh = iseSeqpRh;
	}

	@Column(name = "ISE_SOE_SEQ_RH", precision = 8, scale = 0)
	public Integer getIseSoeSeqRh() {
		return this.iseSoeSeqRh;
	}

	public void setIseSoeSeqRh(Integer iseSoeSeqRh) {
		this.iseSoeSeqRh = iseSoeSeqRh;
	}

	@Column(name = "ISE_SEQP_COOMBS", precision = 3, scale = 0)
	public Short getIseSeqpCoombs() {
		return this.iseSeqpCoombs;
	}

	public void setIseSeqpCoombs(Short iseSeqpCoombs) {
		this.iseSeqpCoombs = iseSeqpCoombs;
	}

	@Column(name = "ISE_SOE_SEQ_COOMBS", precision = 8, scale = 0)
	public Integer getIseSoeSeqCoombs() {
		return this.iseSoeSeqCoombs;
	}

	public void setIseSoeSeqCoombs(Integer iseSoeSeqCoombs) {
		this.iseSoeSeqCoombs = iseSoeSeqCoombs;
	}
	
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumns( {
//			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", insertable = false, updatable = false),
//			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", insertable = false, updatable = false) })
//	public RapServidores getRapServidor() {
//		return this.rapServidor;
//	}
//
//	public void setRapServidor(RapServidores rapServidor) {
//		this.rapServidor = rapServidor;
//	}	
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public enum Fields {
		// Código identificador do paciente
		CODIGO_PACIENTE("id.pacCodigo"), 
		// Número sequencial que identifica o registro sanguineo de um mesmo paciente
		SEQUENCE("id.seqp"),
		// Grupo sanguíneo do paciente
		GRUPO_SANGUINEO("grupoSanguineo"),			
		// Fator RH
		FATOR_RH("fatorRh"),
		// Resultado do exame de COOMBS direto
		COOMBS("coombs"),
		// Data de criação do registro
		CRIADO_EM("criadoEm"),
		// Número da matrícula do servidor do HCPA
		SERVIDOR_MATRICULA("id.serMatricula"),
		// Código do vínculo que o servidor tem com o HCPA
		SERVIDOR_CODIGO_VINCULO("id.serVinCodigo"),
		// Servidor do HCPA
//		SERVIDOR("rapServidor"),
		// Número do item da solicitação de exames
		ISE_SEQUENCE("iseSeqp"),
		// Número da solicitação de exames
		ISE_SOE_SEQUENCE("iseSoeSeq"),
		// Número do item da solicitação de exames
		ISE_SEQUENCE_RH("iseSeqpRh"),
		// Número da solicitação de exames
		ISE_SOE_SEQUENCE_RH("iseSoeSeqRh"),
		// Número do item da solicitação de exames
		ISE_SEQUENCE_COOMBS("iseSeqpCoombs"),
		// Número da solicitação de exames
		ISE_SOE_SEQUENCE_COOMBS("iseSoeSeqCoombs");		
		
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
		if (!(obj instanceof AipRegSanguineos)) {
			return false;
		}
		AipRegSanguineos other = (AipRegSanguineos) obj;
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
