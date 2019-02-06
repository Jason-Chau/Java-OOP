/*
Program Name:           Cylinder
Program Author:         Jason Chau
Date Created:           09/25/17
*/
package lab2withgeometricshapes;

public class Cylinder extends Circle{
    private double height;
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public double getVolume(){
        return getArea() * height;
    }
    public double getLateralArea(){
        return getPerimeter() * height;
    }
    public double getSurfaceArea(){
        return getLateralArea() + (2 * getArea());
    }
}
