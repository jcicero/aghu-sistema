package br.gov.mec.aghu.model;

// Generated 14/05/2010 09:58:31 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatConvProcedHospitalares generated by hbm2java
 */
@Entity
@Table(name = "FAT_CONV_PROCED_HOSPITALARES", schema = "AGH")
@org.hibernate.annotations.Cache(usage=org.hibernate.annotations.CacheConcurrencyStrategy.TRANSACTIONAL)
public class FatConvProcedHospitalares extends BaseEntityId<FatConvProcedHospitalaresId> implements java.io.Serializable {
	private static final long serialVersionUID = -8609904122457628939L;
	
	private FatConvProcedHospitalaresId id;
	private String indInternacao;
	private Integer version;
	
	private FatConvenioSaudePlano convSaudePlano;
	private FatProcedimentosHospitalares procedimentoHospitalar;

	public FatConvProcedHospitalares() {
	}

	public FatConvProcedHospitalares(FatConvProcedHospitalaresId id,
			String indInternacao) {
		this.id = id;
		this.indInternacao = indInternacao;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "cspCnvCodigo", column = @Column(name = "CSP_CNV_CODIGO", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "cspSeq", column = @Column(name = "CSP_SEQ", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "phoSeq", column = @Column(name = "PHO_SEQ", nullable = false, precision = 4, scale = 0)) })
	public FatConvProcedHospitalaresId getId() {
		return this.id;
	}

	public void setId(FatConvProcedHospitalaresId id) {
		this.id = id;
	}

	@Column(name = "IND_INTERNACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndInternacao() {
		return this.indInternacao;
	}

	public void setIndInternacao(String indInternacao) {
		this.indInternacao = indInternacao;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		FatConvProcedHospitalares other = (FatConvProcedHospitalares) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	public enum Fields {
		CONVENIO_SAUDE_PLANO("convSaudePlano"),
		PROCEDIMENTO_HOSPITALAR("procedimentoHospitalar"),
		ID("id"),
		CSP_CNV_CODIGO("id.cspCnvCodigo"),
		CSP_SEQ("id.cspSeq"),
		PHO_SEQ("id.phoSeq"),
		;

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "CSP_CNV_CODIGO", referencedColumnName = "CNV_CODIGO", nullable = false, updatable = false, insertable = false),
				   @JoinColumn(name = "CSP_SEQ", referencedColumnName = "SEQ", nullable = false, updatable = false, insertable = false)
				 }
				)
	public FatConvenioSaudePlano getConvSaudePlano() {
		return convSaudePlano;
	}

	public void setConvSaudePlano(FatConvenioSaudePlano convSaudePlano) {
		this.convSaudePlano = convSaudePlano;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PHO_SEQ", nullable = false, insertable = false, updatable = false)
	public FatProcedimentosHospitalares getProcedimentoHospitalar() {
		return this.procedimentoHospitalar;
	}

	public void setProcedimentoHospitalar(
			final FatProcedimentosHospitalares procedimentoHospitalar) {
		this.procedimentoHospitalar = procedimentoHospitalar;
	}
}