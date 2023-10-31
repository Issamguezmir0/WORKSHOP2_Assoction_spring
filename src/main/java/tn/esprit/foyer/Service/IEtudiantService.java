package tn.esprit.foyer.Service;

import tn.esprit.foyer.Entity.Etudiant;

import java.util.List;

public interface IEtudiantService {

    public List<Etudiant> retrieveAllEtudiant();
    public  Etudiant retrieveEtudiant(Long idEtudiant);
    public Etudiant addEtudiant(Etudiant et);

    public  void  removeEtudiant(Long idEtudiant);
    public Etudiant modifyEtudiant(Etudiant etudiant);

    //On va utulisé aprés ces methode

}
