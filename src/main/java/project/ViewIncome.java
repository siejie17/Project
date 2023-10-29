package project;

import java.text.DecimalFormat;

public class ViewIncome extends javax.swing.JFrame {
    
    public ViewIncome(int incomeIndex) {
        this.incomeIndex = incomeIndex;
        initComponents();
        setAttributes();
    }
    
    private void setAttributes() {
        String incomeTitle = "Income #" + incomeIndex;
        ViewIncome_Title.setText(incomeTitle);
        
        Income income = new Income();
        income.viewTransaction(incomeIndex);
        
        IncomeID_Value.setText(" " + incomeIndex);
        IncomeName_Value.setText(" " + income.getName());
        IncomeType_Value.setText(" " + income.getIncomeType());
        IncomeDate_Value.setText(" " + income.getDate());
        
        DecimalFormat fmt = new DecimalFormat ("#0.00");
        Amt_Value.setText(" RM " + fmt.format(income.getAmount()));
        PaymentMethod_Value.setText(" " + income.getPaymentMethod());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        ViewIncome_Title = new javax.swing.JLabel();
        Income_BasicInfo = new javax.swing.JPanel();
        IncomeID_Title = new javax.swing.JLabel();
        IncomeName_Title = new javax.swing.JLabel();
        IncomeType_Title = new javax.swing.JLabel();
        IncomeDate_Title = new javax.swing.JLabel();
        Amt_Title = new javax.swing.JLabel();
        PaymentMethod_Title = new javax.swing.JLabel();
        IncomeID_Value = new javax.swing.JLabel();
        IncomeType_Value = new javax.swing.JLabel();
        IncomeName_Value = new javax.swing.JLabel();
        IncomeDate_Value = new javax.swing.JLabel();
        Amt_Value = new javax.swing.JLabel();
        PaymentMethod_Value = new javax.swing.JLabel();
        Back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNI Budget Planner - View Income");

        Background.setBackground(new java.awt.Color(255, 255, 0));

        ViewIncome_Title.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        ViewIncome_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Income_BasicInfo.setBackground(new java.awt.Color(255, 204, 102));
        Income_BasicInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Income_BasicInfo.setPreferredSize(new java.awt.Dimension(388, 456));

        IncomeID_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IncomeID_Title.setText("Income ID");

        IncomeName_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IncomeName_Title.setText("Income Name");

        IncomeType_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IncomeType_Title.setText("Income Type");

        IncomeDate_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        IncomeDate_Title.setText("Income Date");

        Amt_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Amt_Title.setText("Amount (RM)");

        PaymentMethod_Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PaymentMethod_Title.setText("Payment Method");

        IncomeID_Value.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IncomeID_Value.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        IncomeType_Value.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IncomeType_Value.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        IncomeName_Value.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IncomeName_Value.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        IncomeDate_Value.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IncomeDate_Value.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Amt_Value.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Amt_Value.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        PaymentMethod_Value.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        PaymentMethod_Value.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout Income_BasicInfoLayout = new javax.swing.GroupLayout(Income_BasicInfo);
        Income_BasicInfo.setLayout(Income_BasicInfoLayout);
        Income_BasicInfoLayout.setHorizontalGroup(
            Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Income_BasicInfoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Amt_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IncomeDate_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IncomeType_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IncomeName_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IncomeID_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaymentMethod_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Amt_Value, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                    .addComponent(IncomeDate_Value, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IncomeType_Value, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IncomeName_Value, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IncomeID_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaymentMethod_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Income_BasicInfoLayout.setVerticalGroup(
            Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Income_BasicInfoLayout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IncomeID_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IncomeID_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IncomeName_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IncomeName_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IncomeType_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IncomeType_Value, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IncomeDate_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(IncomeDate_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Amt_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Amt_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(Income_BasicInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PaymentMethod_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(PaymentMethod_Value, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62))
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
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Income_BasicInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(11, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ViewIncome_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(ViewIncome_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(Income_BasicInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
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

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        ManageIncome backManageIncome = new ManageIncome();
        backManageIncome.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ViewIncome(1).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Amt_Title;
    private javax.swing.JLabel Amt_Value;
    private javax.swing.JButton Back;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel IncomeDate_Title;
    private javax.swing.JLabel IncomeDate_Value;
    private javax.swing.JLabel IncomeID_Title;
    private javax.swing.JLabel IncomeID_Value;
    private javax.swing.JLabel IncomeName_Title;
    private javax.swing.JLabel IncomeName_Value;
    private javax.swing.JLabel IncomeType_Title;
    private javax.swing.JLabel IncomeType_Value;
    private javax.swing.JPanel Income_BasicInfo;
    private javax.swing.JLabel PaymentMethod_Title;
    private javax.swing.JLabel PaymentMethod_Value;
    private javax.swing.JLabel ViewIncome_Title;
    // End of variables declaration//GEN-END:variables
    // User defined attribute(s)
    private int incomeIndex;
}
