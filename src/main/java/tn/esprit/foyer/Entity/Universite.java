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
public class Universite implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "idUniversite")
private Long idUniversite;
private String nomUniversite;
private String adresse;
@OneToMany (cascade = CascadeType.ALL, mappedBy = "universite")
    private Set<Bloc> Blocs;
@OneToOne
    private Foyer foyer;
}
