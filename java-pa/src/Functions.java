import java.util.Arrays;
import java.util.Scanner;

public class Functions {

    // this is one of the function that print to show a result
    // the args are not referenced (we cannot use para1=2) when calling the function, so the order are important.

    // Function to capitalize each word
    static String capitalize(String str){
        StringBuilder capitalizedText = new StringBuilder();
        for (String s : str.split("\\W+")) {
            capitalizedText.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
        }
        return capitalizedText.toString();
    }

    // Function to sum an array element
    static int sumIntegerArray(int[] array){
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // A void function: without return (void is function that return nothing)
    static void displayChar(String str){
        for (char j: str.toCharArray()){
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(sumIntegerArray(new int[]{1, 2, 6}));
        System.out.println(capitalize(keyboard.next()));
        displayChar(keyboard.next());
    }
}
