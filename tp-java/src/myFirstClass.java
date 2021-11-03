import java.util.Scanner;

class PremiersPas { // PascalCase: the first letter must be capitalized
    public static void main(String[] args){
        // the ";" is mandatory in Java

        // System.out : print out the result from the system
        // println: print with new line
        // print: print without new line (aller a la ligne)
        System.out.println("Je suis dans une joie immence");

        // Le typage en Java est statique (pas dynamique comme en JS):
        // on defini explicitement le type de la variable dès le depart

        int age; // declaration d'un entier
        age = 29; // affectation
        int countChild = 4; // declaration & initialisation
        double weigh = 75.3; // ==> double (ou float)  pour les nombres avec virgule "."
        double value = 7; // Java va renvoyer 7.000

        // NOTE: En Java il y a une difference entre character ('') et String ("").
        char genre = 'm';
        String fullName = "Djiby BALDE";
        String fName = "Djiby", lName = "BALDE";

        boolean isMarried = false;

        // Les constants doivent être en MAJUSCULE (selon la convention du language)
        final double PI = 3.14; // final pour define une constante

        // Avec "var" Java devine le type de la variable à paretir des la valeur de depart.
        var name = "djiby"; // ==> Sting. Donc si change la valeur name = 9 ==> wrong

        String myString = "Djiby BALDE";
        int myInteger = 29;

        // println: pour faire un retour à la fin
        System.out.println("Je m'appelle " + myString + " et j'ai " + myInteger);

        // print: sans retour à de ligne
        System.out.print("Je m'appelle " + myString + " et j'ai " + myInteger);

        // printf: f pour format,
        // %s : Placeholder pour les string,
        // %d : Placeholder pour des integers
        // %f : Placeholder pour des floats ou doubles
        System.out.printf("Je m'appelle %s et j'ai %d", myString, myInteger);
    }
}

class LectureClavier {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        String fName;
        System.out.print("Votre nom : ");
        fName=keyboard.nextLine(); // lire tous les caracter et les affecté à fName
        System.out.printf("Votre nom est %s", fName);

        // ==========================================
        String nom;
        System.out.print("Votre nom : ");
        nom=keyboard.nextLine();//String

        System.out.println("Votre age : ");
        int age = keyboard.nextInt();

        // Get the first element of a String, so a character instance of the Scanned String
        System.out.print("Votre genre : ");
        char genre = keyboard.next().charAt(0);

        System.out.print("Votre poids : ");
        double poids=keyboard.nextDouble();

        System.out.print("Etes-vous marié(e)s : ");
        boolean estMarie=keyboard.nextBoolean();

        System.out.printf("Nom complet : %s\n",nom);
        System.out.printf("Age : %d\n", age);
        System.out.printf("Etat marital %s: \n", estMarie? "Marié" : "Célibataie");
        System.out.printf("Genre : %c\n", genre);
        System.out.printf("Poids : %f\n", poids);
    }
}