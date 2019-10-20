package tn.esprit.demo.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import tn.esprit.demo.entities.Article;
import tn.esprit.demo.entities.Magasin;

public interface IArticleController {

	
	public ResponseEntity createArticle(@RequestBody Article article);
	public ResponseEntity<List<Article>> getAllArticle();
	public ResponseEntity deleteArticle(@RequestBody Article article);
	
	
}
