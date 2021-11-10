import java.util.Scanner;

public class TP8 {
    public static void main(String[] args) {
        // Ecrivez un programme Java qui permet de résoudre une équation du 2nd degré de la forme ax2+bx+c = 0.

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entre le nombre a : ");
        var a =  keyboard.nextInt();

        System.out.print("Entre le nombre b : ");
        var b =  keyboard.nextInt();

        System.out.print("Entre le nombre c : ");
        var c =  keyboard.nextInt();

        double delta = Math.pow(b, 2) - 4.0*a*c;
        if (delta==0){
            double x0 = -b/(2.0*a);
            System.out.printf(" x0 %f", x0);
        }
        if (delta>0){
            double x1 = (-b-Math.sqrt(delta))/(2.0*a);
            double x2 = (-b+Math.sqrt(delta))/(2.0*a);
            System.out.printf("x1: %32.2f, x2: %32.2f", x1, x2);
        }
        if (delta<0){
            System.out.print("Le système n' admet aucune solution réelle");
        }
    }
}
