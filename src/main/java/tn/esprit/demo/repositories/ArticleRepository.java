package tn.esprit.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.demo.entities.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

  
    
}
