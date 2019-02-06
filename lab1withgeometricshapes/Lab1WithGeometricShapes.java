/*
Program Name:           Lab1WithGeometricShapes
Program Author:         Jason Chau
Date Created:           09/11/17
*/
package lab1withgeometricshapes;
import java.util.Scanner;

public class Lab1WithGeometricShapes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String proceed;
        do {
            System.out.println("Which shape would you like to work with?");
            System.out.print("1 for Circle, 2 for Rectangle, 3 for Triangle: ");
            int shape = input.nextInt();
            switch (shape) {
                case 1: {
                    System.out.print("Enter the radius: ");
                    double radius = input.nextDouble();
                    double area = Math.PI * radius * radius;
                    double perimeter = 2 * Math.PI * radius;
                    System.out.println("The area is " + area + " and the perimeter is " + perimeter);
                    break;
                }
                case 2: {
                    System.out.print("Enter the length: ");
                    double length = input.nextDouble();
                    System.out.print("Enter the width: ");
                    double width = input.nextDouble();
                    double area = length * width;
                    double perimeter = 2 * (length + width);
                    System.out.println("The area is " + area + " and the perimeter is " + perimeter);
                    break;
                }
                case 3: {
                    System.out.print("Enter the first side: ");
                    double s1 = input.nextDouble();
                    System.out.print("Enter the second side: ");
                    double s2 = input.nextDouble();
                    System.out.print("Enter the third side: ");
                    double s3 = input.nextDouble();
                    double s = (s1 + s2 + s3) / 2;
                    double area = (Math.sqrt(s * (s - s1) * (s - s2) * (s - s3)));
                    double perimeter = (s1 + s2 + s3);
                    System.out.println("The area is " + area + " and the perimeter is " + perimeter);
                    break;
                }
                default: {
                    System.out.println("Invalid Input");
                }
            }
            System.out.print("\nWould you like to continue? Y for Yes: ");
            proceed = input.next();
        } 
        while (proceed.equalsIgnoreCase("Y"));
        System.out.println("Thank You For Using My Programming");
    }
}
