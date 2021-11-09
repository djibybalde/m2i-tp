import java.util.Scanner;

public class TP3 {
    // TP3 - tiretire : https://bit.ly/3wm7D8V
    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() { // afficher()
        return amount > 0 ? "Vous avez " + amount + " € dans votre tirelire." : "Vous êtes sans le sou.";
    }

    public void secouer() {
        if (amount > 0)
            System.out.println("Bing bing\n");
    }

    public void remplir(double newAmount) {
        if (newAmount > 0) {
            this.amount += newAmount;
        }
    }

    public void vider() {
        this.amount = 0.0;
    }

    public void puiser(double newAmount) {
        if (newAmount >= amount) {
            this.vider();
            System.out.println("Vous avez retiré " + amount + ". Votre nouveau solde est 0.0€.");
        } else {
            this.amount -= newAmount;
        }
    }

    public double calculerSold(double budget) {
        return budget <= 0.0 ? amount : amount - budget;
    }
}

class TP3Main {
    public static void main(String[] args) {
        TP3 tireTire = new TP3();

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
