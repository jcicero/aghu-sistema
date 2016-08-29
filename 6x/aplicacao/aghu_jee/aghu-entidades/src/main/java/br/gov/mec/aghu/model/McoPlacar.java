package br.gov.mec.aghu.model;

// Generated 26/02/2010 17:37:25 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * McoPlacars generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mcoPlrSq1", sequenceName="AGH.MCO_PLR_SQ1", allocationSize = 1)
@Table(name = "MCO_PLACARS", schema = "AGH")
public class McoPlacar extends BaseEntitySeq<Integer> implements java.io.Serializable {

	private static final long serialVersionUID = -7906960576414916934L;

	private Integer seq;
	private String previsaoNasc;
	private Date dataProvInterrup;
	private Byte iddGestSemanas;
	private String complementoDiag;
	private Date criadoEm;
	private DominioSituacao indSituacao;
	private Short eqpSeq;
	private Integer pacCodigo;
	private Integer digSeq;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Integer serMatriculaExcluido;
	private Short serVinCodigoExcluido;
	private Date dthrExclusao;

	public McoPlacar() {
	}

	public McoPlacar(Integer seq, String previsaoNasc, Byte iddGestSemanas,
			Date criadoEm, DominioSituacao indSituacao, Short eqpSeq, Integer pacCodigo,
			Integer digSeq, Integer serMatricula, Short serVinCodigo) {
		this.seq = seq;
		this.previsaoNasc = previsaoNasc;
		this.iddGestSemanas = iddGestSemanas;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.eqpSeq = eqpSeq;
		this.pacCodigo = pacCodigo;
		this.digSeq = digSeq;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	public McoPlacar(Integer seq, String previsaoNasc, Date dataProvInterrup,
			Byte iddGestSemanas, String complementoDiag, Date criadoEm,
			DominioSituacao indSituacao, Short eqpSeq, Integer pacCodigo, Integer digSeq,
			Integer serMatricula, Short serVinCodigo, Integer serMatriculaExcluido,
			Short serVinCodigoExcluido, Date dthrExclusao) {
		this.seq = seq;
		this.previsaoNasc = previsaoNasc;
		this.dataProvInterrup = dataProvInterrup;
		this.iddGestSemanas = iddGestSemanas;
		this.complementoDiag = complementoDiag;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.eqpSeq = eqpSeq;
		this.pacCodigo = pacCodigo;
		this.digSeq = digSeq;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.serMatriculaExcluido = serMatriculaExcluido;
		this.serVinCodigoExcluido = serVinCodigoExcluido;
		this.dthrExclusao = dthrExclusao;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mcoPlrSq1")
	@Column(name = "SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "PREVISAO_NASC", nullable = false, length = 10)
	@Length(max = 10)
	public String getPrevisaoNasc() {
		return this.previsaoNasc;
	}

	public void setPrevisaoNasc(String previsaoNasc) {
		this.previsaoNasc = previsaoNasc;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DATA_PROV_INTERRUP", length = 7)
	public Date getDataProvInterrup() {
		return this.dataProvInterrup;
	}

	public void setDataProvInterrup(Date dataProvInterrup) {
		this.dataProvInterrup = dataProvInterrup;
	}

	@Column(name = "IDD_GEST_SEMANAS", nullable = false, precision = 2, scale = 0)
	public Byte getIddGestSemanas() {
		return this.iddGestSemanas;
	}

	public void setIddGestSemanas(Byte iddGestSemanas) {
		this.iddGestSemanas = iddGestSemanas;
	}

	@Column(name = "COMPLEMENTO_DIAG", length = 200)
	@Length(max = 200)
	public String getComplementoDiag() {
		return this.complementoDiag;
	}

	public void setComplementoDiag(String complementoDiag) {
		this.complementoDiag = complementoDiag;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "EQP_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getEqpSeq() {
		return this.eqpSeq;
	}

	public void setEqpSeq(Short eqpSeq) {
		this.eqpSeq = eqpSeq;
	}

	@Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "DIG_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getDigSeq() {
		return this.digSeq;
	}

	public void setDigSeq(Integer digSeq) {
		this.digSeq = digSeq;
	}

	@Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "SER_MATRICULA_EXCLUIDO", precision = 7, scale = 0)
	public Integer getSerMatriculaExcluido() {
		return this.serMatriculaExcluido;
	}

	public void setSerMatriculaExcluido(Integer serMatriculaExcluido) {
		this.serMatriculaExcluido = serMatriculaExcluido;
	}

	@Column(name = "SER_VIN_CODIGO_EXCLUIDO", precision = 3, scale = 0)
	public Short getSerVinCodigoExcluido() {
		return this.serVinCodigoExcluido;
	}

	public void setSerVinCodigoExcluido(Short serVinCodigoExcluido) {
		this.serVinCodigoExcluido = serVinCodigoExcluido;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_EXCLUSAO", length = 7)
	public Date getDthrExclusao() {
		return this.dthrExclusao;
	}

	public void setDthrExclusao(Date dthrExclusao) {
		this.dthrExclusao = dthrExclusao;
	}
	
	public enum Fields {
		CODIGO_PACIENTE("pacCodigo");
		
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
		if (!(obj instanceof McoPlacar)) {
			return false;
		}
		McoPlacar other = (McoPlacar) obj;
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

}
