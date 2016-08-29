package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityCodigo;

/**
 * MvaipPaciente generated by hbm2java
 */
@Entity
@Table(name = "MVAIP_PACIENTES", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = "prontuario"))
public class MvaipPaciente extends BaseEntityCodigo<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6198598225249453702L;
	private Integer codigo;
	private Integer cctCodigoCadastro;
	private Integer serMatriculaCadastro;
	private Short serVinCodigoCadastro;
	private String nome;
	private String nomeMae;
	private Date dtNascimento;
	private Date dtIdentificacao;
	private Integer cctCodigoRecadastro;
	private Integer cddCodigo;
	private Short nacCodigo;
	private Integer ocpCodigo;
	private String ufSigla;
	private Integer serMatriculaRecadastro;
	private Short serVinCodigoRecadastro;
	private String cor;
	private String sexo;
	private Short grauInstrucao;
	private String nomePai;
	private String naturalidade;
	private Short dddFoneResidencial;
	private Integer foneResidencial;
	private Short dddFoneRecado;
	private String foneRecado;
	private String estadoCivil;
	private Long cpf;
	private Integer prontuario;
	private Date dtObito;
	private Long rg;
	private String orgaoEmisRg;
	private String observacao;
	private String prntAtivo;
	private String cadConfirmado;
	private String indGeraProntuario;
	private Date dtUltInternacao;
	private Date dtUltAlta;
	private Date dtUltConsulta;
	private Date dtUltProcedimento;
	private Date dtUltAtendHospDia;
	private Date dtUltAltaHospDia;
	private Short qrtNumero;
	private Short unfSeq;
	private String ltoLtoId;
	private Long regNascimento;
	private Long nroCartaoSaude;
	private Date dtRecadastro;
	private String indPacienteVip;
	private Integer pacCodigoMae;
	private String tipoDataObito;
	private Date dtObitoExterno;
	private Integer rnaGsoPacCodigo;
	private Short rnaGsoSeqp;
	private Short rnaSeqp;
	private Long numeroPis;
	private Short volumes;
	private String indPacProtegido;
	private Date criadoEm;
	private String indPacAgfa;
	private String sexoBiologico;

	public MvaipPaciente() {
	}

	public MvaipPaciente(Integer codigo, Integer cctCodigoCadastro, Integer serMatriculaCadastro, Short serVinCodigoCadastro, String nome,
			String nomeMae, Date dtNascimento, Date dtIdentificacao, String cadConfirmado, String indGeraProntuario,
			String indPacienteVip) {
		this.codigo = codigo;
		this.cctCodigoCadastro = cctCodigoCadastro;
		this.serMatriculaCadastro = serMatriculaCadastro;
		this.serVinCodigoCadastro = serVinCodigoCadastro;
		this.nome = nome;
		this.nomeMae = nomeMae;
		this.dtNascimento = dtNascimento;
		this.dtIdentificacao = dtIdentificacao;
		this.cadConfirmado = cadConfirmado;
		this.indGeraProntuario = indGeraProntuario;
		this.indPacienteVip = indPacienteVip;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public MvaipPaciente(Integer codigo, Integer cctCodigoCadastro, Integer serMatriculaCadastro, Short serVinCodigoCadastro, String nome,
			String nomeMae, Date dtNascimento, Date dtIdentificacao, Integer cctCodigoRecadastro, Integer cddCodigo, Short nacCodigo,
			Integer ocpCodigo, String ufSigla, Integer serMatriculaRecadastro, Short serVinCodigoRecadastro, String cor, String sexo,
			Short grauInstrucao, String nomePai, String naturalidade, Short dddFoneResidencial, Integer foneResidencial,
			Short dddFoneRecado, String foneRecado, String estadoCivil, Long cpf, Integer prontuario, Date dtObito, Long rg,
			String orgaoEmisRg, String observacao, String prntAtivo, String cadConfirmado, String indGeraProntuario,
			Date dtUltInternacao, Date dtUltAlta, Date dtUltConsulta, Date dtUltProcedimento, Date dtUltAtendHospDia,
			Date dtUltAltaHospDia, Short qrtNumero, Short unfSeq, String ltoLtoId, Long regNascimento, Long nroCartaoSaude,
			Date dtRecadastro, String indPacienteVip, Integer pacCodigoMae, String tipoDataObito, Date dtObitoExterno,
			Integer rnaGsoPacCodigo, Short rnaGsoSeqp, Short rnaSeqp, Long numeroPis, Short volumes, String indPacProtegido,
			Date criadoEm, String indPacAgfa, String sexoBiologico) {
		this.codigo = codigo;
		this.cctCodigoCadastro = cctCodigoCadastro;
		this.serMatriculaCadastro = serMatriculaCadastro;
		this.serVinCodigoCadastro = serVinCodigoCadastro;
		this.nome = nome;
		this.nomeMae = nomeMae;
		this.dtNascimento = dtNascimento;
		this.dtIdentificacao = dtIdentificacao;
		this.cctCodigoRecadastro = cctCodigoRecadastro;
		this.cddCodigo = cddCodigo;
		this.nacCodigo = nacCodigo;
		this.ocpCodigo = ocpCodigo;
		this.ufSigla = ufSigla;
		this.serMatriculaRecadastro = serMatriculaRecadastro;
		this.serVinCodigoRecadastro = serVinCodigoRecadastro;
		this.cor = cor;
		this.sexo = sexo;
		this.grauInstrucao = grauInstrucao;
		this.nomePai = nomePai;
		this.naturalidade = naturalidade;
		this.dddFoneResidencial = dddFoneResidencial;
		this.foneResidencial = foneResidencial;
		this.dddFoneRecado = dddFoneRecado;
		this.foneRecado = foneRecado;
		this.estadoCivil = estadoCivil;
		this.cpf = cpf;
		this.prontuario = prontuario;
		this.dtObito = dtObito;
		this.rg = rg;
		this.orgaoEmisRg = orgaoEmisRg;
		this.observacao = observacao;
		this.prntAtivo = prntAtivo;
		this.cadConfirmado = cadConfirmado;
		this.indGeraProntuario = indGeraProntuario;
		this.dtUltInternacao = dtUltInternacao;
		this.dtUltAlta = dtUltAlta;
		this.dtUltConsulta = dtUltConsulta;
		this.dtUltProcedimento = dtUltProcedimento;
		this.dtUltAtendHospDia = dtUltAtendHospDia;
		this.dtUltAltaHospDia = dtUltAltaHospDia;
		this.qrtNumero = qrtNumero;
		this.unfSeq = unfSeq;
		this.ltoLtoId = ltoLtoId;
		this.regNascimento = regNascimento;
		this.nroCartaoSaude = nroCartaoSaude;
		this.dtRecadastro = dtRecadastro;
		this.indPacienteVip = indPacienteVip;
		this.pacCodigoMae = pacCodigoMae;
		this.tipoDataObito = tipoDataObito;
		this.dtObitoExterno = dtObitoExterno;
		this.rnaGsoPacCodigo = rnaGsoPacCodigo;
		this.rnaGsoSeqp = rnaGsoSeqp;
		this.rnaSeqp = rnaSeqp;
		this.numeroPis = numeroPis;
		this.volumes = volumes;
		this.indPacProtegido = indPacProtegido;
		this.criadoEm = criadoEm;
		this.indPacAgfa = indPacAgfa;
		this.sexoBiologico = sexoBiologico;
	}

	@Id
	@Column(name = "CODIGO", unique = true, nullable = false)
	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Column(name = "CCT_CODIGO_CADASTRO", nullable = false)
	public Integer getCctCodigoCadastro() {
		return this.cctCodigoCadastro;
	}

	public void setCctCodigoCadastro(Integer cctCodigoCadastro) {
		this.cctCodigoCadastro = cctCodigoCadastro;
	}

	@Column(name = "SER_MATRICULA_CADASTRO", nullable = false)
	public Integer getSerMatriculaCadastro() {
		return this.serMatriculaCadastro;
	}

	public void setSerMatriculaCadastro(Integer serMatriculaCadastro) {
		this.serMatriculaCadastro = serMatriculaCadastro;
	}

	@Column(name = "SER_VIN_CODIGO_CADASTRO", nullable = false)
	public Short getSerVinCodigoCadastro() {
		return this.serVinCodigoCadastro;
	}

	public void setSerVinCodigoCadastro(Short serVinCodigoCadastro) {
		this.serVinCodigoCadastro = serVinCodigoCadastro;
	}

	@Column(name = "NOME", nullable = false, length = 50)
	@Length(max = 50)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "NOME_MAE", nullable = false, length = 50)
	@Length(max = 50)
	public String getNomeMae() {
		return this.nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_NASCIMENTO", nullable = false, length = 29)
	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_IDENTIFICACAO", nullable = false, length = 29)
	public Date getDtIdentificacao() {
		return this.dtIdentificacao;
	}

	public void setDtIdentificacao(Date dtIdentificacao) {
		this.dtIdentificacao = dtIdentificacao;
	}

	@Column(name = "CCT_CODIGO_RECADASTRO")
	public Integer getCctCodigoRecadastro() {
		return this.cctCodigoRecadastro;
	}

	public void setCctCodigoRecadastro(Integer cctCodigoRecadastro) {
		this.cctCodigoRecadastro = cctCodigoRecadastro;
	}

	@Column(name = "CDD_CODIGO")
	public Integer getCddCodigo() {
		return this.cddCodigo;
	}

	public void setCddCodigo(Integer cddCodigo) {
		this.cddCodigo = cddCodigo;
	}

	@Column(name = "NAC_CODIGO")
	public Short getNacCodigo() {
		return this.nacCodigo;
	}

	public void setNacCodigo(Short nacCodigo) {
		this.nacCodigo = nacCodigo;
	}

	@Column(name = "OCP_CODIGO")
	public Integer getOcpCodigo() {
		return this.ocpCodigo;
	}

	public void setOcpCodigo(Integer ocpCodigo) {
		this.ocpCodigo = ocpCodigo;
	}

	@Column(name = "UF_SIGLA", length = 2)
	@Length(max = 2)
	public String getUfSigla() {
		return this.ufSigla;
	}

	public void setUfSigla(String ufSigla) {
		this.ufSigla = ufSigla;
	}

	@Column(name = "SER_MATRICULA_RECADASTRO")
	public Integer getSerMatriculaRecadastro() {
		return this.serMatriculaRecadastro;
	}

	public void setSerMatriculaRecadastro(Integer serMatriculaRecadastro) {
		this.serMatriculaRecadastro = serMatriculaRecadastro;
	}

	@Column(name = "SER_VIN_CODIGO_RECADASTRO")
	public Short getSerVinCodigoRecadastro() {
		return this.serVinCodigoRecadastro;
	}

	public void setSerVinCodigoRecadastro(Short serVinCodigoRecadastro) {
		this.serVinCodigoRecadastro = serVinCodigoRecadastro;
	}

	@Column(name = "COR", length = 1)
	@Length(max = 1)
	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Column(name = "SEXO", length = 1)
	@Length(max = 1)
	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Column(name = "GRAU_INSTRUCAO")
	public Short getGrauInstrucao() {
		return this.grauInstrucao;
	}

	public void setGrauInstrucao(Short grauInstrucao) {
		this.grauInstrucao = grauInstrucao;
	}

	@Column(name = "NOME_PAI", length = 50)
	@Length(max = 50)
	public String getNomePai() {
		return this.nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	@Column(name = "NATURALIDADE", length = 25)
	@Length(max = 25)
	public String getNaturalidade() {
		return this.naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	@Column(name = "DDD_FONE_RESIDENCIAL")
	public Short getDddFoneResidencial() {
		return this.dddFoneResidencial;
	}

	public void setDddFoneResidencial(Short dddFoneResidencial) {
		this.dddFoneResidencial = dddFoneResidencial;
	}

	@Column(name = "FONE_RESIDENCIAL")
	public Integer getFoneResidencial() {
		return this.foneResidencial;
	}

	public void setFoneResidencial(Integer foneResidencial) {
		this.foneResidencial = foneResidencial;
	}

	@Column(name = "DDD_FONE_RECADO")
	public Short getDddFoneRecado() {
		return this.dddFoneRecado;
	}

	public void setDddFoneRecado(Short dddFoneRecado) {
		this.dddFoneRecado = dddFoneRecado;
	}

	@Column(name = "FONE_RECADO", length = 15)
	@Length(max = 15)
	public String getFoneRecado() {
		return this.foneRecado;
	}

	public void setFoneRecado(String foneRecado) {
		this.foneRecado = foneRecado;
	}

	@Column(name = "ESTADO_CIVIL", length = 1)
	@Length(max = 1)
	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Column(name = "CPF")
	public Long getCpf() {
		return this.cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	@Column(name = "PRONTUARIO", unique = true)
	public Integer getProntuario() {
		return this.prontuario;
	}

	public void setProntuario(Integer prontuario) {
		this.prontuario = prontuario;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_OBITO", length = 29)
	public Date getDtObito() {
		return this.dtObito;
	}

	public void setDtObito(Date dtObito) {
		this.dtObito = dtObito;
	}

	@Column(name = "RG")
	public Long getRg() {
		return this.rg;
	}

	public void setRg(Long rg) {
		this.rg = rg;
	}

	@Column(name = "ORGAO_EMIS_RG", length = 10)
	@Length(max = 10)
	public String getOrgaoEmisRg() {
		return this.orgaoEmisRg;
	}

	public void setOrgaoEmisRg(String orgaoEmisRg) {
		this.orgaoEmisRg = orgaoEmisRg;
	}

	@Column(name = "OBSERVACAO", length = 240)
	@Length(max = 240)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "PRNT_ATIVO", length = 1)
	@Length(max = 1)
	public String getPrntAtivo() {
		return this.prntAtivo;
	}

	public void setPrntAtivo(String prntAtivo) {
		this.prntAtivo = prntAtivo;
	}

	@Column(name = "CAD_CONFIRMADO", nullable = false, length = 1)
	@Length(max = 1)
	public String getCadConfirmado() {
		return this.cadConfirmado;
	}

	public void setCadConfirmado(String cadConfirmado) {
		this.cadConfirmado = cadConfirmado;
	}

	@Column(name = "IND_GERA_PRONTUARIO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndGeraProntuario() {
		return this.indGeraProntuario;
	}

	public void setIndGeraProntuario(String indGeraProntuario) {
		this.indGeraProntuario = indGeraProntuario;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ULT_INTERNACAO", length = 29)
	public Date getDtUltInternacao() {
		return this.dtUltInternacao;
	}

	public void setDtUltInternacao(Date dtUltInternacao) {
		this.dtUltInternacao = dtUltInternacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ULT_ALTA", length = 29)
	public Date getDtUltAlta() {
		return this.dtUltAlta;
	}

	public void setDtUltAlta(Date dtUltAlta) {
		this.dtUltAlta = dtUltAlta;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ULT_CONSULTA", length = 29)
	public Date getDtUltConsulta() {
		return this.dtUltConsulta;
	}

	public void setDtUltConsulta(Date dtUltConsulta) {
		this.dtUltConsulta = dtUltConsulta;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ULT_PROCEDIMENTO", length = 29)
	public Date getDtUltProcedimento() {
		return this.dtUltProcedimento;
	}

	public void setDtUltProcedimento(Date dtUltProcedimento) {
		this.dtUltProcedimento = dtUltProcedimento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ULT_ATEND_HOSP_DIA", length = 29)
	public Date getDtUltAtendHospDia() {
		return this.dtUltAtendHospDia;
	}

	public void setDtUltAtendHospDia(Date dtUltAtendHospDia) {
		this.dtUltAtendHospDia = dtUltAtendHospDia;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ULT_ALTA_HOSP_DIA", length = 29)
	public Date getDtUltAltaHospDia() {
		return this.dtUltAltaHospDia;
	}

	public void setDtUltAltaHospDia(Date dtUltAltaHospDia) {
		this.dtUltAltaHospDia = dtUltAltaHospDia;
	}

	@Column(name = "QRT_NUMERO")
	public Short getQrtNumero() {
		return this.qrtNumero;
	}

	public void setQrtNumero(Short qrtNumero) {
		this.qrtNumero = qrtNumero;
	}

	@Column(name = "UNF_SEQ")
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "LTO_LTO_ID", length = 5)
	@Length(max = 5)
	public String getLtoLtoId() {
		return this.ltoLtoId;
	}

	public void setLtoLtoId(String ltoLtoId) {
		this.ltoLtoId = ltoLtoId;
	}

	@Column(name = "REG_NASCIMENTO")
	public Long getRegNascimento() {
		return this.regNascimento;
	}

	public void setRegNascimento(Long regNascimento) {
		this.regNascimento = regNascimento;
	}

	@Column(name = "NRO_CARTAO_SAUDE")
	public Long getNroCartaoSaude() {
		return this.nroCartaoSaude;
	}

	public void setNroCartaoSaude(Long nroCartaoSaude) {
		this.nroCartaoSaude = nroCartaoSaude;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_RECADASTRO", length = 29)
	public Date getDtRecadastro() {
		return this.dtRecadastro;
	}

	public void setDtRecadastro(Date dtRecadastro) {
		this.dtRecadastro = dtRecadastro;
	}

	@Column(name = "IND_PACIENTE_VIP", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndPacienteVip() {
		return this.indPacienteVip;
	}

	public void setIndPacienteVip(String indPacienteVip) {
		this.indPacienteVip = indPacienteVip;
	}

	@Column(name = "PAC_CODIGO_MAE")
	public Integer getPacCodigoMae() {
		return this.pacCodigoMae;
	}

	public void setPacCodigoMae(Integer pacCodigoMae) {
		this.pacCodigoMae = pacCodigoMae;
	}

	@Column(name = "TIPO_DATA_OBITO", length = 3)
	@Length(max = 3)
	public String getTipoDataObito() {
		return this.tipoDataObito;
	}

	public void setTipoDataObito(String tipoDataObito) {
		this.tipoDataObito = tipoDataObito;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_OBITO_EXTERNO", length = 29)
	public Date getDtObitoExterno() {
		return this.dtObitoExterno;
	}

	public void setDtObitoExterno(Date dtObitoExterno) {
		this.dtObitoExterno = dtObitoExterno;
	}

	@Column(name = "RNA_GSO_PAC_CODIGO")
	public Integer getRnaGsoPacCodigo() {
		return this.rnaGsoPacCodigo;
	}

	public void setRnaGsoPacCodigo(Integer rnaGsoPacCodigo) {
		this.rnaGsoPacCodigo = rnaGsoPacCodigo;
	}

	@Column(name = "RNA_GSO_SEQP")
	public Short getRnaGsoSeqp() {
		return this.rnaGsoSeqp;
	}

	public void setRnaGsoSeqp(Short rnaGsoSeqp) {
		this.rnaGsoSeqp = rnaGsoSeqp;
	}

	@Column(name = "RNA_SEQP")
	public Short getRnaSeqp() {
		return this.rnaSeqp;
	}

	public void setRnaSeqp(Short rnaSeqp) {
		this.rnaSeqp = rnaSeqp;
	}

	@Column(name = "NUMERO_PIS")
	public Long getNumeroPis() {
		return this.numeroPis;
	}

	public void setNumeroPis(Long numeroPis) {
		this.numeroPis = numeroPis;
	}

	@Column(name = "VOLUMES")
	public Short getVolumes() {
		return this.volumes;
	}

	public void setVolumes(Short volumes) {
		this.volumes = volumes;
	}

	@Column(name = "IND_PAC_PROTEGIDO", length = 1)
	@Length(max = 1)
	public String getIndPacProtegido() {
		return this.indPacProtegido;
	}

	public void setIndPacProtegido(String indPacProtegido) {
		this.indPacProtegido = indPacProtegido;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_PAC_AGFA", length = 1)
	@Length(max = 1)
	public String getIndPacAgfa() {
		return this.indPacAgfa;
	}

	public void setIndPacAgfa(String indPacAgfa) {
		this.indPacAgfa = indPacAgfa;
	}

	@Column(name = "SEXO_BIOLOGICO", length = 1)
	@Length(max = 1)
	public String getSexoBiologico() {
		return this.sexoBiologico;
	}

	public void setSexoBiologico(String sexoBiologico) {
		this.sexoBiologico = sexoBiologico;
	}

	public enum Fields {

		CODIGO("codigo"),
		CCT_CODIGO_CADASTRO("cctCodigoCadastro"),
		SER_MATRICULA_CADASTRO("serMatriculaCadastro"),
		SER_VIN_CODIGO_CADASTRO("serVinCodigoCadastro"),
		NOME("nome"),
		NOME_MAE("nomeMae"),
		DT_NASCIMENTO("dtNascimento"),
		DT_IDENTIFICACAO("dtIdentificacao"),
		CCT_CODIGO_RECADASTRO("cctCodigoRecadastro"),
		CDD_CODIGO("cddCodigo"),
		NAC_CODIGO("nacCodigo"),
		OCP_CODIGO("ocpCodigo"),
		UF_SIGLA("ufSigla"),
		SER_MATRICULA_RECADASTRO("serMatriculaRecadastro"),
		SER_VIN_CODIGO_RECADASTRO("serVinCodigoRecadastro"),
		COR("cor"),
		SEXO("sexo"),
		GRAU_INSTRUCAO("grauInstrucao"),
		NOME_PAI("nomePai"),
		NATURALIDADE("naturalidade"),
		DDD_FONE_RESIDENCIAL("dddFoneResidencial"),
		FONE_RESIDENCIAL("foneResidencial"),
		DDD_FONE_RECADO("dddFoneRecado"),
		FONE_RECADO("foneRecado"),
		ESTADO_CIVIL("estadoCivil"),
		CPF("cpf"),
		PRONTUARIO("prontuario"),
		DT_OBITO("dtObito"),
		RG("rg"),
		ORGAO_EMIS_RG("orgaoEmisRg"),
		OBSERVACAO("observacao"),
		PRNT_ATIVO("prntAtivo"),
		CAD_CONFIRMADO("cadConfirmado"),
		IND_GERA_PRONTUARIO("indGeraProntuario"),
		DT_ULT_INTERNACAO("dtUltInternacao"),
		DT_ULT_ALTA("dtUltAlta"),
		DT_ULT_CONSULTA("dtUltConsulta"),
		DT_ULT_PROCEDIMENTO("dtUltProcedimento"),
		DT_ULT_ATEND_HOSP_DIA("dtUltAtendHospDia"),
		DT_ULT_ALTA_HOSP_DIA("dtUltAltaHospDia"),
		QRT_NUMERO("qrtNumero"),
		UNF_SEQ("unfSeq"),
		LTO_LTO_ID("ltoLtoId"),
		REG_NASCIMENTO("regNascimento"),
		NRO_CARTAO_SAUDE("nroCartaoSaude"),
		DT_RECADASTRO("dtRecadastro"),
		IND_PACIENTE_VIP("indPacienteVip"),
		PAC_CODIGO_MAE("pacCodigoMae"),
		TIPO_DATA_OBITO("tipoDataObito"),
		DT_OBITO_EXTERNO("dtObitoExterno"),
		RNA_GSO_PAC_CODIGO("rnaGsoPacCodigo"),
		RNA_GSO_SEQP("rnaGsoSeqp"),
		RNA_SEQP("rnaSeqp"),
		NUMERO_PIS("numeroPis"),
		VOLUMES("volumes"),
		IND_PAC_PROTEGIDO("indPacProtegido"),
		CRIADO_EM("criadoEm"),
		IND_PAC_AGFA("indPacAgfa"),
		SEXO_BIOLOGICO("sexoBiologico");

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
		if (!(obj instanceof MvaipPaciente)) {
			return false;
		}
		MvaipPaciente other = (MvaipPaciente) obj;
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
