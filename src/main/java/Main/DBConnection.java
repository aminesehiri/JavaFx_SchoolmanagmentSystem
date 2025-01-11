package Main;
import java.sql.Connection;
import java.sql.DriverManager;

import static java.lang.Class.forName;

public class DBConnection {
    public static Connection connect() {
        String url = "jdbc:mysql://localhost:3306/apprenant";
        String username = "root";
        String password = "azerty123";
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to database");
        } catch (Exception e) {
            System.out.println("Failed to connect to database");
            e.printStackTrace();
        }
        return conn;

    }


}

