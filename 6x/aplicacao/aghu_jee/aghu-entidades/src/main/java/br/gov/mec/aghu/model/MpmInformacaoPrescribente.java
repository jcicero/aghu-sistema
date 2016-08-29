package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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

import br.gov.mec.aghu.core.exception.BaseRuntimeException;
import br.gov.mec.aghu.core.exception.BusinessExceptionCode;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MpmInformacaoPrescribente generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mpmIfpSq1", sequenceName="AGH.MPM_IFP_SQ1", allocationSize = 1)

@Table(name = "MPM_INFORMACAO_PRESCRIBENTES", schema = "AGH")
public class MpmInformacaoPrescribente extends BaseEntitySeq<Integer> implements java.io.Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7503713460285210968L;
	private Integer seq;
	private MpmPrescricaoMedica prescricaoMedica;
	private RapServidores servidor;
	private RapServidores servidorVerificado;
	private AghUnidadesFuncionais unidadeFuncional;
	private AghAtendimentos atendimento;
	private Date criadoEm;
	private String descricao;
	private Boolean indInfVerificada;
	private Date dthrInfVerificada;
	private VRapServidorConselho servidorConselho;
	
	private Integer pmeAtdSeq;
	private Integer pmeSeq;
	private Short unfSeq;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Integer serMatriculaVerificada;
	private Short serVinCodigoVerificada;
	private Integer atdSeq;

	private enum InformacaoPrescribentesExceptionCode implements BusinessExceptionCode {
		AGHU_IFP_ERRO_GRAVAR, AGHU_IFP_ERRO_CHCK_CONST_MPM_IFP_CK3
	}
	
	public MpmInformacaoPrescribente() {
	}

	public MpmInformacaoPrescribente(Integer seq, RapServidores servidor,
			AghUnidadesFuncionais unidadeFuncional, AghAtendimentos atendimento,
			Date criadoEm, String descricao, Boolean indInfVerificada) {
		this.seq = seq;
		this.servidor = servidor;
		this.unidadeFuncional = unidadeFuncional;
		this.atendimento = atendimento;
		this.criadoEm = criadoEm;
		this.descricao = descricao;
		this.indInfVerificada = indInfVerificada;
	}

	public MpmInformacaoPrescribente(Integer seq,
			MpmPrescricaoMedica prescricaoMedica, RapServidores servidor,
			RapServidores servidorVerificado,
			AghUnidadesFuncionais unidadeFuncional, AghAtendimentos atendimento,
			Date criadoEm, String descricao, Boolean indInfVerificada,
			Date dthrInfVerificada) {
		this.seq = seq;
		this.prescricaoMedica = prescricaoMedica;
		this.servidor = servidor;
		this.servidorVerificado = servidorVerificado;
		this.unidadeFuncional = unidadeFuncional;
		this.atendimento = atendimento;
		this.criadoEm = criadoEm;
		this.descricao = descricao;
		this.indInfVerificada = indInfVerificada;
		this.dthrInfVerificada = dthrInfVerificada;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mpmIfpSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "PME_ATD_SEQ", referencedColumnName = "ATD_SEQ"),
			@JoinColumn(name = "PME_SEQ", referencedColumnName = "SEQ") })
	public MpmPrescricaoMedica getPrescricaoMedica() {
		return this.prescricaoMedica;
	}

	public void setPrescricaoMedica(MpmPrescricaoMedica prescricaoMedica) {
		this.prescricaoMedica = prescricaoMedica;
	}

	/**
	 * @return the servidor
	 */
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

		
	/**
	 * @return the servidor
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_VERIFICADA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_VERIFICADA", referencedColumnName = "VIN_CODIGO")})
	public RapServidores getServidorVerificado() {
		return this.servidorVerificado;
	}
	
	public void setServidorVerificado(RapServidores servidorVerificado) {
		this.servidorVerificado = servidorVerificado;
	}
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNF_SEQ", nullable = false)
	public AghUnidadesFuncionais getUnidadeFuncional() {
		return unidadeFuncional;
	}

	public void setUnidadeFuncional(AghUnidadesFuncionais unidadeFuncional) {
		this.unidadeFuncional = unidadeFuncional;
	}
	


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATD_SEQ", nullable = false)
	public AghAtendimentos getAtendimento() {
		return atendimento;
	}
	
	public void setAtendimento(AghAtendimentos atendimento) {
		this.atendimento = atendimento;
	}
	

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 500)
	@Length(max = 500, message="A descrição possui mais de 500 caracteres.")
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_INF_VERIFICADA", nullable = false, length = 1)
	@org.hibernate.annotations.Type( type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndInfVerificada() {
		return this.indInfVerificada;
	}

	public void setIndInfVerificada(Boolean indInfVerificada) {
		this.indInfVerificada = indInfVerificada;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_INF_VERIFICADA", length = 7)
	public Date getDthrInfVerificada() {
		return this.dthrInfVerificada;
	}

	public void setDthrInfVerificada(Date dthrInfVerificada) {
		this.dthrInfVerificada = dthrInfVerificada;
	}
	
	
	@Column(name="PME_ATD_SEQ", insertable=false, updatable=false)
	public Integer getPmeAtdSeq() {
		return pmeAtdSeq;
	}

	public void setPmeAtdSeq(Integer pmeAtdSeq) {
		this.pmeAtdSeq = pmeAtdSeq;
	}
	
	@Column(name="PME_SEQ", insertable=false, updatable=false)
	public Integer getPmeSeq() {
		return pmeSeq;
	}

	public void setPmeSeq(Integer pmeSeq) {
		this.pmeSeq = pmeSeq;
	}

	@Column(name="UNF_SEQ", insertable=false, updatable=false)
	public Short getUnfSeq() {
		return unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}
	
	@Column(name="SER_MATRICULA", insertable=false, updatable=false)
	public Integer getSerMatricula() {
		return serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name="SER_VIN_CODIGO", insertable=false, updatable=false)
	public Short getSerVinCodigo() {
		return serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name="SER_MATRICULA_VERIFICADA", insertable=false, updatable=false)
	public Integer getSerMatriculaVerificada() {
		return serMatriculaVerificada;
	}

	public void setSerMatriculaVerificada(Integer serMatriculaVerificada) {
		this.serMatriculaVerificada = serMatriculaVerificada;
	}

	@Column(name="SER_VIN_CODIGO_VERIFICADA", insertable=false, updatable=false)
	public Short getSerVinCodigoVerificada() {
		return serVinCodigoVerificada;
	}

	public void setSerVinCodigoVerificada(Short serVinCodigoVerificada) {
		this.serVinCodigoVerificada = serVinCodigoVerificada;
	}

	@Column(name="ATD_SEQ", insertable=false, updatable=false)
	public Integer getAtdSeq() {
		return atdSeq;
	}

	public void setAtdSeq(Integer atdSeq) {
		this.atdSeq = atdSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", insertable = false, updatable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", insertable = false, updatable = false) })
	public VRapServidorConselho getServidorConselho() {
		return servidorConselho;
	}

	public void setServidorConselho(VRapServidorConselho servidorConselho) {
		this.servidorConselho = servidorConselho;
	}
	
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.seq);
		umHashCodeBuilder.append(this.prescricaoMedica);
		umHashCodeBuilder.append(this.servidor);
		umHashCodeBuilder.append(this.servidorVerificado);
		umHashCodeBuilder.append(this.unidadeFuncional);
		umHashCodeBuilder.append(this.atendimento);
		umHashCodeBuilder.append(this.criadoEm);
		umHashCodeBuilder.append(this.descricao);
		umHashCodeBuilder.append(this.indInfVerificada);
		umHashCodeBuilder.append(this.dthrInfVerificada);
		umHashCodeBuilder.append(this.pmeAtdSeq);
		umHashCodeBuilder.append(this.pmeSeq);
		umHashCodeBuilder.append(this.unfSeq);
		umHashCodeBuilder.append(this.serMatricula);
		umHashCodeBuilder.append(this.serVinCodigo);
		umHashCodeBuilder.append(this.serMatriculaVerificada);
		umHashCodeBuilder.append(this.serVinCodigoVerificada);
		umHashCodeBuilder.append(this.atdSeq);
		return umHashCodeBuilder.toHashCode();
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
		MpmInformacaoPrescribente other = (MpmInformacaoPrescribente) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.seq, other.seq);
		umEqualsBuilder.append(this.prescricaoMedica, other.prescricaoMedica);
		umEqualsBuilder.append(this.servidor, other.servidor);
		umEqualsBuilder.append(this.servidorVerificado, other.servidorVerificado);
		umEqualsBuilder.append(this.unidadeFuncional, other.unidadeFuncional);
		umEqualsBuilder.append(this.atendimento, other.atendimento);
		umEqualsBuilder.append(this.criadoEm, other.criadoEm);
		umEqualsBuilder.append(this.descricao, other.descricao);
		umEqualsBuilder.append(this.indInfVerificada, other.indInfVerificada);
		umEqualsBuilder.append(this.dthrInfVerificada, other.dthrInfVerificada);
		umEqualsBuilder.append(this.pmeAtdSeq, other.pmeAtdSeq);
		umEqualsBuilder.append(this.pmeSeq, other.pmeSeq);
		umEqualsBuilder.append(this.unfSeq, other.unfSeq);
		umEqualsBuilder.append(this.serMatricula, other.serMatricula);
		umEqualsBuilder.append(this.serVinCodigo, other.serVinCodigo);
		umEqualsBuilder.append(this.serMatriculaVerificada, other.serMatriculaVerificada);
		umEqualsBuilder.append(this.serVinCodigoVerificada, other.serVinCodigoVerificada);
		umEqualsBuilder.append(this.atdSeq, other.atdSeq);
		return umEqualsBuilder.isEquals();
	}

	public enum Fields {
		SEQ("seq"),
		PRESCRICAO_MEDICA("prescricaoMedica"),
		SERVIDOR("servidor"),
		SERVIDOR_VERIFICADO("servidorVerificado"),
		UNIDADE_FUNCIONAL("unidadeFuncional"),
		ATENDIMENTO("atendimento"),
		CRIADO_EM("criadoEm"),
		DESCRICAO("descricao"),
		IND_INF_VERIFICADA("indInfVerificada"),
		DTHR_INF_VERIFICADA("dthrInfVerificada"),
		ATENDIMENTO_SEQ("atendimento.seq"),
		PME_ATD_SEQ("pmeAtdSeq"),
		PME_SEQ("pmeSeq"),
		UNF_SEQ("unfSeq"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		SER_MATRICULA_VERIFICADO("serMatriculaVerificada"),
		SER_VIN_CODIGO_VERIFICADO("serVinCodigoVerificada"),
		SERVIDOR_CONSELHO("servidorConselho");
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}
	
	
	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validarDados(){
		//(pme_atd_seq is null or pme_atd_seq = atd_seq)              
		if(!((this.prescricaoMedica == null || this.prescricaoMedica.getAtendimento().getSeq().equals(this.getAtendimento().getSeq())))){
			throw new BaseRuntimeException(InformacaoPrescribentesExceptionCode.AGHU_IFP_ERRO_GRAVAR);
		}
        //(ind_inf_verificada = 'N' and dthr_inf_verificada is null and ser_matricula_verificada is null and ser_vin_codigo_verificada is null) 
	    //or (ind_inf_verificada = 'S' and dthr_inf_verificada is not null and ser_matricula_verificada is not null and ser_vin_codigo_verificada is not null)              
		if( !((this.indInfVerificada.equals(false) && this.dthrInfVerificada == null && this.servidorVerificado == null)
			||(this.indInfVerificada.equals(true) && this.dthrInfVerificada != null && this.servidorVerificado != null))){
				throw new BaseRuntimeException(InformacaoPrescribentesExceptionCode.AGHU_IFP_ERRO_CHCK_CONST_MPM_IFP_CK3);
		}
		
		//DATA DEFAULT
		if(this.indInfVerificada == null){
			this.indInfVerificada = false;
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
