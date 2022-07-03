package models;

public class Chambre {

    private int id;
    private int numEtage;
    private String numChambre;// string a generer
    private TypeDeChambre type;
    private Pavillon pavillon;

    public Chambre(){
        id++;
        numChambre = "ch000"+id;
    }
    public int getId() {
        return id;
    }


    public int getNumEtage() {
        return numEtage;
    }

    public void setNumEtage(int numEtage) {
        this.numEtage = numEtage;
    }

    public String getNumChambre() {
        return numChambre;
    }

    public void setNumChambre(String numChambre) {
        this.numChambre = numChambre;
    }

    public TypeDeChambre getType() {
        return type;
    }

    public void setType(TypeDeChambre type) {
        this.type = type;
    }

    public Pavillon getPavillon() {
        return pavillon;
    }

    public void setPavillon(Pavillon pavillon) {
        this.pavillon = pavillon;
    }

    public String toString() {

        return "Chambre[id=" + id + ",numEtage=" + numEtage + ",numChambre=" + numChambre + ",type=" + type
                + ",pavillon=" + pavillon + "]";
    }

}
