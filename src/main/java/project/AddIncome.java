package project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class AddIncome extends javax.swing.JFrame {

    public AddIncome() {
        initComponents();
        displayTypeofIncomeandPaymentMethod();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Addincome_Title = new javax.swing.JLabel();
        IncomeBasicInfo = new javax.swing.JPanel();
        IncomeName_Title = new javax.swing.JLabel();
        IncomeName_Value = new javax.swing.JTextField();
        IncomeDate_Title = new javax.swing.JLabel();
        Amt_Title = new javax.swing.JLabel();
        IncomeDate_Value = new com.toedter.calendar.JDateChooser();
        Amt_Value = new javax.swing.JTextField();
        IncomeType_Title = new javax.swing.JLabel();
        IncomeType_Value = new javax.swing.JComboBox<>();
        PaymentMethod_Title = new javax.swing.JLabel();
        PaymentMethod_Value = new javax.swing.JComboBox<>();
        backManageIncome = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNI Budget Planner - Add Income");

        Background.setBackground(new java.awt.Color(255, 255, 0));
        Background.setForeground(new java.awt.Color(51, 51, 51));
        Background.setPreferredSize(new java.awt.Dimension(410, 730));

        Addincome_Title.setBackground(new java.awt.Color(204, 204, 204));
        Addincome_Title.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        Addincome_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Addincome_Title.setText("Add Income");

        IncomeBasicInfo.setBackground(new java.awt.Color(255, 204, 102));
        IncomeBasicInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        IncomeBasicInfo.setPreferredSize(new java.awt.Dimension(398, 453));

        IncomeName_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IncomeName_Title.setText("Income Name");

        IncomeDate_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IncomeDate_Title.setText("Income Date");

        Amt_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Amt_Title.setText("Amount (RM)");

        IncomeType_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IncomeType_Title.setText("Income Type");

        PaymentMethod_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PaymentMethod_Title.setText("Payment Method");

        javax.swing.GroupLayout IncomeBasicInfoLayout = new javax.swing.GroupLayout(IncomeBasicInfo);
        IncomeBasicInfo.setLayout(IncomeBasicInfoLayout);
        IncomeBasicInfoLayout.setHorizontalGroup(
            IncomeBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncomeBasicInfoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(IncomeBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, IncomeBasicInfoLayout.createSequentialGroup()
                        .addGroup(IncomeBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IncomeName_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(IncomeDate_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(IncomeBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IncomeDate_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IncomeName_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, IncomeBasicInfoLayout.createSequentialGroup()
                        .addGroup(IncomeBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(IncomeType_Title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Amt_Title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PaymentMethod_Title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(IncomeBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Amt_Value)
                            .addComponent(IncomeType_Value, 0, 190, Short.MAX_VALUE)
                            .addComponent(PaymentMethod_Value, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(14, 14, 14))
        );
        IncomeBasicInfoLayout.setVerticalGroup(
            IncomeBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IncomeBasicInfoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(IncomeBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IncomeName_Title)
                    .addComponent(IncomeName_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(IncomeBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(IncomeBasicInfoLayout.createSequentialGroup()
                        .addGroup(IncomeBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(IncomeDate_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IncomeDate_Title))
                        .addGap(50, 50, 50)
                        .addComponent(Amt_Title))
                    .addComponent(Amt_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(IncomeBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IncomeType_Value)
                    .addComponent(IncomeType_Title))
                .addGap(50, 50, 50)
                .addGroup(IncomeBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(PaymentMethod_Title)
                    .addComponent(PaymentMethod_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        backManageIncome.setBackground(new java.awt.Color(204, 51, 0));
        backManageIncome.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backManageIncome.setForeground(new java.awt.Color(255, 255, 255));
        backManageIncome.setText("BACK");
        backManageIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backManageIncomeActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Confirm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Addincome_Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IncomeBasicInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(backManageIncome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Reset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Addincome_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(IncomeBasicInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backManageIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void displayTypeofIncomeandPaymentMethod(){
        DatabaseManager connect = new DatabaseManager();
        Connection conn = connect.getConnection();
        
            try {
                String query = "SELECT income_type_name FROM income_types";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(query);
                
                while (rs.next()){
                    String id = rs.getString("income_type_name");
                    IncomeType_Value.addItem(id);
                    
                }
                
                rs.close();
                st.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        
            try {
                String query = "SELECT paymentmethod_name FROM income_paymentmethod";
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
                e.printStackTrace();
            }
    }
    
    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        IncomeName_Value.setText("");
        IncomeType_Value.setSelectedIndex(0);
        PaymentMethod_Value.setSelectedIndex(0);
        IncomeDate_Value.setDate(null);
        Amt_Value.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        // TODO add your handling code here:
        Pattern amount_pattern = Pattern.compile("^[1-9][0-9]{0,10}[.][0-9]{0,2}$");
        Matcher matcher = amount_pattern.matcher(Amt_Value.getText());

        boolean b1 = matcher.find();
        
        if ((IncomeName_Value.getText()).isEmpty()){
            JOptionPane.showMessageDialog(null, "Invalid Name");
        } 
        else if (IncomeDate_Value.getDate() == null){
            JOptionPane.showMessageDialog(null, "Invalid Date");
        } 
        else if (b1 == false) {
            JOptionPane.showMessageDialog(null, "Invalid Amount (example : 45.93)");
        }
        else if ("".equals(IncomeType_Value.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "Please Choose an Income Type");
        } 
        else if ("".equals(PaymentMethod_Value.getSelectedItem())){
            JOptionPane.showMessageDialog(null, "Please Choose a Payment Method");
        } 
        else {
            String name = IncomeName_Value.getText();
            double amount = Double.parseDouble(Amt_Value.getText());
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(IncomeDate_Value.getDate());
            java.sql.Date newdate = java.sql.Date.valueOf(date);
            
            String incometype = IncomeType_Value.getSelectedItem().toString();
            String paymentmethod = PaymentMethod_Value.getSelectedItem().toString();

            Income obj = new Income(name, newdate, amount, paymentmethod, incometype);
            obj.addTransaction();

            IncomeName_Value.setText("");
            IncomeType_Value.setSelectedIndex(0);
            IncomeDate_Value.setDate(null);
            Amt_Value.setText("");
            PaymentMethod_Value.setSelectedIndex(0);

            JOptionPane.showMessageDialog(null, "Income has been added sucessfully");

            setVisible(false);
            BudgetPlanner backBudgetPlanner = new BudgetPlanner();
            backBudgetPlanner.setVisible(true);
        }
    }//GEN-LAST:event_ConfirmActionPerformed

    private void backManageIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backManageIncomeActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        BudgetPlanner backBudgetPlanner = new BudgetPlanner();
        backBudgetPlanner.setVisible(true);
    }//GEN-LAST:event_backManageIncomeActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new AddIncome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Addincome_Title;
    private javax.swing.JLabel Amt_Title;
    private javax.swing.JTextField Amt_Value;
    private javax.swing.JPanel Background;
    private javax.swing.JButton Confirm;
    private javax.swing.JPanel IncomeBasicInfo;
    private javax.swing.JLabel IncomeDate_Title;
    private com.toedter.calendar.JDateChooser IncomeDate_Value;
    private javax.swing.JLabel IncomeName_Title;
    private javax.swing.JTextField IncomeName_Value;
    private javax.swing.JLabel IncomeType_Title;
    private javax.swing.JComboBox<String> IncomeType_Value;
    private javax.swing.JLabel PaymentMethod_Title;
    private javax.swing.JComboBox<String> PaymentMethod_Value;
    private javax.swing.JButton Reset;
    private javax.swing.JButton backManageIncome;
    // End of variables declaration//GEN-END:variables
}
