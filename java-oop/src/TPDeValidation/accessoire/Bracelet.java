package TPDeValidation.accessoire;

public class Bracelet extends Accessoire {
    public Bracelet(String nom, double prix) {
        super(nom, prix);
        super.nom = nom.toLowerCase().contains("bracelet") ? nom : "bracelet " + nom;
    }
}
