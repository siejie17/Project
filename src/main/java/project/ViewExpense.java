package project;

import java.awt.Image;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;

public class ViewExpense extends javax.swing.JFrame {

    public ViewExpense(int expenseIndex) {
        this.expenseIndex = expenseIndex;
        initComponents();
        setAttributes();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        ViewExpense_Title = new javax.swing.JLabel();
        Expense_BasicInfo = new javax.swing.JPanel();
        ExpenseName_Title = new javax.swing.JLabel();
        ExpenseID_Title = new javax.swing.JLabel();
        ExpenseDate_Title = new javax.swing.JLabel();
        Amt_Title = new javax.swing.JLabel();
        ExpenseType_Title = new javax.swing.JLabel();
        ExpenseID_Value = new javax.swing.JLabel();
        ExpenseType_Value = new javax.swing.JLabel();
        ExpenseName_Value = new javax.swing.JLabel();
        ExpenseDate_Value = new javax.swing.JLabel();
        Amt_Value = new javax.swing.JLabel();
        Expense_ImageInfo = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        ExpenseImage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNI Budget Planner - View Expense");

        Background.setBackground(new java.awt.Color(255, 255, 0));
        Background.setPreferredSize(new java.awt.Dimension(374, 546));

        ViewExpense_Title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ViewExpense_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Expense_BasicInfo.setBackground(new java.awt.Color(255, 204, 102));
        Expense_BasicInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Expense_BasicInfo.setPreferredSize(new java.awt.Dimension(410, 190));

        ExpenseName_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExpenseName_Title.setText("Expense Name");

        ExpenseID_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExpenseID_Title.setText("Expense ID        ");

        ExpenseDate_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExpenseDate_Title.setText("Expense Date");

        Amt_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Amt_Title.setText("Amount (RM)");

        ExpenseType_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ExpenseType_Title.setText("Expense Type");

        ExpenseID_Value.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ExpenseID_Value.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ExpenseType_Value.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ExpenseType_Value.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ExpenseName_Value.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ExpenseName_Value.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ExpenseDate_Value.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ExpenseDate_Value.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Amt_Value.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Amt_Value.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout Expense_BasicInfoLayout = new javax.swing.GroupLayout(Expense_BasicInfo);
        Expense_BasicInfo.setLayout(Expense_BasicInfoLayout);
        Expense_BasicInfoLayout.setHorizontalGroup(
            Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Expense_BasicInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Expense_BasicInfoLayout.createSequentialGroup()
                        .addGroup(Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ExpenseName_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExpenseDate_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Amt_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExpenseName_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExpenseDate_Value, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(Amt_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Expense_BasicInfoLayout.createSequentialGroup()
                        .addGroup(Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExpenseType_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExpenseID_Title))
                        .addGap(21, 21, 21)
                        .addGroup(Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExpenseType_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExpenseID_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        Expense_BasicInfoLayout.setVerticalGroup(
            Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Expense_BasicInfoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExpenseID_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseID_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExpenseType_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseType_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExpenseName_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseName_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ExpenseDate_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ExpenseDate_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Expense_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Amt_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Amt_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(360, 360, 360))
        );

        Expense_ImageInfo.setBackground(new java.awt.Color(255, 204, 102));
        Expense_ImageInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Expense_ImageInfo.setPreferredSize(new java.awt.Dimension(215, 388));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.darkGray, null, null));

        ExpenseImage.setBackground(new java.awt.Color(255, 255, 255));
        ExpenseImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExpenseImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ExpenseImage, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Modern No. 20", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Expense Image");

        javax.swing.GroupLayout Expense_ImageInfoLayout = new javax.swing.GroupLayout(Expense_ImageInfo);
        Expense_ImageInfo.setLayout(Expense_ImageInfoLayout);
        Expense_ImageInfoLayout.setHorizontalGroup(
            Expense_ImageInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Expense_ImageInfoLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(Expense_ImageInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        Expense_ImageInfoLayout.setVerticalGroup(
            Expense_ImageInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Expense_ImageInfoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Back.setBackground(new java.awt.Color(204, 51, 0));
        Back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("BACK");
        Back.setFocusPainted(false);
        Back.setFocusable(false);
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewExpense_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Expense_BasicInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(Expense_ImageInfo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ViewExpense_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Expense_BasicInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Expense_ImageInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Back)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void setAttributes() {
        Expense obj = new Expense();
        obj.viewTransaction(expenseIndex);
        
        DecimalFormat fmt = new DecimalFormat ("#0.00");
        
        ViewExpense_Title.setText("  Expense #" + expenseIndex);
        ExpenseID_Value.setText(" " + expenseIndex);
        ExpenseType_Value.setText(" " + obj.getExpenseType());
        ExpenseName_Value.setText(" " + obj.getName());
        ExpenseDate_Value.setText(" " + obj.getDate().toString());   
        Amt_Value.setText(" RM " + fmt.format(obj.getAmount())); 
        
        byte[] image = obj.getImage();
        ImageIcon imageicon = new ImageIcon(image);
        Image resizedImage = imageicon.getImage().getScaledInstance(ExpenseImage.getWidth(), ExpenseImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
        ExpenseImage.setIcon(resizedImageIcon);
    }
    
    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ManageExpense backManageExpense = new ManageExpense();
        backManageExpense.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ViewExpense(1).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amt_Title;
    private javax.swing.JLabel Amt_Value;
    private javax.swing.JButton Back;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel ExpenseDate_Title;
    private javax.swing.JLabel ExpenseDate_Value;
    private javax.swing.JLabel ExpenseID_Title;
    private javax.swing.JLabel ExpenseID_Value;
    private javax.swing.JLabel ExpenseImage;
    private javax.swing.JLabel ExpenseName_Title;
    private javax.swing.JLabel ExpenseName_Value;
    private javax.swing.JLabel ExpenseType_Title;
    private javax.swing.JLabel ExpenseType_Value;
    private javax.swing.JPanel Expense_BasicInfo;
    private javax.swing.JPanel Expense_ImageInfo;
    private javax.swing.JLabel ViewExpense_Title;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
    // User defined attribute(s)
    private int expenseIndex;
}
