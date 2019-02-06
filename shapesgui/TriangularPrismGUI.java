/*
Program Name:           ShapesGUI
Program Author:         Jason Chau
Date Created:           10/9/17
*/
package shapesgui;
import java.awt.event.*;
import geometricshapes.*;

public class TriangularPrismGUI extends javax.swing.JFrame implements ActionListener{
    public TriangularPrismGUI() {
        initComponents();
        btnCalculate.addActionListener(this);
        btnClear.addActionListener(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtSide1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSide2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSide3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Enter Side 1");

        jLabel2.setText("Enter Side 2");

        jLabel3.setText("Enter Side 3");

        jLabel4.setText("Enter the Height");
        jLabel4.setToolTipText("");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSide1)
                            .addComponent(txtSide2)
                            .addComponent(txtSide3)
                            .addComponent(txtHeight)))
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
                    .addComponent(txtSide1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSide2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSide3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalculate)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
                .addComponent(lblResult, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TriangularPrismGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JButton btnClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblResult;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtSide1;
    private javax.swing.JTextField txtSide2;
    private javax.swing.JTextField txtSide3;
    // End of variables declaration//GEN-END:variables
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == btnCalculate){
            TriangularPrism triangularprism = new TriangularPrism(Double.parseDouble(txtSide1.getText()), Double.parseDouble(txtSide2.getText()), Double.parseDouble(txtSide3.getText()), Double.parseDouble(txtHeight.getText()));
            lblResult.setText("<html>Volume: " + triangularprism.getVolume() + "<br>Surface Area: " + triangularprism.getSurfaceArea());
        }
        else if(ae.getSource() == btnClear){
            txtSide1.setText("");
            txtSide2.setText("");
            txtSide3.setText("");
            txtHeight.setText("");
            lblResult.setText("");
            txtSide1.requestFocus();
        }
    }
}