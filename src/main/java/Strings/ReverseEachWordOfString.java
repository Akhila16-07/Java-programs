package Strings;

import java.util.Arrays;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		
		String sentence = "java is super";
		
		String[] words=sentence.split(" ");
		
		System.out.println(words.length);
		String reversedSentence="";

        // Loop through each word
        for (String word : words) {
            String reversedWord = ""; // Variable to hold the reversed word

            // Reverse the word by iterating backward
            for (int i = word.length() - 1; i >= 0; i--) {
                reversedWord += word.charAt(i); // Append each character in reverse order
            }

            // Add the reversed word to the sentence
            reversedSentence += reversedWord + " ";
        }
		System.out.println(reversedSentence);
	}
}
