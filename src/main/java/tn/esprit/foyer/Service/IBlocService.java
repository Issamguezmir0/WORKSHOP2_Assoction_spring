package tn.esprit.foyer.Service;

import tn.esprit.foyer.Entity.Bloc;

import java.util.List;

public interface IBlocService {
    public List<Bloc> retrieveAllBloc();
    public  Bloc retrieveBloc(Long idBloc);
    public Bloc addBloc(Bloc b);

    public  void  removeBloc(Long idBloc);
    public Bloc modifyBloc(Bloc bloc);

    //On va utulisé aprés ces methode
}
