package br.gov.mec.aghu.model;

// Generated 19/04/2012 16:59:07 by Hibernate Tools 3.4.0.CR1

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
 * AghDocumentosAssinados generated by hbm2java
 */
@Entity
@Table(name = "AGH_DOCUMENTOS_ASSINADOS", schema = "AGH")
public class AghDocumentosAssinados extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7962863103739762943L;
	private Integer seq;
	private Integer version;
	private String tipoDoc;
	private byte[] docAssinado;
	private byte[] docOriginal;
	private Integer atdSeq;
	private MbcCirurgias cirurgia;
	private RapServidores servidor;
	private Date criadoEm;

	public AghDocumentosAssinados() {
	}

	public AghDocumentosAssinados(Integer seq, RapServidores servidor, Date criadoEm) {
		this.seq = seq;
		this.servidor = servidor;
		this.criadoEm = criadoEm;
	}

	public AghDocumentosAssinados(Integer seq, String tipoDoc, byte[] docAssinado,
			byte[] docOriginal, Integer atdSeq, MbcCirurgias cirurgia,
			RapServidores servidor, Date criadoEm) {
		this.seq = seq;
		this.tipoDoc = tipoDoc;
		this.docAssinado = docAssinado;
		this.docOriginal = docOriginal;
		this.atdSeq = atdSeq;
		this.cirurgia = cirurgia;
		this.servidor = servidor;
		this.criadoEm = criadoEm;
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

	@Column(name = "TIPO_DOC", length = 5)
	@Length(max = 5)
	public String getTipoDoc() {
		return this.tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	@Column(name = "DOC_ASSINADO")
	public byte[] getDocAssinado() {
		return this.docAssinado;
	}

	public void setDocAssinado(byte[] docAssinado) {
		this.docAssinado = docAssinado;
	}

	@Column(name = "DOC_ORIGINAL")
	public byte[] getDocOriginal() {
		return this.docOriginal;
	}

	public void setDocOriginal(byte[] docOriginal) {
		this.docOriginal = docOriginal;
	}

	@Column(name = "ATD_SEQ")
	public Integer getAtdSeq() {
		return this.atdSeq;
	}

	public void setAtdSeq(Integer atdSeq) {
		this.atdSeq = atdSeq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@JoinColumns( {
		@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	public RapServidores getServidor() {
		return servidor;
	}
	
	public enum Fields {
		CRG_SEQ("cirurgia.seq"),
		CIRURGIA("cirurgia"),
		DOC_ASSINADO("docAssinado");

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
		if (!(obj instanceof AghDocumentosAssinados)) {
			return false;
		}
		AghDocumentosAssinados other = (AghDocumentosAssinados) obj;
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

	public void setCirurgia(MbcCirurgias cirurgia) {
		this.cirurgia = cirurgia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CRG_SEQ")
	public MbcCirurgias getCirurgia() {
		return cirurgia;
	}

}