package models;

public class Etudiant extends Personne {
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    protected String matricule;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    protected String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    protected String date_de_naisssance;

    public String getDate_de_naisssance() {
        return date_de_naisssance;
    }

    public void setDate_de_naisssance(String date_de_naisssance) {
        this.date_de_naisssance = date_de_naisssance;
    }
}
