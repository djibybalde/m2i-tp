import java.util.Scanner;

public class TP4 {
    public static void main(String[] args) {
        // Ecrivez un programme Age.java qui :
        // 1. demande son âge à l'utilisateur ;
        // 2. lit la réponse de l'utilisateur et l'enregistre dans une variable age de type entier ;
        // 3. Effectue le calcul de l'année de naissance de l'utilisateur et l'enregistre dans la variable annee de type entier ;
        // 4. affiche l'année de naissance ainsi calculée.

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter votre age : ");
        int age = keyboard.nextInt();
        int year = 2021 - age;
        System.out.printf("Votre année de naissance est : %d\n", year);
    }
}
