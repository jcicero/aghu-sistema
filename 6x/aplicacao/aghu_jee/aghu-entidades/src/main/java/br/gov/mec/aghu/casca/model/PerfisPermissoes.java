package br.gov.mec.aghu.casca.model;

// Generated May 1, 2010 9:46:52 AM by Hibernate Tools 3.3.0.GA

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

import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * PerfisPermissoes generated by hbm2java
 */
@Entity
@Immutable
@Table(name = "CSC_PERFIS_PERMISSOES", schema = "CASCA")
@SequenceGenerator(name="cascaPerfPermSq1", sequenceName="casca.casca_perfis_perm_sq1", allocationSize = 1)
public class PerfisPermissoes extends BaseEntityId<Integer> {

	private static final long serialVersionUID = 7298513269903643791L;
	
	private Integer id;
	private Permissao permissao;
	private Perfil perfil;

	public PerfisPermissoes() {
	}

	public PerfisPermissoes(Integer id, Permissao permissao, Perfil perfil) {
		this.id = id;
		this.permissao = permissao;
		this.perfil = perfil;
	}

	@Id
	@Column(name = "ID", nullable = false, precision = 8, scale = 0)
	@GeneratedValue(strategy=GenerationType.AUTO, generator="cascaPerfPermSq1")
	public Integer getId() {
		return this.id;  
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PERMISAO", nullable = false, updatable = false)
	public Permissao getPermissao() {
		return this.permissao;
	}

	public void setPermissao(Permissao permissao) {
		this.permissao = permissao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_PERFIL", nullable = false, updatable = false)
	public Perfil getPerfil() {
		return this.perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}
	
	public enum Fields {
		ID("id"), 
		PERMISSAO("permissao"), 
		PERFIL("perfil"),
		PERFIL_ID("perfil.id");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}
	
}