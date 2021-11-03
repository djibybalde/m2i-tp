import java.util.Scanner;

public class TP9 {
    public static void main(String[] variables) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Saisir le numéro du mois : ");
        int monthNumber = keyboard.nextInt();

        // Methode 1
        String monthName;
        if(monthNumber == 1){
            monthName = "Janvier";
        } else if(monthNumber == 2){
            monthName = "Février";
        } else if(monthNumber == 3){
            monthName = "Mars";
        } else if(monthNumber == 4){
            monthName = "Avril";
        } else if(monthNumber == 5){
            monthName = "Mai";
        } else if(monthNumber == 6){
            monthName = "Juin";
        } else if(monthNumber == 7){
            monthName = "Juillet";
        } else if(monthNumber == 8){
            monthName = "Aout";
        } else if(monthNumber == 9){
            monthName = "Septembre";
        } else if(monthNumber == 10){
            monthName = "Octobre";
        } else if(monthNumber == 11){
            monthName = "Novembre";
        } else if(monthNumber == 12){
            monthName = "Décembre";
        } else {
            monthName = "Numéro de mois invalide! Veuillez saisir un nombre compris entre 1 et 12.";
        }
        System.out.println("Mois: " + monthNumber);
        System.out.println("Résultat: " + monthName);

        // Methode 2
        switch (monthNumber) {
            case 1:
                System.out.println("Janvier");
                break;
            case 2:
                System.out.println("Février");
                break;
            case 3:
                System.out.println("Mars");
                break;
            case 4:
                System.out.println("Avril");
                break;
            case 5:
                System.out.println("Mai");
                break;
            case 6:
                System.out.println("Juin");
                break;
            case 7:
                System.out.println("Juillet");
                break;
            case 8:
                System.out.println("Aout");
                break;
            case 9:
                System.out.println("Septembre");
                break;
            case 10:
                System.out.println("Octobre");
                break;
            case 11:
                System.out.println("Novembre");
                break;
            case 12:
                System.out.println("Décembre");
                break;
            default:
                System.out.println("Numéro de mois invalide! Veuillez saisir un nombre compris entre 1 et 12.");
        }
    }
}
