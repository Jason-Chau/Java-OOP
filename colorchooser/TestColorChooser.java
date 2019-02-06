/*
Program Name:           TestColorChooser
Program Author:         Jason Chau
Date Created:           11/26/17
*/
package colorchooser;

import java.awt.Color;
import javax.swing.JColorChooser;

public class TestColorChooser extends javax.swing.JFrame {
    public TestColorChooser() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSelectColor = new javax.swing.JButton();
        colorPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Test Color Chooser");
        setLocation(new java.awt.Point(500, 250));

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnSelectColor.setText("Select Color");
        btnSelectColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectColorActionPerformed(evt);
            }
        });
        jPanel1.add(btnSelectColor);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout colorPanelLayout = new javax.swing.GroupLayout(colorPanel);
        colorPanel.setLayout(colorPanelLayout);
        colorPanelLayout.setHorizontalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        colorPanelLayout.setVerticalGroup(
            colorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        getContentPane().add(colorPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectColorActionPerformed
          ColorChooserDialog dialog = new ColorChooserDialog(new javax.swing.JFrame(),true);
          dialog.setVisible(true);
          colorPanel.setBackground(dialog.getColor()); 
    }//GEN-LAST:event_btnSelectColorActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestColorChooser().setVisible(true);
            }
        });
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelectColor;
    private javax.swing.JPanel colorPanel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}