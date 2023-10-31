package tn.esprit.foyer.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.Entity.Chambre;

@Repository
public interface ChambreRepository extends CrudRepository<Chambre ,Long> {
}
