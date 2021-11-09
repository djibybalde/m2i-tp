import java.util.Scanner;

public class TP2 {
    // Le but de cet exercice est de créer des « patients » qui ont un poids et une taille,
    // et de calculer leur « Indice de Masse Corporelle» (IMC).
    private double weight;
    private double height;

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getIMC() {
        return weight / Math.pow(height, 2.0);
    }
}

class TP12ain {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("============= Création de patient =============");
        System.out.print("Entrez la taille du patient: ");
        double height = keyboard.nextDouble();
        System.out.print("Entrez le poid du patient: ");
        double weight = keyboard.nextDouble();

        // Set to calculate
        TP2 patient = new TP2();
        patient.setHeight(height);
        patient.setWeight(weight);

        System.out.println("Taille du patient: " + patient.getHeight());
        System.out.println("Poid du patient: " + patient.getWeight());
        System.out.printf("IMC : %.3f", patient.getIMC());
        ;
    }
}