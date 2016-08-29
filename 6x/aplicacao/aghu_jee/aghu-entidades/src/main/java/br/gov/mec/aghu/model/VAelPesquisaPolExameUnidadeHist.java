package br.gov.mec.aghu.model;

// Generated 21/06/2011 11:29:47 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * VAelPesquisaPolExamesUnidades generated by hbm2java
 */

@Entity
@Table(name = "V_AEL_PESQ_POL_EXAME_UNID_HIST", schema = "AGH")
@Immutable
public class VAelPesquisaPolExameUnidadeHist extends BaseEntityId<VAelPesquisaPolExameUnidadeId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2273307361741878285L;

	private VAelPesquisaPolExameUnidadeId id;
	
	private String unfDescricao;
	private Short unfSeq;
	private Date data;
	private Short ordemNivel1;
	private Short ordemNivel2;
	private String descricaoUsual;
	private String descricao;
	private Integer pacCodigo;

	public VAelPesquisaPolExameUnidadeHist() {
	}
	
	public VAelPesquisaPolExameUnidadeHist(VAelPesquisaPolExameUnidadeId id, String unfDescricao, Short unfSeq,
			Date data, Short ordemNivel1, Short ordemNivel2,
			String descricaoUsual, String descricao, Integer pacCodigo) {
		this.id = id;
		this.unfDescricao = unfDescricao;
		this.unfSeq = unfSeq;
		this.data = data;
		this.ordemNivel1 = ordemNivel1;
		this.ordemNivel2 = ordemNivel2;
		this.descricaoUsual = descricaoUsual;
		this.descricao = descricao;
		this.pacCodigo = pacCodigo;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "soeSeq", column = @Column(name = "SOE_SEQ")),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP")) })
	public VAelPesquisaPolExameUnidadeId getId() {
		return this.id;
	}

	public void setId(VAelPesquisaPolExameUnidadeId id) {
		this.id = id;
	}
	
	@Column(name = "UNF_DESCRICAO")
	public String getUnfDescricao() {
		return this.unfDescricao;
	}

	public void setUnfDescricao(String unfDescricao) {
		this.unfDescricao = unfDescricao;
	}

	@Column(name = "UNF_SEQ")
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "DATA", length = 29)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Column(name = "ORDEM_NIVEL1")
	public Short getOrdemNivel1() {
		return this.ordemNivel1;
	}

	public void setOrdemNivel1(Short ordemNivel1) {
		this.ordemNivel1 = ordemNivel1;
	}

	@Column(name = "ORDEM_NIVEL2")
	public Short getOrdemNivel2() {
		return this.ordemNivel2;
	}

	public void setOrdemNivel2(Short ordemNivel2) {
		this.ordemNivel2 = ordemNivel2;
	}

	@Column(name = "DESCRICAO_USUAL", length = 100)
	@Length(max = 100)
	public String getDescricaoUsual() {
		return this.descricaoUsual;
	}

	public void setDescricaoUsual(String descricaoUsual) {
		this.descricaoUsual = descricaoUsual;
	}

	@Column(name = "DESCRICAO", length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Column(name = "PAC_CODIGO")
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}
	
	public enum Fields {

		
		ID("id"),
		SOE_SEQ("id.soeSeq"),
		SEQP("id.seqp"),
		UNF_DESCRICAO("unfDescricao"),
		UNF_SEQ("unfSeq"),
		DATA("data"),
		ORDEM_NIVEL1("ordemNivel1"),
		ORDEM_NIVEL2("ordemNivel2"),
		DESC_USUAL_EXAME("descricaoUsual"),
		DESC_MATERIAL("descricao"), 
		PAC_CODIGO("pacCodigo");

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		VAelPesquisaPolExameUnidadeHist other = (VAelPesquisaPolExameUnidadeHist) obj;
		if (id == null) {
			if (other.id != null){
				return false;
			}
		} else if (!id.equals(other.id)){
			return false;
		}
		return true;
	}
	
	


}
