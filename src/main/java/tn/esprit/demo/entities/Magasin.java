package tn.esprit.demo.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Magasin {

	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String localisation;

	@ManyToMany
    private Set<Article> articles = new HashSet<Article>();
	
	


	public Magasin() {
		super();
	}
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
	public Set<Article> getArticles() {
		return articles;
	}
	public void setArticles(Set<Article> articles) {
		this.articles = articles;
	}
	public Magasin(Long id, String nom, String localisation, Set<Article> articles) {
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
