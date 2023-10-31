package tn.esprit.foyer.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.Entity.Bloc;

@Repository
public interface BlocRepository extends CrudRepository<Bloc , Long> {
}
