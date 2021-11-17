package TPDeValidation.accessoire;

public class Vitre extends Accessoire {
    public Vitre(String nom, double prix) {
        super(nom, prix);
        super.nom = nom.toLowerCase().contains("vitre") ? nom : "vitre " + nom;
    }
}
