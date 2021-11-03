import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {

        // Ecrire un programme Java qui demande à l’utilisateur de saisir la valeur du diamètre,
        // et qui ensuite va effectuer le calcul de la surface.

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the diameter value : ");
        double diameter = keyboard.nextDouble();

        double rayon = diameter/2.0;
        double area = Math.pow(rayon, 2)*Math.PI;

        System.out.printf("The area is %32.3f", area);
    }
}
