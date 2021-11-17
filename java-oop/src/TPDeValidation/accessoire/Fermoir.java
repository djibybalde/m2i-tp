package TPDeValidation.accessoire;

public class Fermoir extends Accessoire {
    public Fermoir(String nom, double prix) {
        super(nom, prix);
        super.nom = nom.toLowerCase().contains("fermoir") ? nom : "fermoir " + nom;
    }
}
