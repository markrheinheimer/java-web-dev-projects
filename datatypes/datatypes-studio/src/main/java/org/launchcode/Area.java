package org.launchcode;
import java.util.Scanner;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What radius is your circle?");

        String radius = input.next();
        while (!Circle.validateInput(radius))
        {
            System.out.println("Invalid input\n Type a double-type number:");
            radius = input.next();
        }

        double verifyRadius = Double.parseDouble(radius);

        Double area = Circle.getArea(verifyRadius);

        System.out.println("The ares of the circle is " + area + " square merters.");
    }
}
