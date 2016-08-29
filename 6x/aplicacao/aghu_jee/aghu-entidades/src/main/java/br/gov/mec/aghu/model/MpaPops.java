package br.gov.mec.aghu.model;

// Generated 15/04/2011 14:22:18 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MpaPops generated by hbm2java
 */

@Entity
@SequenceGenerator(name="mpaPopSq1", sequenceName="AGH.MPA_POP_SQ1", allocationSize = 1)
@Table(name = "MPA_POPS", schema = "AGH")
public class MpaPops extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5128505742600636379L;
	private Integer seq;
	private Integer version;
	// Uso temporario ateh definicao do dominio correto.
	private DominioSituacao tipo;
	private Date criadoEm;
	private String titulo;
	private RapServidores servidor;
	private RapConselhosProfissionais conselhoProfissional;
	
	private Set<MpaPopVersoes> mpaPopVersoeses = new HashSet<MpaPopVersoes>(0);

	public MpaPops() {
	}

	public MpaPops(Integer seq, DominioSituacao tipo, Date criadoEm, String titulo,
			RapServidores serMatricula) {
		this.seq = seq;
		this.tipo = tipo;
		this.criadoEm = criadoEm;
		this.titulo = titulo;
		this.servidor = serMatricula;
	}

	public MpaPops(Integer seq, DominioSituacao tipo, Date criadoEm, String titulo,
			RapServidores serMatricula, RapConselhosProfissionais cprCodigo,
			Set<MpaPopVersoes> mpaPopVersoeses) {
		this.seq = seq;
		this.tipo = tipo;
		this.criadoEm = criadoEm;
		this.titulo = titulo;
		this.servidor = serMatricula;
		this.conselhoProfissional = cprCodigo;
		this.mpaPopVersoeses = mpaPopVersoeses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mpaPopSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "TIPO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getTipo() {
		return this.tipo;
	}

	public void setTipo(DominioSituacao t) {
		this.tipo = t;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "TITULO", nullable = false, length = 60)
	@Length(max = 60)
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })	
	public RapServidores getServidor() {
		return servidor;
	}
	
	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CPR_CODIGO")
	public RapConselhosProfissionais getConselhoProfissional() {
		return conselhoProfissional;
	}
	
	public void setConselhoProfissional(RapConselhosProfissionais conselhoProfissional) {
		this.conselhoProfissional = conselhoProfissional;
	}
	
	

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mpaPops")
	public Set<MpaPopVersoes> getMpaPopVersoeses() {
		return this.mpaPopVersoeses;
	}

	public void setMpaPopVersoeses(Set<MpaPopVersoes> mpaPopVersoeses) {
		this.mpaPopVersoeses = mpaPopVersoeses;
	}

	
	
	
	public enum Fields {
		POP_VERSOES("mpaPopVersoeses"),
		SEQ("seq"),
		TIPO("tipo"),
		CONSELHO_PROFISSIONAL("conselhoProfissional")
		;
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}


	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other == null) {
			return false;			
		}
		if (!(other instanceof MpaPops)) {
			return false;
		}
		MpaPops castOther = (MpaPops) other;

		return (this.getSeq() != null && this.getSeq().equals(castOther.getSeq()));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (this.getSeq() != null ? this.getSeq().hashCode() : 0);
		
		return result;
	}

}