package startWithDB;

public class CatchError {
    static double sum(int[] tab){
        // to be accessible from the main class (a static class), this class much be also static
        double sum = 0.0;
        for (int i=0;i<=tab.length; i++){
            sum+=tab[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] array = {9, 3, 8, 10};
        try{
            System.out.println(sum(array));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ERROR: "+ e.getMessage());
        }finally {
            System.out.println("Maman j'ai râté l'avion");
        }
    }
}
