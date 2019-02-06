/*
Program Name:           TemperatureGUI
Program Author:         Jason Chau
Date Created:           10/9/17
*/
package lab3withtemperatures;
import java.awt.event.*;

public class TemperatureGUI extends javax.swing.JFrame implements ActionListener{
    public TemperatureGUI() {
        initComponents();
        btnFahrenheit.addActionListener(this);
        btnCelsius.addActionListener(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFahrenheit = new javax.swing.JButton();
        btnCelsius = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFahrenheit.setText("Fahrenheit");
        btnFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFahrenheitActionPerformed(evt);
            }
        });

        btnCelsius.setText("Celsius");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFahrenheit, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(btnCelsius, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFahrenheit)
                .addGap(18, 18, 18)
                .addComponent(btnCelsius, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFahrenheitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFahrenheitActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemperatureGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCelsius;
    private javax.swing.JButton btnFahrenheit;
    // End of variables declaration//GEN-END:variables
    @Override
    public void actionPerformed(ActionEvent ae){
        Object source = ae.getSource();
        if(source == btnFahrenheit){
            new FahrenheitGUI().setVisible(true);
        }
        else if(source == btnCelsius){
            new CelsiusGUI().setVisible(true);
        }
    }
}