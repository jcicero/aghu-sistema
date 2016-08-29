package br.gov.mec.aghu.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

@Embeddable
public class AipPosicaoFonemasNomeSocialPacientesId implements EntityCompositeId {

	private static final long serialVersionUID = -5196838632923769683L;
	private Integer seq;
	private Byte posicao;

	public AipPosicaoFonemasNomeSocialPacientesId() {
	}

	public AipPosicaoFonemasNomeSocialPacientesId(Integer seq, Byte posicao) {
		this.seq = seq;
		this.posicao = posicao;
	}

	@Column(name = "FNP_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "POSICAO", nullable = false, precision = 2, scale = 0)
	public Byte getPosicao() {
		return this.posicao;
	}

	public void setPosicao(Byte posicao) {
		this.posicao = posicao;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AipPosicaoFonemasNomeSocialPacientesId)) {
			return false;
		}
		AipPosicaoFonemasNomeSocialPacientesId castOther = (AipPosicaoFonemasNomeSocialPacientesId) other;

		return (this.getSeq() == castOther.getSeq())
				&& (this.getPosicao() == castOther.getPosicao());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSeq();
		result = 37 * result + this.getPosicao();
		return result;
	}

}
