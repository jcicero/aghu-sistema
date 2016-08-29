package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;


import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacaoCompetencia;
import br.gov.mec.aghu.core.persistence.BaseEntityId;
import br.gov.mec.aghu.core.utils.DateUtil;

/**
 * FatCompetencias generated by hbm2java
 */
@Entity
@Table(name = "FAT_COMPETENCIAS", schema = "AGH")
public class FatCompetencia extends BaseEntityId<FatCompetenciaId> implements java.io.Serializable {
	private static final long serialVersionUID = 4953784734048813670L;
	
	private FatCompetenciaId id;
	private Boolean indFaturado;
	private Date dtHrFim;
	private String criadoPor;
	private String alteradoPor;
	private Date criadoEm;
	private Date alteradoEm;
	private DominioSituacaoCompetencia indSituacao;
	private Date dthrLiberadoCo;
	private Date dthrLiberadoEmerg;
	private Date dthrEncerraEstatistica;
	private Set<FatEspelhoContaApac> fatEspelhosContaApacsForFatEcaCpeFk1 = new HashSet<FatEspelhoContaApac>(
			0);
	private Set<FatArqEspelhoProcedAmb> fatArqEspelhoProcedAmbs = new HashSet<FatArqEspelhoProcedAmb>(
			0);
	private Set<FatEspelhoContaApac> fatEspelhosContaApacsForFatEcaCpeFk2 = new HashSet<FatEspelhoContaApac>(
			0);
	private Set<FatEspelhoSismama> fatEspelhoSismamas = new HashSet<FatEspelhoSismama>(
			0);
	private Set<FatDocumentoCobrancaAihs> fatDocumentoCobrancaAihses = new HashSet<FatDocumentoCobrancaAihs>(
			0);
	private Set<FatEspelhoProcedSiscolo> fatEspelhoProcedSiscoloses = new HashSet<FatEspelhoProcedSiscolo>(
			0);
	private Set<FatEspelhoProcedAmb> fatEspelhoProcedAmbs = new HashSet<FatEspelhoProcedAmb>(
			0);
	private Integer version;

	private String versaoSisaih;
	
	//Lookup competencia
	private String mesAno;
	private String competencia;
	private String data;
	
	public FatCompetencia() {
	}

	public FatCompetencia(FatCompetenciaId id, Boolean indFaturado,
			String criadoPor, String alteradoPor) {
		this.id = id;
		this.indFaturado = indFaturado;
		this.criadoPor = criadoPor;
		this.alteradoPor = alteradoPor;
	}

	public FatCompetencia(FatCompetenciaId id, Boolean indFaturado,
			Date dtHrFim, String criadoPor, String alteradoPor, Date criadoEm,
			Date alteradoEm, DominioSituacaoCompetencia indSituacao, Date dthrLiberadoCo,
			Date dthrLiberadoEmerg, Date dthrEncerraEstatistica,
			Set<FatEspelhoContaApac> fatEspelhosContaApacsForFatEcaCpeFk1,
			Set<FatArqEspelhoProcedAmb> fatArqEspelhoProcedAmbs,
			Set<FatEspelhoContaApac> fatEspelhosContaApacsForFatEcaCpeFk2,
			Set<FatEspelhoSismama> fatEspelhoSismamas,
			Set<FatDocumentoCobrancaAihs> fatDocumentoCobrancaAihses,
			Set<FatEspelhoProcedSiscolo> fatEspelhoProcedSiscoloses,
			Set<FatEspelhoProcedAmb> fatEspelhoProcedAmbs) {
		this.id = id;
		this.indFaturado = indFaturado;
		this.dtHrFim = dtHrFim;
		this.criadoPor = criadoPor;
		this.alteradoPor = alteradoPor;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.indSituacao = indSituacao;
		this.dthrLiberadoCo = dthrLiberadoCo;
		this.dthrLiberadoEmerg = dthrLiberadoEmerg;
		this.dthrEncerraEstatistica = dthrEncerraEstatistica;
		this.fatEspelhosContaApacsForFatEcaCpeFk1 = fatEspelhosContaApacsForFatEcaCpeFk1;
		this.fatArqEspelhoProcedAmbs = fatArqEspelhoProcedAmbs;
		this.fatEspelhosContaApacsForFatEcaCpeFk2 = fatEspelhosContaApacsForFatEcaCpeFk2;
		this.fatEspelhoSismamas = fatEspelhoSismamas;
		this.fatDocumentoCobrancaAihses = fatDocumentoCobrancaAihses;
		this.fatEspelhoProcedSiscoloses = fatEspelhoProcedSiscoloses;
		this.fatEspelhoProcedAmbs = fatEspelhoProcedAmbs;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "modulo", column = @Column(name = "MODULO", nullable = false, length = 4)),
			@AttributeOverride(name = "mes", column = @Column(name = "MES", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "ano", column = @Column(name = "ANO", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "dtHrInicio", column = @Column(name = "DT_HR_INICIO", nullable = false, length = 7)) })
	public FatCompetenciaId getId() {
		return this.id;
	}

