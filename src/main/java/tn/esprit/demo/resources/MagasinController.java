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

import tn.esprit.demo.entities.Magasin;
import tn.esprit.demo.entities.Personne;
import tn.esprit.demo.services.MagasinService;

@RestController
@RequestMapping("magasins")
public class MagasinController implements IMagasinController {

	@Autowired
	MagasinService magasinService;
	
	@PostMapping
	@Override
	public ResponseEntity createMagasin(Magasin magasin) {
		
		
		magasinService.addMagasin(magasin);
		return ResponseEntity.status(HttpStatus.OK).body("magasin cree avec success");
	}

	@GetMapping
	@Override
	public ResponseEntity<List<Magasin>> getAllMagasin() {
		
		return ResponseEntity.status(HttpStatus.OK).body(magasinService.getAllMagasin());

	}

	@DeleteMapping
	@Override
	public ResponseEntity deleteMagasin(Magasin magasin) {


		magasinService.deletePersonne(magasin);
		return ResponseEntity.status(HttpStatus.OK).body("magasin supprime avec success");
		
	}

}
