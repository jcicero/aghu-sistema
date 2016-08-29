package br.gov.mec.aghu.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.Type;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

@Entity
@Table(name = "AGH_WF_EXECUTORES", schema = "AGH")
@SequenceGenerator(name = "AghWFExecutorSequence", sequenceName ="AGH.AGH_WEX_SEQ", allocationSize = 1)
public class AghWFExecutor extends BaseEntitySeq<Integer> implements java.io.Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2363191277014340435L;
	private Integer seq;
	private AghWFEtapa etapa;
	private AghWFFluxo fluxo;
	private AghWFTemplateFluxo templateFluxo;
	private AghWFTemplateEtapa templateEtapa;
	private Date dataExecucao;	
	private Integer version;
	private RapServidores rapServidor;
	private Boolean indRecebeNotificacao;
	private Boolean autorizadoExecutar;
	
	public AghWFExecutor() {
		super();
		this.setAutorizadoExecutar(Boolean.TRUE);
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator ="AghWFExecutorSequence")
	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}
	
	@Version
	@Column(name = "VERSION")
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumns({
	@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
	@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidor() {
		return rapServidor;
	}
	
	public void setRapServidor(RapServidores rapServidor) {
		this.rapServidor = rapServidor;
	}
	
	@Column(name = "IND_RECEBE_NOTIF", nullable = false, length = 1)
	@Type(type="br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndRecebeNotificacao() {
		return indRecebeNotificacao;
	}
	public void setIndRecebeNotificacao(Boolean indRecebeNotificacao) {
		this.indRecebeNotificacao = indRecebeNotificacao;
	}	

	public void setTemplateFluxo(AghWFTemplateFluxo templateFluxo) {
		this.templateFluxo = templateFluxo;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="WTF_SEQ", referencedColumnName="SEQ", nullable = false)
	public AghWFTemplateFluxo getTemplateFluxo() {
		return templateFluxo;
	}

	public void setTemplateEtapa(AghWFTemplateEtapa templateEtapa) {
		this.templateEtapa = templateEtapa;
	}	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="WTE_SEQ", referencedColumnName="SEQ", nullable = false)
	public AghWFTemplateEtapa getTemplateEtapa() {
		return templateEtapa;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="WET_SEQ", referencedColumnName="SEQ", nullable = false)
	public AghWFEtapa getEtapa() {
		return etapa;
	}

	public void setEtapa(AghWFEtapa etapa) {
		this.etapa = etapa;
	}
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="WFL_SEQ", referencedColumnName="SEQ", nullable = false)
	public AghWFFluxo getFluxo() {
		return fluxo;
	}

	public void setFluxo(AghWFFluxo fluxo) {
		this.fluxo = fluxo;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "DT_EXECUCAO")
	public Date getDataExecucao() {
		return dataExecucao;
	}

	public void setDataExecucao(Date dataExecucao) {
		this.dataExecucao = dataExecucao;
	}
	
	@Column(name = "AUTORIZADO_EXECUTAR", length = 1)
	@Type(type="br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getAutorizadoExecutar() {
		return autorizadoExecutar;
	}
	
	public void setAutorizadoExecutar(Boolean autorizadoExecutar) {
		this.autorizadoExecutar = autorizadoExecutar;
	}

	public enum Fields {
		
		SEQ("seq"),
		WET_SEQ("etapa"),
		WET_SEQ_ID("etapa.seq"),
		WFL_SEQ("fluxo"),
		WFL_SEQ_ID("fluxo.seq"),
		WTF_SEQ("templateFluxo"),
		WTE_SEQ("templateEtapa"),
		DT_EXECUCAO("dataExecucao"),
		SERVIDOR("rapServidor"),
		SERVIDOR_MATRICULA("rapServidor.id.matricula"),
		SERVIDOR_VIN_CODIGO("rapServidor.id.vinCodigo"),		
		IND_RECEBE_NOTIF("indRecebeNotificacao"),
		AUTORIZADO_EXECUTAR("autorizadoExecutar"),
		EXECUTOR_RAMAL("rapServidor.ramalTelefonico.numeroRamal"),
		EXECUTOR_EMAIL("rapServidor.email"),
		VERSION("version");
		
		private String fields;

		private Fields(final String fields) {
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
		result = prime * result + ((seq == null) ? 0 : seq.hashCode());
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
		AghWFExecutor other = (AghWFExecutor) obj;
		if (seq == null) {
			if (other.seq != null) {
				return false;
			}
		} else if (!seq.equals(other.seq)) {
			return false;
		}
		return true;
	}

}
