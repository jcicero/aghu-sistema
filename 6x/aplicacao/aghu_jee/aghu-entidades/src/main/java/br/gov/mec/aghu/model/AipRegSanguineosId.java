package br.gov.mec.aghu.model;

// Generated 26/02/2010 17:37:25 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AipRegSanguineosId generated by hbm2java
 */
@Embeddable
public class AipRegSanguineosId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -793800895442808177L;
	private Integer pacCodigo;
	private Byte seqp;
	private Integer serMatricula;
	private Short serVinCodigo;

	public AipRegSanguineosId() {
	}

	public AipRegSanguineosId(Integer pacCodigo, Byte seqp,
			Integer serMatricula, Short serVinCodigo) {
		this.pacCodigo = pacCodigo;
		this.seqp = seqp;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "SEQP", nullable = false, precision = 2, scale = 0)
	public Byte getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Byte seqp) {
		this.seqp = seqp;
	}

	@Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	/**
	 * Importante: Utilizar métodos getters nas comparações para evitar
	 * problemas ao comparar com instâncias de classes wrappers do hibernate.
	 * 
	 * @author mtocchetto
	 */
	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AipRegSanguineosId)) {
			return false;
		}
		AipRegSanguineosId castOther = (AipRegSanguineosId) other;

		return ((getPacCodigo() == castOther.getPacCodigo()) 
				|| (getPacCodigo() != null && getPacCodigo().equals(castOther.getPacCodigo()))) 
			&& ((getSeqp() == castOther.getSeqp()) 
				|| (getSeqp() != null && getSeqp().equals(castOther.getSeqp())))
			&& ((getSerMatricula() == castOther.getSerMatricula()) 
				|| (getSerMatricula() != null && getSerMatricula().equals(castOther.getSerMatricula())))
			&& ((getSerVinCodigo() == castOther.getSerVinCodigo())
				|| (getSerVinCodigo() != null && getSerVinCodigo().equals(castOther.getSerVinCodigo())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getPacCodigo() == null ? 0 : getPacCodigo().hashCode());
		result = 37 * result + (getSeqp() == null ? 0 : getSeqp().hashCode());
		result = 37 * result + (getSerMatricula() == null ? 0 : getSerMatricula().hashCode());
		result = 37 * result + (getSerVinCodigo() == null ? 0 : getSerVinCodigo().hashCode());
		
		return result;
	}
	
}
