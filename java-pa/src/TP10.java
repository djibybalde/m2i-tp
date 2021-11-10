public class TP10 {
    public static void main(String[] args) {
        // Écrivez un programme Tables.java affichant les tables de multiplication de 2 à 10.
        int firstTable = 2;
        int lastTable = 10;
        System.out.println("Tables de multiplication");
        for (int i = firstTable; i <= lastTable; i++) {
            System.out.printf("Table de %d \n", i);
            for (int k = 1; k <= 10; k++) {
                System.out.printf("%d x %d = %d \n", k, i, k*i);
            }
        }
    }
}
