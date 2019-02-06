/*
Program Name:           Circle
Program Author:         Jason Chau
Date Created:           09/25/17
*/
package lab2withgeometricshapes;

public class Circle extends Shape{
    private double radius;
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return radius * radius * Math.PI;
    }
    @Override
    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }
    public double getCircumference(){
        return getPerimeter();
    }
}
