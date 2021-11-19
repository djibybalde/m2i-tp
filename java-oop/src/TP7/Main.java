package TP7;

public class Main {
    public static void main(String[] args) {
        // Test 1
        System.out.println("Test partie 1 : ");
        System.out.println("----------------");
        OptionVoyage option1 = new OptionVoyage("Séjour au camping", 40.0);
        System.out.println(option1);

        OptionVoyage option2 = new OptionVoyage("Visite guidée : London by night" , 50.0);
        System.out.println(option2);
        System.out.println();

        // Test 2
        System.out.println("Test partie 2 : ");
        System.out.println("----------------");

        Transport transp1 = new Transport("Trajet en car ", 50.0);
        System.out.println(transp1);

        Transport transp2 = new Transport("Croisière", 1300.0);
        System.out.println(transp2);

        Sejour sejour1 = new Sejour("Camping les flots bleus", 20.0, 10, 30.0);
        System.out.println(sejour1);
        System.out.println();

        // Test 3
        System.out.println("Test partie 3 : ");
        System.out.println("----------------");
        KitVoyage kit1 = new KitVoyage("Zurich", "Paris");
        kit1.addOption(new Transport("Trajet en train", 50.0));
        kit1.addOption(new Sejour("Hotel 3* : Les amandiers ", 40.0, 5, 100.0));
        System.out.println(kit1);
        System.out.println();
        kit1.cancel();

        KitVoyage kit2 = new KitVoyage("Zurich", "New York");
        kit2.addOption(new Transport("Trajet en avion", 50.0, true));
        kit2.addOption(new Sejour("Hotel 4* : Ambassador Plazza  ", 100.0, 2, 250.0));
        System.out.println(kit2);
        kit2.cancel();

        // FIN TEST 3
    }
}
