import java.util.Scanner;

public class TP18 {
    public static void main(String[] args) {
        // Ecrire un programme Java demande à l’utilisateur de saisir un text et
        // qui ensuit, retourne la chaine inverse.

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez un texte : ");
        String text = keyboard.nextLine();

        StringBuilder reversedText = new StringBuilder();
        for(int i=0; i<text.length(); i++){
            reversedText.append(text.charAt(text.length() - 1 - i));
        }

        if(text.equals(reversedText.toString())){
            System.out.println( text+ " est un palindrome");
        } else {
            System.out.println( text+ " n'est pas un palindrome");
        }
    }
}
