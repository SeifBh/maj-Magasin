package tn.esprit.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.demo.entities.Personne;
import tn.esprit.demo.repositories.PersonneRepository;

@Service
public class PersonneService {

	@Autowired
	PersonneRepository personneRepo;
	
	public void addPersonne(Personne person) {
		personneRepo.save(person);
	}
	
	public void updatePersonn(Personne personne) {
		
		//TODOseif
	}
	public void deletePersonne(Personne person) {
		personneRepo.delete(person);
	}
	
	public List<Personne> getAllPersonne(){
		
		return personneRepo.findAll();
	}
	
	
}
