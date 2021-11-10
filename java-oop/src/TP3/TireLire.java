package TP3;

public class TireLire {

    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() { // afficher() method
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
