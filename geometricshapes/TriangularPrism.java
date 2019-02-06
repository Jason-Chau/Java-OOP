/*
Program Name:           TriangularPrism
Program Author:         Jason Chau
Date Created:           09/25/17
*/
package geometricshapes;

public class TriangularPrism extends Triangle{
    private double height;
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public TriangularPrism(double side1, double side2, double side3, double height){
        super(side1, side2, side3);
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
