package tn.esprit.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.demo.entities.Article;
import tn.esprit.demo.entities.Magasin;
import tn.esprit.demo.services.ArticleService;

@RestController
@RequestMapping("articles")
public class ArticleController implements IArticleController {

	@Autowired
	ArticleService articleService;
	
	@PostMapping
	@Override
	public ResponseEntity createArticle(Article article) {

		articleService.addArticle(article);
		return ResponseEntity.status(HttpStatus.OK).body("Article crée avec succes");
		
		
	}

	@GetMapping
	@Override
	public ResponseEntity<List<Article>> getAllArticle() {
		return ResponseEntity.status(HttpStatus.OK).body(articleService.getAllArticles());
	}

	@DeleteMapping
	@Override
	public ResponseEntity deleteArticle(Article article) {

		articleService.deleteArticle(article);
		return ResponseEntity.status(HttpStatus.OK).body("Article supprimé avec succes");
		
		
		
	}

	
}
