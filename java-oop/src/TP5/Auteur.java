package TP5;

class Auteur {

    // Attributes
    private final String NOM;
    private final boolean PRIME;

    // Constructor
    public Auteur(String nom, boolean prime) {
        this.NOM = nom;
        this.PRIME = prime;
    }

    // Getters
    public String getNom() {
        return NOM;
    }

    public boolean isPrime() {
        return PRIME;
    }
}
