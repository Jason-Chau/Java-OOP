/*
Program Name:           Lab4Link
Program Author:         Jason Chau & Hackeem Bassaragh
Date Created:           10/21/17
*/
package lab4;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class LinkGUI extends javax.swing.JFrame implements ActionListener{
    private String boilerPlate = "<html>\n   <head>\n      <title>Link</title>\n   </head>\n   <body>"
            + "\n   </body>\n</html>";
    JFileChooser chooser = new JFileChooser();
    public LinkGUI() {
        initComponents();
        txtDoc.setText(boilerPlate);
        btnAdd.addActionListener(this);
        btnReset.addActionListener(this);
        btnSave.addActionListener(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtURL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDisplay = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDoc = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Link GUI");

        jPanel1.setLayout(new java.awt.GridLayout(3, 2));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("URL");
        jPanel1.add(jLabel2);
        jPanel1.add(txtURL);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Display Text");
        jPanel1.add(jLabel1);
        jPanel1.add(txtDisplay);
        jPanel1.add(jLabel3);

        btnAdd.setText("Add Link");
        jPanel1.add(btnAdd);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnReset.setText("Reset");
        jPanel2.add(btnReset);

        btnSave.setText("Save");
        jPanel2.add(btnSave);

        txtDoc.setColumns(20);
        txtDoc.setRows(5);
        jScrollPane1.setViewportView(txtDoc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LinkGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDisplay;
    private javax.swing.JTextArea txtDoc;
    private javax.swing.JTextField txtURL;
    // End of variables declaration//GEN-END:variables
    @Override
    public void actionPerformed(ActionEvent ae){
        Object source = ae.getSource();
        if(source == btnAdd)
            addToList();
        else if(source == btnReset)
            reset();
        else if(source == btnSave)
            save();
    }
    public void addToList(){
        if(txtURL.getText().length() == 0 || txtDisplay.getText().length() == 0)
            JOptionPane.showMessageDialog(this, "There must be a URL or Alternate Name");
        else{
            try{
                StringBuilder sb = new StringBuilder(64);
                sb.append("    <a href=\"https://");
                sb.append(txtURL.getText());
                sb.append("\">");
                sb.append(txtDisplay.getText());
                sb.append("</a>\n  ");
                txtDoc.insert(sb.toString(), txtDoc.getText().indexOf("</body>") - 1);
                txtDisplay.setText("");
                txtURL.setText("");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Please do not modify the code.");
            }
        }
    }
    public void reset(){
        txtDoc.setText(boilerPlate);
        txtURL.requestFocus();
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
