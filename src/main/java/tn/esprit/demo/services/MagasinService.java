package tn.esprit.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.demo.entities.Article;
import tn.esprit.demo.entities.Magasin;
import tn.esprit.demo.entities.Personne;
import tn.esprit.demo.repositories.MagasinRepository;

@Service
public class MagasinService {

	
	@Autowired
	MagasinRepository magasinRepository;
	
	public void addMagasin(Magasin magasin) {
		magasinRepository.save(magasin);
	}
	

	public void deletePersonne(Magasin magasin) {
		magasinRepository.delete(magasin);
	}
	
	public List<Magasin> getAllMagasin(){
		
		return magasinRepository.findAll();
	}
	
	
	
	public Boolean verifMonoMagasin(Article article,Magasin magasin) {
		
		
		return null;
	}

	
	
	
}
