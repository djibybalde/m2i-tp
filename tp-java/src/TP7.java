import java.util.Scanner;

public class TP7 {
    public static void main(String[] args) {
        // Ecrivez un programme Java qui lit un nombre et indique
        // s'il est positif, négatif ou s'il vaut zéro et s'il est pair ou impair.

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entre le premier nombre : ");
        var number =  keyboard.nextInt();

        // Method 1
        if (number > 0) {
            if (number % 2 == 0){
                System.out.print("Le nombre est positif et pair\n");
            } else {
                System.out.print("Le nombre est positif et impair\n");
            }
        } else if(number<0){
            if (number % 2 == 0){
                System.out.print("Le nombre est négatif et pair\n");
            } else {
                System.out.print("Le nombre est négatif et impair\n");
            }
        } else {
            System.out.print("Le nombre est zéro (et il est pair)");
        }

        // Method 2
        if(number==0){
            System.out.print("Le nombre est zéro (et il est pair)");
        } else {
            System.out.printf("%d est %s et %s", number, number%2==0? "pair" : "impair", number>0? "positif" : "négatif");
        }
    }
}
