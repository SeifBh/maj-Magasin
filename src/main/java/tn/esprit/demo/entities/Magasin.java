package tn.esprit.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
@Access(AccessType.PROPERTY)
public class Magasin implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	private String nom;
	private String localisation;


    private List<Article> articles;
    
	
    @ManyToMany
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	public Magasin() {
		super();
	}
	@Id
    @GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "id")
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getLocalisation() {
		return localisation;
	}
	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}
	
   
	public Magasin(Long id, String nom, String localisation, List<Article> articles) {
		super();
		this.id = id;
		this.nom = nom;
		this.localisation = localisation;
		this.articles = articles;
	}
	@Override
	public String toString() {
		return "Magasin [id=" + id + ", nom=" + nom + ", localisation=" + localisation + ", articles=" + articles + "]";
	}

	
	
	
	
	
	
}
