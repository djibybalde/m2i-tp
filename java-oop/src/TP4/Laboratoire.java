// TP4: https://bit.ly/3wm7D8V

package TP4;

public class Laboratoire {
    public static void main(String[] args) {
        Souris souris1 = new Souris(50, "blanche");
        Souris souris2 = new Souris(45, "grise");
        Souris souris3 = new Souris(45, "grise");

        for (int i = 1; i <= 2; i++) souris1.vieillir();
        System.out.println(souris1);
        System.out.println(souris2);

        Souris clonneeSouris3 = new Souris(souris3);
        System.out.println(clonneeSouris3);

        souris1.evolue();
        souris2.evolue();

        System.out.println(souris1);
        System.out.println(souris2);

        for (int i = 1; i <= 28; i++) clonneeSouris3.vieillir();
        System.out.println(clonneeSouris3);
    }
}
