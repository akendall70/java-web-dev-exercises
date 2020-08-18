package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
      double length;
      double width;
      Scanner input;

      input = new Scanner(System.in);
      System.out.println("Enter the length: ");
      length = input.nextDouble();
      System.out.println("Enter the width: ");
      width = input.nextDouble();
      input.close();

      double rectangle = length * width;
      System.out.println("The rectangle's area is " + rectangle);

    }
}
