package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MpmFormaTb generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mpmFtbSq1", sequenceName="AGH.MPM_FTB_SQ1", allocationSize = 1)

@Table(name = "MPM_FORMA_TBS", schema = "AGH")
public class MpmFormaTb extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5973396671848638100L;
	private Short seq;
	private RapServidores servidor;
	private String descricao;
	private Date criadoEm;
	private Boolean indExigeDescCompl;
	private DominioSituacao indSituacao;
	private Set<MpmFormaTbPacienteAlta> formasTuberculosePacienteAlta = new HashSet<MpmFormaTbPacienteAlta>(0);

	public MpmFormaTb() {
	}

	public MpmFormaTb(Short seq, RapServidores servidor,
			String descricao, Date criadoEm, 
			Boolean indExigeDescCompl,
			DominioSituacao indSituacao) {
		this.seq = seq;
		this.servidor = servidor;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.indExigeDescCompl = indExigeDescCompl;
		this.indSituacao = indSituacao;
	}

	public MpmFormaTb(Short seq, RapServidores servidor,
			String descricao, Date criadoEm, Boolean indExigeDescCompl,
			DominioSituacao indSituacao, 
			Set<MpmFormaTbPacienteAlta> formasTuberculosePacienteAlta) {
		this.seq = seq;
		this.servidor = servidor;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.indExigeDescCompl = indExigeDescCompl;
		this.indSituacao = indSituacao;
		this.formasTuberculosePacienteAlta = formasTuberculosePacienteAlta;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mpmFtbSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 3, scale = 0)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	/**
	 * @return the servidor
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}
	
	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	
	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60, message="A descrição possui mais de 60 caracteres.")
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_EXIGE_DESC_COMPL", nullable = false, length = 1)
	@org.hibernate.annotations.Type( type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndExigeDescCompl() {
		return this.indExigeDescCompl;
	}

	public void setIndExigeDescCompl(Boolean indExigeDescCompl) {
		this.indExigeDescCompl = indExigeDescCompl;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "formaTuberculose")
	public Set<MpmFormaTbPacienteAlta> getFormasTuberculosePacienteAlta() {
		return this.formasTuberculosePacienteAlta;
	}

	public void setFormasTuberculosePacienteAlta(Set<MpmFormaTbPacienteAlta> formasTuberculosePacienteAlta) {
		this.formasTuberculosePacienteAlta = formasTuberculosePacienteAlta;
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
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		MpmFormaTb other = (MpmFormaTb) obj;
		if (seq == null) {
			if (other.seq != null) {
				return false;
			}
		} else if (!seq.equals(other.seq)) {
			return false;
		}
		return true;
	}

	public enum Fields {
		seq("seq"),
		SERVIDOR("servidor"),
		DESCRICAO("descricao"),
		CRIADO_EM("criadoEm"),
		IND_EXIGE_DESC_COMPL("indExigeDescCompl"),
		IND_SITUACAO("indSituacao"),
		FORMAS_TUBERCULOSE_PACIENTE_ALTA("formasTuberculosePacienteAlta");
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}
	
	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validarDados(){
	
		//DATA DEFAULT
		if(this.indExigeDescCompl == null){
			this.indExigeDescCompl = false;
		}
		if(this.indSituacao == null){
			this.indSituacao = DominioSituacao.A;
		}
	}
	
}
