package service;

import models.Eboursier;

import models.Chambre;
import models.Pavillon;

public interface IService {

    public void addPavillon();

    public void supprimerPavillon();

    public void listerPavillon();

    //////////////////////////////////////////////////////////////////////////

    public void addChambre();

    public void listerChambre();

    public void archiverChambre(Chambre chambre);

    ///////////////////////////////////////////////////////////////////////////////

    public void affecterChambrePavillon(Chambre chambre, Pavillon pavillon);

    public void addEtudiant();

    public void affecterChambreBoursier(Chambre chambre, Eboursier eboursier);

    public void listerChambrePavillon(Pavillon pavillon);

    public void listerEtudiantChambre(Chambre chambre);


}