/*
Program Name:           ShapesGUI
Program Author:         Jason Chau
Date Created:           10/9/17
*/
package shapesgui;
import java.awt.event.*;

public class ShapesGUI extends javax.swing.JFrame implements ActionListener{
    public ShapesGUI() {
        initComponents();
        btnCircle.addActionListener(this);
        btnRectangle.addActionListener(this);
        btnTriangle.addActionListener(this);
        btnCylinder.addActionListener(this);
        btnRectangularPrism.addActionListener(this);
        btnTriangularPrism.addActionListener(this);
        btnSphere.addActionListener(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCircle = new javax.swing.JButton();
        btnRectangle = new javax.swing.JButton();
        btnTriangle = new javax.swing.JButton();
        btnCylinder = new javax.swing.JButton();
        btnRectangularPrism = new javax.swing.JButton();
        btnTriangularPrism = new javax.swing.JButton();
        btnSphere = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCircle.setText("Circle");

        btnRectangle.setText("Rectangle");

        btnTriangle.setText("Triangle");

        btnCylinder.setText("Cylinder");

        btnRectangularPrism.setText("Rectangular Prism");

        btnTriangularPrism.setText("Triangular Prism");

        btnSphere.setText("Sphere");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRectangularPrism, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCircle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnRectangle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTriangle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCylinder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTriangularPrism, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSphere, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnCircle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRectangle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTriangle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCylinder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRectangularPrism)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTriangularPrism)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSphere))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShapesGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCircle;
    private javax.swing.JButton btnCylinder;
    private javax.swing.JButton btnRectangle;
    private javax.swing.JButton btnRectangularPrism;
    private javax.swing.JButton btnSphere;
    private javax.swing.JButton btnTriangle;
    private javax.swing.JButton btnTriangularPrism;
    // End of variables declaration//GEN-END:variables
    @Override
    public void actionPerformed(ActionEvent ae){
        Object source = ae.getSource();
        if(source == btnCircle){
            new CircleGUI().setVisible(true);
        }
        else if(source == btnRectangle){
            new RectangleGUI().setVisible(true);
        }
        else if(source == btnTriangle){
            new TriangleGUI().setVisible(true);
        }
        else if(source == btnCylinder){
            new CylinderGUI().setVisible(true);
        }
        else if(source == btnRectangularPrism){
            new RectangularPrismGUI().setVisible(true);
        }
        else if(source == btnTriangularPrism){
            new TriangularPrismGUI().setVisible(true);
        }
        else if(source == btnSphere){
            new SphereGUI().setVisible(true);
        }
    }
}
