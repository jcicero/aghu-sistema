package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatItemCtaAtends generated by hbm2java
 */
@Entity
@Table(name = "FAT_ITEM_CTA_ATENDS", schema = "AGH")
public class FatItemCtaAtend extends BaseEntityId<FatItemCtaAtendId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8753479831620274130L;
	private FatItemCtaAtendId id;
	private FatContaAtend fatContaAtend;
	private FatProcedHospInternos procedimentoHospitalarInterno;
	private Date criadoEm;
	private Date dthrRealizado;
	private Short unfSeq;
	private String indSituacao;
	private Short iseSeqp;
	private Integer iseSoeSeq;
	private Integer ppcCrgSeq;
	private Short ppcEprEspSeq;
	private Integer ppcEprPciSeq;
	private String ppcIndRespProc;
	private Integer prhConNumero;
	private Integer prhPhiSeq;
	private Short quantidade;

	public FatItemCtaAtend() {
	}

	public FatItemCtaAtend(FatItemCtaAtendId id, FatProcedHospInternos procedimentoHospitalarInterno,
			FatContaAtend fatContaAtend, Date criadoEm, Short unfSeq,
			Integer phiSeq, String indSituacao) {
		this.id = id;
		this.fatContaAtend = fatContaAtend;
		this.criadoEm = criadoEm;
		this.unfSeq = unfSeq;
		this.procedimentoHospitalarInterno = procedimentoHospitalarInterno;
		this.indSituacao = indSituacao;
	}

	public FatItemCtaAtend(FatItemCtaAtendId id, FatProcedHospInternos procedimentoHospitalarInterno,
			FatContaAtend fatContaAtend, Date criadoEm, Date dthrRealizado,
			Short unfSeq, Integer phiSeq, String indSituacao, Short iseSeqp,
			Integer iseSoeSeq, Integer ppcCrgSeq, Short ppcEprEspSeq,
			Integer ppcEprPciSeq, String ppcIndRespProc, Integer prhConNumero,
			Integer prhPhiSeq, Short quantidade) {
		this.id = id;
		this.fatContaAtend = fatContaAtend;
		this.criadoEm = criadoEm;
		this.dthrRealizado = dthrRealizado;
		this.unfSeq = unfSeq;
		this.procedimentoHospitalarInterno = procedimentoHospitalarInterno;
		this.indSituacao = indSituacao;
		this.iseSeqp = iseSeqp;
		this.iseSoeSeq = iseSoeSeq;
		this.ppcCrgSeq = ppcCrgSeq;
		this.ppcEprEspSeq = ppcEprEspSeq;
		this.ppcEprPciSeq = ppcEprPciSeq;
		this.ppcIndRespProc = ppcIndRespProc;
		this.prhConNumero = prhConNumero;
		this.prhPhiSeq = prhPhiSeq;
		this.quantidade = quantidade;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "canSeq", column = @Column(name = "CAN_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 8, scale = 0)) })
	public FatItemCtaAtendId getId() {
		return this.id;
	}

	public void setId(FatItemCtaAtendId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CAN_SEQ", nullable = false, insertable = false, updatable = false)
	public FatContaAtend getFatContaAtend() {
		return this.fatContaAtend;
	}

	public void setFatContaAtend(FatContaAtend fatContaAtend) {
		this.fatContaAtend = fatContaAtend;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_REALIZADO", length = 7)
	public Date getDthrRealizado() {
		return this.dthrRealizado;
	}

	public void setDthrRealizado(Date dthrRealizado) {
		this.dthrRealizado = dthrRealizado;
	}

	@Column(name = "UNF_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PHI_SEQ", nullable = false)
	public FatProcedHospInternos getProcedimentoHospitalarInterno() {
		return procedimentoHospitalarInterno;
	}

	public void setProcedimentoHospitalarInterno(
			FatProcedHospInternos procedimentoHospitalarInterno) {
		this.procedimentoHospitalarInterno = procedimentoHospitalarInterno;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
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

	@Column(name = "PPC_CRG_SEQ", precision = 8, scale = 0)
	public Integer getPpcCrgSeq() {
		return this.ppcCrgSeq;
	}

	public void setPpcCrgSeq(Integer ppcCrgSeq) {
		this.ppcCrgSeq = ppcCrgSeq;
	}

	@Column(name = "PPC_EPR_ESP_SEQ", precision = 4, scale = 0)
	public Short getPpcEprEspSeq() {
		return this.ppcEprEspSeq;
	}

	public void setPpcEprEspSeq(Short ppcEprEspSeq) {
		this.ppcEprEspSeq = ppcEprEspSeq;
	}

	@Column(name = "PPC_EPR_PCI_SEQ", precision = 5, scale = 0)
	public Integer getPpcEprPciSeq() {
		return this.ppcEprPciSeq;
	}

	public void setPpcEprPciSeq(Integer ppcEprPciSeq) {
		this.ppcEprPciSeq = ppcEprPciSeq;
	}

	@Column(name = "PPC_IND_RESP_PROC", length = 4)
	@Length(max = 4)
	public String getPpcIndRespProc() {
		return this.ppcIndRespProc;
	}

	public void setPpcIndRespProc(String ppcIndRespProc) {
		this.ppcIndRespProc = ppcIndRespProc;
	}

	@Column(name = "PRH_CON_NUMERO", precision = 8, scale = 0)
	public Integer getPrhConNumero() {
		return this.prhConNumero;
	}

	public void setPrhConNumero(Integer prhConNumero) {
		this.prhConNumero = prhConNumero;
	}

	@Column(name = "PRH_PHI_SEQ", precision = 6, scale = 0)
	public Integer getPrhPhiSeq() {
		return this.prhPhiSeq;
	}

	public void setPrhPhiSeq(Integer prhPhiSeq) {
		this.prhPhiSeq = prhPhiSeq;
	}

	@Column(name = "QUANTIDADE", precision = 4, scale = 0)
	public Short getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Short quantidade) {
		this.quantidade = quantidade;
	}

	public enum Fields {

		ID("id"),
		FAT_CONTA_ATEND("fatContaAtend"),
		PROCEDIMENTO_HOSPITALAR_INTERNO("procedimentoHospitalarInterno"),
		CRIADO_EM("criadoEm"),
		DTHR_REALIZADO("dthrRealizado"),
		UNF_SEQ("unfSeq"),
		IND_SITUACAO("indSituacao"),
		ISE_SEQP("iseSeqp"),
		ISE_SOE_SEQ("iseSoeSeq"),
		PPC_CRG_SEQ("ppcCrgSeq"),
		PPC_EPR_ESP_SEQ("ppcEprEspSeq"),
		PPC_EPR_PCI_SEQ("ppcEprPciSeq"),
		PPC_IND_RESP_PROC("ppcIndRespProc"),
		PRH_CON_NUMERO("prhConNumero"),
		PRH_PHI_SEQ("prhPhiSeq"),
		QUANTIDADE("quantidade");

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
		if (!(obj instanceof FatItemCtaAtend)) {
			return false;
		}
		FatItemCtaAtend other = (FatItemCtaAtend) obj;
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
