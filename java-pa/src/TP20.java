import java.util.Arrays;
import java.util.Scanner;

public class TP20 {
    public static void main(String[] args) {
        // Ecrire un programme Java demande à l’utilisateur de saisir 2 chaines de caractères
        // et qui ensuite renseigne si ce sont des anagrammes.

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez la chaine 1 : ");
        char[] inputTextToCharArray1 = keyboard.nextLine().toCharArray();
        Arrays.sort(inputTextToCharArray1);

        System.out.print("Entrez la chaine 2 : ");
        char[] inputTextToCharArray2 = keyboard.nextLine().toCharArray();
        Arrays.sort(inputTextToCharArray2);

        if(Arrays.equals(inputTextToCharArray1, inputTextToCharArray2)){
            System.out.println("Ces deux chaines sont des anagrammes");
        } else {
            System.out.println("Ces deux chaines ne sont pas des anagrammes");
        }
    }
}
