package br.gov.mec.aghu.model;

// Generated 21/06/2011 11:29:47 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * VAelPesquisaPolExamesUnidadesId generated by hbm2java
 */

@Embeddable
public class VAelPesquisaPolExameUnidadeId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3958659938423770836L;
	private Integer soeSeq;
	private Short seqp;

	public VAelPesquisaPolExameUnidadeId() {
	}

	public VAelPesquisaPolExameUnidadeId(Integer soeSeq,
			Short seqp) {
		this.soeSeq = soeSeq;
		this.seqp = seqp;
	}

	@Column(name = "SOE_SEQ")
	public Integer getSoeSeq() {
		return this.soeSeq;
	}

	public void setSoeSeq(Integer soeSeq) {
		this.soeSeq = soeSeq;
	}

	@Column(name = "SEQP")
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
		result = prime * result + ((seqp == null) ? 0 : seqp.hashCode());
		result = prime * result + ((soeSeq == null) ? 0 : soeSeq.hashCode());
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
		VAelPesquisaPolExameUnidadeId other = (VAelPesquisaPolExameUnidadeId) obj;
		if (seqp == null) {
			if (other.seqp != null){
				return false;
			}
		} else if (!seqp.equals(other.seqp)){
			return false;
		}
		if (soeSeq == null) {
			if (other.soeSeq != null){
				return false;
			}
		} else if (!soeSeq.equals(other.soeSeq)){
			return false;
		}
		return true;
	}
	
	

}
