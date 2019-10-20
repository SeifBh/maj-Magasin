/**
 * 
 */
package tn.esprit.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.demo.entities.Personne;

/**
 * @author Seif
 *
 */
@Repository
public interface PersonneRepository extends JpaRepository<Personne, Integer> {

	public Personne findPersonneByAge(int age);
}
