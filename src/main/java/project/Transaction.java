package project;

import java.util.Date;

public abstract class Transaction {
    protected String name;
    protected Date date;
    protected double amount;

    public Transaction() {
        this.name = "";
        this.date = null;
        this.amount = 0.0;
    }

    public Transaction(String name, Date date, double amount) {
        this.name = name;
        this.date = date;
        this.amount = amount;
    }

    public abstract void addTransaction();
    public abstract void viewTransaction(int transactionIndex);
    public abstract void editTransaction(int transactionIndex);
    public abstract void deleteTransaction(int transactionIndex);
}
