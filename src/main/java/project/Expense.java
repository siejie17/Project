package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Expense extends Transaction implements ExpenseCRUD {
    private byte[] image;
    private String expenseType;
    private DatabaseManager databasemanager;
    private Connection connection;
    private String imagePath;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public byte[] getImage() {
        return this.image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getExpenseType() {
        return this.expenseType;
    }

    public void setExpenseType(String expenseType) {
        this.expenseType = expenseType;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Expense() {
        super();
        this.amount = 0.0;
        this.image = null;
        this.imagePath = null;
        this.databasemanager = new DatabaseManager();
        this.connection = databasemanager.getConnection();
    }

    public Expense(String name, String expenseType, Date date, double amount, String imagePath) {
        this.name = name;
        this.expenseType = expenseType;
        this.date = date;
        this.amount = amount;
        this.image = null;
        this.imagePath = imagePath;
        this.databasemanager = new DatabaseManager();
        this.connection = databasemanager.getConnection();
    }

    @Override
    public void addTransaction() {
        try {
            // Construct the SQL query with parameterized placeholders
            String query = "INSERT INTO expense (expense_type_id, expense_name, expense_date, expense_amount, image) VALUES (?, ?, ?, ?, ?)";

            // Set the parameter values of the prepared statement
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                try {
                    InputStream inputStream = new FileInputStream(new File(imagePath));
                    
                    int expenseTypeID = 0;
                
                    switch (this.expenseType) {
                        case "Food" -> expenseTypeID = 1;
                        case "Rent" -> expenseTypeID = 2;
                        case "Transport" -> expenseTypeID = 3;
                        case "Groceries" -> expenseTypeID = 4;
                        case "Fees" -> expenseTypeID = 5;
                        case "College" -> expenseTypeID = 6;
                        case "Healthcare" -> expenseTypeID = 7;
                        case "Others" -> expenseTypeID = 8;
                    }   

                    pstmt.setInt(1, expenseTypeID);
                    pstmt.setString(2, this.name);
                    pstmt.setDate(3, (java.sql.Date) this.date);
                    pstmt.setDouble(4, this.amount);
                    pstmt.setBlob(5, inputStream);

                    // Execute the prepared statement to insert the data into the database
                    pstmt.executeUpdate();
                
                // Close the resources
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Expense.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            databasemanager.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void viewTransaction(int expenseIndex) throws RuntimeException {
        try {
            String query = "SELECT expense_type_id, expense_name, expense_date, expense_amount, image FROM expense WHERE expense_id = ?";

            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setInt(1, expenseIndex); // Set the ID parameter
                
                ResultSet rs = pstmt.executeQuery();
                
                while(rs.next()) {
                    this.image = rs.getBytes("image"); // Get the image data as a byte array
                
                    setName(rs.getString("expense_name"));
                    setDate(rs.getDate("expense_date"));
                    setAmount(rs.getDouble("expense_amount"));
                    int expenseTypeID = rs.getInt("expense_type_id");
                    
                    switch (expenseTypeID) {
                        case 1 -> setExpenseType("Food");
                        case 2 -> setExpenseType("Rent");
                        case 3 -> setExpenseType("Transport");
                        case 4 -> setExpenseType("Groceries");
                        case 5 -> setExpenseType("Fees");
                        case 6 -> setExpenseType("College");
                        case 7 -> setExpenseType("Healthcare");
                        case 8 -> setExpenseType("Others");
                    }
                }
            } // Set the ID parameter
            
            databasemanager.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void editTransaction(int expenseIndex) {
        try {
            String query = "UPDATE expense SET expense_type_id = ?, expense_name = ?, expense_date = ?, expense_amount = ?, image = ? WHERE expense_id = ?";

            // Set the parameter values of the prepared statement
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                    try {
                        InputStream inputStream = new FileInputStream(new File(imagePath));
                        
                        int expenseTypeID = 0;

                        switch (this.expenseType) {
                            case "Food" -> expenseTypeID = 1;
                            case "Rent" -> expenseTypeID = 2;
                            case "Transport" -> expenseTypeID = 3;
                            case "Groceries" -> expenseTypeID = 4;
                            case "Fees" -> expenseTypeID = 5;
                            case "College" -> expenseTypeID = 6;
                            case "Healthcare" -> expenseTypeID = 7;
                            case "Others" -> expenseTypeID = 8;
                        }

                        pstmt.setInt(1, expenseTypeID);
                        pstmt.setString(2, this.name);
                        pstmt.setDate(3, (java.sql.Date) this.date);
                        pstmt.setDouble(4, this.amount);
                        pstmt.setBlob(5, inputStream);
                        pstmt.setInt(6, expenseIndex); // Set the ID parameter

                        // Execute the prepared statement to update the data into the database
                        pstmt.executeUpdate();

                    // Close the resources
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Expense.class.getName()).log(Level.SEVERE, null, ex);
                    }
            }
            
            databasemanager.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteTransaction(int expenseIndex) {
        try {
            String query = "DELETE FROM expense where expense_id = ?";

            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setInt(1, expenseIndex);
                
                // Execute the prepared statement to delete the data from the database
                pstmt.executeUpdate();
                
                // Close the resources
            }
            
            databasemanager.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public double generateExpenseSummaryByType(int expenseTypeID) {
        try {
            String query = "SELECT SUM(expense_amount) AS total_amount FROM expense WHERE expense_type_id = ?";
            
            double totalAmount;
            
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setInt(1, expenseTypeID);
                
                try (ResultSet rs = pstmt.executeQuery()) {
                    totalAmount = 0.0;
                    if (rs.next()) {
                        totalAmount = rs.getDouble("total_amount");
                    }
                }
            }
            
            return totalAmount;
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving expense summary", e);
        }
    }
    
    public void closeConnection() {
        databasemanager.closeConnection();
    }
}
