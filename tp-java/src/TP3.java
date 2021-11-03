import java.util.Scanner;

public class TP3 {
    public static void main(String[] args) {
        // Ecrire un programme Java qui déclare 3 variables, a,b,c et
        // qui va ensuite effectuer une permutation de ces valeurs :

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez la première valeur(a) : ");
        int a = keyboard.nextInt();

        System.out.print("Entrez la deuxième valeur(b) : ");
        int b = keyboard.nextInt();

        System.out.print("Entrez la troisième valeur(c) : ");
        int c = keyboard.nextInt();

        System.out.printf("Les valeurs entrées sont : a = %d, b = %d et c = %d\n", a, b, c);

        int temp = a;
        a = c;
        c = b;
        b = temp;

        System.out.printf("Les valeurs permutées sont : a = %d, b = %d et c = %d\n", a, b, c);
    }
}
