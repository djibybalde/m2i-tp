package TPDeValidation.accessoire;

import TPDeValidation.Produit;

public abstract class Accessoire extends Produit {
    public Accessoire(String nom, double prix) {
        super(nom, prix);
    }

    @Override
    public String toString() {
        return "un " + this.nom + " qui coute " + super.toString();
    }
}
