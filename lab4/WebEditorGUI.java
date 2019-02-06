/*
Program Name:           WebEditorGUI
Program Author:         Jason Chau & Hackeem Bassaragh
Date Created:           10/21/17
*/
package lab4;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class WebEditorGUI extends javax.swing.JFrame implements ActionListener {
    public WebEditorGUI() {
        initComponents();
        btnTable.addActionListener(this);
        btnImage.addActionListener(this);
        btnLink.addActionListener(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnTable = new javax.swing.JButton();
        btnImage = new javax.swing.JButton();
        btnLink = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Web Editor");

        jPanel1.setLayout(new java.awt.GridLayout(2, 3));
        jPanel1.add(jLabel1);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Choose a Component");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2);
        jPanel1.add(jLabel3);

        btnTable.setText("Table");
        jPanel1.add(btnTable);

        btnImage.setText("Image");
        jPanel1.add(btnImage);

        btnLink.setText("Link");
        jPanel1.add(btnLink);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WebEditorGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImage;
    private javax.swing.JButton btnLink;
    private javax.swing.JButton btnTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source == btnTable) 
            new TableGUI().setVisible(true);
        else if (source == btnImage) 
            new ImageGUI().setVisible(true);
        else if (source == btnLink) 
            new LinkGUI().setVisible(true);
    }
}