package tn.esprit.demo.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import tn.esprit.demo.entities.Article;
import tn.esprit.demo.entities.Magasin;
import tn.esprit.demo.entities.Personne;

public interface IMagasinController {

	public ResponseEntity createMagasin(@RequestBody Magasin magasin);
	public ResponseEntity<List<Magasin>> getAllMagasin();
	public ResponseEntity deleteMagasin(@RequestBody Magasin magasin);
	
}
