import java.util.Arrays;
import java.util.HashMap;

public class TP27 {
    // Ecrire une méthode Java qui prend en paramètre un tableau 2D, et un nombre.
    // La méthode devra nous retourner la valeur corresponde au nombre de fois que
    // ce nombre se trouve dans le tableau et ses différentes positions.

    static void frequencyWithPosition(int[][] tb, int n) {
        HashMap<Integer, String> numberFrequency = new HashMap<>();
        int counter = 0;
        for (int i = 0; i < tb.length; i++) {
            for (int j = 0; j < tb[i].length; j++) {
                if (tb[i][j] == n) {
                    counter++;
                    numberFrequency.put(counter, "(" + i + ", " + j + ")");
                }
            }
        }
        if (counter == 0) {
            System.out.println(n + " n'existe pas dans le tableau.\n");
        } else {
            String template;
            if (counter == 1) {
                template = "%d apparaît %d fois dans la position %s\n";
            } else {
                template = "%d apparaît %d fois dans les emplacements suivants : %s\n";
            }
            System.out.printf(template, n, counter, numberFrequency.values());
        }
    }

    public static void main(String[] args) {
        int[][] tb = {
                {1, 4, 2, 1},
                {6, 3, 8, 9},
                {1, 5, 1, 0}
        };
        frequencyWithPosition(tb, 1);
        frequencyWithPosition(tb, 9);
    }
}
