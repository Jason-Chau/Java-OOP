/*
Program Name:           WebEditorGUI
Program Author:         Jason Chau & Hackeem Bassaragh
Date Created:           10/21/17
*/
package lab4;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;
public class TableGUI extends javax.swing.JFrame implements ActionListener {
    private String boilerPlate = "<html>\n   <head>\n      <title>Table</title>"
            + "\n   </head>\n   <body>\n"
            + "   </body>\n</html>";
    JFileChooser chooser = new JFileChooser();
    public TableGUI() {        
        initComponents();
        txtDoc.setText(boilerPlate);
        btnInsert.addActionListener(this);
        btnReset.addActionListener(this);
        btnSave.addActionListener(this);        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtDoc = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        txtRows = new javax.swing.JTextField();
        txtBdrSize = new javax.swing.JTextField();
        txtColumns = new javax.swing.JTextField();
        txtWidth = new javax.swing.JTextField();
        txtCellSpc = new javax.swing.JTextField();
        txtCellPadd = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Table GUI");

        txtDoc.setColumns(20);
        txtDoc.setRows(5);
        jScrollPane1.setViewportView(txtDoc);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel1.setText("Row(s):");

        jLabel2.setText("Column(s):");

        jLabel3.setText("Border Size:");

        jLabel4.setText("Width:");

        jLabel5.setText("Cell Spacing:");

        jLabel6.setText("The amount of space between the cells.");

        jLabel7.setText("Cell Padding:");

        jLabel8.setText("Space between border of cell and its content.");

        btnInsert.setText("Insert");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtWidth, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(txtBdrSize, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRows, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtColumns, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCellSpc, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCellPadd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInsert)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5)
                    .addComponent(txtRows, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCellSpc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel6))
                    .addComponent(txtColumns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7)
                    .addComponent(txtBdrSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCellPadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtWidth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInsert))))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnReset.setText("Reset");
        jPanel2.add(btnReset);

        btnSave.setText("Save");
        jPanel2.add(btnSave);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TableGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBdrSize;
    private javax.swing.JTextField txtCellPadd;
    private javax.swing.JTextField txtCellSpc;
    private javax.swing.JTextField txtColumns;
    private javax.swing.JTextArea txtDoc;
    private javax.swing.JTextField txtRows;
    private javax.swing.JTextField txtWidth;
    // End of variables declaration//GEN-END:variables
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source == btnInsert)
            addToList();
        else if (source == btnReset) 
            reset();
        else if (source == btnSave) 
            save();
    }    
    public void addToList() {
        if (txtRows.getText().length() == 0 || txtColumns.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "There must be a value for Row(s) and Column(s)");
        }
        else if(txtBdrSize.getText().length() == 0 && txtWidth.getText().length() == 0 && txtCellSpc.getText().length() == 0 && txtCellPadd.getText().length() == 0){
            try{
                txtBdrSize.setText("0");
                StringBuilder sb = new StringBuilder(64);
                sb.append("    <table border=\"");
                sb.append(txtBdrSize.getText());
                sb.append("\">");
                sb.append("\n         <thead>");
                sb.append("\n            <tr>");
                for (int i = 0; i < Integer.parseInt(txtColumns.getText()); i++) {
                    sb.append("\n               <th></th>");
                }
                sb.append("\n            </tr>");
                sb.append("\n         </thead>");
                sb.append("\n         <tbody>");
                for (int i = 0; i < Integer.parseInt(txtRows.getText()); i++) {
                    sb.append("\n            <tr>");
                    for (int k = 0; k < Integer.parseInt(txtColumns.getText()); k++){
                        sb.append("\n               <td></td>");
                    }
                    sb.append("\n            </tr>");
                }
                sb.append("\n          </tbody>");
                sb.append("\n       </table>\n   ");
                txtDoc.insert(sb.toString(), txtDoc.getText().indexOf("</body>")-1);
                txtRows.setText("");
                txtColumns.setText("");
                txtBdrSize.setText("");
                txtRows.requestFocus();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "An error occurred. Please do not modify the code! If you haven't made "
                        + "changes to the code, "
                        + "only enter positive integers, please.");
            }
        }
        else if(txtWidth.getText().length() == 0 && txtCellSpc.getText().length() == 0 && txtCellPadd.getText().length() == 0){
            try{
                StringBuilder sb = new StringBuilder(64);
                sb.append("    <table border=\"");
                sb.append(txtBdrSize.getText());
                sb.append("\">");
                sb.append("\n         <thead>");
                sb.append("\n            <tr>");
                for (int i = 0; i < Integer.parseInt(txtColumns.getText()); i++) {
                    sb.append("\n               <th></th>");
                }
                sb.append("\n            </tr>");
                sb.append("\n         </thead>");
                sb.append("\n         <tbody>");
                for (int i = 0; i < Integer.parseInt(txtRows.getText()); i++) {
                    sb.append("\n            <tr>");
                    for (int k = 0; k < Integer.parseInt(txtColumns.getText()); k++){
                        sb.append("\n               <td></td>");
                    }
                    sb.append("\n            </tr>");
                }
                sb.append("\n          </tbody>");
                sb.append("\n       </table>\n   ");
                txtDoc.insert(sb.toString(), txtDoc.getText().indexOf("</body>")-1);
                txtRows.setText("");
                txtColumns.setText("");
                txtBdrSize.setText("");
                txtRows.requestFocus();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "An error occurred. Please do not modify the code! If you haven't made "
                        + "changes to the code, "
                        + "only enter positive integers, please.");
            }
        }
        else if(txtCellSpc.getText().length() == 0 && txtCellPadd.getText().length() == 0){
            try{
                StringBuilder sb = new StringBuilder(64);
                sb.append("    <table border=\"");
                sb.append(txtBdrSize.getText());
                sb.append("\"");
                sb.append(" width=\"");
                sb.append(txtWidth.getText());
                sb.append("\">");
                sb.append("\n         <thead>");
                sb.append("\n            <tr>");
                for (int i = 0; i < Integer.parseInt(txtColumns.getText()); i++) {
                    sb.append("\n               <th></th>");
                }
                sb.append("\n            </tr>");
                sb.append("\n         </thead>");
                sb.append("\n         <tbody>");
                for (int i = 0; i < Integer.parseInt(txtRows.getText()); i++) {
                    sb.append("\n            <tr>");
                    for (int k = 0; k < Integer.parseInt(txtColumns.getText()); k++){
                        sb.append("\n               <td></td>");
                    }
                    sb.append("\n            </tr>");
                }
                sb.append("\n          </tbody>");
                sb.append("\n       </table>\n   ");
                txtDoc.insert(sb.toString(), txtDoc.getText().indexOf("</body>")-1);
                txtRows.setText("");
                txtColumns.setText("");
                txtBdrSize.setText("");
                txtWidth.setText("");
                txtRows.requestFocus();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "An error occurred. Please do not modify the code! If you haven't made "
                        + "changes to the code, "
                        + "only enter positive integers, please.");
            }
        }
        else if(txtBdrSize.getText().length() == 0 && txtWidth.getText().length() == 0){
            try{
                txtBdrSize.setText("0");
                StringBuilder sb = new StringBuilder(64);
                sb.append("    <table border=\"");
                sb.append(txtBdrSize.getText());
                sb.append("\"");
//                sb.append(" width=\"");
//                sb.append(txtWidth.getText());
//                sb.append("\"");
                sb.append(" cellspacing=\"");
                sb.append(txtCellSpc.getText());
                sb.append("\"");
                sb.append(" cellpadding=\"");
                sb.append(txtCellPadd.getText());
                sb.append("\">");
                sb.append("\n         <thead>");
                sb.append("\n            <tr>");
                for (int i = 0; i < Integer.parseInt(txtColumns.getText()); i++) {
                    sb.append("\n               <th></th>");
                }
                sb.append("\n            </tr>");
                sb.append("\n         </thead>");
                sb.append("\n         <tbody>");
                for (int i = 0; i < Integer.parseInt(txtRows.getText()); i++) {
                    sb.append("\n            <tr>");
                    for (int k = 0; k < Integer.parseInt(txtColumns.getText()); k++){
                        sb.append("\n               <td></td>");
                    }
                    sb.append("\n            </tr>");
                }
                sb.append("\n          </tbody>");
                sb.append("\n       </table>\n   ");
                txtDoc.insert(sb.toString(), txtDoc.getText().indexOf("</body>")-1);
                txtRows.setText("");
                txtColumns.setText("");
                txtBdrSize.setText("");
                txtCellSpc.setText("");
                txtCellPadd.setText("");
                txtRows.requestFocus();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "An error occurred. Please do not modify the code! If you haven't made "
                        + "changes to the code, "
                        + "only enter positive integers, please.");
            }
        }
        else if(txtBdrSize.getText().length() == 0){
            try{
                txtBdrSize.setText("0");
                StringBuilder sb = new StringBuilder(64);
                sb.append("    <table border=\"");
                sb.append(txtBdrSize.getText());
                sb.append("\"");
                sb.append(" width=\"");
                sb.append(txtWidth.getText());
                sb.append("\"");
                sb.append(" cellspacing=\"");
                sb.append(txtCellSpc.getText());
                sb.append("\"");
                sb.append(" cellpadding=\"");
                sb.append(txtCellPadd.getText());
                sb.append("\">");
                sb.append("\n         <thead>");
                sb.append("\n            <tr>");
                for (int i = 0; i < Integer.parseInt(txtColumns.getText()); i++) {
                    sb.append("\n               <th></th>");
                }
                sb.append("\n            </tr>");
                sb.append("\n         </thead>");
                sb.append("\n         <tbody>");
                for (int i = 0; i < Integer.parseInt(txtRows.getText()); i++) {
                    sb.append("\n            <tr>");
                    for (int k = 0; k < Integer.parseInt(txtColumns.getText()); k++){
                        sb.append("\n               <td></td>");
                    }
                    sb.append("\n            </tr>");
                }
                sb.append("\n          </tbody>");
                sb.append("\n       </table>\n   ");
                txtDoc.insert(sb.toString(), txtDoc.getText().indexOf("</body>")-1);
                txtRows.setText("");
                txtColumns.setText("");
                txtBdrSize.setText("");
                txtWidth.setText("");
                txtRows.requestFocus();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "An error occurred. Please do not modify the code! If you haven't made "
                        + "changes to the code, "
                        + "only enter positive integers, please.");
            }
        }
        else if(txtWidth.getText().length() == 0){
            try{
                StringBuilder sb = new StringBuilder(64);
                sb.append("    <table border=\"");
                sb.append(txtBdrSize.getText());
                sb.append("\"");
                sb.append(" cellspacing=\"");
                sb.append(txtCellSpc.getText());
                sb.append("\"");
                sb.append(" cellpadding=\"");
                sb.append(txtCellPadd.getText());
                sb.append("\">");
                sb.append("\n         <thead>");
                sb.append("\n            <tr>");
                for (int i = 0; i < Integer.parseInt(txtColumns.getText()); i++) {
                    sb.append("\n               <th></th>");
                }
                sb.append("\n            </tr>");
                sb.append("\n         </thead>");
                sb.append("\n         <tbody>");
                for (int i = 0; i < Integer.parseInt(txtRows.getText()); i++) {
                    sb.append("\n            <tr>");
                    for (int k = 0; k < Integer.parseInt(txtColumns.getText()); k++){
                        sb.append("\n               <td></td>");
                    }
                    sb.append("\n            </tr>");
                }
                sb.append("\n          </tbody>");
                sb.append("\n       </table>\n   ");
                txtDoc.insert(sb.toString(), txtDoc.getText().indexOf("</body>")-1);
                txtRows.setText("");
                txtColumns.setText("");
                txtBdrSize.setText("");
                txtWidth.setText("");
                txtRows.requestFocus();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "An error occurred. Please do not modify the code! If you haven't made "
                        + "changes to the code, "
                        + "only enter positive integers, please.");
            }
        }
        else{
            try {
                StringBuilder sb = new StringBuilder(64);
                sb.append("    <table border=\"");
                sb.append(txtBdrSize.getText());
                sb.append("\"");
                sb.append(" width=\"");
                sb.append(txtWidth.getText());
                sb.append("\"");
                sb.append(" cellspacing=\"");
                sb.append(txtCellSpc.getText());
                sb.append("\"");
                sb.append(" cellpadding=\"");
                sb.append(txtCellPadd.getText());
                sb.append("\">");
                sb.append("\n         <thead>");
                sb.append("\n            <tr>");
                for (int i = 0; i < Integer.parseInt(txtColumns.getText()); i++) {
                    sb.append("\n               <th></th>");
                    //sb.append("</th>");
                }
                sb.append("\n            </tr>");
                sb.append("\n         </thead>");
                sb.append("\n         <tbody>");
                for (int i = 0; i < Integer.parseInt(txtRows.getText()); i++) {
                    sb.append("\n            <tr>");
                    for (int k = 0; k < Integer.parseInt(txtColumns.getText()); k++){
                        sb.append("\n               <td></td>");
                       // sb.append("</td>");
                    }
                    sb.append("\n            </tr>");
                }
                sb.append("\n          </tbody>");
                sb.append("\n       </table>\n   ");
                txtDoc.insert(sb.toString(), txtDoc.getText().indexOf("</body>")-1);
                txtRows.setText("");
                txtColumns.setText("");
                txtBdrSize.setText("");
                txtWidth.setText("");
                txtCellSpc.setText("");
                txtCellPadd.setText("");
                txtRows.requestFocus();
            } 
            catch (Exception e) {
                JOptionPane.showMessageDialog(this, "An error occurred. Please do not modify the code! If you haven't made "
                        + "changes to the code, "
                        + "only enter positive integers, please.");
            }
        }
    }
    public void reset() {
        txtDoc.setText(boilerPlate);
        txtRows.setText("");
        txtWidth.setText("");
        txtColumns.setText("");
        txtBdrSize.setText("");
        txtCellSpc.setText("");
        txtCellPadd.setText("");
        txtRows.requestFocus();
    }  
    public void save() {
        int retValue = chooser.showSaveDialog(this);
        if (retValue == JFileChooser.APPROVE_OPTION) {
            File f = chooser.getSelectedFile();
            try {
                FileOutputStream fos = new FileOutputStream(f);
                String str = txtDoc.getText();
                fos.write(str.getBytes());
                fos.close();
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }
}

