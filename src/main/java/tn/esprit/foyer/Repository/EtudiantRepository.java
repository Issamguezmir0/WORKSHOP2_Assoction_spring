package tn.esprit.foyer.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.Entity.Etudiant;


@Repository
public interface EtudiantRepository extends CrudRepository <Etudiant, Long>{
}
