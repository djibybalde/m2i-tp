// Ecrire un programme Java qui permet de calculer les dimensions d’un Rectangle.

import java.util.Scanner;

public class TP1 {

    private double length;
    private double width;

    public double getPerimeter() {
        return 2*(length + width);
    }
    public double getArea() {
        return length*width;
    }

    public void setDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }
}

class TP1Main{
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez la longueur : ");
        double length = keyboard.nextDouble();
        System.out.print("Entrez la largeur : ");
        double width = keyboard.nextDouble();

        // Set to calculate
        TP1 rectangle = new TP1();
        rectangle.setDimension(length, width);

        System.out.println("Périmètre : " + rectangle.getPerimeter());
        System.out.println("Surface : " + rectangle.getArea());
    }
}
