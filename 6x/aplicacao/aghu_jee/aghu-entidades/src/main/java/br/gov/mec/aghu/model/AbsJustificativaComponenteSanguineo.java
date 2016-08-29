package br.gov.mec.aghu.model;

// Generated 31/10/2010 17:06:40 by Hibernate Tools 3.2.5.Beta

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
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.dominio.DominioTipoPaciente;
import br.gov.mec.aghu.core.exception.BaseRuntimeException;
import br.gov.mec.aghu.core.exception.BusinessExceptionCode;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AbsJustifComponentesSang generated by hbm2java
 */

@Entity
@Table(name = "ABS_JUSTIF_COMPONENTES_SANG", schema = "AGH")
@SequenceGenerator(name = "absJcsSq1", sequenceName = "AGH.ABS_JCS_SQ1", allocationSize = 1)
public class AbsJustificativaComponenteSanguineo extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -744493013628069426L;

	private enum AbsJustifComponentesSangExceptionCode implements
			BusinessExceptionCode {
		ABS_JCS_CK3
	}

	private Integer seq;

	private String descricao;

	private Boolean descricaoLivre;

	private DominioSituacao situacao;

	private Date criadoEm;

	private Date alteradoEm;

	private DominioTipoPaciente tipoPaciente;

	private AbsComponenteSanguineo componenteSanguineo;

	private AbsProcedHemoterapico procedimentoHemoterapico;

	private RapServidores servidor;

	private RapServidores servidorAlterado;

	private AbsGrupoJustificativaComponenteSanguineo grupoJustificativaComponenteSanguineo;

	private Boolean confProtHcpa;
	
	private Integer version;

	public AbsJustificativaComponenteSanguineo() {
	}

	public AbsJustificativaComponenteSanguineo(Integer seq, String descricao,
			Boolean descricaoLivre, DominioSituacao situacao, Date criadoEm,
			DominioTipoPaciente tipoPaciente, RapServidores servidor, 
			AbsGrupoJustificativaComponenteSanguineo grupoJustificativaComponenteSanguineo,
			Boolean confProtHcpa) {
		this.seq = seq;
		this.descricao = descricao;
		this.descricaoLivre = descricaoLivre;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.tipoPaciente = tipoPaciente;
		this.servidor = servidor;
		this.grupoJustificativaComponenteSanguineo = grupoJustificativaComponenteSanguineo;
		this.confProtHcpa = confProtHcpa;
	}

	public AbsJustificativaComponenteSanguineo(Integer seq, String descricao,
			Boolean descricaoLivre, DominioSituacao situacao, Date criadoEm,
			Date alteradoEm, DominioTipoPaciente tipoPaciente,
			AbsComponenteSanguineo componenteSanguineo,
			AbsProcedHemoterapico procedimentoHemoterapico,
			RapServidores servidor, RapServidores servidorAlterado,
			AbsGrupoJustificativaComponenteSanguineo grupoJustificativaComponenteSanguineo, 
			Boolean confProtHcpa) {
		this.seq = seq;
		this.descricao = descricao;
		this.descricaoLivre = descricaoLivre;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.tipoPaciente = tipoPaciente;
		this.componenteSanguineo = componenteSanguineo;
		this.procedimentoHemoterapico = procedimentoHemoterapico;
		this.servidor = servidor;
		this.servidorAlterado = servidorAlterado;
		this.grupoJustificativaComponenteSanguineo = grupoJustificativaComponenteSanguineo;
		this.confProtHcpa = confProtHcpa;
	}

	@Id
	@Column(name = "SEQ", unique = true, nullable = false, precision = 5, scale = 0)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "absJcsSq1")
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 500)
	@Length(max = 500)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_DESCRICAO_LIVRE", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getDescricaoLivre() {
		return this.descricaoLivre;
	}

	public void setDescricaoLivre(Boolean descricaoLivre) {
		this.descricaoLivre = descricaoLivre;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "TIPO_PACIENTE", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoPaciente getTipoPaciente() {
		return this.tipoPaciente;
	}

	public void setTipoPaciente(DominioTipoPaciente tipoPaciente) {
		this.tipoPaciente = tipoPaciente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CSA_CODIGO", referencedColumnName = "CODIGO")
	public AbsComponenteSanguineo getComponenteSanguineo() {
		return componenteSanguineo;
	}

	public void setComponenteSanguineo(
			AbsComponenteSanguineo componenteSanguineo) {
		this.componenteSanguineo = componenteSanguineo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PHE_CODIGO", referencedColumnName = "CODIGO")
	public AbsProcedHemoterapico getProcedimentoHemoterapico() {
		return procedimentoHemoterapico;
	}

	public void setProcedimentoHemoterapico(
			AbsProcedHemoterapico procedimentoHemoterapico) {
		this.procedimentoHemoterapico = procedimentoHemoterapico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorAlterado() {
		return servidorAlterado;
	}

	public void setServidorAlterado(RapServidores servidorAlterado) {
		this.servidorAlterado = servidorAlterado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GJC_SEQ", referencedColumnName = "SEQ", nullable = false)
	public AbsGrupoJustificativaComponenteSanguineo getGrupoJustificativaComponenteSanguineo() {
		return this.grupoJustificativaComponenteSanguineo;
	}

	public void setGrupoJustificativaComponenteSanguineo(AbsGrupoJustificativaComponenteSanguineo grupoJustificativaComponenteSanguineo) {
		this.grupoJustificativaComponenteSanguineo = grupoJustificativaComponenteSanguineo;
	}

	@Column(name = "IND_CONF_PROT_HCPA", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getConfProtHcpa() {
		return this.confProtHcpa;
	}

	public void setConfProtHcpa(Boolean confProtHcpa) {
		this.confProtHcpa = confProtHcpa;
	}

	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validacoes() {
		if (!((componenteSanguineo != null && procedimentoHemoterapico == null) || (componenteSanguineo == null && procedimentoHemoterapico != null))) {
			throw new BaseRuntimeException(
					AbsJustifComponentesSangExceptionCode.ABS_JCS_CK3);
		}

		// DATA DEFAULT
		if (this.descricaoLivre == null) {
			this.descricaoLivre = true;
		}
		if (this.confProtHcpa == null) {
			this.confProtHcpa = true;
		}
	}

	public enum Fields {
		
		SEQ("seq"),
		DESCRICAO("descricao"),
		DESCRICAO_LIVRE("descricaoLivre"),
		SITUACAO("situacao"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		TIPO_PACIENTE("tipoPaciente"),
		COMPONENTE_SANGUINEO("componenteSanguineo"),
		PROCEDIMENTO_HEMOTERAPICO("procedimentoHemoterapico"),
		SERVIDOR("servidor"),
		SERVIDOR_ALTERADO("servidorAlterado"),
		CONF_PROT_HCPA("confProtHcpa"),
		GRUPO_JUSTIFICATIVA("grupoJustificativaComponenteSanguineo");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
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
		AbsJustificativaComponenteSanguineo other = (AbsJustificativaComponenteSanguineo) obj;
		if (seq == null) {
			if (other.seq != null) {
				return false;
			}
		} else if (!seq.equals(other.seq)) {
			return false;
		}
		return true;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
