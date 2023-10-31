package tn.esprit.foyer.control;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.Entity.Foyer;
import tn.esprit.foyer.Entity.Reservation;
import tn.esprit.foyer.Service.IReservationService;

import java.util.List;

@Tag(name = "Gestion Reservation")
@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {
IReservationService reservationService;

    @GetMapping("/retrieve-all-reservation")
    public List<Reservation> getReservation() {
        List<Reservation> listReservation = reservationService.retrieveAllReservation();
        return listReservation;
    }
    @GetMapping("/retrieve-Reservation/{Reservation-id}")
    public Reservation retrieveReservation(@PathVariable("reservation-id") Long chId) {
        Reservation reservation = reservationService.retrieveReservation(String.valueOf(chId));
        return reservation;
    }
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        Reservation reservation= reservationService.addReservation(r);
        return reservation;
    }

    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void removeReservation(@PathVariable("reservation-id") Long chId) {
        reservationService.removeReservation(String.valueOf(chId));
    }
    @PutMapping("/modify-reservation")
    public Reservation modifyReservation(@RequestBody Reservation r) {
        Reservation reservation =  reservationService.modifyReservation(r);
        return reservation;
    }
}
