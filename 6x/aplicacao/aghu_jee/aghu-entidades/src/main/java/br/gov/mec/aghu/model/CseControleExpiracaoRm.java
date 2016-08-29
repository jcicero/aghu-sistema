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
 * CseControleExpiracaoRm generated by hbm2java
 */
@Entity
@Table(name = "CSE_CONTROLE_EXPIRACOES_RM", schema = "AGH")
public class CseControleExpiracaoRm extends BaseEntityId<CseControleExpiracaoRmId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4797753871275501533L;
	private CseControleExpiracaoRmId id;

	public CseControleExpiracaoRm() {
	}

	public CseControleExpiracaoRm(CseControleExpiracaoRmId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "usrId", column = @Column(name = "USR_ID", nullable = false, length = 30)),
			@AttributeOverride(name = "dtAvisoExpiracao", column = @Column(name = "DT_AVISO_EXPIRACAO", nullable = false, length = 29)),
			@AttributeOverride(name = "dtEnvioEmail", column = @Column(name = "DT_ENVIO_EMAIL", length = 29)),
			@AttributeOverride(name = "dtMensagemAgh", column = @Column(name = "DT_MENSAGEM_AGH", length = 29)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public CseControleExpiracaoRmId getId() {
		return this.id;
	}

	public void setId(CseControleExpiracaoRmId id) {
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

}
