package tn.esprit.foyer.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyer.Entity.Chambre;
import tn.esprit.foyer.Repository.ChambreRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ChambreServiceImpl implements IChambreService{


    ChambreRepository chambreRepository;
    @Override
    public List<Chambre> retrieveAllChambre() {
        return (List<Chambre>) chambreRepository.findAll();
    }

    @Override
    public Chambre retrieveChambre(Long idChambre) {
        return (Chambre) chambreRepository.findById(idChambre).get();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return (Chambre) chambreRepository.save(c);
    }

    @Override
    public void removeChamvre(Long idChambre) {
    chambreRepository.deleteById(idChambre);
    }

    @Override
    public Chambre modifyChambre(Chambre chambre) {
        return (Chambre) chambreRepository.save(chambre);
    }
}
