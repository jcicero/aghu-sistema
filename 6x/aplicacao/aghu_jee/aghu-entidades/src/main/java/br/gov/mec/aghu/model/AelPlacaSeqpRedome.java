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
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelPlacaSeqpRedome generated by hbm2java
 */
@Entity
@Table(name = "AEL_PLACA_SEQP_REDOME", schema = "AGH")
public class AelPlacaSeqpRedome extends BaseEntityId<AelPlacaSeqpRedomeId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7107831881826582814L;
	private AelPlacaSeqpRedomeId id;
	private AelPlacaRedome aelPlacaRedome;
	private String locus;
	private String loteKit;
	private String indSituacao;
	private Date criadoEm;

	public AelPlacaSeqpRedome() {
	}

	public AelPlacaSeqpRedome(AelPlacaSeqpRedomeId id, AelPlacaRedome aelPlacaRedome, String locus, String loteKit) {
		this.id = id;
		this.aelPlacaRedome = aelPlacaRedome;
		this.locus = locus;
		this.loteKit = loteKit;
	}

	public AelPlacaSeqpRedome(AelPlacaSeqpRedomeId id, AelPlacaRedome aelPlacaRedome, String locus, String loteKit,
			String indSituacao, Date criadoEm) {
		this.id = id;
		this.aelPlacaRedome = aelPlacaRedome;
		this.locus = locus;
		this.loteKit = loteKit;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "pc1Seq", column = @Column(name = "PC1_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public AelPlacaSeqpRedomeId getId() {
		return this.id;
	}

	public void setId(AelPlacaSeqpRedomeId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PC1_SEQ", nullable = false, insertable = false, updatable = false)
	public AelPlacaRedome getAelPlacaRedome() {
		return this.aelPlacaRedome;
	}

	public void setAelPlacaRedome(AelPlacaRedome aelPlacaRedome) {
		this.aelPlacaRedome = aelPlacaRedome;
	}

	@Column(name = "LOCUS", nullable = false, length = 5)
	@Length(max = 5)
	public String getLocus() {
		return this.locus;
	}

	public void setLocus(String locus) {
		this.locus = locus;
	}

	@Column(name = "LOTE_KIT", nullable = false, length = 10)
	@Length(max = 10)
	public String getLoteKit() {
		return this.loteKit;
	}

	public void setLoteKit(String loteKit) {
		this.loteKit = loteKit;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

		ID("id"),
		AEL_PLACA_REDOMES("aelPlacaRedome"),
		LOCUS("locus"),
		LOTE_KIT("loteKit"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm");

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
		if (!(obj instanceof AelPlacaSeqpRedome)) {
			return false;
		}
		AelPlacaSeqpRedome other = (AelPlacaSeqpRedome) obj;
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
