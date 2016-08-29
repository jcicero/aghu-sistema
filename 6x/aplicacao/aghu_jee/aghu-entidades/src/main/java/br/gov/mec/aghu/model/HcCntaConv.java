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
 * HcCntaConv generated by hbm2java
 */
@Entity
@Table(name = "HC_CNTA_CONV", schema = "AGH")
public class HcCntaConv extends BaseEntityId<HcCntaConvId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5349057760596858639L;
	private HcCntaConvId id;

	public HcCntaConv() {
	}

	public HcCntaConv(HcCntaConvId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "nro", column = @Column(name = "NRO")),
			@AttributeOverride(name = "intdCodPrnt", column = @Column(name = "INTD_COD_PRNT")),
			@AttributeOverride(name = "intdDataInt", column = @Column(name = "INTD_DATA_INT", length = 29)),
			@AttributeOverride(name = "convCod", column = @Column(name = "CONV_COD")),
			@AttributeOverride(name = "qtdeCsh", column = @Column(name = "QTDE_CSH", precision = 17, scale = 17)),
			@AttributeOverride(name = "dataComp", column = @Column(name = "DATA_COMP", length = 29)),
			@AttributeOverride(name = "nomeResp", column = @Column(name = "NOME_RESP", length = 80)),
			@AttributeOverride(name = "nroNf", column = @Column(name = "NRO_NF")),
			@AttributeOverride(name = "dthrImpressao", column = @Column(name = "DTHR_IMPRESSAO", length = 29)),
			@AttributeOverride(name = "data", column = @Column(name = "DATA", length = 29)),
			@AttributeOverride(name = "indEcrt", column = @Column(name = "IND_ECRT", length = 1)),
			@AttributeOverride(name = "flLibSispro", column = @Column(name = "FL_LIB_SISPRO")),
			@AttributeOverride(name = "flAtuCbr", column = @Column(name = "FL_ATU_CBR")),
			@AttributeOverride(name = "anTipoLanc", column = @Column(name = "AN_TIPO_LANC", length = 3)),
			@AttributeOverride(name = "anObs", column = @Column(name = "AN_OBS", length = 100)),
			@AttributeOverride(name = "nroGuia", column = @Column(name = "NRO_GUIA")),
			@AttributeOverride(name = "cpfResp", column = @Column(name = "CPF_RESP")),
			@AttributeOverride(name = "dataEmis", column = @Column(name = "DATA_EMIS", length = 29)),
			@AttributeOverride(name = "verid", column = @Column(name = "VERID")),
			@AttributeOverride(name = "nomePac", column = @Column(name = "NOME_PAC", length = 60)),
			@AttributeOverride(name = "qrtoLto", column = @Column(name = "QRTO_LTO", length = 5)),
			@AttributeOverride(name = "nroMatr", column = @Column(name = "NRO_MATR")),
			@AttributeOverride(name = "paccSeq", column = @Column(name = "PACC_SEQ")) })
	public HcCntaConvId getId() {
		return this.id;
	}

	public void setId(HcCntaConvId id) {
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
		if (!(obj instanceof HcCntaConv)) {
			return false;
		}
		HcCntaConv other = (HcCntaConv) obj;
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
