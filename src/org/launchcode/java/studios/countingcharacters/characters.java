package org.launchcode.java.studios.countingcharacters;

import java.util.*;

public class characters {
    public static void main(String[] args) {
        HashMap<Character, Integer> countingChar = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase to count: ");
        String trackedChar = input.nextLine();
        trackedChar = trackedChar.toLowerCase();
        String givenString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = trackedChar.toCharArray();

        for (char letter : charactersInString) {
            if (countingChar.containsKey(letter)) {
                    countingChar.put(letter, countingChar.get(letter) + 1);
            } else {
                countingChar.put(letter, 1);
            }
        }

        for (Map.Entry<Character, Integer> singleChar: countingChar.entrySet()) {
            System.out.println(singleChar.getKey()+ ": " + singleChar.getValue());
        }
    }
}
