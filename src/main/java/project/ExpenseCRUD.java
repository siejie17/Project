package project;

public interface ExpenseCRUD {
    public void addTransaction();
    public void viewTransaction(int expenseIndex);
    public void editTransaction(int expenseIndex);
    public void deleteTransaction(int expenseIndex);
}
