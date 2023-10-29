package project;

import java.sql.Connection;

public interface DatabaseManagerInterface {
    public Connection getConnection();
    public void closeConnection();
    public void setConnection(Connection conn);
}
