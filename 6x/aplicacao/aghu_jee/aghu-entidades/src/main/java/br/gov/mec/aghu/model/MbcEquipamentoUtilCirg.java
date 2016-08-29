package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import br.gov.mec.aghu.core.exception.BaseRuntimeException;
import br.gov.mec.aghu.core.exception.BusinessExceptionCode;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MbcEquipamentoUtilCirg generated by hbm2java
 */
@Entity
@Table(name = "MBC_EQUIPAMENTO_UTIL_CIRGS", schema = "AGH")
public class MbcEquipamentoUtilCirg extends BaseEntityId<MbcEquipamentoUtilCirgId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8887537086516172832L;
	private MbcEquipamentoUtilCirgId id;
	private Integer version;
	private MbcCirurgias mbcCirurgias;
	private RapServidores rapServidores;
	private MbcEquipamentoCirurgico mbcEquipamentoCirurgico;
	private Date criadoEm;
	private Boolean indUso;
	private Short quantidade;
	
	// concorrência

	private enum MbcEquipamentoUtilCirgExceptionCode implements
			BusinessExceptionCode {
		MBC_EQC_CK2
	}
	
	public MbcEquipamentoUtilCirg() {
	}

	public MbcEquipamentoUtilCirg(MbcEquipamentoUtilCirgId id, MbcCirurgias mbcCirurgias, RapServidores rapServidores,
			MbcEquipamentoCirurgico mbcEquipamentoCirurgico, Date criadoEm, Short quantidade) {
		this.id = id;
		this.mbcCirurgias = mbcCirurgias;
		this.rapServidores = rapServidores;
		this.mbcEquipamentoCirurgico = mbcEquipamentoCirurgico;
		this.criadoEm = criadoEm;
		this.quantidade = quantidade;
	}

	public MbcEquipamentoUtilCirg(MbcEquipamentoUtilCirgId id, MbcCirurgias mbcCirurgias, RapServidores rapServidores,
			MbcEquipamentoCirurgico mbcEquipamentoCirurgico, Date criadoEm, Boolean indUso, Short quantidade) {
		this.id = id;
		this.mbcCirurgias = mbcCirurgias;
		this.rapServidores = rapServidores;
		this.mbcEquipamentoCirurgico = mbcEquipamentoCirurgico;
		this.criadoEm = criadoEm;
		this.indUso = indUso;
		this.quantidade = quantidade;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "crgSeq", column = @Column(name = "CRG_SEQ", nullable = false)),
			@AttributeOverride(name = "euuSeq", column = @Column(name = "EUU_SEQ", nullable = false)) })
	public MbcEquipamentoUtilCirgId getId() {
		return this.id;
	}

	public void setId(MbcEquipamentoUtilCirgId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CRG_SEQ", nullable = false, insertable = false, updatable = false)
	public MbcCirurgias getMbcCirurgias() {
		return this.mbcCirurgias;
	}

	public void setMbcCirurgias(MbcCirurgias mbcCirurgias) {
		this.mbcCirurgias = mbcCirurgias;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EUU_SEQ", nullable = false, insertable = false, updatable = false)
	public MbcEquipamentoCirurgico getMbcEquipamentoCirurgico() {
		return this.mbcEquipamentoCirurgico;
	}

	public void setMbcEquipamentoCirurgico(MbcEquipamentoCirurgico mbcEquipamentoCirurgico) {
		this.mbcEquipamentoCirurgico = mbcEquipamentoCirurgico;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_USO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndUso() {
		return this.indUso;
	}

	public void setIndUso(Boolean indUso) {
		this.indUso = indUso;
	}

	@Column(name = "QUANTIDADE", nullable = false)
	public Short getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Short quantidade) {
		this.quantidade = quantidade;
	}
	
	@SuppressWarnings("unused")
	@PrePersist
	@PreUpdate
	private void validarMbcEquipamentoUtilCirg() {


		if (this.quantidade < 1 ) {
			throw new BaseRuntimeException(MbcEquipamentoUtilCirgExceptionCode.MBC_EQC_CK2);
		}
	}	

	public enum Fields {

		ID("id"),
		VERSION("version"),
		MBC_CIRURGIAS("mbcCirurgias"),
		MBC_CIRURGIAS_SEQ("mbcCirurgias.seq"),
		EUU_SEQ("id.euuSeq"),
		RAP_SERVIDORES("rapServidores"),
		MBC_EQUIPAMENTO_CIRURGICO("mbcEquipamentoCirurgico"),
		CRIADO_EM("criadoEm"),
		IND_USO("indUso"),
		QUANTIDADE("quantidade"),
		MBC_PROC_ESP_POR_CIRURGIAS("mbcProcEspPorCirurgias");

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
		if (!(obj instanceof MbcEquipamentoUtilCirg)) {
			return false;
		}
		MbcEquipamentoUtilCirg other = (MbcEquipamentoUtilCirg) obj;
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
