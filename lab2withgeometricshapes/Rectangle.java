/*
Program Name:           Rectangle
Program Author:         Jason Chau
Date Created:           09/25/17
*/
package lab2withgeometricshapes;

public class Rectangle extends Shape{
    private double length;
    private double width;
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea(){
        return length * width;
    }
    @Override
    public double getPerimeter(){
        return 2 * (length + width);
    }
}
