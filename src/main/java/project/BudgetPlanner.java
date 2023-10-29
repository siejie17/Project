package project;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class BudgetPlanner extends javax.swing.JFrame {

    public BudgetPlanner() {
        initComponents();
        displayBalanceofFunds();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        ExpenseOperations_Field = new javax.swing.JPanel();
        AddExpense = new javax.swing.JButton();
        ManageExpense = new javax.swing.JButton();
        SummaryofExpenses = new javax.swing.JButton();
        ExpenseOperations = new javax.swing.JLabel();
        MonthlyGraph = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        IncomeOperations_Field = new javax.swing.JPanel();
        IncomeOperations = new javax.swing.JLabel();
        AddIncome = new javax.swing.JButton();
        ManageIncome = new javax.swing.JButton();
        BalanceofFunds_Field = new javax.swing.JPanel();
        BalanceofFunds_Title = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNI Budget Planner - Main Page");

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(430, 730));

        ExpenseOperations_Field.setBackground(new java.awt.Color(255, 204, 102));
        ExpenseOperations_Field.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        AddExpense.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddExpense.setText("Add Expense");
        AddExpense.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddExpenseActionPerformed(evt);
            }
        });

        ManageExpense.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ManageExpense.setText("Manage Expense");
        ManageExpense.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ManageExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageExpenseActionPerformed(evt);
            }
        });

        SummaryofExpenses.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SummaryofExpenses.setText("Summary of Expenses");
        SummaryofExpenses.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SummaryofExpenses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SummaryofExpensesActionPerformed(evt);
            }
        });

        ExpenseOperations.setBackground(new java.awt.Color(255, 255, 255));
        ExpenseOperations.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        ExpenseOperations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExpenseOperations.setText("Expense");

        MonthlyGraph.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MonthlyGraph.setText("Monthly Graph");
        MonthlyGraph.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MonthlyGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthlyGraphActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ExpenseOperations_FieldLayout = new javax.swing.GroupLayout(ExpenseOperations_Field);
        ExpenseOperations_Field.setLayout(ExpenseOperations_FieldLayout);
        ExpenseOperations_FieldLayout.setHorizontalGroup(
            ExpenseOperations_FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpenseOperations_FieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ExpenseOperations_FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExpenseOperations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SummaryofExpenses, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                    .addComponent(ManageExpense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AddExpense, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MonthlyGraph, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ExpenseOperations_FieldLayout.setVerticalGroup(
            ExpenseOperations_FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpenseOperations_FieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExpenseOperations)
                .addGap(18, 18, 18)
                .addComponent(AddExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(ManageExpense, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SummaryofExpenses, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MonthlyGraph, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UNI Budget Planner");

        IncomeOperations_Field.setBackground(new java.awt.Color(255, 204, 102));
        IncomeOperations_Field.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        IncomeOperations.setBackground(new java.awt.Color(255, 204, 102));
        IncomeOperations.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        IncomeOperations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IncomeOperations.setText("Income");

        AddIncome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AddIncome.setText("Add Income");
        AddIncome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AddIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddIncomeActionPerformed(evt);
            }
        });

        ManageIncome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ManageIncome.setText("Manage Income");
        ManageIncome.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ManageIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageIncomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IncomeOperations_FieldLayout = new javax.swing.GroupLayout(IncomeOperations_Field);
        IncomeOperations_Field.setLayout(IncomeOperations_FieldLayout);
        IncomeOperations_FieldLayout.setHorizontalGroup(
            IncomeOperations_FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncomeOperations_FieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(IncomeOperations_FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IncomeOperations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(IncomeOperations_FieldLayout.createSequentialGroup()
                        .addGroup(IncomeOperations_FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AddIncome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ManageIncome, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        IncomeOperations_FieldLayout.setVerticalGroup(
            IncomeOperations_FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IncomeOperations_FieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IncomeOperations)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ManageIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        BalanceofFunds_Field.setBackground(new java.awt.Color(255, 204, 102));
        BalanceofFunds_Field.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        BalanceofFunds_Title.setBackground(new java.awt.Color(102, 255, 0));
        BalanceofFunds_Title.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        BalanceofFunds_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout BalanceofFunds_FieldLayout = new javax.swing.GroupLayout(BalanceofFunds_Field);
        BalanceofFunds_Field.setLayout(BalanceofFunds_FieldLayout);
        BalanceofFunds_FieldLayout.setHorizontalGroup(
            BalanceofFunds_FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BalanceofFunds_FieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BalanceofFunds_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BalanceofFunds_FieldLayout.setVerticalGroup(
            BalanceofFunds_FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BalanceofFunds_FieldLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BalanceofFunds_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addContainerGap())
        );

        Exit.setBackground(new java.awt.Color(204, 51, 0));
        Exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("EXIT");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IncomeOperations_Field, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BalanceofFunds_Field, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseOperations_Field, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BalanceofFunds_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExpenseOperations_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(IncomeOperations_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displayBalanceofFunds(){
        BalanceofFunds amount = new BalanceofFunds();
        double balance = amount.getBalanceAmount();
        DecimalFormat fmt = new DecimalFormat ("#0.00");
        BalanceofFunds_Title.setText("Available Balance : RM" + fmt.format(balance));
    }
    
    private void AddExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddExpenseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        AddExpense addexpense = new AddExpense();
        addexpense.setVisible(true);
    }//GEN-LAST:event_AddExpenseActionPerformed

    private void ManageExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageExpenseActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ManageExpense manageexpense = new ManageExpense();
        manageexpense.setVisible(true);
    }//GEN-LAST:event_ManageExpenseActionPerformed

    private void SummaryofExpensesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SummaryofExpensesActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ExpenseTypeSummary expensetypesummary = new ExpenseTypeSummary();
        expensetypesummary.setVisible(true);
    }//GEN-LAST:event_SummaryofExpensesActionPerformed

    private void MonthlyGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthlyGraphActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        MonthlyExpenseGraph monthlyexpensegraph = new MonthlyExpenseGraph();
        monthlyexpensegraph.setVisible(true);
    }//GEN-LAST:event_MonthlyGraphActionPerformed

    private void AddIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddIncomeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        AddIncome addincome = new AddIncome();
        addincome.setVisible(true);
    }//GEN-LAST:event_AddIncomeActionPerformed

    private void ManageIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageIncomeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ManageIncome manageincome = new ManageIncome();
        manageincome.setVisible(true);
    }//GEN-LAST:event_ManageIncomeActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to quit?", "Quit",JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            // Perform cleanup or any necessary operations before quitting
            this.dispose(); // Close the main frame
            System.exit(0); // Terminate the Java application
        }
    }//GEN-LAST:event_ExitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new BudgetPlanner().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddExpense;
    private javax.swing.JButton AddIncome;
    private javax.swing.JPanel BalanceofFunds_Field;
    private javax.swing.JLabel BalanceofFunds_Title;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel ExpenseOperations;
    private javax.swing.JPanel ExpenseOperations_Field;
    private javax.swing.JLabel IncomeOperations;
    private javax.swing.JPanel IncomeOperations_Field;
    private javax.swing.JButton ManageExpense;
    private javax.swing.JButton ManageIncome;
    private javax.swing.JButton MonthlyGraph;
    private javax.swing.JButton SummaryofExpenses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
