import java.util.Scanner;
// Java n'est pas un language procedurale mais plus tot Orienté Object
public class TP30 {
    static boolean identicalFollowedCharacter(String str) {
        char[] tb = str.toCharArray();
        boolean isTrue = false;
        for (int i = 1; i < str.length(); i++) {
            if (tb[i] == tb[i - 1]) {
                isTrue = true;
                break;
            }
        }
        return isTrue;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez une chaine : ");
        System.out.println(identicalFollowedCharacter(keyboard.next()));
    }
}
