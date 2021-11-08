import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TP24 {
    public static void main(String[] args) {
        // Ecrire un programme Java demande à l’utilisateur de saisir  une liste de nombres pour les garder dans un tableau.
        // Il faut noter que les nombres peuvent se repeter
        // Ensuite le programme devra demander à l’utilisateur de spécifier le nombre qu’il retirer du tableau.
        // Le programme va ensuite afficher le tableau avant et après la suppression de toutes les occurrence du nombre spécifié.

        ArrayList<Integer> numberArray = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez la taille de la liste : ");
        int arraySiz = keyboard.nextInt();
        for(int i=0; i<arraySiz; i++){
            System.out.printf("Entrez le nombre %d : ", i+1);
            numberArray.add(keyboard.nextInt());
        }
        System.out.println("Tableau avant suppression du nombre : " + numberArray);

        System.out.print("Quel nombre voulez-vous retirer du tableau ? ");
        int numberToRemove = keyboard.nextInt();
        for (int i=0; i<arraySiz; i++){
            numberArray.removeIf(n -> n==numberToRemove);
        }
        System.out.println("Tableau après suppression du nombre : " + numberArray);
    }
}
