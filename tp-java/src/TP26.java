import java.util.Objects;
import java.util.Scanner;

public class TP26 {
    // Ecrire une méthode Java qui prend en paramètre 2 string et qui ensuite
    // retourne un booléen selon que le 2ème string est le préfixe du premier ou pas.

    static boolean isPrefix(String string1, String string2) {
        // we can also use string1.startsWith(string2);
        return Objects.equals(string1.substring(0, string2.length()).toLowerCase(), string2.toLowerCase());
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez la 1ère chaine : ");
        String str1 = keyboard.nextLine();
        System.out.print("Entrez la 2ème chaine : ");
        String str2 = keyboard.nextLine();

        if (isPrefix(str1, str2)) {
            System.out.println(str2 + " est le préfixe de " + str1);
        } else {
            System.out.println(str2 + " n'est pas le préfixe de " + str1);
        }
    }
}
