import java.util.Arrays;
import java.util.Scanner;

public class TP16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int len = keyboard.nextInt();
        int[] table = new int[len];

        double min = Double.POSITIVE_INFINITY, max = Double.NEGATIVE_INFINITY;

        for(int i=0; i<len; i++){
            System.out.printf("Entrez l'élément table[%d] :", i+1);
            table[i] = keyboard.nextInt();
            min = Math.min(table[i], min);
            max = Math.max(table[i], max);
        }
        System.out.println("Tb : " + Arrays.toString(table));
        System.out.println("Plus grand : " + max);
        System.out.println("Plus petit : " + min);
    }
}