	public void setId(FatCompetenciaId id) {
		this.id = id;
		
		if (id != null && id.getMes() != null && id.getAno() != null
				&& id.getDtHrInicio() != null) {
			final String mes = (id.getMes().intValue() > 9) ? id.getMes()
					.toString() : "0" + id.getMes();
			setMesAno(mes + "/" + id.getAno());
			setData(getMesAno()
					+ " - "
					+ DateUtil.obterDataFormatadaHoraMinutoSegundo(id
							.getDtHrInicio()));
		}
	}

	@Column(name = "IND_FATURADO", nullable = false)
	@Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndFaturado() {
		return this.indFaturado;
	}

	public void setIndFaturado(Boolean indFaturado) {
		this.indFaturado = indFaturado;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_HR_FIM", length = 7)
	public Date getDtHrFim() {
		return this.dtHrFim;
	}

	public void setDtHrFim(Date dtHrFim) {
		this.dtHrFim = dtHrFim;
		
		if(dtHrFim != null){
			setCompetencia(getData() + " a " + DateUtil.obterDataFormatadaHoraMinutoSegundo(getDtHrFim()));
		} else {
			setCompetencia(getData());
		}
	}

	@Column(name = "CRIADO_POR", nullable = false, length = 30)
	@Length(max = 30)
	public String getCriadoPor() {
		return this.criadoPor;
	}

	public void setCriadoPor(String criadoPor) {
		this.criadoPor = criadoPor;
	}

	@Column(name = "ALTERADO_POR", nullable = false, length = 30)
	@Length(max = 30)
	public String getAlteradoPor() {
		return this.alteradoPor;
	}

	public void setAlteradoPor(String alteradoPor) {
		this.alteradoPor = alteradoPor;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoCompetencia getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacaoCompetencia indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_LIBERADO_CO", length = 7)
	public Date getDthrLiberadoCo() {
		return this.dthrLiberadoCo;
	}

	public void setDthrLiberadoCo(Date dthrLiberadoCo) {
		this.dthrLiberadoCo = dthrLiberadoCo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_LIBERADO_EMERG", length = 7)
	public Date getDthrLiberadoEmerg() {
		return this.dthrLiberadoEmerg;
	}

	public void setDthrLiberadoEmerg(Date dthrLiberadoEmerg) {
		this.dthrLiberadoEmerg = dthrLiberadoEmerg;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_ENCERRA_ESTATISTICA", length = 7)
	public Date getDthrEncerraEstatistica() {
		return this.dthrEncerraEstatistica;
	}

	public void setDthrEncerraEstatistica(Date dthrEncerraEstatistica) {
		this.dthrEncerraEstatistica = dthrEncerraEstatistica;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatCompetenciasByFatEcaCpeFk1")
	public Set<FatEspelhoContaApac> getFatEspelhosContaApacsForFatEcaCpeFk1() {
		return this.fatEspelhosContaApacsForFatEcaCpeFk1;
	}

	public void setFatEspelhosContaApacsForFatEcaCpeFk1(
			Set<FatEspelhoContaApac> fatEspelhosContaApacsForFatEcaCpeFk1) {
		this.fatEspelhosContaApacsForFatEcaCpeFk1 = fatEspelhosContaApacsForFatEcaCpeFk1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatCompetencia")
	public Set<FatArqEspelhoProcedAmb> getFatArqEspelhoProcedAmbs() {
		return this.fatArqEspelhoProcedAmbs;
	}

	public void setFatArqEspelhoProcedAmbs(
			Set<FatArqEspelhoProcedAmb> fatArqEspelhoProcedAmbs) {
		this.fatArqEspelhoProcedAmbs = fatArqEspelhoProcedAmbs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatCompetenciasByFatEcaCpeFk2")
	public Set<FatEspelhoContaApac> getFatEspelhosContaApacsForFatEcaCpeFk2() {
		return this.fatEspelhosContaApacsForFatEcaCpeFk2;
	}

	public void setFatEspelhosContaApacsForFatEcaCpeFk2(
			Set<FatEspelhoContaApac> fatEspelhosContaApacsForFatEcaCpeFk2) {
		this.fatEspelhosContaApacsForFatEcaCpeFk2 = fatEspelhosContaApacsForFatEcaCpeFk2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatCompetencia")
	public Set<FatEspelhoSismama> getFatEspelhoSismamas() {
		return this.fatEspelhoSismamas;
	}

	public void setFatEspelhoSismamas(
			Set<FatEspelhoSismama> fatEspelhoSismamas) {
		this.fatEspelhoSismamas = fatEspelhoSismamas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatCompetencia")
	public Set<FatDocumentoCobrancaAihs> getFatDocumentoCobrancaAihses() {
		return this.fatDocumentoCobrancaAihses;
	}

	public void setFatDocumentoCobrancaAihses(
			Set<FatDocumentoCobrancaAihs> fatDocumentoCobrancaAihses) {
		this.fatDocumentoCobrancaAihses = fatDocumentoCobrancaAihses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatCompetencia")
	public Set<FatEspelhoProcedSiscolo> getFatEspelhoProcedSiscoloses() {
		return this.fatEspelhoProcedSiscoloses;
	}

	public void setFatEspelhoProcedSiscoloses(
			Set<FatEspelhoProcedSiscolo> fatEspelhoProcedSiscoloses) {
		this.fatEspelhoProcedSiscoloses = fatEspelhoProcedSiscoloses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fatCompetencia")
	public Set<FatEspelhoProcedAmb> getFatEspelhoProcedAmbs() {
		return this.fatEspelhoProcedAmbs;
	}

	public void setFatEspelhoProcedAmbs(
			Set<FatEspelhoProcedAmb> fatEspelhoProcedAmbs) {
		this.fatEspelhoProcedAmbs = fatEspelhoProcedAmbs;
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
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		FatCompetencia other = (FatCompetencia) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}



	public enum Fields {
		
		MODULO("id.modulo"),
		MES("id.mes"),
		ANO("id.ano"),
		DT_HR_INICIO("id.dtHrInicio"),
		DT_HR_FIM("dtHrFim"),
		DT_HR_LIBERADO_CO("dthrLiberadoCo"),
		DT_HR_LIBERADO_EMERG("dthrLiberadoEmerg"),
		IND_SITUACAO("indSituacao"),
		IND_FATURADO("indFaturado"),
		MESANO("mesAno"),
		FAT_ARQ_ESPELHO_PROCED_AMB("fatArqEspelhoProcedAmbs"),
		VERSAO_SISAIH("versaoSisaih")
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
	
	@Transient
	public String getMesAno() {
		return mesAno;
	}

	public void setMesAno(String mesAno) {
		this.mesAno = mesAno;
	}
	
	@Transient
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Transient
	public String getCompetencia() {
		return competencia;
	}

	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}

	@Column(name="VERSAO_SISAIH", length=10, nullable=true)
	public String getVersaoSisaih() {
		return versaoSisaih;
	}

	public void setVersaoSisaih(String versaoSisaih) {
		this.versaoSisaih = versaoSisaih;
	}
}
