package startWithDB;

import java.sql.*;

public class Select {
    // 1 - M-à-jour
    // 2 - Suppression
    // 3 -Récupérer par l'ID
    // 4 - Mettre toutes les requêtes dans de fonctions/méthodes

    public static void main(String[] args) {
        Connection connection = null;
        try {
            // to connect with XAMPP
            connection = DriverManager.getConnection("jdbc:mysql://192.168.64.2/poe_crm", "root", "");

            if (connection == null) System.out.println("Bad connection occurs !");
            else {
                System.out.println("Successful connected !");

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM clients");
                while (resultSet.next()) {
                    System.out.println(
                            "Client " + resultSet.getInt("id") + ": " +
                                    resultSet.getString("nom").toUpperCase() + " " +
                                    resultSet.getString("prenom").substring(0, 1).toUpperCase() +
                                    resultSet.getString("prenom").substring(1) + " " +
                                    resultSet.getString("email")
                    );
                }
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}