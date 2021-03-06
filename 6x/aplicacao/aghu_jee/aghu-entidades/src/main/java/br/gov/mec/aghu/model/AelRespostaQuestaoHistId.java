package br.gov.mec.aghu.model;

// Generated 04/07/2013 15:46:28 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelRespostasQuestoesTemporarioRemoverId generated by hbm2java
 */
@Embeddable
public class AelRespostaQuestaoHistId implements EntityCompositeId {

	private static final long serialVersionUID = 6233022279678735827L;
	
	private Integer iseSoeSeq;
	private Short iseSeqp;
	private String eqeEmaExaSigla;
	private Integer eqeEmaManSeq;
	private Integer eqeQtnSeq;
	private Integer qquQaoSeq;
	private Integer qquQtnSeq;

	public AelRespostaQuestaoHistId() {
	}

	public AelRespostaQuestaoHistId(Integer iseSoeSeq,
			Short iseSeqp, String eqeEmaExaSigla, Integer eqeEmaManSeq,
			Integer eqeQtnSeq, Integer qquQaoSeq, Integer qquQtnSeq) {
		this.iseSoeSeq = iseSoeSeq;
		this.iseSeqp = iseSeqp;
		this.eqeEmaExaSigla = eqeEmaExaSigla;
		this.eqeEmaManSeq = eqeEmaManSeq;
		this.eqeQtnSeq = eqeQtnSeq;
		this.qquQaoSeq = qquQaoSeq;
		this.qquQtnSeq = qquQtnSeq;
	}

	@Column(name = "ise_soe_seq", nullable = false)
	public Integer getIseSoeSeq() {
		return this.iseSoeSeq;
	}

	public void setIseSoeSeq(Integer iseSoeSeq) {
		this.iseSoeSeq = iseSoeSeq;
	}

	@Column(name = "ise_seqp", nullable = false)
	public Short getIseSeqp() {
		return this.iseSeqp;
	}

	public void setIseSeqp(Short iseSeqp) {
		this.iseSeqp = iseSeqp;
	}

	@Column(name = "eqe_ema_exa_sigla", nullable = false, length = 5)
	@Length(max = 5)
	public String getEqeEmaExaSigla() {
		return this.eqeEmaExaSigla;
	}

	public void setEqeEmaExaSigla(String eqeEmaExaSigla) {
		this.eqeEmaExaSigla = eqeEmaExaSigla;
	}

	@Column(name = "eqe_ema_man_seq", nullable = false)
	public Integer getEqeEmaManSeq() {
		return this.eqeEmaManSeq;
	}

	public void setEqeEmaManSeq(Integer eqeEmaManSeq) {
		this.eqeEmaManSeq = eqeEmaManSeq;
	}

	@Column(name = "eqe_qtn_seq", nullable = false)
	public Integer getEqeQtnSeq() {
		return this.eqeQtnSeq;
	}

	public void setEqeQtnSeq(Integer eqeQtnSeq) {
		this.eqeQtnSeq = eqeQtnSeq;
	}

	@Column(name = "qqu_qao_seq", nullable = false)
	public Integer getQquQaoSeq() {
		return this.qquQaoSeq;
	}

	public void setQquQaoSeq(Integer qquQaoSeq) {
		this.qquQaoSeq = qquQaoSeq;
	}

	@Column(name = "qqu_qtn_seq", nullable = false)
	public Integer getQquQtnSeq() {
		return this.qquQtnSeq;
	}

	public void setQquQtnSeq(Integer qquQtnSeq) {
		this.qquQtnSeq = qquQtnSeq;
	}

	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.eqeEmaExaSigla);
		umHashCodeBuilder.append(this.eqeEmaManSeq);
		umHashCodeBuilder.append(this.eqeQtnSeq);
		umHashCodeBuilder.append(this.iseSoeSeq);
		umHashCodeBuilder.append(this.qquQaoSeq);
		umHashCodeBuilder.append(this.qquQtnSeq);
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		AelRespostaQuestaoHistId other = (AelRespostaQuestaoHistId) obj;
		
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.eqeEmaExaSigla, other.eqeEmaExaSigla);
		umEqualsBuilder.append(this.eqeEmaManSeq, other.eqeEmaManSeq);
		umEqualsBuilder.append(this.eqeQtnSeq, other.eqeQtnSeq);
		umEqualsBuilder.append(this.iseSoeSeq, other.iseSoeSeq);
		umEqualsBuilder.append(this.qquQaoSeq, other.qquQaoSeq);
		umEqualsBuilder.append(this.qquQtnSeq, other.qquQtnSeq);
		return umEqualsBuilder.isEquals();
	}
}
