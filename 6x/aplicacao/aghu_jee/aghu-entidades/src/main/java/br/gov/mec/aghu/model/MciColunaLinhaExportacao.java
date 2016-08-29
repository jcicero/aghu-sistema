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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MciColunaLinhaExportacao generated by hbm2java
 */
@Entity
@Table(name = "MCI_COLUNA_LINHA_EXPORTACOES", schema = "AGH")
public class MciColunaLinhaExportacao extends BaseEntityId<MciColunaLinhaExportacaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8584570716946794922L;
	private MciColunaLinhaExportacaoId id;
	private Integer version;
	private MciNomeColunaReport mciNomeColunaReport;
	private RapServidores rapServidores;
	private Date criadoEm;
	private String indSituacao;

	public MciColunaLinhaExportacao() {
	}

	public MciColunaLinhaExportacao(MciColunaLinhaExportacaoId id, MciNomeColunaReport mciNomeColunaReport,
			RapServidores rapServidores, Date criadoEm, String indSituacao) {
		this.id = id;
		this.mciNomeColunaReport = mciNomeColunaReport;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "ncrSeq", column = @Column(name = "NCR_SEQ", nullable = false)),
			@AttributeOverride(name = "ledSeq", column = @Column(name = "LED_SEQ", nullable = false)) })
	public MciColunaLinhaExportacaoId getId() {
		return this.id;
	}

	public void setId(MciColunaLinhaExportacaoId id) {
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
	@JoinColumn(name = "NCR_SEQ", nullable = false, insertable = false, updatable = false)
	public MciNomeColunaReport getMciNomeColunaReport() {
		return this.mciNomeColunaReport;
	}

	public void setMciNomeColunaReport(MciNomeColunaReport mciNomeColunaReport) {
		this.mciNomeColunaReport = mciNomeColunaReport;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		MCI_NOME_COLUNA_REPORTS("mciNomeColunaReport"),
		RAP_SERVIDORES("rapServidores"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao");

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
		if (!(obj instanceof MciColunaLinhaExportacao)) {
			return false;
		}
		MciColunaLinhaExportacao other = (MciColunaLinhaExportacao) obj;
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
