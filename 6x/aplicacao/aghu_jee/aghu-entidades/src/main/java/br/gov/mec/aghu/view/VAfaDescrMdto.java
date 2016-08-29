package br.gov.mec.aghu.view;

// Generated 28/09/2010 16:24:25 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Date;
import java.util.Locale;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.model.AfaMedicamento;
import br.gov.mec.aghu.model.AfaTipoUsoMdto;
import br.gov.mec.aghu.model.MpmUnidadeMedidaMedica;
import br.gov.mec.aghu.core.persistence.BaseEntityId;


/**
 * V_AFA_DESCR_MDTO
 *
 *
 * VAfaDescrMdto generated by hbm2java
 */
@Entity
@Table(name = "V_AFA_DESCR_MDTO", schema = "AGH")
@Immutable
public class VAfaDescrMdto extends BaseEntityId<VAfaDescrMdtoId> implements java.io.Serializable {

	private static final long serialVersionUID = -1116410584838950902L;
	
	private VAfaDescrMdtoId id;
	private AfaMedicamento medicamento;
	private AfaTipoUsoMdto tipoUsoMdto;
	private MpmUnidadeMedidaMedica unidadeMedidaMedicas;
	private Integer ummSeq;
	private Short tfqSeq;
	private String tumSigla;
	private String tprSigla;
	private Date hrioInicioAdmSugerido;
	private Short frequenciaUsual;
	private BigDecimal concentracao;
	private String sinonimo;
	private Boolean permitePrescricaoAmbulatorial;
	private Boolean permitePrescricaoEnfermeiroObstetra;


	public VAfaDescrMdto() {
	}

