// TP5: https://bit.ly/3wm7D8V

package TP5;

public class Main {
    public static void main(String[] args) {

        Bibliotheque bibliotheque = new Bibliotheque("municipale");

        Auteur victorHugo = new Auteur("Victor Hugo", false);
        Oeuvre lesMiserables = new Oeuvre("Les Miserables", victorHugo, "francais");
        bibliotheque.stocker(lesMiserables, 2);

        Oeuvre hommeQuiRit = new Oeuvre("L’Homme qui rit", victorHugo, "");
        bibliotheque.stocker(hommeQuiRit, 1);

        Auteur alexandreDumas = new Auteur("Alexandre Dumas", false);
        Oeuvre comteMonteCristo = new Oeuvre("Le Comte de Monte-Cristo", alexandreDumas, "francais");
        bibliotheque.stocker(comteMonteCristo, 3);

        Auteur raymondQueneau = new Auteur("Raymond Queneau", true);
        Oeuvre ZazieDansLeMetro = new Oeuvre("Zazie dans le metro", raymondQueneau, "francais");
        bibliotheque.stocker(ZazieDansLeMetro, 1);

        Oeuvre TheCountOfMonteCristo = new Oeuvre("The count of Monte-Cristo", alexandreDumas, "anglais");
        bibliotheque.stocker(TheCountOfMonteCristo, 1);

        /*System.out.println();
        System.out.println(new Exemplaire(lesMiserables));
        System.out.println(new Exemplaire(hommeQuiRit));
        System.out.println(new Exemplaire(comteMonteCristo));
        System.out.println(new Exemplaire(ZazieDansLeMetro));*/

        System.out.println();
        bibliotheque.afficherAuteur(true);

        System.out.println();
        System.out.println(bibliotheque.compterExemplaires(comteMonteCristo));

        System.out.println("Exemplaires en anglais : ");
        System.out.println(bibliotheque.listerExemplaires("anglais"));

        System.out.println("Total exemplaires: " + bibliotheque.getNbExemplaires());

    }
}
