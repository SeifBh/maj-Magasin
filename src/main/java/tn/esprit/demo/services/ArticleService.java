package tn.esprit.demo.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import tn.esprit.demo.entities.Article;
import tn.esprit.demo.entities.Magasin;
import tn.esprit.demo.repositories.ArticleRepository;
import tn.esprit.demo.repositories.MagasinRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class ArticleService {

	public static Logger logger = LoggerFactory.getLogger(ArticleService.class);

	
	@Autowired
	ArticleRepository articleRepository;
	
	@Autowired
	MagasinRepository magasinRepository;
	
	public void addArticle(Article article) {
		
		articleRepository.save(article);
		
		
		
	}
	
	public List<Article> getAllArticles() {
		
		return (List<Article>) articleRepository.findAll();
	}
	
	public void deleteArticle(Article article) {
		articleRepository.delete(article);
	}
	
	public Boolean updateStockArticleMonoMagasin(Long idArticle,Long idMagasin,int quantite) {
		
		
		Article art = new Article() ;
		
		Magasin mag = new Magasin() ;
		
		if (articleRepository.existsById(art.getId())) {
		
		
		
			art.setQuantite(quantite);
			return true;
		}
		return false;
		 
		
	}
	
	public Boolean updateStockArticleMultiMagasin(Long idArticle,Set<Magasin> magasin,int quantite) {
		
		
	     Set<Magasin> magasins = new HashSet<Magasin>();
	     List<Magasin> listM ;
	     listM = magasinRepository.findAll();
	     
	     for (Magasin ms : listM) {
			magasins.add(ms);
		}
	    
		Article art = new Article();
		
		
		
			art.setQuantite(quantite);
			return true;
		
		 
		
	}
	
	
	public Boolean logginSolV3(Article art) {
		
		art.setQuantite(20);
		logger.info("article nom : " +art.getNom() + "article stock = "+art.getQuantite());

		

		return true;
	}
	

}
