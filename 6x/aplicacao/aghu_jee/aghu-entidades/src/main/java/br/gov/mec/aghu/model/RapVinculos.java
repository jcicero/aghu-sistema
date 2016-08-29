package br.gov.mec.aghu.model;

// Generated 16/12/2009 15:04:28 by Hibernate Tools 3.2.5.Beta

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSimNao;
import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityCodigo;

/**
 * RapVinculos generated by hbm2java
 */

@SuppressWarnings({"PMD.AghuUsoIndevidoDaEnumDominioSimNaoEntity"})
@Entity
@Table(name = "RAP_VINCULOS", schema = "AGH")
public class RapVinculos extends BaseEntityCodigo<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3314146050154416024L;
	private Short codigo;
	private String descricao;
	private Integer nroDiasAdmissao;
	private String tituloMasculino;
	private String tituloFeminino;

	private DominioSimNao indDependente;
	private DominioSimNao indGeraMatricula;
	private DominioSimNao indCcustLotacao;
	private DominioSimNao indOcupacao;
	private DominioSimNao indTransferencia;
	private DominioSimNao indCadExterno;
	private DominioSimNao indPermDuplic;
	private DominioSimNao indExigeTermino;
	private DominioSimNao indGestaoDesempenho;
	private DominioSimNao indEmiteContrato;
	private DominioSimNao indHorario;
	private DominioSimNao indRemunerado;
	private DominioSimNao indExigeCpfRg;

	private DominioSituacao indSituacao;
	private Integer version;
	private Integer matriculaNova;

	private Set<RapServidores> rapServidoreses = new HashSet<RapServidores>(0);

	public RapVinculos() {

	}

	public RapVinculos(Short codigo, String descricao,
			DominioSimNao indDependente, DominioSituacao indSituacao,
			DominioSimNao indGeraMatricula, DominioSimNao indCcustLotacao,
			DominioSimNao indOcupacao, DominioSimNao indTransferencia,
			DominioSimNao indCadExterno, DominioSimNao indPermDuplic,
			DominioSimNao indExigeTermino, DominioSimNao indGestaoDesempenho,
			DominioSimNao indEmiteContrato, Integer version, Integer matriculaNova) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.indDependente = indDependente;
		this.indSituacao = indSituacao;
		this.indGeraMatricula = indGeraMatricula;
		this.indCcustLotacao = indCcustLotacao;
		this.indOcupacao = indOcupacao;
		this.indTransferencia = indTransferencia;
		this.indCadExterno = indCadExterno;
		this.indPermDuplic = indPermDuplic;
		this.indExigeTermino = indExigeTermino;
		this.indGestaoDesempenho = indGestaoDesempenho;
		this.indEmiteContrato = indEmiteContrato;
		this.version = version;
		this.matriculaNova = matriculaNova;
	}

	public RapVinculos(Short codigo, String descricao,
			DominioSimNao indDependente, DominioSimNao indHorario,
			DominioSimNao indRemunerado, DominioSituacao indSituacao,
			DominioSimNao indGeraMatricula, DominioSimNao indCcustLotacao,
			DominioSimNao indOcupacao, DominioSimNao indTransferencia,
			DominioSimNao indCadExterno, Integer nroDiasAdmissao,
			DominioSimNao indPermDuplic, String tituloMasculino,
			String tituloFeminino, DominioSimNao indExigeTermino,
			DominioSimNao indExigeCpfRg, DominioSimNao indGestaoDesempenho,
			DominioSimNao indEmiteContrato, Set<RapServidores> rapServidoreses,
			Integer version, Integer matriculaNova) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.indDependente = indDependente;
		this.indHorario = indHorario;
		this.indRemunerado = indRemunerado;
		this.indSituacao = indSituacao;
		this.indGeraMatricula = indGeraMatricula;
		this.indCcustLotacao = indCcustLotacao;
		this.indOcupacao = indOcupacao;
		this.indTransferencia = indTransferencia;
		this.indCadExterno = indCadExterno;
		this.nroDiasAdmissao = nroDiasAdmissao;
		this.indPermDuplic = indPermDuplic;
		this.tituloMasculino = tituloMasculino;
		this.tituloFeminino = tituloFeminino;
		this.indExigeTermino = indExigeTermino;
		this.indExigeCpfRg = indExigeCpfRg;
		this.indGestaoDesempenho = indGestaoDesempenho;
		this.indEmiteContrato = indEmiteContrato;
		this.rapServidoreses = rapServidoreses;
		this.version = version;
		this.matriculaNova = matriculaNova;
	}

	@Id
	@Column(name = "CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Short codigo) {
		this.codigo = codigo;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {		
		if (descricao != null) {
			this.descricao = descricao.toUpperCase();
		}		
	}

	@Column(name = "IND_DEPENDENTE", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndDependente() {
		return this.indDependente;
	}

	public void setIndDependente(DominioSimNao indDependente) {
		this.indDependente = indDependente;
	}

	@Transient
	public boolean isSlcIndDependente() {
		if (getIndDependente() != null) {
			return getIndDependente() == DominioSimNao.S;
		} else {
			return Boolean.FALSE;
		}
	}

	public void setSlcIndDependente(boolean valor) {
		setIndDependente(DominioSimNao.getInstance(valor));
	}

	@Column(name = "IND_HORARIO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndHorario() {
		return this.indHorario;
	}

	public void setIndHorario(DominioSimNao indHorario) {
		this.indHorario = indHorario;
	}

	@Column(name = "IND_REMUNERADO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndRemunerado() {
		return this.indRemunerado;
	}

	public void setIndRemunerado(DominioSimNao indRemunerado) {
		this.indRemunerado = indRemunerado;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "IND_GERA_MATRICULA", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndGeraMatricula() {
		return this.indGeraMatricula;
	}

	public void setIndGeraMatricula(DominioSimNao indGeraMatricula) {
		this.indGeraMatricula = indGeraMatricula;
	}

	@Transient
	public boolean isSlcIndGeraMatricula() {
		if (getIndGeraMatricula() != null) {
			return getIndGeraMatricula() == DominioSimNao.S;
		} else {
			return Boolean.FALSE;
		}
	}

	public void setSlcIndGeraMatricula(boolean valor) {
		setIndGeraMatricula(DominioSimNao.getInstance(valor));
	}

	@Column(name = "IND_CCUST_LOTACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndCcustLotacao() {
		return this.indCcustLotacao;
	}

	public void setIndCcustLotacao(DominioSimNao indCcustLotacao) {
		this.indCcustLotacao = indCcustLotacao;
	}

	@Transient
	public boolean isSlcIndCcustoLotacao() {
		if (getIndCcustLotacao() != null) {
			return getIndCcustLotacao() == DominioSimNao.S;
		} else {
			return Boolean.FALSE;
		}
	}

	public void setSlcIndCcustoLotacao(boolean valor) {
		setIndCcustLotacao(DominioSimNao.getInstance(valor));
	}

	@Column(name = "IND_OCUPACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndOcupacao() {
		return this.indOcupacao;
	}

	public void setIndOcupacao(DominioSimNao indOcupacao) {
		this.indOcupacao = indOcupacao;
	}

	@Transient
	public boolean isSlcIndOcupacao() {
		if (getIndOcupacao() != null) {
			return getIndOcupacao() == DominioSimNao.S;
		} else {
			return Boolean.FALSE;
		}
	}

	public void setSlcIndOcupacao(boolean valor) {
		setIndOcupacao(DominioSimNao.getInstance(valor));
	}

	@Column(name = "IND_TRANSFERENCIA", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndTransferencia() {
		return this.indTransferencia;
	}

	public void setIndTransferencia(DominioSimNao indTransferencia) {
		this.indTransferencia = indTransferencia;
	}

	@Transient
	public boolean isSlcIndTransferencia() {
		if (getIndTransferencia() != null) {
			return getIndTransferencia() == DominioSimNao.S;
		} else {
			return Boolean.FALSE;
		}
	}

	public void setSlcIndTransferencia(boolean valor) {
		setIndTransferencia(DominioSimNao.getInstance(valor));
	}

	@Column(name = "IND_CAD_EXTERNO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndCadExterno() {
		return this.indCadExterno;
	}

	public void setIndCadExterno(DominioSimNao indCadExterno) {
		this.indCadExterno = indCadExterno;
	}

	@Column(name = "NRO_DIAS_ADMISSAO", precision = 5, scale = 0)
	public Integer getNroDiasAdmissao() {
		return this.nroDiasAdmissao;
	}

	public void setNroDiasAdmissao(Integer nroDiasAdmissao) {
		this.nroDiasAdmissao = nroDiasAdmissao;
	}

	@Column(name = "IND_PERM_DUPLIC", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndPermDuplic() {
		return this.indPermDuplic;
	}

	public void setIndPermDuplic(DominioSimNao indPermDuplic) {
		this.indPermDuplic = indPermDuplic;
	}

	@Transient
	public boolean isSlcIndPermDuplic() {
		if (getIndPermDuplic() != null) {
			return getIndPermDuplic() == DominioSimNao.S;
		} else {
			return Boolean.FALSE;
		}
	}

	public void setSlcIndPermDuplic(boolean valor) {
		setIndPermDuplic(DominioSimNao.getInstance(valor));
	}

	@Column(name = "TITULO_MASCULINO", length = 10)
	public String getTituloMasculino() {
		return this.tituloMasculino;
	}

	public void setTituloMasculino(String tituloMasculino) {
		this.tituloMasculino = tituloMasculino;
	}

	@Column(name = "TITULO_FEMININO", length = 10)
	public String getTituloFeminino() {
		return this.tituloFeminino;
	}

	public void setTituloFeminino(String tituloFeminino) {
		this.tituloFeminino = tituloFeminino;
	}

	@Column(name = "IND_EXIGE_TERMINO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndExigeTermino() {
		return this.indExigeTermino;
	}

	public void setIndExigeTermino(DominioSimNao indExigeTermino) {
		this.indExigeTermino = indExigeTermino;
	}

	@Transient
	public boolean isSlcIndExigeTermino() {
		if (getIndExigeTermino() != null) {
			return getIndExigeTermino() == DominioSimNao.S;
		} else {
			return Boolean.FALSE;
		}
	}

	public void setSlcIndExigeTermino(boolean valor) {
		setIndExigeTermino(DominioSimNao.getInstance(valor));
	}

	@Column(name = "IND_EXIGE_CPF_RG", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndExigeCpfRg() {
		return this.indExigeCpfRg;
	}

	public void setIndExigeCpfRg(DominioSimNao indExigeCpfRg) {
		this.indExigeCpfRg = indExigeCpfRg;
	}

	@Transient
	public boolean isSlcIndExigeCpfRg() {
		if (getIndExigeCpfRg() != null) {
			return getIndExigeCpfRg() == DominioSimNao.S;
		} else {
			return Boolean.FALSE;
		}
	}

	public void setSlcIndExigeCpfRg(boolean valor) {
		setIndExigeCpfRg(DominioSimNao.getInstance(valor));
	}

	@Column(name = "IND_GESTAO_DESEMPENHO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndGestaoDesempenho() {
		return this.indGestaoDesempenho;
	}

	public void setIndGestaoDesempenho(DominioSimNao indGestaoDesempenho) {
		this.indGestaoDesempenho = indGestaoDesempenho;
	}

	@Transient
	public boolean isSlcIndGestaoDesempenho() {
		if (getIndGestaoDesempenho() != null) {
			return getIndGestaoDesempenho() == DominioSimNao.S;
		} else {
			return Boolean.FALSE;
		}
	}

	public void setSlcIndGestaoDesempenho(boolean valor) {
		setIndGestaoDesempenho(DominioSimNao.getInstance(valor));
	}

	@Column(name = "IND_EMITE_CONTRATO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndEmiteContrato() {
		return this.indEmiteContrato;
	}

	public void setIndEmiteContrato(DominioSimNao indEmiteContrato) {
		this.indEmiteContrato = indEmiteContrato;
	}

	@Transient
	public boolean isSlcIndEmiteContrato() {
		if (getIndEmiteContrato() != null) {
			return getIndEmiteContrato() == DominioSimNao.S;
		} else {
			return Boolean.FALSE;
		}
	}

	public void setSlcIndEmiteContrato(boolean valor) {
		setIndEmiteContrato(DominioSimNao.getInstance(valor));
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "MATRICULA_NOVA")
	public Integer getMatriculaNova() {
		return matriculaNova;
	}

	public void setMatriculaNova(Integer matriculaNova) {
		this.matriculaNova = matriculaNova;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vinculo")
	public Set<RapServidores> getRapServidoreses() {
		return this.rapServidoreses;
	}

	public void setRapServidoreses(Set<RapServidores> rapServidoreses) {
		this.rapServidoreses = rapServidoreses;
	}

	public enum Fields {
		CODIGO("codigo"), DESCRICAO("descricao"), IND_SITUACAO("indSituacao"), TITULO_MASCULINO(
				"tituloMasculino"), TITULO_FEMININO("tituloFeminino");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}

	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validacoes() {

		if (this.indCadExterno == null) {
			this.indCadExterno = DominioSimNao.N;
		}

		if (this.indHorario == null) {
			this.indHorario = DominioSimNao.N;
		}

		if (this.indRemunerado == null) {
			this.indRemunerado = DominioSimNao.N;
		}

	}

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getCodigo() == null) ? 0 : getCodigo().hashCode());
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
		if (!(obj instanceof RapVinculos)) {
			return false;
		}
		RapVinculos other = (RapVinculos) obj;
		if (getCodigo() == null) {
			if (other.getCodigo() != null) {
				return false;
			}
		} else if (!getCodigo().equals(other.getCodigo())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}