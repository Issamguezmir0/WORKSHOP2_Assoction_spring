package tn.esprit.foyer.Service;

import tn.esprit.foyer.Entity.Chambre;

import java.util.List;

public interface IChambreService {
    public List<Chambre> retrieveAllChambre();
    public  Chambre retrieveChambre(Long idChambre);
    public Chambre addChambre(Chambre c);

    public  void  removeChamvre(Long idChambre);
    public Chambre modifyChambre(Chambre chambre);

    //On va utulisé aprés ces methode
}
