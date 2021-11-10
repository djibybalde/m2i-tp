import java.util.Scanner;

public class TP32 {
    // Ecrivez une fonction qui accepte un nombre positif N.
    // La fonction doit afficher sur la console une forme de pas avec N niveaux en utilisant le caractère #.
    static void DescendingScalier(int n) {
        StringBuilder step = new StringBuilder("'");
        for (int i = 0; i < n; i++) {
            System.out.print(step.append("#"));
            System.out.println("'");
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez le nombre de niveau : ");
        DescendingScalier(keyboard.nextInt());
    }
}
