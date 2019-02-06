/*
Program Name:           Lab4Link
Program Author:         Jason Chau & Hackeem Bassaragh
Date Created:           10/21/17
*/
package lab4;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class ImageGUI extends javax.swing.JFrame implements ActionListener{
    private String boilerPlate = "<html>\n   <head>\n      <title>Image</title>\n   </head>\n   <body>"
            + "\n   </body>\n</html>";
    JFileChooser chooser = new JFileChooser();
    public ImageGUI() {
        initComponents();
        txtDoc.setText(boilerPlate);
        btnBrowse.addActionListener(this);
        btnAdd.addActionListener(this);
        btnReset.addActionListener(this);
        btnSave.addActionListener(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLocation = new javax.swing.JTextField();
        btnBrowse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtWidth = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAlternate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDoc = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Image GUI");

        jPanel1.setLayout(new java.awt.GridLayout(5, 3));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Location:");
        jPanel1.add(jLabel2);

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        jPanel1.add(txtLocation);

        btnBrowse.setText("Browse");
        jPanel1.add(btnBrowse);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Width:");
        jPanel1.add(jLabel1);
        jPanel1.add(txtWidth);
        jPanel1.add(jLabel7);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Height:");
        jPanel1.add(jLabel4);

        txtHeight.setToolTipText("");
        jPanel1.add(txtHeight);
        jPanel1.add(jLabel8);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Alternate Text:");
        jPanel1.add(jLabel3);
        jPanel1.add(txtAlternate);
        jPanel1.add(jLabel6);
        jPanel1.add(jLabel9);
        jPanel1.add(jLabel10);

        btnAdd.setText("Add Image");
        jPanel1.add(btnAdd);

        txtDoc.setColumns(20);
        txtDoc.setRows(5);
        jScrollPane1.setViewportView(txtDoc);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnReset.setText("Reset");
        jPanel2.add(btnReset);

        btnSave.setText("Save");
        jPanel2.add(btnSave);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAlternate;
    private javax.swing.JTextArea txtDoc;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables
    @Override
    public void actionPerformed(ActionEvent ae){
        Object source = ae.getSource();
        if(source == btnAdd)
            addToList();
        else if(source == btnBrowse)
            browse();
        else if(source == btnReset)
            reset();
        else if(source == btnSave)
            save();
    }
    public void addToList(){
        if(txtLocation.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "There must be a designated location for an image.");
        }
        else if(txtWidth.getText().length() == 0 && txtHeight.getText().length() == 0 && txtAlternate.getText().length() == 0){
            try{
                StringBuilder sb = new StringBuilder(64);
                sb.append("    <img src=\"");
                sb.append(txtLocation.getText());
                sb.append("\"/>\n  ");
                txtDoc.insert(sb.toString(), txtDoc.getText().indexOf("</body>") - 1);
                txtLocation.setText("");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "No");
            }
        }
        else if(txtWidth.getText().length() == 0 && txtHeight.getText().length() == 0){
            try{
                StringBuilder sb = new StringBuilder(64);
                sb.append("    <img src=\"");
                sb.append(txtLocation.getText());
                sb.append("\" alt=\"");
                sb.append(txtAlternate.getText());
                sb.append("\"/>\n  ");
                txtLocation.setText("");
                txtAlternate.setText("");
                txtDoc.insert(sb.toString(), txtDoc.getText().indexOf("</body>") - 1);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "No");
            }
        }
        else if(txtAlternate.getText().length() == 0){
            try{
                StringBuilder sb = new StringBuilder(64);
                sb.append("    <img src=\"");
                sb.append(txtLocation.getText());
                sb.append("\" width=\"");
                sb.append(txtWidth.getText());
                sb.append("\" height=\"");
                sb.append(txtHeight.getText());
                sb.append("\"/>\n  ");
                txtDoc.insert(sb.toString(), txtDoc.getText().indexOf("</body>") - 1);
                txtLocation.setText("");
                txtWidth.setText("");
                txtHeight.setText("");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "No");
            }
        }
        else{
            try{
                StringBuilder sb = new StringBuilder(64);
                sb.append("    <img src=\"");
                sb.append(txtLocation.getText());
                sb.append("\" width=\"");
                sb.append(txtWidth.getText());
                sb.append("\" height=\"");
                sb.append(txtHeight.getText());
                sb.append("\" alt=\"");
                sb.append(txtAlternate.getText());
                sb.append("\"/>\n  ");
                txtDoc.insert(sb.toString(), txtDoc.getText().indexOf("</body>") - 1);
                txtLocation.setText("");
                txtWidth.setText("");
                txtHeight.setText("");
                txtAlternate.setText("");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "No");
            }
        }
    }
    public void browse(){
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jfc.setAcceptAllFileFilterUsed(false);
        int retValue = jfc.showOpenDialog(this);
        if(retValue == JFileChooser.APPROVE_OPTION){
            txtLocation.setText(jfc.getSelectedFile().toString());
        }
    }
    public void reset(){
        txtDoc.setText(boilerPlate);
    }
    public void save(){
        int retValue = chooser.showSaveDialog(this);
        if(retValue == JFileChooser.APPROVE_OPTION){
            File f = chooser.getSelectedFile();
            try{
                FileOutputStream fos = new FileOutputStream(f);
                String str = txtDoc.getText();
                fos.write(str.getBytes());
                fos.close();
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }
}
