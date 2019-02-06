/*
Program Name:           Lab2WithGeometricShapes
Program Author:         Jason Chau
Date Created:           09/25/17
*/
package lab2withgeometricshapes;
import javax.swing.JOptionPane;


public class Lab2WithGeometricShapes {
    public static void main(String[] args) {
        String proceed;
        do{
            int choice = Integer.parseInt(JOptionPane.showInputDialog("Which shape would you like to work with, choose number: \n1. Circle \n2. Rectangle \n3. Triangle \n4. Cylinder \n5. Rectangular Prism \n6. Triangular Prism \n7. Sphere"));
            switch(choice){
                case 1:{
                    double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius: "));
                    Circle circle = new Circle(radius);
                    JOptionPane.showMessageDialog(null, "Area: " + circle.getArea() + "\nPerimeter: " + circle.getPerimeter());
                    break;
                }
                case 2:{
                    double length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length: "));
                    double width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width: "));
                    Rectangle rectangle = new Rectangle(length, width);
                    JOptionPane.showMessageDialog(null, "Area: " + rectangle.getArea() + "\nPerimeter: " + rectangle.getPerimeter());
                    break;
                }
                case 3:{
                    double side1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first side: "));
                    double side2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second side: "));
                    double side3 = Double.parseDouble(JOptionPane.showInputDialog("Enter the third side: "));
                    Triangle triangle = new Triangle(side1, side2, side3);
                    JOptionPane.showMessageDialog(null, "Area: " + triangle.getArea() + "\nPerimeter " + triangle.getPerimeter());
                }
                case 4:{
                    double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius: "));
                    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height: "));
                    Cylinder cylinder = new Cylinder(radius, height);
                    JOptionPane.showMessageDialog(null, "Volume: " + cylinder.getVolume() + "\nSurface Area: " + cylinder.getSurfaceArea());
                }
                case 5:{
                    double length = Double.parseDouble(JOptionPane.showInputDialog("Enter the length: "));
                    double width = Double.parseDouble(JOptionPane.showInputDialog("Enter the width: "));
                    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height: "));
                    RectangularPrism rectangularprism = new RectangularPrism(length, width, height);
                    JOptionPane.showMessageDialog(null, "Volume: " + rectangularprism.getVolume() + "\nSurface Area: " + rectangularprism.getSurfaceArea());
                }
                case 6:{
                    double side1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first side: "));
                    double side2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second side: "));
                    double side3 = Double.parseDouble(JOptionPane.showInputDialog("Enter the third side: "));
                    double height = Double.parseDouble(JOptionPane.showInputDialog("Enter the height: "));
                    TriangularPrism triangularprism = new TriangularPrism(side1, side2, side3, height);
                    JOptionPane.showMessageDialog(null, "Volume: " + triangularprism.getVolume() + "\nSurface Area: " + triangularprism.getSurfaceArea());
                }
                case 7:{
                    double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius: "));
                    Sphere sphere = new Sphere(radius);
                    JOptionPane.showMessageDialog(null, "Surface Area: " + sphere.getSurfaceArea() + "\nVolume: " + sphere.getVolume());
                }
            }
            proceed = JOptionPane.showInputDialog("Would you like to continue? Y for Yes: ");
        }
        while(proceed.equalsIgnoreCase("Y"));
        JOptionPane.showMessageDialog(null, "Thank You For Using My Programming");
    }
}
