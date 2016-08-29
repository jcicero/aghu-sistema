package br.gov.mec.aghu.model.temp;

// Generated 07/03/2010 18:57:10 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AipPosicaoFonemasPacientes generated by hbm2java
 */
@Entity
@Table(name = "AIP_POSI_FONEMAS_PACIENTES", schema = "AGH")
public class AipPosicaoFonemasPacientesRotinaFonema extends BaseEntityId<AipPosicaoFonemasPacientesRotinaFonemaId> implements java.io.Serializable {

	private static final long serialVersionUID = -3157945653920863070L;

	private AipPosicaoFonemasPacientesRotinaFonemaId id;
	
	private AipFonemaPacientesRotinaFonema fonema;
	
	public AipPosicaoFonemasPacientesRotinaFonema() {
	}

	public AipPosicaoFonemasPacientesRotinaFonema(AipPosicaoFonemasPacientesRotinaFonemaId id) {
		this.id = id;
	}
	
	public AipPosicaoFonemasPacientesRotinaFonema(AipPosicaoFonemasPacientesRotinaFonemaId id, AipFonemaPacientesRotinaFonema fonema) {
		this.id = id;
		this.fonema = fonema;
	}
	
	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "seq", column = @Column(name = "FNP_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "posicao", column = @Column(name = "POSICAO", nullable = false, precision = 2, scale = 0)) })
	public AipPosicaoFonemasPacientesRotinaFonemaId getId() {
		return this.id;
	}

	public void setId(AipPosicaoFonemasPacientesRotinaFonemaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FNP_SEQ", nullable = false, insertable = false, updatable = false)
	public AipFonemaPacientesRotinaFonema getFonema() {
		return fonema;
	}

	public void setFonema(AipFonemaPacientesRotinaFonema fonema) {
		this.fonema = fonema;
	}
	
	public enum Fields {
		CODIGO_PACIENTE("id.seq");
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}

}
