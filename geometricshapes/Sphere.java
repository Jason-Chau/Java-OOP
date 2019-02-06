/*
Program Name:           Shpere
Program Author:         Jason Chau
Date Created:           09/25/17
*/
package geometricshapes;

public class Sphere extends Circle{
    private double radius;
    @Override
    public double getRadius(){
        return radius;
    }
    @Override
    public void setRadius(double radius){
        this.radius = radius;
    }
    public Sphere(double radius){
        super(radius);
        this.radius = radius;
    }
    public double getSurfaceArea(){
        return 4 * Math.PI * radius * radius;
    }
    public double getVolume(){
        return (4.0/3.0) * Math.PI * radius * radius * radius;
    }
}
