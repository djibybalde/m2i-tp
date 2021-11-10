import java.util.Scanner;

public class TP14 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int [] table  = new int[10] ;
        int i, j, counter, value=0, frequency=0 ;

        // Populate the table
        for(i=0; i<table.length; i++){
            System.out.printf("Enter element %d :", i+1);
            table[i] = keyboard.nextInt();
        }

        // Most frequent element of the table
        for (i=0; i < table.length; i++){
            counter = 0;
            for (j = 0 ; j < table.length; j++){
                if ( table[i] == table[j] ) {
                    counter++;
                }
            }
            if  (counter > frequency) {
                frequency = counter ;
                value = table [i] ;
            }
        }
        System.out.printf("Element le plus frequent : %d apparait %d fois", value, frequency);
    }
}
