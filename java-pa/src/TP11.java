import java.util.Scanner;

public class TP11 {
    public static void main(String[] args) {
        // Écrivez un programme Java qui demande à l’utilisateur d’entrer un nombre et
        // qui ensuite va calculer et afficher la factorielle de ce nombre:
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entre un nombre : ");
        int n =  keyboard.nextInt();
        int i, f = 1;
        if(n==0 || n==1){
            f = 1;
        } else {
            for(i=1; i <= n; i++){
                f = f * i;
            }
        }
        System.out.println("Factorielle de "+n+" est: "+f);
    }
}
