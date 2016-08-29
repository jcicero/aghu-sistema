package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * McoSnappeJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name = "mcoSnaJn", sequenceName = "AGH.MCO_SNA_JN_SEQ", allocationSize = 1)
@Table(name = "MCO_SNAPPES_JN", schema = "AGH")
@Immutable
public class McoSnappeJn extends BaseJournal {


	private static final long serialVersionUID = 1963423681096586704L;

	private Short seqp;
	private Short pressaoArtMedia;
	private Short apgar5;
	private Short convulsoesMultiplas;
	private Short pesoAoNascer;
	private Short phDoSangue;
	private Short pig;
	private Short razaoPo2PorFio2;
	private Short temperatura;
	private Short volUrinario;
	private Short escoreSnappeii;
	private Date criadoEm;
	private Integer pacCodigo;
	private Short serVinCodigo;
	private Integer serMatricula;
	private Date dthrSumarioAlta;

	public McoSnappeJn() {
	}

	public McoSnappeJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Short seqp, Integer pacCodigo) {
		this.seqp = seqp;
		this.pacCodigo = pacCodigo;
	}

	public McoSnappeJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Short seqp, Short pressaoArtMedia,
			Short apgar5, Short convulsoesMultiplas, Short pesoAoNascer, Short phDoSangue, Short pig, Short razaoPo2PorFio2,
			Short temperatura, Short volUrinario, Short escoreSnappeii, Date criadoEm, Integer pacCodigo, Short serVinCodigo,
			Integer serMatricula, Date dthrSumarioAlta) {
		this.seqp = seqp;
		this.pressaoArtMedia = pressaoArtMedia;
		this.apgar5 = apgar5;
		this.convulsoesMultiplas = convulsoesMultiplas;
		this.pesoAoNascer = pesoAoNascer;
		this.phDoSangue = phDoSangue;
		this.pig = pig;
		this.razaoPo2PorFio2 = razaoPo2PorFio2;
		this.temperatura = temperatura;
		this.volUrinario = volUrinario;
		this.escoreSnappeii = escoreSnappeii;
		this.criadoEm = criadoEm;
		this.pacCodigo = pacCodigo;
		this.serVinCodigo = serVinCodigo;
		this.serMatricula = serMatricula;
		this.dthrSumarioAlta = dthrSumarioAlta;
	}

	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mcoSnaJn")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Column(name = "PRESSAO_ART_MEDIA")
	public Short getPressaoArtMedia() {
		return this.pressaoArtMedia;
	}

	public void setPressaoArtMedia(Short pressaoArtMedia) {
		this.pressaoArtMedia = pressaoArtMedia;
	}

	@Column(name = "APGAR5")
	public Short getApgar5() {
		return this.apgar5;
	}

	public void setApgar5(Short apgar5) {
		this.apgar5 = apgar5;
	}

	@Column(name = "CONVULSOES_MULTIPLAS")
	public Short getConvulsoesMultiplas() {
		return this.convulsoesMultiplas;
	}

	public void setConvulsoesMultiplas(Short convulsoesMultiplas) {
		this.convulsoesMultiplas = convulsoesMultiplas;
	}

	@Column(name = "PESO_AO_NASCER")
	public Short getPesoAoNascer() {
		return this.pesoAoNascer;
	}

	public void setPesoAoNascer(Short pesoAoNascer) {
		this.pesoAoNascer = pesoAoNascer;
	}

	@Column(name = "PH_DO_SANGUE")
	public Short getPhDoSangue() {
		return this.phDoSangue;
	}

	public void setPhDoSangue(Short phDoSangue) {
		this.phDoSangue = phDoSangue;
	}

	@Column(name = "PIG")
	public Short getPig() {
		return this.pig;
	}

	public void setPig(Short pig) {
		this.pig = pig;
	}

	@Column(name = "RAZAO_PO2_POR_FIO2")
	public Short getRazaoPo2PorFio2() {
		return this.razaoPo2PorFio2;
	}

	public void setRazaoPo2PorFio2(Short razaoPo2PorFio2) {
		this.razaoPo2PorFio2 = razaoPo2PorFio2;
	}

	@Column(name = "TEMPERATURA")
	public Short getTemperatura() {
		return this.temperatura;
	}

	public void setTemperatura(Short temperatura) {
		this.temperatura = temperatura;
	}

	@Column(name = "VOL_URINARIO")
	public Short getVolUrinario() {
		return this.volUrinario;
	}

	public void setVolUrinario(Short volUrinario) {
		this.volUrinario = volUrinario;
	}

	@Column(name = "ESCORE_SNAPPEII")
	public Short getEscoreSnappeii() {
		return this.escoreSnappeii;
	}

	public void setEscoreSnappeii(Short escoreSnappeii) {
		this.escoreSnappeii = escoreSnappeii;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "PAC_CODIGO", nullable = false)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_SUMARIO_ALTA", length = 29)
	public Date getDthrSumarioAlta() {
		return this.dthrSumarioAlta;
	}

	public void setDthrSumarioAlta(Date dthrSumarioAlta) {
		this.dthrSumarioAlta = dthrSumarioAlta;
	}

	public enum Fields {

		SEQP("seqp"),
		PRESSAO_ART_MEDIA("pressaoArtMedia"),
		APGAR5("apgar5"),
		CONVULSOES_MULTIPLAS("convulsoesMultiplas"),
		PESO_AO_NASCER("pesoAoNascer"),
		PH_DO_SANGUE("phDoSangue"),
		PIG("pig"),
		RAZAO_PO2_POR_FIO2("razaoPo2PorFio2"),
		TEMPERATURA("temperatura"),
		VOL_URINARIO("volUrinario"),
		ESCORE_SNAPPEII("escoreSnappeii"),
		CRIADO_EM("criadoEm"),
		PAC_CODIGO("pacCodigo"),
		SER_VIN_CODIGO("serVinCodigo"),
		SER_MATRICULA("serMatricula"),
		DTHR_SUMARIO_ALTA("dthrSumarioAlta");

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
