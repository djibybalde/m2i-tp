import java.util.Scanner;

public class TP5 {
    public static void main(String[] args) {
        // Écrivez un petit programme Java, Degre3.java, vous permettant d'évaluer
        // un polynôme du 3ème degré de la forme: ((a+b)/2)x3 + (a+b)2x2 + a + b + c

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez a (int) : ");
        int a = keyboard.nextInt();
        System.out.print("Entrez b (int) : ");
        int b = keyboard.nextInt();
        System.out.print("Entrez c (int) : ");
        int c = keyboard.nextInt();

        System.out.print("Entrez x (double) : ");
        double x = keyboard.nextDouble();

        int ab = a + b ;
        double pol = (ab/2.0)*Math.pow(x, 3) + Math.pow(ab, 2)*Math.pow(x, 2) + a + b + c;
        System.out.printf("La valeur du polynôme est : %32.4f\n", pol);
    }
}
