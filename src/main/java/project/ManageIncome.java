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

public class ManageIncome extends javax.swing.JFrame {

    public ManageIncome() {
        initComponents();
        displayincome();
        displayID();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        ManageIncome_Title = new javax.swing.JLabel();
        Income_Operations = new javax.swing.JPanel();
        IncomeID_Title = new javax.swing.JLabel();
        IncomeID_Value = new javax.swing.JComboBox<>();
        View = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        IncomeTable_Deco = new javax.swing.JPanel();
        IncomeTable_ScrollPane = new javax.swing.JScrollPane();
        IncomeTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNI Budget Planner - Manage Income");
        setBackground(new java.awt.Color(255, 255, 255));

        Background.setBackground(new java.awt.Color(255, 255, 0));
        Background.setForeground(new java.awt.Color(255, 255, 255));

        ManageIncome_Title.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        ManageIncome_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ManageIncome_Title.setText("Manage Income");

        Income_Operations.setBackground(new java.awt.Color(255, 204, 102));

        IncomeID_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IncomeID_Title.setText("Income ID :");

        View.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        View.setText("VIEW INCOME");
        View.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewActionPerformed(evt);
            }
        });

        Edit.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Edit.setText("EDIT INCOME");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Delete.setText("DELETE INCOME");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Income_OperationsLayout = new javax.swing.GroupLayout(Income_Operations);
        Income_Operations.setLayout(Income_OperationsLayout);
        Income_OperationsLayout.setHorizontalGroup(
            Income_OperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Income_OperationsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Income_OperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Income_OperationsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(IncomeID_Title)
                        .addGap(18, 18, 18)
                        .addComponent(IncomeID_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Income_OperationsLayout.createSequentialGroup()
                        .addGroup(Income_OperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Delete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Edit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(View, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        Income_OperationsLayout.setVerticalGroup(
            Income_OperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Income_OperationsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(Income_OperationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IncomeID_Title)
                    .addComponent(IncomeID_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(View, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
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

        IncomeTable_Deco.setBackground(new java.awt.Color(255, 204, 102));

        IncomeTable_ScrollPane.setViewportView(IncomeTable);

        javax.swing.GroupLayout IncomeTable_DecoLayout = new javax.swing.GroupLayout(IncomeTable_Deco);
        IncomeTable_Deco.setLayout(IncomeTable_DecoLayout);
        IncomeTable_DecoLayout.setHorizontalGroup(
            IncomeTable_DecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncomeTable_DecoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IncomeTable_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        IncomeTable_DecoLayout.setVerticalGroup(
            IncomeTable_DecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IncomeTable_DecoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IncomeTable_ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ManageIncome_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(Income_Operations, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IncomeTable_Deco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ManageIncome_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IncomeTable_Deco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Income_Operations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
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
        try {
            String query = "SELECT income_id FROM income ORDER BY income_id";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                String id = rs.getString("income_id");
                IncomeID_Value.addItem(id);
            }
            
            rs.close();
            st.close();
            conn.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void displayincome(){
        DatabaseManager connect = new DatabaseManager();
        Connection conn = connect.getConnection();
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("ID");
        model.addColumn("Name");
        model.addColumn("Date");
        model.addColumn("Amount (RM)");
        
        try {
            String query = "SELECT * FROM income";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next())
            {
               model.addRow(new Object[]{
                    rs.getString("income_id"),
                    rs.getString("income_name"),
                    rs.getString("income_date"),
                    rs.getString("income_amount")  
            });
        }
            rs.close();
            st.close();
            conn.close();
            
            IncomeTable.setModel(model);
            
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(JLabel.CENTER);
            
            int[] columnWidths = {50, 200, 100, 100}; // Desired widths for each column
            
            for (int i = 0; i < IncomeTable.getColumnCount(); i++) {
                TableColumn column = IncomeTable.getColumnModel().getColumn(i);
                column.setPreferredWidth(columnWidths[i]);
                if(!(i == 1)) {
                    column.setCellRenderer(centerRenderer);
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        int id = Integer.parseInt(IncomeID_Value.getSelectedItem().toString());
        
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", "Edit Confirmation", JOptionPane.OK_CANCEL_OPTION);

        if (confirm == JOptionPane.OK_OPTION) {
            this.setVisible(false);
            EditIncome edit = new EditIncome(id);
            edit.setVisible(true);
        }
    }//GEN-LAST:event_EditActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        BudgetPlanner backBudgetPlanner = new BudgetPlanner();
        backBudgetPlanner.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        int id = Integer.parseInt(IncomeID_Value.getSelectedItem().toString());
        
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete Confirmation", JOptionPane.OK_CANCEL_OPTION);

        if (confirm == JOptionPane.OK_OPTION) {
            Income income = new Income();
            income.deleteTransaction(id);
            JOptionPane.showMessageDialog(null, "The selected expense has been deleted.", "Income " + id + " Deleted", JOptionPane.INFORMATION_MESSAGE);
        
            this.setVisible(false);
            ManageIncome refresh = new ManageIncome();
            refresh.setVisible(true);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void ViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewActionPerformed
        int id = Integer.parseInt(IncomeID_Value.getSelectedItem().toString());
        this.setVisible(false);
        ViewIncome view = new ViewIncome(id);
        view.setVisible(true);
    }//GEN-LAST:event_ViewActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ManageIncome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JPanel Background;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JLabel IncomeID_Title;
    private javax.swing.JComboBox<String> IncomeID_Value;
    private javax.swing.JTable IncomeTable;
    private javax.swing.JPanel IncomeTable_Deco;
    private javax.swing.JScrollPane IncomeTable_ScrollPane;
    private javax.swing.JPanel Income_Operations;
    private javax.swing.JLabel ManageIncome_Title;
    private javax.swing.JButton View;
    // End of variables declaration//GEN-END:variables
}
