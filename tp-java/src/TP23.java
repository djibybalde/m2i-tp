import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class TP23 {
    public static void main(String[] args) {
        // Ecrire un programme Java demande à l’utilisateur de saisir  liste de langages de programmations à partir du clavier.
        // Une fois le tableau rempli, l’utilisateur sera appelé à saisir les noms des langages qu’il souhaite retirer de liste.
        // Le programme devra ensuite retirer ces langages et afficher l’état du tableau avant et après la suppression.

        ArrayList<String> programingLanguages = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Combien de langages voulez-vous enregistrer ? ");
        int arraySiz = keyboard.nextInt();
        while (!(arraySiz>=1)){
            System.out.print("Ce nombre doit être suppérieur 0. Essayez un nouveau nombre ! ");
            arraySiz = keyboard.nextInt();
        }
        for(int i=0; i<arraySiz; i++){
            System.out.printf("Saisissez le langage %d : ", i+1);
            programingLanguages.add(keyboard.next().toLowerCase());
        }
        System.out.println("Tableau avant suppression : " + programingLanguages);

        System.out.print("Combien de langages souhaitez vous supprimé ? ");
        int nbLanguageToRemove = keyboard.nextInt();
        while (nbLanguageToRemove>=arraySiz){
            System.out.printf("Ce nombre doit être inférieur ou égale à %d. Essayez un nouveau nombre ! ", arraySiz);
            nbLanguageToRemove = keyboard.nextInt();
        }
        System.out.println("Saisissez les noms des langages que vous souhaitez supprimer du tableau : ");
        // if not a none value ==>
        for (int i=0; i<nbLanguageToRemove; i++){
            System.out.printf("Saisissez le langage %d à retirer : ", i+1);

            //System.out.println("".length());

            String langToRemove = keyboard.next();
            while (langToRemove.length()<1){
                System.out.println("Ce-ci n'est pas un nom valide ! ");
                langToRemove = keyboard.next();
            }
            String finalLangToRemove = langToRemove;
            programingLanguages.removeIf(lang -> Objects.equals(lang, finalLangToRemove.toLowerCase()));
        }
        System.out.println("Tableau après suppression : " + programingLanguages);
    }
}
