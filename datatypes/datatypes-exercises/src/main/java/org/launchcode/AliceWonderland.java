package org.launchcode;

import java.util.Scanner;

public class AliceWonderland {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister" +
                " on the bank, and of having nothing to do: once or twice she had peeped" +
                " into the book her sister was reading, but it had no pictures or" +
                " conversations in it, 'and what is the usr of a book,' thought Alice" +
                " 'without pictures or conversation?'";
        System.out.println("What word would you like to search for?");
        Scanner input = new Scanner(System.in);
        String response = input.next();

    }
}
