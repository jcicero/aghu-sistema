package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MpmTipoEsquemaTb generated by hbm2java
 */

@Entity
@SequenceGenerator(name="mpmTetSq1", sequenceName="AGH.MPM_TET_SQ1", allocationSize = 1)
@Table(name = "MPM_TIPO_ESQUEMA_TBS", schema = "AGH")
public class MpmTipoEsquemaTb extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1508396994730949841L;
	private Short seq;
	private Integer serMatricula;
	private Short serVinCodigo;
	private String descricao;
	private Date criadoEm;
	private String indExigeJustificativa;
	private String indExigeDescComplementar;
	private String indSituacao;
	private Set<MpmEsquemaTbUtilizado> mpmEsquemaTbUtilizadoses = new HashSet<MpmEsquemaTbUtilizado>(
			0);
	private Set<MpmTrocaEsquemaTb> mpmTrocaEsquemaTbses = new HashSet<MpmTrocaEsquemaTb>(
			0);

	public MpmTipoEsquemaTb() {
	}

	public MpmTipoEsquemaTb(Short seq, Integer serMatricula, Short serVinCodigo,
			String descricao, Date criadoEm, String indExigeJustificativa,
			String indExigeDescComplementar, String indSituacao) {
		this.seq = seq;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.indExigeJustificativa = indExigeJustificativa;
		this.indExigeDescComplementar = indExigeDescComplementar;
		this.indSituacao = indSituacao;
	}

	public MpmTipoEsquemaTb(Short seq, Integer serMatricula, Short serVinCodigo,
			String descricao, Date criadoEm, String indExigeJustificativa,
			String indExigeDescComplementar, String indSituacao,
			Set<MpmEsquemaTbUtilizado> mpmEsquemaTbUtilizadoses,
			Set<MpmTrocaEsquemaTb> mpmTrocaEsquemaTbses) {
		this.seq = seq;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.indExigeJustificativa = indExigeJustificativa;
		this.indExigeDescComplementar = indExigeDescComplementar;
		this.indSituacao = indSituacao;
		this.mpmEsquemaTbUtilizadoses = mpmEsquemaTbUtilizadoses;
		this.mpmTrocaEsquemaTbses = mpmTrocaEsquemaTbses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mpmTetSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 3, scale = 0)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
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

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_EXIGE_JUSTIFICATIVA", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndExigeJustificativa() {
		return this.indExigeJustificativa;
	}

	public void setIndExigeJustificativa(String indExigeJustificativa) {
		this.indExigeJustificativa = indExigeJustificativa;
	}

	@Column(name = "IND_EXIGE_DESC_COMPLEMENTAR", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndExigeDescComplementar() {
		return this.indExigeDescComplementar;
	}

	public void setIndExigeDescComplementar(String indExigeDescComplementar) {
		this.indExigeDescComplementar = indExigeDescComplementar;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoEsquemaTbs")
	public Set<MpmEsquemaTbUtilizado> getMpmEsquemaTbUtilizadoses() {
		return this.mpmEsquemaTbUtilizadoses;
	}

	public void setMpmEsquemaTbUtilizadoses(
			Set<MpmEsquemaTbUtilizado> mpmEsquemaTbUtilizadoses) {
		this.mpmEsquemaTbUtilizadoses = mpmEsquemaTbUtilizadoses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mpmTipoEsquemaTbs")
	public Set<MpmTrocaEsquemaTb> getMpmTrocaEsquemaTbses() {
		return this.mpmTrocaEsquemaTbses;
	}

	public void setMpmTrocaEsquemaTbses(
			Set<MpmTrocaEsquemaTb> mpmTrocaEsquemaTbses) {
		this.mpmTrocaEsquemaTbses = mpmTrocaEsquemaTbses;
	}

	public enum Fields {

		SEQ("seq"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		DESCRICAO("descricao"),
		CRIADO_EM("criadoEm"),
		IND_EXIGE_JUSTIFICATIVA("indExigeJustificativa"),
		IND_EXIGE_DESC_COMPLEMENTAR("indExigeDescComplementar"),
		IND_SITUACAO("indSituacao"),
		MPM_ESQUEMA_TB_UTILIZADOSES("mpmEsquemaTbUtilizadoses"),
		MPM_TROCA_ESQUEMA_TBSES("mpmTrocaEsquemaTbses");

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
		if (!(obj instanceof MpmTipoEsquemaTb)) {
			return false;
		}
		MpmTipoEsquemaTb other = (MpmTipoEsquemaTb) obj;
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
