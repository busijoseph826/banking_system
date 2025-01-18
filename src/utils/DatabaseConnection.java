package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = System.getenv("URL");
    private static final String USER = System.getenv("USER"); 
    private static final String PASSWORD = System.getenv("PASSWORD"); 

    /*public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }*/
    public static Connection getConnection()throws SQLException{
    	return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}
