package br.gov.mec.aghu.casca.model;

// Generated May 1, 2010 9:46:52 AM by Hibernate Tools 3.3.0.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Cascade;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * Favorito generated by hbm2java
 */
@Entity
@Table(name = "CSC_FAVORITO", schema = "CASCA", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"ID_USUARIO", "ID_MENU"})})
@SequenceGenerator(name="cscFavSeq", sequenceName="casca.casca_favorito_sq1", allocationSize = 1)
public class Favorito extends BaseEntityId<Integer> {

	private static final long serialVersionUID = 3631923152625864575L;

	private Integer id;
	private Usuario usuario;
	private Menu menu;	
	private Date dataCriacao;
	private Date dataAtualizacao;
	private Integer ordem;
	private Set<Dashboard> dashboards = new HashSet<Dashboard>(0);
	
	//Campo transient usado somente na interface visual
	private Boolean novo;

	public Favorito() {
	}

	public Favorito(Integer id, Usuario usuario, Menu menu,
			Date dataCriacao, Integer ordem) {
		this.id = id;
		this.usuario = usuario;
		this.menu = menu;
		
		this.dataCriacao = dataCriacao;
		this.ordem = ordem;
	}

	public Favorito(Integer id, Usuario usuario, Menu menu,
			Date dataCriacao, Date dataAtualizacao, Integer ordem) {
		this.id = id;
		this.usuario = usuario;
		this.menu = menu;
		this.dataCriacao = dataCriacao;
		this.dataAtualizacao = dataAtualizacao;
		this.ordem = ordem;
	}

	@Id
	@Column(name = "ID", nullable = false, precision = 8, scale = 0)
	@GeneratedValue(strategy=GenerationType.AUTO, generator="cscFavSeq")
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
	@JoinColumn(name = "ID_MENU", nullable = false, updatable = false)
	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_CRIACAO", nullable = false, updatable = false)
	public Date getDataCriacao() {
		return this.dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_ATUALIZACAO")
	public Date getDataAtualizacao() {
		return this.dataAtualizacao;
	}

	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	@Column(name = "ORDEM", nullable = false, precision = 8, scale = 0)
	public Integer getOrdem() {
		return this.ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}
	
	public enum Fields {
		ID("id"), USUARIO("usuario"), ORDEM("ordem"), MENU("menu");
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "favorito")
	@Cascade({org.hibernate.annotations.CascadeType.DELETE})
	public Set<Dashboard> getDashboards() {
		return dashboards;
	}

	public void setDashboards(Set<Dashboard> dashboards) {
		this.dashboards = dashboards;
	}
	
	@Transient
	public Boolean getNovo() {
		return novo;
	}

	public void setNovo(Boolean novo) {
		this.novo = novo;
	}	

}