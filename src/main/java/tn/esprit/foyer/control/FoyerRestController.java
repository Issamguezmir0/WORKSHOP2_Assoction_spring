package tn.esprit.foyer.control;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyer.Entity.Etudiant;
import tn.esprit.foyer.Entity.Foyer;
import tn.esprit.foyer.Service.IFoyerService;

import java.util.List;
@Tag(name = "Gestion Foyer")
@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerRestController {
    IFoyerService foyerService;

    @GetMapping("/retrieve-all-foyer")
    public List<Foyer> getFoyer() {
        List<Foyer> listFoyer = foyerService.retrieveAllFoyer();
        return listFoyer;
    }
    @GetMapping("/retrieve-foyer/{foyer-id}")
    public Foyer retrieveFoyer(@PathVariable("foyer-id") Long chId) {
        Foyer foyer = foyerService.retrieveFoyer(chId);
        return foyer;
    }
    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        Foyer foyer= foyerService.addFoyer(f);
        return foyer;
    }

    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void removeFoyer(@PathVariable("foyer-id") Long chId) {
        foyerService.removeFoyer(chId);
    }
    @PutMapping("/modify-foyer")
    public Foyer modifyFoyer(@RequestBody Foyer f) {
        Foyer foyer =  foyerService.modifyFoyer(f);
        return foyer;
    }
}
