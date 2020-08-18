package exercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Please enter a search word: ");
        String word = input.next();
        word = word.toLowerCase();
        int index = alice.indexOf(word);
        int length = word.length();

        input.close();

        if (alice.toLowerCase().contains(word)) {
            System.out.println(word + " is in the sentence. The word is " + length + " letters long and is at the index of " + index);
        } else {
            System.out.println((word + " is not in this sentence."));
        }
    }
}
