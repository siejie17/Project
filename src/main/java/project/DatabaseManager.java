package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager implements DatabaseManagerInterface {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/budgetPlannerApp";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    private Connection connection;

    public DatabaseManager() {
        // Initialize the connection
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setConnection(Connection conn) {
        this.connection = conn;
    }
    
    @Override
    public Connection getConnection() {
        return connection;
    }

    @Override
    public void closeConnection() {
        // Close the connection
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
