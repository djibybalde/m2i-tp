package TPDeValidation.mecanisme;

import TPDeValidation.Produit;

public abstract class Mecanisme extends Produit {

    // attribute: each watch at least an hour
    protected String heure;

    // constructor
    public Mecanisme(double prix, String heure) {
        super(prix);
        this.heure = "une heure: " + heure;
    }

    // copy constructor without price
    public Mecanisme(String heure) {
        this.heure = "une heure: " + heure;
    }

    // cadran(heure, date, heure de reveil)
    protected String getCadran() {
        return heure;
    }

    protected abstract String getMecType();

    @Override
    public String toString() {
        return "de type " + this.getMecType() + " (avec " + this.getCadran() + ")";
    }
}
