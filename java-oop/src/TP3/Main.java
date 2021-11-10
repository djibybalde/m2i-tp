// TP3 - Tirelire : https://bit.ly/3wm7D8V

package TP3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TireLire tireTire = new TireLire();

        tireTire.setAmount(0.0);
        System.out.println(tireTire);
        tireTire.secouer();

        tireTire.remplir(550.0);
        System.out.println(tireTire);
        tireTire.secouer();

        tireTire.puiser(15.0);
        System.out.println(tireTire);
        tireTire.secouer();

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Donnez le budget de vos vacances : ");
        double budget = keyboard.nextDouble();
        while (budget < 0) {
            System.out.print("Ce montant doit être positif, Essayer à nouveau : ");
            budget = keyboard.nextDouble();
        }
        double solde = tireTire.calculerSold(budget);
        if (solde > 0) {
            System.out.printf("Vous êtes assez riche pour partir en vacances ! il vous restera %.2f euros à la rentrée", solde);
        } else {
            System.out.printf("Il vous manque %.2f euros pour partir en vacances ! ", Math.abs(solde));
        }
    }
}
