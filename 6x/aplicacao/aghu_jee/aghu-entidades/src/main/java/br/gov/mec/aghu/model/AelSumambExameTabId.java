package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelSumambExameTabId generated by hbm2java
 */
@Embeddable
public class AelSumambExameTabId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4986081078514341610L;
	private Integer prontuario;
	private String ltoLtoId;
	private String recemNascido;
	private String ufeEmaExaSigla;
	private Integer ufeEmaManSeq;
	private Short ufeUnfSeq;
	private String pertenceSumario;
	private Integer iseSoeSeqDept;
	private Short iseSeqpDept;
	private Integer calSeq;
	private String calNome;
	private Double reeValor;
	private Integer iseSoeSeq;
	private Short iseSeqp;
	private Integer cacSeq;
	private Integer rcdGtcSeq;
	private Integer rcdSeqp;
	private String descricao;
	private Date dthrEventoAreaExec;
	private Short ordem;
	private String calNomeSumario;
	private Integer pacCodigo;
	private Short serVinCodigoConsultado;
	private Integer serMatriculaConsultado;
	private String indImprime;
	private Date dthrFim;
	private Integer secaoProntuario;
	private Integer version;

	public AelSumambExameTabId() {
	}

	public AelSumambExameTabId(String ufeEmaExaSigla, Integer ufeEmaManSeq, Short ufeUnfSeq, String pertenceSumario, Integer calSeq,
			String calNome, Integer iseSoeSeq, Short iseSeqp, Date dthrEventoAreaExec, Integer version) {
		this.ufeEmaExaSigla = ufeEmaExaSigla;
		this.ufeEmaManSeq = ufeEmaManSeq;
		this.ufeUnfSeq = ufeUnfSeq;
		this.pertenceSumario = pertenceSumario;
		this.calSeq = calSeq;
		this.calNome = calNome;
		this.iseSoeSeq = iseSoeSeq;
		this.iseSeqp = iseSeqp;
		this.dthrEventoAreaExec = dthrEventoAreaExec;
		this.version = version;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public AelSumambExameTabId(Integer prontuario, String ltoLtoId, String recemNascido, String ufeEmaExaSigla, Integer ufeEmaManSeq,
			Short ufeUnfSeq, String pertenceSumario, Integer iseSoeSeqDept, Short iseSeqpDept, Integer calSeq, String calNome,
			Double reeValor, Integer iseSoeSeq, Short iseSeqp, Integer cacSeq, Integer rcdGtcSeq, Integer rcdSeqp, String descricao,
			Date dthrEventoAreaExec, Short ordem, String calNomeSumario, Integer pacCodigo, Short serVinCodigoConsultado,
			Integer serMatriculaConsultado, String indImprime, Date dthrFim, Integer secaoProntuario, Integer version) {
		this.prontuario = prontuario;
		this.ltoLtoId = ltoLtoId;
		this.recemNascido = recemNascido;
		this.ufeEmaExaSigla = ufeEmaExaSigla;
		this.ufeEmaManSeq = ufeEmaManSeq;
		this.ufeUnfSeq = ufeUnfSeq;
		this.pertenceSumario = pertenceSumario;
		this.iseSoeSeqDept = iseSoeSeqDept;
		this.iseSeqpDept = iseSeqpDept;
		this.calSeq = calSeq;
		this.calNome = calNome;
		this.reeValor = reeValor;
		this.iseSoeSeq = iseSoeSeq;
		this.iseSeqp = iseSeqp;
		this.cacSeq = cacSeq;
		this.rcdGtcSeq = rcdGtcSeq;
		this.rcdSeqp = rcdSeqp;
		this.descricao = descricao;
		this.dthrEventoAreaExec = dthrEventoAreaExec;
		this.ordem = ordem;
		this.calNomeSumario = calNomeSumario;
		this.pacCodigo = pacCodigo;
		this.serVinCodigoConsultado = serVinCodigoConsultado;
		this.serMatriculaConsultado = serMatriculaConsultado;
		this.indImprime = indImprime;
		this.dthrFim = dthrFim;
		this.secaoProntuario = secaoProntuario;
		this.version = version;
	}

	@Column(name = "PRONTUARIO")
	public Integer getProntuario() {
		return this.prontuario;
	}

	public void setProntuario(Integer prontuario) {
		this.prontuario = prontuario;
	}

	@Column(name = "LTO_LTO_ID", length = 5)
	@Length(max = 5)
	public String getLtoLtoId() {
		return this.ltoLtoId;
	}

	public void setLtoLtoId(String ltoLtoId) {
		this.ltoLtoId = ltoLtoId;
	}

	@Column(name = "RECEM_NASCIDO", length = 1)
	@Length(max = 1)
	public String getRecemNascido() {
		return this.recemNascido;
	}

	public void setRecemNascido(String recemNascido) {
		this.recemNascido = recemNascido;
	}

	@Column(name = "UFE_EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getUfeEmaExaSigla() {
		return this.ufeEmaExaSigla;
	}

	public void setUfeEmaExaSigla(String ufeEmaExaSigla) {
		this.ufeEmaExaSigla = ufeEmaExaSigla;
	}

	@Column(name = "UFE_EMA_MAN_SEQ", nullable = false)
	public Integer getUfeEmaManSeq() {
		return this.ufeEmaManSeq;
	}

	public void setUfeEmaManSeq(Integer ufeEmaManSeq) {
		this.ufeEmaManSeq = ufeEmaManSeq;
	}

	@Column(name = "UFE_UNF_SEQ", nullable = false)
	public Short getUfeUnfSeq() {
		return this.ufeUnfSeq;
	}

	public void setUfeUnfSeq(Short ufeUnfSeq) {
		this.ufeUnfSeq = ufeUnfSeq;
	}

	@Column(name = "PERTENCE_SUMARIO", nullable = false, length = 1)
	@Length(max = 1)
	public String getPertenceSumario() {
		return this.pertenceSumario;
	}

	public void setPertenceSumario(String pertenceSumario) {
		this.pertenceSumario = pertenceSumario;
	}

	@Column(name = "ISE_SOE_SEQ_DEPT")
	public Integer getIseSoeSeqDept() {
		return this.iseSoeSeqDept;
	}

	public void setIseSoeSeqDept(Integer iseSoeSeqDept) {
		this.iseSoeSeqDept = iseSoeSeqDept;
	}

	@Column(name = "ISE_SEQP_DEPT")
	public Short getIseSeqpDept() {
		return this.iseSeqpDept;
	}

	public void setIseSeqpDept(Short iseSeqpDept) {
		this.iseSeqpDept = iseSeqpDept;
	}

	@Column(name = "CAL_SEQ", nullable = false)
	public Integer getCalSeq() {
		return this.calSeq;
	}

	public void setCalSeq(Integer calSeq) {
		this.calSeq = calSeq;
	}

	@Column(name = "CAL_NOME", nullable = false, length = 100)
	@Length(max = 100)
	public String getCalNome() {
		return this.calNome;
	}

	public void setCalNome(String calNome) {
		this.calNome = calNome;
	}

	@Column(name = "REE_VALOR", precision = 17, scale = 17)
	public Double getReeValor() {
		return this.reeValor;
	}

	public void setReeValor(Double reeValor) {
		this.reeValor = reeValor;
	}

	@Column(name = "ISE_SOE_SEQ", nullable = false)
	public Integer getIseSoeSeq() {
		return this.iseSoeSeq;
	}

	public void setIseSoeSeq(Integer iseSoeSeq) {
		this.iseSoeSeq = iseSoeSeq;
	}

	@Column(name = "ISE_SEQP", nullable = false)
	public Short getIseSeqp() {
		return this.iseSeqp;
	}

	public void setIseSeqp(Short iseSeqp) {
		this.iseSeqp = iseSeqp;
	}

	@Column(name = "CAC_SEQ")
	public Integer getCacSeq() {
		return this.cacSeq;
	}

	public void setCacSeq(Integer cacSeq) {
		this.cacSeq = cacSeq;
	}

	@Column(name = "RCD_GTC_SEQ")
	public Integer getRcdGtcSeq() {
		return this.rcdGtcSeq;
	}

	public void setRcdGtcSeq(Integer rcdGtcSeq) {
		this.rcdGtcSeq = rcdGtcSeq;
	}

	@Column(name = "RCD_SEQP")
	public Integer getRcdSeqp() {
		return this.rcdSeqp;
	}

	public void setRcdSeqp(Integer rcdSeqp) {
		this.rcdSeqp = rcdSeqp;
	}

	@Column(name = "DESCRICAO")
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "DTHR_EVENTO_AREA_EXEC", nullable = false, length = 29)
	public Date getDthrEventoAreaExec() {
		return this.dthrEventoAreaExec;
	}

	public void setDthrEventoAreaExec(Date dthrEventoAreaExec) {
		this.dthrEventoAreaExec = dthrEventoAreaExec;
	}

	@Column(name = "ORDEM")
	public Short getOrdem() {
		return this.ordem;
	}

	public void setOrdem(Short ordem) {
		this.ordem = ordem;
	}

	@Column(name = "CAL_NOME_SUMARIO", length = 30)
	@Length(max = 30)
	public String getCalNomeSumario() {
		return this.calNomeSumario;
	}

	public void setCalNomeSumario(String calNomeSumario) {
		this.calNomeSumario = calNomeSumario;
	}

	@Column(name = "PAC_CODIGO")
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "SER_VIN_CODIGO_CONSULTADO")
	public Short getSerVinCodigoConsultado() {
		return this.serVinCodigoConsultado;
	}

	public void setSerVinCodigoConsultado(Short serVinCodigoConsultado) {
		this.serVinCodigoConsultado = serVinCodigoConsultado;
	}

	@Column(name = "SER_MATRICULA_CONSULTADO")
	public Integer getSerMatriculaConsultado() {
		return this.serMatriculaConsultado;
	}

	public void setSerMatriculaConsultado(Integer serMatriculaConsultado) {
		this.serMatriculaConsultado = serMatriculaConsultado;
	}

	@Column(name = "IND_IMPRIME", length = 1)
	@Length(max = 1)
	public String getIndImprime() {
		return this.indImprime;
	}

	public void setIndImprime(String indImprime) {
		this.indImprime = indImprime;
	}

	@Column(name = "DTHR_FIM", length = 29)
	public Date getDthrFim() {
		return this.dthrFim;
	}

	public void setDthrFim(Date dthrFim) {
		this.dthrFim = dthrFim;
	}

	@Column(name = "SECAO_PRONTUARIO")
	public Integer getSecaoProntuario() {
		return this.secaoProntuario;
	}

	public void setSecaoProntuario(Integer secaoProntuario) {
		this.secaoProntuario = secaoProntuario;
	}

	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getProntuario());
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getPacCodigo());
		umHashCodeBuilder.append(this.getDescricao());
		umHashCodeBuilder.append(this.getOrdem());
		umHashCodeBuilder.append(this.getUfeEmaExaSigla());
		umHashCodeBuilder.append(this.getUfeEmaManSeq());
		umHashCodeBuilder.append(this.getUfeUnfSeq());
		umHashCodeBuilder.append(this.getIseSoeSeq());
		umHashCodeBuilder.append(this.getIseSeqp());
		umHashCodeBuilder.append(this.getDthrFim());
		umHashCodeBuilder.append(this.getRecemNascido());
		umHashCodeBuilder.append(this.getPertenceSumario());
		umHashCodeBuilder.append(this.getSerVinCodigoConsultado());
		umHashCodeBuilder.append(this.getSerMatriculaConsultado());
		umHashCodeBuilder.append(this.getLtoLtoId());
		umHashCodeBuilder.append(this.getIseSoeSeqDept());
		umHashCodeBuilder.append(this.getIseSeqpDept());
		umHashCodeBuilder.append(this.getCalSeq());
		umHashCodeBuilder.append(this.getCalNome());
		umHashCodeBuilder.append(this.getReeValor());
		umHashCodeBuilder.append(this.getCacSeq());
		umHashCodeBuilder.append(this.getRcdGtcSeq());
		umHashCodeBuilder.append(this.getRcdSeqp());
		umHashCodeBuilder.append(this.getDthrEventoAreaExec());
		umHashCodeBuilder.append(this.getCalNomeSumario());
		umHashCodeBuilder.append(this.getIndImprime());
		umHashCodeBuilder.append(this.getSecaoProntuario());
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
		if (!(obj instanceof AelSumambExameTabId)) {
			return false;
		}
		AelSumambExameTabId other = (AelSumambExameTabId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getProntuario(), other.getProntuario());
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getPacCodigo(), other.getPacCodigo());
		umEqualsBuilder.append(this.getDescricao(), other.getDescricao());
		umEqualsBuilder.append(this.getOrdem(), other.getOrdem());
		umEqualsBuilder.append(this.getUfeEmaExaSigla(), other.getUfeEmaExaSigla());
		umEqualsBuilder.append(this.getUfeEmaManSeq(), other.getUfeEmaManSeq());
		umEqualsBuilder.append(this.getUfeUnfSeq(), other.getUfeUnfSeq());
		umEqualsBuilder.append(this.getIseSoeSeq(), other.getIseSoeSeq());
		umEqualsBuilder.append(this.getIseSeqp(), other.getIseSeqp());
		umEqualsBuilder.append(this.getDthrFim(), other.getDthrFim());
		umEqualsBuilder.append(this.getRecemNascido(), other.getRecemNascido());
		umEqualsBuilder.append(this.getPertenceSumario(), other.getPertenceSumario());
		umEqualsBuilder.append(this.getSerVinCodigoConsultado(), other.getSerVinCodigoConsultado());
		umEqualsBuilder.append(this.getSerMatriculaConsultado(), other.getSerMatriculaConsultado());
		umEqualsBuilder.append(this.getLtoLtoId(), other.getLtoLtoId());
		umEqualsBuilder.append(this.getIseSoeSeqDept(), other.getIseSoeSeqDept());
		umEqualsBuilder.append(this.getIseSeqpDept(), other.getIseSeqpDept());
		umEqualsBuilder.append(this.getCalSeq(), other.getCalSeq());
		umEqualsBuilder.append(this.getCalNome(), other.getCalNome());
		umEqualsBuilder.append(this.getReeValor(), other.getReeValor());
		umEqualsBuilder.append(this.getCacSeq(), other.getCacSeq());
		umEqualsBuilder.append(this.getRcdGtcSeq(), other.getRcdGtcSeq());
		umEqualsBuilder.append(this.getRcdSeqp(), other.getRcdSeqp());
		umEqualsBuilder.append(this.getDthrEventoAreaExec(), other.getDthrEventoAreaExec());
		umEqualsBuilder.append(this.getCalNomeSumario(), other.getCalNomeSumario());
		umEqualsBuilder.append(this.getIndImprime(), other.getIndImprime());
		umEqualsBuilder.append(this.getSecaoProntuario(), other.getSecaoProntuario());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
