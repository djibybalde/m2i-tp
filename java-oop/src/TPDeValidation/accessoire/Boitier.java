package TPDeValidation.accessoire;

public class Boitier extends Accessoire {
    public Boitier(String nom, double prix) {
        super(nom, prix);
        super.nom = nom.toLowerCase().contains("boitier") ? nom : "boitier " + nom;
    }
}
