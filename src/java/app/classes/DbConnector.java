package app.classes;

import java.sql.*;

public class DbConnector {
    private static final String host = "localhost";
    private static final String dbname = "rad_new";
    private static final String dbuser = "root";
    private static final String dbpw = "";
    private static Connection conn;

    public static Connection getConnection() {
        try {
            if (conn == null || conn.isClosed()) {
                Class.forName("com.mysql.jdbc.Driver");
                String link = "jdbc:mysql://localhost:3306/rad_new"; 
                conn = DriverManager.getConnection(link, dbuser, dbpw);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
