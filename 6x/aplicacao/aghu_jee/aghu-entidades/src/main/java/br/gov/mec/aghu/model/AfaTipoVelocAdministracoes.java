package br.gov.mec.aghu.model;

// Generated 21/09/2010 19:23:57 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;
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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AfaTipoVelocAdministracoes generated by hbm2java
 */
@Entity
@SequenceGenerator(name="afaTvaSq1", sequenceName="AGH.AFA_TVA_SQ1", allocationSize = 1)
@Table(name = "AFA_TIPO_VELOC_ADMINISTRACOES", schema = "AGH")
public class AfaTipoVelocAdministracoes extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5869592524539307989L;
	private Short seq;
	private RapServidores servidor;
	private String descricao;
	private Date criadoEm;
	private Boolean indTipoUsualNpt;
	private Boolean indTipoUsualSoroterapia;
	private DominioSituacao indSituacao;
	private BigDecimal fatorConversaoMlh;

	public AfaTipoVelocAdministracoes() {
	}

	public AfaTipoVelocAdministracoes(Short seq, RapServidores servidor,
			String descricao, Date criadoEm, Boolean indTipoUsualNpt,
			Boolean indTipoUsualSoroterapia, DominioSituacao indSituacao,
			BigDecimal fatorConversaoMlh) {
		this.seq = seq;
		this.servidor = servidor;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.indTipoUsualNpt = indTipoUsualNpt;
		this.indTipoUsualSoroterapia = indTipoUsualSoroterapia;
		this.indSituacao = indSituacao;
		this.fatorConversaoMlh = fatorConversaoMlh;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "afaTvaSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 3, scale = 0)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 20)
	@Length(max = 20)
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

	@Column(name = "IND_TIPO_USUAL_NPT", nullable = false)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndTipoUsualNpt() {
		return this.indTipoUsualNpt;
	}

	public void setIndTipoUsualNpt(Boolean indTipoUsualNpt) {
		this.indTipoUsualNpt = indTipoUsualNpt;
	}

	@Column(name = "IND_TIPO_USUAL_SOROTERAPIA", nullable = false)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndTipoUsualSoroterapia() {
		return this.indTipoUsualSoroterapia;
	}

	public void setIndTipoUsualSoroterapia(Boolean indTipoUsualSoroterapia) {
		this.indTipoUsualSoroterapia = indTipoUsualSoroterapia;
	}

	@Column(name = "IND_SITUACAO", nullable = false)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "FATOR_CONVERSAO_MLH", nullable = false, precision = 14, scale = 4)
	public BigDecimal getFatorConversaoMlh() {
		return this.fatorConversaoMlh;
	}

	public void setFatorConversaoMlh(BigDecimal fatorConversaoMlh) {
		this.fatorConversaoMlh = fatorConversaoMlh;
	}

	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validacoes() {
		if (this.indTipoUsualNpt == null) {
			this.indTipoUsualNpt = Boolean.FALSE;
		}
	
		if (this.indTipoUsualSoroterapia == null) {
			this.indTipoUsualSoroterapia = Boolean.FALSE;
		}
		
		if (this.indSituacao == null) {
			this.indSituacao = DominioSituacao.A;
		}
	}
	
	public enum Fields {

		SEQ("seq"), RAP_SERVIDOR("servidor"), DESCRICAO("descricao"), CRIADO_EM(
				"criadoEm"), IND_TIPO_USUAL_NPT("indTipoUsualNpt"), IND_TIPO_USUAL_SOROTERAPIA(
				"indTipoUsualSoroterapia"), IND_SITUACAO("indSituacao"), FATOR_CONVERSAO_MLH(
				"fatorConversaoMlh");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}

	}

	@Override
	public boolean equals(Object other) {
		if (!(other instanceof AfaTipoVelocAdministracoes)) {
			return false;
		}
		AfaTipoVelocAdministracoes castOther = (AfaTipoVelocAdministracoes) other;
		return new EqualsBuilder().append(this.seq, castOther.getSeq())
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.seq).toHashCode();
	}
	
}
