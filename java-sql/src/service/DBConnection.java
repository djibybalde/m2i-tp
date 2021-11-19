package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // must be static because the getInstance will be static
    private static Connection conn;
    final private static String URL = "jdbc:mysql://192.168.64.2/poe_crm";
    final private static String USERNAME = "root";
    final private static String PASSWORD = "";

    // constructor
    private DBConnection() {}

    // singleton
    public static Connection getInstance() throws SQLException {
        if (conn==null) conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        return conn;
    }
}
