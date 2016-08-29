package br.gov.mec.aghu.casca.model;

// Generated May 1, 2010 9:46:52 AM by Hibernate Tools 3.3.0.GA

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * PerfisUsuarios generated by hbm2java
 */
@Entity
@Immutable
@Table(name = "CSC_PERFIS_USUARIOS", schema = "CASCA", uniqueConstraints = @UniqueConstraint(columnNames = {"ID_USUARIO", "ID_PERFIL"}))
@SequenceGenerator(name="cscPerfUsuSeq", sequenceName="casca.casca_perfil_user_sq1", allocationSize = 1)
public class PerfisUsuarios extends BaseEntityId<Integer> {

	private static final long serialVersionUID = -3337821515274441201L;
	
	private Integer id;
	private Usuario usuario;
	private Perfil perfil;
	private Date dataCriacao;
	private Date dataExpiracao;
	private String motivoDelegacao;

	public PerfisUsuarios() {
	}

	public PerfisUsuarios(Integer id, Usuario usuario, Perfil perfil,
			Date dataCriacao) {
		this.id = id;
		this.usuario = usuario;
		this.perfil = perfil;
		this.dataCriacao = dataCriacao;
	}

	@Id
	@Column(name = "ID", nullable = false, precision = 8, scale = 0)
	@GeneratedValue(strategy=GenerationType.AUTO, generator="cscPerfUsuSeq")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_USUARIO", nullable = false, updatable = false)
	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PERFIL", nullable = false, updatable = false)
	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_CRIACAO", nullable = false, updatable = false)
	public Date getDataCriacao() {
		return this.dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public enum Fields {
		ID("id"), 
		USUARIO("usuario"),
		PERFIL("perfil"),
		DATA_EXPIRACAO("dataExpiracao"),
		DATA_CRIACAO("dataCriacao"),
		MOTIVO_DELEGACAO("motivoDelegacao");
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_EXPIRACAO", nullable = true)
	public Date getDataExpiracao() {
		return dataExpiracao;
	}

	public void setDataExpiracao(Date dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}

	@Column(name = "MOTIVO_DELEGACAO")
	public String getMotivoDelegacao() {
		return motivoDelegacao;
	}

	public void setMotivoDelegacao(String motivoDelegacao) {
		this.motivoDelegacao = motivoDelegacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof PerfisUsuarios)) {
			return false;
		}
		PerfisUsuarios other = (PerfisUsuarios) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
	
	
}