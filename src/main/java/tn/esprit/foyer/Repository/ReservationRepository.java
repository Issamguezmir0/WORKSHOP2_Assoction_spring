package tn.esprit.foyer.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyer.Entity.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, String> {
}
