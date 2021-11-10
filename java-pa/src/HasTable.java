import java.util.HashMap;

public class HasTable {
    public static void main(String[] args) {
        HashMap<Integer, String> dayOfWeek=new HashMap<>();
        dayOfWeek.put(1, "Lundi");
        dayOfWeek.put(2, "Mardi");
        dayOfWeek.put(3, "Mercredi");
        dayOfWeek.put(4, "Jeudi");
        dayOfWeek.put(5, "Vendredi");
        dayOfWeek.put(6, "Samedi");
        dayOfWeek.put(7, "Dimanche");

        System.out.println(dayOfWeek); // out: {1=Lundi, 2=Mardi, 3=Mercredi, 4=Jeudi, 5=Vendredi, 6=Samedi, 7=Dimanche}
        System.out.println(dayOfWeek.get(2)); // out: Mardi
        System.out.println(dayOfWeek.replace(5, "Friday"));
        System.out.println(dayOfWeek.remove(6));

        // TP: Ecrire un programme Java demande à l’utilisateur de saisir un text et qui ensuit,
        // et qui ensuite affiche le nombre d’occurence de chaque lettre.

        String mySentence = "Je suis dans une joie immence, parce que je suis développeur".toLowerCase();
        HashMap<Character, Integer> occurrenceMap = new HashMap<>();

        for(int i=0; i<mySentence.length(); i++){

            // Method 1
            occurrenceMap.putIfAbsent(mySentence.charAt(i), 0);
            occurrenceMap.replace(mySentence.charAt(i), occurrenceMap.get(mySentence.charAt(i))+1);

            /* Method 2
            if(occurrenceMap.get(mySentence.charAt(i))==null){
                occurrenceMap.put(mySentence.charAt(i), 1);
            } else {
                occurrenceMap.replace(mySentence.charAt(i), occurrenceMap.get(mySentence.charAt(i))+1);
            }*/
        }
        occurrenceMap.remove(' ');
        System.out.println(occurrenceMap);
    }
}
