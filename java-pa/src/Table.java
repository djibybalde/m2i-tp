import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        // The variables studied until are Primitive Type
        // Java Primitive Type : int, double, boolean, float, ...
        // There is other type called Referenced (ou évolué) Type that refer to Objects: String, Table, ...
        // For example, when comparing two Strings, we cannot use == or != (see TP12 and TP13)
        // so, we try to compare the reference of these variables

        // Static vs Dynamic Tables :
        // Static Table :  the length is know and cannot be changed after
        int[] notes = new int[4]; // Empty table with size 4
        int[] scores = {18, 10, 16}; // Table of size 3

        // NOTE that the length (notes.length) is an attribute but a method because we don't have to use () to access it
        System.out.println("Taille du tableau notes:"+ notes.length);
        System.out.println("Taille du tableau scores :"+scores.length);

        // Populate the notes table using a loop
        Scanner clavier=new Scanner(System.in);
        for(int i=0; i<notes.length; i++){
            if(i==0){
                System.out.printf("Entrez le %der : ",(i+1));
            }else{
                System.out.printf("Entrez le %dème : ",(i+1));
            }
            notes[i]=clavier.nextInt();
        }
        System.out.println("VOici les notes du cours de physique : ");

        // Access the elements via the index
        for(int i=0; i<scores.length; i++){
            System.out.printf("Score %d  : %d\n",(i+1),scores[i]);
        }

        // Access directly to the values of the table
        for (int note : notes) { // same to of in JS
            System.out.printf("%d ", note);
        }

        // Referenced Table
        String[] noms={"Jean","Benjamin","Raphael","Jihanne","Zoro"};
        // here we cpe only the reference of noms to noms2 but not the values,
        // so we will still have the same table of values (only one table of values)
        String[] noms2=noms;

        // Event if the values are the same, the reference (keys) will be different
        String[] noms3={"Jean","Benjamin","Raphael","Jihanne","Zoro"};

        System.out.println("Nom[0] : "+noms[0]);
        noms[0]="Christian";
        System.out.println("Nom2[0] : "+noms2[0]); // out: "Christian" because we change the value using the reference of noms

        noms2[1]="Bossard";
        System.out.println("Nom[1] : "+noms[1]);
        System.out.println("a=b : "+(noms==noms2));

        // Only the values of the second table will be affected
        noms3[0]="Alain";
        System.out.println("\n\n");
        System.out.println("noms1[0] : "+noms[0]); // out : Christian
        System.out.println("noms2[0] : "+noms2[0]); // out : Christian
        System.out.println("noms3[0] : "+noms3[0]); // out: Alain
    }
}
