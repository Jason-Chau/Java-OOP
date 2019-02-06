/*
Program Name:           CylinderGUI
Program Author:         Jason Chau
Date Created:           10/9/17
*/
package shapesgui;
import java.awt.event.*;
import geometricshapes.*;

public class CylinderGUI extends javax.swing.JFrame implements ActionListener{
    public CylinderGUI() {
        initComponents();
        btnCalculate.addActionListener(this);
        btnClear.addActionListener(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtRadius = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Enter the Radius");

        jLabel2.setText("Enter the Height");

        btnCalculate.setText("Calculate");

        btnClear.setText("Clear");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtRadius))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtHeight))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 192, Short.MAX_VALUE)
                        .addComponent(btnClear)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalculate)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRadius, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CylinderGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtRadius;
    // End of variables declaration//GEN-END:variables
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == btnCalculate){
            Cylinder cylinder = new Cylinder(Double.parseDouble(txtRadius.getText()), Double.parseDouble(txtHeight.getText()));
            lblResult.setText("<html>Volume: " + cylinder.getVolume() + "<br>Surface Area: " + cylinder.getSurfaceArea());
        }
        else if(ae.getSource() == btnClear){
            txtRadius.setText("");
            txtHeight.setText("");
            lblResult.setText("");
            txtRadius.requestFocus();
        }
    }
}
