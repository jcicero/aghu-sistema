package br.gov.mec.aghu.model;

// Generated 24/02/2010 13:16:57 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSimNao;
import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AghCapitulosCid generated by hbm2java
 */
@SuppressWarnings({"PMD.AghuUsoIndevidoDaEnumDominioSimNaoEntity"})

@Entity
@Table(name = "AGH_CAPITULOS_CID", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = "NUMERO"))
@SequenceGenerator(name = "aghCpcSq1", sequenceName = "AGH.AGH_CPC_SQ1", allocationSize = 1)
public class AghCapitulosCid extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7388883195190772760L;
	private Integer seq;
	private Short numero;
	private String descricao;
	private DominioSimNao indDiagPrincipal;
	private DominioSituacao indSituacao;
	private DominioSimNao indExigeCidSecundario;
	private Date criadoEm;
	private RapServidores rapServidor;

	public AghCapitulosCid() {
	}

	public AghCapitulosCid(Integer seq, Short numero, String descricao,
			DominioSimNao indDiagPrincipal, DominioSituacao indSituacao,
			DominioSimNao indExigeCidSecundario, Date criadoEm) {
		this.seq = seq;
		this.numero = numero;
		this.descricao = descricao;
		this.indDiagPrincipal = indDiagPrincipal;
		this.indSituacao = indSituacao;
		this.indExigeCidSecundario = indExigeCidSecundario;
		this.criadoEm = criadoEm;
	}

	@Id
	@Column(name = "SEQ", nullable = false, precision = 4, scale = 0, updatable=false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aghCpcSq1")
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "NUMERO", nullable = false, precision = 3, scale = 0)
	public Short getNumero() {
		return this.numero;
	}

	public void setNumero(Short numero) {
		this.numero = numero;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 130, updatable=false)
	@Length(max = 130)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_DIAG_PRINCIPAL", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndDiagPrincipal() {
		return this.indDiagPrincipal;
	}

	public void setIndDiagPrincipal(DominioSimNao indDiagPrincipal) {
		this.indDiagPrincipal = indDiagPrincipal;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "IND_EXIGE_CID_SECUNDARIO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndExigeCidSecundario() {
		return this.indExigeCidSecundario;
	}

	public void setIndExigeCidSecundario(DominioSimNao indExigeCidSecundario) {
		this.indExigeCidSecundario = indExigeCidSecundario;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7, updatable=false)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	/**
	 * Campo sintético criado para mapear diretamente este dominio booleano em
	 * um componente selectOneCheckBox
	 * 
	 * @author jvaranda
	 * @return
	 */
	@Transient
	public boolean isAtivo() {
		if (indSituacao != null && indSituacao.isAtivo()) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}
	
	@Transient
	public void setAtivo(boolean ativo) {
		if (ativo) {
			this.indSituacao = DominioSituacao.A;
		} else {
			this.indSituacao = DominioSituacao.I;
		}
	}
	
	@Transient
	public boolean isDiagPrincipal() {
		if (indDiagPrincipal != null && indDiagPrincipal.isSim()) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}
	
	@Transient
	public void setDiagPrincipal(boolean diagPrincipal) {
		if (diagPrincipal) {
			this.indDiagPrincipal = DominioSimNao.S;
		} else {
			this.indDiagPrincipal = DominioSimNao.N;
		}
	}
	
	@Transient
	public boolean isExigeCidSecundario() {
		if (indExigeCidSecundario != null && indExigeCidSecundario.isSim()) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}
	
	@Transient
	public void setExigeCidSecundario(boolean exigeCidSecundario) {
		if (exigeCidSecundario) {
			this.indExigeCidSecundario = DominioSimNao.S;
		} else {
			this.indExigeCidSecundario = DominioSimNao.N;
		}
	}

	
	public enum Fields {
		SEQ("seq"), NUMERO("numero"),DESCRICAO("descricao"), 
		IND_DIAG_PRINCIPAL("indDiagPrincipal"), IND_SITUACAO("indSituacao"), CRIADO_EM("criadoEm"), 
		IND_EXIGE_CID_SECUNDARIO("indExigeCidSecundario"),
		RAP_SERVIDOR_MATRICULA("rapServidor.id.matricula"), RAP_SERVIDOR_VIN_CODIGO("rapServidor.id.vinCodigo");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false, updatable=false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false, updatable=false) })
	public RapServidores getRapServidor() {
		return this.rapServidor;
	}

	public void setRapServidor(RapServidores rapServidor) {
		this.rapServidor = rapServidor;
	}

	@Override
	public String toString() {
		return descricao;
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
		if (!(obj instanceof AghCapitulosCid)) {
			return false;
		}
		AghCapitulosCid other = (AghCapitulosCid) obj;
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
