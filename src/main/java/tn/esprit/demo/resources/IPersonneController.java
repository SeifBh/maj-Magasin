package tn.esprit.demo.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import tn.esprit.demo.entities.Personne;

public interface IPersonneController {

	public ResponseEntity createPersonne(@RequestBody Personne personne);
	public ResponseEntity<List<Personne>> getAllPersonne();
	public ResponseEntity deletePersonne(@RequestBody Personne persoone);
	
	
}
