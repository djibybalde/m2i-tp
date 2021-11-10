package TP5;

class Oeuvre {

    // Attributes
    private final String TITRE;
    private final Auteur AUTEUR;
    private final String LANG;

    // Constructor
    public Oeuvre(String titre, Auteur auteur, String lang) {
        this.TITRE = titre;
        this.AUTEUR = auteur;
        this.LANG = lang == null || lang.trim().equals("") ? "francais" : lang;
    }

    // Getters
    public String getTitre() {
        return TITRE;
    }

    public Auteur getAuteur() {
        return AUTEUR;
    }

    public String getLang() {
        return LANG;
    }

    @Override  // Afficher method
    public String toString() {
        return this.getTitre() + ", " +
                this.getAuteur().getNom() + ", " +
                this.getLang();
    }
}
