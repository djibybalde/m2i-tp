import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TP31 {
    // Ecrire une méthode qui devra avoir comme input un tableau et la taille du morceau,
    // divisez le tableau en plusieurs sous tableaux ou morceaux.
    static List<List<Integer>> tableToMultiList(List<Integer> firstTable, double maxColSize) {
        List<List<Integer>> finalTable = new ArrayList<>();
        int j = 0;
        double shape = Math.ceil(firstTable.size() / maxColSize);
        for (int i = 0; i < shape; i++) {
            int k = j + maxColSize <= firstTable.size() ? (int) (j + maxColSize) : firstTable.size();
            finalTable.add(firstTable.subList(j, k));
            j += maxColSize;
        }
        return finalTable;
    }

    public static void main(String[] args) {
        System.out.println(tableToMultiList(new ArrayList<>(Arrays.asList(1, 2, 3, 4)), 2));
        System.out.println(tableToMultiList(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)), 2));
        System.out.println(tableToMultiList(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8)), 3));
        System.out.println(tableToMultiList(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)), 4));
        System.out.println(tableToMultiList(new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5)), 10));
    }
}
