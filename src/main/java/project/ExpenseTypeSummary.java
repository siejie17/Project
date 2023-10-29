package project;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DecimalFormat;

public class ExpenseTypeSummary extends javax.swing.JFrame {

    public ExpenseTypeSummary() {
        initComponents();
        setExpenseTypeAmount();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Food = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Dimension arcs = new Dimension(30,30); //Border corners arcs {width,height}, change this to whatever you want
                int width = getWidth();
                int height = getHeight();
                Graphics2D graphics = (Graphics2D) g;
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                //Draws the rounded panel with borders.
                graphics.setColor(getBackground());
                graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);//paint background
            }
        };
        jLabel_Food_Title = new javax.swing.JLabel();
        jLabel_Food_Amt = new javax.swing.JLabel();
        jLabel_Food_img = new javax.swing.JLabel();
        jProgressBar_Food = new javax.swing.JProgressBar();
        jPanel_Healthcare = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Dimension arcs = new Dimension(30,30); //Border corners arcs {width,height}, change this to whatever you want
                int width = getWidth();
                int height = getHeight();
                Graphics2D graphics = (Graphics2D) g;
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                //Draws the rounded panel with borders.
                graphics.setColor(getBackground());
                graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);//paint background
            }
        };
        jLabel_Healthcare_Title = new javax.swing.JLabel();
        jLabel_Healthcare_img = new javax.swing.JLabel();
        jLabel_Healthcare_Amt = new javax.swing.JLabel();
        jProgressBar_Healthcare = new javax.swing.JProgressBar();
        jPanel_Others = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Dimension arcs = new Dimension(30,30); //Border corners arcs {width,height}, change this to whatever you want
                int width = getWidth();
                int height = getHeight();
                Graphics2D graphics = (Graphics2D) g;
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                //Draws the rounded panel with borders.
                graphics.setColor(getBackground());
                graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);//paint background
            }
        };
        jLabel_Others_Title = new javax.swing.JLabel();
        jLabel_Others_img = new javax.swing.JLabel();
        jLabel_Others_Amt = new javax.swing.JLabel();
        jProgressBar_Others = new javax.swing.JProgressBar();
        jPanel_Groceries = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Dimension arcs = new Dimension(30,30); //Border corners arcs {width,height}, change this to whatever you want
                int width = getWidth();
                int height = getHeight();
                Graphics2D graphics = (Graphics2D) g;
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                //Draws the rounded panel with borders.
                graphics.setColor(getBackground());
                graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);//paint background
            }
        };
        jLabel_Groceries_Title = new javax.swing.JLabel();
        jLabel_Groceries_img = new javax.swing.JLabel();
        jLabel_Groceries_Amt = new javax.swing.JLabel();
        jProgressBar_Groceries = new javax.swing.JProgressBar();
        jPanel_Fees = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Dimension arcs = new Dimension(30,30); //Border corners arcs {width,height}, change this to whatever you want
                int width = getWidth();
                int height = getHeight();
                Graphics2D graphics = (Graphics2D) g;
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                //Draws the rounded panel with borders.
                graphics.setColor(getBackground());
                graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);//paint background
            }
        };
        jLabel_Fees_Title = new javax.swing.JLabel();
        jLabel_Fees_Amt = new javax.swing.JLabel();
        jLabel_Fees_img = new javax.swing.JLabel();
        jProgressBar_Fees = new javax.swing.JProgressBar();
        jPanel_Rent = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Dimension arcs = new Dimension(30,30); //Border corners arcs {width,height}, change this to whatever you want
                int width = getWidth();
                int height = getHeight();
                Graphics2D graphics = (Graphics2D) g;
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                //Draws the rounded panel with borders.
                graphics.setColor(getBackground());
                graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);//paint background
            }
        };
        jLabel_Rent_img = new javax.swing.JLabel();
        jLabel_Rent_Title = new javax.swing.JLabel();
        jLabel_Rent_Amt = new javax.swing.JLabel();
        jProgressBar_Rent = new javax.swing.JProgressBar();
        jPanel_Transport = new javax.swing.JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Dimension arcs = new Dimension(30,30); //Border corners arcs {width,height}, change this to whatever you want
                int width = getWidth();
                int height = getHeight();
                Graphics2D graphics = (Graphics2D) g;
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                //Draws the rounded panel with borders.
                graphics.setColor(getBackground());
                graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);//paint background
            }
        };
        jLabel_Transport_Title = new javax.swing.JLabel();
        jLabel_Transport_Amt = new javax.swing.JLabel();
        jLabel_Transport_img = new javax.swing.JLabel();
        jProgressBar_Transport = new javax.swing.JProgressBar();
        jPanel_College = new javax.swing.JPanel()  {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Dimension arcs = new Dimension(30,30); //Border corners arcs {width,height}, change this to whatever you want
                int width = getWidth();
                int height = getHeight();
                Graphics2D graphics = (Graphics2D) g;
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

                //Draws the rounded panel with borders.
                graphics.setColor(getBackground());
                graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height);//paint background
            }
        };
        jLabel_College_Title = new javax.swing.JLabel();
        jLabel_College_img = new javax.swing.JLabel();
        jLabel_College_Amt = new javax.swing.JLabel();
        jProgressBar_College = new javax.swing.JProgressBar();
        jLabel_TotalExpenseAmt_Title = new javax.swing.JLabel();
        jLabel_TotalExpenseAmt_Amt = new javax.swing.JLabel();
        jButton_Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNI Budget Planner - Expense Type Summary");
        setBackground(new java.awt.Color(255, 255, 51));
        setResizable(false);

        jPanel_Food.setBackground(new java.awt.Color(255, 255, 181));
        jPanel_Food.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_Food.setOpaque(false);
        jPanel_Food.setPreferredSize(new java.awt.Dimension(130, 160));

        jLabel_Food_Title.setFont(new java.awt.Font("Ink Free", 1, 15)); // NOI18N
        jLabel_Food_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Food_Title.setText("Food");
        jLabel_Food_Title.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel_Food_Title.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel_Food_Amt.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel_Food_Amt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Food_Amt.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel_Food_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Food_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/food.png"))); // NOI18N

        jProgressBar_Food.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar_Food.setForeground(new java.awt.Color(153, 0, 0));
        jProgressBar_Food.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel_FoodLayout = new javax.swing.GroupLayout(jPanel_Food);
        jPanel_Food.setLayout(jPanel_FoodLayout);
        jPanel_FoodLayout.setHorizontalGroup(
            jPanel_FoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FoodLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel_FoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar_Food, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_Food_img, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jLabel_Food_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Food_Amt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel_FoodLayout.setVerticalGroup(
            jPanel_FoodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FoodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Food_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Food_img, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Food_Amt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar_Food, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Healthcare.setBackground(new java.awt.Color(230, 230, 250));
        jPanel_Healthcare.setOpaque(false);

        jLabel_Healthcare_Title.setFont(new java.awt.Font("Ink Free", 1, 15)); // NOI18N
        jLabel_Healthcare_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Healthcare_Title.setText("Healthcare");

        jLabel_Healthcare_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Healthcare_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/healthcare.png"))); // NOI18N

        jLabel_Healthcare_Amt.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel_Healthcare_Amt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jProgressBar_Healthcare.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar_Healthcare.setForeground(new java.awt.Color(153, 0, 0));
        jProgressBar_Healthcare.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel_HealthcareLayout = new javax.swing.GroupLayout(jPanel_Healthcare);
        jPanel_Healthcare.setLayout(jPanel_HealthcareLayout);
        jPanel_HealthcareLayout.setHorizontalGroup(
            jPanel_HealthcareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HealthcareLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel_HealthcareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Healthcare_Amt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Healthcare_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jLabel_Healthcare_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar_Healthcare, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_HealthcareLayout.setVerticalGroup(
            jPanel_HealthcareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HealthcareLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Healthcare_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Healthcare_img, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Healthcare_Amt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar_Healthcare, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Others.setBackground(new java.awt.Color(255, 240, 245));
        jPanel_Others.setOpaque(false);
        jPanel_Others.setPreferredSize(new java.awt.Dimension(130, 130));

        jLabel_Others_Title.setFont(new java.awt.Font("Ink Free", 1, 15)); // NOI18N
        jLabel_Others_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Others_Title.setText("Others");

        jLabel_Others_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Others_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/others.png"))); // NOI18N

        jLabel_Others_Amt.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel_Others_Amt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jProgressBar_Others.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar_Others.setForeground(new java.awt.Color(153, 0, 0));
        jProgressBar_Others.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel_OthersLayout = new javax.swing.GroupLayout(jPanel_Others);
        jPanel_Others.setLayout(jPanel_OthersLayout);
        jPanel_OthersLayout.setHorizontalGroup(
            jPanel_OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_OthersLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel_OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Others_img, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jLabel_Others_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar_Others, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_Others_Amt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel_OthersLayout.setVerticalGroup(
            jPanel_OthersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_OthersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Others_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Others_img, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Others_Amt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar_Others, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel_Groceries.setBackground(new java.awt.Color(237, 139, 255));
        jPanel_Groceries.setOpaque(false);
        jPanel_Groceries.setPreferredSize(new java.awt.Dimension(130, 130));

        jLabel_Groceries_Title.setFont(new java.awt.Font("Ink Free", 1, 15)); // NOI18N
        jLabel_Groceries_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Groceries_Title.setText("Groceries");

        jLabel_Groceries_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Groceries_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/groceries.png"))); // NOI18N

        jLabel_Groceries_Amt.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel_Groceries_Amt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jProgressBar_Groceries.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar_Groceries.setForeground(new java.awt.Color(153, 0, 0));
        jProgressBar_Groceries.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel_GroceriesLayout = new javax.swing.GroupLayout(jPanel_Groceries);
        jPanel_Groceries.setLayout(jPanel_GroceriesLayout);
        jPanel_GroceriesLayout.setHorizontalGroup(
            jPanel_GroceriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GroceriesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel_GroceriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel_Groceries_Amt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Groceries_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jProgressBar_Groceries, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_Groceries_img, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_GroceriesLayout.setVerticalGroup(
            jPanel_GroceriesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GroceriesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Groceries_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Groceries_img, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Groceries_Amt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar_Groceries, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Fees.setBackground(new java.awt.Color(255, 153, 153));
        jPanel_Fees.setOpaque(false);
        jPanel_Fees.setPreferredSize(new java.awt.Dimension(130, 130));

        jLabel_Fees_Title.setFont(new java.awt.Font("Ink Free", 1, 15)); // NOI18N
        jLabel_Fees_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Fees_Title.setText("Fees");

        jLabel_Fees_Amt.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel_Fees_Amt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_Fees_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Fees_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fee.png"))); // NOI18N

        jProgressBar_Fees.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar_Fees.setForeground(new java.awt.Color(153, 0, 0));
        jProgressBar_Fees.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel_FeesLayout = new javax.swing.GroupLayout(jPanel_Fees);
        jPanel_Fees.setLayout(jPanel_FeesLayout);
        jPanel_FeesLayout.setHorizontalGroup(
            jPanel_FeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FeesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel_Fees_Amt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel_FeesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel_FeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar_Fees, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel_FeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel_Fees_img, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(jLabel_Fees_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_FeesLayout.setVerticalGroup(
            jPanel_FeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_FeesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Fees_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Fees_img)
                .addGap(12, 12, 12)
                .addComponent(jLabel_Fees_Amt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar_Fees, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Rent.setBackground(new java.awt.Color(147, 238, 255));
        jPanel_Rent.setOpaque(false);
        jPanel_Rent.setPreferredSize(new java.awt.Dimension(130, 130));

        jLabel_Rent_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Rent_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rent.png"))); // NOI18N

        jLabel_Rent_Title.setFont(new java.awt.Font("Ink Free", 1, 15)); // NOI18N
        jLabel_Rent_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Rent_Title.setText("Rent");

        jLabel_Rent_Amt.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel_Rent_Amt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jProgressBar_Rent.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar_Rent.setForeground(new java.awt.Color(153, 0, 0));
        jProgressBar_Rent.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel_RentLayout = new javax.swing.GroupLayout(jPanel_Rent);
        jPanel_Rent.setLayout(jPanel_RentLayout);
        jPanel_RentLayout.setHorizontalGroup(
            jPanel_RentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_RentLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel_RentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel_Rent_Amt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Rent_img, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jLabel_Rent_Title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jProgressBar_Rent, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel_RentLayout.setVerticalGroup(
            jPanel_RentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_RentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Rent_Title)
                .addGap(12, 12, 12)
                .addComponent(jLabel_Rent_img, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Rent_Amt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar_Rent, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_Transport.setBackground(new java.awt.Color(255, 230, 164));
        jPanel_Transport.setOpaque(false);
        jPanel_Transport.setPreferredSize(new java.awt.Dimension(130, 130));

        jLabel_Transport_Title.setFont(new java.awt.Font("Ink Free", 1, 15)); // NOI18N
        jLabel_Transport_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Transport_Title.setText("Transport");

        jLabel_Transport_Amt.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel_Transport_Amt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel_Transport_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Transport_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/transport.png"))); // NOI18N

        jProgressBar_Transport.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar_Transport.setForeground(new java.awt.Color(153, 0, 0));
        jProgressBar_Transport.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel_TransportLayout = new javax.swing.GroupLayout(jPanel_Transport);
        jPanel_Transport.setLayout(jPanel_TransportLayout);
        jPanel_TransportLayout.setHorizontalGroup(
            jPanel_TransportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TransportLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel_TransportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Transport_Amt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_Transport_img, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jLabel_Transport_Title, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(jProgressBar_Transport, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel_TransportLayout.setVerticalGroup(
            jPanel_TransportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_TransportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Transport_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Transport_img, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_Transport_Amt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar_Transport, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel_College.setBackground(new java.awt.Color(204, 255, 204));
        jPanel_College.setOpaque(false);
        jPanel_College.setPreferredSize(new java.awt.Dimension(130, 161));

        jLabel_College_Title.setFont(new java.awt.Font("Ink Free", 1, 15)); // NOI18N
        jLabel_College_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_College_Title.setText("College");

        jLabel_College_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_College_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/college.png"))); // NOI18N

        jLabel_College_Amt.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        jLabel_College_Amt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jProgressBar_College.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar_College.setForeground(new java.awt.Color(153, 0, 0));
        jProgressBar_College.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel_CollegeLayout = new javax.swing.GroupLayout(jPanel_College);
        jPanel_College.setLayout(jPanel_CollegeLayout);
        jPanel_CollegeLayout.setHorizontalGroup(
            jPanel_CollegeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CollegeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel_CollegeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jProgressBar_College, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel_College_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_College_Amt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_College_img, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel_CollegeLayout.setVerticalGroup(
            jPanel_CollegeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CollegeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_College_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_College_img, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_College_Amt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBar_College, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel_TotalExpenseAmt_Title.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_TotalExpenseAmt_Title.setFont(new java.awt.Font("Imprint MT Shadow", 0, 13)); // NOI18N
        jLabel_TotalExpenseAmt_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TotalExpenseAmt_Title.setText("Total Expense Amount:");

        jLabel_TotalExpenseAmt_Amt.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_TotalExpenseAmt_Amt.setFont(new java.awt.Font("Stencil", 0, 14)); // NOI18N
        jLabel_TotalExpenseAmt_Amt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton_Back.setBackground(new java.awt.Color(204, 51, 0));
        jButton_Back.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton_Back.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Back.setText("Back");
        jButton_Back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton_Back.setFocusPainted(false);
        jButton_Back.setFocusable(false);
        jButton_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Expense Type Summary");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("-------------------------------------------------------------------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_TotalExpenseAmt_Amt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_TotalExpenseAmt_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel_Food, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addGap(19, 19, 19)
                                .addComponent(jPanel_Rent, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(jPanel_Transport, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanel_Healthcare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel_Others, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jPanel_Groceries, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addGap(19, 19, 19)
                                        .addComponent(jPanel_Fees, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel_College, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel_TotalExpenseAmt_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_TotalExpenseAmt_Amt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_Transport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jPanel_Rent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jPanel_Food, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel_Fees, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addComponent(jPanel_Groceries, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                    .addComponent(jPanel_College, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_Healthcare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel_Others, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addComponent(jButton_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel_Food.setBounds(10,10,100,30);
        jPanel_Healthcare.setBounds(10, 10, 100, 30);
        jPanel_Others.setBounds(10, 10, 100, 30);
        jPanel_Groceries.setBounds(10, 10, 100, 30);
        jPanel_Fees.setBounds(10, 10, 100, 30);
        jPanel_Rent.setBounds(10,10,100,30);
        jPanel_Transport.setBounds(10,10,100,30);
        jPanel_College.setBounds(10,10,100,30);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BackActionPerformed
        this.setVisible(false);
        BudgetPlanner backBudgetPlanner = new BudgetPlanner();
        backBudgetPlanner.setVisible(true);
    }//GEN-LAST:event_jButton_BackActionPerformed

    private void setExpenseTypeAmount() {
        Expense expenseType = new Expense();
        
        double Food_Amt = expenseType.generateExpenseSummaryByType(1);
        double Rent_Amt = expenseType.generateExpenseSummaryByType(2);
        double Transport_Amt = expenseType.generateExpenseSummaryByType(3);
        double Groceries_Amt = expenseType.generateExpenseSummaryByType(4);
        double Fees_Amt = expenseType.generateExpenseSummaryByType(5);
        double College_Amt = expenseType.generateExpenseSummaryByType(6);
        double Healthcare_Amt = expenseType.generateExpenseSummaryByType(7);
        double Others_Amt = expenseType.generateExpenseSummaryByType(8);
        
        expenseType.closeConnection();

        BalanceofFunds bf_expenseAmt = new BalanceofFunds();
        DecimalFormat fmt = new DecimalFormat ("#0.00");
        double totalExpenseAmt = bf_expenseAmt.getTotalExpenseAmount();
        
        jProgressBar_Food.setMinimum(0);
        jProgressBar_Food.setMaximum((int)totalExpenseAmt);
        jProgressBar_Food.setValue((int)Food_Amt);
        
        jProgressBar_Rent.setMinimum(0);
        jProgressBar_Rent.setMaximum((int)totalExpenseAmt);
        jProgressBar_Rent.setValue((int)Rent_Amt);
        
        jProgressBar_Transport.setMinimum(0);
        jProgressBar_Transport.setMaximum((int)totalExpenseAmt);
        jProgressBar_Transport.setValue((int)Transport_Amt);
        
        jProgressBar_Groceries.setMinimum(0);
        jProgressBar_Groceries.setMaximum((int)totalExpenseAmt);
        jProgressBar_Groceries.setValue((int)Groceries_Amt);
        
        jProgressBar_College.setMinimum(0);
        jProgressBar_College.setMaximum((int)totalExpenseAmt);
        jProgressBar_College.setValue((int)College_Amt);
        
        jProgressBar_Fees.setMinimum(0);
        jProgressBar_Fees.setMaximum((int)totalExpenseAmt);
        jProgressBar_Fees.setValue((int)Fees_Amt);
        
        jProgressBar_Healthcare.setMinimum(0);
        jProgressBar_Healthcare.setMaximum((int)totalExpenseAmt);
        jProgressBar_Healthcare.setValue((int)Healthcare_Amt);
        
        jProgressBar_Others.setMinimum(0);
        jProgressBar_Others.setMaximum((int)totalExpenseAmt);
        jProgressBar_Others.setValue((int)Others_Amt);
        
        jLabel_Food_Amt.setText("RM" + fmt.format(Food_Amt));
        jLabel_Rent_Amt.setText("RM" + fmt.format(Rent_Amt));
        jLabel_Transport_Amt.setText("RM" + fmt.format(Transport_Amt));
        jLabel_Groceries_Amt.setText("RM" + fmt.format(Groceries_Amt));
        jLabel_Fees_Amt.setText("RM" + fmt.format(Fees_Amt));
        jLabel_College_Amt.setText("RM" + fmt.format(College_Amt));
        jLabel_Healthcare_Amt.setText("RM" + fmt.format(Healthcare_Amt));
        jLabel_Others_Amt.setText("RM" + fmt.format(Others_Amt));
        jLabel_TotalExpenseAmt_Amt.setText("RM" + fmt.format(totalExpenseAmt));
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ExpenseTypeSummary().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_College_Amt;
    private javax.swing.JLabel jLabel_College_Title;
    private javax.swing.JLabel jLabel_College_img;
    private javax.swing.JLabel jLabel_Fees_Amt;
    private javax.swing.JLabel jLabel_Fees_Title;
    private javax.swing.JLabel jLabel_Fees_img;
    private javax.swing.JLabel jLabel_Food_Amt;
    private javax.swing.JLabel jLabel_Food_Title;
    private javax.swing.JLabel jLabel_Food_img;
    private javax.swing.JLabel jLabel_Groceries_Amt;
    private javax.swing.JLabel jLabel_Groceries_Title;
    private javax.swing.JLabel jLabel_Groceries_img;
    private javax.swing.JLabel jLabel_Healthcare_Amt;
    private javax.swing.JLabel jLabel_Healthcare_Title;
    private javax.swing.JLabel jLabel_Healthcare_img;
    private javax.swing.JLabel jLabel_Others_Amt;
    private javax.swing.JLabel jLabel_Others_Title;
    private javax.swing.JLabel jLabel_Others_img;
    private javax.swing.JLabel jLabel_Rent_Amt;
    private javax.swing.JLabel jLabel_Rent_Title;
    private javax.swing.JLabel jLabel_Rent_img;
    private javax.swing.JLabel jLabel_TotalExpenseAmt_Amt;
    private javax.swing.JLabel jLabel_TotalExpenseAmt_Title;
    private javax.swing.JLabel jLabel_Transport_Amt;
    private javax.swing.JLabel jLabel_Transport_Title;
    private javax.swing.JLabel jLabel_Transport_img;
    private javax.swing.JPanel jPanel_College;
    private javax.swing.JPanel jPanel_Fees;
    private javax.swing.JPanel jPanel_Food;
    private javax.swing.JPanel jPanel_Groceries;
    private javax.swing.JPanel jPanel_Healthcare;
    private javax.swing.JPanel jPanel_Others;
    private javax.swing.JPanel jPanel_Rent;
    private javax.swing.JPanel jPanel_Transport;
    private javax.swing.JProgressBar jProgressBar_College;
    private javax.swing.JProgressBar jProgressBar_Fees;
    private javax.swing.JProgressBar jProgressBar_Food;
    private javax.swing.JProgressBar jProgressBar_Groceries;
    private javax.swing.JProgressBar jProgressBar_Healthcare;
    private javax.swing.JProgressBar jProgressBar_Others;
    private javax.swing.JProgressBar jProgressBar_Rent;
    private javax.swing.JProgressBar jProgressBar_Transport;
    // End of variables declaration//GEN-END:variables
}
