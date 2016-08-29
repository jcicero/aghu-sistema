package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MbcFichaAnestesiaRegional generated by hbm2java
 */
@Entity
@Table(name = "MBC_FICHA_ANESTESIA_REGIONAIS", schema = "AGH")
public class MbcFichaAnestesiaRegional extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5822310257418095152L;
	private Integer seq;
	private Integer version;
	private MbcFichaAnestesias fichaAnestesia;
	private String ivRegional;
	private String bloqueioNervoPlexo;
	private String intercostais;
	private String intercostaisBilateral;
	private String peridural;
	private String subaracnoide;
	private String caudal;
	private Short intercostaisDe;
	private Short intercostaisAte;
	private Short latencia;
	private Short duracao;
	private String duracaoMaiorIgual;
	private String usoCateter;
	private Short numeroCateter;
	private String infusaoContinua;
	private String bloqueioExecutadoEqpCirurgi;
	private Date criadoEm;
	private RapServidores servidor;
	private Boolean cateterPrevio;
	private String neuroeixo;

	public MbcFichaAnestesiaRegional() {
	}

	public MbcFichaAnestesiaRegional(Integer seq, MbcFichaAnestesias fichaRegional, String ivRegional, String bloqueioNervoPlexo, String intercostais,
			String intercostaisBilateral, String usoCateter, String infusaoContinua, String bloqueioExecutadoEqpCirurgi,
			Date criadoEm, RapServidores servidor) {
		this.seq = seq;
		this.fichaAnestesia = fichaRegional;
		this.ivRegional = ivRegional;
		this.bloqueioNervoPlexo = bloqueioNervoPlexo;
		this.intercostais = intercostais;
		this.intercostaisBilateral = intercostaisBilateral;
		this.usoCateter = usoCateter;
		this.infusaoContinua = infusaoContinua;
		this.bloqueioExecutadoEqpCirurgi = bloqueioExecutadoEqpCirurgi;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
	}

	public MbcFichaAnestesiaRegional(Integer seq, MbcFichaAnestesias fichaRegional, String ivRegional, String bloqueioNervoPlexo, String intercostais,
			String intercostaisBilateral, String peridural, String subaracnoide, String caudal, Short intercostaisDe,
			Short intercostaisAte, Short latencia, Short duracao, String duracaoMaiorIgual, String usoCateter, Short numeroCateter,
			String infusaoContinua, String bloqueioExecutadoEqpCirurgi, Date criadoEm, RapServidores servidor,
			Boolean cateterPrevio, String neuroeixo) {
		this.seq = seq;
		this.fichaAnestesia = fichaRegional;
		this.ivRegional = ivRegional;
		this.bloqueioNervoPlexo = bloqueioNervoPlexo;
		this.intercostais = intercostais;
		this.intercostaisBilateral = intercostaisBilateral;
		this.peridural = peridural;
		this.subaracnoide = subaracnoide;
		this.caudal = caudal;
		this.intercostaisDe = intercostaisDe;
		this.intercostaisAte = intercostaisAte;
		this.latencia = latencia;
		this.duracao = duracao;
		this.duracaoMaiorIgual = duracaoMaiorIgual;
		this.usoCateter = usoCateter;
		this.numeroCateter = numeroCateter;
		this.infusaoContinua = infusaoContinua;
		this.bloqueioExecutadoEqpCirurgi = bloqueioExecutadoEqpCirurgi;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
		this.cateterPrevio = cateterPrevio;
		this.neuroeixo = neuroeixo;
	}

	@Id
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "IV_REGIONAL", nullable = false, length = 1)
	@Length(max = 1)
	public String getIvRegional() {
		return this.ivRegional;
	}

	public void setIvRegional(String ivRegional) {
		this.ivRegional = ivRegional;
	}

	@Column(name = "BLOQUEIO_NERVO_PLEXO", nullable = false, length = 1)
	@Length(max = 1)
	public String getBloqueioNervoPlexo() {
		return this.bloqueioNervoPlexo;
	}

	public void setBloqueioNervoPlexo(String bloqueioNervoPlexo) {
		this.bloqueioNervoPlexo = bloqueioNervoPlexo;
	}

	@Column(name = "INTERCOSTAIS", nullable = false, length = 1)
	@Length(max = 1)
	public String getIntercostais() {
		return this.intercostais;
	}

	public void setIntercostais(String intercostais) {
		this.intercostais = intercostais;
	}

	@Column(name = "INTERCOSTAIS_BILATERAL", nullable = false, length = 1)
	@Length(max = 1)
	public String getIntercostaisBilateral() {
		return this.intercostaisBilateral;
	}

	public void setIntercostaisBilateral(String intercostaisBilateral) {
		this.intercostaisBilateral = intercostaisBilateral;
	}

	@Column(name = "PERIDURAL", length = 1)
	@Length(max = 1)
	public String getPeridural() {
		return this.peridural;
	}

	public void setPeridural(String peridural) {
		this.peridural = peridural;
	}

	@Column(name = "SUBARACNOIDE", length = 1)
	@Length(max = 1)
	public String getSubaracnoide() {
		return this.subaracnoide;
	}

	public void setSubaracnoide(String subaracnoide) {
		this.subaracnoide = subaracnoide;
	}

	@Column(name = "CAUDAL", length = 1)
	@Length(max = 1)
	public String getCaudal() {
		return this.caudal;
	}

	public void setCaudal(String caudal) {
		this.caudal = caudal;
	}

	@Column(name = "INTERCOSTAIS_DE")
	public Short getIntercostaisDe() {
		return this.intercostaisDe;
	}

	public void setIntercostaisDe(Short intercostaisDe) {
		this.intercostaisDe = intercostaisDe;
	}

	@Column(name = "INTERCOSTAIS_ATE")
	public Short getIntercostaisAte() {
		return this.intercostaisAte;
	}

	public void setIntercostaisAte(Short intercostaisAte) {
		this.intercostaisAte = intercostaisAte;
	}

	@Column(name = "LATENCIA")
	public Short getLatencia() {
		return this.latencia;
	}

	public void setLatencia(Short latencia) {
		this.latencia = latencia;
	}

	@Column(name = "DURACAO")
	public Short getDuracao() {
		return this.duracao;
	}

	public void setDuracao(Short duracao) {
		this.duracao = duracao;
	}

	@Column(name = "DURACAO_MAIOR_IGUAL", length = 1)
	@Length(max = 1)
	public String getDuracaoMaiorIgual() {
		return this.duracaoMaiorIgual;
	}

	public void setDuracaoMaiorIgual(String duracaoMaiorIgual) {
		this.duracaoMaiorIgual = duracaoMaiorIgual;
	}

	@Column(name = "USO_CATETER", nullable = false, length = 1)
	@Length(max = 1)
	public String getUsoCateter() {
		return this.usoCateter;
	}

	public void setUsoCateter(String usoCateter) {
		this.usoCateter = usoCateter;
	}

	@Column(name = "NUMERO_CATETER")
	public Short getNumeroCateter() {
		return this.numeroCateter;
	}

	public void setNumeroCateter(Short numeroCateter) {
		this.numeroCateter = numeroCateter;
	}

	@Column(name = "INFUSAO_CONTINUA", nullable = false, length = 1)
	@Length(max = 1)
	public String getInfusaoContinua() {
		return this.infusaoContinua;
	}

	public void setInfusaoContinua(String infusaoContinua) {
		this.infusaoContinua = infusaoContinua;
	}

	@Column(name = "BLOQUEIO_EXECUTADO_EQP_CIRURGI", nullable = false, length = 1)
	@Length(max = 1)
	public String getBloqueioExecutadoEqpCirurgi() {
		return this.bloqueioExecutadoEqpCirurgi;
	}

	public void setBloqueioExecutadoEqpCirurgi(String bloqueioExecutadoEqpCirurgi) {
		this.bloqueioExecutadoEqpCirurgi = bloqueioExecutadoEqpCirurgi;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO")})
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	@Column(name = "CATETER_PREVIO", length = 1)
	@Length(max = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getCateterPrevio() {
		return this.cateterPrevio;
	}

	public void setCateterPrevio(Boolean cateterPrevio) {
		this.cateterPrevio = cateterPrevio;
	}

	@Column(name = "NEUROEIXO", length = 1)
	@Length(max = 1)
	public String getNeuroeixo() {
		return this.neuroeixo;
	}

	public void setNeuroeixo(String neuroeixo) {
		this.neuroeixo = neuroeixo;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		FICHA_ANESTESIA("fichaAnestesia"),
		IV_REGIONAL("ivRegional"),
		BLOQUEIO_NERVO_PLEXO("bloqueioNervoPlexo"),
		INTERCOSTAIS("intercostais"),
		INTERCOSTAIS_BILATERAL("intercostaisBilateral"),
		PERIDURAL("peridural"),
		SUBARACNOIDE("subaracnoide"),
		CAUDAL("caudal"),
		INTERCOSTAIS_DE("intercostaisDe"),
		INTERCOSTAIS_ATE("intercostaisAte"),
		LATENCIA("latencia"),
		DURACAO("duracao"),
		DURACAO_MAIOR_IGUAL("duracaoMaiorIgual"),
		USO_CATETER("usoCateter"),
		NUMERO_CATETER("numeroCateter"),
		INFUSAO_CONTINUA("infusaoContinua"),
		BLOQUEIO_EXECUTADO_EQP_CIRURGI("bloqueioExecutadoEqpCirurgi"),
		CRIADO_EM("criadoEm"),
		SERVIDOR("servidor"),
		CATETER_PREVIO("cateterPrevio"),
		NEUROEIXO("neuroeixo");

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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof MbcFichaAnestesiaRegional)) {
			return false;
		}
		MbcFichaAnestesiaRegional other = (MbcFichaAnestesiaRegional) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FIC_SEQ", nullable = false)
	public MbcFichaAnestesias getFichaAnestesia() {
		return fichaAnestesia;
	}

	public void setFichaAnestesia(MbcFichaAnestesias fichaAnestesia) {
		this.fichaAnestesia = fichaAnestesia;
	}

}
