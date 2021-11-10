package TP5;

class Exemplaire {

    // Attributes
    private Oeuvre oeuvre;

    // Constructor : Constructor par default par default
    public Exemplaire(Oeuvre Oeuvre) {
        this.oeuvre = Oeuvre;
        System.out.println("Nouvel exemplaire -> " +
                Oeuvre.getTitre() + ", " +
                Oeuvre.getAuteur().getNom() + ", en " +
                Oeuvre.getLang()
        );
    }

    // Constructor : Constructor de copie
    public Exemplaire(Exemplaire Exemplaire) {
        System.out.println("Copie d’un exemplaire de -> " +
                Exemplaire.oeuvre.getTitre() + ", " +
                Exemplaire.oeuvre.getAuteur().getNom() + ", en " +
                Exemplaire.oeuvre.getLang()
        );
    }

    // Getter
    public Oeuvre getOeuvre() {
        return oeuvre;
    }

    @Override  // Afficher method
    public String toString() {
        return "Un exemplaire de " + this.oeuvre;
    }
}