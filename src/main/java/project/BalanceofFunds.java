package project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BalanceofFunds implements BalanceofFundsInterface {
    private double totalIncomeAmount;
    private double totalExpenseAmount;
    private double balanceAmount;
    private DatabaseManager databaseManager;
    private Connection connection;

    public BalanceofFunds() {
        this.totalIncomeAmount = 0.0;
        this.totalExpenseAmount = 0.0;
        this.balanceAmount = 0.0;
        this.databaseManager = new DatabaseManager();
        this.connection = databaseManager.getConnection();
        calculateTotalExpenseAmount();
        calculateTotalIncomeAmount();
        calculateBalanceofFunds();
        databaseManager.closeConnection();
    }
    
    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public double getTotalIncomeAmount() {
        return totalIncomeAmount;
    }

    private void calculateTotalIncomeAmount() {
        try {

            String query = "SELECT SUM(income_amount) AS total_income_amt FROM income";

            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                ResultSet rs = pstmt.executeQuery();
                
                if (rs.next()) {
                    this.totalIncomeAmount = rs.getDouble("total_income_amt");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public double getTotalExpenseAmount() {
        return totalExpenseAmount;
    }

    private void calculateTotalExpenseAmount() {
        try {

            String query = "SELECT SUM(expense_amount) AS total_expense_amt FROM expense";

            try (PreparedStatement pstmt = connection.prepareStatement(query)) {
                ResultSet rs = pstmt.executeQuery();
                
                if (rs.next()) {
                    this.totalExpenseAmount = rs.getDouble("total_expense_amt");
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public double getBalanceAmount() {
        return balanceAmount;
    }
    
    private void calculateBalanceofFunds() {
        this.balanceAmount = this.totalIncomeAmount - this.totalExpenseAmount;
    }
}
