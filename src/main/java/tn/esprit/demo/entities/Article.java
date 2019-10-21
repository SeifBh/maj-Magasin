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


enum Type{
	   Solid, Liquide, Gaz;
	}

@Entity
@Access(AccessType.PROPERTY)
public class Article implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private Long id;
	private String ref;
	private String nom;
	private String description;
	private int quantite;



    private List<Magasin> magasins;
    
	
    
    
    
	
	public Article() {
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
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	@ManyToMany(mappedBy = "articles")
	public List<Magasin> getMagasins() {
		return magasins;
	}
	public void setMagasins(List<Magasin> magasins) {
		this.magasins = magasins;
	}
	public Article(Long id, String ref, String nom, String description, int quantite, List<Magasin> magasins) {
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
