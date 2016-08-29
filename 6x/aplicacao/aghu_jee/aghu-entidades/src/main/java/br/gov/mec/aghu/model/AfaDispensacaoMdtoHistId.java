package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AfaDispensacaoMdtoHistId generated by hbm2java
 */
@Embeddable
public class AfaDispensacaoMdtoHistId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8291516812362501853L;
	private Integer pmeAtdSeq;
	private Integer pmeSeq;
	private Integer imePmdAtdSeq;
	private Integer imePmdSeq;
	private Integer imeMedMatCodigo;
	private Short imeSeqp;
	private Long seq;
	private Integer medMatCodigo;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Integer serMatriculaEntregue;
	private Short serVinCodigoEntregue;
	private Date criadoEm;
	private Double qtdeDispensada;
	private String indSituacao;
	private Short todSeq;
	private Short unfSeq;
	private Date dthrEntrega;
	private Double qtdeSolicitada;
	private Date dthrDispensacao;
	private Date dthrConferencia;
	private Integer serMatriculaConferida;
	private Short serVinCodigoConferida;
	private Short unfSeqSolicitante;
	private String indSitItemPrescrito;
	private Integer dsmPmeAtdSeq;
	private Integer dsmPmeSeq;
	private Integer dsmImePmdAtdSeq;
	private Integer dsmImePmdSeq;
	private Integer dsmImeMedMatCodigo;
	private Short dsmImeSeqp;
	private Long dsmSeq;
	private String nomeEstacaoDisp;
	private Double qtdeEstornada;
	private Date dthrEstorno;
	private Integer serMatriculaEstornado;
	private Short serVinCodigoEstornado;
	private Short todSeqEstornado;
	private Integer cpoItoPtoSeq;
	private Short cpoItoSeqp;
	private Short cpoSeqp;
	private Integer imoPmoPteAtdSeq;
	private Integer imoPmoPteSeq;
	private Integer imoPmoSeq;
	private Short imoSeqp;
	private Integer atdSeq;
	private Date dthrTriado;
	private Integer serMatriculaTriadoPor;
	private Short serVinCodigoTriadoPor;
	private Integer version;

	public AfaDispensacaoMdtoHistId() {
	}

	public AfaDispensacaoMdtoHistId(Integer version) {
		this.version = version;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public AfaDispensacaoMdtoHistId(Integer pmeAtdSeq, Integer pmeSeq, Integer imePmdAtdSeq, Integer imePmdSeq,
			Integer imeMedMatCodigo, Short imeSeqp, Long seq, Integer medMatCodigo, Integer serMatricula, Short serVinCodigo,
			Integer serMatriculaEntregue, Short serVinCodigoEntregue, Date criadoEm, Double qtdeDispensada, String indSituacao,
			Short todSeq, Short unfSeq, Date dthrEntrega, Double qtdeSolicitada, Date dthrDispensacao, Date dthrConferencia,
			Integer serMatriculaConferida, Short serVinCodigoConferida, Short unfSeqSolicitante, String indSitItemPrescrito,
			Integer dsmPmeAtdSeq, Integer dsmPmeSeq, Integer dsmImePmdAtdSeq, Integer dsmImePmdSeq, Integer dsmImeMedMatCodigo,
			Short dsmImeSeqp, Long dsmSeq, String nomeEstacaoDisp, Double qtdeEstornada, Date dthrEstorno,
			Integer serMatriculaEstornado, Short serVinCodigoEstornado, Short todSeqEstornado, Integer cpoItoPtoSeq, Short cpoItoSeqp,
			Short cpoSeqp, Integer imoPmoPteAtdSeq, Integer imoPmoPteSeq, Integer imoPmoSeq, Short imoSeqp, Integer atdSeq,
			Date dthrTriado, Integer serMatriculaTriadoPor, Short serVinCodigoTriadoPor, Integer version) {
		this.pmeAtdSeq = pmeAtdSeq;
		this.pmeSeq = pmeSeq;
		this.imePmdAtdSeq = imePmdAtdSeq;
		this.imePmdSeq = imePmdSeq;
		this.imeMedMatCodigo = imeMedMatCodigo;
		this.imeSeqp = imeSeqp;
		this.seq = seq;
		this.medMatCodigo = medMatCodigo;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.serMatriculaEntregue = serMatriculaEntregue;
		this.serVinCodigoEntregue = serVinCodigoEntregue;
		this.criadoEm = criadoEm;
		this.qtdeDispensada = qtdeDispensada;
		this.indSituacao = indSituacao;
		this.todSeq = todSeq;
		this.unfSeq = unfSeq;
		this.dthrEntrega = dthrEntrega;
		this.qtdeSolicitada = qtdeSolicitada;
		this.dthrDispensacao = dthrDispensacao;
		this.dthrConferencia = dthrConferencia;
		this.serMatriculaConferida = serMatriculaConferida;
		this.serVinCodigoConferida = serVinCodigoConferida;
		this.unfSeqSolicitante = unfSeqSolicitante;
		this.indSitItemPrescrito = indSitItemPrescrito;
		this.dsmPmeAtdSeq = dsmPmeAtdSeq;
		this.dsmPmeSeq = dsmPmeSeq;
		this.dsmImePmdAtdSeq = dsmImePmdAtdSeq;
		this.dsmImePmdSeq = dsmImePmdSeq;
		this.dsmImeMedMatCodigo = dsmImeMedMatCodigo;
		this.dsmImeSeqp = dsmImeSeqp;
		this.dsmSeq = dsmSeq;
		this.nomeEstacaoDisp = nomeEstacaoDisp;
		this.qtdeEstornada = qtdeEstornada;
		this.dthrEstorno = dthrEstorno;
		this.serMatriculaEstornado = serMatriculaEstornado;
		this.serVinCodigoEstornado = serVinCodigoEstornado;
		this.todSeqEstornado = todSeqEstornado;
		this.cpoItoPtoSeq = cpoItoPtoSeq;
		this.cpoItoSeqp = cpoItoSeqp;
		this.cpoSeqp = cpoSeqp;
		this.imoPmoPteAtdSeq = imoPmoPteAtdSeq;
		this.imoPmoPteSeq = imoPmoPteSeq;
		this.imoPmoSeq = imoPmoSeq;
		this.imoSeqp = imoSeqp;
		this.atdSeq = atdSeq;
		this.dthrTriado = dthrTriado;
		this.serMatriculaTriadoPor = serMatriculaTriadoPor;
		this.serVinCodigoTriadoPor = serVinCodigoTriadoPor;
		this.version = version;
	}

	@Column(name = "PME_ATD_SEQ")
	public Integer getPmeAtdSeq() {
		return this.pmeAtdSeq;
	}

	public void setPmeAtdSeq(Integer pmeAtdSeq) {
		this.pmeAtdSeq = pmeAtdSeq;
	}

	@Column(name = "PME_SEQ")
	public Integer getPmeSeq() {
		return this.pmeSeq;
	}

	public void setPmeSeq(Integer pmeSeq) {
		this.pmeSeq = pmeSeq;
	}

	@Column(name = "IME_PMD_ATD_SEQ")
	public Integer getImePmdAtdSeq() {
		return this.imePmdAtdSeq;
	}

	public void setImePmdAtdSeq(Integer imePmdAtdSeq) {
		this.imePmdAtdSeq = imePmdAtdSeq;
	}

	@Column(name = "IME_PMD_SEQ")
	public Integer getImePmdSeq() {
		return this.imePmdSeq;
	}

	public void setImePmdSeq(Integer imePmdSeq) {
		this.imePmdSeq = imePmdSeq;
	}

	@Column(name = "IME_MED_MAT_CODIGO")
	public Integer getImeMedMatCodigo() {
		return this.imeMedMatCodigo;
	}

	public void setImeMedMatCodigo(Integer imeMedMatCodigo) {
		this.imeMedMatCodigo = imeMedMatCodigo;
	}

	@Column(name = "IME_SEQP")
	public Short getImeSeqp() {
		return this.imeSeqp;
	}

	public void setImeSeqp(Short imeSeqp) {
		this.imeSeqp = imeSeqp;
	}

	@Column(name = "SEQ")
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@Column(name = "MED_MAT_CODIGO")
	public Integer getMedMatCodigo() {
		return this.medMatCodigo;
	}

	public void setMedMatCodigo(Integer medMatCodigo) {
		this.medMatCodigo = medMatCodigo;
	}

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "SER_MATRICULA_ENTREGUE")
	public Integer getSerMatriculaEntregue() {
		return this.serMatriculaEntregue;
	}

	public void setSerMatriculaEntregue(Integer serMatriculaEntregue) {
		this.serMatriculaEntregue = serMatriculaEntregue;
	}

	@Column(name = "SER_VIN_CODIGO_ENTREGUE")
	public Short getSerVinCodigoEntregue() {
		return this.serVinCodigoEntregue;
	}

	public void setSerVinCodigoEntregue(Short serVinCodigoEntregue) {
		this.serVinCodigoEntregue = serVinCodigoEntregue;
	}

	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "QTDE_DISPENSADA", precision = 17, scale = 17)
	public Double getQtdeDispensada() {
		return this.qtdeDispensada;
	}

	public void setQtdeDispensada(Double qtdeDispensada) {
		this.qtdeDispensada = qtdeDispensada;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "TOD_SEQ")
	public Short getTodSeq() {
		return this.todSeq;
	}

	public void setTodSeq(Short todSeq) {
		this.todSeq = todSeq;
	}

	@Column(name = "UNF_SEQ")
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "DTHR_ENTREGA", length = 29)
	public Date getDthrEntrega() {
		return this.dthrEntrega;
	}

	public void setDthrEntrega(Date dthrEntrega) {
		this.dthrEntrega = dthrEntrega;
	}

	@Column(name = "QTDE_SOLICITADA", precision = 17, scale = 17)
	public Double getQtdeSolicitada() {
		return this.qtdeSolicitada;
	}

	public void setQtdeSolicitada(Double qtdeSolicitada) {
		this.qtdeSolicitada = qtdeSolicitada;
	}

	@Column(name = "DTHR_DISPENSACAO", length = 29)
	public Date getDthrDispensacao() {
		return this.dthrDispensacao;
	}

	public void setDthrDispensacao(Date dthrDispensacao) {
		this.dthrDispensacao = dthrDispensacao;
	}

	@Column(name = "DTHR_CONFERENCIA", length = 29)
	public Date getDthrConferencia() {
		return this.dthrConferencia;
	}

	public void setDthrConferencia(Date dthrConferencia) {
		this.dthrConferencia = dthrConferencia;
	}

	@Column(name = "SER_MATRICULA_CONFERIDA")
	public Integer getSerMatriculaConferida() {
		return this.serMatriculaConferida;
	}

	public void setSerMatriculaConferida(Integer serMatriculaConferida) {
		this.serMatriculaConferida = serMatriculaConferida;
	}

	@Column(name = "SER_VIN_CODIGO_CONFERIDA")
	public Short getSerVinCodigoConferida() {
		return this.serVinCodigoConferida;
	}

	public void setSerVinCodigoConferida(Short serVinCodigoConferida) {
		this.serVinCodigoConferida = serVinCodigoConferida;
	}

	@Column(name = "UNF_SEQ_SOLICITANTE")
	public Short getUnfSeqSolicitante() {
		return this.unfSeqSolicitante;
	}

	public void setUnfSeqSolicitante(Short unfSeqSolicitante) {
		this.unfSeqSolicitante = unfSeqSolicitante;
	}

	@Column(name = "IND_SIT_ITEM_PRESCRITO", length = 2)
	@Length(max = 2)
	public String getIndSitItemPrescrito() {
		return this.indSitItemPrescrito;
	}

	public void setIndSitItemPrescrito(String indSitItemPrescrito) {
		this.indSitItemPrescrito = indSitItemPrescrito;
	}

	@Column(name = "DSM_PME_ATD_SEQ")
	public Integer getDsmPmeAtdSeq() {
		return this.dsmPmeAtdSeq;
	}

	public void setDsmPmeAtdSeq(Integer dsmPmeAtdSeq) {
		this.dsmPmeAtdSeq = dsmPmeAtdSeq;
	}

	@Column(name = "DSM_PME_SEQ")
	public Integer getDsmPmeSeq() {
		return this.dsmPmeSeq;
	}

	public void setDsmPmeSeq(Integer dsmPmeSeq) {
		this.dsmPmeSeq = dsmPmeSeq;
	}

	@Column(name = "DSM_IME_PMD_ATD_SEQ")
	public Integer getDsmImePmdAtdSeq() {
		return this.dsmImePmdAtdSeq;
	}

	public void setDsmImePmdAtdSeq(Integer dsmImePmdAtdSeq) {
		this.dsmImePmdAtdSeq = dsmImePmdAtdSeq;
	}

	@Column(name = "DSM_IME_PMD_SEQ")
	public Integer getDsmImePmdSeq() {
		return this.dsmImePmdSeq;
	}

	public void setDsmImePmdSeq(Integer dsmImePmdSeq) {
		this.dsmImePmdSeq = dsmImePmdSeq;
	}

	@Column(name = "DSM_IME_MED_MAT_CODIGO")
	public Integer getDsmImeMedMatCodigo() {
		return this.dsmImeMedMatCodigo;
	}

	public void setDsmImeMedMatCodigo(Integer dsmImeMedMatCodigo) {
		this.dsmImeMedMatCodigo = dsmImeMedMatCodigo;
	}

	@Column(name = "DSM_IME_SEQP")
	public Short getDsmImeSeqp() {
		return this.dsmImeSeqp;
	}

	public void setDsmImeSeqp(Short dsmImeSeqp) {
		this.dsmImeSeqp = dsmImeSeqp;
	}

	@Column(name = "DSM_SEQ")
	public Long getDsmSeq() {
		return this.dsmSeq;
	}

	public void setDsmSeq(Long dsmSeq) {
		this.dsmSeq = dsmSeq;
	}

	@Column(name = "NOME_ESTACAO_DISP", length = 64)
	@Length(max = 64)
	public String getNomeEstacaoDisp() {
		return this.nomeEstacaoDisp;
	}

	public void setNomeEstacaoDisp(String nomeEstacaoDisp) {
		this.nomeEstacaoDisp = nomeEstacaoDisp;
	}

	@Column(name = "QTDE_ESTORNADA", precision = 17, scale = 17)
	public Double getQtdeEstornada() {
		return this.qtdeEstornada;
	}

	public void setQtdeEstornada(Double qtdeEstornada) {
		this.qtdeEstornada = qtdeEstornada;
	}

	@Column(name = "DTHR_ESTORNO", length = 29)
	public Date getDthrEstorno() {
		return this.dthrEstorno;
	}

	public void setDthrEstorno(Date dthrEstorno) {
		this.dthrEstorno = dthrEstorno;
	}

	@Column(name = "SER_MATRICULA_ESTORNADO")
	public Integer getSerMatriculaEstornado() {
		return this.serMatriculaEstornado;
	}

	public void setSerMatriculaEstornado(Integer serMatriculaEstornado) {
		this.serMatriculaEstornado = serMatriculaEstornado;
	}

	@Column(name = "SER_VIN_CODIGO_ESTORNADO")
	public Short getSerVinCodigoEstornado() {
		return this.serVinCodigoEstornado;
	}

	public void setSerVinCodigoEstornado(Short serVinCodigoEstornado) {
		this.serVinCodigoEstornado = serVinCodigoEstornado;
	}

	@Column(name = "TOD_SEQ_ESTORNADO")
	public Short getTodSeqEstornado() {
		return this.todSeqEstornado;
	}

	public void setTodSeqEstornado(Short todSeqEstornado) {
		this.todSeqEstornado = todSeqEstornado;
	}

	@Column(name = "CPO_ITO_PTO_SEQ")
	public Integer getCpoItoPtoSeq() {
		return this.cpoItoPtoSeq;
	}

	public void setCpoItoPtoSeq(Integer cpoItoPtoSeq) {
		this.cpoItoPtoSeq = cpoItoPtoSeq;
	}

	@Column(name = "CPO_ITO_SEQP")
	public Short getCpoItoSeqp() {
		return this.cpoItoSeqp;
	}

	public void setCpoItoSeqp(Short cpoItoSeqp) {
		this.cpoItoSeqp = cpoItoSeqp;
	}

	@Column(name = "CPO_SEQP")
	public Short getCpoSeqp() {
		return this.cpoSeqp;
	}

	public void setCpoSeqp(Short cpoSeqp) {
		this.cpoSeqp = cpoSeqp;
	}

	@Column(name = "IMO_PMO_PTE_ATD_SEQ")
	public Integer getImoPmoPteAtdSeq() {
		return this.imoPmoPteAtdSeq;
	}

	public void setImoPmoPteAtdSeq(Integer imoPmoPteAtdSeq) {
		this.imoPmoPteAtdSeq = imoPmoPteAtdSeq;
	}

	@Column(name = "IMO_PMO_PTE_SEQ")
	public Integer getImoPmoPteSeq() {
		return this.imoPmoPteSeq;
	}

	public void setImoPmoPteSeq(Integer imoPmoPteSeq) {
		this.imoPmoPteSeq = imoPmoPteSeq;
	}

	@Column(name = "IMO_PMO_SEQ")
	public Integer getImoPmoSeq() {
		return this.imoPmoSeq;
	}

	public void setImoPmoSeq(Integer imoPmoSeq) {
		this.imoPmoSeq = imoPmoSeq;
	}

	@Column(name = "IMO_SEQP")
	public Short getImoSeqp() {
		return this.imoSeqp;
	}

	public void setImoSeqp(Short imoSeqp) {
		this.imoSeqp = imoSeqp;
	}

	@Column(name = "ATD_SEQ")
	public Integer getAtdSeq() {
		return this.atdSeq;
	}

	public void setAtdSeq(Integer atdSeq) {
		this.atdSeq = atdSeq;
	}

	@Column(name = "DTHR_TRIADO", length = 29)
	public Date getDthrTriado() {
		return this.dthrTriado;
	}

	public void setDthrTriado(Date dthrTriado) {
		this.dthrTriado = dthrTriado;
	}

	@Column(name = "SER_MATRICULA_TRIADO_POR")
	public Integer getSerMatriculaTriadoPor() {
		return this.serMatriculaTriadoPor;
	}

	public void setSerMatriculaTriadoPor(Integer serMatriculaTriadoPor) {
		this.serMatriculaTriadoPor = serMatriculaTriadoPor;
	}

	@Column(name = "SER_VIN_CODIGO_TRIADO_POR")
	public Short getSerVinCodigoTriadoPor() {
		return this.serVinCodigoTriadoPor;
	}

	public void setSerVinCodigoTriadoPor(Short serVinCodigoTriadoPor) {
		this.serVinCodigoTriadoPor = serVinCodigoTriadoPor;
	}

	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCriadoEm());
		umHashCodeBuilder.append(this.getSerMatricula());
		umHashCodeBuilder.append(this.getSerVinCodigo());
		umHashCodeBuilder.append(this.getUnfSeq());
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getSeq());
		umHashCodeBuilder.append(this.getIndSituacao());
		umHashCodeBuilder.append(this.getAtdSeq());
		umHashCodeBuilder.append(this.getMedMatCodigo());
		umHashCodeBuilder.append(this.getQtdeSolicitada());
		umHashCodeBuilder.append(this.getSerMatriculaEstornado());
		umHashCodeBuilder.append(this.getSerVinCodigoEstornado());
		umHashCodeBuilder.append(this.getDthrEstorno());
		umHashCodeBuilder.append(this.getImePmdAtdSeq());
		umHashCodeBuilder.append(this.getImePmdSeq());
		umHashCodeBuilder.append(this.getImeMedMatCodigo());
		umHashCodeBuilder.append(this.getImeSeqp());
		umHashCodeBuilder.append(this.getPmeAtdSeq());
		umHashCodeBuilder.append(this.getPmeSeq());
		umHashCodeBuilder.append(this.getImoPmoPteAtdSeq());
		umHashCodeBuilder.append(this.getImoPmoPteSeq());
		umHashCodeBuilder.append(this.getImoPmoSeq());
		umHashCodeBuilder.append(this.getImoSeqp());
		umHashCodeBuilder.append(this.getQtdeDispensada());
		umHashCodeBuilder.append(this.getDthrEntrega());
		umHashCodeBuilder.append(this.getDthrDispensacao());
		umHashCodeBuilder.append(this.getDthrConferencia());
		umHashCodeBuilder.append(this.getIndSitItemPrescrito());
		umHashCodeBuilder.append(this.getDsmPmeAtdSeq());
		umHashCodeBuilder.append(this.getDsmPmeSeq());
		umHashCodeBuilder.append(this.getDsmImePmdAtdSeq());
		umHashCodeBuilder.append(this.getDsmImePmdSeq());
		umHashCodeBuilder.append(this.getDsmImeMedMatCodigo());
		umHashCodeBuilder.append(this.getDsmImeSeqp());
		umHashCodeBuilder.append(this.getDsmSeq());
		umHashCodeBuilder.append(this.getNomeEstacaoDisp());
		umHashCodeBuilder.append(this.getQtdeEstornada());
		umHashCodeBuilder.append(this.getCpoItoPtoSeq());
		umHashCodeBuilder.append(this.getCpoItoSeqp());
		umHashCodeBuilder.append(this.getCpoSeqp());
		umHashCodeBuilder.append(this.getDthrTriado());
		umHashCodeBuilder.append(this.getUnfSeqSolicitante());
		umHashCodeBuilder.append(this.getSerMatriculaEntregue());
		umHashCodeBuilder.append(this.getSerVinCodigoEntregue());
		umHashCodeBuilder.append(this.getTodSeq());
		umHashCodeBuilder.append(this.getSerMatriculaConferida());
		umHashCodeBuilder.append(this.getSerVinCodigoConferida());
		umHashCodeBuilder.append(this.getTodSeqEstornado());
		umHashCodeBuilder.append(this.getSerMatriculaTriadoPor());
		umHashCodeBuilder.append(this.getSerVinCodigoTriadoPor());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AfaDispensacaoMdtoHistId)) {
			return false;
		}
		AfaDispensacaoMdtoHistId other = (AfaDispensacaoMdtoHistId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCriadoEm(), other.getCriadoEm());
		umEqualsBuilder.append(this.getSerMatricula(), other.getSerMatricula());
		umEqualsBuilder.append(this.getSerVinCodigo(), other.getSerVinCodigo());
		umEqualsBuilder.append(this.getUnfSeq(), other.getUnfSeq());
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getSeq(), other.getSeq());
		umEqualsBuilder.append(this.getIndSituacao(), other.getIndSituacao());
		umEqualsBuilder.append(this.getAtdSeq(), other.getAtdSeq());
		umEqualsBuilder.append(this.getMedMatCodigo(), other.getMedMatCodigo());
		umEqualsBuilder.append(this.getQtdeSolicitada(), other.getQtdeSolicitada());
		umEqualsBuilder.append(this.getSerMatriculaEstornado(), other.getSerMatriculaEstornado());
		umEqualsBuilder.append(this.getSerVinCodigoEstornado(), other.getSerVinCodigoEstornado());
		umEqualsBuilder.append(this.getDthrEstorno(), other.getDthrEstorno());
		umEqualsBuilder.append(this.getImePmdAtdSeq(), other.getImePmdAtdSeq());
		umEqualsBuilder.append(this.getImePmdSeq(), other.getImePmdSeq());
		umEqualsBuilder.append(this.getImeMedMatCodigo(), other.getImeMedMatCodigo());
		umEqualsBuilder.append(this.getImeSeqp(), other.getImeSeqp());
		umEqualsBuilder.append(this.getPmeAtdSeq(), other.getPmeAtdSeq());
		umEqualsBuilder.append(this.getPmeSeq(), other.getPmeSeq());
		umEqualsBuilder.append(this.getImoPmoPteAtdSeq(), other.getImoPmoPteAtdSeq());
		umEqualsBuilder.append(this.getImoPmoPteSeq(), other.getImoPmoPteSeq());
		umEqualsBuilder.append(this.getImoPmoSeq(), other.getImoPmoSeq());
		umEqualsBuilder.append(this.getImoSeqp(), other.getImoSeqp());
		umEqualsBuilder.append(this.getQtdeDispensada(), other.getQtdeDispensada());
		umEqualsBuilder.append(this.getDthrEntrega(), other.getDthrEntrega());
		umEqualsBuilder.append(this.getDthrDispensacao(), other.getDthrDispensacao());
		umEqualsBuilder.append(this.getDthrConferencia(), other.getDthrConferencia());
		umEqualsBuilder.append(this.getIndSitItemPrescrito(), other.getIndSitItemPrescrito());
		umEqualsBuilder.append(this.getDsmPmeAtdSeq(), other.getDsmPmeAtdSeq());
		umEqualsBuilder.append(this.getDsmPmeSeq(), other.getDsmPmeSeq());
		umEqualsBuilder.append(this.getDsmImePmdAtdSeq(), other.getDsmImePmdAtdSeq());
		umEqualsBuilder.append(this.getDsmImePmdSeq(), other.getDsmImePmdSeq());
		umEqualsBuilder.append(this.getDsmImeMedMatCodigo(), other.getDsmImeMedMatCodigo());
		umEqualsBuilder.append(this.getDsmImeSeqp(), other.getDsmImeSeqp());
		umEqualsBuilder.append(this.getDsmSeq(), other.getDsmSeq());
		umEqualsBuilder.append(this.getNomeEstacaoDisp(), other.getNomeEstacaoDisp());
		umEqualsBuilder.append(this.getQtdeEstornada(), other.getQtdeEstornada());
		umEqualsBuilder.append(this.getCpoItoPtoSeq(), other.getCpoItoPtoSeq());
		umEqualsBuilder.append(this.getCpoItoSeqp(), other.getCpoItoSeqp());
		umEqualsBuilder.append(this.getCpoSeqp(), other.getCpoSeqp());
		umEqualsBuilder.append(this.getDthrTriado(), other.getDthrTriado());
		umEqualsBuilder.append(this.getUnfSeqSolicitante(), other.getUnfSeqSolicitante());
		umEqualsBuilder.append(this.getSerMatriculaEntregue(), other.getSerMatriculaEntregue());
		umEqualsBuilder.append(this.getSerVinCodigoEntregue(), other.getSerVinCodigoEntregue());
		umEqualsBuilder.append(this.getTodSeq(), other.getTodSeq());
		umEqualsBuilder.append(this.getSerMatriculaConferida(), other.getSerMatriculaConferida());
		umEqualsBuilder.append(this.getSerVinCodigoConferida(), other.getSerVinCodigoConferida());
		umEqualsBuilder.append(this.getTodSeqEstornado(), other.getTodSeqEstornado());
		umEqualsBuilder.append(this.getSerMatriculaTriadoPor(), other.getSerMatriculaTriadoPor());
		umEqualsBuilder.append(this.getSerVinCodigoTriadoPor(), other.getSerVinCodigoTriadoPor());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
