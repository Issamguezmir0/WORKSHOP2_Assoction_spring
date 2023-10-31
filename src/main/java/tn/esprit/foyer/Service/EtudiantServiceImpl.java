package tn.esprit.foyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.Entity.Etudiant;
import tn.esprit.foyer.Repository.EtudiantRepository;

import java.util.List;


@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService{

    EtudiantRepository etudiantRepository;
    @Override
    public List<Etudiant> retrieveAllEtudiant() {
        return (List<Etudiant>) etudiantRepository.findAll();
    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public Etudiant addEtudiant(Etudiant et) {
        return etudiantRepository.save(et);
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
    etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public Etudiant modifyEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }
}
