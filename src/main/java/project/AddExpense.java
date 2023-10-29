package project;

import java.awt.Image;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class AddExpense extends javax.swing.JFrame {

    public AddExpense() {
        initComponents();
        displayTypeofExpense();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Expense_ImageInfo = new javax.swing.JPanel();
        UploadImage = new javax.swing.JButton();
        ExpenseImageField = new javax.swing.JPanel();
        ExpenseImage = new javax.swing.JLabel();
        ExpenseBasicInfo = new javax.swing.JPanel();
        ExpenseName_Title = new javax.swing.JLabel();
        ExpenseName_Value = new javax.swing.JTextField();
        ExpenseType_Title = new javax.swing.JLabel();
        ExpenseType_Value = new javax.swing.JComboBox<>();
        ExpenseDate_Title = new javax.swing.JLabel();
        ExpenseDate_Value = new com.toedter.calendar.JDateChooser();
        Amt_Title = new javax.swing.JLabel();
        Amt_Value = new javax.swing.JTextField();
        AddExpense_Title = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNI Budget Planner - Add Expense");

        Background.setBackground(new java.awt.Color(255, 255, 0));
        Background.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Expense_ImageInfo.setBackground(new java.awt.Color(255, 204, 102));
        Expense_ImageInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        UploadImage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        UploadImage.setText("Upload Image");
        UploadImage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        UploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadImageActionPerformed(evt);
            }
        });

        ExpenseImageField.setBackground(new java.awt.Color(255, 255, 255));
        ExpenseImageField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ExpenseImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout ExpenseImageFieldLayout = new javax.swing.GroupLayout(ExpenseImageField);
        ExpenseImageField.setLayout(ExpenseImageFieldLayout);
        ExpenseImageFieldLayout.setHorizontalGroup(
            ExpenseImageFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExpenseImage, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
        );
        ExpenseImageFieldLayout.setVerticalGroup(
            ExpenseImageFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExpenseImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Expense_ImageInfoLayout = new javax.swing.GroupLayout(Expense_ImageInfo);
        Expense_ImageInfo.setLayout(Expense_ImageInfoLayout);
        Expense_ImageInfoLayout.setHorizontalGroup(
            Expense_ImageInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Expense_ImageInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Expense_ImageInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Expense_ImageInfoLayout.createSequentialGroup()
                        .addComponent(UploadImage, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Expense_ImageInfoLayout.createSequentialGroup()
                        .addComponent(ExpenseImageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))))
        );
        Expense_ImageInfoLayout.setVerticalGroup(
            Expense_ImageInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Expense_ImageInfoLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(ExpenseImageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UploadImage, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        ExpenseBasicInfo.setBackground(new java.awt.Color(255, 204, 102));
        ExpenseBasicInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

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

        javax.swing.GroupLayout ExpenseBasicInfoLayout = new javax.swing.GroupLayout(ExpenseBasicInfo);
        ExpenseBasicInfo.setLayout(ExpenseBasicInfoLayout);
        ExpenseBasicInfoLayout.setHorizontalGroup(
            ExpenseBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpenseBasicInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ExpenseBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExpenseDate_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseType_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseName_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(Amt_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ExpenseBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Amt_Value, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ExpenseName_Value, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ExpenseType_Value, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseDate_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ExpenseBasicInfoLayout.setVerticalGroup(
            ExpenseBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExpenseBasicInfoLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(ExpenseBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExpenseName_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseName_Value))
                .addGap(7, 7, 7)
                .addGroup(ExpenseBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ExpenseBasicInfoLayout.createSequentialGroup()
                        .addComponent(ExpenseType_Value, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addComponent(ExpenseType_Title))
                .addGap(7, 7, 7)
                .addGroup(ExpenseBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExpenseDate_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseDate_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(7, 7, 7)
                .addGroup(ExpenseBasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Amt_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Amt_Value))
                .addGap(18, 18, 18))
        );

        AddExpense_Title.setBackground(new java.awt.Color(0, 0, 0));
        AddExpense_Title.setFont(new java.awt.Font("Imprint MT Shadow", 1, 36)); // NOI18N
        AddExpense_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddExpense_Title.setText("Add Expense");
        AddExpense_Title.setToolTipText("");

        Back.setBackground(new java.awt.Color(204, 51, 0));
        Back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("BACK");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        Add.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Add.setText("Add");
        Add.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Reset.setText("Reset");
        Reset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Expense_ImageInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseBasicInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(AddExpense_Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddExpense_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ExpenseBasicInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Expense_ImageInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            e.printStackTrace();
        }          
    }
    
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        Pattern amount_pattern = Pattern.compile("^[1-9][0-9]{0,10}[.][0-9]{0,2}$");
        Matcher matcher_1 = amount_pattern.matcher(Amt_Value.getText());

        boolean b1 = matcher_1.find();
        Icon icon = ExpenseImage.getIcon();

        if ((ExpenseName_Value.getText()).equals("")){
            JOptionPane.showMessageDialog(null, "Invalid Name");
        } 
        else if (ExpenseDate_Value.getDate() == null){
            JOptionPane.showMessageDialog(null, "Invalid date");
        } 
        else if ("".equals(ExpenseType_Value.getSelectedItem().toString())){
            JOptionPane.showMessageDialog(null, "Empty Expense Type");
        } 
        else if (b1 == false){
            JOptionPane.showMessageDialog(null, "Invalid Amount (example : 45.93)");
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
            expense.addTransaction();

            ExpenseName_Value.setText("");
            ExpenseType_Value.setSelectedIndex(0);
            ExpenseDate_Value.setDate(null);
            Amt_Value.setText("");
            ExpenseImage.setIcon(null);

            JOptionPane.showMessageDialog(null, "Expense Inserted into Database Successfully.");

            setVisible(false);
            BudgetPlanner backBudgetPlanner = new BudgetPlanner();
            backBudgetPlanner.setVisible(true);
        }
    }//GEN-LAST:event_AddActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
        ExpenseName_Value.setText("");
        ExpenseType_Value.setSelectedIndex(0);
        ExpenseDate_Value.setDate(null);
        Amt_Value.setText("");
        ExpenseImage.setIcon(null);
    }//GEN-LAST:event_ResetActionPerformed

    private void UploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadImageActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png"));

        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            this.selectedImagePath = selectedFile.getAbsolutePath();

            ImageIcon imageIcon = new ImageIcon(new ImageIcon(this.selectedImagePath).getImage().getScaledInstance(ExpenseImage.getWidth(), ExpenseImage.getHeight(), Image.SCALE_SMOOTH));
            ExpenseImage.setIcon(imageIcon);
        } else {
            JOptionPane.showMessageDialog(null, "File selection canceled by the user."); // User canceled the file selection
        }
    }//GEN-LAST:event_UploadImageActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        BudgetPlanner backBudgetPlanner = new BudgetPlanner();
        backBudgetPlanner.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new AddExpense().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel AddExpense_Title;
    private javax.swing.JLabel Amt_Title;
    private javax.swing.JTextField Amt_Value;
    private javax.swing.JButton Back;
    private javax.swing.JPanel Background;
    private javax.swing.JPanel ExpenseBasicInfo;
    private javax.swing.JLabel ExpenseDate_Title;
    private com.toedter.calendar.JDateChooser ExpenseDate_Value;
    private javax.swing.JLabel ExpenseImage;
    private javax.swing.JPanel ExpenseImageField;
    private javax.swing.JLabel ExpenseName_Title;
    private javax.swing.JTextField ExpenseName_Value;
    private javax.swing.JLabel ExpenseType_Title;
    private javax.swing.JComboBox<String> ExpenseType_Value;
    private javax.swing.JPanel Expense_ImageInfo;
    private javax.swing.JButton Reset;
    private javax.swing.JButton UploadImage;
    // End of variables declaration//GEN-END:variables
    // User defined attribute(s)
    private String selectedImagePath;
}