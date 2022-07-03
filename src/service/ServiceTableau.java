package service;

import java.util.Scanner;

import models.Chambre;
import models.Eboursier;
import models.Pavillon;
import models.TypeDeChambre;

public class ServiceTableau implements IService {

    private final int TAILLEPAV = 5;
    private final int TAILLECHA = 5;
    private int indexPav;
    private int indexCha;
    public Pavillon[] pavillons = new Pavillon[TAILLEPAV];
    public Chambre[] chambres = new Chambre[TAILLECHA];
    Scanner sc = new Scanner(System.in);

    @Override
    public void addChambre() {

        System.out.println("\t\t Ajout d'une nouvelle chambre \n");

        if (indexCha < TAILLECHA) {
            Chambre chambre = new Chambre();
            // Scanner sc = new Scanner(System.in);

            System.out.println("\t\t Definissez le numero de l'etage \n");
            int numEtage = sc.nextInt();
            chambre.setNumEtage(numEtage);
            sc.nextLine();

            System.out.println("\t\t Definissez le type de chambre 1) pour INDIVIDUEL et 2) pour DOUBLE \n");
            int choixType = sc.nextInt();
            switch (choixType) {
                case 1:
                    chambre.setType(TypeDeChambre.INDIVIDUEL);

                    break;
                case 2:
                    chambre.setType(TypeDeChambre.DOUBLE);

                    break;
                default:
                    break;
            }

            System.out.println("\t\t Definissez le pavillon entre 1 et " + TAILLEPAV + "\n");
            int numPav = sc.nextInt();
            chambre.setPavillon(pavillons[numPav]);
            sc.nextLine();

            chambres[indexCha] = chambre;
            indexCha++;

            System.out.println("\t\t Vous avez ajouter :" + chambre.toString());
        } else {

        }

    }

    @Override
    public void addEtudiant() {

        System.out.println("DANS ajout Etudiant");

    }

    @Override
    public void addPavillon() {

        System.out.println("\t\t Ajout d'un pavillon \n");

        if (indexPav < TAILLEPAV) {

            Pavillon pavillon = new Pavillon();
            // Scanner sc = new Scanner(System.in);

            System.out.println("\t Entrer le nombre d'etage du pavillon ou 0 pour annuler: \n");
            int nbrEtage = sc.nextInt();
            sc.nextLine();
            pavillon.setNbrEtage(nbrEtage);

            pavillons[indexPav] = pavillon;
            indexPav++;

            System.out.println("\t\t Vous avez ajouter :" + pavillon.toString() + "\n\n");

            // listerPavillon();
            // addPavillon();

            System.out.println(
                    "\t\t Tapez 1 pour ajoutez un autre ou 0 pour revenir au menu ou sur n'importe quelle touche pour quitter\n");

        } else {

            System.out.println("\t Le pavillon est plein  \n");
        }

    }

    @Override
    public void affecterChambreBoursier(Chambre chambre, Eboursier eboursier) {
        // TODO Auto-generated method stub

    }

    @Override
    public void affecterChambrePavillon(Chambre chambre, Pavillon pavillon) {

    }

    @Override
    public void archiverChambre(Chambre chambre) {
        // TODO Auto-generated method stub

    }

    @Override
    public void listerChambre() {

        System.out.println("\t\t Lister Les Chambres \n\n");

        for (Chambre chambre : chambres) {

            System.out.println("\t\t " + chambre + " \n");
        }
    }

    @Override
    public void listerChambrePavillon(Pavillon pavillon) {
        // TODO Auto-generated method stub

    }

    @Override
    public void listerEtudiantChambre(Chambre chambre) {
        // TODO Auto-generated method stub

    }

    @Override
    public void listerPavillon() {

        System.out.println("\t\t Lister Les Pavillons \n\n");

        for (Pavillon pavillon : pavillons) {

            System.out.println("\t\t " + pavillon + " \n");
        }
    }

    @Override
    public void supprimerPavillon() {
        System.out.println("\t\t Suppression de pavillon \n");

        for (int j = 0; j < 3; j++) {
            addPavillon();
        }

        listerPavillon();

        System.out.println("\t\t Entrez l'id du pavillon a supprimer : \n");

        int idpav = sc.nextInt();
        int i = 0, a = 0;

        for (Pavillon pavillon : pavillons) {

            if (a == 1) {

                pavillons[i - 1] = pavillon;
                System.out.println("\t\t " + pavillons[i-1] + " \n");
                System.out.println("\t\t Suppression reussi ! \n");
            }
            if (pavillon != null) {
                if (pavillon.getId() == idpav) {
                    a = 1;
                }
            }

            i++;
        }

        pavillons[i-1] = null;

        listerPavillon();
    }

}
