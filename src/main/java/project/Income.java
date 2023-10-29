package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Income extends Transaction implements IncomeCRUD {
    private String paymentMethod;
    private String incomeType;
    private DatabaseManager databasemanager;
    private Connection connection;

    public Income() {
        super();
        this.databasemanager = new DatabaseManager();
        this.paymentMethod = "";
        this.incomeType = "";
    }

    public Income(String name, Date date, double amount, String paymentMethod, String incomeType) {
        this.databasemanager = new DatabaseManager();
        this.name = name;
        this.date = date;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.incomeType = incomeType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return this.name;
    }

    public Date getDate() {
        return this.date;
    }

    public double getAmount() {
        return this.amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(String incomeType) {
        this.incomeType = incomeType;
    }

    @Override
    public void addTransaction() {
        try {
            connection = databasemanager.getConnection();

            // Construct the SQL query with parameterized placeholders
            String query = "INSERT INTO income (income_type_id, income_name, income_date, income_amount, paymentmethod_id) VALUES (?, ?, ?, ?, ?)";

            // Set the parameter values of the prepared statement
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                // Set the parameter values of the prepared statement
                int incomeTypeID = 0;
                
                switch (this.incomeType) {
                    case "Scholarship" -> incomeTypeID = 1;
                    case "Loan" -> incomeTypeID = 2;
                    case "Part-time Job" -> incomeTypeID = 3;
                    case "Others" -> incomeTypeID = 4;
                }   
                
                int paymentmethodID = 0;
                
                switch (this.paymentMethod) {
                    case "Direct Deposit" -> paymentmethodID = 1;
                    case "Wire Transfer" -> paymentmethodID = 2;
                    case "Cash" -> paymentmethodID = 3;
                }   
                
                pstmt.setInt(1, incomeTypeID);
                pstmt.setString(2, this.name);
                pstmt.setDate(3, (java.sql.Date) this.date);
                pstmt.setDouble(4, this.amount);
                pstmt.setInt(5, paymentmethodID);
                
                // Execute the prepared statement to insert the data into the database
                pstmt.executeUpdate();
                
                // Close the resources
            }
            
            databasemanager.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void viewTransaction(int incomeIndex) {
        try {
            connection = databasemanager.getConnection();

            String query = "SELECT income_type_id, income_name, income_date, income_amount, paymentmethod_id FROM income WHERE income_id = ?";

            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setInt(1, incomeIndex); // Set the ID parameter
                
                ResultSet rs = pstmt.executeQuery();
                
                if(rs.next()) {
                    setName(rs.getString("income_name"));
                    setDate(rs.getDate("income_date"));
                    setAmount(rs.getDouble("income_amount"));

                    int incomeTypeID = rs.getInt("income_type_id");
                    int paymentMethodID = rs.getInt("paymentmethod_id");

                    switch (incomeTypeID) {
                        case 1 -> setIncomeType("Scholarship");
                        case 2 -> setIncomeType("Loan");
                        case 3 -> setIncomeType("Part-time Job");
                        case 4 -> setIncomeType("Others");
                    }

                    switch (paymentMethodID) {
                        case 1 -> setPaymentMethod("Direct Deposit");
                        case 2 -> setPaymentMethod("Wire Transfer");
                        case 3 -> setPaymentMethod("Cash");
                    }
                }
            }
            
            databasemanager.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void editTransaction(int incomeIndex) {
        try {
            connection = databasemanager.getConnection();

            // Construct the SQL query with parameterized placeholders
            String query = "UPDATE income SET income_type_id = ?, income_name = ?, income_date = ?, income_amount = ?, paymentmethod_id = ? WHERE income_id = ?";

            // Set the parameter values of the prepared statement
            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                // Set the parameter values of the prepared statement
                int incomeTypeID = 0;
                
                switch (this.incomeType) {
                    case "Scholarship" -> incomeTypeID = 1;
                    case "Loan" -> incomeTypeID = 2;
                    case "Part-time Job" -> incomeTypeID = 3;
                    case "Others" -> incomeTypeID = 4;
                }   
                
                int paymentmethodID = 0;
                
                switch (this.paymentMethod) {
                    case "Direct Deposit" -> paymentmethodID = 1;
                    case "Wire Transfer" -> paymentmethodID = 2;
                    case "Cash" -> paymentmethodID = 3;
                }   
                
                pstmt.setInt(1, incomeTypeID);
                pstmt.setString(2, this.name);
                pstmt.setDate(3, (java.sql.Date) this.date);
                pstmt.setDouble(4, this.amount);
                pstmt.setInt(5, paymentmethodID);
                pstmt.setInt(6, incomeIndex);
                
                // Execute the prepared statement to insert the data into the database
                pstmt.executeUpdate();
                // Close the resources
            }
            
            databasemanager.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteTransaction(int incomeIndex) {
        try {
            connection = databasemanager.getConnection();

            String query = "DELETE FROM income where income_id = ?";

            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                pstmt.setInt(1, incomeIndex);
                
                // Execute the prepared statement to delete the data from the database
                pstmt.executeUpdate();
                
                // Close the resources
            }
            
            databasemanager.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
