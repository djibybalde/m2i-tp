package startWithDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://192.168.64.2/poe_crm", "root", "");
            if (connection == null) System.out.println("Bad connection occurs !");
            else {
                System.out.println("Successful connected !");

                String[] dt = {""};
                PreparedStatement statement = connection.prepareStatement("UPDATE `clients` SET `nom`='balde' WHERE `nom`='yacine'" );
                //statement.setString(1, "balde");
                //statement.setString(2, "yacine");

                //PreparedStatement statement = connection.prepareStatement( "update`user` set `exp` = '666'  where `username` = '"+loggedusername+"'");

                statement.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
