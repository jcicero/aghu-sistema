package br.gov.mec.aghu.model;

// Generated 28/03/2011 16:33:50 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.dominio.DominioUnidadeMedidaTempo;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelIntervaloColetasJn generated by hbm2java
 */

@Entity
@Table(name = "AEL_INTERVALO_COLETAS_JN", schema = "AGH")
@SequenceGenerator(name = "aelIcojJnSeq", sequenceName = "AGH.AEL_ICO_jn_seq", allocationSize = 1)
@Immutable
public class AelIntervaloColetaJn extends BaseJournal implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8876320310509609097L;
	private Short seq;
	private String emaExaSigla;
	private Integer emaManSeq;
	private String descricao;
	private Short nroColetas;
	private Short tempo;
	private DominioUnidadeMedidaTempo unidMedidaTempo;
	private DominioSituacao indSituacao;
	private Double volumeIngerido;
	private String unidMedidaVolume;
	private String tipoSubstancia;

	
	@Id
    @Column(name = "SEQ_JN", unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "aelIcojJnSeq")
    @Override
    public Integer getSeqJn() {
        return super.getSeqJn();
    }
	
	public AelIntervaloColetaJn() {
	}

	public AelIntervaloColetaJn(Short seq) {
		this.seq = seq;
	}

	public AelIntervaloColetaJn(Short seq, String emaExaSigla,
			Integer emaManSeq, String descricao, Short nroColetas, Short tempo,
			DominioUnidadeMedidaTempo unidMedidaTempo, DominioSituacao indSituacao, Double volumeIngerido,
			String unidMedidaVolume, String tipoSubstancia) {
		this.seq = seq;
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
		this.descricao = descricao;
		this.nroColetas = nroColetas;
		this.tempo = tempo;
		this.unidMedidaTempo = unidMedidaTempo;
		this.indSituacao = indSituacao;
		this.volumeIngerido = volumeIngerido;
		this.unidMedidaVolume = unidMedidaVolume;
		this.tipoSubstancia = tipoSubstancia;
	}

	@Column(name = "SEQ", nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	@Column(name = "EMA_EXA_SIGLA", length = 5)
	@Length(max = 5)
	public String getEmaExaSigla() {
		return this.emaExaSigla;
	}

	public void setEmaExaSigla(String emaExaSigla) {
		this.emaExaSigla = emaExaSigla;
	}

	@Column(name = "EMA_MAN_SEQ")
	public Integer getEmaManSeq() {
		return this.emaManSeq;
	}

	public void setEmaManSeq(Integer emaManSeq) {
		this.emaManSeq = emaManSeq;
	}

	@Column(name = "DESCRICAO", length = 100)
	@Length(max = 100)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "NRO_COLETAS")
	public Short getNroColetas() {
		return this.nroColetas;
	}

	public void setNroColetas(Short nroColetas) {
		this.nroColetas = nroColetas;
	}

	@Column(name = "TEMPO")
	public Short getTempo() {
		return this.tempo;
	}

	public void setTempo(Short tempo) {
		this.tempo = tempo;
	}

	@Column(name = "UNID_MEDIDA_TEMPO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioUnidadeMedidaTempo getUnidMedidaTempo() {
		return this.unidMedidaTempo;
	}

	public void setUnidMedidaTempo(DominioUnidadeMedidaTempo unidMedidaTempo) {
		this.unidMedidaTempo = unidMedidaTempo;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "VOLUME_INGERIDO")
	public Double getVolumeIngerido() {
		return this.volumeIngerido;
	}

	public void setVolumeIngerido(Double volumeIngerido) {
		this.volumeIngerido = volumeIngerido;
	}

	@Column(name = "UNID_MEDIDA_VOLUME", length = 3)
	@Length(max = 3)
	public String getUnidMedidaVolume() {
		return this.unidMedidaVolume;
	}

	public void setUnidMedidaVolume(String unidMedidaVolume) {
		this.unidMedidaVolume = unidMedidaVolume;
	}

	@Column(name = "TIPO_SUBSTANCIA", length = 10)
	@Length(max = 10)
	public String getTipoSubstancia() {
		return this.tipoSubstancia;
	}

	public void setTipoSubstancia(String tipoSubstancia) {
		this.tipoSubstancia = tipoSubstancia;
	}

	public enum Fields {

		SEQ("seq"),
		EMA_EXA_SIGLA("emaExaSigla"),
		EMA_MAN_SEQ("emaManSeq"),
		DESCRICAO("descricao"),
		NRO_COLETAS("nroColetas"),
		TEMPO("tempo"),
		UNID_MEDIDA_TEMPO("unidMedidaTempo"),
		IND_SITUACAO("indSituacao"),
		VOLUME_INGERIDO("volumeIngerido"),
		UNID_MEDIDA_VOLUME("unidMedidaVolume"),
		TIPO_SUBSTANCIA("tipoSubstancia");

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
