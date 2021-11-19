import dao.impl.*;
import models.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ClientDAO clientDAO = new ClientDAO();
        List<Client> clients = clientDAO.getAll();

        // for(Client client:clients) System.out.println(client);
        clients.forEach(System.out::println);

        System.out.println("\nGet by ID: ");
        Client client = clientDAO.getById(13);
        System.out.println(client);

        System.out.println("\nCreation: ");
        //clientDAO.save(new Client("gb", "bld", "gb@bld", 'm'));

        System.out.println("Updating: ");
        clientDAO.update(new Client("gb", "balde", "gb@balde", 'm'));

        TelephoneDAO telephoneDAO = new TelephoneDAO();
        List<Telephone> telephones = telephoneDAO.getAll();
        telephones.forEach(System.out::println);

        System.out.println("\nGet telephone by ID: ");
        Telephone telephone = telephoneDAO.getById(3);
        System.out.println(telephone);

        System.out.println("\nCreation tel.: ");
        // telephoneDAO.save(new Telephone(1, "gb@bld"));

        System.out.println("Updating: ");
        telephoneDAO.update(new Telephone(1,  "gb@ld"));

        System.out.println("Deleting: ");
        telephoneDAO.delete(3);
        telephoneDAO.delete(6);

        // Mettre à jour le client:
        //      1 - Récupérer un client par son ID
        //      2 - Au traver des setters, mettre à jour un client
        //      3 - Envoyer les données mis à jour dans la base de données

    }
}
