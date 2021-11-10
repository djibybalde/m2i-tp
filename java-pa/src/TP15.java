import java.util.Arrays;
import java.util.Scanner;

public class TP15 {
    public static void main(String[] args) {

        int sum = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez le taille du tableau 1 : ");
        int len1 = keyboard.nextInt();
        int[] table1 = new int[len1];
        for(int i=0; i<len1; i++){
            System.out.printf("Entrez l'élément table1[%d] :", i+1);
            table1[i] = keyboard.nextInt();
            if(table1[i]%3==0){
                sum += table1[i];
            }
        }

        System.out.print("Entrez le taille du tableau 2 : ");
        int len2 = keyboard.nextInt();
        int[] table2 = new int[len2];
        for(int i=0; i<len2; i++){
            System.out.printf("Entrez l'élément table2[%d] :", i+1);
            table2[i] = keyboard.nextInt();
            if(table2[i]%3==0){
                sum += table2[i];
            }
        }

        System.out.print("Entrez le taille du tableau 3 : ");
        int len3 = keyboard.nextInt();
        int[] table3 = new int[len3];
        for(int i=0; i<len3; i++){
            System.out.printf("Entrez l'élément table2[%d] :", i+1);
            table3[i] = keyboard.nextInt();
            if(table3[i]%3==0){
                sum += table3[i];
            }
        }

        System.out.println("T1: " + Arrays.toString(table1));
        System.out.println("T2: " + Arrays.toString(table2));
        System.out.println("T3: " + Arrays.toString(table3));
        System.out.println("Solution = " +  sum);
    }
}
