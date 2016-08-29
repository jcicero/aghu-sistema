package br.gov.mec.aghu.model;

// Generated 10/04/2012 11:33:38 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;


import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.dominio.DominioSituacaoExamePatologia;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * VAelApXPatologia generated by hbm2java
 */
@Entity
@Table(name = "V_AEL_AP_X_PATOLOGIA_AGHU")
@Immutable
public class VAelApXPatologiaAghu extends BaseEntityId<VAelApXPatologiaAghuId> implements java.io.Serializable {

	private static final long serialVersionUID = 6452423434899680275L;
	
	private VAelApXPatologiaAghuId id;
	private String convenio;
	private Integer nroVias;

	public VAelApXPatologiaAghu() {
	}

	public VAelApXPatologiaAghu(VAelApXPatologiaAghuId id) {
		this.id = id;
	}
	
	public VAelApXPatologiaAghu(Long lumSeq, Long luxSeq, Long lumNumeroAp,
			Integer atvSeq, Integer atdSeq, String luxMateriais,
			DominioSituacaoExamePatologia luxEtapasLaudo, String luxSituacao, Integer lu2Seq,
			String lu2Nome, Integer luxSerMatriculaRespLaudo,
			Short luxSerVinCodigoRespLaudo, Boolean luxIndImpresso,
			Date dataExtrato, String nomePac, String nomeMedicoSolic,
			Integer matriculaMedicoSolic, String nomeResidente,
			Integer matriculaResidente, String nomePatologista,
			Integer matriculaPatologista) {
		super();
		
		this.id = new VAelApXPatologiaAghuId( lumSeq, luxSeq,lumNumeroAp, atvSeq, 
											  atdSeq, luxMateriais, luxEtapasLaudo,
											  luxSituacao, lu2Seq, lu2Nome,
											  luxSerMatriculaRespLaudo, luxSerVinCodigoRespLaudo,
											  luxIndImpresso, dataExtrato, nomePac, nomeMedicoSolic,
											  matriculaMedicoSolic, nomeResidente, matriculaResidente,
											  nomePatologista, matriculaPatologista
										     );
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "lumSeq", column = @Column(name = "LUM_SEQ", nullable = false, precision = 14, scale = 0)),
			@AttributeOverride(name = "luxSeq", column = @Column(name = "LUX_SEQ", nullable = false, precision = 14, scale = 0)),
			@AttributeOverride(name = "lumNumeroAp", column = @Column(name = "LUM_NUMERO_AP", nullable = false, precision = 10, scale = 0)),
			@AttributeOverride(name = "atvSeq", column = @Column(name = "ATV_SEQ", precision = 7, scale = 0)),
			@AttributeOverride(name = "atdSeq", column = @Column(name = "ATD_SEQ", precision = 9, scale = 0)),
			@AttributeOverride(name = "luxMateriais", column = @Column(name = "LUX_MATERIAIS", nullable = false, length = 2000)),
			@AttributeOverride(name = "luxEtapasLaudo", column = @Column(name = "LUX_ETAPAS_LAUDO", length = 2)),
			@AttributeOverride(name = "luxSituacao", column = @Column(name = "LUX_SITUACAO", nullable = false, length = 1)),
			@AttributeOverride(name = "lu2Seq", column = @Column(name = "LU2_SEQ", nullable = false, precision = 5, scale = 0)),
			@AttributeOverride(name = "lu2Nome", column = @Column(name = "LU2_NOME", length = 500)),
			@AttributeOverride(name = "luxSerMatriculaRespLaudo", column = @Column(name = "LUX_SER_MATRICULA_RESP_LAUDO", precision = 7, scale = 0)),
			@AttributeOverride(name = "luxSerVinCodigoRespLaudo", column = @Column(name = "LUX_SER_VIN_CODIGO_RESP_LAUDO", precision = 3, scale = 0)),
			@AttributeOverride(name = "dataExtrato", column = @Column(name = "DATA_EXTRATO",nullable = false)),
			@AttributeOverride(name = "nomePac", column = @Column(name = "NOME_PAC", nullable = false, length = 50)),
			@AttributeOverride(name = "nomeMedicoSolic", column = @Column(name = "NOME_MEDICO_SOLIC", nullable = false, length = 50)),
			@AttributeOverride(name = "matriculaMedicoSolic", column = @Column(name = "MATRICULA_MEDICO_SOLIC", precision = 7, scale = 0)),
			@AttributeOverride(name = "nomeResidente", column = @Column(name = "NOME_RESIDENTE", nullable = false, length = 200)),
			@AttributeOverride(name = "matriculaResidente", column = @Column(name = "MATRICULA_RESIDENTE", precision = 7, scale = 0)),
			@AttributeOverride(name = "nomePatologista", column = @Column(name = "NOME_PATOLOGISTA", nullable = false, length = 200)),
			@AttributeOverride(name = "matriculaPatologista", column = @Column(name = "MATRICULA_PATOLOGISTA", precision = 7, scale = 0)),
			@AttributeOverride(name = "luxIndImpresso", column = @Column(name = "LUX_IND_IMPRESSO", nullable = false, length = 1)) })
	public VAelApXPatologiaAghuId getId() {
		return this.id;
	}

	public void setId(VAelApXPatologiaAghuId id) {
		this.id = id;
	}
	
	public enum Fields {		
		LUM_SEQ("id.lumSeq"), 
		LUX_SEQ("id.luxSeq"),
		LUM_NUMERO_AP("id.lumNumeroAp"), 
		ATV_SEQ("id.atvSeq"), 
		ATD_SEQ("id.atdSeq"), 
		LUX_MATERIAIS("id.luxMateriais"), 
		LUX_ETAPAS_LAUDO("id.luxEtapasLaudo"),
		LUX_SITUACAO("id.luxSituacao"),
		LU2_SEQ("id.lu2Seq"),
		LU2_NOME("id.lu2Nome"),
		LUX_SER_MATRICULA_RESP_LAUDO("id.luxSerMatriculaRespLaudo"),
		LUX_SER_VIN_CODIGO_RESP_LAUDO("id.luxSerVinCodigoRespLaudo"),
		LUX_IND_IMPRESSO("id.luxIndImpresso"),
		DATA_EXTRATO("id.dataExtrato"),
		NOME_PAC("id.nomePac"),
		NOME_MEDICO_SOLIC("id.nomeMedicoSolic"),
		MATRICULA_MEDICO_SOLIC("id.matriculaMedicoSolic"),
		NOME_RESIDENTE("id.nomeResidente"),
		MATRICULA_RESIDENTE("id.matriculaResidente"),
		NOME_PATOLOGISTA("id.nomePatologista"),
		MATRICULA_PATOLOGISTA("id.matriculaPatologista"),
		CONVENIO("convenio");
		
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
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof VAelApXPatologia)) {
			return false;
		}
		VAelApXPatologiaAghu other = (VAelApXPatologiaAghu) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	@Transient
	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	@Transient
	public Integer getNroVias() {
		return nroVias;
	}

	public void setNroVias(Integer nroVias) {
		this.nroVias = nroVias;
	}


	
	
	
}