	public VAfaDescrMdto(VAfaDescrMdtoId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "matCodigo", column = @Column(name = "MAT_CODIGO", precision = 6, scale = 0)),
			@AttributeOverride(name = "descricaoMat", column = @Column(name = "DESCRICAO_MAT", length = 60)),
			@AttributeOverride(name = "indSituacao", column = @Column(name = "IND_SITUACAO", length = 1)),
			@AttributeOverride(name = "descricao", column = @Column(name = "DESCRICAO", length = 60)),
			@AttributeOverride(name = "indExigeObservacao", column = @Column(name = "IND_EXIGE_OBSERVACAO", length = 1)),
			@AttributeOverride(name = "descricaoEditada", column = @Column(name = "DESCRICAO_EDITADA", length = 117)),
			@AttributeOverride(name = "descLovEditada", column = @Column(name = "DESC_LOV_EDITADA", length = 117)),
			@AttributeOverride(name = "indDiluente", column = @Column(name = "IND_DILUENTE", length = 1)) })
	public VAfaDescrMdtoId getId() {
		return this.id;
	}

	public void setId(VAfaDescrMdtoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAT_CODIGO", referencedColumnName = "MAT_CODIGO", insertable = false, updatable = false)
	public AfaMedicamento getMedicamento() {
		return this.medicamento;
	}

	public void setMedicamento(AfaMedicamento medicamento) {
		this.medicamento = medicamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TUM_SIGLA", referencedColumnName = "SIGLA", insertable = false, updatable = false)
	public AfaTipoUsoMdto getTipoUsoMdto() {
		return this.tipoUsoMdto;
	}

	public void setTipoUsoMdto(AfaTipoUsoMdto tipoUsoMdto) {
		this.tipoUsoMdto = tipoUsoMdto;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UMM_SEQ",  insertable = false, updatable = false)
	public MpmUnidadeMedidaMedica getUnidadeMedidaMedicas() {
		return unidadeMedidaMedicas;
	}

	public void setUnidadeMedidaMedicas(MpmUnidadeMedidaMedica unidadeMedidaMedicas) {
		this.unidadeMedidaMedicas = unidadeMedidaMedicas;
	}
	
	@Transient
	public String getDescricaoMedicamento(){
		return this.getId().getDescricaoEditada();
	}
	
	@Column(name = "UMM_SEQ", precision = 5, scale = 0)
	public Integer getUmmSeq() {
		return ummSeq;
	}

	public void setUmmSeq(Integer ummSeq) {
		this.ummSeq = ummSeq;
	}

	@Column(name = "TFQ_SEQ", precision = 4, scale = 0)
	public Short getTfqSeq() {
		return tfqSeq;
	}

	public void setTfqSeq(Short tfqSeq) {
		this.tfqSeq = tfqSeq;
	}

	@Column(name = "TUM_SIGLA", length = 2)
	@Length(max = 2)
	public String getTumSigla() {
		return tumSigla;
	}

	public void setTumSigla(String tumSigla) {
		this.tumSigla = tumSigla;
	}
	
	@Column(name = "TPR_SIGLA", length = 3)
	@Length(max = 3)
	public String getTprSigla() {
		return tprSigla;
	}

	public void setTprSigla(String tprSigla) {
		this.tprSigla = tprSigla;
	}

	@Column(name = "HRIO_INICIO_ADM_SUGERIDO", length = 7)
	public Date getHrioInicioAdmSugerido() {
		return hrioInicioAdmSugerido;
	}

	public void setHrioInicioAdmSugerido(Date hrioInicioAdmSugerido) {
		this.hrioInicioAdmSugerido = hrioInicioAdmSugerido;
	}

	@Column(name = "FREQUENCIA_USUAL", precision = 3, scale = 0)
	public Short getFrequenciaUsual() {
		return frequenciaUsual;
	}

	public void setFrequenciaUsual(Short frequenciaUsual) {
		this.frequenciaUsual = frequenciaUsual;
	}

	@Column(name = "CONCENTRACAO", precision = 14, scale = 4)
	public BigDecimal getConcentracao() {
		return concentracao;
	}

	public void setConcentracao(BigDecimal concentracao) {
		this.concentracao = concentracao;
	}
	
	@Transient
	public String getConcentracaoFormatada() {
		Locale locBR = new Locale("pt", "BR");
        DecimalFormatSymbols dfSymbols = new DecimalFormatSymbols(locBR);
        dfSymbols.setDecimalSeparator(',');
        DecimalFormat format;
        if(concentracao != null)
        {
//        	#1083
//        	format = new DecimalFormat("#,###,###,###,##0.###############", dfSymbols); //
        	format = new DecimalFormat("#,###,###,###,##0.#####", dfSymbols);
        	return format.format(concentracao);
        }
		
        return null;
	}

	@Column(name = "SINONIMO", length = 60)
	@Length(max = 60)
	public String getSinonimo() {
		return sinonimo;
	}

	public void setSinonimo(String sinonimo) {
		this.sinonimo = sinonimo;
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
		if (!(obj instanceof VAfaDescrMdto)) {
			return false;
		}
		VAfaDescrMdto other = (VAfaDescrMdto) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}


	/**
	 * FIELDS
	 */
	public enum Fields {
		MAT_CODIGO("id.matCodigo"),
		UMM_SEQ("ummSeq"),
		UNIDADE_MEDIDA_MEDICAS("unidadeMedidaMedicas"),
		TFQ_SEQ("tfqSeq"),
		TIPO_USO_MDTO("tipoUsoMdto"),
		TUM_SIGLA("tumSigla"),
		TPR_SIGLA("tprSigla"),
		DESCRICAO_MAT("id.descricaoMat"),
		IND_SITUACAO("id.indSituacao"),
		HRIO_INICIO_ADM_SUGERIDO("hrioInicioAdmSugerido"),
		FREQUENCIA_USUAL("frequenciaUsual"),
		IND_PADRONIZACAO("id.indPadronizacao"),
		CONCENTRACAO("concentracao"),
		DESCRICAO("id.descricao"),
		SINONIMO("sinonimo"),
		IND_EXIGE_OBSERVACAO("id.indExigeObservacao"),
		DESCRICAO_EDITADA("id.descricaoEditada"),
		DESC_LOV_EDITADA("id.descLovEditada"),
		IND_DILUENTE("id.indDiluente"),
		MEDICAMENTO("medicamento"),
		PRESCRICAO_AMBULATORIAL("permitePrescricaoAmbulatorial"),
		PRESCRICAO_ENFERMEIRO_OBSTETRA("permitePrescricaoEnfermeiroObstetra");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}
	
	@Column(name = "ind_permite_pma", nullable = false)
	@Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getPermitePrescricaoAmbulatorial() {
		return permitePrescricaoAmbulatorial;
	}

	public void setPermitePrescricaoAmbulatorial(
			Boolean permitePrescricaoAmbulatorial) {
		this.permitePrescricaoAmbulatorial = permitePrescricaoAmbulatorial;
	}
	
	@Column(name = "ind_permite_presc_enf", nullable = false)
	@Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getPermitePrescricaoEnfermeiroObstetra() {
		return permitePrescricaoEnfermeiroObstetra;
	}

	public void setPermitePrescricaoEnfermeiroObstetra(
			Boolean permitePrescricaoEnfermeiroObstetra) {
		this.permitePrescricaoEnfermeiroObstetra = permitePrescricaoEnfermeiroObstetra;
	}
	
}
