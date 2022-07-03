package models;

public class Pavillon {

    private static int nombre ;
    private int id;
    private String numPav;
    private int nbrEtage;

    public Pavillon()
    {
        id = ++nombre;
        numPav = "pv000" + id;

    }
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumPav() {
        return numPav;
    }

    public void setNumPav(String numPav) {
        this.numPav = numPav;
    }

    public int getNbrEtage() {
        return nbrEtage;
    }

    public void setNbrEtage(int nbrEtage) {
        this.nbrEtage = nbrEtage;
    }

    public String toString(){

        return "Pavillon[id="+id+",nbrEtage="+nbrEtage+",numPav="+numPav+"]";
    }
}
