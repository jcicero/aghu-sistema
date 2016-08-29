package br.gov.mec.aghu.casca.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
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
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Min;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * Menu generated by hbm2java
 */

@Entity
@Table(name = "CSC_MENU", schema = "CASCA", uniqueConstraints = {
	@UniqueConstraint(columnNames = {"ID_APLICACAO", "PARENT_ID", "NOME"}),
	@UniqueConstraint(columnNames = {"ID_APLICACAO", "PARENT_ID", "ORDEM"}) })
@SequenceGenerator(name="cscMenuSeq", sequenceName="casca.casca_menu_sq1", allocationSize = 1)
@org.hibernate.annotations.Cache(usage =org.hibernate.annotations.CacheConcurrencyStrategy.TRANSACTIONAL)
public class Menu extends BaseEntityId<Integer>  {

	private static final long serialVersionUID = 2464749189774123218L;

	private Integer id;
	private Menu menuPai;
	private String nome;
	private String classeIcone;
	private Date dataCriacao;
	private Integer ordem;
	private String url;
	private List<Menu> menus = new ArrayList<Menu>(0);
	private Set<Favorito> favoritos = new HashSet<Favorito>(0);
	private Aplicacao aplicacao;
	private Boolean ativo;
	private List<PalavraChaveMenu> palavrasChave;

	
	public Menu() {
	}

	public Menu(Integer id, String nome, Date dataCriacao, Integer ordem) {
		this.id = id;
		this.nome = nome;
		this.dataCriacao = dataCriacao;
		this.ordem = ordem;
	}

	public Menu(Integer id, Menu menuPai, String nome, String classeIcone,
			Date dataCriacao, Integer ordem, String url, List<Menu> menus,
			Set<Favorito> favoritos) {
		this.id = id;
		this.menuPai = menuPai;
		this.nome = nome;
		this.classeIcone = classeIcone;
		this.dataCriacao = dataCriacao;
		this.ordem = ordem;
		this.url = url;
		this.menus = menus;
		this.favoritos = favoritos;
	}

	@Id
	@Column(name = "ID", nullable = false, precision = 8, scale = 0)
	@GeneratedValue(strategy=GenerationType.AUTO, generator="cscMenuSeq")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne
	@JoinColumn(name = "PARENT_ID")
	public Menu getMenuPai() {
		return this.menuPai;
	}

	public void setMenuPai(Menu menuPai) {
		this.menuPai = menuPai;
	}

	@Column(name = "NOME", nullable = false, length = 250)	
	@Length(max = 250, message = "Nome do menu pode conter no máximo 250 caracteres")
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "CLASSE_ICONE", length = 250)
	@Length(max = 250, message = "Classe do ícone do menu pode conter no máximo 250 caracteres")
	public String getClasseIcone() {
		return this.classeIcone;
	}

	public void setClasseIcone(String classeIcone) {
		this.classeIcone = classeIcone;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_CRIACAO", nullable = false)
	public Date getDataCriacao() {
		return this.dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	@Column(name = "ORDEM", nullable = false, precision = 8, scale = 0)
	@Min(value = 1, message = "Ordem deve ter um valor maior que zero")
	public Integer getOrdem() {
		return this.ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	@Column(name = "URL", length = 2500)
	@Length(max = 2500, message = "URL do menu pode conter no máximo 2500 caracteres")
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@OneToMany(mappedBy = "menuPai")
	@OrderBy("ordem")
	@Cascade({org.hibernate.annotations.CascadeType.DELETE})
	public List<Menu> getMenus() {
		return this.menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "menu")
	@Cascade({org.hibernate.annotations.CascadeType.DELETE})
	public Set<Favorito> getFavoritos() {
		return this.favoritos;
	}

	public void setFavoritos(Set<Favorito> favoritos) {
		this.favoritos = favoritos;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_APLICACAO", nullable = false)
	public Aplicacao getAplicacao() {
		return aplicacao;
	}

	public void setAplicacao(Aplicacao aplicacao) {
		this.aplicacao = aplicacao;
	}
	
	public void addMenu(Menu menu) {
		if (menus == null) {
			menus = new ArrayList<Menu>();
		}
		
		menus.add(menu);
	}
	
	@Column(name = "ATIVO", nullable = false, length = 1)
	@Type(type="br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "menu")
	@Cascade({org.hibernate.annotations.CascadeType.DELETE})
	public List<PalavraChaveMenu> getPalavrasChave() {
		return palavrasChave;
	}

	public void setPalavrasChave(List<PalavraChaveMenu> palavrasChave) {
		this.palavrasChave = palavrasChave;
	}



	public enum Fields {
		NOME("nome"), URL("url"), ID("id"), MENU_PAI("menuPai"), ORDEM("ordem"), APLICACAO("aplicacao"), ATIVO("ativo"), MENUS("menus"), PALAVRAS_CHAVE("palavrasChave");
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