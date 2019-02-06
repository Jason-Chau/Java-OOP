/*
Program Name:           ToDoList
Program Author:         Jason Chau
Date Created:           12/11/17
*/
package pkgfinal.project;

import javax.swing.*;
import java.io.*;

public class ToDoList extends javax.swing.JFrame{
    DefaultListModel dlm = new DefaultListModel();
    DefaultListModel<JCheckBox> model = new DefaultListModel<JCheckBox>();
    JCheckBoxList checkBoxList = new JCheckBoxList(model);
    JFileChooser jfc = new JFileChooser();
    boolean file;
    
    public ToDoList() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlToDo = new javax.swing.JPanel();
        lblList = new javax.swing.JLabel();
        pnlList = new javax.swing.JPanel();
        scrlList = new javax.swing.JScrollPane();
        listTask = new javax.swing.JList<>();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        txtTask = new javax.swing.JTextField();
        pnlSaveLoad = new javax.swing.JPanel();
        btnSave = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 150));

        lblList.setText("To Do List");

        javax.swing.GroupLayout pnlToDoLayout = new javax.swing.GroupLayout(pnlToDo);
        pnlToDo.setLayout(pnlToDoLayout);
        pnlToDoLayout.setHorizontalGroup(
            pnlToDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlToDoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblList)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlToDoLayout.setVerticalGroup(
            pnlToDoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlToDoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblList))
        );

        listTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listTaskMouseClicked(evt);
            }
        });
        scrlList.setViewportView(listTask);
        listTask.getAccessibleContext().setAccessibleName("");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        txtTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlListLayout = new javax.swing.GroupLayout(pnlList);
        pnlList.setLayout(pnlListLayout);
        pnlListLayout.setHorizontalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListLayout.createSequentialGroup()
                .addGroup(pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrlList, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(txtTask))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlListLayout.setVerticalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListLayout.createSequentialGroup()
                .addGroup(pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListLayout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove))
                    .addComponent(scrlList, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSave.setText("Save List");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        pnlSaveLoad.add(btnSave);

        btnLoad.setText("Load List");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });
        pnlSaveLoad.add(btnLoad);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSaveLoad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlToDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlToDo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlSaveLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (txtTask.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Nothing to add");
            txtTask.requestFocus();
        }
        else{
            dlm.addElement(txtTask.getText());
            listTask.setModel(dlm);
            txtTask.setText("");
            txtTask.requestFocus();
            file = true;
        }
        model.addElement(new JCheckBox());
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (txtTask.getText().length() == 0){
            JOptionPane.showMessageDialog(this, "Enter a value for update");
        }
        else{
            try{
                int index = listTask.getSelectedIndex();
                dlm.setElementAt(txtTask.getText(), index);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Select a task to update");
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void listTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTaskMouseClicked
        String index = listTask.getSelectedValue();
        txtTask.setText(index);
    }//GEN-LAST:event_listTaskMouseClicked

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try{
            int index = listTask.getSelectedIndex();
            dlm.removeElementAt(index);
            txtTask.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, "Select a task to remove");
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTaskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTaskActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int returnValue = jfc.showSaveDialog(this);
        if(evt.getSource() == btnSave){
            if(returnValue == JFileChooser.APPROVE_OPTION){
                String fileName = jfc.getSelectedFile().toString();
                if (!fileName.endsWith(".txt"))
                    fileName += ".txt";
                int value = listTask.getModel().getSize();
                PrintWriter pw = null;
                try{
                    pw = new PrintWriter(fileName);
                    pw.print("Tasks: ");
                    pw.println(value);
                    for(int i = 0; i < value; i++){
                        pw.println(listTask.getModel().getElementAt(i));
                    }
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(this, "Unable to save file");
                }
                finally{
                    pw.close();
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        int returnValue = jfc.showOpenDialog(this);
        if(evt.getSource() == btnLoad){
            if(returnValue == JFileChooser.APPROVE_OPTION){
                String fileName = jfc.getSelectedFile().toString();
                if (fileName.endsWith(".txt")){
                    dlm.clear();
                    listTask.setModel(dlm);
                    if(file){
                        BufferedReader br = null;
                        try{
                            br = new BufferedReader(new FileReader(fileName));
                            br.skip(7);
                            int value = Integer.parseInt(br.readLine());
                            for(int i = 0; i < value; i++){
                                String string = br.readLine();
                                dlm.addElement(string);
                            }
                            listTask.setModel(dlm);
                            file = false;
                        }
                        catch(Exception e){
                            JOptionPane.showMessageDialog(this, "Unable to load file");
                        }
                        finally{
                            try{
                                br.close();
                            }
                            catch(Exception e){
                                JOptionPane.showMessageDialog(this, "Unable to close");
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnLoadActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToDoList().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblList;
    private javax.swing.JList<String> listTask;
    private javax.swing.JPanel pnlList;
    private javax.swing.JPanel pnlSaveLoad;
    private javax.swing.JPanel pnlToDo;
    private javax.swing.JScrollPane scrlList;
    private javax.swing.JTextField txtTask;
    // End of variables declaration//GEN-END:variables
}