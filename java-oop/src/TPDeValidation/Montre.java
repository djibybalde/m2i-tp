package TPDeValidation;

import TPDeValidation.accessoire.Accessoire;
import TPDeValidation.mecanisme.Mecanisme;

import java.util.ArrayList;

public class Montre extends Produit {
    private Mecanisme mecanisme;
    private final ArrayList<Accessoire> ACCESSOIRES;

    // constructor
    public Montre(double prix, Mecanisme mecanisme) {
        super(prix);
        this.mecanisme = mecanisme;
        this.ACCESSOIRES = new ArrayList<>();
    }

    // copy constructor without price
    public Montre(Mecanisme mecanisme) {
        this.mecanisme = mecanisme;
        this.ACCESSOIRES = new ArrayList<>();
    }

    // copy constructor without mechanism and price
    public Montre() {
        this.ACCESSOIRES = new ArrayList<>();
    }

    // add watch(montre) accessories
    public void add(Accessoire accessoire) {
        this.ACCESSOIRES.add(accessoire);
    }

    // compute the price
    @Override
    public double getPrix() {
        // prixMontre = prixDeBase + sum(prixDesAccessoires) + prixDuMecanisme (if exist)
        double prixMontre = super.getPrix();
        for (Accessoire accessoire : ACCESSOIRES) {
            prixMontre += accessoire.getPrix();
        }
        return prixMontre + this.mecanisme.getPrix();
    }

    // show details
    public void display() {
        System.out.println("La montre " + this.mecanisme + " possède:");
        for (Accessoire accessoire : ACCESSOIRES) {
            System.out.println("\t- " + accessoire + "€");
        }
        if(this.mecanisme.getPrix()>0.0) {
            System.out.printf("\t- la valeur du mécanisme, seul, est estimée à %.2f€\n", this.mecanisme.getPrix());
        }
        System.out.printf("Et sa valeur totale vaut %.2f€\n",  this.getPrix());
    }
}
