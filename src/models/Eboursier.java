package models;

public class Eboursier extends Eloger {

    protected TypeDeBourse typeDeBourse ;
    
    public TypeDeBourse getTypeDeBourse() {
        return typeDeBourse;
    }

    public void setTypeDeBourse(TypeDeBourse typeDeBourse) {
        this.typeDeBourse = typeDeBourse;
    }

    protected float  montantBourse;

    public float getMontantBourse() {
        return montantBourse;
    }

    public void setMontantBourse(float montantBourse) {
        this.montantBourse = montantBourse;
    }

}
