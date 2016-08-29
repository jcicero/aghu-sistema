package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatFormasOrganizacaoId generated by hbm2java
 */
@Embeddable

public class FatFormaOrganizacaoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2843407551792372423L;
	private Short sgrGrpSeq;
	private Byte sgrSubGrupo;
	private Byte codigo;

	public FatFormaOrganizacaoId() {
	}

	public FatFormaOrganizacaoId(Short sgrGrpSeq, Byte sgrSubGrupo, Byte codigo) {
		this.sgrGrpSeq = sgrGrpSeq;
		this.sgrSubGrupo = sgrSubGrupo;
		this.codigo = codigo;
	}

	@Column(name = "SGR_GRP_SEQ", nullable = false, precision = 3, scale = 0)
	public Short getSgrGrpSeq() {
		return this.sgrGrpSeq;
	}

	public void setSgrGrpSeq(Short sgrGrpSeq) {
		this.sgrGrpSeq = sgrGrpSeq;
	}

	@Column(name = "SGR_SUB_GRUPO", nullable = false, precision = 2, scale = 0)
	public Byte getSgrSubGrupo() {
		return this.sgrSubGrupo;
	}

	public void setSgrSubGrupo(Byte sgrSubGrupo) {
		this.sgrSubGrupo = sgrSubGrupo;
	}

	@Column(name = "CODIGO", nullable = false, precision = 2, scale = 0)
	public Byte getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Byte codigo) {
		this.codigo = codigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((sgrGrpSeq == null) ? 0 : sgrGrpSeq.hashCode());
		result = prime * result
				+ ((sgrSubGrupo == null) ? 0 : sgrSubGrupo.hashCode());
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
		FatFormaOrganizacaoId other = (FatFormaOrganizacaoId) obj;
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		if (sgrGrpSeq == null) {
			if (other.sgrGrpSeq != null) {
				return false;
			}
		} else if (!sgrGrpSeq.equals(other.sgrGrpSeq)) {
			return false;
		}
		if (sgrSubGrupo == null) {
			if (other.sgrSubGrupo != null) {
				return false;
			}
		} else if (!sgrSubGrupo.equals(other.sgrSubGrupo)) {
			return false;
		}
		return true;
	}

	
}
