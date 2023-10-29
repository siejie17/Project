package project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.ui.TextAnchor;
import org.jfree.data.category.DefaultCategoryDataset;

public class MonthlyExpenseGraph extends javax.swing.JFrame {

    public MonthlyExpenseGraph() {
        initComponents();
        setYearSelection();
    }
    
    private void setYearSelection() {
        DatabaseManager databasemanager = new DatabaseManager();
        Connection connection = databasemanager.getConnection();
        
        String query = "SELECT DISTINCT YEAR(expense_date) AS year FROM expense ORDER BY year ASC";
        
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                YearSelection.addItem(rs.getInt("year"));
            }
            
            databasemanager.closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Deco = new javax.swing.JLabel();
        BarChart = new javax.swing.JPanel();
        Back = new javax.swing.JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                if (getModel().isArmed()) {
                    g.setColor(Color.GRAY);
                } else {
                    g.setColor(getBackground());
                }
                g.fillRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 50, 50);
                super.paintComponent(g);
            }
        };
        YearSelection_Legend = new javax.swing.JPanel();
        YearSelection = new javax.swing.JComboBox<>();
        MonthlyExpenseGraph_Title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UNI Budget Planner - Monthly Expense Graph");

        Deco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Deco.setText("-------------------------------------------------------------------");

        BarChart.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BarChart.setLayout(new java.awt.BorderLayout());

        Back.setBackground(new java.awt.Color(204, 51, 0));
        Back.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("BACK");
        Back.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        YearSelection_Legend.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Year : ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N

        YearSelection.setFont(new java.awt.Font("Stencil", 0, 15)); // NOI18N
        YearSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearSelectionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout YearSelection_LegendLayout = new javax.swing.GroupLayout(YearSelection_Legend);
        YearSelection_Legend.setLayout(YearSelection_LegendLayout);
        YearSelection_LegendLayout.setHorizontalGroup(
            YearSelection_LegendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, YearSelection_LegendLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(YearSelection, 0, 328, Short.MAX_VALUE)
                .addContainerGap())
        );
        YearSelection_LegendLayout.setVerticalGroup(
            YearSelection_LegendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(YearSelection_LegendLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(YearSelection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        MonthlyExpenseGraph_Title.setFont(new java.awt.Font("Imprint MT Shadow", 0, 30)); // NOI18N
        MonthlyExpenseGraph_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MonthlyExpenseGraph_Title.setText("Monthly Expense Graph");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MonthlyExpenseGraph_Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Deco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 70, Short.MAX_VALUE)
                        .addComponent(YearSelection_Legend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Back, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BarChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(MonthlyExpenseGraph_Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Deco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(YearSelection_Legend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(BarChart, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        BudgetPlanner backBudgetPlanner = new BudgetPlanner();
        backBudgetPlanner.setVisible(true);
    }//GEN-LAST:event_BackActionPerformed

    private void YearSelectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearSelectionActionPerformed
        // TODO add your handling code here:
        dataset = new DefaultCategoryDataset();
        
        int selectedYear = (int)YearSelection.getSelectedItem();
        
        double[] monthlyExpenses = getDataFromDatabase(selectedYear);

        String series = "Monthly Expenses";
        String[] category = {"JAN", "FEB", "MAC", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

        for (int month = 1; month <= 12; month++) {
            double expense = monthlyExpenses[month - 1];
            dataset.addValue(expense, series, category[month - 1]);
        }

        JFreeChart chart = createBarChart(selectedYear);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(402, 401));
        BarChart.removeAll();
        BarChart.add(chartPanel, BorderLayout.CENTER);
        BarChart.validate();
    }//GEN-LAST:event_YearSelectionActionPerformed
    
    private double[] getDataFromDatabase(int year) {
        double[] monthlyExpenses = new double[12];
        
        String query = "SELECT MONTH(expense_date) AS month, SUM(expense_amount) AS total_amount FROM expense WHERE YEAR(expense_date) = ? GROUP BY MONTH(expense_date)";
    
        DatabaseManager databasemanager = new DatabaseManager();
        Connection connection = databasemanager.getConnection();
        
        try (PreparedStatement pstmt = connection.prepareStatement(query)) {
            pstmt.setInt(1, year);
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()){
                int month = rs.getInt("month");
                double amount = rs.getDouble("total_amount");
                monthlyExpenses[month - 1] = amount;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return monthlyExpenses;
    }
    
    private JFreeChart createBarChart(int selectedYear) {
        String chartTitle = "Monthly Expenses " + selectedYear;
        
        JFreeChart chart = ChartFactory.createBarChart(
                chartTitle,     // Chart title
                "Month",                // X-axis label
                "Expense Amount (RM)",       // Y-axis label
                dataset,                // Dataset
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
       
        // Customize the chart
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setBackgroundPaint(new Color(242, 242, 242));
        plot.setRangeGridlinePaint(Color.BLACK);

        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setLowerMargin(0.05);
        domainAxis.setUpperMargin(0.05);
        domainAxis.setCategoryMargin(0.2);

        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());

        BarRenderer renderer = (BarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(false);
        renderer.setItemMargin(0.05);
        renderer.setShadowVisible(false);
        renderer.setSeriesPaint(0, Color.RED);
        
        CategoryItemRenderer Renderer = ((CategoryPlot)chart.getPlot()).getRenderer();

        Renderer.setDefaultItemLabelGenerator(new StandardCategoryItemLabelGenerator("{2}", new DecimalFormat("#0.00")));
        
        Font labelFont = new Font("Arial", Font.BOLD, 12);  // Customize the font properties as desired
        
        Renderer.setDefaultItemLabelFont(labelFont);
        Renderer.setDefaultItemLabelsVisible(true);
        
        ItemLabelPosition position = new ItemLabelPosition(ItemLabelAnchor.OUTSIDE12, TextAnchor.BOTTOM_CENTER, TextAnchor.CENTER, 0.0);
        
        Renderer.setDefaultPositiveItemLabelPosition(position);
        
        return chart;
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MonthlyExpenseGraph().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JPanel BarChart;
    private javax.swing.JLabel Deco;
    private javax.swing.JLabel MonthlyExpenseGraph_Title;
    private javax.swing.JComboBox<Integer> YearSelection;
    private javax.swing.JPanel YearSelection_Legend;
    // End of variables declaration//GEN-END:variables
    // User defined attribute(s)
    private DefaultCategoryDataset dataset;
}
