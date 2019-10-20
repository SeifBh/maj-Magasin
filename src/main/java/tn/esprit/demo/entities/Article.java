package tn.esprit.demo.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

enum Type{
	   Solid, Liquide, Gaz;
	}

@Entity
public class Article {

	@Id
	@GeneratedValue
	private Long id;
	private String ref;
	private String nom;
	private String description;
	private int quantite;

	 @ManyToMany(mappedBy="articles")
	 private Set<Magasin> magasins = new HashSet<Magasin>();
	
	//Version 2 start from here : by adding this attribute to article entity
	
	
	
	public Article() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	public Set<Magasin> getMagasins() {
		return magasins;
	}
	public void setMagasins(Set<Magasin> magasins) {
		this.magasins = magasins;
	}
	public Article(Long id, String ref, String nom, String description, int quantite, Set<Magasin> magasins) {
		super();
		this.id = id;
		this.ref = ref;
		this.nom = nom;
		this.description = description;
		this.quantite = quantite;
		this.magasins = magasins;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", ref=" + ref + ", nom=" + nom + ", description=" + description + ", quantite="
				+ quantite + ", magasins=" + magasins + "]";
	}


	
	
	

	
	
	
}
