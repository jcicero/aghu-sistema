package br.gov.mec.aghu.model;


import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;
import br.gov.mec.aghu.dominio.DominioSituacao;

/**
 * AfaMedicamentos generated by hbm2java
 */
@Entity
@SequenceGenerator(name="afaViDilSq1", sequenceName="AGH.AFA_VID_SQ1", allocationSize = 1)
@Table(name = "AFA_VINCULO_DILUENTES", schema = "AGH")
public class AfaVinculoDiluentes extends BaseEntitySeq<Integer> implements Serializable {

	private static final long serialVersionUID = 1080174632368636113L;
	private Integer seq;
	private Boolean indUsualPrescricao ;
	private DominioSituacao indSituacao ;
	private AfaMedicamento medicamento ;
	private AfaMedicamento diluente ;
	private Date criadoEm ;
	private RapServidores servidor;
	

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "afaViDilSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 3, scale = 0)
	public Integer getSeq() {
		return seq;
	}
	
	public void setSeq(Integer seq) {
		this.seq = seq;
	}	
	
	@Column(name = "IND_USUAL_PRESCRICAO", nullable = false)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndUsualPrescricao() {
		return this.indUsualPrescricao;
	}

	public void setIndUsualPrescricao(Boolean indUsualPrescricao) {
		this.indUsualPrescricao = indUsualPrescricao;
	}
	
	@Column(name = "IND_SITUACAO", nullable = false)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "DILUENTE_CODIGO")
	public AfaMedicamento getDiluente() {
		return diluente;
	}

	public void setDiluente(AfaMedicamento diluente) {
		this.diluente = diluente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAT_CODIGO")
	public AfaMedicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(AfaMedicamento medicamento) {
		this.medicamento = medicamento;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	

	public enum Fields {
		SEQ("seq"),
		DILUENTE("diluente"),
		SEQ_DILUENTE("diluente.matCodigo"),
		SEQUENCIAL("seq"),
		MEDICAMENTO("medicamento"),
		SEQ_MEDICAMENTO("medicamento.matCodigo"),
		IND_SITUACAO("indSituacao"),
		IND_USUAL_PRESCRICAO("indUsualPrescricao");
		

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (seq ^ (seq >>> 32));
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
		AfaVinculoDiluentes other = (AfaVinculoDiluentes) obj;
		if (seq != other.seq){
			return false;
		}
		return true;
	}



}