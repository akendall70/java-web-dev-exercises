package exercises.controlflowandcollections;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add((double) 1);
        numbers.add((double) 32);
        numbers.add((double) 34);
        numbers.add((double) 3);
        numbers.add((double) 89);
        numbers.add((double) 456);
        numbers.add((double) 678);
        numbers.add((double) 38);
        numbers.add((double) 23);
        numbers.add((double) 2);
        numbers.add((double) 7);
        Scanner input = new Scanner(System.in);
        double sum = 0;
        System.out.println(numbers);
        for (Double number : numbers) {
            if (number % 2 == 0) {
                sum += number;
                System.out.println(sum);
            }

        }
        String sentence = new String("I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.");
        String split[] = sentence.split(" ");
        List<String> words = new ArrayList<>();
        words = Arrays.asList(split);
        ArrayList<String> combine = new ArrayList<>();
        System.out.println("Enter a word length to search: ");
        double wordLength = input.nextDouble();
        for (String word : words) {
            if (word.length() == wordLength) {
                combine.add(word);
                System.out.println(combine);
            }
        }


    }
}
