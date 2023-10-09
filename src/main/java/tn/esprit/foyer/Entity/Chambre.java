package tn.esprit.foyer.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Chambre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idChambre")
    private Long idChambre;
    private Long numeroChambre;
    private TypeChambre typeC;

    @OneToMany (cascade =  CascadeType.ALL, mappedBy = "chambre")
    private Set<Reservation> Reservaton;
    @ManyToOne
    Bloc bloc;
}
