package tn.esprit.foyer.Entity;
import lombok.*;
import jakarta.persistence.*;
import java.io.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Foyer implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "idFoyer")
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;

    @OneToOne(mappedBy = "foyer")
    private Universite universite;
}
