package project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class EditIncome extends javax.swing.JFrame {
    
    public EditIncome(int incomeid) {
        this.incomeid = incomeid;
        initComponents();
        displaytypeofincome();
        displayCurrentIncome();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Income_BasicInfo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        IncomeName_Title = new javax.swing.JLabel();
        IncomeDate_Title = new javax.swing.JLabel();
        Amt_Title = new javax.swing.JLabel();
        IncomeType_Title = new javax.swing.JLabel();
        PaymentMethod_Title = new javax.swing.JLabel();
        IncomeName_Value = new javax.swing.JTextField();
        IncomeDate_Value = new com.toedter.calendar.JDateChooser();
        Amt_Value = new javax.swing.JTextField();
        IncomeType_Value = new javax.swing.JComboBox<>();
        PaymentMethod_Value = new javax.swing.JComboBox<>();
        Back = new javax.swing.JButton();
        EditIncome_Title = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNI Budget Planner - Edit Income");
        setPreferredSize(new java.awt.Dimension(420, 750));

        Background.setBackground(new java.awt.Color(255, 255, 0));

        Income_BasicInfo.setBackground(new java.awt.Color(255, 204, 102));

        IncomeName_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IncomeName_Title.setText("Income Name");

        IncomeDate_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IncomeDate_Title.setText("Income Date");

        Amt_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Amt_Title.setText("Amount (RM) ");

        IncomeType_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IncomeType_Title.setText("Income Type");

        PaymentMethod_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PaymentMethod_Title.setText("Payment Method ");

        IncomeName_Value.setText(" ");

        javax.swing.GroupLayout Income_BasicInfoLayout = new javax.swing.GroupLayout(Income_BasicInfo);
        Income_BasicInfo.setLayout(Income_BasicInfoLayout);
        Income_BasicInfoLayout.setHorizontalGroup(
            Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Income_BasicInfoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IncomeDate_Title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaymentMethod_Title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Amt_Title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Income_BasicInfoLayout.createSequentialGroup()
                        .addComponent(IncomeType_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(IncomeName_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(IncomeDate_Value, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                        .addComponent(IncomeName_Value)
                        .addComponent(Amt_Value, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(IncomeType_Value, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PaymentMethod_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        Income_BasicInfoLayout.setVerticalGroup(
            Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Income_BasicInfoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(Income_BasicInfoLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Income_BasicInfoLayout.createSequentialGroup()
                        .addGroup(Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IncomeName_Value, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IncomeName_Title))
                        .addGap(50, 50, 50)
                        .addComponent(IncomeDate_Title))
                    .addComponent(IncomeDate_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amt_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amt_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IncomeType_Title)
                    .addComponent(IncomeType_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PaymentMethod_Title)
                    .addComponent(PaymentMethod_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(123, Short.MAX_VALUE))
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

        EditIncome_Title.setFont(new java.awt.Font("Imprint MT Shadow", 0, 36)); // NOI18N
        EditIncome_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(EditIncome_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Back, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Income_BasicInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(13, 13, 13))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(EditIncome_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Income_BasicInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reset)
                    .addComponent(update))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Back)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displaytypeofincome(){
        DatabaseManager connect = new DatabaseManager();
        Connection conn = connect.getConnection();
        
        try{
            String query = "SELECT income_type_name, income_type_id FROM income_types";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()){
                String id = rs.getString("income_type_name");
                IncomeType_Value.addItem(id);
            }
            
            rs.close();
            st.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        try{
            String query ="SELECT paymentmethod_id,paymentmethod_name FROM income_paymentmethod";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()){
                String id = rs.getString("paymentmethod_name");
                PaymentMethod_Value.addItem(id);
                
            }
            
            rs.close();
            st.close();
            conn.close();
            
        } catch (SQLException e){
           JOptionPane.showMessageDialog(null, e);
        }   
    }
    
    private void displayCurrentIncome() {
        Income income = new Income();
        income.viewTransaction(this.incomeid);
        
        String show_id = Integer.toString(this.incomeid);
        DecimalFormat fmt = new DecimalFormat ("#0.00");
        
        EditIncome_Title.setText("Edit Income #" + show_id);
        IncomeType_Value.setSelectedItem(income.getIncomeType());
        PaymentMethod_Value.setSelectedItem(income.getPaymentMethod());
        IncomeName_Value.setText(income.getName());
        IncomeDate_Value.setDate(income.getDate());
        Amt_Value.setText(fmt.format(income.getAmount())); 
    }
    
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        Pattern amount_pattern = Pattern.compile("^[1-9][0-9]{0,10}[.][0-9]{0,2}$");
        Matcher matcher_1 = amount_pattern.matcher(Amt_Value.getText());
        
        boolean b1 = matcher_1.find();
        
        if ((IncomeName_Value.getText()).equals("")){
            JOptionPane.showMessageDialog(null, "Invalid Name");
        } 
        else if (IncomeDate_Value.getDate()== null){
            JOptionPane.showMessageDialog(null, "Invalid Date");
        } 
        else if ("".equals(IncomeType_Value.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "Empty Income Type");
        } 
        else if (b1 == false){
            JOptionPane.showMessageDialog(null, "Invalid Amount");
        } 
        else if ("".equals(PaymentMethod_Value.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "Please Select Payment Method");
        } 
        else {
            String name = IncomeName_Value.getText();
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(IncomeDate_Value.getDate());
            java.sql.Date newdate = java.sql.Date.valueOf(date);
            
            double amount = Double.parseDouble(Amt_Value.getText());
            
            String paymentmethod = PaymentMethod_Value.getSelectedItem().toString();
            
            String incometype = IncomeType_Value.getSelectedItem().toString();
            
            Transaction income = new Income(name, newdate, amount, paymentmethod, incometype);
            income.editTransaction(this.incomeid);
            
            JOptionPane.showMessageDialog(null, "Income #" + this.incomeid + " Edited Successfully.");
            
            setVisible(false);
            ManageIncome backManageIncome = new ManageIncome();
            backManageIncome.setVisible(true);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        IncomeName_Value.setText("");
        IncomeType_Value.setSelectedIndex(0);
        IncomeDate_Value.setDate(null);
        PaymentMethod_Value.setSelectedIndex(0);
        Amt_Value.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        IncomeName_Value.setText("");
        IncomeType_Value.setSelectedIndex(0);
        IncomeDate_Value.setDate(null);
        PaymentMethod_Value.setSelectedIndex(0);
        Amt_Value.setText("");
        
        setVisible(false);
        ManageIncome backManageIncome = new ManageIncome();
        backManageIncome.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new EditIncome(1).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amt_Title;
    private javax.swing.JTextField Amt_Value;
    private javax.swing.JButton Back;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel EditIncome_Title;
    private javax.swing.JLabel IncomeDate_Title;
    private com.toedter.calendar.JDateChooser IncomeDate_Value;
    private javax.swing.JLabel IncomeName_Title;
    private javax.swing.JTextField IncomeName_Value;
    private javax.swing.JLabel IncomeType_Title;
    private javax.swing.JComboBox<String> IncomeType_Value;
    private javax.swing.JPanel Income_BasicInfo;
    private javax.swing.JLabel PaymentMethod_Title;
    private javax.swing.JComboBox<String> PaymentMethod_Value;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton reset;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
    // User defined attribute(s)
    private int incomeid;
}
