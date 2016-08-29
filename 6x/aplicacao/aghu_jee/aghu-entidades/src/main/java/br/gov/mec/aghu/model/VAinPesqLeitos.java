package br.gov.mec.aghu.model;

// Generated 29/04/2010 18:11:59 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * VAinPesqLeitos generated by hbm2java TODO substituir essa view, métodos como
 * nvl e decode no oracle
 */

@Entity
@Table(name = "V_AIN_PESQ_LEITOS", schema = "AGH")
@Immutable
public class VAinPesqLeitos extends BaseEntityId<VAinPesqLeitosId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4285202648683677068L;
	private VAinPesqLeitosId id;

	public VAinPesqLeitos() {
	}

	public VAinPesqLeitos(VAinPesqLeitosId id) {
		this.id = id;
	}

	private AinInternacao internacao;
	private AipPacientes pacientes;
	private FatConvenioSaude convenios;
	private AinAcomodacoes acomodacao;
	private RapServidores servidor;
	private AinTiposMovimentoLeito tiposMovimentoLeito;

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "ltoLtoId", column = @Column(name = "LTO_LTO_ID", length = 14)),
			@AttributeOverride(name = "grupoMvtoLeito", column = @Column(name = "GRUPO_MVTO_LEITO", length = 2)),
			@AttributeOverride(name = "clcCodigo", column = @Column(name = "CLC_CODIGO", precision = 2, scale = 0)),
			@AttributeOverride(name = "indExclusivInfeccao", column = @Column(name = "IND_EXCLUSIV_INFECCAO", length = 1)),
			@AttributeOverride(name = "grupoConvenio", column = @Column(name = "GRUPO_CONVENIO", length = 1)),
			@AttributeOverride(name = "grupoConvPart", column = @Column(name = "GRUPO_CONV_PART", length = 2)),
			@AttributeOverride(name = "andar", column = @Column(name = "ANDAR", precision = 2, scale = 0)),
			@AttributeOverride(name = "indAla", column = @Column(name = "IND_ALA", length = 1)),
			@AttributeOverride(name = "unfSeq", column = @Column(name = "UNF_SEQ", precision = 4, scale = 0)),
			@AttributeOverride(name = "livre", column = @Column(name = "LIVRE", length = 5)),
			@AttributeOverride(name = "justificativa", column = @Column(name = "JUSTIFICATIVA", length = 240)),
			@AttributeOverride(name = "dthrLancamento", column = @Column(name = "DTHR_LANCAMENTO", length = 7)),
			@AttributeOverride(name = "sexoDeterminante", column = @Column(name = "SEXO_DETERMINANTE", length = 1)),
			@AttributeOverride(name = "sexoOcupacao", column = @Column(name = "SEXO_OCUPACAO", length = 1)),
			@AttributeOverride(name = "criadoEm", column = @Column(name = "CRIADO_EM", length = 7)),
			@AttributeOverride(name = "tclDescricao", column = @Column(name = "TCL_DESCRICAO", length = 60)) })
	public VAinPesqLeitosId getId() {
		return this.id;
	}

	public void setId(VAinPesqLeitosId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAC_CODIGO", nullable = false)
	public AipPacientes getPacientes() {
		return pacientes;
	}

	public void setPacientes(AipPacientes pacientes) {
		this.pacientes = pacientes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CNV_CODIGO", nullable = false)
	public FatConvenioSaude getConvenios() {
		return convenios;
	}

	public void setConvenios(FatConvenioSaude convenios) {
		this.convenios = convenios;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INT_SEQ", nullable = false)
	public AinInternacao getInternacao() {
		return internacao;
	}

	public void setInternacao(AinInternacao internacao) {
		this.internacao = internacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ACM_SEQ", nullable = false)
	public AinAcomodacoes getAcomodacao() {
		return acomodacao;
	}

	public void setAcomodacao(AinAcomodacoes acomodacao) {
		this.acomodacao = acomodacao;
	}

	/**
	 * @return the servidorResponsavel
	 */
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	@ManyToOne(fetch = FetchType.LAZY)
	public RapServidores getServidor() {
		return servidor;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TML_CODIGO", nullable = false)
	public AinTiposMovimentoLeito getTiposMovimentoLeito() {
		return tiposMovimentoLeito;
	}

	public void setTiposMovimentoLeito(AinTiposMovimentoLeito tiposMovimentoLeito) {
		this.tiposMovimentoLeito = tiposMovimentoLeito;
	}

	/**
	 * @param servidorResponsavel
	 *            the servidorResponsavel to set
	 */
	public void setServidor(RapServidores servidorResponsavel) {
		this.servidor = servidorResponsavel;
	}

	public enum Fields {

		LTO_LTO_ID("id.ltoLtoId"), INT_SEQ("internacao.seq"), GRUPO_MVTO_LEITO("id.grupoMvtoLeito"), ACM_SEQ(
				"acomodacao.seq"), CLC_CODIGO("id.clcCodigo"), IND_EXCLUSIV_INFECCAO(
				"id.indExclusivInfeccao"), CNV_CODIGO("convenios.codigo"), GRUPO_CONVENIO(
				"id.grupoConvenio"), GRUPO_CONV_PART("id.grupoConvPart"), ANDAR(
				"id.andar"), IND_ALA("id.indAla"), UNF_SEQ("id.unfSeq"), DTHR_LANCAMENTO(
				"id.dthrLancamento"), INTERNACAO("internacao"), PACIENTE(
				"pacientes"), DSP_NOME("pacientes.nome"), DSP_SEXO(
				"pacientes.sexo"), DSP_PRONTUARIO("pacientes.prontuario"), DPS_DESCRICAO(
				"convenios.descricao"), CONVENIOS("convenios"), JUSTIFICATIVA(
				"id.justificativa"), TCL_DESCRICAO("id.tclDescricao"), ACOMODACAO(
				"acomodacao"), DPS_ACOM_DESCRICAO("acomodacao.descricao"), SERVIDOR(
				"servidor"), SEXO_OCUPACAO("id.sexoOcupacao"), TIPO_MOVIMENTO("tiposMovimentoLeito");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
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
		if (!(obj instanceof VAinPesqLeitos)) {
			return false;
		}
		VAinPesqLeitos other = (VAinPesqLeitos) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
