import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class TP33 {
    // Ecrire une méthode Java qui prend en paramètre un tableau d'entiers et un entier qui représente une somme nommé S.
    // Retourner un tableau contenant tous les couples  des deux nombres tels que leur somme soit égale à S.

    static Collection<String> findPairsSumNumbers(int[] table, int s) {
        // for i=0 to arr.length - 1 do
        //     hash(arr[i]) = i  # key is the element and value is its index.
        //     # if K-th element exists and it's different then we found a pair
        //     if hash(K - arr[i]) != i
        //         print "pair i , hash(K - arr[i]) has sum K"
        //     end-if
        // end-for

        HashMap<Integer, int[]> getPairsSum = new HashMap<>();
        HashMap<Integer, String> findPairsSum = new HashMap<>();
        for (int v : table) {
            if (!getPairsSum.containsKey(v)) {
                getPairsSum.put(s - v, new int[]{v, s - v});
            } else {
                findPairsSum.put(s - v, Arrays.toString(getPairsSum.get(v)));
            }
        }
        getPairsSum.clear();
        return findPairsSum.values();
    }

    public static void main(String[] args) {
        System.out.println(findPairsSumNumbers(new int[]{2, 45, 7, 3, 5, 1, 8, 9}, 10));
        System.out.println(findPairsSumNumbers(new int[]{3, 2, 4, 7, 5, -1}, 6));
        System.out.println(findPairsSumNumbers(new int[]{2, 7, 11, 15}, 9));
    }
}
