package pages;

import java.util.Scanner;
import service.ServiceTableau;


public class Accueil {
    
    public void affichageMenu(){

        System.out.println("\t\t\t\t\t\t BIENVENUE DANS LE MENU ! CHOISISSEZ UNE OPTION \n\n\n");

        System.out.println("\t\t 1) Ajouter une chambre \n");
        System.out.println("\t\t 2) Ajouter un etudiant \n");
        System.out.println("\t\t 3) Ajouter un pavillon \n");

        System.out.println("\t\t 4) Affecter une chambre a un etudiant boursier \n");
        System.out.println("\t\t 5) Affecter une chambre a un pavillon \n");

        System.out.println("\t\t 6) Lister les chambres d'un pavillon \n");
        System.out.println("\t\t 7) Lister les etudiant d'une chambre \n");
        System.out.println("\t\t 8) Lister les pavillons \n");
        System.out.println("\t\t 9) Lister les chambres \n");

        System.out.println("\t\t 10) Archiver une chambre \n");
        System.out.println("\t\t 11) Supprimer un pavillon \n");

        System.out.println("\t\t\t\t\t\t TAPEZ 0 pour quitter !  \n");

    }

    public void executeMenu(){


        ServiceTableau stab = new ServiceTableau();
        Scanner sc = new Scanner(System.in);

        int choix = sc.nextInt();
        sc.nextLine();

        switch (choix) {
            case 0:

                break;
            case 1:
                stab.addChambre();
                break;
            case 2:
                //stab.addEtudiant();
                break;
            case 3:
                stab.addPavillon();
                break;
            case 4:
                //stab.affecterChambreBoursier(chambre, eboursier);
                break;
            case 5:
                //stab.affecterChambrePavillon(chambre, pavillon);
                break;
            case 6:
                //stab.listerChambrePavillon(pavillon);
                break;
            case 7:
                //stab.listerEtudiantChambre(chambre);
                break;
            case 8:
                stab.listerPavillon();
                break;
            case 9:
                stab.listerChambre();
                break;
            case 10:
                //stab.archiverChambre(chambre);
                break;
            case 11:
                stab.supprimerPavillon();
                break;
            default:
                break;
        }
    }

}