import java.util.Scanner;

public class TP6 {
    public static void main(String[] args) {
        // Implémentez en Java un algorithme vous permettant de permuter les valeurs de deux variables.

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez x : ");
        int x = keyboard.nextInt();

        System.out.print("Entrez y : ");
        int y = keyboard.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }
}
