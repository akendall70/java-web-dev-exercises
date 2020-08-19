package exercises.controlflowandcollections;

import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[6];
        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 3;
        numbers[4] = 5;
        numbers[5] = 8;
        Scanner input = new Scanner(System.in);

        for (int number : numbers) {
            if (number % 2 !=0) {
                System.out.println(number);
            }
        }

        int maxWords = 35;
        String sentence = new String("I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.");
        String eachWord[] = sentence.split("\\.");
        for( String each: eachWord) {
            System.out.println(each);
        }
    }
}
