package br.gov.mec.aghu.model;

// Generated 07/01/2011 12:20:26 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.gov.mec.aghu.core.persistence.BaseEntity;
import br.gov.mec.aghu.dominio.DominioSituacao;

/**
 * AelExames generated by hbm2java
 */
@Entity
@Table(name = "AEL_EXAMES", schema = "AGH")
public class AelExames implements BaseEntity {

	private static final long serialVersionUID = 3695681309953783012L;
	private String sigla;
	private String descricao;
	private String descricaoUsual;
	private DominioSituacao indSituacao;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Integer serMatriculaAlterado;
	private Short serVinCodigoAlterado;
	private Boolean indImpressao;
	private Boolean indConsisteInterface;
	private Boolean indSumarioParada;
	private Boolean indPermiteAnexarDoc;
	private List<AelExamesMaterialAnalise> aelExamesMaterialAnalise;
	private List<AelSinonimoExame> sinonimoExames = new LinkedList<AelSinonimoExame>();
	private Set<AelItemSolicitacaoExames> ufeEmaExaSigla;
	private List<MtxExameUltResults> listaMtxExameUltResults = new LinkedList<MtxExameUltResults>();

	public AelExames() {
	}
	

	public AelExames(String sigla, String descricao, String descricaoUsual,
			DominioSituacao indSituacao, Date criadoEm, Integer serMatricula,
			Short serVinCodigo, Integer serMatriculaAlterado,
			Short serVinCodigoAlterado, Boolean indImpressao,
			Boolean indConsisteInterface, Boolean indSumarioParada,
			Boolean indPermiteAnexarDoc,
			Set<MpmAltaItemPedidoExame> altaItensPedidoExame) {
		super();
		this.sigla = sigla;
		this.descricao = descricao;
		this.descricaoUsual = descricaoUsual;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.serMatriculaAlterado = serMatriculaAlterado;
		this.serVinCodigoAlterado = serVinCodigoAlterado;
		this.indImpressao = indImpressao;
		this.indConsisteInterface = indConsisteInterface;
		this.indSumarioParada = indSumarioParada;
		this.indPermiteAnexarDoc = indPermiteAnexarDoc;
	}

	public enum Fields {
		SIGLA("sigla"),
		DESCRICAO("descricao"),
		DESCRICAO_USUAL("descricaoUsual"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		SER_MATRICULA_ALTERADO("serMatriculaAlterado"),
		SER_VIN_CODIGO_ALTERADO("serVinCodigoAlterado"),
		IND_IMPRESSAO("indImpressao"),
		IND_CONSISTE_INTERFACE("indConsisteInterface"),
		IND_SUMARIO_PARADA("indSumarioParada"),
		IND_PERMITE_ANEXAR_DOC("indPermiteAnexarDoc"), 
		SINONIMO_EXAME("sinonimoExames"),
		AEL_EXAMES_MATERIAL_ANALISE("aelExamesMaterialAnalise"),
		LISTA_EUR("listaMtxExameUltResults"),
		UFE_EMA_EXA_SIGLA("ufeEmaExaSigla");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}	

	@Id
	@Column(name = "SIGLA", unique = true, nullable = false, length = 5)
	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 100)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "DESCRICAO_USUAL", nullable = false, length = 100)
	public String getDescricaoUsual() {
		return this.descricaoUsual;
	}

	public void setDescricaoUsual(String descricaoUsual) {
		this.descricaoUsual = descricaoUsual;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
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

	@Column(name = "SER_MATRICULA_ALTERADO", precision = 7, scale = 0)
	public Integer getSerMatriculaAlterado() {
		return this.serMatriculaAlterado;
	}

	public void setSerMatriculaAlterado(Integer serMatriculaAlterado) {
		this.serMatriculaAlterado = serMatriculaAlterado;
	}

	@Column(name = "SER_VIN_CODIGO_ALTERADO", precision = 3, scale = 0)
	public Short getSerVinCodigoAlterado() {
		return this.serVinCodigoAlterado;
	}

	public void setSerVinCodigoAlterado(Short serVinCodigoAlterado) {
		this.serVinCodigoAlterado = serVinCodigoAlterado;
	}

	@Column(name = "IND_IMPRESSAO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")	
	public Boolean getIndImpressao() {
		return this.indImpressao;
	}

	public void setIndImpressao(Boolean indImpressao) {
		this.indImpressao = indImpressao;
	}

	@Column(name = "IND_CONSISTE_INTERFACE", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")	
	public Boolean getIndConsisteInterface() {
		return this.indConsisteInterface;
	}

	public void setIndConsisteInterface(Boolean indConsisteInterface) {
		this.indConsisteInterface = indConsisteInterface;
	}

	@Column(name = "IND_SUMARIO_PARADA", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")	
	public Boolean getIndSumarioParada() {
		return this.indSumarioParada;
	}

	public void setIndSumarioParada(Boolean indSumarioParada) {
		this.indSumarioParada = indSumarioParada;
	}
	
	@Column(name = "IND_PERMITE_ANEXAR_DOC", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")	
	public Boolean getIndPermiteAnexarDoc() {
		return this.indPermiteAnexarDoc;
	}

	public void setIndPermiteAnexarDoc(Boolean indPermiteAnexarDoc) {
		this.indPermiteAnexarDoc = indPermiteAnexarDoc;
	}
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="aelExames")
	public List<AelExamesMaterialAnalise> getAelExamesMaterialAnalise() {
		return aelExamesMaterialAnalise;
	}

	public void setAelExamesMaterialAnalise(
			List<AelExamesMaterialAnalise> aelExamesMaterialAnalise) {
		this.aelExamesMaterialAnalise = aelExamesMaterialAnalise;
	}
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="exame")
	public List<AelSinonimoExame> getSinonimoExames() {
		return sinonimoExames;
	}
	
	public void setSinonimoExames(List<AelSinonimoExame> sinonimoExames) {
		this.sinonimoExames = sinonimoExames;
	}

	@OneToMany(fetch=FetchType.LAZY, mappedBy="exame")
	public Set<AelItemSolicitacaoExames> getUfeEmaExaSigla() {
		return ufeEmaExaSigla;
	}


	public void setUfeEmaExaSigla(Set<AelItemSolicitacaoExames> ufeEmaExaSigla) {
		this.ufeEmaExaSigla = ufeEmaExaSigla;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.getSigla() == null) ? 0 : this.getSigla().hashCode());
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
		if (!( obj instanceof AelExames)) {
			return false;
		}
		
		AelExames other = (AelExames) obj;
		if (this.getSigla() == null) {
			if (other.getSigla() != null) {
				return false;
			}
		} else if (!this.getSigla().equals(other.getSigla())) {
			return false;
		}

		return true;
	}
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="aelExames")
	public List<MtxExameUltResults> getListaMtxExameUltResults() {
		return listaMtxExameUltResults;
	}


	public void setListaMtxExameUltResults(
			List<MtxExameUltResults> listaMtxExameUltResults) {
		this.listaMtxExameUltResults = listaMtxExameUltResults;
	}
}