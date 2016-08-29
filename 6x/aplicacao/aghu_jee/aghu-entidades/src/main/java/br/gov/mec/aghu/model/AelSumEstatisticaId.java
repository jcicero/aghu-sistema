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
 * AelSumEstatisticaId generated by hbm2java
 */
@Embeddable
public class AelSumEstatisticaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5994738764382213048L;
	private Date dataImp;
	private String origem;
	private Integer exameMasc;
	private Integer exameTab;
	private Integer legenda;
	private Integer observacao;
	private Integer mascLinha;
	private Integer mascCampoEdit;
	private Integer itensAtualizados;
	private Integer version;

	public AelSumEstatisticaId() {
	}

	public AelSumEstatisticaId(Date dataImp, String origem, Integer exameMasc, Integer exameTab, Integer legenda, Integer observacao, Integer mascLinha,
			Integer mascCampoEdit, Integer itensAtualizados, Integer version) {
		this.dataImp = dataImp;
		this.origem = origem;
		this.exameMasc = exameMasc;
		this.exameTab = exameTab;
		this.legenda = legenda;
		this.observacao = observacao;
		this.mascLinha = mascLinha;
		this.mascCampoEdit = mascCampoEdit;
		this.itensAtualizados = itensAtualizados;
		this.version = version;
	}

	@Column(name = "DATA_IMP", nullable = false, length = 29)
	public Date getDataImp() {
		return this.dataImp;
	}

	public void setDataImp(Date dataImp) {
		this.dataImp = dataImp;
	}

	@Column(name = "ORIGEM", nullable = false, length = 2)
	@Length(max = 2)
	public String getOrigem() {
		return this.origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	@Column(name = "EXAME_MASC", nullable = false)
	public Integer getExameMasc() {
		return this.exameMasc;
	}

	public void setExameMasc(Integer exameMasc) {
		this.exameMasc = exameMasc;
	}

	@Column(name = "EXAME_TAB", nullable = false)
	public Integer getExameTab() {
		return this.exameTab;
	}

	public void setExameTab(Integer exameTab) {
		this.exameTab = exameTab;
	}

	@Column(name = "LEGENDA", nullable = false)
	public Integer getLegenda() {
		return this.legenda;
	}

	public void setLegenda(Integer legenda) {
		this.legenda = legenda;
	}

	@Column(name = "OBSERVACAO", nullable = false)
	public Integer getObservacao() {
		return this.observacao;
	}

	public void setObservacao(Integer observacao) {
		this.observacao = observacao;
	}

	@Column(name = "MASC_LINHA", nullable = false)
	public Integer getMascLinha() {
		return this.mascLinha;
	}

	public void setMascLinha(Integer mascLinha) {
		this.mascLinha = mascLinha;
	}

	@Column(name = "MASC_CAMPO_EDIT", nullable = false)
	public Integer getMascCampoEdit() {
		return this.mascCampoEdit;
	}

	public void setMascCampoEdit(Integer mascCampoEdit) {
		this.mascCampoEdit = mascCampoEdit;
	}

	@Column(name = "ITENS_ATUALIZADOS", nullable = false)
	public Integer getItensAtualizados() {
		return this.itensAtualizados;
	}

	public void setItensAtualizados(Integer itensAtualizados) {
		this.itensAtualizados = itensAtualizados;
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
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getObservacao());
		umHashCodeBuilder.append(this.getLegenda());
		umHashCodeBuilder.append(this.getOrigem());
		umHashCodeBuilder.append(this.getDataImp());
		umHashCodeBuilder.append(this.getExameMasc());
		umHashCodeBuilder.append(this.getExameTab());
		umHashCodeBuilder.append(this.getMascLinha());
		umHashCodeBuilder.append(this.getMascCampoEdit());
		umHashCodeBuilder.append(this.getItensAtualizados());
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
		if (!(obj instanceof AelSumEstatisticaId)) {
			return false;
		}
		AelSumEstatisticaId other = (AelSumEstatisticaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getObservacao(), other.getObservacao());
		umEqualsBuilder.append(this.getLegenda(), other.getLegenda());
		umEqualsBuilder.append(this.getOrigem(), other.getOrigem());
		umEqualsBuilder.append(this.getDataImp(), other.getDataImp());
		umEqualsBuilder.append(this.getExameMasc(), other.getExameMasc());
		umEqualsBuilder.append(this.getExameTab(), other.getExameTab());
		umEqualsBuilder.append(this.getMascLinha(), other.getMascLinha());
		umEqualsBuilder.append(this.getMascCampoEdit(), other.getMascCampoEdit());
		umEqualsBuilder.append(this.getItensAtualizados(), other.getItensAtualizados());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
