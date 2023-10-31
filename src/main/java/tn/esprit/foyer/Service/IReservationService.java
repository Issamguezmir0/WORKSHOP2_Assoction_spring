package tn.esprit.foyer.Service;

import tn.esprit.foyer.Entity.Reservation;

import java.util.List;

public interface IReservationService {

    public List<Reservation> retrieveAllReservation();
    public  Reservation retrieveReservation(String idReservation);
    public Reservation addReservation(Reservation r);

    public  void  removeReservation(String idReservation);
    public Reservation modifyReservation(Reservation reservation);

    //On va utulisé aprés ces methode
}
