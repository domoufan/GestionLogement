package models;

public class Etage {
    
    protected int numEtage;
    public int getNumEtage() {
        return numEtage;
    }
    public void setNumEtage(int numEtage) {
        this.numEtage = numEtage;
    }
    protected int nbrDeChambre;
    public int getNbrDeChambre() {
        return nbrDeChambre;
    }
    public void setNbrDeChambre(int nbrDeChambre) {
        this.nbrDeChambre = nbrDeChambre;
    }
    protected Chambre[] chambres ;
    public Chambre[] getChambres() {
        return chambres;
    }
    public void setChambres(Chambre[] chambres) {
        this.chambres = chambres;
    }

}
