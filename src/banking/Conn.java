package banking;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Conn {

    public Connection c;
    public Statement s;

    public Conn() {
        try {
            // Create a Properties object to hold the configuration
            Properties props = new Properties();

            // Load the properties file from the classpath
            // Make sure 'config.properties' is in your resources folder
            InputStream input = getClass().getClassLoader().getResourceAsStream("config.properties");
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            props.load(input);

            // Get the database credentials from the properties file
            String url = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String password = props.getProperty("db.password");

            // Establish the connection using the loaded credentials
            c = DriverManager.getConnection(url, user, password);
            s = c.createStatement();

        } catch (Exception e) {
            // Print the exception for debugging purposes
            e.printStackTrace();
        }
    }
}