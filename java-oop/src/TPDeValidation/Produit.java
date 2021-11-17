package TPDeValidation;

public abstract class Produit {
    protected String nom;
    protected double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public Produit(double prix) {
        this.prix = prix;
    }

    public Produit() {
        this.prix = 0.0;
    }

    public double getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return String.valueOf(this.getPrix());
    }
}
