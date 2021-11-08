import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TP25 {
    public static void main(String[] args) {

        ArrayList<String> emailTable = new ArrayList<>(Arrays.asList(
                "christian.lisangola@gmail.com",
                "jean.paul@gmail.com",
                "alain@gmail.com", "lydie@yahoo.fr",
                "josephine.lajoie@yahoo.com", "luise@hotmail.fr",
                "philemon.turion@gmail.com", "jules.cesar@hotmail.fr"
        ));

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Voulez-vous utiliser la liste des mails disponibles dans la base de donnée? ");
        boolean fromKeyboard = keyboard.nextBoolean();
        if(!fromKeyboard){
            emailTable.clear();
            System.out.println("Combien d'e-mails voulez-vous capturer ? ");
            int nbEmail = keyboard.nextInt();
            for (int i=0; i<nbEmail; i++){
                emailTable.add(keyboard.nextLine());
            }
        }

        int gmailCounted = 0;
        int yahooCounted = 0;
        int hotmailCounted = 0;
        int otherCounted = 0;
        for (String str : emailTable) {
            if (str.contains("gmail")) {
                gmailCounted++;
            } else if (str.contains("yahoo")){
                yahooCounted++;
            } else if (str.contains("hotmail")){
                hotmailCounted++;
            } else {
                otherCounted++;
            }
        }

        // Method 2: attention ==> O(n), mieux veut utiliser les hasMap ==> O(1)
        // int nbGmail = (int) emailTable.stream().filter(mail -> mail.contains("gmail.")).count();

        System.out.println("Total email address : " + emailTable.size());
        System.out.println("Taux d’adresse gmail: " + 100*gmailCounted/emailTable.size() + "%");
        System.out.println("Taux d’adresse yahoo: " + 100*yahooCounted/emailTable.size() + "%");
        System.out.println("Taux d’adresse hotmail: " + 100*hotmailCounted/emailTable.size() + "%");
        System.out.println("Taux d’adresse des autres: " + 100*otherCounted/emailTable.size() + "%");
    }
}
