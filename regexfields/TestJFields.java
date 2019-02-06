/*
Program Name:           TestJFields
Program Author:         Jason Chau
Date Created:           11/26/17
*/
package regexfields;

public class TestJFields extends javax.swing.JFrame {
    public TestJFields() {
        initComponents();
//        jRegExFields1.setExp("([0-9]{1,}\\.?[0-9]*)|([0-9]*\\.?[0-9]{1,})"); 
//        jRegExFields1.setExp("\\.?([0-9]+)"); // NO at least one after dot
//        jRegExFields1.setExp("[0-9]*\\.?([0-9]+)"); // NO at least one after dot
//        jRegExFields1.setExp("([0-9]{1,}\\.?[0-9]*)"); // YES at least one before dot
        jRegExFields1.setExp("-?[0-9]{1,}\\.?[0-9]*"); // NO at least one before dot
//(([0-9]{1,}\\.?[0-9]*)|(-?[0-9]*\\.?[0-9]{1,}))
//        jRegExFields1.setExp("-?[0-9]*\\.?[0-9]*"); // Original 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jIntegerField1 = new regexfields.JIntegerField();
        jRegExFields1 = new regexfields.JRegExFields();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jOperandField1 = new regexfields.JOperandField();
        jLabel3 = new javax.swing.JLabel();
        jDoubleField1 = new regexfields.JDoubleField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jRegExFields1.setToolTipText("");

        jLabel1.setText("Integer Expression");

        jLabel2.setText("Generic Regular Expression");

        jOperandField1.setText("jOperandField1");

        jLabel3.setText("Operand");

        jDoubleField1.setText("0");

        jLabel4.setText("Double");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jDoubleField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jOperandField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jIntegerField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(jRegExFields1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jIntegerField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jRegExFields1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(jOperandField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(jDoubleField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestJFields().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private regexfields.JDoubleField jDoubleField1;
    private regexfields.JIntegerField jIntegerField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private regexfields.JOperandField jOperandField1;
    private regexfields.JRegExFields jRegExFields1;
    // End of variables declaration//GEN-END:variables
}