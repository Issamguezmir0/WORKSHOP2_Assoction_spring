package tn.esprit.foyer.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.Entity.Universite;

@Repository
public interface UniversiteRepository extends CrudRepository<Universite, Long> {
}
