import java.util.Arrays;

public class TP28 {
    // Ecrire une méthode Java qui prend en paramètre un tableau de caractères.
    // Et qui va ensuite retourner un nouveau tableau avec une alternance entre les lettre en Maj et Min.

    static char[] capitalizeCharacter(char[] character) {
        /* for (int i = 1; i < character.length; i += 2) {
            character[i] = Character.toUpperCase(character[i]); //character[i] -= 32 ==> SPACE ASCII CODE;
        }*/
        for (int i = 0; i < character.length; i ++) {
            character[i] = i%2==0? Character.toUpperCase(character[i]): Character.toLowerCase(character[i]);
        }
        return Arrays.toString(character).toCharArray();
    }

    public static void main(String[] args) {
        System.out.println(capitalizeCharacter(new char[]{'a', 'b', 'c', 'd', 'e'}));
    }
}
