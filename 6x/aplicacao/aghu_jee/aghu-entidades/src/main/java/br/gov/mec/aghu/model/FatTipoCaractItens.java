package br.gov.mec.aghu.model;

// Generated 28/04/2010 18:27:18 by Hibernate Tools 3.2.5.Beta

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * FatTipoCaractItens generated by hbm2java
 */
@Entity
@SequenceGenerator(name="fatTctSq1", sequenceName="AGH.FAT_TCT_SQ1", allocationSize = 1)
@Table(name = "FAT_TIPO_CARACT_ITENS", schema = "AGH")
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.TRANSACTIONAL)
public class FatTipoCaractItens extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 737735892318503817L;
	private Integer seq;
	private String caracteristica;
	private Set<FatCaractItemProcHosp> caracteristicasItemProcHosp = new HashSet<FatCaractItemProcHosp>(0);
	private Integer version;

	public FatTipoCaractItens() {
	}

	public FatTipoCaractItens(Integer seq, String caracteristica) {
		this.seq = seq;
		this.caracteristica = caracteristica;
	}

	public FatTipoCaractItens(Integer seq, String caracteristica,
			Set<FatCaractItemProcHosp> caracteristicasItemProcHosp) {
		this.seq = seq;
		this.caracteristica = caracteristica;
		this.caracteristicasItemProcHosp = caracteristicasItemProcHosp;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "fatTctSq1")
	@Column(name = "SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "CARACTERISTICA", nullable = false, length = 50)
	@Length(max = 50)
	public String getCaracteristica() {
		return this.caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoCaracteristicaItem")
	public Set<FatCaractItemProcHosp> getCaracteristicasItemProcHosp() {
		return this.caracteristicasItemProcHosp;
	}

	public void setCaracteristicasItemProcHosp(
			Set<FatCaractItemProcHosp> caracteristicasItemProcHosp) {
		this.caracteristicasItemProcHosp = caracteristicasItemProcHosp;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
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
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		FatTipoCaractItens other = (FatTipoCaractItens) obj;
		if (seq == null) {
			if (other.seq != null){
				return false;
			}
		} else if (!seq.equals(other.seq)){
			return false;
		}
		return true;
	}

	public enum Fields {
		SEQ("seq"),
		CARACTERISTICA("caracteristica");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

}
