/*
Program Name:           Triangle
Program Author:         Jason Chau
Date Created:           09/25/17
*/
package lab2withgeometricshapes;

public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;
    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return side3;
    }
    public void setSide1(double side1){
        this.side1 = side1;
    }
    public void setSide2(double side2){
        this.side2 = side2;
    }
    public void setSide3(double side3){
        this.side3 = side3;
    }
    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide(){
        return (side1 + side2 + side3)/2;
    }
    @Override
    public double getArea(){
        return Math.sqrt(getSide() * (getSide() - side1) * (getSide() - side2) * (getSide() - side3));
    }
    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
}
