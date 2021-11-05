import java.util.Arrays;
import java.util.Scanner;

public class TP21 {
    public static void main(String[] args) {
        // Ecrire un programme Java qui demande à l’utilisateur de saisir une chaîne de caractères et
        // va mettre en majuscule toutes les premières lettres de chaque mot.

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez un texte : ");
        String text = keyboard.nextLine();
        String[] strToArray = text.split("\\W+");

        // To Uppercase
        StringBuilder capitalizedText = new StringBuilder();
        for (String str : strToArray) {
            capitalizedText.append(str.substring(0, 1).toUpperCase()).append(str.substring(1)).append(" ");
        }

        System.out.println("Chaine initiale: " + text);
        System.out.println("Chaine finale : " + capitalizedText);
    }
}
