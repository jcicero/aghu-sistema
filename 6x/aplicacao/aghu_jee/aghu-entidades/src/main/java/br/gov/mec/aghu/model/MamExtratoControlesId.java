package br.gov.mec.aghu.model;

// Generated 05/04/2011 11:18:40 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MamExtratoControlesId generated by hbm2java
 */
@Embeddable
public class MamExtratoControlesId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 251642602604507791L;
	private Long ctlSeq;
	private Short seqp;

	public MamExtratoControlesId() {
	}

	public MamExtratoControlesId(Long ctlSeq, Short seqp) {
		this.ctlSeq = ctlSeq;
		this.seqp = seqp;
	}

	@Column(name = "CTL_SEQ", nullable = false, precision = 14, scale = 0)
	public Long getCtlSeq() {
		return this.ctlSeq;
	}

	public void setCtlSeq(Long ctlSeq) {
		this.ctlSeq = ctlSeq;
	}

	@Column(name = "SEQP", nullable = false, precision = 3, scale = 0)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ctlSeq == null) ? 0 : ctlSeq.hashCode());
		result = prime * result + ((seqp == null) ? 0 : seqp.hashCode());
		return result;
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
		MamExtratoControlesId other = (MamExtratoControlesId) obj;
		if (ctlSeq == null) {
			if (other.ctlSeq != null){
				return false;
			}
		} else if (!ctlSeq.equals(other.ctlSeq)){
			return false;
		}
		if (seqp == null) {
			if (other.seqp != null){
				return false;
			}
		} else if (!seqp.equals(other.seqp)){
			return false;
		}
		return true;
	}

	

}
