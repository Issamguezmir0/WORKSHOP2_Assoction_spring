package tn.esprit.foyer.Service;

import tn.esprit.foyer.Entity.Reservation;
import tn.esprit.foyer.Entity.Universite;

import java.util.List;

public interface IUniversiteService {
    public List<Universite> retrieveAllUniversite();
    public  Universite retrieveUniversite(Long idUniversite);
    public Universite addUniversite(Universite u);

    public  void  removeUniversite(Long idUniversite);
    public Universite modifyUniversite(Universite universite);

    //On va utulisé aprés ces methode
}
