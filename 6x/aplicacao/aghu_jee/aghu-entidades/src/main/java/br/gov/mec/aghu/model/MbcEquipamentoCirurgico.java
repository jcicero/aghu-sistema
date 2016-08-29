package br.gov.mec.aghu.model;

// Generated 05/07/2011 11:09:22 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MbcEquipamentoCirurgicos generated by hbm2java
 */

@Entity
@SequenceGenerator(name="mbcEuuSq1", sequenceName="AGH.MBC_EUU_SQ1", allocationSize = 1)
@Table(name = "MBC_EQUIPAMENTO_CIRURGICOS", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = "DESCRICAO"))
public class MbcEquipamentoCirurgico extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6377590388699501022L;
	private Short seq;
	private RapServidores rapServidores;
	private String descricao;
	private Date criadoEm;
	private DominioSituacao situacao;
	private String motivoInat;
	private Integer version;	
	
	private Set<MbcEquipamentoUtilCirg> listMbcEquipamentoUtilCirg = new HashSet<MbcEquipamentoUtilCirg>(0);
	private Set<MbcEquipamentoNotaSala> listMbcEquipamentoNotaSala;
	
	public MbcEquipamentoCirurgico() {
	}

	public MbcEquipamentoCirurgico(Short seq, RapServidores rapServidores,
			String descricao, Date criadoEm, DominioSituacao situacao) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.situacao = situacao;
	}

	public MbcEquipamentoCirurgico(Short seq, RapServidores rapServidores,
			String descricao, Date criadoEm,
			DominioSituacao situacao, String motivoInat) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.situacao = situacao;
		this.motivoInat = motivoInat;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mbcEuuSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 4, scale = 0)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@Column(name = "DESCRICAO", unique = true, nullable = false, length = 100)
	@Length(max = 100)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SITUACAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@Column(name = "MOTIVO_INAT", length = 120)
	@Length(max = 120)
	public String getMotivoInat() {
		return this.motivoInat;
	}

	public void setMotivoInat(String motivoInat) {
		this.motivoInat = motivoInat;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mbcEquipamentoCirurgico")
	public Set<MbcEquipamentoUtilCirg> getListMbcEquipamentoUtilCirg() {
		return listMbcEquipamentoUtilCirg;
	}

	public void setListMbcEquipamentoUtilCirg(
			Set<MbcEquipamentoUtilCirg> listMbcEquipamentoUtilCirg) {
		this.listMbcEquipamentoUtilCirg = listMbcEquipamentoUtilCirg;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mbcEquipamentoCirurgico")
	public Set<MbcEquipamentoNotaSala> getListMbcEquipamentoNotaSala() {
		return listMbcEquipamentoNotaSala;
	}

	public void setListMbcEquipamentoNotaSala(
			Set<MbcEquipamentoNotaSala> listMbcEquipamentoNotaSala) {
		this.listMbcEquipamentoNotaSala = listMbcEquipamentoNotaSala;
	}


	public enum Fields {

		SEQ("seq"),
		RAP_SERVIDORES("rapServidores"),
		DESCRICAO("descricao"),
		CRIADO_EM("criadoEm"),
		SITUACAO("situacao"),
		MOTIVO_INAT("motivoInat"),
		LIST_EQUIPAMENTOS_CIRURGICOS("listMbcEquipamentoUtilCirg"),
		LIST_EQUIPAMENTOS_NOTA_SALA("listMbcEquipamentoNotaSala");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof MbcEquipamentoCirurgico)) {
			return false;
		}
		MbcEquipamentoCirurgico other = (MbcEquipamentoCirurgico) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
