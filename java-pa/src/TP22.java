import java.util.*;
import java.util.stream.Collectors;

public class TP22 {
    public static void main(String[] args) {
        // Ecrire un programme va retirer tous doublons (mots) de la phase

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez un texte : ");
        String inputText = keyboard.nextLine();
        String[] strToArray = inputText.toLowerCase().split("\\W+");

        // Get the unique words
        StringBuilder strWithUniqueWord = new StringBuilder();
        List<String> getUniqueWords = Arrays.stream(strToArray).distinct().collect(Collectors.toList());
        for (String str : getUniqueWords){
            strWithUniqueWord.append(str).append(" ");
        }

        // Get the frequency of the words
        HashMap<String, Integer> wordFrequency = new HashMap<>();
        for (String str : strToArray) {
            wordFrequency.putIfAbsent(str, 0);
            wordFrequency.replace(str, wordFrequency.get(str) + 1);
        }

        // Remove if not duplicated
        wordFrequency.values().removeIf(value -> value<=1);

        // Show result
        System.out.println("Chaîne de départ : " + inputText);
        System.out.println("Chaîne sans doublons : " + strWithUniqueWord);
        System.out.println("Frequence des mots en doublons: " + wordFrequency);
    }
}
