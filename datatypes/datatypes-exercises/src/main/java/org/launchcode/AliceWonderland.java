package org.launchcode;

import java.util.Scanner;

public class AliceWonderland {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister" +
                " on the bank, and of having nothing to do: once or twice she had peeped" +
                " into the book her sister was reading, but it had no pictures or" +
                " conversations in it, 'and what is the usr of a book,' thought Alice" +
                " 'without pictures or conversation?'";
        String lowerAlice = alice.toLowerCase();
        System.out.println("What word would you like to search for?");
        Scanner input = new Scanner(System.in);
        String response = input.next();
        String lowerResponse = response.toLowerCase();

        if (lowerAlice.contains(lowerResponse)) {
            int index = lowerAlice.indexOf(lowerResponse);
            System.out.println("We found the word at index " + index + ", and it has the length of " + lowerResponse.length());
            String first = alice.substring(0, index - 1);
            String second = alice.substring((index + response.length()));
            System.out.println("Your new string with the word removed is: " + first + second);
        }
        else {
            System.out.println("Word not found");
        }
    }
}

