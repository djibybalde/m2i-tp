import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez votre nom : ");
        String fName = keyboard.nextLine();

        System.out.print("Entrez votre prénom : ");
        String lName = keyboard.nextLine();

        System.out.print("Entrez votre age : ");
        int age = keyboard.nextInt();

        System.out.printf("Vous vous appelez %s %s, et vous avez %d ans\n.", fName, lName, age);
    }
}
