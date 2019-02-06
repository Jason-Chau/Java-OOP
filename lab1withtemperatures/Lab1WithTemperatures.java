/*
Program Name:           Lab1WithTemperatures
Program Author:         Jason Chau
Date Created:           09/11/17
*/
package lab1withtemperatures;
import java.util.Scanner;

public class Lab1WithTemperatures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String proceed;
        do {
            System.out.println("Which type of temperature would you like to convert?");
            System.out.print("1 for Fahrenheit, 2 for Celsius: ");
            int temperatureType = input.nextInt();
            switch (temperatureType) {
                case (1): {
                    System.out.print("Enter the Fahrenheit temperature: ");
                    double F = input.nextDouble();
                    double C = (5.0/9.0) * (F - 32);
                    System.out.printf("The Fahrenheit temperature conversion to Celsius is %.2f", C);
                    break;
                }
                case (2): {
                    System.out.print("Enter the Celsius temperature: ");
                    double C = input.nextDouble();
                    double F = (9.0/5.0) * C + 32;
                    System.out.printf("The Celsius temperature conversion to Fahrenheit is %.2f", F);
                    break;
                }
                default: {
                    System.out.println("Invalid Input");
                }
            }
            System.out.print("\nWould you like to continue? Y for Yes: ");
            proceed = input.next();
        }
        while(proceed.equalsIgnoreCase("Y"));
        System.out.println("Thank You For Using My Program");
    }
}
