package project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class ManageExpense extends javax.swing.JFrame {

    public ManageExpense() {
        initComponents();
        displayexpense();
        displayID();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        ManageExpense_Title = new javax.swing.JLabel();
        Expense_Manager = new javax.swing.JPanel();
        Edit = new javax.swing.JButton();
        View = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        ExpenseID_Title = new javax.swing.JLabel();
        ExpenseID_Value = new javax.swing.JComboBox<>();
        ExpenseTable_Container = new javax.swing.JPanel();
        ExpenseTable_ScrollPane = new javax.swing.JScrollPane();
        ExpenseTable = new javax.swing.JTable();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNI Budget Planner - Manage Expense");

        Background.setBackground(new java.awt.Color(255, 255, 0));

        ManageExpense_Title.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        ManageExpense_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageExpense_Title.setText("Manage Expense");

        Expense_Manager.setBackground(new java.awt.Color(255, 204, 102));
        Expense_Manager.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Edit.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Edit.setText("Edit Expense");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        View.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        View.setText("View Expense");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        Delete.setText("Delete Expense");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        ExpenseID_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExpenseID_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExpenseID_Title.setText("Expense ID :");

        javax.swing.GroupLayout Expense_ManagerLayout = new javax.swing.GroupLayout(Expense_Manager);
        Expense_Manager.setLayout(Expense_ManagerLayout);
        Expense_ManagerLayout.setHorizontalGroup(
            Expense_ManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Expense_ManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Expense_ManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Expense_ManagerLayout.createSequentialGroup()
                        .addGroup(Expense_ManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(View, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Expense_ManagerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ExpenseID_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ExpenseID_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        Expense_ManagerLayout.setVerticalGroup(
            Expense_ManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Expense_ManagerLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addGroup(Expense_ManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExpenseID_Value, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExpenseID_Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        ExpenseTable_Container.setBackground(new java.awt.Color(255, 204, 102));
        ExpenseTable_Container.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ExpenseTable.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        ExpenseTable_ScrollPane.setViewportView(ExpenseTable);

        javax.swing.GroupLayout ExpenseTable_ContainerLayout = new javax.swing.GroupLayout(ExpenseTable_Container);
        ExpenseTable_Container.setLayout(ExpenseTable_ContainerLayout);
        ExpenseTable_ContainerLayout.setHorizontalGroup(
            ExpenseTable_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpenseTable_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExpenseTable_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        ExpenseTable_ContainerLayout.setVerticalGroup(
            ExpenseTable_ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpenseTable_ContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ExpenseTable_ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );

        Back.setBackground(new java.awt.Color(204, 51, 0));
        Back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseTable_Container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Expense_Manager, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ManageExpense_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(ManageExpense_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExpenseTable_Container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(Expense_Manager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Back)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displayID() {
        DatabaseManager connect = new DatabaseManager();
        Connection conn = connect.getConnection();
        try
        {
            String query = "SELECT expense_id FROM expense ORDER BY expense_id";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                String id = rs.getString("expense_id");
                ExpenseID_Value.addItem(id);
            }
            
            rs.close();
            st.close();
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    private void displayexpense() {
        DatabaseManager connect = new DatabaseManager();
        Connection conn = connect.getConnection();
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Date");
        model.addColumn("Amount");
        
        try {
            String query = "SELECT * FROM expense";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
                model.addRow(new Object[]{
                    rs.getString("expense_id"),
                    rs.getString("expense_name"),
                    rs.getString("expense_date"),
                    rs.getString("expense_amount")
                });
            }
            rs.close();
            st.close();
            conn.close();
            
            ExpenseTable.setModel(model);
            
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            
            int[] columnWidths = {30, 200, 100, 100}; // Desired widths for each column
            
            for (int i = 0; i < ExpenseTable.getColumnCount(); i++) {
                TableColumn column = ExpenseTable.getColumnModel().getColumn(i);
                column.setPreferredWidth(columnWidths[i]);
                if(!(i == 1)) {
                    column.setCellRenderer(centerRenderer);
                }
            }
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        int id = Integer.parseInt(ExpenseID_Value.getSelectedItem().toString());

        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", "Edit Confirmation", JOptionPane.OK_CANCEL_OPTION);

        if (confirm == JOptionPane.OK_OPTION) {
            // User clicked "OK"
            setVisible(false);
            EditExpense edit = new EditExpense(id);
            edit.setVisible(true);
        }
    }//GEN-LAST:event_EditActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        int id = Integer.parseInt(ExpenseID_Value.getSelectedItem().toString());
        setVisible(false);
        ViewExpense view = new ViewExpense(id);
        view.setVisible(true);
    }//GEN-LAST:event_ViewActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int id = Integer.parseInt(ExpenseID_Value.getSelectedItem().toString());

        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete Confirmation", JOptionPane.OK_CANCEL_OPTION);

        if (confirm == JOptionPane.OK_OPTION) {
            // User clicked "OK"
            Expense delete = new Expense();
            delete.deleteTransaction(id);
            JOptionPane.showMessageDialog(null, "The selected expense has been deleted.", "Expense " + id + " Deleted", JOptionPane.INFORMATION_MESSAGE);
            
            this.setVisible(false);
            ManageExpense refresh = new ManageExpense();
            refresh.setVisible(true);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        BudgetPlanner backBudgetPlanner = new BudgetPlanner();
        backBudgetPlanner.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ManageExpense().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JPanel Background;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JLabel ExpenseID_Title;
    private javax.swing.JComboBox<String> ExpenseID_Value;
    private javax.swing.JTable ExpenseTable;
    private javax.swing.JPanel ExpenseTable_Container;
    private javax.swing.JScrollPane ExpenseTable_ScrollPane;
    private javax.swing.JPanel Expense_Manager;
    private javax.swing.JLabel ManageExpense_Title;
    private javax.swing.JButton View;
    // End of variables declaration//GEN-END:variables
}
