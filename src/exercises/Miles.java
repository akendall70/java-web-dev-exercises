package exercises;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {
        double miles;
        double gallons;
        double mpg;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter number of miles driven: ");
        miles = input.nextDouble();
        System.out.println("Enter the number of gallons of gasoline used: ");
        gallons = input.nextDouble();
        input.close();

        mpg = miles / gallons;
        System.out.println("You are getting " + mpg + " 34miles per gallon.");

    }
}
