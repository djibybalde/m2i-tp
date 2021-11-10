import java.util.Scanner;

public class TP19 {
    public static void main(String[] args) {
        // Ecrire un programme Java demande à l’utilisateur de saisir un nombre, et
        // qui ensuite affiche le nombre inverse.
        // Solution here: https://www.programiz.com/java-programming/examples/reverse-number

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez un nombre : ");
        int number = keyboard.nextInt();
        int reversed = 0;

        // run loop until number becomes 0
        while(number != 0) {
            // get last digit from number
            int lastDigit = number % 10;
            reversed = reversed * 10 + lastDigit;
            // remove the last digit from number
            number /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
