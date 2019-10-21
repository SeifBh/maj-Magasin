package tn.esprit.demo.services;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import tn.esprit.demo.entities.Article;
import tn.esprit.demo.entities.Magasin;
import tn.esprit.demo.services.ArticleService;

public class ArticleServiceTest {

	
	private ArticleService articleService;
	private MagasinService magasinService;
	
	

	@Before
	public void setUp() {
		articleService = new ArticleService();
		magasinService = new MagasinService();
		
	}
	
	
	 
//Version 1 : Mise a jour stock d'un article pour une seule magasin avec un test sur la quantité et l'exsistence du produit dans une magasin
	 
	@Test
	public void CheckUpdateV1(int quantite) {


		//Init
		List<Article> listeArticles = new ArrayList<Article>();
		
		List<Magasin> listeMagasin = new ArrayList<Magasin>();

		
		  
		Article article1 = new Article((long) 1,"ABC-100","Samsung","Portable",5,listeMagasin);
		Article article2 = new Article((long) 2,"ABC-200","Apple","Iphone",2,listeMagasin);
		Article article3 = new Article((long) 3,"ABC-300","Nokia","Nokia 41",14,listeMagasin);

		
		
		listeArticles.add(article1);
		listeArticles.add(article2);
		listeArticles.add(article3);

		Magasin magasin1 = new Magasin((long) 1,"Store1","Tunis",listeArticles);
		Magasin magasin2 = new Magasin((long) 2,"Store2","Sousse",listeArticles);
		Magasin magasin3 = new Magasin((long) 3,"Store3","Sfax",listeArticles);

		
		listeMagasin.add(magasin1);
		listeMagasin.add(magasin2);
		listeMagasin.add(magasin3);
		
		//Action
		boolean res1;
		if (quantite >= 0 ) {
			res1 = articleService.updateStockArticleMonoMagasin(article1.getId(), magasin1.getId(), quantite);

		}
		else {
			res1 = false;
		}
		
		
		//Assertion
		
		assertThat(res1).isTrue();

		
	

	}
	
	
		 //Version 2 : Mise a jour stock d'un article pour plusieur magasin

	@Test
	public void CheckUpdateV2(int quantite) {


		//Init
		List<Article> listeArticles = new ArrayList<Article>();
		List<Magasin> listeMagasin = new ArrayList<Magasin>();
		Article article1 = new Article((long) 1,"ABC-100","Samsung","Portable",5,listeMagasin);
		Article article2 = new Article((long) 2,"ABC-200","Apple","Iphone",2,listeMagasin);
		Article article3 = new Article((long) 3,"ABC-300","Nokia","Nokia 41",14,listeMagasin);
		listeArticles.add(article1);
		listeArticles.add(article2);
		listeArticles.add(article3);
		Magasin magasin1 = new Magasin((long) 1,"Store1","Tunis",listeArticles);
		Magasin magasin2 = new Magasin((long) 2,"Store2","Sousse",listeArticles);
		Magasin magasin3 = new Magasin((long) 3,"Store3","Sfax",listeArticles);
		listeMagasin.add(magasin1);
		listeMagasin.add(magasin2);
		listeMagasin.add(magasin3);
		
		
		//Action
		
		boolean res2;
		if (quantite >= 0 ) {
			 res2 = articleService.updateStockArticleMultiMagasin(article1.getId(), (Set<Magasin>) listeMagasin, quantite);

		}
		else {
			res2 = false;
		}
		
		
		//Assertion
		assertThat(res2).isTrue();

		
	

	}
	
	
	 //Version 3: Mise a jour stock d'un article avec loggin

	@Test
	public void LoggingV3() {

		List<Magasin> listeMagasin = new ArrayList<Magasin>();

		Article article1 = new Article((long) 1,"ABC-100","Samsung","Portable",5,listeMagasin);

		//Action
		boolean res3 = articleService.logginSolV3(article1);
		
		//Assertion

		assertThat(res3).isTrue();

	}
	
	
	
	
}
