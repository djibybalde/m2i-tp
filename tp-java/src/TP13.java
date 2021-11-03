import java.util.Objects;
import java.util.Scanner;

public class TP13 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez votre addresse mail d'inscription: ");
        String email = keyboard.nextLine();

        System.out.print("Entrez votre mot de passe d'inscription: ");
        String password = keyboard.nextLine();

        int counter = 1;
        while (counter <= 5) {
            String logInEmail;
            String logInPassword;

            System.out.print("Entrez votre addresse mail: ");
            logInEmail = keyboard.nextLine();

            System.out.print("Entrez votre mot de passe: ");
            logInPassword = keyboard.nextLine();

            if (Objects.equals(logInEmail, email) && Objects.equals(logInPassword, password)) {
                System.out.print("Bienvenu dans votre espace client");
                break;
            } else if (counter < 5) {
                System.out.printf("Échec tentative %d: Identifiants incorrect. Veuillez réessayer!\n", counter);
            }
            if (counter == 5) {
                System.out.printf("Vous avez effectué %d tentatives. Votre compte est bloqué !\n", counter);
            }
            counter++;
        }
    }
}
