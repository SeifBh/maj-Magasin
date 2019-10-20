package tn.esprit.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.demo.entities.Personne;
import tn.esprit.demo.services.PersonneService;

@RestController
@RequestMapping("personnes")
public class PersonneController implements IPersonneController{

	@Autowired
	PersonneService personneService;
	
	@PostMapping
	@Override
	public ResponseEntity createPersonne(Personne personne) {
		
		personneService.addPersonne(personne);
		
		return ResponseEntity.status(HttpStatus.OK).body("Personne crée avec succes");
		
	}
	
	@GetMapping
	@Override
	public ResponseEntity<List<Personne>> getAllPersonne() {
		return ResponseEntity.status(HttpStatus.OK).body(personneService.getAllPersonne());
	}

	@DeleteMapping
	@Override
	public ResponseEntity deletePersonne(Personne persoone) {
	personneService.deletePersonne(persoone);
		
		return ResponseEntity.status(HttpStatus.OK).body("Personne : "+persoone.getNom()+" a été supprimé avec success");

	}

	

	
}
