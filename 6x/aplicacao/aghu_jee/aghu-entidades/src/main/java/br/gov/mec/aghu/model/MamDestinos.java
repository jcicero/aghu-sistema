package br.gov.mec.aghu.model;

// Generated 09/06/2010 17:16:39 by Hibernate Tools 3.3.0.GA

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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioIndPendenteAmbulatorio;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamDestinos generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamDesSq1", sequenceName="AGH.MAM_DES_SQ1", allocationSize = 1)
@Table(name = "MAM_DESTINOS", schema = "AGH")
public class MamDestinos extends BaseEntitySeq<Long> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3501657817609318509L;
	private Long seq;
	private MamDestinos mamDestinos;
	private Date dthrCriacao;
	private Date dthrValida;
	private Date dthrMvto;
	private Date dthrValidaMvto;
	private DominioIndPendenteAmbulatorio indPendente;
	private String indImpresso;
	private Integer pacCodigo;
	private Integer conNumero;
	private MamTriagens triagem;
	private Short edeSeq;
	private Short espSeq;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Integer serMatriculaValida;
	private Short serVinCodigoValida;
	private Integer serMatriculaMvto;
	private Short serVinCodigoMvto;
	private Integer serMatriculaValidaMvto;
	private Short serVinCodigoValidaMvto;
	private Long rgtSeq;
	private Set<MamDestinos> mamDestinoses = new HashSet<MamDestinos>(0);

	public MamDestinos() {
	}

	public MamDestinos(Long seq, Date dthrCriacao, DominioIndPendenteAmbulatorio indPendente,
			String indImpresso, Integer pacCodigo, Short edeSeq, Integer serMatricula,
			Short serVinCodigo) {
		this.seq = seq;
		this.dthrCriacao = dthrCriacao;
		this.indPendente = indPendente;
		this.indImpresso = indImpresso;
		this.pacCodigo = pacCodigo;
		this.edeSeq = edeSeq;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	public MamDestinos(Long seq, MamDestinos mamDestinos, Date dthrCriacao,
			Date dthrValida, Date dthrMvto, Date dthrValidaMvto,
			DominioIndPendenteAmbulatorio indPendente, String indImpresso, Integer pacCodigo,
			Integer conNumero, MamTriagens trgSeq, Short edeSeq, Short espSeq,
			Integer serMatricula, Short serVinCodigo, Integer serMatriculaValida,
			Short serVinCodigoValida, Integer serMatriculaMvto,
			Short serVinCodigoMvto, Integer serMatriculaValidaMvto,
			Short serVinCodigoValidaMvto, Long rgtSeq,
			Set<MamDestinos> mamDestinoses) {
		this.seq = seq;
		this.mamDestinos = mamDestinos;
		this.dthrCriacao = dthrCriacao;
		this.dthrValida = dthrValida;
		this.dthrMvto = dthrMvto;
		this.dthrValidaMvto = dthrValidaMvto;
		this.indPendente = indPendente;
		this.indImpresso = indImpresso;
		this.pacCodigo = pacCodigo;
		this.conNumero = conNumero;
		this.triagem = trgSeq;
		this.edeSeq = edeSeq;
		this.espSeq = espSeq;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.serMatriculaValida = serMatriculaValida;
		this.serVinCodigoValida = serVinCodigoValida;
		this.serMatriculaMvto = serMatriculaMvto;
		this.serVinCodigoMvto = serVinCodigoMvto;
		this.serMatriculaValidaMvto = serMatriculaValidaMvto;
		this.serVinCodigoValidaMvto = serVinCodigoValidaMvto;
		this.rgtSeq = rgtSeq;
		this.mamDestinoses = mamDestinoses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamDesSq1")
	@Column(name = "SEQ", nullable = false, precision = 14, scale = 0)
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DES_SEQ")
	public MamDestinos getMamDestinos() {
		return this.mamDestinos;
	}

	public void setMamDestinos(MamDestinos mamDestinos) {
		this.mamDestinos = mamDestinos;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_CRIACAO", nullable = false, length = 7)
	@NotNull
	public Date getDthrCriacao() {
		return this.dthrCriacao;
	}

	public void setDthrCriacao(Date dthrCriacao) {
		this.dthrCriacao = dthrCriacao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_VALIDA", length = 7)
	public Date getDthrValida() {
		return this.dthrValida;
	}

	public void setDthrValida(Date dthrValida) {
		this.dthrValida = dthrValida;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_MVTO", length = 7)
	public Date getDthrMvto() {
		return this.dthrMvto;
	}

	public void setDthrMvto(Date dthrMvto) {
		this.dthrMvto = dthrMvto;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_VALIDA_MVTO", length = 7)
	public Date getDthrValidaMvto() {
		return this.dthrValidaMvto;
	}

	public void setDthrValidaMvto(Date dthrValidaMvto) {
		this.dthrValidaMvto = dthrValidaMvto;
	}

	@Column(name = "IND_PENDENTE", nullable = false, length = 1)

	@NotNull
	@Enumerated(EnumType.STRING)
	public DominioIndPendenteAmbulatorio getIndPendente() {
		return this.indPendente;
	}

	public void setIndPendente(DominioIndPendenteAmbulatorio indPendente) {
		this.indPendente = indPendente;
	}

	@Column(name = "IND_IMPRESSO", nullable = false, length = 1)
	@NotNull
	@Length(max = 1)
	public String getIndImpresso() {
		return this.indImpresso;
	}

	public void setIndImpresso(String indImpresso) {
		this.indImpresso = indImpresso;
	}

	@Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "CON_NUMERO", precision = 8, scale = 0)
	public Integer getConNumero() {
		return this.conNumero;
	}

	public void setConNumero(Integer conNumero) {
		this.conNumero = conNumero;
	}









	

	@Column(name = "EDE_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getEdeSeq() {
		return this.edeSeq;
	}

	public void setEdeSeq(Short edeSeq) {
		this.edeSeq = edeSeq;
	}

	@Column(name = "ESP_SEQ", precision = 4, scale = 0)
	public Short getEspSeq() {
		return this.espSeq;
	}

	public void setEspSeq(Short espSeq) {
		this.espSeq = espSeq;
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

	@Column(name = "SER_MATRICULA_VALIDA", precision = 7, scale = 0)
	public Integer getSerMatriculaValida() {
		return this.serMatriculaValida;
	}

	public void setSerMatriculaValida(Integer serMatriculaValida) {
		this.serMatriculaValida = serMatriculaValida;
	}

	@Column(name = "SER_VIN_CODIGO_VALIDA", precision = 3, scale = 0)
	public Short getSerVinCodigoValida() {
		return this.serVinCodigoValida;
	}

	public void setSerVinCodigoValida(Short serVinCodigoValida) {
		this.serVinCodigoValida = serVinCodigoValida;
	}

	@Column(name = "SER_MATRICULA_MVTO", precision = 7, scale = 0)
	public Integer getSerMatriculaMvto() {
		return this.serMatriculaMvto;
	}

	public void setSerMatriculaMvto(Integer serMatriculaMvto) {
		this.serMatriculaMvto = serMatriculaMvto;
	}

	@Column(name = "SER_VIN_CODIGO_MVTO", precision = 3, scale = 0)
	public Short getSerVinCodigoMvto() {
		return this.serVinCodigoMvto;
	}

	public void setSerVinCodigoMvto(Short serVinCodigoMvto) {
		this.serVinCodigoMvto = serVinCodigoMvto;
	}

	@Column(name = "SER_MATRICULA_VALIDA_MVTO", precision = 7, scale = 0)
	public Integer getSerMatriculaValidaMvto() {
		return this.serMatriculaValidaMvto;
	}

	public void setSerMatriculaValidaMvto(Integer serMatriculaValidaMvto) {
		this.serMatriculaValidaMvto = serMatriculaValidaMvto;
	}

	@Column(name = "SER_VIN_CODIGO_VALIDA_MVTO", precision = 3, scale = 0)
	public Short getSerVinCodigoValidaMvto() {
		return this.serVinCodigoValidaMvto;
	}

	public void setSerVinCodigoValidaMvto(Short serVinCodigoValidaMvto) {
		this.serVinCodigoValidaMvto = serVinCodigoValidaMvto;
	}

	@Column(name = "RGT_SEQ", precision = 14, scale = 0)
	public Long getRgtSeq() {
		return this.rgtSeq;
	}

	public void setRgtSeq(Long rgtSeq) {
		this.rgtSeq = rgtSeq;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mamDestinos")
	public Set<MamDestinos> getMamDestinoses() {
		return this.mamDestinoses;
	}

	public void setMamDestinoses(Set<MamDestinos> mamDestinoses) {
		this.mamDestinoses = mamDestinoses;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="TRG_SEQ", referencedColumnName="SEQ", updatable = false, insertable = false)	
	public MamTriagens getTriagem() {
		return triagem;
	}

	public void setTriagem(MamTriagens triagem) {
		this.triagem = triagem;
	}	

	public enum Fields {
		DTHR_CRIACAO("dthrCriacao"),
		CON_NUMERO("conNumero"),
		IND_PENDENTE("indPendente"),
		DTHR_VALIDA_MVTO("dthrValidaMvto");

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
		if (!(obj instanceof MamDestinos)) {
			return false;
		}
		MamDestinos other = (MamDestinos) obj;
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