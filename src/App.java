import pages.Accueil;

public class App {
    public static void main(String[] args) throws Exception {
        
        Accueil acc = new Accueil();

        acc.affichageMenu();
        acc.executeMenu();
    }
}
