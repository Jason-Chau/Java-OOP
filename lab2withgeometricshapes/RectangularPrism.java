/*
Program Name:           RectangularPrism
Program Author:         Jason Chau
Date Created:           09/25/17
*/
package lab2withgeometricshapes;

public class RectangularPrism extends Rectangle{
    private double height;
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public RectangularPrism(double length, double width, double height){
        super(length, width);
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
