package tn.esprit.foyer.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.security.PrivateKey;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Bloc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idBloc")
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;

    @OneToMany (cascade = CascadeType.ALL, mappedBy = "bloc")
    private Set<Chambre> Chambres;
 @ManyToOne
    Universite universite;
}
