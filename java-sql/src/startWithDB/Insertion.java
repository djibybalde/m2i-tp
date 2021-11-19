package startWithDB;

import java.sql.*;

public class Insertion {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://192.168.64.2/poe_crm", "root", "");
            if (connection == null) System.out.println("Bad connection occurs !");
            else {
                System.out.println("Successful connected !");

                String[] dt = {""};
                PreparedStatement statement = connection.prepareStatement("INSERT INTO clients(nom,prenom, email,genre) values(?,?,?,?)");
                statement.setString(1, "diamanka");
                statement.setString(2, "yacine");
                statement.setString(3, "yacine@gb.fr");
                statement.setString(4, String.valueOf('f'));
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
