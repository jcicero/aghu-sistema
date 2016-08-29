package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MpmMetodoDiagnosticoTb generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mpmMdtSq1", sequenceName="AGH.MPM_MDT_SQ1", allocationSize = 1)
@Table(name = "MPM_METODO_DIAGNOSTICO_TBS", schema = "AGH")
public class MpmMetodoDiagnosticoTb extends BaseEntitySeq<Short> implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4674731512785376872L;

	/**
	 * Chave primária da base de dados.
	 */
	private Short seq;
	
	/**
	 * 
	 */
	private RapServidores servidor;
	
	/**
	 * 
	 */
	private String descricao;
	
	/**
	 * 
	 */
	private Date criadoEm;
	
	/**
	 * 
	 */
	private Boolean indInfResultApBiopsia;
	
	/**
	 * 
	 */
	private Boolean indInfLocalizacao;
	
	/**
	 * 
	 */
	private Boolean indExigeDescComplementar;
	
	/**
	 * 
	 */
	private DominioSituacao indSituacao;
	
	
	private Set<MpmResultMetodoDiagTb> mpmResultMetodoDiagTbs = new HashSet<MpmResultMetodoDiagTb>(
			0);

	public MpmMetodoDiagnosticoTb() {
	}

	public MpmMetodoDiagnosticoTb(Short seq, RapServidores servidor, String descricao, Date criadoEm,
			Boolean indInfResultApBiopsia, Boolean indInfLocalizacao,
			Boolean indExigeDescComplementar, DominioSituacao indSituacao) {
		this.seq = seq;
		this.servidor = servidor;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.indInfResultApBiopsia = indInfResultApBiopsia;
		this.indInfLocalizacao = indInfLocalizacao;
		this.indExigeDescComplementar = indExigeDescComplementar;
		this.indSituacao = indSituacao;
	}

	public MpmMetodoDiagnosticoTb(Short seq, RapServidores servidor, String descricao, Date criadoEm,
			Boolean indInfResultApBiopsia, Boolean indInfLocalizacao,
			Boolean indExigeDescComplementar, DominioSituacao indSituacao,
			Set<MpmResultMetodoDiagTb> mpmResultMetodoDiagTbs) {
		this.seq = seq;
		this.servidor = servidor;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.indInfResultApBiopsia = indInfResultApBiopsia;
		this.indInfLocalizacao = indInfLocalizacao;
		this.indExigeDescComplementar = indExigeDescComplementar;
		this.indSituacao = indSituacao;
		this.mpmResultMetodoDiagTbs = mpmResultMetodoDiagTbs;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mpmMdtSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 3, scale = 0)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	@Column(name = "IND_INF_RESULT_AP_BIOPSIA", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")	
	public Boolean getIndInfResultApBiopsia() {
		return this.indInfResultApBiopsia;
	}

	public void setIndInfResultApBiopsia(Boolean indInfResultApBiopsia) {
		this.indInfResultApBiopsia = indInfResultApBiopsia;
	}

	
	@Column(name = "IND_INF_LOCALIZACAO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")	
	public Boolean getIndInfLocalizacao() {
		return this.indInfLocalizacao;
	}

	public void setIndInfLocalizacao(Boolean indInfLocalizacao) {
		this.indInfLocalizacao = indInfLocalizacao;
	}

	
	@Column(name = "IND_EXIGE_DESC_COMPLEMENTAR", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")	
	public Boolean getIndExigeDescComplementar() {
		return this.indExigeDescComplementar;
	}

	public void setIndExigeDescComplementar(Boolean indExigeDescComplementar) {
		this.indExigeDescComplementar = indExigeDescComplementar;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "metodoDiagnosticoTuberculose")
	public Set<MpmResultMetodoDiagTb> getMpmResultMetodoDiagTbs() {
		return this.mpmResultMetodoDiagTbs;
	}

	public void setMpmResultMetodoDiagTbs(
			Set<MpmResultMetodoDiagTb> mpmResultMetodoDiagTbs) {
		this.mpmResultMetodoDiagTbs = mpmResultMetodoDiagTbs;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seq == null) ? 0 : seq.hashCode());
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
		if (!(obj instanceof MpmMetodoDiagnosticoTb)) {
			return false;
		}
		MpmMetodoDiagnosticoTb other = (MpmMetodoDiagnosticoTb) obj;
		if (seq == null) {
			if (other.seq != null) {
				return false;
			}
		} else if (!seq.equals(other.seq)) {
			return false;
		}
		return true;
	}

	public enum Fields {

		SEQ("seq"),
		SERVIDOR("servidor"),
		DESCRICAO("descricao"),
		CRIADO_EM("criadoEm"),
		IND_INF_RESULT_AP_BIOPSIA("indInfResultApBiopsia"),
		IND_INF_LOCALIZACAO("indInfLocalizacao"),
		IND_EXIGE_DESC_COMPLEMENTAR("indExigeDescComplementar"),
		IND_SITUACAO("indSituacao"),
		MPM_RESULT_METODO_DIAG_TBS("mpmResultMetodoDiagTbs");

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
