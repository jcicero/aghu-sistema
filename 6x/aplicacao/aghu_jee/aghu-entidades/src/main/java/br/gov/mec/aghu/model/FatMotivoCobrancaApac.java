package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * FatMotivoCobrancaApacs generated by hbm2java
 */
@Entity
@SequenceGenerator(name="fatMcaSq1", sequenceName="AGH.FAT_MCA_SQ1", allocationSize = 1)
@Table(name = "FAT_MOTIVO_COBRANCA_APACS", schema = "AGH")
public class FatMotivoCobrancaApac extends BaseEntitySeq<Byte> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2058918449041356247L;
	private Byte seq;
	private String descricao;
	private Byte codigoSus;
	private DominioSituacao indSituacaoRegistro;
	private String indSituacaoAlta;
	private Integer version;

	public FatMotivoCobrancaApac() {
	}

	public FatMotivoCobrancaApac(Byte seq, String descricao,
			String indSituacaoAlta) {
		this.seq = seq;
		this.descricao = descricao;
		this.indSituacaoAlta = indSituacaoAlta;
	}

	public FatMotivoCobrancaApac(Byte seq, String descricao, Byte codigoSus,
			DominioSituacao indSituacaoRegistro, String indSituacaoAlta) {
		this.seq = seq;
		this.descricao = descricao;
		this.codigoSus = codigoSus;
		this.indSituacaoRegistro = indSituacaoRegistro;
		this.indSituacaoAlta = indSituacaoAlta;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "fatMcaSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 2, scale = 0)
	public Byte getSeq() {
		return this.seq;
	}

	public void setSeq(Byte seq) {
		this.seq = seq;
	}

	@Column(name = "DESCRICAO", nullable = false)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "CODIGO_SUS", precision = 2, scale = 0)
	public Byte getCodigoSus() {
		return this.codigoSus;
	}

	public void setCodigoSus(Byte codigoSus) {
		this.codigoSus = codigoSus;
	}

	@Column(name = "IND_SITUACAO_REGISTRO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacaoRegistro() {
		return this.indSituacaoRegistro;
	}

	public void setIndSituacaoRegistro(DominioSituacao indSituacaoRegistro) {
		this.indSituacaoRegistro = indSituacaoRegistro;
	}

	@Column(name = "IND_SITUACAO_ALTA", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacaoAlta() {
		return this.indSituacaoAlta;
	}

	public void setIndSituacaoAlta(String indSituacaoAlta) {
		this.indSituacaoAlta = indSituacaoAlta;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		FatMotivoCobrancaApac other = (FatMotivoCobrancaApac) obj;
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
		DESCRICAO("descricao"), 
		CODIGO("codigoSus"),
		SITUACAO("indSituacaoRegistro")
		;

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
