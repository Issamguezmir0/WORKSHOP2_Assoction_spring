package tn.esprit.foyer.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.Entity.Foyer;

@Repository
public interface FoyerRepository extends CrudRepository<Foyer, Long> {
}
