package br.gov.mec.aghu.model;

// Generated 17/06/2010 15:43:38 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;







import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.dominio.DominioTipoSala;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MbcSalaCirurgicas generated by hbm2java
 */
@Entity
@Table(name = "MBC_SALA_CIRURGICAS", schema = "AGH")

public class MbcSalaCirurgica extends BaseEntityId<MbcSalaCirurgicaId> implements java.io.Serializable {

	// TODO Implementar triggers (não foi implementado, pois o mapeamento
	// foi feito na implementação do módulo de internação)
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3079518515864581087L;
	private MbcSalaCirurgicaId id;
	private RapServidores servidorAlterado;
	private RapServidores servidor;
	private AghUnidadesFuncionais unidadeFuncional;
	private DominioSituacao situacao;
	private Boolean especial;
	private Date criadoEm;
	private String nome;
	private String motivoInat;
	@Deprecated
	private DominioTipoSala tipoSala;
	private MbcTipoSala mbcTipoSala;
	private Boolean visivelMonitor;
	private Set<MbcCirurgias> cirurgias = new HashSet<MbcCirurgias>(0);
	private Integer version;
	
	private Set<MbcCaracteristicaSalaCirg> mbcCaracteristicaSalaCirgs;

	public MbcSalaCirurgica() {
	}
	
	public MbcSalaCirurgica(MbcSalaCirurgicaId id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public MbcSalaCirurgica(MbcSalaCirurgicaId id, RapServidores servidor,
			AghUnidadesFuncionais unidadeFuncional, DominioSituacao situacao,
			Boolean especial, Date criadoEm) {
		this.id = id;
		this.servidor = servidor;
		this.unidadeFuncional = unidadeFuncional;
		this.situacao = situacao;
		this.especial = especial;
		this.criadoEm = criadoEm;
	}

	public MbcSalaCirurgica(MbcSalaCirurgicaId id,
			RapServidores servidorAlterado, RapServidores servidor,
			AghUnidadesFuncionais unidadeFuncional, DominioSituacao situacao,
			Boolean especial, Date criadoEm, String nome, String motivoInat,
			DominioTipoSala tipoSala, Boolean visivelMonitor,
			Set<MbcCirurgias> cirurgias) {
		this.id = id;
		this.servidorAlterado = servidorAlterado;
		this.servidor = servidor;
		this.unidadeFuncional = unidadeFuncional;
		this.situacao = situacao;
		this.especial = especial;
		this.criadoEm = criadoEm;
		this.nome = nome;
		this.motivoInat = motivoInat;
		this.tipoSala = tipoSala;
		this.visivelMonitor = visivelMonitor;
		this.cirurgias = cirurgias;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "unfSeq", column = @Column(name = "UNF_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 3, scale = 0)) })
	public MbcSalaCirurgicaId getId() {
		return this.id;
	}

	public void setId(MbcSalaCirurgicaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorAlterado() {
		return this.servidorAlterado;
	}

	public void setServidorAlterado(RapServidores servidorAlterado) {
		this.servidorAlterado = servidorAlterado;
	}

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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNF_SEQ", nullable = false, insertable = false, updatable = false)
	public AghUnidadesFuncionais getUnidadeFuncional() {
		return this.unidadeFuncional;
	}

	public void setUnidadeFuncional(AghUnidadesFuncionais unidadeFuncional) {
		this.unidadeFuncional = unidadeFuncional;
	}

	@Column(name = "SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@Column(name = "IND_ESPECIAL", nullable = false, length=1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getEspecial() {
		return this.especial;
	}

	public void setEspecial(Boolean especial) {
		this.especial = especial;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "NOME", length = 60)
	@Length(max = 60)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "MOTIVO_INAT", length = 120)
	@Length(max = 120)
	public String getMotivoInat() {
		return this.motivoInat;
	}

	public void setMotivoInat(String motivoInat) {
		this.motivoInat = motivoInat;
	}

	@Column(name = "IND_TIPO_SALA", length=1)
	@Enumerated(EnumType.STRING)
	@Deprecated
	public DominioTipoSala getTipoSala() {
		return this.tipoSala;
	}

	@Deprecated
	public void setTipoSala(DominioTipoSala tipoSala) {
		this.tipoSala = tipoSala;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TIS_SEQ", nullable = true)
	public MbcTipoSala getMbcTipoSala() {
		return mbcTipoSala;
	}

	public void setMbcTipoSala(MbcTipoSala mbcTipoSala) {
		this.mbcTipoSala = mbcTipoSala;
	}

	@Column(name = "IND_VISIVEL_MONITOR", length=1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getVisivelMonitor() {
		return this.visivelMonitor;
	}

	public void setVisivelMonitor(Boolean visivelMonitor) {
		this.visivelMonitor = visivelMonitor;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "salaCirurgica")
	public Set<MbcCirurgias> getCirurgias() {
		return this.cirurgias;
	}

	public void setCirurgias(Set<MbcCirurgias> cirurgias) {
		this.cirurgias = cirurgias;
	}
	

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mbcSalaCirurgica")
	public Set<MbcCaracteristicaSalaCirg> getMbcCaracteristicaSalaCirgs() {
		return mbcCaracteristicaSalaCirgs;
	}

	public void setMbcCaracteristicaSalaCirgs(Set<MbcCaracteristicaSalaCirg> mbcCaracteristicaSalaCirgs) {
		this.mbcCaracteristicaSalaCirgs = mbcCaracteristicaSalaCirgs;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	@Transient
	public String getNomeId(){
	    return this.getId().getSeqp().toString().concat(" - ").concat(this.nome);
	}	
	
	@Override
	public String toString() {
		return "MbcSalaCirurgica [id=" + getId() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof MbcSalaCirurgica)) {
			return false;
		}
		MbcSalaCirurgica other = (MbcSalaCirurgica) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}

	public enum Fields {

		ID("id"),
		ID_UNF_SEQ("id.unfSeq"),
		ID_SEQP("id.seqp"),
		SERVIDOR_ALTERADO("servidorAlterado"),
		SERVIDOR("servidor"),
		UNIDADE_FUNCIONAL("unidadeFuncional"),
		UNIDADE_FUNCIONAL_SEQ("unidadeFuncional.seq"),
		SITUACAO("situacao"),
		ESPECIAL("especial"),
		CRIADO_EM("criadoEm"),
		NOME("nome"),
		MOTIVO_INAT("motivoInat"),
		TIPO_SALA("tipoSala"),
		MBC_TIPO_SALA("mbcTipoSala"),
		VISIVEL_MONITOR("visivelMonitor"),
		CIRURGIAS("cirurgias"),
		CARACTERISTICA_SALA_CIRGS("mbcCaracteristicaSalaCirgs"), 
		UNF_SEQ("id.unfSeq"), SEQP("id.seqp"),
		;

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
