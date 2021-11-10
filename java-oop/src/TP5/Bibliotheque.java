package TP5;

import java.util.ArrayList;
import java.util.Objects;

class Bibliotheque {

    // Attributes
    private final String NOM;
    private final ArrayList<Exemplaire> EXEMPLAIRES = new ArrayList<>();

    // Constructor
    public Bibliotheque(String nom) {
        this.NOM = nom;
        System.out.println("La bibliothèque " + nom + " est ouverte ! ");
    }

    // Getters
    public String getNom() {
        return NOM;
    }

    public int getNbExemplaires() {
        return EXEMPLAIRES.size();
    }

    // New method
    public void stocker(Oeuvre book, int n) {
        Exemplaire newBook = new Exemplaire(book);
        if (n > 1) for (int i = 1; i <= n; i++) EXEMPLAIRES.add(newBook);
        else EXEMPLAIRES.add(newBook);
    }

    public ArrayList<Exemplaire> listerExemplaires(String lang) {
        ArrayList<Exemplaire> exemple = new ArrayList<>();
        if (lang == null || lang.trim().equals("")) {
            exemple.addAll(EXEMPLAIRES);
        } else {
            for (Exemplaire exemplaire : EXEMPLAIRES) {
                if (Objects.equals(exemplaire.getOeuvre().getLang(), lang)) {
                    exemple.add(exemplaire);
                }
            }
        }
        return exemple;
    }

    public String compterExemplaires(Oeuvre oeuvre) {
        int countOeuvre = 0;
        for (Exemplaire exemplaire : EXEMPLAIRES) {
            if (exemplaire.getOeuvre() == oeuvre) countOeuvre++;
        }
        return String.format("Il y a %d exemplaires de Le Comte de Monte-Cristo", countOeuvre);
    }

    public void afficherAuteur(boolean prime) {
        System.out.println("Les auteurs a succes sont : ");
        for (Exemplaire exemplaire : EXEMPLAIRES) {
            if (exemplaire.getOeuvre().getAuteur().isPrime() == prime) {
                System.out.println("\t -> " + exemplaire.getOeuvre().getAuteur().getNom());
            }
        }
    }
}