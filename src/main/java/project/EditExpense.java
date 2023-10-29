package project;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class EditExpense extends javax.swing.JFrame {
    
    public EditExpense(int expenseID) {
        this.expenseID = expenseID;
        initComponents();
        displayTypeofExpense();
        displayCurrentExpense();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        ExpenseImage_BasicInfo = new javax.swing.JPanel();
        Update = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        UploadImage = new javax.swing.JButton();
        ExpenseImage_Field = new javax.swing.JPanel();
        ExpenseImage = new javax.swing.JLabel();
        EditExpense_Title = new javax.swing.JLabel();
        Expense_BasicInfo = new javax.swing.JPanel();
        ExpenseName_Title = new javax.swing.JLabel();
        ExpenseName_Value = new javax.swing.JTextField();
        ExpenseType_Title = new javax.swing.JLabel();
        ExpenseType_Value = new javax.swing.JComboBox<>();
        ExpenseDate_Title = new javax.swing.JLabel();
        ExpenseDate_Value = new com.toedter.calendar.JDateChooser();
        Amt_Title = new javax.swing.JLabel();
        Amt_Value = new javax.swing.JTextField();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNI Budget Planner - Edit Expense");

        Background.setBackground(new java.awt.Color(255, 255, 0));

        ExpenseImage_BasicInfo.setBackground(new java.awt.Color(255, 204, 102));
        ExpenseImage_BasicInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Update.setText("Update");
        Update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Reset.setText("Reset");
        Reset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetResetActionPerformed(evt);
            }
        });

        UploadImage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UploadImage.setText("Upload Image");
        UploadImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadImageActionPerformed(evt);
            }
        });

        ExpenseImage_Field.setBackground(new java.awt.Color(255, 255, 255));
        ExpenseImage_Field.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ExpenseImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout ExpenseImage_FieldLayout = new javax.swing.GroupLayout(ExpenseImage_Field);
        ExpenseImage_Field.setLayout(ExpenseImage_FieldLayout);
        ExpenseImage_FieldLayout.setHorizontalGroup(
            ExpenseImage_FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExpenseImage, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
        );
        ExpenseImage_FieldLayout.setVerticalGroup(
            ExpenseImage_FieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExpenseImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ExpenseImage_BasicInfoLayout = new javax.swing.GroupLayout(ExpenseImage_BasicInfo);
        ExpenseImage_BasicInfo.setLayout(ExpenseImage_BasicInfoLayout);
        ExpenseImage_BasicInfoLayout.setHorizontalGroup(
            ExpenseImage_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpenseImage_BasicInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ExpenseImage_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ExpenseImage_BasicInfoLayout.createSequentialGroup()
                        .addComponent(Update, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(Reset, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                    .addComponent(UploadImage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(ExpenseImage_BasicInfoLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(ExpenseImage_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ExpenseImage_BasicInfoLayout.setVerticalGroup(
            ExpenseImage_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpenseImage_BasicInfoLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(ExpenseImage_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UploadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ExpenseImage_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        EditExpense_Title.setBackground(new java.awt.Color(255, 255, 255));
        EditExpense_Title.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        EditExpense_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EditExpense_Title.setToolTipText("");

        Expense_BasicInfo.setBackground(new java.awt.Color(255, 204, 102));
        Expense_BasicInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ExpenseName_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExpenseName_Title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ExpenseName_Title.setText("Expense Name");

        ExpenseType_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExpenseType_Title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ExpenseType_Title.setText("Expense Type");

        ExpenseDate_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExpenseDate_Title.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ExpenseDate_Title.setText("Expense Date");

        Amt_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Amt_Title.setText("Amount (RM)");

        javax.swing.GroupLayout Expense_BasicInfoLayout = new javax.swing.GroupLayout(Expense_BasicInfo);
        Expense_BasicInfo.setLayout(Expense_BasicInfoLayout);
        Expense_BasicInfoLayout.setHorizontalGroup(
            Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Expense_BasicInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ExpenseType_Title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseDate_Title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Amt_Title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseName_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Amt_Value)
                    .addComponent(ExpenseType_Value, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseName_Value, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ExpenseDate_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Expense_BasicInfoLayout.setVerticalGroup(
            Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Expense_BasicInfoLayout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExpenseName_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseName_Value))
                .addGap(10, 10, 10)
                .addGroup(Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExpenseType_Title)
                    .addComponent(ExpenseType_Value))
                .addGap(10, 10, 10)
                .addGroup(Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExpenseDate_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseDate_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Expense_BasicInfoLayout.createSequentialGroup()
                        .addComponent(Amt_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(Amt_Title))
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
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Expense_BasicInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseImage_BasicInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(EditExpense_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EditExpense_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Expense_BasicInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ExpenseImage_BasicInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Back)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void displayTypeofExpense(){
        DatabaseManager connect = new DatabaseManager();
        Connection conn = connect.getConnection();

        try {
            String query = "SELECT expense_type_name,expense_type_id FROM expense_types";
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {
                String id = rs.getString("expense_type_name");
                ExpenseType_Value.addItem(id);
            }
            
            rs.close();
            st.close();
            conn.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }          
    }
    
    private void displayCurrentExpense() {
        Expense obj = new Expense();
        obj.viewTransaction(this.expenseID);
        String show_id = Integer.toString(expenseID);
        
        DecimalFormat fmt = new DecimalFormat ("#0.00");
        
        EditExpense_Title.setText("Edit Expense #" + show_id);
        ExpenseType_Value.setSelectedItem(obj.getExpenseType());
        ExpenseName_Value.setText(obj.getName());
        ExpenseDate_Value.setDate(obj.getDate());       
        Amt_Value.setText(fmt.format(obj.getAmount()));
        
        byte[] image = obj.getImage();
        ImageIcon imageicon = new ImageIcon(image);
        Image resizedImage = imageicon.getImage().getScaledInstance(ExpenseImage.getWidth(), ExpenseImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        ExpenseImage.setIcon(resizedImageIcon);
    }
    
    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        Pattern amount_pattern = Pattern.compile("^[1-9][0-9]{0,10}[.][0-9]{0,2}$");
        Matcher matcher_1 = amount_pattern.matcher(Amt_Value.getText());

        boolean b1 = matcher_1.find();
        Icon icon = ExpenseImage.getIcon();

        if ((ExpenseName_Value.getText()).equals("")){
            JOptionPane.showMessageDialog(null, "Expense name couldn't be null.");
        } 
        else if (ExpenseDate_Value.getDate() == null){
            JOptionPane.showMessageDialog(null, "Expense date couldn't be null.");
        } 
        else if ("".equals(ExpenseType_Value.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "Empty expense type");
        } 
        else if (b1 == false){
            JOptionPane.showMessageDialog(null, "Invalid amount format (example : 45.93)");
        } 
        else if (icon == null) {
            JOptionPane.showMessageDialog(null, "Expense image couldn't be null.");
        }
        else{
            String name = ExpenseName_Value.getText();
            double amount = Double.parseDouble(Amt_Value.getText());

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(ExpenseDate_Value.getDate());
            java.sql.Date newdate = java.sql.Date.valueOf(date);

            String expensetype = ExpenseType_Value.getSelectedItem().toString();

            Transaction expense = new Expense(name, expensetype, newdate, amount, this.selectedImagePath);
            expense.editTransaction(this.expenseID);

            ExpenseName_Value.setText("");
            ExpenseType_Value.setSelectedIndex(0);
            ExpenseDate_Value.setDate(null);
            Amt_Value.setText("");
            ExpenseImage.setIcon(null);

            JOptionPane.showMessageDialog(null, "Expense #" + this.expenseID + " Edited Successfully.");

            setVisible(false);
            ManageExpense backManageExpense = new ManageExpense();
            backManageExpense.setVisible(true);
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void ResetResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetResetActionPerformed
        // TODO add your handling code here:
        ExpenseName_Value.setText("");
        ExpenseType_Value.setSelectedIndex(0);
        ExpenseDate_Value.setDate(null);
        Amt_Value.setText("");
        ExpenseImage.setIcon(null);
    }//GEN-LAST:event_ResetResetActionPerformed

    private void UploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadImageActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png"));

        int result = fileChooser.showOpenDialog(null);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            this.selectedImagePath = selectedFile.getAbsolutePath();

            ImageIcon imageIcon = new ImageIcon(new ImageIcon(this.selectedImagePath).getImage().getScaledInstance(ExpenseImage.getWidth(), ExpenseImage.getHeight(), Image.SCALE_SMOOTH));
            ExpenseImage.setIcon(imageIcon);
        } 
        else {
            // User canceled the file selection
            JOptionPane.showMessageDialog(null, "File selection canceled by the user.");
        }
    }//GEN-LAST:event_UploadImageActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ManageExpense backManageExpense = new ManageExpense();
        backManageExpense.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new EditExpense(1).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amt_Title;
    private javax.swing.JTextField Amt_Value;
    private javax.swing.JButton Back;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel EditExpense_Title;
    private javax.swing.JLabel ExpenseDate_Title;
    private com.toedter.calendar.JDateChooser ExpenseDate_Value;
    private javax.swing.JLabel ExpenseImage;
    private javax.swing.JPanel ExpenseImage_BasicInfo;
    private javax.swing.JPanel ExpenseImage_Field;
    private javax.swing.JLabel ExpenseName_Title;
    private javax.swing.JTextField ExpenseName_Value;
    private javax.swing.JLabel ExpenseType_Title;
    private javax.swing.JComboBox<String> ExpenseType_Value;
    private javax.swing.JPanel Expense_BasicInfo;
    private javax.swing.JButton Reset;
    private javax.swing.JButton Update;
    private javax.swing.JButton UploadImage;
    // End of variables declaration//GEN-END:variables
    // User defined attribute(s)
    private String selectedImagePath;
    private int expenseID;
}
